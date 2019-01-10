using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
namespace Project
{
    #region Nhanvien
    public class Nhanvien
    {
        #region Member Variables
        protected string _manhanvien;
        protected string _ho;
        protected string _ten;
        protected string _hovaten;
        protected string _ngaysinh;
        protected string _magioitinh;
        protected string _noisinh;
        protected string _socmnd;
        protected string _manoicap;
        protected string _dtdd;
        protected string _dtnha;
        protected string _email;
        protected string _madantoc;
        protected string _matongiao;
        protected string _masuckhoe;
        protected string _mahonnhan;
        protected string _maquoctich;
        protected string _diachi;
        protected string _noihientai;
        protected string _ghichu;
        protected string _madonvi;
        protected string _madaibieu;
        protected string _manhansu;
        protected string _machucvu;
        protected string _machucdanh;
        protected string _chieucao;
        protected string _cannang;
        protected string _manhommau;
        protected string _macanhan;
        protected string _maxuatthan;
        protected string _magiadinh;
        protected string _matuyendung;
        #endregion
        #region Constructors
        public Nhanvien() { }
        public Nhanvien(string ho, string ten, string hovaten, string ngaysinh, string magioitinh, string noisinh, string socmnd, string manoicap, string dtdd, string dtnha, string email, string madantoc, string matongiao, string masuckhoe, string mahonnhan, string maquoctich, string diachi, string noihientai, string ghichu, string madonvi, string madaibieu, string manhansu, string machucvu, string machucdanh, string chieucao, string cannang, string manhommau, string macanhan, string maxuatthan, string magiadinh, string matuyendung)
        {
            this._ho=ho;
            this._ten=ten;
            this._hovaten=hovaten;
            this._ngaysinh=ngaysinh;
            this._magioitinh=magioitinh;
            this._noisinh=noisinh;
            this._socmnd=socmnd;
            this._manoicap=manoicap;
            this._dtdd=dtdd;
            this._dtnha=dtnha;
            this._email=email;
            this._madantoc=madantoc;
            this._matongiao=matongiao;
            this._masuckhoe=masuckhoe;
            this._mahonnhan=mahonnhan;
            this._maquoctich=maquoctich;
            this._diachi=diachi;
            this._noihientai=noihientai;
            this._ghichu=ghichu;
            this._madonvi=madonvi;
            this._madaibieu=madaibieu;
            this._manhansu=manhansu;
            this._machucvu=machucvu;
            this._machucdanh=machucdanh;
            this._chieucao=chieucao;
            this._cannang=cannang;
            this._manhommau=manhommau;
            this._macanhan=macanhan;
            this._maxuatthan=maxuatthan;
            this._magiadinh=magiadinh;
            this._matuyendung=matuyendung;
        }
        #endregion
        #region Public Properties
        public virtual string Manhanvien
        {
            get {return _manhanvien;}
            set {_manhanvien=value;}
        }
        public virtual string Ho
        {
            get {return _ho;}
            set {_ho=value;}
        }
        public virtual string Ten
        {
            get {return _ten;}
            set {_ten=value;}
        }
        public virtual string Hovaten
        {
            get {return _hovaten;}
            set {_hovaten=value;}
        }
        public virtual string Ngaysinh
        {
            get {return _ngaysinh;}
            set {_ngaysinh=value;}
        }
        public virtual string Magioitinh
        {
            get {return _magioitinh;}
            set {_magioitinh=value;}
        }
        public virtual string Noisinh
        {
            get {return _noisinh;}
            set {_noisinh=value;}
        }
        public virtual string Socmnd
        {
            get {return _socmnd;}
            set {_socmnd=value;}
        }
        public virtual string Manoicap
        {
            get {return _manoicap;}
            set {_manoicap=value;}
        }
        public virtual string Dtdd
        {
            get {return _dtdd;}
            set {_dtdd=value;}
        }
        public virtual string Dtnha
        {
            get {return _dtnha;}
            set {_dtnha=value;}
        }
        public virtual string Email
        {
            get {return _email;}
            set {_email=value;}
        }
        public virtual string Madantoc
        {
            get {return _madantoc;}
            set {_madantoc=value;}
        }
        public virtual string Matongiao
        {
            get {return _matongiao;}
            set {_matongiao=value;}
        }
        public virtual string Masuckhoe
        {
            get {return _masuckhoe;}
            set {_masuckhoe=value;}
        }
        public virtual string Mahonnhan
        {
            get {return _mahonnhan;}
            set {_mahonnhan=value;}
        }
        public virtual string Maquoctich
        {
            get {return _maquoctich;}
            set {_maquoctich=value;}
        }
        public virtual string Diachi
        {
            get {return _diachi;}
            set {_diachi=value;}
        }
        public virtual string Noihientai
        {
            get {return _noihientai;}
            set {_noihientai=value;}
        }
        public virtual string Ghichu
        {
            get {return _ghichu;}
            set {_ghichu=value;}
        }
        public virtual string Madonvi
        {
            get {return _madonvi;}
            set {_madonvi=value;}
        }
        public virtual string Madaibieu
        {
            get {return _madaibieu;}
            set {_madaibieu=value;}
        }
        public virtual string Manhansu
        {
            get {return _manhansu;}
            set {_manhansu=value;}
        }
        public virtual string Machucvu
        {
            get {return _machucvu;}
            set {_machucvu=value;}
        }
        public virtual string Machucdanh
        {
            get {return _machucdanh;}
            set {_machucdanh=value;}
        }
        public virtual string Chieucao
        {
            get {return _chieucao;}
            set {_chieucao=value;}
        }
        public virtual string Cannang
        {
            get {return _cannang;}
            set {_cannang=value;}
        }
        public virtual string Manhommau
        {
            get {return _manhommau;}
            set {_manhommau=value;}
        }
        public virtual string Macanhan
        {
            get {return _macanhan;}
            set {_macanhan=value;}
        }
        public virtual string Maxuatthan
        {
            get {return _maxuatthan;}
            set {_maxuatthan=value;}
        }
        public virtual string Magiadinh
        {
            get {return _magiadinh;}
            set {_magiadinh=value;}
        }
        public virtual string Matuyendung
        {
            get {return _matuyendung;}
            set {_matuyendung=value;}
        }
        #endregion
    }
    #endregion
}