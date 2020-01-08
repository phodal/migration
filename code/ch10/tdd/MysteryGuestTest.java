package tbs;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MysteryGuestTest {
    @Test
    public void testPersistence() throws Exception {
        try (FileOutputStream out = new FileOutputStream("people.bin");) {
            int result = 5;
            out.write(result);
        } catch (FileNotFoundException e) {
            // blabla
        } catch (IOException e) {
            // blabla
        }
    }
}
