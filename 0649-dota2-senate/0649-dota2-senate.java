class Solution {
    public String predictPartyVictory(String senate) {
        int countR=0,countD=0;
        char[] chars=senate.toCharArray();
        for(char c:chars)
        {
            if(c=='R') countR++;
            else countD++;
        }
        
        while(countR!=0&&countD!=0)
        {
            int killR=0,killD=0;
            for(int i=0;i<chars.length;i++)
            {
                char c=chars[i];
                if(c==' ') continue;
                if(c=='R')
                {
                    if(killR>0)
                    {    
                        killR--;
                        chars[i]=' ';
                        countR--;
                    }
                    else
                        killD++;
                }
                else {
                    if(killD>0)
                    {    
                        killD--;
                        chars[i]=' ';
                        countD--;
                    }
                    else
                        killR++;
                }
            }
            
            if(killD>0)
            {    
                for(int i=0;i<chars.length&&killD>0;i++)
                {
                    if(chars[i]=='D') {
                        chars[i]=' ';
                        countD--;
                        killD--;
                    }
                }
            }   
            if(killR>0)
            {    
                for(int i=0;i<chars.length&&killR>0;i++)
                {
                    if(chars[i]=='R') {
                        chars[i]=' ';
                        countR--;
                        killR--;
                    }
                }
            }
        }
        
        if(countR>0) return "Radiant";
        else return "Dire";
    }
}