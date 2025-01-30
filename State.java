public abstract class State implements SalesTaxBehavior {

    String name;
    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    abstract void showTax(double sale);
}
