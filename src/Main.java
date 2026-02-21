import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/serialization/myAnimal.txt");
        Animal sourceAnimal = new Animal("pink", 125656756L, "Panther");

        // 1. Серіалізація
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(sourceAnimal);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Десеріалізація
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Animal deserializedAnimal = (Animal)objectInputStream.readObject();
            System.out.println();
            System.out.println("Об'єкт, десеріалізований з файлу: ");
            System.out.println(deserializedAnimal);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}