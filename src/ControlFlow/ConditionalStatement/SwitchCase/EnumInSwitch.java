package ControlFlow.ConditionalStatement.SwitchCase;

public class EnumInSwitch {

    //enum
    public enum dayData { Sun, Mon, Tue }; //so here dayData act as a data type

    public static void main(String[] args) {

        dayData[] dayVal = dayData.values();
        String day;
        int count = 0;

        for (dayData data : dayVal )
        {
            switch (data)
            {
                case Sun:
                    day = "Saturday";
                    count++;
                    break;

                case Mon:
                    day = "Sunday";
                    count ++;
                    break;

                case Tue:
                    day = "Monday";
                    count ++;
                    break;

                default:
                    day = "Friday";
                    count ++;
                    break;
            }
            System.out.println("day " + count + " : " + day);
        }

    }
}
