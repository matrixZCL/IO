import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectStream {
    public static void main(String[] args)throws Exception{
        Student s1=new Student("tom",12,12.0);
        Student s2=new Student("jin",22,33.0);
        FileOutputStream outputStream=new FileOutputStream("/Users/chenliangzhou/Desktop/d");
        ObjectOutputStream out=new ObjectOutputStream(outputStream);
        out.writeObject(s1);
        out.writeObject(s2);
        out.close();

        FileInputStream fis=new FileInputStream("/Users/chenliangzhou/Desktop/d");
        ObjectInputStream in=new ObjectInputStream(fis);

        Object o1=in.readObject();
        Object o2=in.readObject();
        System.out.println(o1.toString());
        System.out.println(o2.toString());
    }
}
