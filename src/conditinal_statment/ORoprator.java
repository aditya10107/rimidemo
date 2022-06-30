package conditinal_statment;

public class ORoprator {
    public static void main(String[] args) {
        String Brand ="LENOVO";
        int Ram =8;

        if(Ram==8 || Brand =="LENOVO"){
            System.out.println("good commination laptop");
        }
        else {
            System.out.println("NOT good comminatin laptop");}

        Ram=8;
        Brand="dell";

        if(Ram==8 || Brand =="LENOVO"){
            System.out.println("good commination laptop");
        }
        else {
            System.out.println("NOT good comminatin laptop");}

        Ram =2;
        Brand ="LENOVO";

        if(Ram==8 || Brand =="LENOVO"){
            System.out.println("good commination laptop");
        }
        else {
            System.out.println("NOT good comminatin laptop");}

        Ram = 4;
        Brand = "dell";

        if(Ram==8 || Brand =="LENOVO"){
            System.out.println("good commination laptop");
        }
        else {
            System.out.println("NOT good comminatin laptop");}


    }}
