package p11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            Person person = new Person("Alex", 33, 178, true);
            objectOutputStream.writeObject(person);

        }catch (Exception exception){
            exception.printStackTrace();
        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.dat"))){
            Person person = (Person) objectInputStream.readObject();
            System.out.printf("Name %s \t Age: %d \n", person.getName(), person.getAge());
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

}


