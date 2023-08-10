public class CommonMethod {
    int calSum (int n) {
        int totalMul = 0, multManyNumb = 1;
        for (int i=1; i<n; i++) {
             multManyNumb = multManyNumb*i;
             totalMul = multManyNumb + totalMul;
        }
        return totalMul;
    }
}



