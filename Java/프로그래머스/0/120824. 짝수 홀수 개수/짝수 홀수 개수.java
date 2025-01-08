class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        int o_count = 0;
        int e_count = 0;
        
        for (int i = 0; i < num_list.length; i++){
            if (num_list[i] % 2 == 0){
                e_count++;
            } else{
                o_count++;
            }
        }
        
        answer[0] = e_count;
        answer[1] = o_count;
        return answer;
    }
}