class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        String answer = "fail";
        for (String[] dbS : db){
            String idS = dbS[0];
            String pwS = dbS[1];
            if(idS.equals(id)){
                answer = "wrong pw";
                if(pwS.equals(pw)){
                    answer = "login";
                }
             }
        }
        return answer;
    }
}
