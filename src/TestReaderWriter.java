import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TestReaderWriter {
    public static void main(String[] args)throws Exception{
        FileWriter fe=new FileWriter("/Users/chenliangzhou/Desktop/f");
        PrintWriter out =new PrintWriter(fe);
        out.println("aaaa");
        out.println("bbbb");
        out.close();

        FileReader fr=new FileReader("/Users/chenliangzhou/Desktop/f");
        BufferedReader in=new BufferedReader(fr);
        while(true){
            String str=in.readLine();
            if(str==null)break;
            System.out.println(str);
        }
        in.close();

    }
}
