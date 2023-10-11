public class Main {
    public static void main(String[] args) {

        Company cp = new Company();

        Person p1 = new Person("Mao", "Arrieta", "mao@correo.com", 36, "123456");
        Person p2 = new Person("luciua", "rey", "luci@correo.com", 6, "1234567");
        Person p3 = new Person("hellen", "lus", "lys@correo.com", 60, "1234568");
        Person p4 = new Person("lili", "guevara", "lili@correo.com", 30, "1234596");
        Person p5 = new Person("Mario", "fontalvo", "mario@correo.com", 26, "1230456");

        cp.addPerson(p1);
        cp.addPerson(p2);
        cp.addPerson(p3);
        cp.addPerson(p4);
        cp.addPerson(p5);

        Person personMaxAge =  cp.getMaxAge();
        Person personMinAge =  cp.getMinAge();
        double average = cp.averageAge();

        System.out.println("Persona Máxima edad: " + personMaxAge);
        System.out.println("Persona Mḯnima edad: " + personMinAge);
        System.out.println("Promedio Edad: " + average);

    }
}