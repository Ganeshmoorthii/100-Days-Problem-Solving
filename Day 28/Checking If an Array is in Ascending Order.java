class Example{
public static void main(String args[]){
int[] n=new int[]{-1,22,33};

System.out.print(isAscending(n));

}
public static Boolean isAscending(int[] arr){
int temp=Integer.MIN_VALUE;
for(int val:arr){
if(temp > val) return false;
temp=val;
}
return true;
}

}
