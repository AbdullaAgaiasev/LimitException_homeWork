import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        while (true){
            try {
                bankAccount.withDraw(6000);
                System.out.println("withdrawed 6000");
            } catch (LimitException e) {
                bankAccount.setAmount(0);
                System.out.println("our account equals zero");
                break;
            }
        }



        //Scanner scanner = new Scanner(System.in);

//        while (true){
//            System.out.println("Счет клиента составляет: ");
//            String amount = scanner.next();
//            try {
//                BankAccount.getAmount();
//                System.out.println("Успешно " + amount + " сом ");
//            }catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//            System.out.println("Положить на счет: ");
//            int deposit = scanner.nextInt();
//
//            try {
//                BankAccount.deposit(Double.parseDouble(String.valueOf(deposit)));
//                System.out.println("Успешно,вы положили " + deposit + " сом на карточку.");
//                System.out.println("Текущий счет " + deposit);
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//            System.out.println("Сколько вы желаете снять денег ? ");
//            String withDraw = scanner.next();
//
//            int x = 20000;
//            int y = 6000;
//            try {
//                BankAccount.withDraw(Integer.parseInt((withDraw)));
//                System.out.println("Успешно,вы сняли " + withDraw + " сом ");
//                System.out.println("Текущий счет " + (x - y));
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//            withDraw = scanner.next();
//
//            try {
//                BankAccount.withDraw(Integer.parseInt(withDraw));
//                System.out.println("\nУспешно,вы сняли " + withDraw + " сом ");
//                System.out.println("Текущий счет " + ((x - y) - y) + " сом ");
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//            withDraw = scanner.next();
//            try {
//                BankAccount.withDraw(Integer.parseInt(withDraw));
//                System.out.println("\nУспешно,вы сняли " + withDraw + " сом ");
//                System.out.println("Текущий счет " + (((x - y) - y) - y) + " сом ");
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//            try {
//                String LimitException = scanner.next();
//                System.out.println("\nУспешно,вы сняли " + LimitException + " сом ");
//                System.out.println("Текущий счет " + ((((x - y) - y) - y) - y) + " сом ");
//            }catch (Exception ie){
//                System.out.println(ie.getMessage());
//            }
//        }

    }
}