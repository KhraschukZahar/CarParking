import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
        int choise = 0;
        ArrayList<Car> cars = new ArrayList<Car>();
        //    String make, String model, String year, String color, int number, long date
        cars.add( new Car("Mercedes-Benz" ,"S class","2006", "black",123,System.currentTimeMillis()));
        cars.add( new Car("BMW" ,"X5","2012", "black",234,System.currentTimeMillis()));
        cars.add( new Car("Audi" ,"A6","2010", "white",345,System.currentTimeMillis()));
        Parking parking = new Parking(cars);

        do {
            System.out.println("1)Show all cars. \n2)Add new car. \n3)Delete car. " +
                    "\n4)Find car by year. \n5)Find car by make. \n6)Exit.");
            System.out.print("Choise: ");
            choise = Integer.parseInt(buffered.readLine());
            switch(choise){
                case 1:{
                    parking.PrintInfo();

                    break;
                }
                case 2:{
                    parking.AddNewCar();
                    break;
                }
                case 3:{
                    System.out.print("Enter car index: ");
                    int index = Integer.parseInt(buffered.readLine());

                    parking.RemoveCar(index-1);
                    break;
                }
                case 4:{
                    System.out.print("Enter year: ");
                    String year = buffered.readLine();

                    parking.FindCarByYear(year);
                    break;
                }
                case 5:{
                    System.out.print("Enter make: ");
                    String make = buffered.readLine();

                    parking.FindCarByMake(make);
                    break;
                }
            }

        }while(choise != 6);
    }
}