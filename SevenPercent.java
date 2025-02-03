public class SevenPercent implements SalesTaxBehavior{

    //calculate 7 percent tax on given sale amount
    public double compute(double x) {
        return x * 0.07;
    }
}
