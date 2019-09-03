import java.io.FileInputStream;
import java.io.InputStream;

public class TestFileInputStream {
    public static void main(String[] args) throws Exception{
        InputStream in=new FileInputStream("/Users/chenliangzhou/Desktop/a");
//        while(true){
//            int a=in.read();
//            if(a==-1)break;
//            System.out.println(a);
//        }

        byte[] bs=new byte[3];
        while(true){
            int len=in.read(bs);
            if(len==-1)break;
            for(int i=0;i<bs.length;i++){
                System.out.println(bs[i]);
            }

            System.out.println();
        }
    }
}
