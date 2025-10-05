public class flood_fill{
    public static void main(String[] args) {
        int [][] arr={{1,1,0},{1,0,0},{1,0,0}};
        // int[][] arr={{0,0},{0,0}};
        int sr=0;
        int sc=1;
        int [][] k=new Solution().floodFill(arr,sr,sc,2,arr[sr][sc]);
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k.length; j++) {
                System.out.printf("%d ",k[i][j]); 
            }
            System.out.println();
        }
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color,int ini) {
        if(sc<0||sc>image[0].length-1 || sr<0||sr>image.length-1)
        return image;
        
        // final int ini=image[sr][sc];
        System.out.println(ini);
        if(image[sr][sc]==color)
        if(ini==color) return image;
        if(image[sr][sc]==ini){
        image[sr][sc]=color;
            floodFill(image, sr-1, sc, color,ini);
            floodFill(image, sr+1, sc, color,ini);
            floodFill(image, sr, sc-1, color,ini);
            floodFill(image, sr, sc+1, color,ini);
        }
        return image;
    }   
}