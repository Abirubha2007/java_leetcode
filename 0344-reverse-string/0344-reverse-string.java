class Solution {
    public void reverseString(char[] a) {
    int l=0;
    int r=a.length-1;
    while(l<r){
        char temp=a[l];
        a[l]=a[r];
        a[r]=temp;
        l++;
        r--;
    }
}
}