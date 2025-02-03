public class SalesTaxCalculator {
    public static void main(String[] args) {
        //create instances of each state and update sales tax behavior to appropraite model
        Alaska alaska = new Alaska();
        alaska.setSalesTaxBehavior(new NoTax());

        Indiana indiana = new Indiana();
        indiana.setSalesTaxBehavior(new SevenPercent());

        Hawaii hawaii = new Hawaii();
        hawaii.setSalesTaxBehavior(new FourPointFivePercent());

        // if alaska is the state, call on alaska's show tax method
        if (args[0] == "Alaska"){
          alaska.showTax(Double.parseDouble(args[1]));
        }
        //if indiana is the state, call on indiana's show tax method
        else if (args[0] == "Indiana"){
          indiana.showTax(Double.parseDouble(args[1]));
        }
        //if Hawaii is the state, update sales tax behavior and show tax
        else if (args[0] == "Hawaii"){
            hawaii.showTax(Double.parseDouble(args[1]));
        }
        //if given state is neither alaska, hawaii, or indiana, show error
        else{
          System.out.println("Invalid argument(s)");
        }
    }
}
