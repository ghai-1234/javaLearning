package Arrays;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

    int age;
    String name;

    Student(int age,String name) {
        this.age = age;
        this.name= name;
    }


    public static void main(String[] args) {

        Student s1 = new Student(10,"ghai");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("serial.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s1);
            System.out.println("serialization completed");

        }
        catch (Exception e) {
            System.out.println("error");
        }

    }
}
