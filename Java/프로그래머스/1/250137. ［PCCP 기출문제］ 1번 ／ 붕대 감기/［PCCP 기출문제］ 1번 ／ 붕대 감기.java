class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        int life = health;
        int count = 0;
        int attackIndex = 0;
        for(int i=1; i<=attacks[attacks.length-1][0]; i++) {
            if(i != attacks[attackIndex][0]) {
                life += x;
                count++;
                if(count == t) {
                    life += y;
                    count = 0;
                }
                if(life>health) 
                    life = health;
            }
            else {
                count = 0;
                life -= attacks[attackIndex][1];
                attackIndex++;
                if(life<=0)
                    return -1;
            }
        }
        return life;
    }
}