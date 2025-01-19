class Solution {
    int solution(int[] dot) {
        int xBit = dot[0] < 0 ? 1 : 0;
        int yBit = dot[1] < 0 ? 2 : 0;

        return 1 + ((xBit | yBit) ^ (yBit >> 1));
    }
}
