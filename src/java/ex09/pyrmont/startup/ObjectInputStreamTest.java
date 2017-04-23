package ex09.pyrmont.startup;

import lombok.Data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * author dingjing@youku.com
 * create 2017/4/23 20:48
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.data"));

        User user = new User();
        user.setId(123L);
        user.setName("dj");
        user.setPassword("xxxxx333");

        user.writeObject(oos);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.data"));
        User user1 = new User();
        user1.readeObject(ois);

        System.out.println(user1);



    }
}

@Data
class User {
    private long id;
    private String name;
    private String password;

    public void writeObject(ObjectOutputStream stream) throws IOException {
        stream.writeObject(new Long(this.getId()));
        stream.writeObject(this.getName());
        stream.writeObject(this.getPassword());
    }

    public void readeObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        this.setId(((Long)stream.readObject()).longValue());
        this.setName((String)stream.readObject());
        this.setPassword((String)stream.readObject());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
