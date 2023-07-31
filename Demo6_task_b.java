public class Demo6_task_b {
    public static void main(String[] args) {
        

        String name1 = "Alice";
        String name2 = "Bob";

        int age1 = 24;
        int age2 = 30;

        String COLOR_BLUE = "\033[34;1m";
        String COLOR_MAGENTA = "\033[36;1m";
        String COLOR_ORANGE = "\033[33;0m";

        String RESET = "\033[0;0m";

        System.out.printf("%s+%s+%s+\n",COLOR_ORANGE,"-".repeat(10),"-".repeat(5));
        System.out.printf("|%s%-10s%s|%1$s%5s%3$s|\n",COLOR_BLUE,"NAME",RESET,"AGE");
        System.out.println("+----------+-----+");
        System.out.printf("|%-10s|%s%5s%s|\n|%-10s|%2$s%5s%4$s|\n",name1,COLOR_MAGENTA,age1,RESET,name2,age2);
        System.out.println("+----------+-----+");


    }
    
}
