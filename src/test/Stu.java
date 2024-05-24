package test;

public class Stu<N, A, S> {
    private N name;
    private A age;
    private S sex;

    public Stu(N name, A age, S sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(N name) {
        this.name = name;
    }

    public void setAge(A age) {
        this.age = age;
    }

    public void setSex(S sex) {
        this.sex = sex;
    }

    public N getName() {
        return name;
    }

    public A getAge() {
        return age;
    }

    public S getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name=" + name +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
