package btt8;

import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        if (namXuatBan > 0 && namXuatBan <= 2026) {
            this.namXuatBan = namXuatBan;
        } else {
            this.namXuatBan = 2026;
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            this.soLuong = 0;
        }
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach + " | Tieu de: " + tieuDe + " | Tac gia: " + tacGia + " | Nam XB: " + namXuatBan + " | So luong: " + soLuong);
    }
}

public class BTT8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n=== QUAN LY THU VIEN - TUAN 8 ===");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String ma = scanner.nextLine();
                    System.out.print("Nhap tieu de: ");
                    String tieuDe = scanner.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tacGia = scanner.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int namXB = scanner.nextInt();
                    System.out.print("Nhap so luong: ");
                    int sl = scanner.nextInt();
                    scanner.nextLine();

                    Sach s = new Sach(ma, tieuDe, tacGia, namXB, sl);
                    danhSachSach.add(s);
                    System.out.println("Them sach thanh cong (da ap dung dong goi va kiem tra hop le)!");
                    break;

                case 2:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach sach trong!");
                        break;
                    }
                    System.out.println("\n--- DANH SACH SACH TRONG THU VIEN ---");
                    for (Sach item : danhSachSach) {
                        item.hienThiThongTin();
                    }
                    break;

                case 3:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach sach trong!");
                        break;
                    }
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = scanner.nextLine();
                    boolean thay = false;
                    for (Sach item : danhSachSach) {
                        if (item.getMaSach().equalsIgnoreCase(maTim)) {
                            System.out.println("Da tim thay sach:");
                            item.hienThiThongTin();
                            thay = true;
                        }
                    }
                    if (!thay) {
                        System.out.println("Khong tim thay sach co ma: " + maTim);
                    }
                    break;

                case 4:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 4);

        scanner.close();
    }
}