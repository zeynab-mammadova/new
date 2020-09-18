import java.util.Scanner;

public class ClassAssignment {

    public static double USDtoAZN(double usd) {
        return usd * 1.70;
    }

    public static double AZNtoUSD(double azn) {
        return azn / 1.70;
    }

    public static double AZNtoEURO(double azn) {
        return azn * 2;
    }

    public static double EUROtoAZN(double euro) {
        return euro / 2;
    }

    public static double AZNtoTR(double azn) {
        return azn *4;
    }

    public static double TRtoAZN(double tr) {
        return tr/4;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter amount of money");
        double amount = scanner.nextDouble();

        System.out.println("USDtoAZN " + USDtoAZN(amount)); //USDtoAZN
        System.out.println("AZNtoUSD " + AZNtoUSD(amount));  //AZNtoUSD
        System.out.println("AZNtoEURO " + AZNtoEURO(amount));  //AZNtoEURO
        System.out.println("EUROtoAZN " + EUROtoAZN(amount));//EUROtoAZN
        System.out.println("AZNtoTR " + AZNtoTR(amount));  //AZNtoEURO
        System.out.println("TRtoAZN " + TRtoAZN(amount));//EUROtoAZN

    }
}

