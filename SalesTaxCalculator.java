public class SalesTaxCalculator {
    public static void main(String[] args) {
        // if alaska is the state, call on alaska's show tax method
        if (args[0] == "Alaska"){
          Alaska alaska = new Alaska();
          alaska.showTax(Double.parseDouble(args[1]));
        }
        //if indiana is the state, call on indiana's show tax method
        else if (args[0] == "Indiana"){
          Indiana indiana = new Indiana();
          indiana.showTax(Double.parseDouble(args[1]));
        }
        //if given state is neither alaska or indiana, show error
        else{
          System.out.println("Invalid argument(s)");
        }
    }
}
