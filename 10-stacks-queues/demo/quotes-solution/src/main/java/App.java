/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public static void main(String[] args) {
        QuoteGetter getter = new WebQuoteGetter();
        // QuoteGetter getter = new FilesystemQuoteGetter("resources/quotes.json");
        System.out.println(getter.getQuote());
    }
}
