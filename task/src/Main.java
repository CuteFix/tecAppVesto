import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        float array[] = new float[size]; // Создаём массив int размером в size
        float array2[] = new float[size];
        float array4[] = new float[size];
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        for (int i = 0; i < size; i++) {
            array2[i] = 100; // Заполняем массив элементами, введёнными с клавиатуры
        }
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
        int s2=1;
        System.out.println ("");
        System.out.print ("ai/i with 90 array elements:");
        float array3[] = new float[size];

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
        float sum [] = new float[size];

        for (int i = 0; i < size; i++) {
            int ss = 1;
            for (int j = 0; j < size; j++) {
                array2[j] = 100;
            }
            float sum2 = 0;
            float sum3 = 0;
            int sum4 = 0;
            array2[i] = 90;
            for(int j = 0; j < size; j++) {
                sum3 = array2[j] / ss;
                // суммирование каждого элемента массива
                sum2 = sum2 + sum3;
                ss++;
            }
            sum[i]=sum2;
        }
        int ss = 1;
        float sum4 = 0;
        float sum5 = 0;
        for(int j = 0; j < size; j++) {
            sum5 = array[j] / ss;
            sum4 = sum4 + sum5;
            ss++;
        }

        System.out.println ("");
        System.out.print ("Sum array possible event: ");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + sum[i]); // Выводим на экран, полученный массив сумм
        }
        System.out.println ("");
        System.out.println (" Sum with 90 weighing one time= " + sum4);
        System.out.println ("");
        for(int i = 0; i < size; i++){
                if(sum[i] == sum4) { //Сравнение возможных сумм с нашей текущей взвешенной суммой
                    int pos=i+1;
                    System.out.print("Index element with 90 = " + i + "\n" +
                            "At the position = " + pos);
                    break;
                }else {
                    continue;
                }
        }
        System.out.println();
    }
}
