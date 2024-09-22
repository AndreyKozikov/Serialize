import java.io.*;

public class IOPerson<T> {

    public static <T> void personWrite(T person, String file) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object personRead(String file) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
