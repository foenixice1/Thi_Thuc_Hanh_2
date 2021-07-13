package Thi_Thuc_Hanh.QuanLyDB;

public class DanhBa {
    private String soDT;
    private String nhomDB;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;
    private String ngaySinh;
    private String gmail;

    public DanhBa(String soDT, String nhomDB, String hoTen, String gioiTinh, String diaChi, String ngaySinh, String gmail) {
        this.soDT = soDT;
        this.nhomDB = nhomDB;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.gmail = gmail;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getNhomDB() {
        return nhomDB;
    }

    public void setNhomDB(String nhomDB) {
        this.nhomDB = nhomDB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Danh bạ {" +
                "SĐT = '" + soDT + '\'' +
                ", Nhóm danh bạ = '" + nhomDB + '\'' +
                ", Họ tên = '" + hoTen + '\'' +
                ", Giới tính = '" + gioiTinh + '\'' +
                ", Địa chỉ = '" + diaChi + '\'' +
                ", Ngày sinh = '" + ngaySinh + '\'' +
                ", Gmail = '" + gmail + '\'' +
                '}';
    }

    public String display() {
        return soDT + "," + nhomDB + "," + hoTen + "," + gioiTinh + "," + diaChi + "," + ngaySinh + "," + gmail;
    }
}
