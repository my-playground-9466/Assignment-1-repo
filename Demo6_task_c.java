public class Demo6_task_c {
    public static void main(String[] args) {

        String COLOR_GREEN = "\033[32;1m";
        String COLOR_MAGENTA = "\033[34;1m";
        String COLOR_WHITE = "\033[37;1m";

        String RESET = "\033[0;0m";

        System.out.println("+------------+----------------+----------+");
        System.out.printf("|%s%-12s%s|%1$s%-16s%3$s|%1$s%-10s%3$s|\n", COLOR_WHITE, "CITY", RESET, "STATE", "POPULATION");
        System.out.println("+------------+----------------+----------+");
        System.out.printf("|%-12s|%-16s|%s%,10d%s|\n","Los Angeles","California",COLOR_MAGENTA,3966936,RESET);
        System.out.printf("|%s%s%s%-9s|%1$s%2$s%3$s%4$-13s|%s%,10d%s|\n",COLOR_GREEN,"New",RESET," York",COLOR_MAGENTA,8336817,RESET);
        System.out.println("+------------+----------------+----------+");

    }

}
