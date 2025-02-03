
public class Indiana extends State{
    //private instance variable for sales tax behavior
    private SalesTaxBehavior salesTaxBehavior;

    //method to set sales tax behavior dynamically
    public void setSalesTaxBehavior(SalesTaxBehavior stb){
        salesTaxBehavior = stb;
    }

    public double compute(double x) {
        //call on salesTaxBehaviors' compute method to compute sales tax
        return salesTaxBehavior.compute(x);
    }


    void showTax(double sale) {
        //call on local compute method to calculate sales tax using correct algorithm and print final amount
        double salesTax = compute(sale);

        System.out.printf("The sales tax on $%.2f in Indiana is $%.2f.\n", sale, salesTax);

    }
}
