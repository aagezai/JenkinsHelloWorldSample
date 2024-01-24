package org.example;

public class SampleClass {
    private String name;
    private String ssn;
    private Integer age;

    public SampleClass(String name, String ssn, Integer age) {
        this.name = name;
        this.ssn = ssn;
        this.age = age;
    }

    public SampleClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SampleClass{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", age=" + age +
                '}';
    }
}
