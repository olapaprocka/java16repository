package pl.mpas.advances_programming.null_handling;

@FunctionalInterface
interface SayHallo {
    void sayHallo();
    default void goodbye(){
        System.out.println("Googbye!!!");
    }

        }
@FunctionalInterface
interface Test {
    void doSamething (int a, String name);

    default void someMethod1(){
        System.out.println("someMethod1");
    }
    default void someMethod2(){
        System.out.println("someMethod2");
    }

        }

public class HelloLambda {
    public static void main(String[] args) {
        //String a = "ala";
        //String b = "a" + "l" + "a";
        //String c = new String("ala");


        SayHallo hello = () -> {
        };

        hello.sayHallo();

        useTest((a, b) -> System.out.println("" + a + a + " -- " + b + b),
                5, "Mariusz");

        useTest((a, b) -> System.out.println("" + a + a + a + " --- " + b + b + b),
                5, "Mariusz");

        /*useTest(new Test() {
            @Override
            public  void doSomething(int a , String name){

            }, 5, "a");
                }*/

}
    public  static void useTest(Test test, int a, String s){
      test.doSamething(a, s);
    }
}
