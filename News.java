import java.util.ArrayList;

public class News extends ReadFile {

    public static void main(String[] args) {

        News news = new News(01);

        String str_1 = readFile("News/Text.txt");
        String str_2 = readFile("News/Text2.txt");
        String str_3 = readFile("News/Text3.txt");
        String str_4 = readFile("News/Text4.txt");

        Article article_1 = new Article("Hindi BO: Kalki Sets 2024 Record", "Abdul Rehman Khan", str_1);
        Article article_2 = new Article("Haryana assembly polls: First session of BJP meeting begins in Panchkula", "Jane Smith", str_2);
        Article article_3 = new Article("India vs South Africa – ICC T20 World Cup 2024 final", "Harsha bogle", str_3);
        Article article_4 = new Article(" SpaceX Successfully Launches First Commercial Moon Landing Mission", "Jhon Lane", str_4);

        news.add(article_1);
        news.add(article_2);
        news.add(article_3);
        news.add(article_4);

        news.printAll();
    }

    private int idOfNews;
    private ArrayList<Article> article_arr;

    public News(int idOfNews) {
        super();
        this.idOfNews = idOfNews;
        this.article_arr = new ArrayList<>();
    }

    public void add(Article a) {
        this.article_arr.add(a);
    }

    public void printAll() {
        for (Article article : article_arr) {
            System.out.println(article);
            System.out.println();
        }
    }

}
