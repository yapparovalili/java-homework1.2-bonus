import com.sun.source.doctree.SystemPropertyTree;

public class Main {
    public static void main(String[] args) {

        int startingAccount = 100; // Сумма начального счета
        int replenishmentAmount = 1100; // Сумма пополнения
        int ruble;

        if (replenishmentAmount > 1000) {
            ruble = 1;
        } else {
            ruble = 0;
        }
        {
            System.out.println("Сумма начального счета: " + (startingAccount));
            System.out.println("Сумма пополнения: " + (replenishmentAmount));
            System.out.println("Количество бонусных рублей: " + ((startingAccount + replenishmentAmount) / 100 * ruble));
            System.out.println("Итоговый счет: " + ((replenishmentAmount + startingAccount) + ((startingAccount + replenishmentAmount) / 100 * ruble)));

        }
    }
}