package observable;

import observer.ProductObserver;

import java.util.ArrayList;
import java.util.List;

public class ProductObservableImpl implements ProductObservable{
    List<ProductObserver> observerList = new ArrayList<>();
    String status = "Unavailable";

    @Override
    public void add(ProductObserver productObserver) {
        observerList.add(productObserver);
    }

    @Override
    public void remove(ProductObserver productObserver) {
        observerList.remove(productObserver);
    }

    @Override
    public void notifyObserver() {
        for(ProductObserver productObserver: observerList){
            productObserver.update();
        }
    }

    @Override
    public void setStatus(String status) {
        this.status=status;
    }

    @Override
    public String getStatus() {
        return this.status;
    }
}
