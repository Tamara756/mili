public class Main {
    public static void main(String[] args) {
        int ticketCost = 16239;     //Ввести стоимость билета на саомлет.
        int oneMile = 20;
        int bonusMiles = ticketCost / oneMile;  // Дробные мили не начисляются. Нужно подумать и посмотреть.
        System.out.println("За билет стоимостью" + " " + ticketCost + "рублей," );
        System.out.println("будет начислено" + " " + bonusMiles + " " + "бонусных миль" );
    }
}