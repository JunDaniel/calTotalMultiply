public class main {
    public static void main(String[] args) {
        CommonMethod cmth = new CommonMethod();
        int result = cmth.calSum(5);
        System.out.println("Result of S(n) = 1 + 1*2 + 1*2*3 + ... + 1*2*3*n (n > 0)");
        System.out.println("result = " + result);
    }
}
