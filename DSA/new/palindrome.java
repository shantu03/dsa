public class palindrome {
        public static void main(String[] args) {
            String str="ab_a";
           str= str.replaceAll("\\W","").toLowerCase().replaceAll("_","");

            System.out.println(str.length());
            System.out.println(str);
        }
}
