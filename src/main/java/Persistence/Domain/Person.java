package Persistence.Domain;

public class Person {

    private Long id;

    private int age;

    private String name;

    public Person(Long id, int age, String name){
        super();
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Person(){
        super();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString(){
        return "Person [id = " + id + ", age =" + age+ ", name=" + name + "]";
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result +age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object == null){
            return false;
        }
        if(getClass() != object.getClass()){
            return false;
        }
        Person other = (Person) object;

        if(age != other.getAge()){
            return false;
        }

        if(name == null){
            if(other.name != null){
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }
}
