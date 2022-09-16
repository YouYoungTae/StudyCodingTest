package algorithm.base.datastructure;

import java.io.*;
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
        for (String e : args){
            System.out.println("RangeSumInput-"+e );    
        }
        System.out.println("RangeSum");
    }
    
    public String loadInput() {

        BufferedReader bufferedReader = new BufferedReader( 
            new InputStreamReader(System.in));
        try {
            return  bufferedReader.readLine();
        } catch (IOException ie ){
            return null;
        }
    }
    
    

}
