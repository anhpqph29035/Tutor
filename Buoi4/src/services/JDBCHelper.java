package services;
import java.sql.*;
public class JDBCHelper {
    public static ResultSet excuteQuery(String sql,Object...args){
        Connection cn = null;
        ResultSet rs = null;
        PreparedStatement pstm = null;
        try {
            cn = DBConnect.getConnection();
            pstm = cn.prepareStatement(sql);
            for(int i = 0;i<args.length;i++){
                pstm.setObject(i+1,args[i]);
            }
            rs = pstm.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public static Integer excuteUpdate(String sql,Object...args){
        Connection cn = null;
        int row = 0;
        PreparedStatement pstm = null;
        try {
            cn = DBConnect.getConnection();
            pstm = cn.prepareStatement(sql);
            for(int i = 0;i<args.length;i++){
                pstm.setObject(i+1,args[i]);
            }
           row = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }
}
