public class ContractFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new Contract();
    }
}
