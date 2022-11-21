public class Main {
    public static void main(String[] args) {
        System.out.println("Laboratorki");
        //Задание 1
        Calculator calculator = new Calculator();
        System.out.println(calculator.Sum(485842415859L, 55554334435L));
        System.out.println(calculator.Sub(4.5, 5.5));
        System.out.println(calculator.Mul(1000, 1000));
        System.out.println(calculator.Div(5, 2));

        //Задание 2
        Chocolate milk = new Chocolate("milk", 30, false);
        milk.info();
    }
}