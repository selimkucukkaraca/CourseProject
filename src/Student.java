public class Student {
    private int ogrenciNo;
    private int sinifi;

    public Student(int ogrenciNo, int sinifi) {
        this.ogrenciNo = ogrenciNo;
        this.sinifi = sinifi;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public int getSinifi() {
        return sinifi;
    }

    public void setSinifi(int sinifi) {
        this.sinifi = sinifi;
    }
}
