public class ReportFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new Report();
    }
}
