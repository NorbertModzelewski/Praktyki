public class jd2137 {
    public static void main(String[] args) {

        dzialania();
    }
    private static void dzialania(){
        double units = 5000;
        double product1;
        double product2;
        double product1PerDay, product2PerDay, product1PerYear, product2PerYear;
        product1PerDay =(units  (0.5 *(10^(-7))));
        product2PerDay =(units  (2.5 *(10^(-7))));
        product1PerYear = product1PerDay*350;
        product2PerYear = product2PerDay*350;
        System.out.println(product1PerYear);
        System.out.println(product2PerYear);
    }

}
