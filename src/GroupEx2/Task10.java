package GroupEx2;

public  class Task10 {
    public static abstract class Marks{
        abstract double getPercentage();
    }
    static class A extends Marks{
        private double s1;
        private double s2;
        private double s3;

        A(double s1, double s2, double s3){
            this.s1=s1;
            this.s2=s2;
            this.s3=s3;
        }
        @Override
        double getPercentage() {

            double result= (s1+s2+s3)/3;
            return result;
            }
        }

    static class B extends Marks{
        private double s1;
        private double s2;
        private double s3;
        private double s4;
        B(double s1, double s2, double s3,double s4){

            this.s1=s1;
            this.s2=s2;
            this.s3=s3;
            this.s4=s4;
        }

        @Override
        double getPercentage() {
            double result= (s1+s2+s3+s4)/4;
            return result;
        }
    }

     public static class test{

         public static void main(String[] args) {
             Task10 task = new Task10();
            A StudentA= new A(7.8,8.9,4.5);
            B StudentB= new B(4.9,9.0,7.3,6.0);

            System.out.println("Student A's Percentage: " +StudentA.getPercentage());
             System.out.println("Student B's Percentage: "+ StudentB.getPercentage());

        }
    }


}
