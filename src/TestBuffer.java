import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestBuffer {
    public static void main(String[] args)throws Exception{
//        ByteBuffer buffer=ByteBuffer.allocate(20);
//        FileOutputStream fileOutputStream=new FileOutputStream("/Users/chenliangzhou/Desktop/g");
//        FileChannel channel=fileOutputStream.getChannel();
//        ByteBuffer buffer1=ByteBuffer.wrap("hello".getBytes());
//        channel.write(buffer1);
//        channel.close();

        FileInputStream fis=new FileInputStream("/Users/chenliangzhou/Desktop/g");
        FileChannel channel=fis.getChannel();
        ByteBuffer buffer=ByteBuffer.allocate(10);
        System.out.println(channel.read(buffer));
        byte[] bs=buffer.array();
        for(int i=0;i<bs.length;i++){
            System.out.println(bs[i]);
        }
    }
}
