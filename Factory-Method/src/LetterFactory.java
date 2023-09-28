public class LetterFactory extends  DocumentFactory{
    @Override
    public Document createDocument() {
        return new Letter();
    }
}
