package model;

import java.util.Date;

public class MoneyTransfer {
    private Account sender;
    private Account receiver;
    private Date dateOfTransaction;
    private Currency currency;
    private double amount;

    public Account getSender() {
        return sender;
    }

    public Account getReceiver() {
        return receiver;
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public MoneyTransfer(
            Account sender,
            Account receiver,
            Date dateOfTransaction,
            Currency currency,
            double amount
    ) {
        this.sender = sender;
        this.receiver = receiver;
        this.dateOfTransaction = dateOfTransaction;
        this.currency = currency;
        this.amount = amount;
    }
}
