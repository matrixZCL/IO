import java.io.FileOutputStream;
import java.io.OutputStream;

public class TestFileOutputStream{
    public static void main(String[] args)throws Exception{
        OutputStream out =new FileOutputStream("/Users/chenliangzhou/Desktop/a",true);
//        out.write(65);
//        out.close();

        String str="asdasd";
        byte[] b=str.getBytes();
        out.write(b,2,3);
        out.close();
    }
}
