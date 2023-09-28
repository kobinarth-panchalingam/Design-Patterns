public class Main {
    public static void main(String[] args) {
        DocumentFactory letterFactory = new LetterFactory();
        Document letter = letterFactory.createDocument();
        System.out.println(letter.generate());

        DocumentFactory reportFactory = new ReportFactory();
        Document report = reportFactory.createDocument();
        System.out.println(report.generate());

        DocumentFactory contractFactory = new ContractFactory();
        Document contract = contractFactory.createDocument();
        System.out.println(contract.generate());
    }
}