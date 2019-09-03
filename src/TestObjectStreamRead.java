import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectStreamRead {
    public static void main(String[] arfg)throws Exception{
        FileInputStream fis=new FileInputStream("/Users/chenliangzhou/Desktop/d");
        ObjectInputStream in=new ObjectInputStream(fis);
        try {
            while(true){
                Object o=in.readObject();
                System.out.println(o);
            }
        } catch (EOFException e) {
            System.out.println("duwanle");
        }
        in.close();
    }
}
