package pl.mpas.advances_programming;

class Person {
    private String name;
    private String surname;

    private Person partner;


    public Person(String name, String surname, Person partner) {
        this.name = name;
        this.surname = surname;
        this.partner = partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person getPartner() {
        return partner;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Person performCloning() {
        Person newYou = null;
        try {
            newYou = (Person) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
return newYou;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", partner=" + partner.name +
                '}';
    }
}


public class Exercice4 {

    public static void main(String[] args) {
        Person me = new Person("Ola", "P", null);
        Person partner = new Person("M", "M", null);
        System.out.println("Me: " + me);
        System.out.println("Partner: " + partner);

        Person clonedPartner = partner.performCloning();
        System.out.println(clonedPartner);



    }
}
