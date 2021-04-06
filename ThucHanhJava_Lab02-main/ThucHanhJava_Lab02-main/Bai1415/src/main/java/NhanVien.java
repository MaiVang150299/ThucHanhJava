
public class NhanVien {

    public int getMANV() {
        return MANV;
    }

    public void setMANV(int MANV) {
        this.MANV = MANV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public NhanVien() {
    }

    public NhanVien(String input) {
        String data[] = input.split(" ");
        MANV = Integer.parseInt(data[0]);
        HoTen = data[1];
        NamSinh = Integer.parseInt(data[2]);
        SP = Integer.parseInt(data[3]);

    }

    public NhanVien(int MANV, String HoTen, int NamSinh) {
        this.MANV = MANV;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
    }

    public int getSP() {
        return SP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    public NhanVien(int MANV, String HoTen, int NamSinh, int SP) {
        this.MANV = MANV;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.SP = SP;
    }
    private int MANV;
    private String HoTen;
    private int NamSinh;
    private int SP;

    @Override
    public String toString() {
        return "NhanVien{" + "MANV=" + MANV + ", HoTen=" + HoTen + ", NamSinh=" + NamSinh + ", SP=" + SP + '}';
    }

}
