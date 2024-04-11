package se.campusmolndal.unitweb_demo.util;

public class Bank {
    private double balance;
    public boolean deposit(double amount) {
        // Vad ska metoden göra?
        // Den tar emot mängd pengar och returnerar true om det är en positiv summa, annars false.
        // Om det är en positiv summa så ska den addera summan till ett en variabel som håller
        // koll på hur mycket pengar som finns i banken.
        // Om det är en negativ summa så ska den returnera false och inte påverka bankens totala summa.
        // Om det är en positiv summa så ska den returnera true och addera summan till bankens totala summa.

        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

}
