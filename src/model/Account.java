package model;

import java.util.Date;

public class Account {
    private User user;
    private Date creationDate;
    private Currency preferredCurrency;

    public User getUser() {
        return user;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Currency getPreferredCurrency() {
        return preferredCurrency;
    }

    public Account(User user, Currency preferredCurrency) {
        this.user = user;
        this.preferredCurrency = preferredCurrency;
        this.creationDate = new Date();
    }
}
