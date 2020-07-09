import java.util.Date;

public class Car {
    private String Make;
    private String Model;
    private String Year;
    private String Color;
    private int Number;
    private long  Date;

    public void setModel(String model) {
        Model = model;
    }

    public String getModel() {
        return Model;
    }

    public Car(String make, String model, String year, String color, int number, long date) {
        Make = make;
        Year = year;
        Color = color;
        Number = number;
        Model=model;
        this.Date = date;
    }
    public void ShowInfo()
    {
        System.out.println("Make: "+Make+ "\nModel: "+Model+"\nYear: "
                +Year+"\nColor: "+Color+"\nNumber: "+Number+"Date: "+Date);
    }
    public void setMake(String make) {
        Make = make;
    }

    public void setYear(String year) {
        Year = year;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public void setDate(long date) {
        this.Date = date;
    }

    public String getMake() {
        return Make;
    }

    public String getYear() {
        return Year;
    }

    public String getColor() {
        return Color;
    }

    public int getNumber() {
        return Number;
    }

    public long getDate() {
        return Date;
    }
}