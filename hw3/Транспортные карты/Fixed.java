import java.time.LocalDate;

public class Fixed extends Card{
    int cardType; // Студенческая - 0, Школьная 1, Социальная - 2
    LocalDate date;
    double fixedPayment;

    public Fixed(int id, int cardType){
        super(id);
        this.cardType = cardType;
        this.date = LocalDate.of(2000, 1, 1);

        switch (this.cardType) {
            case 0 -> this.fixedPayment = 300;
            case 1 -> this.fixedPayment = 250;
            case 2 -> this.fixedPayment = 280;
        }
    }

}
