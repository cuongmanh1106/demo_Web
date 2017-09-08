
package dbHelpers;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_loai_san_pham;


public class ReadQuery {
    private Connection conn;
    private ResultSet results;
    private m_loai_san_pham l = new m_loai_san_pham();
    
    public ReadQuery(){
        Properties props  = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");//let me read content of a file 
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String password = props.getProperty("user.password");
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = (Connection) DriverManager.getConnection(url,username,password);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void doRead(){
        try {
            String query = "select * from loai_san_pham";
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getAllSP(){
        try {
            String query = "select * from loai_san_pham";
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.results;
    }
    
         
     public void doAdd(m_loai_san_pham sp)
    {
        try {
            String query = "insert into loai_san_pham(ten_loai,mo_ta,ma_loai_cha) values(?,?,?)";
            com.mysql.jdbc.PreparedStatement ps = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(query);
            
            ps.setString(1,sp.getTen_loai());
            ps.setString(2,sp.getMo_ta());
            ps.setInt(3, sp.getMa_loai_cha());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     
     
     
     public void doDelete(int ma_loai)
    {
        try {
            String Query = "delete from loai_san_pham where ma_loai=?";
            
            PreparedStatement ps = conn.prepareStatement(Query);
            
            ps.setInt(1, ma_loai);
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public ResultSet Doc_loai_san_pham_theo_ma_loai(int ma_loai)
    {
        try {
            String Query = "select * from loai_san_pham where ma_loai=?";
            
            PreparedStatement ps = conn.prepareStatement(Query);
            
            ps.setInt(1, ma_loai);
            
            this.results=ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return this.results;
    }
     
    public void doUpdate(m_loai_san_pham l)
    {
        try {
            String Query = "update loai_san_pham set ten_loai = ?, mo_ta = ?, ma_loai_cha=? where ma_loai=?";
            
            PreparedStatement ps = conn.prepareStatement(Query);
            
            ps.setString(1, l.getTen_loai());
            ps.setString(2, l.getMo_ta());
            ps.setInt(3, l.getMa_loai_cha());
            ps.setInt(4, l.getMa_loai());
            
            ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //cach 2 
    public ArrayList<m_loai_san_pham> Doc_loai_san_pham(int vt , int limit) throws SQLException
    {
        String query = "select * from loai_san_pham limit ?,?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, vt);
        ps.setInt(2, limit);
        this.results = ps.executeQuery();
        ArrayList<m_loai_san_pham> list = new ArrayList<>();
        while(this.results.next())
        {
            m_loai_san_pham lsp = new m_loai_san_pham();
            lsp.setMa_loai(this.results.getInt("ma_loai"));
            lsp.setTen_loai(this.results.getString("ten_loai"));
            lsp.setMo_ta(this.results.getString("mo_ta"));
            lsp.setMa_loai_cha(this.results.getInt("ma_loai_cha"));
            list.add(lsp);
            
        }
        return list;
    }
    public int count_loai_san_pham() throws SQLException
    {
        String query = "select count(ma_loai) from loai_san_pham";
        PreparedStatement ps = conn.prepareStatement(query);
        this.results = ps.executeQuery();
        int count = 0;
        while(this.results.next())
        {
            count = this.results.getInt("count(ma_loai)");
        }
        return count;
        
    }
    
//    public static void main(String[] args) throws SQLException
//    {
//        ReadQuery rq = new ReadQuery();
//        System.out.println(rq.count_loai_san_pham());
//    }
    
   
    
}
