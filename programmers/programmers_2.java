//방법1
class Solution1 {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] sum = {0,1,2,3,4,5,6,7,8,9};

        for(int i = 0; i< sum.length; i++){
            for(int j=0; j< numbers.length; j++){
                if(sum[i] == numbers[j]){
                    sum[i] -= numbers[j];
                }
            }
            answer += sum[i];
        }
        return answer;
    }
}



//방법2
class Solution2 {
    public int solution(int[] numbers) {
        int sum = 45; //0~9까지 합.
        
        for(int i = 0; i<numbers.length; i++){
            sum -= numbers[i];
        }
        return sum;
    }
}
