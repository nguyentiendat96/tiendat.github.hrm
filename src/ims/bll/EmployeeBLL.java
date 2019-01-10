/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.bll.EmployeeBLL;
import ims.dal.Canhan;
import ims.dal.Chucdanh;
import ims.dal.Chucvu;
import ims.dal.Daibieu;
import ims.dal.Dantoc;
import ims.dal.Donvi;
import ims.dal.EmployeeDAL;
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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manng
 */
public class EmployeeBLL {

    EmployeeDAL dal = new EmployeeDAL();

    public ArrayList<Employee> ReadEmployeeBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readEmployee();
        return listEmployee;
    }

    public void AddNewEmployeeDAL(Employee employeeModel) {
        try {
            dal.AddNewEmployee(employeeModel);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeBLL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void EditEmployeeDAL(Employee employeeModel) {
        try {
            dal.EditEmployee(employeeModel);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void DeleteEmployeeBLL(String Malop) {
        try {
            dal.DeleteEmployeeDAL(Malop);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Gioitinh takeGioitinhBLL(String tengioitinh) {
        Gioitinh gtinh = new Gioitinh();
        gtinh = dal.takeGTDAL(tengioitinh);
        return gtinh;
    }
    ////////////////////////////////////////////////////////

    public Noicap  takeNoicapBLL(String tennoicap) {
        Noicap ncap = new Noicap();
        ncap = dal.takeNoicapDAL(tennoicap);
        return ncap;
    }

    public Dantoc   takeDantocBLL(String tendantoc) {
        Dantoc dtoc = new Dantoc();
        dtoc = dal.takeDantocDAL(tendantoc);
        return dtoc;
    }

    public Tongiao takeTongiaoBLL(String tentongiao) {
        Tongiao dtoc = new Tongiao();
        dtoc = dal.takeTongiaoDAL(tentongiao);
        return dtoc;
    }

    public Suckhoe takeSuckhoeBLL(String loaisuckhoe) {
        Suckhoe skhoe = new Suckhoe();
        skhoe = dal.takeSuckhoeDAL(loaisuckhoe);
        return skhoe;
    }

    public Quoctich QuoctichBLL(String tenquoctich) {
        Quoctich qtich = new Quoctich();
        qtich = dal.takeQuoctichDAL(tenquoctich);
        return qtich;
    }

    public honnhan HonnhanBLL(String tenhonnhan) {
        honnhan hn = new honnhan();
        hn = dal.takeHonnhanDAL(tenhonnhan);
        return hn;
    }

    public Chucdanh chucdanhbll(String tenchucdanh) {
        Chucdanh cd = new Chucdanh();
        cd = dal.chudanhDAL(tenchucdanh);
        return cd;
    }

    public Chucvu chucvubll(String tenchucvu) {
        Chucvu cv = new Chucvu();
        cv = dal.chucvuDAL(tenchucvu);
        return cv;
    }

    public Daibieu daibieubll(String tendaibieu) {
        Daibieu db = new Daibieu();
        db = dal.daibieuDAL(tendaibieu);
        return db;
    }

    public Donvi donvibll(String tendonvi) {
        Donvi dv = new Donvi();
        dv = dal.donviDAL(tendonvi);
        return dv;
    }

    public nhansu nhansubll(String tennhansu) {
        nhansu ns = new nhansu();
        ns = dal.nhansuDAL(tennhansu);
        return ns;
    }
    public Nhommau nhommaubll(String tennhommau) {
        Nhommau nm = new Nhommau();
        nm = dal.nhommauDAL(tennhommau);
        return nm;
    }
      public Xuatthan xuatthanbll(String tenxuatthan) {
        Xuatthan xt = new Xuatthan();
        xt = dal.xuatthanDAL(tenxuatthan);
        return xt;
    }
       public Canhan canhanbll(String tencanhan) {
        Canhan ca = new Canhan();
        ca = dal.canhanDAL(tencanhan);
        return ca;
    }
}
