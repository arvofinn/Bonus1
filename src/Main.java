public class Main {
    public static void main(String[] args) {

        int mainCheck = 100; //текущий счет
        int fillCheck = 1500; //пополнение счета
        int bonus;

        if (fillCheck > 1000) {
            System.out.println("Бонус:");
            System.out.println(bonus = (fillCheck + mainCheck) / 100);
            System.out.println("Итоговый счет:");
            System.out.println((mainCheck + fillCheck) + bonus);


        } else {
            System.out.println("Бонус:");
            System.out.println(0);
            System.out.println("Итоговый счет:");
            System.out.println(mainCheck + fillCheck);
        }
    }
}