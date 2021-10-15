package baseline;

public class WebsiteTemplate {

    private String siteName;
    private String siteAuthor;

    public void WebsiteTemplate(String siteName, String siteAuthor, Boolean createJs, Boolean createCss){
        this.siteName = siteName;
        this.siteAuthor = siteAuthor;
        createIndex();
        if(createJs) createJsFolder();
        if(createCss) createCssFolder();


    }

    private void createCssFolder() {
        //create new directory location
    }

    private void createJsFolder() {
        //create new directory location
    }

    private void createIndex() {
        //create folder with website name
        //create html index file
    }
}
