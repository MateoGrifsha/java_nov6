public class Main{
    public static void main(String[] args){
        Cars car1 = new Cars("Opel", "Meriva", 2500, 2005);
        Cars car2 = new Cars("Toyota", "Corolla", 4000, 2007);

        // how old is the car
        System.out.println("Car 1 is " + car1.howOld(car1.getProduction_year()) + " years old.");
        System.out.println("Car 2 is " + car2.howOld(car2.getProduction_year()) + " years old.");

        //car details
        car1.carDetails();
        car2.carDetails();

        //setters testing
        car1.setCarBrand("Hyundai");
        car1.setCarModel("I20");
        car1.setProduction_year(2015);
        car1.setSelling_price(8000);

        //check if setters are correct
        car1.carDetails();
    }
}