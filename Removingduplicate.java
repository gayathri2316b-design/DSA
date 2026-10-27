import java.util.*;
public class Removingduplicate{
    public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);    
    for(int i=0;i<nums.length-1;i++)
    {
        if(nums[i]==nums[i+1])
        {
            return true;
        }
    }
    return false;
    }
    public static void main(String[] args){
       Removingduplicate ans=new Removingduplicate();
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
       }
       boolean res=ans.containsDuplicate(a);
       System.out.print(res);
       sc.close();
    }
}    