package BTVN;

public class TacGia {
    private int id;
    private String tenTacGia;

    public TacGia(int id, String tenTacGia) {
        this.id = id;
        this.tenTacGia = tenTacGia;
    }

    public int getId() {
        return id;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }
}

