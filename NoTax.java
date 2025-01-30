public class NoTax implements SalesTaxBehavior {
    //calculate no tax on given sales amount
    @Override
    public double compute(double x) {
        return 0;
    }
}
