package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
         */
        AccountHolder andreaRossi = new AccountHolder("Andrea", 
                                                      "Rossi", 
                                                      1);
        /*
         * 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
         */
        AccountHolder alexBianchi = new AccountHolder("Alex",
                                                      "Bianchi", 
                                                      2);
        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount 
         * per il conto diBianchi (ammontare iniziale = 0)
         */
        BankAccount bankAccountRossi = new SimpleBankAccount(
                                            andreaRossi.getUserID(), 0);
        BankAccount bankAccountBianchi = new StrictBankAccount(
                                            alexBianchi.getUserID(), 0);;

        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         */
        
        /*
         * Perchè entrambi i tipi di bank account implementano la stessa interfaccia 
         * quindi posso dichiarare una variabile del tipo dell'interfaccia
         * e inizializzarla con una qualunque classe che implementi l'interfaccia
        */ 
        

        /*
         * 5) Depositare €10000 in entrambi i conti
         */
        bankAccountRossi.deposit(andreaRossi.getUserID(), 10000);
        bankAccountBianchi.deposit(alexBianchi.getUserID(), 10000);

        /*
         * 6) Prelevare €15000$ da entrambi i conti
         */
        bankAccountRossi.withdraw(andreaRossi.getUserID(), 15000);
        bankAccountBianchi.withdraw(alexBianchi.getUserID(), 15000);

        /*
         * 7) Stampare in stdout l'ammontare corrente
         */
        System.out.println("Bank account Andrea Rossi balance: " + 
                            bankAccountRossi.getBalance());
        System.out.println("Bank account Alex Bianchi balance: " +
                            bankAccountBianchi.getBalance());

        /*
         * 8) Qual è il risultato e perché?
         */

        /*
         * Andrea Rossi ha il conto in negativo a -5000 
         * perchè il suo conto può andare in rosso
         * 
         * Alex Bianchi non ha effettuato il prelievo 
         * perchè il suo conto non può andare in rosso
         */

        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
        bankAccountRossi.deposit(andreaRossi.getUserID(), 10000);
        bankAccountBianchi.deposit(alexBianchi.getUserID(), 10000);

        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */
        bankAccountRossi.chargeManagementFees(andreaRossi.getUserID());
        bankAccountBianchi.chargeManagementFees(alexBianchi.getUserID());

        /*
         * 11) Stampare a video l'ammontare corrente
         */
        System.out.println("Bank account Andrea Rossi balance: " + 
                            bankAccountRossi.getBalance());
        System.out.println("Bank account Alex Bianchi balance: " +
                            bankAccountBianchi.getBalance());

        /*
         * 12) Qual è il risultato e perché?
         */

        /*
         * Andrea Rossi ha il conto aggiornato con il nuovo deposito
         * ma senza aver detratto una FEE 
         * perchè il suo conto non prevede spese di gestione
         * 
         * Alex Bianchi ha il conto aggiornato con il nuovo deposito
         * e con una detrazione della FEE 
         * perchè il suo conto prevede spese di gestione
         */
    }
}
