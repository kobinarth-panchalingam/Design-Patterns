public class DocumentFactory {
    public Document createDocument(String docType){
        if(docType.equalsIgnoreCase("LETTER")){
            return new Letter();
        } else if (docType.equalsIgnoreCase("REPORT")){
            return new Report();
        } else if (docType.equalsIgnoreCase("CONTRACT")){
            return new Contract();
        } else {
            return null;
        }
    }
}
