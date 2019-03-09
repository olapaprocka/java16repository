package pl.mpas.advances_programming.lambda_this;

public class Main {

    public void move(){
        System.out.println("move() inside main");

    }

    public Main(){

    }

    public Main(String name){
        name = name; //tak sie nie robi widzisz to to popatrz jeszcze raz nie robi tego co my chcemy = przesłania name
    }

    private String name = "Main";
    public Moveable makeOne(){
        return new Moveable() {
            private String name = "Moveable";
            @Override
            public void move() {
                String name = "internal";
                System.out.println("inside anonymous class - move()");
                System.out.println("name = "+ this.name);
                System.out.println("name = " + name);
                System.out.println("External name: " + Main.this.name);
                move(); //spowodowalismy rekurencje - bedzie coszilo dopoki nie zapelnimy stosu wpadamy w problemy
                this.move();  // wpadamy w problemy

            }
        };

    }

    public Moveable makeOneWithLambda(){
          //String name = "hahaha";
          String name = this.name;
        return () -> {
            //String name = "inside lambda";
            this.move();
            System.out.println(this.name); // odnosi sie do name przy Main  -  sprawdzamy Ctrl + q
            System.out.println(name); // odnosi sie do name z tej metody
        };
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {



    }
}
