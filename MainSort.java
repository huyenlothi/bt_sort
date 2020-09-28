import java.util.Scanner;

public class MainSort {
    public static void main(String[] args) {
        int[] list = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("moi ban nhap mang so nguyen");
        for (int i = 0; i < list.length; i++) {
            System.out.println("moi ban nhap phan tu thu " + (i+1));
            list[i] = input.nextInt();
        }
        System.out.println("day chua xep");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] +",");
        }
//        MethodSort.selectionSort(list);
//        MethodSort.bubbleSort(list);
        MethodSort.insertionSort(list);
        System.out.println("day sau khi xep");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+",");
        }
    }
}
