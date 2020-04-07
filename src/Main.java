public class Main {
    public static void main(String[] args) {
        int[] listNumbers = {1, 2, 5, 7, 9, 12, 34, 76, 87, 1212, 34343};
        BinarySearch binarySearch = new BinarySearch();
        int number = 34343;
        int index = binarySearch.getIndexBySearchBinary(listNumbers, number);
        System.out.println(index);
    }
}
