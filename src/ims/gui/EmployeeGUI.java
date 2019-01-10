/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.gui;

import ims.bll.EmployeeBLL;
import ims.dal.Canhan;
import ims.dal.Chucdanh;
import ims.dal.Chucvu;
import ims.dal.Daibieu;
import ims.dal.Dantoc;
import ims.dal.Database;
import ims.dal.Donvi;
import ims.dal.Employee;
import ims.dal.Gioitinh;
import ims.dal.Nhommau;
import ims.dal.Noicap;
import ims.dal.Quoctich;
import ims.dal.Suckhoe;
import ims.dal.Tongiao;
import ims.dal.Xuatthan;
import ims.dal.honnhan;
import ims.dal.nhansu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class EmployeeGUI extends javax.swing.JFrame {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/project";
    static final String USER = "root";
    static final String PASS = "";

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    EmployeeBLL employeeBLL = new EmployeeBLL();
/////////////////////////////////////////////////////////////////////////////////
    Noicap Ncap = new Noicap();
    Gioitinh GT = new Gioitinh();
    Dantoc DT = new Dantoc();
    Tongiao TG = new Tongiao();
    Suckhoe SK = new Suckhoe();
    Quoctich QT = new Quoctich();
    honnhan HN = new honnhan();
    Chucdanh CD = new Chucdanh();
    Chucvu CV = new Chucvu();
    Daibieu DB = new Daibieu();
    Donvi DV = new Donvi();
    nhansu NS = new nhansu();
    Nhommau NM = new Nhommau();
    Xuatthan XT = new Xuatthan();
    Canhan CN = new Canhan();
    DefaultTableModel model;
////////////////////////////////////////////////////////////////////////////////
    Employee employeeModel;

    public EmployeeGUI() {
        conn = getConnection();
        initComponents();
        String sqldantoc = "select * from project.dantoc";
        LoadDataCB(sqldantoc, this.cbdantoc, "tendantoc");
        String sqltongiao = "select * from project.tongiao";
        LoadDataCB(sqltongiao, this.cbtongiao, "tentongiao");
        String sqlgiotinh = "select * from project.gioitinh";
        LoadDataCB(sqlgiotinh, this.cbgioitinh, "tengioitinh");
        String sqlnoicap = "select * from project.noicap";
        LoadDataCB(sqlnoicap, this.cbnoicap, "tennoicap");
        String sqlquoctich = "select * from project.quoctich";
        LoadDataCB(sqlquoctich, this.cbquoctich, "tenquoctich");
        String sqlhonnhan = "select * from project.honnhan";
        LoadDataCB(sqlhonnhan, this.cbhonnhan, "tinhtranghonnhan");
        /////////////////////////////////////////////////////////////
        String donvi = "select * from project.donvi";
        LoadDataCB(donvi, this.cbdonvi, "tendonvi");
        String daibieu = "select * from project.daibieu";
        LoadDataCB(daibieu, this.cbdaibieu, "tendaibieu");
        String tennhansu = "select * from project.nhansu";
        LoadDataCB(tennhansu, this.cbnhansu, "loainhansu");
        //////////////////////////////////////////////////
        String chucvu = "select * from project.chucvu";
        LoadDataCB(chucvu, this.cbchucvu, "tenchucvu");
        String chucdanh = "select * from project.chucdanh";
        LoadDataCB(chucdanh, this.cbchucdanh, "tenchucdanh");
        //////////////////////////////////////////////////////
        String suckhoe = "select * from project.suckhoe";
        LoadDataCB(suckhoe, this.cbsuckhoe, "tinhtrangsuckhoe");
        String nhommau = "select * from project.manhommau";
        LoadDataCB(nhommau, this.cbnhommau, "tennhommau");
        String xuatthan = "select * from project.xuatthan";
        LoadDataCB(xuatthan, this.cbxuatthan, "tenxuatthan");
        String canhan = "select * from project.canhan";
        LoadDataCB(canhan, this.cbcanhan, "loaicanhan");
        String giadinh = "select * from project.giadinh";
        LoadDataCB(giadinh, this.cbgiadinh, "tenloaigiadinh");
        String tuyendung = "select * from project.tuyendung";
        LoadDataCB(tuyendung, this.cbtuyendung, "nguontuyendung");
    }

    public void LoadDataCB(String sql, JComboBox cb, String bien) {
        try {
            conn = getConnection();

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                cb.addItem(rs.getString(bien));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Thong bao loi");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtManhanvien = new javax.swing.JTextField();
        txtHo = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        TxtNoisinh = new javax.swing.JTextField();
        txtCmnd = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtdtnha = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txtnoio = new javax.swing.JTextField();
        txtghichu = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        box1 = new javax.swing.JCheckBox();
        jLabel39 = new javax.swing.JLabel();
        txtcannang = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cbgioitinh = new javax.swing.JComboBox<>();
        cbnoicap = new javax.swing.JComboBox<>();
        cbdantoc = new javax.swing.JComboBox<>();
        cbtongiao = new javax.swing.JComboBox<>();
        cbquoctich = new javax.swing.JComboBox<>();
        cbhonnhan = new javax.swing.JComboBox<>();
        cbchucdanh = new javax.swing.JComboBox<>();
        cbchucvu = new javax.swing.JComboBox<>();
        cbsuckhoe = new javax.swing.JComboBox<>();
        cbxuatthan = new javax.swing.JComboBox<>();
        cbgiadinh = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        cbdonvi = new javax.swing.JComboBox<>();
        cbnhansu = new javax.swing.JComboBox<>();
        cbdaibieu = new javax.swing.JComboBox<>();
        cbcanhan = new javax.swing.JComboBox<>();
        cbtuyendung = new javax.swing.JComboBox<>();
        txtdtdd = new javax.swing.JTextField();
        txtchieucao = new javax.swing.JTextField();
        cbnhommau = new javax.swing.JComboBox<>();
        btSave = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        txtHovaten1 = new javax.swing.JTextField();
        cbNgaysinh1 = new com.toedter.calendar.JDateChooser();
        cbNgaycap = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Số hiệu công chức (*)");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 113, 20));

        jLabel2.setText("Họ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 87, -1));

        jLabel3.setText("Giới Tính");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 95, -1));

        jLabel4.setText("Nơi Sinh ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 193, 124, 20));

        jLabel6.setText("Họ và Tên");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 90, -1));

        jLabel7.setText("Tên");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 40, 30));

        jLabel8.setText("Ngày Sinh ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 157, 124, 30));

        jLabel12.setText("Số CMND");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 85, -1));

        jLabel14.setText("Ngày Cấp");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 257, 85, 30));

        txtManhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManhanvienActionPerformed(evt);
            }
        });
        jPanel2.add(txtManhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 11, 243, -1));

        txtHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoActionPerformed(evt);
            }
        });
        jPanel2.add(txtHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 37, 243, -1));

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });
        jPanel2.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 63, 243, -1));

        TxtNoisinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNoisinhActionPerformed(evt);
            }
        });
        jPanel2.add(TxtNoisinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 190, 243, -1));

        txtCmnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCmndActionPerformed(evt);
            }
        });
        jPanel2.add(txtCmnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 224, 243, -1));

        jLabel15.setText("Đơn Vị");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 389, 124, -1));

        jLabel16.setText("Loại nhân sự");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 456, -1, -1));

        txtdtnha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtnhaActionPerformed(evt);
            }
        });
        jPanel2.add(txtdtnha, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 37, 244, -1));

        jLabel9.setText("Điện thoại di động ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 172, -1));

        jLabel19.setText("Email");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 66, 143, -1));

        jLabel20.setText("Điện thoại nhà riêng");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 40, 127, -1));

        jLabel21.setText("Tôn Giáo");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 130, 104, -1));

        jLabel22.setText("Dân Tộc");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 96, 131, -1));

        jLabel23.setText("Quốc Tịch");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 163, 131, -1));

        jLabel24.setText("Tình Trạng Hôn Nhân");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 197, 131, -1));

        jLabel26.setText("Ghi Chú");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 301, -1, -1));

        jLabel27.setText("Địa Chỉ Thường Trú");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 227, -1, -1));

        jLabel28.setText("Nơi ở Hiện Tại");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 257, -1, -1));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 63, 244, -1));

        txtdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiachiActionPerformed(evt);
            }
        });
        jPanel2.add(txtdiachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 224, 244, -1));

        txtnoio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoioActionPerformed(evt);
            }
        });
        jPanel2.add(txtnoio, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 254, 244, -1));

        txtghichu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtghichuActionPerformed(evt);
            }
        });
        jPanel2.add(txtghichu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 250, 48));

        jLabel29.setText("Chiều Cao (Cm)");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 354, -1, 40));

        jLabel30.setText("Cân nặng");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 80, 30));

        jLabel31.setText("Nhóm máu");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 245, -1));

        jLabel32.setText("Tình trạng sức khỏe");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 245, -1));

        jLabel33.setText("Thành phần xuất thần");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 245, 30));

        jLabel34.setText("Ưu tiên cá nhân");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 172, -1));

        jLabel35.setText("Ưu tiên gia đình");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, 172, 20));

        jLabel36.setText("Nguồn tuyển dụng");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 150, 30));

        jLabel38.setText("Chức Danh");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 210, 30));

        box1.setText("Biên Chế");
        jPanel2.add(box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 452, 80, 30));

        jLabel39.setText("Chức Vụ");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 210, -1));
        jPanel2.add(txtcannang, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 358, 30));

        jLabel25.setText("Nơi  Cấp");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 301, -1, -1));

        cbgioitinh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbgioitinhItemStateChanged(evt);
            }
        });
        cbgioitinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbgioitinhActionPerformed(evt);
            }
        });
        jPanel2.add(cbgioitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 123, 243, 28));

        cbnoicap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbnoicapItemStateChanged(evt);
            }
        });
        jPanel2.add(cbnoicap, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 294, 243, 28));

        cbdantoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbdantocItemStateChanged(evt);
            }
        });
        jPanel2.add(cbdantoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 89, 244, 28));

        cbtongiao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbtongiaoItemStateChanged(evt);
            }
        });
        cbtongiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtongiaoActionPerformed(evt);
            }
        });
        jPanel2.add(cbtongiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 123, 244, 28));

        cbquoctich.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbquoctichItemStateChanged(evt);
            }
        });
        jPanel2.add(cbquoctich, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 157, 244, 27));

        cbhonnhan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbhonnhanItemStateChanged(evt);
            }
        });
        jPanel2.add(cbhonnhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 190, 244, 28));

        cbchucdanh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbchucdanhItemStateChanged(evt);
            }
        });
        jPanel2.add(cbchucdanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 150, 28));

        cbchucvu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbchucvuItemStateChanged(evt);
            }
        });
        jPanel2.add(cbchucvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 150, 28));

        cbsuckhoe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbsuckhoeItemStateChanged(evt);
            }
        });
        jPanel2.add(cbsuckhoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 357, 30));

        cbxuatthan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxuatthanItemStateChanged(evt);
            }
        });
        jPanel2.add(cbxuatthan, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, 357, 30));

        jPanel2.add(cbgiadinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, 357, 30));

        jLabel40.setText("Đại Biểu");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 423, 74, -1));

        cbdonvi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbdonviItemStateChanged(evt);
            }
        });
        jPanel2.add(cbdonvi, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 382, 152, 28));

        cbnhansu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbnhansuItemStateChanged(evt);
            }
        });
        jPanel2.add(cbnhansu, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 450, 152, 26));

        cbdaibieu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbdaibieuItemStateChanged(evt);
            }
        });
        jPanel2.add(cbdaibieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 416, 152, 28));

        cbcanhan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbcanhanItemStateChanged(evt);
            }
        });
        cbcanhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcanhanActionPerformed(evt);
            }
        });
        jPanel2.add(cbcanhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, 357, 30));

        cbtuyendung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtuyendungActionPerformed(evt);
            }
        });
        jPanel2.add(cbtuyendung, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 150, 30));

        txtdtdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtddActionPerformed(evt);
            }
        });
        jPanel2.add(txtdtdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 11, 244, -1));
        jPanel2.add(txtchieucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 358, 30));

        cbnhommau.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbnhommauItemStateChanged(evt);
            }
        });
        jPanel2.add(cbnhommau, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, 357, 30));

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, 100, 30));

        btBack.setText("Back");
        jPanel2.add(btBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 110, 30));

        txtHovaten1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHovaten1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtHovaten1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 93, 243, -1));
        jPanel2.add(cbNgaysinh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 240, -1));
        jPanel2.add(cbNgaycap, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 240, -1));

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHovaten1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHovaten1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHovaten1ActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed

        
        if ("".equals(txtManhanvien.getText())) {
            JOptionPane.showMessageDialog(null, "id khong duoc de trong");
            return;
        }
        String manhanvien = txtManhanvien.getText();
        String ho = txtHo.getText();
        String hovaten = txtHovaten1.getText();

        SimpleDateFormat ns = new SimpleDateFormat("dd-MM-yyyy");
        String ngaysinh = ns.format(cbNgaysinh1.getDate());
        String ten = txtTen.getText();
        String dtdd = txtdtdd.getText();
        String dtnha = txtdtnha.getText();
        String email = txtemail.getText();
        String noisinh = TxtNoisinh.getText();
        String socmnd = txtCmnd.getText();
        String diachi = txtdiachi.getText();
        String ghichu = txtghichu.getText();
        String noihientai = txtnoio.getText();
        String cannang = txtcannang.getText();
        String chieucao = txtchieucao.getText();
        //////////////////////////////////////////////////////////////////////////////////
        employeeModel = new Employee();
        employeeModel.setManhanvien(manhanvien);
        employeeModel.setHo(ho);
        employeeModel.setTen(ten);
        employeeModel.setHovaten(hovaten);
        employeeModel.setNgaysinh(ngaysinh);
        // employeeModel.setNgaycap(ngaycap);
        // employeeModel.setNgaytdung(tuyendung);
        employeeModel.setTen(ten);
        employeeModel.setNoisinh(noisinh);
        employeeModel.setDtdd(dtdd);
        employeeModel.setDtnha(dtnha);
        employeeModel.setEmail(email);
        employeeModel.setSocmnd(socmnd);
        employeeModel.setDiachi(diachi);
        employeeModel.setMagioitinh(GT.getMagt());
        employeeModel.setManoicap(Ncap.getMancap());
        employeeModel.setMadantoc(DT.getMadt());
        employeeModel.setMahonnhan(HN.getMahonnhan());
        employeeModel.setMaquoctich(QT.getMaqtich());
        employeeModel.setMasuckhoe(SK.getMasuckhoe());
        employeeModel.setMatongiao(TG.getMatongiao());
        employeeModel.setGhichu(ghichu);
        employeeModel.setMadaibieu(DB.getMadaibieu());
        employeeModel.setMachucvu(CV.getMachucvu());
        employeeModel.setManhansu(NS.getManhansu());
        employeeModel.setMadonvi(DV.getMadonvi());
        employeeModel.setNoihientai(noihientai);
        employeeModel.setCannang(cannang);
        employeeModel.setChieucao(chieucao);

        employeeModel.setMacanhan(CN.getMacanhan());
        employeeModel.setMachucdanh(CD.getChucdanh());
        employeeModel.setManhommau(NM.getManhommau());
        employeeModel.setMaxuatthan(XT.getMaxuatthan());
        // employeeModel.setMagiadinh(magiadinh);
        // employeeModel.setMatuyendung(matuyendung);

        employeeBLL.AddNewEmployeeDAL(employeeModel);
        dispose();
    }//GEN-LAST:event_btSaveActionPerformed

    private void cbnhommauItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbnhommauItemStateChanged
        String nhommau = cbnhommau.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        NM = employeeBLL.nhommaubll(nhommau);
    }//GEN-LAST:event_cbnhommauItemStateChanged

    private void txtdtddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtddActionPerformed

    private void cbtuyendungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtuyendungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtuyendungActionPerformed

    private void cbcanhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcanhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbcanhanActionPerformed

    private void cbcanhanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbcanhanItemStateChanged
        String canhan = cbcanhan.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        CN = employeeBLL.canhanbll(canhan);
    }//GEN-LAST:event_cbcanhanItemStateChanged

    private void cbdaibieuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbdaibieuItemStateChanged
        String daibieu = cbdaibieu.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        DB = employeeBLL.daibieubll(daibieu);
    }//GEN-LAST:event_cbdaibieuItemStateChanged

    private void cbnhansuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbnhansuItemStateChanged
        String nhansu = cbnhansu.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        NS = employeeBLL.nhansubll(nhansu);
    }//GEN-LAST:event_cbnhansuItemStateChanged

    private void cbdonviItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbdonviItemStateChanged
        String donvi = cbdonvi.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        DV = employeeBLL.donvibll(donvi);
    }//GEN-LAST:event_cbdonviItemStateChanged

    private void cbxuatthanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxuatthanItemStateChanged

        String xuatthan = cbxuatthan.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        XT = employeeBLL.xuatthanbll(xuatthan);
    }//GEN-LAST:event_cbxuatthanItemStateChanged

    private void cbsuckhoeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbsuckhoeItemStateChanged
        String suckhoe = cbsuckhoe.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        SK = employeeBLL.takeSuckhoeBLL(suckhoe);
    }//GEN-LAST:event_cbsuckhoeItemStateChanged

    private void cbchucvuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbchucvuItemStateChanged
        String chucvu = cbchucvu.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        CV = employeeBLL.chucvubll(chucvu);
    }//GEN-LAST:event_cbchucvuItemStateChanged

    private void cbchucdanhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbchucdanhItemStateChanged
        String chucdanh = cbchucdanh.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        CD = employeeBLL.chucdanhbll(chucdanh);
    }//GEN-LAST:event_cbchucdanhItemStateChanged

    private void cbhonnhanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbhonnhanItemStateChanged
        String honnhan = cbhonnhan.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        HN = employeeBLL.HonnhanBLL(honnhan);
    }//GEN-LAST:event_cbhonnhanItemStateChanged

    private void cbquoctichItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbquoctichItemStateChanged
        String quoctich = cbquoctich.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        QT = employeeBLL.QuoctichBLL(quoctich);
    }//GEN-LAST:event_cbquoctichItemStateChanged

    private void cbtongiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtongiaoActionPerformed

    }//GEN-LAST:event_cbtongiaoActionPerformed

    private void cbtongiaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbtongiaoItemStateChanged
        String tongiao = cbtongiao.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        TG = employeeBLL.takeTongiaoBLL(tongiao);
    }//GEN-LAST:event_cbtongiaoItemStateChanged

    private void cbdantocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbdantocItemStateChanged
        String madantoc = cbdantoc.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        DT = employeeBLL.takeDantocBLL(madantoc);
    }//GEN-LAST:event_cbdantocItemStateChanged

    private void cbnoicapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbnoicapItemStateChanged
        String manoicap = cbnoicap.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        Ncap = employeeBLL.takeNoicapBLL(manoicap);
    }//GEN-LAST:event_cbnoicapItemStateChanged

    private void cbgioitinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbgioitinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbgioitinhActionPerformed

    private void cbgioitinhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbgioitinhItemStateChanged
        String magioitinh = cbgioitinh.getSelectedItem().toString();
        EmployeeBLL employeeBLL = new EmployeeBLL();
        GT = employeeBLL.takeGioitinhBLL(magioitinh);
    }//GEN-LAST:event_cbgioitinhItemStateChanged

    private void txtghichuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtghichuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtghichuActionPerformed

    private void txtnoioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoioActionPerformed

    private void txtdiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiachiActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtdtnhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtnhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtnhaActionPerformed

    private void txtCmndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCmndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCmndActionPerformed

    private void TxtNoisinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNoisinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNoisinhActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void txtHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoActionPerformed

    private void txtManhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManhanvienActionPerformed

    }//GEN-LAST:event_txtManhanvienActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtNoisinh;
    private javax.swing.JCheckBox box1;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btSave;
    private com.toedter.calendar.JDateChooser cbNgaycap;
    private com.toedter.calendar.JDateChooser cbNgaysinh1;
    private javax.swing.JComboBox<String> cbcanhan;
    private javax.swing.JComboBox<String> cbchucdanh;
    private javax.swing.JComboBox<String> cbchucvu;
    private javax.swing.JComboBox<String> cbdaibieu;
    private javax.swing.JComboBox<String> cbdantoc;
    private javax.swing.JComboBox<String> cbdonvi;
    private javax.swing.JComboBox<String> cbgiadinh;
    private javax.swing.JComboBox<String> cbgioitinh;
    private javax.swing.JComboBox<String> cbhonnhan;
    private javax.swing.JComboBox<String> cbnhansu;
    private javax.swing.JComboBox<String> cbnhommau;
    private javax.swing.JComboBox<String> cbnoicap;
    private javax.swing.JComboBox<String> cbquoctich;
    private javax.swing.JComboBox<String> cbsuckhoe;
    private javax.swing.JComboBox<String> cbtongiao;
    private javax.swing.JComboBox<String> cbtuyendung;
    private javax.swing.JComboBox<String> cbxuatthan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCmnd;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtHovaten1;
    private javax.swing.JTextField txtManhanvien;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtcannang;
    private javax.swing.JTextField txtchieucao;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtdtdd;
    private javax.swing.JTextField txtdtnha;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtghichu;
    private javax.swing.JTextField txtnoio;
    // End of variables declaration//GEN-END:variables

    public Connection getConnection() {
        com.mysql.jdbc.Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed to connect DB", "Error", 1);
        }
        return conn;
    }
}
