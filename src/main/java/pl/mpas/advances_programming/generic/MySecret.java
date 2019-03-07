package pl.mpas.advances_programming.generic;

public class MySecret {

private String secret;

    public MySecret(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return secret;
    }

    @Override
    public String toString() {
        return "MySecret{" +
                "secret='" + secret + '\'' +
                '}';
    }
}
