package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class WebsiteTemplate {

    private String siteName;
    private String siteAuthor;
    private Path websiteRoot;

    public WebsiteTemplate(String siteName, String siteAuthor, Boolean createJs, Boolean createCss) throws IOException {
        this.siteName = siteName;
        this.siteAuthor = siteAuthor;
        //create folder with website name
        websiteRoot = Paths.get(String.format("/data/website/%s",siteName));
        Files.createDirectory(websiteRoot);
        createIndex();
        if(createJs) createJsFolder();
        if(createCss) createCssFolder();


    }

    private void createCssFolder() throws IOException {
        //create new directory location
        String cssPath = String.format("%s/css/",websiteRoot);
        Path path = Paths.get(cssPath);
        Files.createDirectory(path);
        System.out.printf("created %s%n",path);
    }

    private void createJsFolder() throws IOException {
        //create new directory location
        String jsPath = String.format("%s/js/", websiteRoot);
        Path path = Paths.get(jsPath);
        Files.createDirectory(path);
        System.out.printf("created %s%n", path);

    }

    private void createIndex() {
        //create folder with website name
        File outputFile = new File(websiteRoot + "/index.html");
        //write html template file
        try (Formatter output = new Formatter(outputFile)){
            output.format("<html>%n<head>%n<meta author=%s>%n<title>%n%s%n" +
                    "</title>%n</head>%n" + "<body>%n</body>%n</html>",siteAuthor,siteName);

        } catch (SecurityException | FileNotFoundException | FormatterClosedException e){
            System.err.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
