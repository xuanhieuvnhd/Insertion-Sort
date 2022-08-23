public class InsertionSortTest {
    public static void main(String[] args) {
        int[] list = { 6, 7, 0, 8};

        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Mang du lieu dau vao: ");
        insertionSort.display(list);
        System.out.println("-----------------------------");
        insertionSort.insertionSort(list);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        insertionSort.display(list);
    }
}
