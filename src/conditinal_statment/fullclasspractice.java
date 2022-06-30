package conditinal_statment;

public class fullclasspractice {
    public static void main(String[] args) {
        System.out.println("Developer aditya sharma");
        System.out.println("this is information of area peoples");

        String name = "Aditya sharma";
        int age =21;
        double salary = 18000.00;

        System.out.println("Name :- " + name + " || Age :- " + age + " || Salary :- " + salary );
        String city = "agra";

        if (age>18 & city =="agra"){
            System.out.println("Person eligible for voting");
        }
        else {
            System.out.println("Person NOT eligible for voting");}

        String week ="monday";

        switch (week) {

            case "monday":
                System.out.println("week is monday");
                break;
            case "tuesday":
                System.out.println("week is tuesday");
                break;
            case "wednesday":
                System.out.println("week is wednesday");
                break;
            case "thursday":
                System.out.println("week is thursday");
                break;
            case "friday":
                System.out.println("week is friday");
                break;
            case "saturday":
                System.out.println("week is saturday");
                break;
            case "sunday":
                System.out.println("week is sunday");
                break;
            default :
                System.out.println("match not found");

        }
    }}
