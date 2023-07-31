public class Demo6_task_b {
    public static void main(String[] args) {
        

        String name1 = "Alice";
        String name2 = "Bob";

        int age1 = 24;
        int age2 = 30;

        String COLOR_BLUE = "\033[34;1m";
        String COLOR_PURPLE = "\033[35;1m";
        String COLOR_ORANGE = "\033[33m";

        String RESET = "\033[0;0m";

        System.out.printf("%s+%s+%s+\n",COLOR_ORANGE,"-".repeat(10),"-".repeat(5));
        System.out.printf("|%s%-10s%s|%s%1$s%5s%3$s|\n",COLOR_BLUE,"NAME",COLOR_ORANGE,RESET,"AGE");
        System.out.printf("%s+%s+%s+\n",COLOR_ORANGE,"-".repeat(10),"-".repeat(5));
        System.out.printf("|%s%-10s%s|%s%5s%3$s|\n|%1$s%-10s%3$s|%4$s%5s%3$s|\n",RESET,name1,COLOR_ORANGE,COLOR_PURPLE,age1,name2,age2);
        System.out.printf("%s+%s+%s+\n",COLOR_ORANGE,"-".repeat(10),"-".repeat(5));


    }
    
}
