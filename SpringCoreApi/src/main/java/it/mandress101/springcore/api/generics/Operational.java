package it.mandress101.springcore.api.generics;

public class Operational <T extends Number, V extends Number> {

    T object1;
    V object2;

    public Operational(T object1, V object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public Operational() {

    }

    public void setFirstValue(T object1) {
        this.object1 = object1;
    }

    public void setSecondValue(V object2) {
        this.object2 = object2;
    }

    double doubleMultilication() {
        return object1.doubleValue() * object2.doubleValue();
    }

    public int integerMultilication() {
        return object1.intValue() * object2.intValue();
    }

    
    String genericAddittionToString(Operational<?, ?> ob) {
        return String.valueOf(ob.object1.doubleValue() + ob.object2.doubleValue());
    }

    Operational<?, ?> genericAddittion(Operational<?, ?> ob) {
        return new Operational<>((ob.object1.doubleValue() + ob.object2.doubleValue()), (ob.object1.doubleValue() + ob.object2.doubleValue()));
    }

    boolean equals(Operational<?, ?> ob) {
        if(Math.abs(ob.object1.doubleValue()) == Math.abs(ob.object2.doubleValue()))
            return true;
        return false;
    }

    public T getFirstValue() {
        return object1;
    }

    public V getSecondValue() {
        return object2;
    }

    @Override
    public String toString() {
        return "Operational{" +
                "firstValue=" + object1 +
                ", secondValue=" + object2 +
                '}';
    }
}
