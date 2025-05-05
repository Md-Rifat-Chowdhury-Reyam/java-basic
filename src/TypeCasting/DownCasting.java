package TypeCasting;

public class DownCasting {
    public static void main(String[] args) {

        vehicle v = new car();
        car.carShow(v);

    }
}

class vehicle
{
    void name()
    {
        System.out.println("I am vehicle");
    }

}

class car extends  vehicle
{
    static void carShow(vehicle name)
    {
       // method of down casting 1. upcasting in main method()  then 2. down casting in child class
        // Upcasting
        //Parent1 p = new Child();

        // Downcasting Explicitly
        //Child c = (Child)p;

        if (name instanceof car)
        {
            car c = (car) name; //DownCasting

            System.out.println("i am from child and perform down casting");

        }
    }

}
