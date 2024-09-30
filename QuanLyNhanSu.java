class Person {
    private String hoTen;
    private int namSinh;

    public Person(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getInfo() {
        return "Họ tên: " + hoTen + ", Năm sinh: " + namSinh;
    }
}


class GiangVien extends Person {

    public GiangVien(String hoTen, int namSinh) {
        super(hoTen, namSinh);
    }

    public String getInfo() {
        return super.getInfo();
    }
}

class SinhVien extends Person {
    private String mssv;

    public SinhVien(String hoTen, int namSinh, String mssv) {
        super(hoTen, namSinh);
        this.mssv = mssv;
    }

    public String getInfo() {
        return super.getInfo() + ", MSSV: " + mssv;
    }
}

class CacNhanSuKhac extends Person {
    public CacNhanSuKhac(String hoTen, int namSinh) {
        super(hoTen, namSinh);
    }

    public String getInfo() {
        return super.getInfo();
    }
}
public class QuanLyNhanSu {
    public static void main(String[] args) {
        GiangVien gv1 = new GiangVien("Nguyen Van A", 1980);
        SinhVien sv1 = new SinhVien("Duong Thanh Binh", 2000,"23020516");
        System.out.println(gv1.getInfo());
        System.out.println(sv1.getInfo());
    }
} 