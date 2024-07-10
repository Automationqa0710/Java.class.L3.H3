//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           CreditPaymentService service = new CreditPaymentService();


           double  myCredit = service.calculateMonthlyPayment(1_000_000, 12, 9.99);
           double  myCredit1 = service.calculateMonthlyPayment(1_000_000, 24, 9.99);
           double  myCredit2 = service.calculateMonthlyPayment(1_000_000, 36, 9.99);
            System.out.println(myCredit);
            System.out.println(myCredit1);
            System.out.println(myCredit2);

                     //kam


            //System.out.println(service.calculateMonthlyPayment(1_000_000, 12, 9.99));
            //System.out.println(service.calculateMonthlyPayment(1_000_000, 24, 9.99));
           // System.out.println(service.calculateMonthlyPayment(1_000_000, 36, 9.99));
        }
    }
