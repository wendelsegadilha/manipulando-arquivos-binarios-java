import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class App {

    public static void main(String[] args) {

        String pathIn = "C:\\Users\\wendel\\IdeaProjects\\manipulando-arquivos-binarios\\src\\java-logo.png";
        String pathOut = "C:\\Users\\wendel\\IdeaProjects\\manipulando-arquivos-binarios\\src\\java-logo-2.jpg";

        int read = 0;
        byte[] length = new byte[1024];

        try(InputStream in = new FileInputStream(pathIn); OutputStream out = new FileOutputStream(pathOut)) {

            while((read = in.read(length)) != -1){
                out.write(length, 0, read);
            }
            System.out.println("Processo finalizado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
