public class Storage {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();

        product1.name = "Mleko";
        product1.manufacturer = "Mlekowita";
        product1.amountPln = 2.5;

        product2.name = "Czekolada";
        product2.manufacturer = "Wedel";
        product2.amountPln = 2.19;

        System.out.printf("%s %s %.2fzł\n", product1.name, product1.manufacturer, product1.amountPln);
        System.out.printf("%s %s %.2fzł\n", product2.name, product2.manufacturer, product2.amountPln);




    }
}
