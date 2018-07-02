/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author owner
 */
public class zaikokanrisisutem2 extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          
              
            request.setCharacterEncoding("UTF-8");
               Connection db_co = null;
           PreparedStatement db_st1 = null;
           int db_data1;
           PreparedStatement db_st = null;
           ResultSet db_data=null;
           int data1=Integer.parseInt(request.getParameter("ID"));
           int data2=Integer.parseInt(request.getParameter("amo"));
             try {
                  Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); 
                  db_co = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","today","today03315378");
               
                  db_st1=db_co.prepareStatement("insert into items (itemsID,name,amo,type) values (?,?,?,?)");
                  db_st1.setInt(1,data1);
                  db_st1.setString(2,request.getParameter("name"));
                  db_st1.setInt(3,data2);
                  db_st1.setString(4,request.getParameter("type"));
                  db_data1=db_st1.executeUpdate();
                  
                  db_st=db_co.prepareStatement("select * from items"); 
                  db_data=db_st.executeQuery();
                    while(db_data.next()){
                   out.print("ID：" + db_data.getInt("itemsID") + "<br>");
                   out.print("商品名：" + db_data.getString("name") + "<br>");
                   out.print("個数：" + db_data.getInt("amo") + "<br>");
                   out.print("種類：" + db_data.getString("type") + "<br>");
                  }
                  db_co.close();
                  db_st.close();
                  db_data.close();
                  db_st1.close();
                 
        }catch (Exception e_con) {
                 out.print(e_con);
                  }
          
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
