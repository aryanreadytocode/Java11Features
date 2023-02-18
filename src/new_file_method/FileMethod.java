package new_file_method;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileMethod {

    public static void main(String[] args) throws IOException {
        try {
            Path tempFilePath = Files.writeString(
                    Path.of(File.createTempFile("tempFile", ".temp").toURI()), "Welcome to Patna", Charset.defaultCharset(), StandardOpenOption.WRITE);
            String fileContent = Files.readString(tempFilePath);
            System.out.println(fileContent);
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
