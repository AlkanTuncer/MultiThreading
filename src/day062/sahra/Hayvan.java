package day062.sahra;

public class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public Hayvan() {
    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "isim='" + isim + '\'' +
                '}';
    }
}
