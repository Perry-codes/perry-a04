package baseline;

import java.io.IOException;
import java.util.Scanner;

public class Solution43 {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //prompt user for site name
        System.out.println("What is the name of the website?");
        //read name
        String siteName = sc.nextLine();
        //prompt user for author
        System.out.println("Site Author:");
        String author = sc.nextLine();
        //ask if js folder
        System.out.println("Do you want a folder for JavaScript?");
        String js = sc.nextLine().trim().toLowerCase();
        Boolean createJs = (js.equals("y") || js.equals("yes") || js.equals("true"));
        //ask if css folder
        System.out.println("Do you want a folder for CSS?");
        String css = sc.nextLine().trim().toLowerCase();
        Boolean createCss = (css.equals("y") || css.equals("yes") || css.equals("true"));
        //create instance to WebsiteTemplate
        new WebsiteTemplate(siteName,author,createJs,createCss);

    }
}
