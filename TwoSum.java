import java.util.*;
public class TwoSum {
     public int[] TwoSum(int[] a, int t)
    {
        int ans[]=new int[2];
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==t){
                   ans[0]=i;
                   ans[1]=j;
                return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        TwoSum ans=new TwoSum();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();

        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       int result[]=ans.TwoSum(a,target); 
       System.out.println(result[0]+" "+result[1]);
    }
}