public class Cars {
    private String carBrand;
    private String carModel;
    private float selling_price;
    private int production_year;

    public int currentYear = 2024;

    //calculate how old
    public int howOld(int production_year){
        return currentYear - this.production_year;
    }

    //print car details
    public void carDetails(){
        System.out.println(production_year + " " + carBrand + " " + carModel +" sells for " + selling_price + " euro.");
    }

    public Cars(String userCarBrand, String userCarModel, float userSelling_Price, int userProduction_year){
        this.carBrand = userCarBrand;
        this.carModel = userCarModel;
        this.selling_price = userSelling_Price;
        this.production_year = userProduction_year;
    }

    //getters
    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public float getSelling_price() {
        return selling_price;
    }

    public int getProduction_year() {
        return currentYear;
    }

    //setters


    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setProduction_year(int production_year) {
        this.production_year = production_year;
    }

    public void setSelling_price(float selling_price) {
        this.selling_price = selling_price;
    }
}
