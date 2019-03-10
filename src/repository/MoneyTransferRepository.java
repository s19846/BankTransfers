package repository;

import model.MoneyTransfer;

import java.util.ArrayList;
import java.util.Date;

import static repository.MoneyTransferRepositoryMock.getTransfers;

public class MoneyTransferRepository {
    public static ArrayList<MoneyTransfer> getTransfersBetweenDates(Date after, Date before) {
        ArrayList<MoneyTransfer> targetTransfers = new ArrayList<>();
        ArrayList<MoneyTransfer> transfersFromDb = getTransfers();
        for (MoneyTransfer currentTransfer : transfersFromDb) {
            Date transactionDate = currentTransfer.getDateOfTransaction();
            if (transactionDate.before(before) && transactionDate.after(after)) {
                targetTransfers.add(currentTransfer);
            }
        }
        return targetTransfers;
    }
}
