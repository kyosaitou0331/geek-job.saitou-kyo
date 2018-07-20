package jums;

import base.DBManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;




public class UserDataDAO {
    
    public static UserDataDAO getInstance(){
        return new UserDataDAO();
    }
    
   
    public void registration(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("INSERT INTO user_t(name,password,mail,address,newDate) VALUES(?,?,?,?,?)");
            st.setString(1, ud.getName());
            st.setString(2, ud.getPassword());
            st.setString(3, ud.getMail());
            st.setString(4, ud.getAddress());
            st.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
            st.executeUpdate();
            System.out.println("registration completed");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
    }
     public UserDataDTO loginsearch(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection(); 
            st =  con.prepareStatement("SELECT * FROM user_t WHERE name=? and password=?");
            st.setString(1,ud.getName());
            st.setString(2,ud.getPassword());
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                UserDataDTO result=new UserDataDTO();
                result.setUserID(rs.getInt(1));
                result.setName(rs.getString(2));
                result.setPassword(rs.getString(3));
                result.setMail(rs.getString(4));
                result.setAddress(rs.getString(5));
                result.setTotal(rs.getInt(6));
                result.setNewDate(rs.getTimestamp(7));
                if(rs.getInt(8)==0){
                    return result;
                }else{
                return null;
                }
            }else{
                return null;
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

      public void update(UserDataDTO ud,UserDataDTO u) throws SQLException{
           Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("UPDATE user_t SET name=?,password=?,mail=?,address=?,newDate=? WHERE userID=? ");
            st.setString(1, ud.getName());
            st.setString(2, ud.getPassword());
            st.setString(3, ud.getMail());
            st.setString(4,ud.getAddress());
            st.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
            st.setInt(6, u.getUserID());
            st.executeUpdate();
            System.out.println("update completed");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
    }
        public void delete(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("UPDATE user_t SET deleteFlg=1 WHERE userID=? ");
            st.setInt(1, ud.getUserID());
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
        public ArrayList<HistoryDTO> history(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection(); 
            st =  con.prepareStatement("SELECT * FROM buy_t WHERE userID=?");
            st.setInt(1,ud.getUserID());
            ResultSet rs = st.executeQuery();
            ArrayList<HistoryDTO> result=new ArrayList<HistoryDTO>();
            while(rs.next()){
            HistoryDTO hd=new HistoryDTO();
            hd.setBuyID(rs.getInt("buyID"));
            hd.setItemcode(rs.getString("itemcode"));
            hd.setType(rs.getInt("type"));
            hd.setBuyDate(rs.getTimestamp("buydate"));
            result.add(hd);
            }
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
     public UserDataDTO updateinsert(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection(); 
            st =  con.prepareStatement("SELECT * FROM user_t WHERE userID=?");
            st.setInt(1,ud.getUserID());
            ResultSet rs = st.executeQuery();
            rs.next();
            UserDataDTO result=new UserDataDTO();
            result.setUserID(rs.getInt(1));
            result.setName(rs.getString(2));
            result.setPassword(rs.getString(3));
            result.setMail(rs.getString(4));
            result.setAddress(rs.getString(5));
            result.setTotal(rs.getInt(6));
            result.setNewDate(rs.getTimestamp(7));
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
}   
    