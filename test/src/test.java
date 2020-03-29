import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class test {
    public static void test(){
        try {
            File file = new File("c:/Windows/win.ini");
            FileReader isr = new FileReader(file);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
            isr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        test();
    }
}
