package JavaCF.lec25;

public class student implements Comparable <student> {
    public int age;
    public String name;
    public int weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }



    public student(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }


    @Override
    public int compareTo(student that){
        return this.age - that.age;
    }
}
