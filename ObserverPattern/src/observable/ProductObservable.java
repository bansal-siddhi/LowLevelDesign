package observable;

import observer.ProductObserver;

public interface ProductObservable {
    public void add(ProductObserver productObserver);
    public void remove(ProductObserver productObserver);

    public void notifyObserver();
    public void setStatus(String status);
    public String getStatus();

}
