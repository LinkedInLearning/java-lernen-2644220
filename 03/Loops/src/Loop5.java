public class Loop5 {
    public static void main(String[] args) {


        int i=0;
        for (;;) {
            System.out.println(i++);
            if(i > 10) break;
        }
    }
}
