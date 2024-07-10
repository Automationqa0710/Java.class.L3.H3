//public class CreditPaymentService {
  //public double  calculate(int amountCredit, int creditTime, double persentRate )
  //int countCredit =
//}


    public class CreditPaymentService {

      public int calculateMonthlyPayment(int amountCredit, int creditTime, double annualRate) {
        double monthlyRate = annualRate / 12 / 100;
        double monthlyPayment = amountCredit * (monthlyRate * Math.pow(1 + monthlyRate, creditTime)) /
                (Math.pow(1 + monthlyRate, creditTime) - 1);
        return (int) monthlyPayment;
      }
    }
