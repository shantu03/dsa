public class temp3 {
    public static void main(String[] args) {
        new A().f(4);
    }
    
}
class A{
    void f(int k)
    {
        final int p=k;
        System.out.println(p);
        try{
            Thread.sleep(100);
        }catch(Exception e) {}
        if(k<0) return;
        f(--k);
    }
}
