package week_6.generics;

public class CustomGeneric<T> {

    private T val;

    public CustomGeneric(T val){
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
