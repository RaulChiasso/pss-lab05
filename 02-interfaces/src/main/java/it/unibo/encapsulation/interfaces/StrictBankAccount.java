package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount{

    private static double ATM_TRANSACTION_FEE = 1;
    private static double MANAGEMENT_FEE = 5;

    private final int id;
    private double balance;
    private int transactions;

    public StrictBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance = balance;
        this.transactions = 0;
    }

    public int getid() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

    public void deposit(final int id, final double amount) {
        if (this.id == id) {
            this.balance += amount;
            this.transactions++;
        }
    }

    public void withdraw(final int id, final double amount) {
        if (this.id == id && this.balance >= amount) {
            this.balance -= amount;
            this.transactions++;
        }
    }

    public void depositFromATM(final int id, final double amount) {
        if (this.id == id) {
            this.balance += (amount - ATM_TRANSACTION_FEE);
            this.transactions++;
        }
    }

    public void withdrawFromATM(final int id, final double amount) {
        if (this.id == id && this.balance >= amount) {
            this.balance -= (amount - ATM_TRANSACTION_FEE);
            this.transactions++;
        }
    }

    public void chargeManagementFees(final int id) {
        if (this.id == id) {
            this.balance -= MANAGEMENT_FEE + (this.transactions * 0.1);
        }
    }
}
