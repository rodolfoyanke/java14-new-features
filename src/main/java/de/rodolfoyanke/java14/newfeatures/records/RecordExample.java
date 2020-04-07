package de.rodolfoyanke.java14.newfeatures.records;

public class RecordExample {
    public static void main(String[] args) {
        //java 11 + lombok
        var product = new Product("id", "name");
        //java 14
        var productRecord = new ProductRecord("id", "name");

        //java 11 + lombok
        System.out.println(product.getId());
        //java 14
        System.out.println(productRecord.id());
    }
}