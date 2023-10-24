package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder andreaRossi = new AccountHolder("Andrea", 
                                                      "Rossi", 
                                                      1);

        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder alexBianchi = new AccountHolder("Alex",
                                                      "Bianchi", 
                                                      2);

        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount bankAccountRossi= new SimpleBankAccount(
            andreaRossi.getUserID(), 
            0);
        SimpleBankAccount bankAccountBianchi= new SimpleBankAccount(
            alexBianchi.getUserID(), 
            0);

        // 4) Effettuare una serie di depositi e prelievi
        bankAccountRossi.deposit(andreaRossi.getUserID(), 1000);
        bankAccountRossi.deposit(andreaRossi.getUserID(), 700);
        bankAccountRossi.withdraw(andreaRossi.getUserID(), 800);
        bankAccountBianchi.deposit(alexBianchi.getUserID(), 500);
        bankAccountBianchi.deposit(alexBianchi.getUserID(), 400);
        bankAccountBianchi.withdraw(alexBianchi.getUserID(), 350);

        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println("Bank account Andrea Rossi balance: " + 
                            bankAccountRossi.getBalance());
        System.out.println("Bank account Alex Bianchi balance: " +  
                            bankAccountBianchi.getBalance());

        // 6) Provare a prelevare fornendo un id utente sbagliato
        bankAccountRossi.deposit(andreaRossi.getUserID()+1, 1000);

        // 7) Controllare nuovamente l'ammontare
        System.out.println("Bank account Andrea Rossi balance: " + 
                            bankAccountRossi.getBalance());
    }
}
