package GroupEx2;

public class Task11 {

     public static class  car{
         double carPrice;
         String color;
        car(double carPrice, String color){
            this.carPrice=carPrice;
            this.color=color;
        }

        double  calculateSalePrice(){
            return carPrice;
        }

    public static class sedan extends car{
int length;


        sedan(double carPrice, String color, int length) {
            super(carPrice, color);
            this.length=length;
        }
        @Override
        public double calculateSalePrice() {
            if (length > 20) {
                return carPrice * 0.95;
            } else {
                return carPrice * 0.90;
            }
        }


    }
    public static class Truck extends car {
        double weight;

        Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }


        @Override
        public double calculateSalePrice() {
            if (weight > 2000) {
                return carPrice * 0.90;
            } else {
                return carPrice * 0.80;
            }
        }


    }
    public static class tester{
        public static void main(String[] args) {
            sedan sedan=new sedan(30000,"white",22);
            Truck truck=new Truck(20000,"blue",4000);

            System.out.println(sedan.calculateSalePrice());
            System.out.println(truck.calculateSalePrice());

        }
    }


}
}
