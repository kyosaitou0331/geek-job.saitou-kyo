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
public class DBsousa8 extends HttpServlet {

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
           PreparedStatement db_st = null;
           ResultSet db_data=null;
             try {
                  Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); 
                  db_co = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","today","today03315378");
                  
                  db_st=db_co.prepareStatement("select * from profiles where like '%?%' ");
                  db_st.setString(1,request.getParameter("to"));
                  db_st=db_co.prepareStatement("select * from profiles where name like ? ");
                  db_st.setString(1,"%"+request.getParameter("to")+"%");
                  db_data=db_st.executeQuery();
                  while(db_data.next()){
                   out.print("ID：" + db_data.getInt("profilesID") + "<br>");
                   out.print("名前：" + db_data.getString("name") + "<br>");
                   out.print("電話番号：" + db_data.getString("tel") + "<br>");
                   out.print("年齢：" + db_data.getInt("age") + "<br>");
                   out.print("誕生日：" + db_data.getString("birthday") + "<br>");
                  }
                  db_co.close();
                  db_st.close();
                  db_data.close();
    
                 
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
