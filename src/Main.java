import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
        File f = new File("D:\\Dev\\Java\\CoreJava\\FileHandling\\MyJava");
        System.out.println(f.isDirectory());
        File list[] = f.listFiles();

        for(File x:list)
        {
            System.out.print(x.getName() +" ");
            System.out.println(x.getParent());
        }
    }
}
