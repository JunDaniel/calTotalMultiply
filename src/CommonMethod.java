public class CommonMethod {
    int calSumWithMult (int n) {
        int totalMul = 0, multManyNumb = 1;
        for (int i=1; i<n; i++) {
             multManyNumb = multManyNumb*i;
             totalMul = multManyNumb + totalMul;
        }
        return totalMul;
    }
    int calSumManyTotal (int n) {
        int result = 0, sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum = sum + i;
            result = result + sum;
        }

        return result;
    }
}



