import java.util.Arrays;

public class HeightChecker {
     public int heightChecker(int[] heights) {
        int n = heights.length;
       int[] expected = new int[heights.length];

    //    copy element of heights into expected array

    for(int i = 0 ; i < n ; i++){
        expected[i] = heights[i];
    }

    Arrays.sort(expected);

    int count = 0 ; 
    for(int i = 0; i<n ; i++){
        if(expected[i] != heights[i])  count ++;
    }
    
    return count;
    }
}
