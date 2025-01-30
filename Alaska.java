import java.util.Scanner;

public class Alaska extends State{
    @Override
    public double compute(double x) {
        //use NoTax's compute method to calculate sales tax
        NoTax noTax = new NoTax();
        return noTax.compute(x);
    }

    @Override
    void showTax(double sale) {
        //call on compute method using given sale amount using correct algorithm and print final amount
        double salesTax = compute(sale);

        System.out.printf("The sales tax on $%.2f in Alaska is $%.2f.\n", sale, salesTax);
    }
}
