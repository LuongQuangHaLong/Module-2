package BTVN;

import java.util.Scanner;

public class QuanLiThuVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThuVien thuVien = new ThuVien();

        while (true) {
            System.out.println("Menu chính");
            System.out.println("1. Quản lý tác giả");
            System.out.println("2. Quản lý sách");
            System.out.println("3. Thoát");

            System.out.print("Chọn menu: ");
            int menuChinh = scanner.nextInt();

            switch (menuChinh) {
                case 1:
                    quanLyTacGia(scanner, thuVien);
                    break;
                case 2:
                    quanLySach(scanner, thuVien);
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Menu không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void quanLyTacGia(Scanner scanner, ThuVien thuVien) {
        while (true) {
            System.out.println("1. Thêm tác giả");
            System.out.println("2. Hiển thị tác giả");
            System.out.println("3. Cập nhật thông tin tác giả (theo id)");
            System.out.println("4. Xóa tác giả (Không xóa tác giả có sách)");
            System.out.println("5. Quay lại (quay trở về menu chính)");
            System.out.print("Chọn menu quản lý tác giả: ");
            int menuTacGia = scanner.nextInt();

            switch (menuTacGia) {
                case 1:
                    themTacGia(scanner, thuVien);
                    break;
                case 2:
                    hienThiTacGia(thuVien);
                    break;
                case 3:
                    capNhatTacGia(scanner, thuVien);
                    break;
                case 4:
                    xoaTacGia(scanner, thuVien);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Menu không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static void themTacGia(Scanner scanner, ThuVien thuVien) {
        System.out.println("Nhập id: ");
        int idTacGia = (scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String tenTacGia = scanner.next();

        TacGia tacGia = new TacGia(thuVien.danhSachTacGia.size() + 1, tenTacGia);
        thuVien.themTacGia(tacGia);
        System.out.println("Thêm tác giả thành công.");
    }

    public static void hienThiTacGia(ThuVien thuVien) {
        thuVien.hienThiTacGia();
    }

    public static void capNhatTacGia(Scanner scanner, ThuVien thuVien) {
        System.out.print("Nhập ID tác giả cần cập nhật: ");
        int idTacGia = scanner.nextInt();

        System.out.print("Nhập tên tác giả mới: ");
        String tenTacGiaMoi = scanner.next();

        thuVien.capNhatTacGia(idTacGia, tenTacGiaMoi);
    }

    public static void xoaTacGia(Scanner scanner, ThuVien thuVien) {
        System.out.print("Nhập ID tác giả cần xóa: ");
        int idTacGia = scanner.nextInt();

        thuVien.xoaTacGia(idTacGia);
    }

    public static void quanLySach(Scanner scanner, ThuVien thuVien) {
        while (true) {
            System.out.println("1. Thêm sách");
            System.out.println("2. Tìm kiếm sách theo tiêu đề");
            System.out.println("3. Tìm kiếm sách theo tên tác giả");
            System.out.println("4. Cập nhật sách (theo id)");
            System.out.println("5. Quay lại (Quay về menu chính)");

            System.out.print("Chọn menu quản lý sách: ");
            int menuSach = scanner.nextInt();

            switch (menuSach) {
                case 1:
                    themSach(scanner, thuVien);
                    break;
                case 2:
                    timKiemSachTheoTieuDe(scanner, thuVien);
                    break;
                case 3:
                    timKiemSachTheoTacGia(scanner, thuVien);
                    break;
                case 4:
                    capNhatSach(scanner, thuVien);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Menu không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void themSach(Scanner scanner, ThuVien thuVien) {
        System.out.print("Nhập tiêu đề sách: ");
        String tieuDe = scanner.next();

        System.out.print("Nhập tên tác giả: ");
        String tenTacGia = scanner.next();

        TacGia tacGia = timTacGiaTheoTen(thuVien, tenTacGia);

        if (tacGia == null) {
            System.out.println("Tác giả không tồn tại. Vui lòng thêm tác giả trước.");
            return;
        }

        Sach sach = new Sach(thuVien.danhSachSach.size() + 1, tieuDe, tacGia);
        thuVien.themSach(sach);

        System.out.println("Thêm sách thành công.");
    }

    private static TacGia timTacGiaTheoTen(ThuVien thuVien, String tenTacGia) {
        for (TacGia tacGia : thuVien.danhSachTacGia) {
            if (tacGia.getTenTacGia().equalsIgnoreCase(tenTacGia)) {
                return tacGia;
            }
        }
        return null;
    }

    private static void timKiemSachTheoTieuDe(Scanner scanner, ThuVien thuVien) {
        System.out.print("Nhập tiêu đề sách cần tìm: ");
        String tieuDe = scanner.next();

        thuVien.timKiemSachTheoTieuDe(tieuDe);
    }

    private static void timKiemSachTheoTacGia(Scanner scanner, ThuVien thuVien) {
        System.out.print("Nhập tên tác giả cần tìm: ");
        String tenTacGia = scanner.next();

        thuVien.timKiemSachTheoTacGia(tenTacGia);
    }

    private static void capNhatSach(Scanner scanner, ThuVien thuVien) {
        System.out.print("Nhập ID sách cần cập nhật: ");
        int idSach = scanner.nextInt();

        for (Sach sach : thuVien.danhSachSach) {
            if (sach.getId() == idSach) {
                System.out.print("Nhập tiêu đề mới: ");
                String tieuDeMoi = scanner.next();
                sach.setTieuDe(tieuDeMoi);

                System.out.print("Nhập tên tác giả mới: ");
                String tenTacGiaMoi = scanner.next();
                TacGia tacGiaMoi = timTacGiaTheoTen(thuVien, tenTacGiaMoi);

                if (tacGiaMoi == null) {
                    System.out.println("Tác giả mới không tồn tại. Vui lòng thêm tác giả trước.");
                    return;
                }

                sach.setTacGia(tacGiaMoi);

                System.out.println("Cập nhật sách thành công.");
                return;
            }
        }

        System.out.println("Không tìm thấy sách có ID = " + idSach);
    }
}


