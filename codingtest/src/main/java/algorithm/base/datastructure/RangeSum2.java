package algorithm.base.datastructure;
import java.util.*;
public class RangeSum2 {
    

    public List<Long> calculate(String r){

        String[] arr= r.split("\n");
        int readLine =0;
        StringTokenizer stk = new StringTokenizer(arr[readLine++]);

        int squareCnt = Integer.parseInt(stk.nextToken());
        int quCnt = Integer.parseInt(stk.nextToken());

        int arrCnt= squareCnt*squareCnt;
        long[] dataArray = new long[arrCnt+1];
        int arrLoc =0;
        while ( readLine <= squareCnt)
        {
            stk = new StringTokenizer(arr[readLine++]);  
            while ( stk.hasMoreTokens()){
               int readData= Integer.parseInt( stk.nextToken());
               dataArray[++arrLoc] =dataArray[arrLoc-1]+ readData;
            }
        }
        ArrayList<Long> ret =new ArrayList<>();
        for (int i=0; i<quCnt;i++){
            stk = new StringTokenizer(arr[readLine++]);
            int row1 = Integer.parseInt(stk.nextToken());
            int col1 = Integer.parseInt(stk.nextToken());

            int row2 = Integer.parseInt(stk.nextToken());
            int col2 = Integer.parseInt(stk.nextToken());

            int dataIndex1 =(row1-1)* squareCnt +col1;
            int dataIndex2 =(row2-1)* squareCnt +col2;
            
            ret.add(dataArray[dataIndex2]-dataArray[dataIndex1-1]);
        }


        return ret;
    }
}
