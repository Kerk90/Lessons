/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template0;

/**
 *
 * @author user
 */
public class WebsiteRunner {

    public static void main(String[] args) {
        WelcomePage welcomePage = new WelcomePage();
        NewsPage newsPage = new NewsPage();
        welcomePage.showPage();
        System.out.println("\n================\n");
        newsPage.showPage();
    }
}
