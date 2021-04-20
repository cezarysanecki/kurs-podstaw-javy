public class SwitchClass {

    public static void main(String[] args) {
        String activity = "Drawing cartoons";
        int hours = howManyHoursWillTake(activity);

        if (hours == 0) {
            System.out.println("No activities today");
        } else {
            System.out.println(activity + " will take " + hours + " hours.");
        }
    }

    public static void ifMethod(int param) {
        if (param == 1) {
            System.out.println("If - One");
        } else if (param == 2) {
            System.out.println("If - Two");
        } else if (param == 3) {
            System.out.println("If - Three");
        } else {
            System.out.println("If - Uknown param");
        }
    }

    public static void switchMethod(int param) {
        switch (param) {
            case 1:
                System.out.println("Switch - One");
                break;
            case 2:
                System.out.println("Switch - Two");
                break;
            case 3:
                System.out.println("Switch - Three");
                break;
            default:
                System.out.println("Switch - Uknown param");
        }
    }

    public static int howManyHoursWillTake(String activity) {
        switch (activity) {
            case "Reading book":
                return 2;
            case "Riding bicycle":
                return 5;
            case "Playing game":
                return 3;
            default:
                return 0;
        }
    }
}
