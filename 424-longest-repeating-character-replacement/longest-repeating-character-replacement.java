class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> mem = new HashMap<>();

        int l = 0;

        int longest = 0;
        int maxV = 0;

        for(int r = 0; r < s.length(); r++){
            Character curr = s.charAt(r);
            int count = mem.getOrDefault(curr,0);
            count++;
            mem.put(curr, count);

            int wSize = r-l+1;

            maxV = Math.max(count,maxV);

            while((wSize - maxV) > k ){
                int leftCount = mem.get(s.charAt(l));
                mem.put(s.charAt(l), leftCount-1);
                l++;
                wSize = r-l+1;
            }

            longest = Math.max(longest,wSize);

            
        }

        return longest;
        
    }
}