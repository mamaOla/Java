package Homework5_obj;

public class CreditCard {

        int countNumber;
        double money;

    public CreditCard(double money, int countNumber) {
        this.money = money;
        this.countNumber = countNumber;
    }

    public CreditCard() {

    }

    public double add (double a, int b){
        return (int) (a + b);
    }

    public double sub (double a, int b){
        return a - b;
    }
}
