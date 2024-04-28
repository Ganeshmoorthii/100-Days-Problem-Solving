class Solution
{
    int thirdLargest(int a[], int n)
    {
        Arrays.sort(a);
        return a[n-3];
    }
}
