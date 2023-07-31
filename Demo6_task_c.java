public class Demo6_task_c {
    public static void main(String[] args) {

        String COLOR_GREEN = "\033[32;1m";
        String COLOR_PURPLE = "\033[35;1m";
        String COLOR_WHITE = "\033[37;1m";
        String COLOR_YELLOW ="\033[33m";

        String RESET = "\033[0;0m";

        System.out.printf("%s+%s+%s+%s+\n",COLOR_YELLOW,"-".repeat(12),"-".repeat(16),"-".repeat(10));
        System.out.printf("|%s%-12s%s|%1$s%-16s%3$s|%1$s%-10s%3$s|\n", COLOR_WHITE, "CITY", RESET, "STATE", "POPULATION");
        System.out.printf("%s+%s+%s+%s+\n",COLOR_YELLOW,"-".repeat(12),"-".repeat(16),"-".repeat(10));
        System.out.printf("|%s%-12s%s|%1$s%-16s%3$s|%1$s%s%,10d%3$s|\n",RESET,"Los Angeles",COLOR_YELLOW,"California",COLOR_PURPLE,3966936);
        System.out.printf("|%s%s%s%-9s%s|%1$s%2$s%3$s%4$-13s%5$s|%s%,10d%s|\n",COLOR_GREEN,"New",RESET," York",COLOR_YELLOW,COLOR_PURPLE,8336817,RESET);
        System.out.printf("%s+%s+%s+%s+\n",COLOR_YELLOW,"-".repeat(12),"-".repeat(16),"-".repeat(10));

    }

}
