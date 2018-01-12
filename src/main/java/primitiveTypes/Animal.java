package primitiveTypes;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

/**
 * Created by Vladimir Glinskikh on 28.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Animal {
    public static Animal[] deserializeAnimalArray(byte[] data) {
        int numberOfAnimals;
        Animal[] animals;

        ByteArrayInputStream dataInputStream = new ByteArrayInputStream(data);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(dataInputStream);

            numberOfAnimals = objectInputStream.readInt();
            animals = new Animal[numberOfAnimals];

            for (int i = 0; i < numberOfAnimals; i++) {
                Animal animal = (Animal) objectInputStream.readObject();
                animals[i] = animal;
            }

        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }

        return animals;
    }
}

