package coder;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        List<Post> posts = new ArrayList<>();
        Document doc = Jsoup.connect("https://4pda.to/").get();
        System.out.println("Подключение к главной странице");
        Elements postTitleElements = doc.getElementsByAttributeValue("itemprop", "Url");
        for (Element postTitleElement : postTitleElements) {
            String detailsLink = postTitleElement.attr("href");
            Post post = new Post();
            post.setDetailsLink(detailsLink);
            post.setTitle(postTitleElement.attr("title"));
            System.out.println("Подключение к деталям о посте" + detailsLink);
            Document postDetailsDoc = Jsoup.connect(detailsLink).get();
            try {
                Element authorElement = postDetailsDoc.getElementsByClass("name").first().child(0);
                post.setAuthor(authorElement.text());
                post.setAthorDetailsLink(authorElement.attr("href"));
            } catch (NullPointerException e) {
                post.setAuthor("Автор не определился");
                post.setAthorDetailsLink("Ссылка не найдена");
            }
            post.setDateOfCreate(postDetailsDoc.getElementsByClass("date").first().text());
            posts.add(post);

        }
        posts.forEach(System.out::println);
    }
}
