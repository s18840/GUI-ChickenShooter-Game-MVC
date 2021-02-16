import javax.swing.*;

public class ConvertListModel extends AbstractListModel<String> {

    private String uzytkownik;
    private int czas;
    private int stopienTrudnosci;

    public ConvertListModel(String uzytkownik, int czas, int stopienTrudnosci) {
        this.uzytkownik = uzytkownik;
        this.czas = czas;
        this.stopienTrudnosci = stopienTrudnosci;
    }

    @Override
    public int getSize() {
        return 100;
    }

    public String getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(String uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public int getCzas() {
        return czas;
    }

    public void setCzas(int czas) {
        this.czas = czas;
    }

    @Override
    public String getElementAt(int index) {
        return null;
    }
}
