package se.campusmolndal.unitweb_demo.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
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


    /*
    // Metod: Withdraw
    // Vad ska metoden göra?
    // Vad ska den returnera?
    // Vilka parametrar behöver den?

    // Exempel:
    // Om banken har 100:- och jag gör en withdraw på 50:- så ska banken ha 50:- kvar.
    // Om banken har 100:- och jag gör en withdraw på 200:- så ska banken ha 100:- kvar. (inget uttag sker)
    // Om banken har 100:- och jag gör en withdraw på -50:- så ska banken ha 100:- kvar. (inget uttag sker)

    // Gherkin
    // Om vi antar att banken har 100:- och jag gör en withdraw på 50:- så ska banken ha 50:- kvar.
    // Om vi antar att banken har 100:- och jag gör en withdraw på 200:- så ska banken ha 100:- kvar.
    // Om vi antar att banken har 100:- och jag gör en withdraw på -50:- så ska banken ha 100:- kvar.

    // User cases
    // Som användare vill jag kunna ta ut pengar från banken så att jag kan använda dem.
    // Om jag har pengar på banken så ska jag kunna ta ut dem.
    // Om jag inte har pengar på banken så ska jag inte kunna ta ut dem.
    // Om jag försöker ta ut mer pengar än jag har på banken så ska jag inte kunna ta ut dem.
    // Om jag försöker ta ut ett negativt belopp så ska jag inte kunna ta ut dem.
    */

    public boolean withdraw(double amount) {
        if (amount <= 0) return false; // försöker lura banken
        if (amount > balance) return false; // försöker ta ut mer än vad som finns
        balance -= amount;
        return true;
    }

}
