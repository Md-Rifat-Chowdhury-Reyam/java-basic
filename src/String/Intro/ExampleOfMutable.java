package String.Intro;

public class ExampleOfMutable {
    public static void main(String[] args) {

        //Immutable
        String name = "Rifat";
        name.concat("chowdhury");

        System.out.println(name); // try to append together or mutable, but it's not mutable


        //Mutable
        String nameM = "Rifat";
        nameM = nameM.concat(" Chowdhury");
        System.out.println(nameM);
    }
}
