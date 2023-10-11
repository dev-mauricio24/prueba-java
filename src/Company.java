import java.util.ArrayList;

public class Company {
    private ArrayList<Person> personas;

    public Company() {
        this.personas = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.personas.add(person);
    }

    public Person getMaxAge() {
        int maxValue = Integer.MIN_VALUE;
        Person per = null;
        for(Person p: this.personas) {
            if(p.getAge() > maxValue) {
                maxValue = p.getAge();
                per = p;
            }
        }
        return per;
    }
    public Person getMinAge() {
        int minValue = Integer.MAX_VALUE;
        Person per = null;
        for(Person p: this.personas) {
            if(p.getAge() < minValue) {
                minValue = p.getAge();
                per = p;
            }
        }
        return per;
    }
    public double averageAge() {
        int counter = 0;
        for(Person p: this.personas) {
            counter += p.getAge();
        }
        return (double) counter / this.personas.size();
    }
}
