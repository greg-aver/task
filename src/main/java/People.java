
public class People {
    private String name;
    private Integer Age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public People() {
    }

    public People(String name, Integer age) {
        this.name = name;
        Age = age;
    }
}
