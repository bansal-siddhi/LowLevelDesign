package observer;

import observable.ProductObservable;

public class ProductObserverImpl implements ProductObserver{
    ProductObservable productObservable;

    public ProductObserverImpl(ProductObservable productObservable){
        this.productObservable=productObservable;
    }
    @Override
    public void update() {
        System.out.println(productObservable.getStatus());
    }
}
