public class Main {
    public static void main(String[] args) {

        int a = 100; //текущий счет
        int b = 1500; //пополнение счета
        int bonus;

        if (b > 1000) {
            System.out.println("Бонус:");
            System.out.println(bonus = (b + a) / 100);
            System.out.println("Итоговый счет:");
            System.out.println((a + b) + bonus);


        } else {
            System.out.println("Бонус:");
            System.out.println(0);
            System.out.println("Итоговый счет:");
            System.out.println(a + b);
        }
    }
}