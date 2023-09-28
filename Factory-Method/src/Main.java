public class Main {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new DocumentFactory();
        Document document = documentFactory.createDocument("Report");
        System.out.println(document.generate());
    }
}