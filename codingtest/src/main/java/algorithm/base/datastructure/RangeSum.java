package algorithm.base.datastructure;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 수 N개가 주어졌을때 i번째 수에서 j번째 수까지의 합을 구하는 프로그램 작성
 * 
 * @param
 * 1번째 줄의 수의 개수 N( 1<= N <=100,000)
 * 합을 구해야 하는 횟수 M( 1<= M <= 100,000)
 * 2번째 줄에는 N개의 수 , 각 수는 1000 보다 작거나 같은 자연수
 * 3번째 줄에는 M개의 합을 구해야 하는 구간 i,j가 주어진다.
 * @return:
 * 총 M개의 줄에 입력으로 주어진 i번째 수에서 j번째 수까지의 합을 출력한다.
 * @sampleParam:
 * 5 3 
 * 5 4 3 2 1
 * 1 3 
 * 2 4 
 * 5 5
 */
public class RangeSum {
    

    public static void main(String[] args) {
        System.out.println("RangeSum");
        RangeSum rangeSum = new RangeSum();
        rangeSum.calculate( rangeSum.loadInput());
        
    }
    
    public String[] loadInput() {
        
        BufferedReader bufferedReader = new BufferedReader( 
            new InputStreamReader(System.in));
            return bufferedReader.lines().toArray(String[]::new);
    }

    public List<String> calculate(String[] args){

        int readRow =0;
        StringTokenizer stk = new StringTokenizer(args[readRow++]);
        int suNum = Integer.parseInt(stk.nextToken());
        Integer.parseInt(stk.nextToken());

        long[] rangeArray = new long[suNum+1];

        stk = new StringTokenizer(args[readRow++]);
        for ( int i=1 ;i <=suNum;i++ ){
            int readValue =Integer.parseInt(stk.nextToken());
            rangeArray[i] = readValue +  rangeArray[i-1];
        }
        ArrayList<String> ret = new ArrayList<>();
        while ( readRow <suNum){
            stk = new StringTokenizer(args[readRow++]);
            int start = Integer.parseInt(stk.nextToken());
            int end   = Integer.parseInt(stk.nextToken());
            long value =rangeArray[end] -rangeArray[start-1];
            ret.add(String.valueOf(value));
        }
        return ret;        
    }
}
