import java.util.Scanner;

public class Indiana extends State{
    @Override
    public double compute(double x) {
        //use SevenPercent's compute method to calculate sales tax
        SevenPercent sevenPercent = new SevenPercent();
        return sevenPercent.compute(x);

    }

    @Override
    void showTax(double sale) {
        //call on compute method to calculate sales tax using correct algorithm and print final amount
        double salesTax = compute(sale);

        System.out.printf("The sales tax on $%.2f in Indiana is $%.2f.\n", sale, salesTax);

    }
}
