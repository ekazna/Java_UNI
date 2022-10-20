public class Main {
    public static void main(String[] args) {


// не поняла в чем разница между банкоматом и телефоном,
// чтобы два раза не повторять код оставила только банкомат


// создаем терминал, две карты (разовая, школьная (1)), банкомат
        Terminal terminal1 = new Terminal();
        Fixed card1 = new Fixed(1001, 1);
        OneTimePayment card2 = new OneTimePayment(2001);
        ATM atm1 = new ATM();

// Пополняем карты
        card1.AtmChangeBalance(atm1);
        card2.AtmChangeBalance(atm1);
        card2.AtmAddTrips(atm1);


        /* Карту можно пополнить и через метод банкомата
        atm1.AddFunds(card1);
        atm1.AddFunds(card2);
        atm1.AddTrips(card2);
        */

/* Фиксированная карта хранит дату покупки проездного
 Если дата покупки отличается от текущей более чем на 30 дней
     если на карте хватает денег терминал автоматически записывает на нее
     новый проездной
 */
        terminal1.checkPayment(card1);
        terminal1.checkPayment(card1);
        terminal1.checkPayment(card2);
        terminal1.checkPayment(card2);

        terminal1.getStatistics();
    }
}
