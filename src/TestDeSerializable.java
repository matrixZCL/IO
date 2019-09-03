import javafx.beans.binding.ObjectExpression;

import java.io.*;

public class TestDeSerializable {
    public static void main(String[] args)throws Exception{
//        FileOutputStream fos=new FileOutputStream("/Users/chenliangzhou/Desktop/e");
//        ObjectOutputStream out=new ObjectOutputStream(fos);
//        A a=new A();
//        out.writeObject(a);
//        out.close();

        FileInputStream fis=new FileInputStream("/Users/chenliangzhou/Desktop/e");//反序列化不通过构造方法
        ObjectInputStream in=new ObjectInputStream(fis);
        Object o=in.readObject();
        System.out.println(o);
        System.out.println(o instanceof A);
    }
}


class A implements Serializable{
    public A(){
        System.out.println("A()");
    }
}
