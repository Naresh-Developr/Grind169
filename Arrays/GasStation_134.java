public class GasStation_134 {

    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int totGas = 0;
            int totCost = 0;
    
            for(int i=0;i<gas.length;i++){
                totGas += gas[i];
                totCost += cost[i];
            }
    
            if(totCost>totGas){
                return -1;
            }
    
            int start = 0;
            int curGas = 0;
            for(int i=0;i<gas.length;i++){
                curGas += gas[i] - cost[i];
                if(curGas<0){
                    curGas = 0;
                    start = i+1;
                }
            }
    
            return start;
    
            
        }
    }
    
}
