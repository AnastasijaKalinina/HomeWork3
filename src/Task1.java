public class Task1 {
    /*
     *Дан одномерный массив целых чисел.
     *Написать функцию, удаляющую из него все отрицательные элементы
     * (удалить - значит создать новый массив с только положительными элементами).
     *После удаления - умножить каждый элемент массива на его длину.
     *Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
     */
    public static void main(String[] args) {
        int[] values = {2, 5, -2, 6, 4, 8};
        negativeNumbers(values);
        additionNumbers(values);
    }

    public static void negativeNumbers(int[] values) {
        int index = 2;
        if (values.length - 1 - index >= 0)
            System.arraycopy(values, index + 1, values, index, values.length - 1 - index);
        values[values.length - 1] = 0;
        for (int i : values){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void additionNumbers (int[] values) {
        int i = 0;
        while (i >= 0) {
    values[i] = values[i] * values.length;
    System.out.print(values[i] + " ");
            i++;
        }
    }
    }

