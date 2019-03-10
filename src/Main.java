import model.MoneyTransfer;
import repository.MoneyTransferRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main (String[] args) {
        SimpleDateFormat theOneAndOnlySensibleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date after = theOneAndOnlySensibleDateFormat.parse("2019-01-02");
            Date before = theOneAndOnlySensibleDateFormat.parse("2019-03-03");
            ArrayList<MoneyTransfer> transfers = MoneyTransferRepository.getTransfersBetweenDates(after, before);
        } catch (ParseException e) {
            // Pretty sure nothing will throw here
        }
    }
}
