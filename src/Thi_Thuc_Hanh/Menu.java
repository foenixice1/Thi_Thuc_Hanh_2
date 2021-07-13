package Thi_Thuc_Hanh;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        IOOFile.readFile();
        while (true) {
            System.out.println("|====================================|");
            System.out.println("| ---CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ--- |");
            System.out.println("|     Chọn chức năng để tiếp tục     |");
            System.out.println("| 1. Xem danh sách                   |");
            System.out.println("| 2. Thêm mới                        |");
            System.out.println("| 3. Cập nhập                        |");
            System.out.println("| 4. Xóa                             |");
            System.out.println("| 5. Tìm kiếm                        |");
            System.out.println("| 6. Đọc từ File                     |");
            System.out.println("| 7. Ghi vào File                    |");
            System.out.println("| 0. Thoát                           |");
            System.out.println("| Mời bạn chọn                       |");
            System.out.println("|====================================|");
            int choice = 99;
            try {
                choice = Integer.parseInt(sc.nextLine());

            } catch (Exception e) {
            }
            switch (choice) {
                case 1:
                    ManageDanhBa.show();
                    break;
                case 2:
                    ManageDanhBa.add();
                    break;
                case 3:
                    ManageDanhBa.update();
                    break;
                case 4:
                    ManageDanhBa.delete();
                    break;
                case 5:
                    ManageDanhBa.searchDB();
                    break;
                case 6:
                    ManageDanhBa.readFile();
                    break;
                case 7:
                    ManageDanhBa.writeFile();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập đúng");
            }

        }

    }
}
