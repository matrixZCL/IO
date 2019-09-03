import java.io.*;

public class TestDataStream {
    public static void main(String[] args)throws Exception{
        FileOutputStream fos=new FileOutputStream("/Users/chenliangzhou/Desktop/b");
        DataOutputStream out =new DataOutputStream(fos);//过滤流

//        out.write(65);
        long a=1231212321231231231L;
        out.writeLong(a);
        out.close();

        FileInputStream in=new FileInputStream("/Users/chenliangzhou/Desktop/b");
        DataInputStream input=new DataInputStream(in);
        Long b=input.readLong();
        in.close();

        System.out.println(b);
    }
}
