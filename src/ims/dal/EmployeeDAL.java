/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author manng
 */
public class EmployeeDAL extends Database{
    
     public static Connection conn = null; 
      public static Statement stmt = null;
    // Get Employee
    public  ArrayList<Employee> readEmployee(){
       
        ArrayList<Employee> emlist = new ArrayList<>(); 
        conn = getConnection(); 
        try { 
            stmt =conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM nhanvien"; 
        ResultSet rs = null; 
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setManhanvien(rs.getString("Manhanvien"));
                em.setHo(rs.getString("ho"));
                em.setTen(rs.getString("ten"));
                em.setDtdd(rs.getString("dtdd")); 
                em.setNoisinh(rs.getString("noisinh")); 
                emlist.add(em);   
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            return emlist; 
        }
                
    }
    
    // Insert Employee 
    public void AddNewEmployee (Employee employeeModel) throws SQLException{
      conn = getConnection(); 
        try{
            stmt = conn.createStatement();
       } catch (SQLException ex)
       {
           Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
       } 
        String manhanvien = employeeModel.getManhanvien();
        String ho = employeeModel.getHo();
        String hovaten = employeeModel.getHovaten();
        String ngaysinh = employeeModel.getNgaysinh();
        String ten = employeeModel.getTen();
        String dtdd = employeeModel.getDtdd();
        String dtnha = employeeModel.getDtnha();
        String email = employeeModel.getEmail();
        String magioitinh = employeeModel.getMagioitinh();
        String manoicap = employeeModel.getManoicap();
      //  String ngaycap = employeeModel.getNgaycap();
        String noisinh = employeeModel.getNoisinh();
        String socmnd = employeeModel.getSocmnd();
        String diachi = employeeModel.getDiachi();
        String madantoc = employeeModel.getMadantoc();
        String mahonnhan = employeeModel.getMahonnhan();
        String maquoctich = employeeModel.getMaquoctich();
        String masuckhoe = employeeModel.getMasuckhoe();
        String matongiao = employeeModel.getMatongiao();
        String ghichu = employeeModel.getGhichu();
        String machucvu = employeeModel.getMachucvu();
        String madaibieu = employeeModel.getMadaibieu();
        String madonvi = employeeModel.getMadonvi();
        String manhansu = employeeModel.getManhansu();
        String noihientai = employeeModel.getNoihientai();
        String cannang = employeeModel.getCannang();
        String chieucao = employeeModel.getChieucao();
        String macanhan = employeeModel.getMacanhan();
        String machucdanh = employeeModel.getMachucdanh();
        String manhommau = employeeModel.getManhommau();
        String maxuatthan = employeeModel.getMaxuatthan();
       // String magiadinh = employeeModel.getMagiadinh();
       // String matuyendung = employeeModel.getMatuyendung();
                 String sql = "INSERT INTO nhanvien VALUES ('"+manhanvien+"','"+ho+"','"+ten+"','"+hovaten+"','"+ngaysinh+"',"
                + "'"+magioitinh+"','"+noisinh+"','"+socmnd+"','"+manoicap+"','"+dtdd+"','"+dtnha+"','"+email+"',"
                + "'"+madantoc+"','"+matongiao+"','"+masuckhoe+"','"+mahonnhan+"','"+maquoctich+"','"+diachi+"',"
                + "'"+noihientai+"','"+ghichu+"','"+madonvi+"','"+madaibieu+"','"+manhansu+"','"+machucvu+"',"
                + "'"+machucdanh+"','"+chieucao+"','"+cannang+"','"+manhommau+"','"+macanhan+"','"+maxuatthan+"','gd1','td1')";
        
//        String sql = "INSERT INTO nhanvien VALUES ('"+manhanvien+"','"+ho+"','"+ten+"','"+hovaten+"','"+ngaysinh+"',"
//                + "'"+magioitinh+"','"+noisinh+"','"+socmnd+"','nc1','"+dtdd+"','"+dtnha+"','"+email+"',"
//                + "'"+madantoc+"','"+matongiao+"','"+masuckhoe+"','"+mahonnhan+"','"+maquoctich+"','"+diachi+"',"
//                + "'"+noihientai+"','"+ghichu+"','"+madonvi+"','"+madaibieu+"','"+manhansu+"','"+machucvu+"',"
//                + "'"+machucdanh+"','"+chieucao+"','"+cannang+"','"+manhommau+"','"+macanhan+"','"+maxuatthan+"',"
//                + "'"+magiadinh+"','"+matuyendung+"')";
        stmt.executeUpdate(sql);  
    }
    // Edit Employee 
    public void EditEmployee(Employee employeeModel) throws SQLException {
        conn = getConnection();
//         try { 
//             stmt = conn.createStatement();
//         } catch (SQLException ex) {
//             Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
//         } 
//        String Masv = employeeModel.getManhansu(); 
//         String Tensv = employeeModel.getTensv(); 
//          int Tuoi = employeeModel.getTuoi();  
//        String sql = "UPDATE employee SET Tuoi = "+Tuoi+", Tensv = '"+Tensv+"' WHERE Masv = "+Masv+" ";
//         stmt.executeUpdate(sql);

    }

    // Delete Employee 
    public void DeleteEmployeeDAL(String manhanvien) throws SQLException {
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "DELETE FROM nhanvien WHERE manhanvien ='" + manhanvien + "'";
        stmt.executeUpdate(sql);

    }

    public Gioitinh takeGTDAL(String loaigioitinh) {
        Gioitinh gt = new Gioitinh();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM gioitinh WHERE tengioitinh = '" + loaigioitinh + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                gt.setMagt(rs.getString("magioitinh"));
                gt.setLoaigt(rs.getString("tengioitinh"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return gt;
        }
    }

    public Noicap takeNoicapDAL(String tennoicap) {
        Noicap nc = new Noicap();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM noicap WHERE tennoicap = '" + tennoicap + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                nc.setMancap(rs.getString("manoicap"));
                nc.setTennoicap(rs.getString("tennoicap"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return nc;
        }
    }

    public Dantoc takeDantocDAL(String tendantoc) {
        Dantoc dt = new Dantoc();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM dantoc WHERE tendantoc = '" + tendantoc + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                dt.setMadt(rs.getString("madantoc"));
                dt.setTendt(rs.getString("tendantoc"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return dt;
        }
    }

    public Tongiao takeTongiaoDAL(String tentongiao) {
        Tongiao tg = new Tongiao();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM tongiao WHERE tentongiao = '" + tentongiao + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                tg.setMatongiao(rs.getString("matongiao"));
                tg.setTentongiao(rs.getString("tentongiao"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return tg;
        }
    }

    public Suckhoe takeSuckhoeDAL(String loaisuckhoe) {
        Suckhoe sk = new Suckhoe();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM suckhoe WHERE tinhtrangsuckhoe = '" + loaisuckhoe + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                sk.setMasuckhoe(rs.getString("masuckhoe"));
                sk.setLoaiskhoe(rs.getString("tinhtrangsuckhoe"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return sk;
        }
    }

    public Quoctich takeQuoctichDAL(String tenquoctich) {
        Quoctich qt = new Quoctich();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM quoctich WHERE tenquoctich = '" + tenquoctich + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                qt.setMaqtich(rs.getString("maquoctich"));
                qt.setTenqtich(rs.getString("tenquoctich"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return qt;
        }
    }
    public honnhan takeHonnhanDAL(String loaihonnhan) {
        honnhan hn = new honnhan();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM honnhan WHERE tinhtranghonnhan = '" + loaihonnhan + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                hn.setMahonnhan(rs.getString("mahonnhan"));
                hn.setTenhonnhan(rs.getString("tinhtranghonnhan"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return hn;
        }
    }
    public Chucvu chucvuDAL(String tenchucvu) {
        Chucvu cv = new Chucvu();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM chucvu WHERE tenchucvu = '" + tenchucvu + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                cv.setMachucvu(rs.getString("machucvu"));
                cv.setTenchucvu(rs.getString("tenchucvu"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return cv;
        }
    }
    public Chucdanh chudanhDAL(String tenchucdanh) {
        Chucdanh cd = new Chucdanh();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM chucdanh WHERE tenchucdanh = '" + tenchucdanh + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                cd.setChucdanh(rs.getString("machucdanh"));
                cd.setChucvu(rs.getString("tenchucdanh"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return cd;
        }
    }

    public Daibieu daibieuDAL(String tendaibieu) {
        Daibieu db = new Daibieu();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM daibieu WHERE tendaibieu= '" + tendaibieu + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                db.setMadaibieu(rs.getString("madaibieu"));
                db.setTendaibieu(rs.getString("tendaibieu"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return db;
        }
    }

    public Donvi donviDAL(String tendonvi) {
        Donvi dv = new Donvi();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM donvi WHERE tendonvi= '" + tendonvi + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                dv.setMadonvi(rs.getString("madonvi"));
                dv.setTendonvi(rs.getString("tendonvi"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return dv;
        }
    }
      public nhansu nhansuDAL(String tennhansu) {
        nhansu ns = new nhansu();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhansu WHERE loainhansu= '" + tennhansu + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                ns.setManhansu(rs.getString("manhansu"));
                ns.setTennhansu(rs.getString("loainhansu"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return ns;
        }
    }
      public Nhommau nhommauDAL(String tennhommau) {
        Nhommau nm = new Nhommau();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM manhommau WHERE tennhommau= '" + tennhommau + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                nm.setManhommau(rs.getString("manhommau"));
                nm.setTennhommau(rs.getString("tennhommau"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return nm;
        }
    }
       public Xuatthan xuatthanDAL(String tenxuatthan) {
        Xuatthan xt = new Xuatthan();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM xuatthan WHERE tenxuatthan= '" + tenxuatthan + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                xt.setMaxuatthan(rs.getString("maxuatthan"));
                xt.setTenxuatthan(rs.getString("tenxuatthan"));         
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return xt;
        }
    }
         public Canhan canhanDAL(String tencanhan) {
        Canhan ca = new Canhan();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM canhan WHERE loaicanhan= '" + tencanhan + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                ca.setMacanhan(rs.getString("macanhan"));
                ca.setTencanhan(rs.getString("loaicanhan"));         
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        } finally {
            return ca;
        }
    }
}
