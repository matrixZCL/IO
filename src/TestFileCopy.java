import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestFileCopy {
    public static void main(String[] args)throws Exception{
        fileCopy1("/Users/chenliangzhou/Desktop/a","/Users/chenliangzhou/Desktop/b");
    }

    static void fileCopy1(String src,String dest)throws Exception{
        FileInputStream in=new FileInputStream(src);
        FileOutputStream out=new FileOutputStream(dest);
        while(true){
            int a=in.read();
            if(a==-1)break;
            out.write(a);
        }
        in.close();
        out.close();
    }

    static void fileCopy2(String src,String dest)throws Exception{
        long t1=System.nanoTime();
        FileInputStream in=new FileInputStream(src);
        FileOutputStream out=new FileOutputStream(dest);
        byte bs[]=new byte[1024];
        while(true){
            int len=in.read();
            if(len==-1)break;
            out.write(bs,0,len);
        }
        in.close();
        out.close();
    }

    static void fileCopy3(String src,String dest)throws Exception{
        FileInputStream fileInputStream =new FileInputStream(src);
        BufferedInputStream in=new BufferedInputStream(fileInputStream);
        FileOutputStream fileOutputStream=new FileOutputStream(dest);
        BufferedOutputStream out=new BufferedOutputStream(fileOutputStream);
        byte[] bs=new byte[1024];
        while(true){
            int len=in.read(bs);
            if(len==-1)break;
            out.write(bs,0,len);
        }
        in.close();
        out.close();
    }

}
