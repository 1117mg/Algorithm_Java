import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int len_s = second(video_len);
        int current_s = second(pos);
        int op_start_s = second(op_start);
        int op_end_s = second(op_end);

        if(current_s >= op_start_s && current_s <= op_end_s) {
            current_s = op_end_s;
        }
        
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];

            if (command.equals("prev")) {
                current_s = Math.max(current_s - 10, 0);
            }

            if (command.equals("next")) {
                current_s = Math.min(current_s + 10, len_s);
            }

            if (current_s >= op_start_s && current_s <= op_end_s) {
                current_s = op_end_s;
            }
        }


        int minute = current_s / 60;
        int second = current_s % 60;

        String result = String.format("%02d:%02d", minute, second);
        return result;

    }
    
    public static int second(String time) {
        String[] timeParts = time.split(":");
        int minutes = Integer.parseInt(timeParts[0]);
        int seconds = Integer.parseInt(timeParts[1]);
        return minutes * 60 + seconds;
    }
}