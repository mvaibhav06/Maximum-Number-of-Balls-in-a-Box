import java.util.HashMap;

public class MaxBalls {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> temp = new HashMap<>();

        for(int i=lowLimit; i<=highLimit; i++){
            int myNum = i;
            int sum = 0;
            while(myNum > 0){
                sum += myNum%10;
                myNum /= 10;
            }

            if(temp.containsKey(sum)){
                temp.put(sum, temp.get(sum)+1);
            }else{
                temp.put(sum,1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int key : temp.keySet()){
            if(temp.get(key) > max){
                max = temp.get(key);
            }
        }
        return max;
    }
}
