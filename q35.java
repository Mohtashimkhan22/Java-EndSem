// Define the abstract class TemperatureData
abstract class TemperatureData {
    double temp;
    void setTempData(double temp) {
        this.temp = temp;
    }
    abstract void changeTemp();
}

class Fahrenheit extends TemperatureData {
    double ctemp;
    @Override
    void changeTemp() {
        ctemp = 5.0 / 9.0 * (temp - 32);
        System.out.println("Temperature in Celsius: " + ctemp);
    }
}

class Celsius extends TemperatureData {
    double ftemp;
    @Override
    void changeTemp() {
        ftemp = (9.0 / 5.0) * temp + 32;
        System.out.println("Temperature in Fahrenheit: " + ftemp);
    }
}
public class q35 {
    public static void main(String[] args) {
        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.setTempData(98.6); 
        fahrenheit.changeTemp();     
        
        Celsius celsius = new Celsius();
        celsius.setTempData(37);      
        celsius.changeTemp();  
    }
}
