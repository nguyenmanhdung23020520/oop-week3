public class Student extends person {
    private  String msv;

    public Student(int bornYear, String name, String msv) {
        super(name, bornYear);
        this.msv = msv;
    }


    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
}
