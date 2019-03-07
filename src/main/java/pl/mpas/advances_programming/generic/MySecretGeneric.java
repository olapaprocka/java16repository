package pl.mpas.advances_programming.generic;

public class MySecretGeneric {
    private Object object;

    public MySecretGeneric(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "MySecretGeneric{" +
                "object=" + object +
                '}';
    }
}
