

public class Car extends Main
{
    private String make, model, vinNumber,licensePN, mileage;
    private int year;
    
    public Car(String make, String model, String vinNumber, String licensePN, String mileage, int year){
        this.make = make;
        this.model = model;
        this.vinNumber = vinNumber;
        this.licensePN = licensePN;
        this.mileage = mileage;
        this.year = year;
    }
    
    //Setters
    public void setMake(String make){
        this.make = make;
    }
    
    public void setModel(String model){
        this.model= model;
    }
    
    public void setVinNumber(String vinNumber){
        this.vinNumber = vinNumber;
    }
    
    public void setLicensePN(String licensePN){
        this.licensePN = licensePN;
    }
    
    public void setMileage(String mileage){
        this.mileage = mileage;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    //Getters
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getVinNumber(){
        return vinNumber;
    }
    
    public String getLicensePN(){
        return licensePN;
    }
    
    public String getMileage(){
        return mileage;
    }
    
    public int getYear(){
        return year;
    }

    //Overriding the toString Method
    public String toString(){
        return "abc";
    }
    
}
