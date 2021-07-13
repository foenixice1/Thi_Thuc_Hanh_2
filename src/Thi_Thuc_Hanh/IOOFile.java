package Thi_Thuc_Hanh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class IOOFile {
    public static void writeFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Thi_Thuc_Hanh.DanhBa.csv"));
            String something = "SDT,NhomDB,HoTen,GioiTinh,DiaChi,NgaySinh,Gmail";
            bufferedWriter.write(something);
            for (DanhBa danhBa : ManageDanhBa.danhBas) {
                bufferedWriter.newLine();
                bufferedWriter.write(danhBa.display());
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<DanhBa> readFile() {
        ArrayList<DanhBa> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Thi_Thuc_Hanh.DanhBa.csv"));
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                list.add(new DanhBa(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
