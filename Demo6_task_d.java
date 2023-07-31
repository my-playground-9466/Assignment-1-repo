public class Demo6_task_d {
  public static void main(String[] args) {

    String COLOR_WHITE = "\033[37;1m";
    String COLOR_GRAY = "\033[30;1m";
    String COLOR_GREEN = "\033[32m";
    String COLOR_BLUE = "\033[34;1m";
    String COLOR_MAGENTA = "\033[35;1m";
    String COLOR_YELLOW = "\033[33;1m";

    String RESET = "\033[0;0m";



    System.out.printf("%s+%s+%1$s%2$s+%1$s%2$s+\n",COLOR_YELLOW,"-".repeat(10));
    System.out.printf("|%s%-10s%s|%1$s%-10s%3$s|%1$s%-10s%3$s|\n", COLOR_WHITE, "ITEM", COLOR_YELLOW, "QUANTITY", "PRICE");
    System.out.printf("+%s%s%s+%3$s%2$s%3$s+%1$s%2$s%3$s+\n",COLOR_GREEN,"-".repeat(10),COLOR_YELLOW);
    System.out.printf("|%s%-10s%s|%1$s%s%10s%s%3$s|%1$s%s%s%s%-9.2f%s%3$s|\n", RESET,"Apples", COLOR_YELLOW,COLOR_BLUE, "5", COLOR_GREEN, COLOR_GREEN, "$",
        COLOR_MAGENTA, 0.99, RESET);
    
    System.out.printf("|%s%-10s%s|%s%10s%3$s|%s%s%s%-9.2f%3$s|\n", COLOR_GRAY, "Oranges", COLOR_YELLOW, COLOR_BLUE, "10",
        COLOR_GREEN, "$", COLOR_MAGENTA, 1.49, RESET);
    System.out.printf("+%s%s%s+%3$s%2$s%3$s+%1$s%2$s%3$s+\n",COLOR_GREEN,"-".repeat(10),COLOR_YELLOW);

  }

}
