package Encapsulation_1;


    public class Main {
        public static void main(String[]args){

            Car car=new Car("Toyota","Camry",2017);


            car.setModel("Rav4");
            System.out.println(car.getMake()+","+car.getModel());



        }
}
