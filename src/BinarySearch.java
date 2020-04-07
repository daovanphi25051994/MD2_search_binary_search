public class BinarySearch {
    public int getIndexBySearchBinary(int[] listNumbers , int number){
        int left = 0;
        int right = listNumbers.length -1;
        while (right >= left){
            int mid = left + (right - left) / 2;
            if (listNumbers[mid] == number){
                return mid;
            }else if (number < listNumbers[mid]){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
