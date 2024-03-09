import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ViDu_Files {
    public static void main(String[] args) {
        // Copy
        Path source = Paths.get("D:\\Laptrinhmang\\b\\ABCD");
        Path newdir = Paths.get("D:\\Laptrinhmang\\a");
        try {
            Files.copy(source, newdir.resolve(source.getFileName()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
