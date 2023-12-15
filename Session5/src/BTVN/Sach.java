package BTVN;

public class Sach {
        private int id;
        private String tieuDe;
        private TacGia tacGia;

        public Sach(int id, String tieuDe, TacGia tacGia) {
            this.id = id;
            this.tieuDe = tieuDe;
            this.tacGia = tacGia;
        }

        public int getId() {
            return id;
        }

        public String getTieuDe() {
            return tieuDe;
        }

        public TacGia getTacGia() {
            return tacGia;
        }

        public void setTieuDe(String tieuDe) {
            this.tieuDe = tieuDe;
        }

        public void setTacGia(TacGia tacGia) {
            this.tacGia = tacGia;
        }
}
