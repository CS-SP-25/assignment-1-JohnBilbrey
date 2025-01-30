public class SevenPercent implements SalesTaxBehavior{

    //calculate 7 percent tax on given sale amount
    @Override
    public double compute(double x) {
        return x * 0.07;
    }
}
