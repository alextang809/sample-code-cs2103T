import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesClassDemo {

    public static void main(String[] args) throws IOException{
        Files.copy(Paths.get("data/fruits.txt"), Paths.get("temp/fruits2.txt"));
        Files.delete(Paths.get("temp/fruits2.txt"));
    }

}

