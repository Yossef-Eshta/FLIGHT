import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Flight{
    private ArrayList <Passenger> Passenger;

    public Flight (){
        Passenger= new ArrayList<>();
    }

    public void addDatafromFile(String filename){
        String passportno ,lastname;
        char gender;
        try{
            File f = new File (filename);
            Scanner sc = new Scanner (f);
            while (sc.hasNext()) {
                passportno = sc.next();
                lastname = sc.next();
                gender = sc.next().charAt(0);
                Passenger x = new Passenger(passportno, lastname, gender);
                if (!(Passenger.contains(x)))
                    Passenger.add(x);
                else
                    System.out.println("Already exist");
            }

            sc.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
    public int genderFrequency(char gender ){
        int counter =0;
        for (Passenger x : Passenger) {
            if (x.getGender() == (gender))
                counter++;
        }
        return counter;
    }
    public void printSorted(){
        Collections.sort(Passenger);
        for (Passenger x: Passenger ){
            System.out.println(x);
        }

    }

}



