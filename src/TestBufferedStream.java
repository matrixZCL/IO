import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class TestBufferedStream {
    public static void main(String[] args)throws Exception{
        FileOutputStream out=new FileOutputStream("/Users/chenliangzhou/Desktop/c");
        BufferedOutputStream bufout=new BufferedOutputStream(out);
        bufout.write(65);
//        out.close();//关闭缓冲区
        out.flush();//清空缓冲区
    }
}
