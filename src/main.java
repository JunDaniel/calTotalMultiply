public class main {
    public static void main(String[] args) {
        CommonMethod cmth = new CommonMethod();
        int calSumWithMult = cmth.calSumWithMult(5);
        System.out.println("Result of S(n) = 1 + 1*2 + 1*2*3 + ... + 1*2*3*n (n > 0)");
        System.out.println("calSumWithMult = " + calSumWithMult);
        System.out.println("==============================");
        int calManyTotalNumb = cmth.calSumManyTotal(6);
        System.out.println("Result of S(n) = 1 + (1+2) + (1+2+3) ... (n > 0)");
        System.out.println("calManyTotalNumb = " + calManyTotalNumb);
    }
}
