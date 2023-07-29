public class Demo3 {
    public static void main(String[] args) {
        
        int first = 123;
        int second = 456;
        int third = 7890;

        String COLOR = "\033[30;1m";
        String RESET = "\033[0;0m";

        System.out.printf("%s(%d)%s%d-%d\n",COLOR,first,RESET,second,third);
    }
    
}
