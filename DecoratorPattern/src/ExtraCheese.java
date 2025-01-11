public class ExtraCheese extends ToppingsDecorator{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    int cost() {
        return basePizza.cost()+30;
    }
}
