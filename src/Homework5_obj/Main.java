package Homework5_obj;

public class Main {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.money = 35;
        creditCard.countNumber = 123456789;;

        System.out.println("Ваш номер счета и текущий баланс карты 1:  ");
        System.out.println(creditCard.countNumber);
        System.out.println(creditCard.money);

        CreditCard creditCard1 = new CreditCard();
        creditCard1.money = 45.5;
        creditCard1.countNumber = 987654321;;

        System.out.println("Ваш номер счета и текущий баланс карты 2 :   ");
        System.out.println(creditCard1.countNumber);
        System.out.println(creditCard1.money);

        System.out.println("Вы положили на карту 1: 6 рублей и ваш баланс составляет");
        System.out.println(creditCard.add((creditCard.money), 6));
        System.out.println("Вы сняли с карты 2: 6 рублей и ваш баланс составляет:  ");
        System.out.println(creditCard1.sub((creditCard1.money), 6 ));
    }

}
