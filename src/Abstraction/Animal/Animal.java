package Abstraction.Animal;

public abstract class Animal {
    private String name;
    private final String bread; // ı can not created 6 settles, just created 3 but ı can created 6 gettels
    private final char gender;
    private int age;
    private String size;
    private final String color; // has to be set use to constructor

    public final static boolean canBreath;

    static { // for apply every object ı use to this
        canBreath=true;
    }

    public Animal(String name, String bread, char gender, int age, String size, String color) {

        setName(name); // advantage we can settle different name and check
        this.bread = bread;
        if ( !(gender=='N'||gender=='F') ){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( name.isEmpty() ){
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public final void drink(){ // implementation for ever never unchangeable, ı use to finbal method
        System.out.println(name+" is drinking");
    }

    public abstract void eat(); // if I want to different implementation, ı can use abstract

    @Override
    public String toString() {
        return getClass().getName()+ "Animal{" + // getname yazılmadığı taktirde bütün classı çağırır
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
