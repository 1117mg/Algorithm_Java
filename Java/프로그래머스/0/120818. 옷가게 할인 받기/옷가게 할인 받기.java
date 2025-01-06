class Solution {
    public int solution(int price) {
        if (price >= 100000 && price < 300000){
           price *= 0.95;
        } if (price >= 300000 && price < 500000){
            price *= 0.9;
        } if (price >= 500000){
            price *= 0.8;
        } 
        int answer = price;
        return answer;
    }
}