package hello;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Encoda {

	
	public String Encoda64() {
		return null;
	}
	
	private byte[] convertFileToByteArray(String filePath) {

        Path path = Paths.get(filePath);

        byte[] codedFile = null;

        try {
            codedFile = Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return codedFile;
    }

    private boolean saveFileFromByteArray(String filePath, byte[] decodedByteArray) {

        boolean success = false;

        Path path = Paths.get(filePath);

        try {
            Files.write(path, decodedByteArray);
            success = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return success;
    }
}
