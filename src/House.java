import java.util.Calendar;

public class House {
    private int floor;
    private int builtin;
    private String housename;

    public void setAll(int floor, int builtin, String housename) {
        this.floor = floor;
        this.builtin = builtin;
        this.housename = housename;
    }

    public void getAll() {
        System.out.printf("Floors:%d Year:%d Name:%s\n", floor, builtin, housename);
    }

    public void howOld() {
        Calendar calendar = Calendar.getInstance();
        int houseAge = calendar.get(Calendar.YEAR) - builtin;
        System.out.println(houseAge);
    }
}

