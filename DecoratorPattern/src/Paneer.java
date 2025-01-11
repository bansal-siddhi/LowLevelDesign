public class Paneer extends ToppingsDecorator{

    BasePizza basePizza;

    public Paneer(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    int cost() {
        return basePizza.cost()+40;
    }


}
