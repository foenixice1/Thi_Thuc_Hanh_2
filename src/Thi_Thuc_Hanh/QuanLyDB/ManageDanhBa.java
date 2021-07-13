package Thi_Thuc_Hanh.QuanLyDB;

import Thi_Thuc_Hanh.IOOFile.IOOFile;
import Thi_Thuc_Hanh.Regex.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageDanhBa {
    public static ArrayList<DanhBa> danhBas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public ManageDanhBa() {

    }

    public static void show() {
        for (DanhBa danhBa : danhBas) {
            System.out.println(danhBa.toString());
        }
    }

    public static void add() {
        String soDT = getSoDT();
        String nhomDB = getNhomDB();
        String hoTen = getHoTen();
        String gioiTinh = getGioiTinh();
        String diaChi = getDiaChi();
        String ngaySinh = getNgaySinh();
        String gmail = getGmail();
        danhBas.add(new DanhBa(soDT, nhomDB, hoTen, gioiTinh, diaChi, ngaySinh, gmail));
        IOOFile.writeFile();
    }

    private static String getSoDT() {
        while (true) {
            try {
                System.out.println("Nhập số điện thoại");
                String number = sc.nextLine();
                if (PhoneNumberRegex.validate(number)) {
                    boolean check = true;
                    for (DanhBa danhBa : danhBas) {
                        if (danhBa.getSoDT().equals(number)) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        return number;
                    } else {
                        System.err.println("SĐT đã tồn tại. Nhập lại SĐT");
                    }
                } else throw new Exception();
            } catch (Exception e) {
                System.err.println("Số điện thoại phải bắt đầu từ số 0 và theo sau 9 số");
            }
        }
    }

    private static String getNhomDB() {
        while (true) {
            try {
                System.out.println("Nhập vào nhóm danh bạ");
                String group = sc.nextLine();
                if (GroupRegex.validate(group)) {
                    return group;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.err.println("Nhóm phải là số");
            }
        }
    }

    private static String getHoTen() {
        while (true) {
            try {
                System.out.println("Nhập họ & tên");
                String name = sc.nextLine();
                if (NameRegex.validate(name)) {
                    return name;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.err.println("Tên không được là số và không được để trống");
            }
        }
    }

    private static String getGioiTinh() {
        while (true) {
            try {
                System.out.println("Giới tính");
                String gender = sc.nextLine();
                if (GenderRegex.validate(gender)) {
                    return gender;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.err.println("Giới tính bắt buộc phải là nam hoặc nữ");
            }
        }
    }

    private static String getDiaChi() {
        System.out.println("Nhập vào địa chỉ");
        return sc.nextLine();
    }

    private static String getNgaySinh() {
        while (true) {
            try {
                System.out.println("Ngày Sinh");
                String gender = sc.nextLine();
                if (BirthdayRegex.validate(gender)) {
                    return gender;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.err.println("Ngày sinh bắt buộc phải XXXX-XX-XX");
            }
        }
    }

    private static String getGmail() {
        while (true) {
            try {
                System.out.println("Nhập vào gmail");
                String gmail = sc.nextLine();
                if (GmailRegex.validate(gmail)) {
                    boolean check = true;
                    for (DanhBa danhBa : danhBas) {
                        if (danhBa.getGmail().equals(gmail)) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        return gmail;
                    } else {
                        System.err.println("Gmail đã tồn tại. Nhập lại gmail");
                    }
                } else throw new Exception();
            } catch (Exception e) {
                System.err.println("Gmail bắt buộc phải là định dạng .....@gmail.com");
            }
        }
    }

    public static void update() {
        System.out.println("Nhập vào SĐT cần thay đổi thông tin ");
        String numberChange = sc.nextLine();
        int index = -1;
        for (int i = 0; i < danhBas.size(); i++) {
            if (danhBas.get(i).getSoDT().equals(numberChange)) {
                index = i;
                break;
            }else {
                System.err.println("Không tồn tại SĐT");
            }
        }
        if (index != -1) {
            String soDT = getSoDT();
            String nhomDB = getNhomDB();
            String hoTen = getHoTen();
            String gioiTinh = getGioiTinh();
            String diaChi = getDiaChi();
            String ngaySinh = getNgaySinh();
            String gmail = getGmail();
            danhBas.set(index,new DanhBa(soDT, nhomDB, hoTen, gioiTinh, diaChi, ngaySinh, gmail));
            IOOFile.writeFile();
        }
    }

    public static void delete() {
        System.out.println("Nhập SĐT cần xóa");
        String sdtDelete = sc.nextLine();
        System.err.println("Cảnh báo !!!!");
        System.out.println("Bạn có thật sự muốn xóa");
        System.out.println("1 . Có");
        System.out.println("2 . Không");
        int choice = 99;
        try {
            choice = Integer.parseInt(sc.nextLine());

        } catch (Exception e) {
            System.err.println("Vui lòng nhập đúng");
        }
        if (choice == 1) {
            danhBas.removeIf(danhBa -> danhBa.getSoDT().equals(sdtDelete));
        }
    }

    public static void searchDB() {
        System.out.println("Nhập vào SDT :");
        String sdt = sc.nextLine();
        boolean check = false;
        for (DanhBa db : danhBas) {
            if (db.getSoDT().equals(sdt)) {
                System.out.println(db);
                check = true;
                break;
            }
        }
        if (check) {
            return;
        } else {
            System.err.println("Không có kết quả");
        }
    }
    public static void readFile() {
        danhBas = IOOFile.readFile();
    }

    public static void writeFile() {
        IOOFile.writeFile();
    }


}
