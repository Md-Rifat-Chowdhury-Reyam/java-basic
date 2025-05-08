package ControlFlow.ConditionalStatement.SwitchCase;

public class EnumInSwitch {

    public enum dayData { Sun, Mon, Tue };
    public static void main(String[] args) {

        dayData[] dayName = dayData.values();
        String day;
        int count = 0;

        for (dayData data : dayName )
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
