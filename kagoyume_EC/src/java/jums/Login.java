package jums;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hayashi-s
 */
public class Login extends HttpServlet {

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
          
        try{
           request.setCharacterEncoding("UTF-8");
            
           UserDataDTO searchData = new UserDataDTO();
           searchData.setName(request.getParameter("name"));
           searchData.setPassword(request.getParameter("password"));
            
           UserDataDTO userdate=UserDataDAO.getInstance().loginsearch(searchData);
           //ログインできたら　userdateがnullじゃなかった　　
           if(userdate!=null){
                session.setAttribute("userdate", userdate);

                ArrayList<String> cart=(ArrayList<String>)session.getAttribute("notlogin");
                if(cart!=null){
                cartDAO.getInstance().notlogininsert(cart,userdate);
                session.removeAttribute("notlogin");
                }
                String url=(String)session.getAttribute("url");
                response.sendRedirect(url);
           }else{
                int t=1;
                //boolean login_flg = true;
                //if(login_flg)
                request.setAttribute("mo", t);
                request.getRequestDispatcher("/login.jsp").forward(request, response);
           }
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
