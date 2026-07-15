public class SolidRight {

    public static void main(String[] args) {
        
        int n = 5 ;
        
        for(int row =1;row<=n;row++){
            //for each row -> variable column 
         for(int col = 1;col<=row;col++){
            System.out.print("* ");
         }
         System.out.println();
        }
    }
    
}
