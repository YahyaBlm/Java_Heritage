public abstract class Vehicle {
    private String brand;
     private int kilometers;
 
     public Vehicle(String brand, int kilometers) {
         this.brand = brand;
         this.kilometers = kilometers;
 
     }
 
     public String getBrand() {
         return brand;
     }
 
     public String setBrand(String brand) {
         return this.brand = brand;
     }
 
     public int getKilometers() {
         return kilometers;
     }
 
     public int setKilometers(int kilometers) {
         return this.kilometers = kilometers;
     }
 
     public abstract String doStuff();
 }