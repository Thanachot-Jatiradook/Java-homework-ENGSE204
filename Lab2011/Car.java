package Lab2011;

public class Car {

    String model ;
    int year ;

    public Car(String mcar, int ycar) {

        this.model = mcar ;
        this.year = ycar ;

    }

    public String getModel() {

        return model ;

    }

    public int getYear() {

        return year ;

    }

    public void setYear(int newYear) {

        this.year = newYear ;
    }
    
}
