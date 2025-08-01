package Models.entities;

import Models.exceptions.DomainExceptions;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {

        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        if (amount > this.withdrawLimit) {
            throw new DomainExceptions("The amount exceeds withdraw limit");
        }
        if (amount > this.balance) {
            throw new DomainExceptions("Not enough balance");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account"
                + "number=" + number
                + ", holder='" + holder
                + ", balance=" + balance
                + ", withdrawLimit=" + withdrawLimit;
    }
}
