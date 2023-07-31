public class Demo4 {
    public static void main(String[] args) {
        
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute= 59;
        int second =59;

        String color1 = "\033[30;1m";
        String color2 = "\033[31;1m";
        String color3 = "\033[32;1m";
        String color4 = "\033[33;1m";
        String color5 = "\033[34;1m";
        String color6 = "\033[35;1m";

        String RESET = "\033[0;0m";
        

        System.out.printf("%s%d%s/%s%d%3$s/%s%d %s%d%3$s:%s%d%3$s:%s%d\n",color1,month,RESET,color2,day,color3,year,color4,hour,color5,minute,color6,second);

    }
    
}
