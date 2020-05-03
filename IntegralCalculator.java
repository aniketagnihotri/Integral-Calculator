import java.util.Scanner;

public class IntegralCalculator {

    public static void main(String[] args) {
        //  take derivative of a strictly numerical function of real numbers
        System.out.println("This program will use your entered data to find the integral for a function that is comprised of real numbers");
        System.out.println("Would you like to begin? Type Yes or No");

        //char only permits one character per variable. String permits a string or chars per variable
        Scanner decisionofUser = new Scanner(System.in);
        String decision;
        decision = decisionofUser.nextLine();
        if(decision.equals("yes")|| decision.equals("Yes")){
            System.out.println("Let's begin!");
            System.out.println("Print the coefficient of your x term below");
        }else{
            System.out.println("Type 'no' to confirm!");
            double oneVariable = 1;
        }
        //When using an if/else or while or do statement with char, must set the variable equal to a char in single quotes

        Scanner firstVariable = new Scanner(System.in);
        double oneVariable;
        oneVariable = firstVariable.nextDouble();
        System.out.println("Print the power of your x term below");
        Scanner secondVariable = new Scanner(System.in);
        double twoVariable;
        twoVariable = secondVariable.nextInt();

        if(oneVariable == 1){
            System.out.println("Your term currently looks like this: y=x^" + twoVariable);
        }else{
            System.out.println("Your term currently looks like this: y=" + oneVariable + "x^" + twoVariable);
        }
        if(oneVariable == 0){
            System.out.println("After being simplified, your term is equal to 0.0");
        }else{
        }

        if(twoVariable == 0){
            System.out.println("Because the power of your x term is 0.0, it is equal to 1.0*(your coeffiecient)");
            System.out.println("After being simplified, your term is equal to " + oneVariable);
        }


        if(oneVariable == 0 || twoVariable == 0){
            System.out.println("Your term is a constant");
            System.out.println("Your integral is equal to 0.0");
            //  }else if(){
        }else{
            double finalPower = twoVariable + 1;
            double finalCoefficient = oneVariable / finalPower;
            System.out.println("After integrating, the coefficient of your integral is " + finalCoefficient);
            System.out.println("The power of your integral is " + finalPower);
            System.out.println("Your integral looks like this: y=" + finalCoefficient + "x^" + finalPower);
        }
    }
}
