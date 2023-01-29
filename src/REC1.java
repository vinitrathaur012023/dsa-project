public class REC1 {
    public static void printrec(int n) {
if(n==0) {
    return;
}
        System.out.println(n);
        printrec(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        printrec(n);
    }
}
