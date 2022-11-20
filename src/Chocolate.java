public class Chocolate {
    String type;
    int cacaoPercent;
    boolean sugarFree;

    public Chocolate() {

    }

    public Chocolate(String type, int cacaoPercent, boolean sugarFree) {
        this.type = type;
        this.cacaoPercent = cacaoPercent;
        this.sugarFree = sugarFree;
    }

    public void info() {
        System.out.printf("Type: %s\tCacao: %d\tSugarfree: %b\n", type, cacaoPercent, sugarFree);
    }
}
