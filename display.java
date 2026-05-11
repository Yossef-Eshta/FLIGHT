public class display {
    public static void main(String[] args) {
        Flight MyFlight = new Flight();
        MyFlight.addDatafromFile("fly.txt");
        System.out.println("Frequency is: " + MyFlight.genderFrequency('M'));
        MyFlight.printSorted();

    }

}
