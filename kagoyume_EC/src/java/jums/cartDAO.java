package jums;

import base.DBManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;




public class cartDAO {
    
    public static cartDAO getInstance(){
        return new cartDAO();
    }
   public void insert(UserDataDTO ud, String itemcode) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("INSERT INTO cart_t(userID,itemcode) VALUES(?,?)");
            st.setInt(1, ud.getUserID());
            st.setString(2, itemcode);
            st.executeUpdate();
            System.out.println("insert completed");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
   }
     public ArrayList<String> searchbyuserID(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection(); 
            st =  con.prepareStatement("SELECT * FROM cart_t WHERE userID=?");
            st.setInt(1,ud.getUserID());
            ResultSet rs = st.executeQuery();
            ArrayList<String> result=new ArrayList<String>();
            while(rs.next()){
            result.add(rs.getString("itemcode"));
            }
            System.out.println("search completed"); 
            return result;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
     }
      public void buyinsert(ArrayList<SearchAPI> sa,UserDataDTO ud,int type) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            ArrayList<SearchAPI> saa=(ArrayList<SearchAPI>)sa;
            for(SearchAPI saaa:saa){
            st =  con.prepareStatement("INSERT INTO buy_t(userID,itemcode,type,buyDate) VALUES(?,?,?,?)");
            st.setInt(1, ud.getUserID());
            st.setString(2, saaa.getCode());
            st.setInt(3,type);
            st.setTimestamp(4, new Timestamp(System.currentTimeMillis()));        
            st.executeUpdate();
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
   }
      public void buytotal(UserDataDTO ud,int total) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        PreparedStatement st2 = null;
        PreparedStatement st3 = null;
        try{
            con = DBManager.getConnection(); 
            st =  con.prepareStatement("SELECT total FROM user_t WHERE userID=?");
            st.setInt(1,ud.getUserID());
            ResultSet rs = st.executeQuery();
            rs.next();
           
            int result=total+(rs.getInt("total")); 
            
            st2 =  con.prepareStatement("UPDATE user_t SET total=? where userID=?");
            st2.setInt(1, result);
            st2.setInt(2,ud.getUserID());
            st2.executeUpdate();

            st3 =  con.prepareStatement("DELETE FROM cart_t WHERE userID=?");
            st3.setInt(1, ud.getUserID());
            st3.executeUpdate();
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
   }
    public void notlogininsert(ArrayList<String> sa,UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            ArrayList<String> saa=(ArrayList<String>)sa;
            for(String saaa:saa){
            st =  con.prepareStatement("INSERT INTO cart_t(userID,itemcode) VALUES(?,?)");
            st.setInt(1, ud.getUserID());
            st.setString(2, saaa);     
            st.executeUpdate();
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
   }
       public void cartdelete(UserDataDTO ud,String itemcode) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            
            st =  con.prepareStatement("DELETE FROM cart_t WHERE userID=? AND itemcode=?");
            st.setInt(1, ud.getUserID());
            st.setString(2, itemcode);
            st.executeUpdate();
             
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
}
    
