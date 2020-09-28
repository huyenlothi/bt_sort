public class MethodSort {
    public static void selectionSort(int[] list){
        for (int i = 0; i < list.length-1; i++) {
            for (int j = i+1; j < list.length ; j++) {
                int min = list[i];
                if(list[j]<min){
                    list[i] =list[j];
                    list[j] = min;
                }
            }
        }
    }
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int j=i;
            while (j>0 && list[j-1]>list[j]){
                int temp = list[j-1];
                list[j-1]= list[j];
                list[j] = temp;
                j--;
            }
        }
    }
    public static void bubbleSort(int[] list){
        for (int i = 0; i < list.length-1; i++) {
            for (int j = list.length-1; j >i ; j--) {
                if(list[j-1]>list[j]){
                    int temp= list[j-1];
                    list[j-1]= list[j];
                    list[j]= temp;
                }
            }
        }
    }
}
