public class Hawaii extends State{
    //private instance vairable for sales tax behavior
    private SalesTaxBehavior salesTaxBehavior;

    //method to set sales tax behavior dynamically
    public void setSalesTaxBehavior(SalesTaxBehavior stb) {
        salesTaxBehavior = stb;
    }

    public double compute(double x) {
        //use local salesTaxBehavior compute method to compute sales tax
        return salesTaxBehavior.compute(x);
    }

    void showTax(double sale) {
        //call on compute method using given sale amount using correct algorithm and print final amount
        double salesTax = compute(sale);

        System.out.printf("The sales tax on $%.2f in Hawaii is $%.2f.\n", sale, salesTax);
    }
}
