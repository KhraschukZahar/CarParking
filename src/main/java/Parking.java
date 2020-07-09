import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Parking {

    private ArrayList<Car> Cars;

    public Parking(ArrayList<Car> cars) {
        Cars = cars;
    }
    public void PrintInfo()
    {
        System.out.println();
        for (int i=0;i<Cars.size();i++)
        {
            System.out.print(i+1+".");
            Cars.get(i).ShowInfo();
            System.out.println();
        }

    }
    public void FindCarByYear(String year){
        for (Car car:Cars) {
            if(car.getYear()==year){
                car.ShowInfo();
            }
        }
        System.out.println("");
    }
    public void RemoveCar(int index){
        this.Cars.remove(index);
    }
    public void FindCarByMake(String make){
        for (Car car:Cars) {
            if(car.getMake().toLowerCase()==make.toLowerCase()){
                car.ShowInfo();
            }
        }
    }
    public void AddNewCar() throws IOException {
        BufferedReader buffered=new BufferedReader(new InputStreamReader(System.in));//Integer.parseInt(buffered.readLine());
        System.out.print("Make:");
        String Make=buffered.readLine();
        System.out.print("Model:");
        String Model=buffered.readLine();
        System.out.print("Year:");
        String Year=buffered.readLine();
        System.out.print("Year:");
        String Color=buffered.readLine();
        System.out.print("Number:");
        int Number=Integer.parseInt(buffered.readLine());
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd ");
        Date date=new Date();
        Car car=new Car(Make,Model,Year,Color,Number,System.currentTimeMillis());
        Cars.add(car);
    }

}