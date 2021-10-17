package baseline;

import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

class WebsiteTemplateTest {

    @BeforeAll
    public static void setUp() throws IOException {
        new WebsiteTemplate("testSite","Perry, Maggie",true,true);
    }

    @Test
    void indexCreated(){
        assertTrue(Files.exists(Path.of("/data/testSite/index.html")));
    }

    @Test
    void jsFolderCreated(){
        assertTrue(Files.isDirectory(Path.of("/data/testSite/js/")));
    }

    @Test
    void cssFolderCreated(){
        assertTrue(Files.isDirectory(Path.of("/data/testSite/css/")));
    }

    @AfterAll
    public static void teardown(){
        File dir = new File("/data/testSite");
        for (File file:dir.listFiles()) {
            file.delete();
        }
        dir.delete();
    }

   /* learn proper create directory
    @Test
    void createFolder() throws IOException {
        Path path = Paths.get("data/createFolder");
        Files.createDirectory(path);
        assertTrue(Files.isDirectory(path));
    }*/
}

