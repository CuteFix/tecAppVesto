import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        int array2[] = new int[size];
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        for (int i = 0; i < size; i++) {
            array2[i] = 100; // Заполняем массив элементами, введёнными с клавиатуры
        }
        int array5[] = new int[size];
        System.out.print ("With 90 array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив

        }
        System.out.println("");
        System.out.print ("Only 100 array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array2[i]); // Выводим на экран, полученный массив
        }
        System.out.println ("");
        int s=1;
        System.out.println ("");
        int array4[] = new int[size];
        int s2=1;

        System.out.print ("ai/i with 90 array elements:");
        int array3[] = new int[size];

        for (int i = 0; i < size; i++) {

            array3[i] = array[i] / s;
            if(array3[i] != array4[i]){

            }
                s++;
            System.out.print (" " + array3[i]);
        }
        System.out.println ("");
        System.out.print ("ai/i only 100 array elements:");
        for (int i = 0; i < size; i++) {

            array4[i] = array2[i] / s2;
            s2++;
            System.out.print (" " + array4[i]);
        }

        System.out.println ("");
        System.out.println ("");
        for(int i = 0; i < size; i++){
                if(array3[i] == array4[i]) {
                   continue;
                }else {
                    int pos=i+1;
                    System.out.print("Index element with 90 = " + i + "\n" +
                            "At the position = " + pos);
                    break;
                }
        }
        System.out.println();
    }
}
