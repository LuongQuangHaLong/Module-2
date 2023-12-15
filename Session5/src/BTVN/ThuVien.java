package BTVN;

import java.util.ArrayList;

public class ThuVien {
    public ArrayList<TacGia> danhSachTacGia;
    public ArrayList<Sach> danhSachSach;

    public ThuVien() {
        danhSachTacGia = new ArrayList<>();
        danhSachSach = new ArrayList<>();
    }

    public void themTacGia(TacGia tacGia) {
        danhSachTacGia.add(tacGia);
    }

    public void hienThiTacGia() {
        System.out.println("Danh sách tác giả:");
        for (TacGia tacGia : danhSachTacGia) {
            System.out.println("ID: " + tacGia.getId() + ", Tên tác giả: " + tacGia.getTenTacGia());
        }
    }

    public void capNhatTacGia(int id, String tenTacGiaMoi) {
        for (TacGia tacGia : danhSachTacGia) {
            if (tacGia.getId() == id) {
                tacGia.setTenTacGia(tenTacGiaMoi);
                System.out.println("Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy tác giả có ID = " + id);
    }

    public void xoaTacGia(int id) {
        for (TacGia tacGia : danhSachTacGia) {
            if (tacGia.getId() == id) {
                if (kiemTraTacGiaCoSach(id)) {
                    System.out.println("Không thể xóa tác giả có sách.");
                } else {
                    danhSachTacGia.remove(tacGia);
                    System.out.println("Xóa tác giả thành công.");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy tác giả có ID = " + id);
    }

    private boolean kiemTraTacGiaCoSach(int idTacGia) {
        for (Sach sach : danhSachSach) {
            if (sach.getTacGia().getId() == idTacGia) {
                return true;
            }
        }
        return false;
    }

    public void themSach(Sach sach) {
        danhSachSach.add(sach);
    }

    public void timKiemSachTheoTieuDe(String tieuDe) {
        System.out.println("Kết quả tìm kiếm theo tiêu đề '" + tieuDe + "':");
        for (Sach sach : danhSachSach) {
            if (sach.getTieuDe().toLowerCase().contains(tieuDe.toLowerCase())) {
                System.out.println("ID: " + sach.getId() + ", Tiêu đề: " + sach.getTieuDe() +
                        ", Tác giả: " + sach.getTacGia().getTenTacGia());
            }
        }
    }

    public void timKiemSachTheoTacGia(String tenTacGia) {
        System.out.println("Kết quả tìm kiếm theo tác giả '" + tenTacGia + "':");
        for (Sach sach : danhSachSach) {
            if (sach.getTacGia().getTenTacGia().toLowerCase().contains(tenTacGia.toLowerCase())) {
                System.out.println("ID: " + sach.getId() + ", Tiêu đề: " + sach.getTieuDe() +
                        ", Tác giả: " + sach.getTacGia().getTenTacGia());
            }
        }
    }
}
