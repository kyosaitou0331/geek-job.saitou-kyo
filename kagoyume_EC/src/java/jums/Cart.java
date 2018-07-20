/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author owner
 */
public class Cart extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         HttpSession session = request.getSession();
         
        response.setContentType("text/html;charset=UTF-8");
        
        try  {
            /* TODO output your page here. You may use following sample code. */
            request.setCharacterEncoding("UTF-8");
    
            UserDataDTO userdate=(UserDataDTO)session.getAttribute("userdate");
            ArrayList<String> data=null;
             //ifがログインしてない場合　elseがログイン出来た場合
           if (userdate==null){
               data=(ArrayList<String>)session.getAttribute("notlogin");
               if(data==null){
                    data=new ArrayList<String>();
               }
           }else{
               data= cartDAO .getInstance().searchbyuserID(userdate);
           }
               ArrayList<SearchAPI> resultitemcode=new ArrayList<SearchAPI>();
               
               for(String datas:data){
               String nameword=datas;
               nameword = URLEncoder.encode(nameword,"UTF-8");
               String result="";
               URL url = new URL("http://shopping.yahooapis.jp/ShoppingWebService/V1/json/itemLookup?appid=dj00aiZpPXl5dzFmMVV3b0tIWiZzPWNvbnN1bWVyc2VjcmV0Jng9ZDc-&responsegroup=medium&itemcode="+nameword);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.connect();
                BufferedReader in = new BufferedReader(new InputStreamReader(
                con.getInputStream()));
                String tmp = "";
                while ((tmp = in.readLine()) != null) {
                result += tmp;
                }
                in.close();
                con.disconnect();


                ObjectMapper mapper = new ObjectMapper();
                JsonNode root = mapper.readTree(result);

                SearchAPI sa = new SearchAPI ();
                sa.setName(root.get("ResultSet").get("0").get("Result").get("0").get("Name").asText());
                sa.setPrice(root.get("ResultSet").get("0").get("Result").get("0").get("Price").get("_value").asText());
                sa.setCode(root.get("ResultSet").get("0").get("Result").get("0").get("Code").asText());
                sa.setDescription(root.get("ResultSet").get("0").get("Result").get("0").get("Description").asText());
                sa.setImage(root.get("ResultSet").get("0").get("Result").get("0").get("Image").get("Medium").asText());
                resultitemcode.add(sa);
               }
                session.setAttribute("itemcode",resultitemcode);
                
                int total=0;
                for(SearchAPI sea:resultitemcode){
                     total=sea.getPrice()+total;
                }
                session.setAttribute("total",total);


                request.getRequestDispatcher("/cart.jsp").forward(request, response);  
                   
        }catch(Exception e){
                    request.setAttribute("error", e.getMessage());
                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                }
            }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
