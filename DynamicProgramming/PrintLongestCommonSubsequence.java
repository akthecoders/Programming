public class PrintLongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "abcdefghl";
        String str2 = "abczertl";
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[0].length; j++) {
                if(i == 0 || j == 0) {dp[i][j] = 0;}
            }
        }

        worker(str1, str2, dp);
        StringBuilder sb = new StringBuilder();
        int i = str1.length();
        int j = str2.length();
        while( i > 0 && j > 0) {
            if(str1.charAt(i-1) == str2.charAt(j-1)) {
                sb.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else {
                if(dp[i][j-1] > dp[i-1][j]) {
                    j--;
                }
                else {
                    i--;
                }
            }
        }
        System.out.println(sb.reverse().toString());
    }

    public static void worker(String str1, String str2, int[][] dp) {
        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[0].length; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = 1 + str1.charAt(j-1);
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
    }


}