problem:



soln:
```
class Solution{
    static boolean isp(int a[], int n, int k,int m){
        int sum=0;int p=0;
        for(int u:a) {
            sum+=u;
            if(sum>=m){p++;sum=0;}  }
        return p>=k+1;
        
        
    }
int maxSweetness(int [] sweetness, int N, int K) {
    // Write your code here.
    int min=Integer.MAX_VALUE;
    int sum=0;
    for(int a:sweetness) {sum+=a;
    min=Math.min(a,min);}
    
    int ans=0;
    while(min<=sum){
        
        int mid= min+(sum-min)/2;
        if(isp(sweetness,N,K,mid)==true){
            
            ans=mid;
            min=mid+1;
        }
        else sum=mid-1;    }
return ans;
    
}
}```