class Solution {
    public int secondHighest(String s) {
        int largest = -1;
        int second = -1;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) ){
                int val= c - '0';
                if(val>largest){
                    second= largest;
                    largest= val;
                }
                else if (val>second && val<largest){
                    second= val;
                }
            }
        }
        return second;
    }
}