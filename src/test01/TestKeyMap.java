package test01;

import java.util.ArrayList;

/**
 * Created by dagai on 2017/9/17.
 */
public class TestKeyMap {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("TestKeyMap.main");
        int num = 10;
        System.out.println("num = " + num);
        ArrayList<String> strings = new ArrayList<>();
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            int anInt = ints[i];
            System.out.println("anInt = " + anInt);
        }

    }
}
class TestClass{
    private int age;
    private String name;
    private char sex;

    @Override
    public String toString() {
        return "TestClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public TestClass(int age) {

        this.age = age;
    }
}
