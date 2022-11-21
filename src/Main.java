public class Main {
    public static void main(String[] args) {
        System.out.println("Laboratorki");
        //Задание 1
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(485842415859L, 55554334435L));
        System.out.println(calculator.sub(4.5, 5.5));
        System.out.println(calculator.mul(1000, 1000));
        System.out.println(calculator.div(5, 2));

        //Задание 2
        Chocolate milk = new Chocolate("milk", 30, false);
        milk.info();
    }
}