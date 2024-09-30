class Person {
    private String hoTen;
    private int namSinh;

    public Person(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }
}


class GiangVien extends Person {

    public GiangVien(String hoTen, int namSinh) {
        super(hoTen, namSinh);
    }


}

class SinhVien extends Person {
    private String mssv;

    public SinhVien(String hoTen, int namSinh, String mssv) {
        super(hoTen, namSinh);
        this.mssv = mssv;
    }

}

class CacNhanSuKhac extends Person {
    public CacNhanSuKhac(String hoTen, int namSinh) {
        super(hoTen, namSinh);
    }

}
public class QuanLyNhanSu {
    public static void main(String[] args) {
        GiangVien gv1 = new GiangVien("Nguyen Van A", 1980);

    }
} 