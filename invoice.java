public class invoice {
    private String partNumber;
    int numberOfParts;
    String description;
    double price;
    void setPartNumber(String ptNum) {this.partNumber = ptNum; }
    String getPartNumber() { return this.partNumber;}
    void print(){
        system.out.println("INVOICE DETAILS");
        system.out.println();
        system.out.println("Part Number: " +this.partNumber);
        system.out.println("Number of parts: " +this.numberOfParts);
        system.out.println("Description: " +this.description);
        system.out.println("Price: " +this.price);
    }
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.setPartNumber("PT-100");
        invoice.description = 35;
        invoice.price = 7000.00;
        invoice.prin();
    }
}