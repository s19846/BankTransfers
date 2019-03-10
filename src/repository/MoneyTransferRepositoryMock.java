package repository;

import model.Account;
import model.Currency;
import model.MoneyTransfer;
import model.User;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class MoneyTransferRepositoryMock {
    public static ArrayList<MoneyTransfer> getTransfers() {
        ArrayList<MoneyTransfer> transfers = new ArrayList<>();
        Currency polishZloty = new Currency(
                48,
                "Polski Nowy Złoty",
                "PLN"
        );
        User userReceiver = new User(
                "Wacław",
                "Andrzejewski",
                "55020895734"
        );
        User userSender = new User(
                "Andrzej",
                "Jarociński",
                "91060326526"
        );
        Account receiver = new Account(
                userReceiver,
                polishZloty
        );
        Account sender = new Account(
                userSender,
                polishZloty
        );
        Random amountGenerator = new Random();
        Calendar calendar = Calendar.getInstance();
        for (int i=0;i<100;i++) {
            calendar.add(Calendar.DAY_OF_YEAR, i * (-1));
            MoneyTransfer currentTransfer = new MoneyTransfer(
                    sender,
                    receiver,
                    calendar.getTime(),
                    polishZloty,
                    amountGenerator.nextInt(10000)
            );
            transfers.add(currentTransfer);
        }
        return transfers;
    }
}
