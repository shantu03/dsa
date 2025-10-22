
class longest_substring_without_repeating_character {

    public static void main(String[] args) {
        System.out.println(solu(""));


    }
   public static int solu(String s)
    {
        
        if(s.isEmpty()) System.out.println("yes");
        int max =1;
        String str="";
        int start=0;

        for (int i = 0; i < s.length(); i++) {

            if(str.contains(s.charAt(i)+""))
            {
                max=Math.max(max, i-start);
                i=++start;
            }
            else str+=s.charAt(i);
            
        }
        return max;
       }
    }
