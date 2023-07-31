public class Demo6_task_d {
  public static void main(String[] args) {

    String COLOR_WHITE = "\033[37;1m";
    String COLOR_GRAY = "\033[30;1m";
    String COLOR_BLUE = "\033[32;1m";
    String COLOR_GREEN = "\033[33;1m";
    String COLOR_MAGENTA = "\033[34;1m";

    String RESET = "\033[0;0m";

    final String LINE = "%1$s+%2$s+\n";

    System.out.printf("%s+%s+%1$s%2$s+%1$s%2$s+\n",COLOR_BLUE,"-".repeat(10));
    System.out.printf("|%s%-10s%s|%1$s%-10s%3$s|%1$s%-10s%3$s|\n", COLOR_WHITE, "ITEM", RESET, "QUANTITY", "PRICE");
    System.out.println("+----------+----------+----------+");
    System.out.printf("|%-10s|%s%10s%s|%s%s%s%-9.2f%s|\n", "Apples", COLOR_BLUE, "5", RESET, COLOR_GREEN, "$",
        COLOR_MAGENTA, 0.99, RESET);
    System.out.println("+----------+----------+----------+");
    System.out.printf("|%s%-10s%s|%s%10s%s|%s%s%s%-9.2f%s|\n", COLOR_GRAY, "Oranges", RESET, COLOR_BLUE, "10", RESET,
        COLOR_GREEN, "$", COLOR_MAGENTA, 1.49, RESET);
    System.out.println("+----------+----------+----------+");

  }

}
