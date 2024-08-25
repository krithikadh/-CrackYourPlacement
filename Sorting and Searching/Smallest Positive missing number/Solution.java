class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        int shift = segregate(arr, size);
        return findMissingPositive(arr, shift, size);
    }
    
    static int segregate(int arr[], int size){
        int j = 0;
        for (int i = 0; i < size; i++){
            if (arr[i] <= 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return j;
    }
    
    static int findMissingPositive(int arr[], int shift, int size){
        for (int i = shift; i < size; i++){
            int num = Math.abs(arr[i]);
            int index = num - 1 + shift;
            if (index < size && arr[index] > 0){
                arr[index] = -arr[index];
            }
        }
        for (int i = shift; i < size; i++){
            if (arr[i] > 0){
                return i - shift + 1;
            }
        }
        return size - shift + 1;
    }
}
