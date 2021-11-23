public class Task3 {
    /**
     * Дан одномерный массив целых чисел.
     * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами,
     * только положительными и только нули.
     * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
     * Возвращает функция эти три массива в виде одного двумерного.
     * Пример:
     * [-4, -18]
     * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
     * [1, 9, 3]
     */
    public static void main(String[] args) {
        int[] arr1 = {5, -2, 4, 10, -22, 35, -14, 45};

        public static void arrayResult(int[] arr){
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                pos++;
            } else {
                neg++;
            }
        }
        int[] arrpos = new int[pos];
        int[] arrneg = new int[neg];
        int countpos = 0;
        int countneg = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                arrpos[countpos] = arr1[i];
                countpos++;
            } else {
                arrneg[countneg] = arr1[i];
                countneg++;
            }
        }
        for (int i = 0; i < arrneg.length; i++) {
            System.out.println(arrneg[i]);
        }
        for (int i = 0; i < arrpos.length; i++) {
            System.out.println(arrpos[i]);
        }

    }
    }
}