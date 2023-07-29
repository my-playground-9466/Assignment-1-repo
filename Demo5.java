public class Demo5 {
    public static void main(String[] args) {

        int first = 978;
        int second = 3;
        int third = 16;
        int fourth = 1484100;

        String color1="\033[30;1m";
        String color2="\033[31;1m";
        String color3="\033[32;1m";
        String color4="\033[33;1m";

        String RESET ="\033[0;0m";

        System.out.printf("%s%d%s-%s%d%3$s-%s%d%3$s-%s%d\n",color1,first,RESET,color2,second,color3,third,color4,fourth);

        
    }
    
}
