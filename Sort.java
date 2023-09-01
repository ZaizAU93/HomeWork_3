public class Sort {


    int[] array = new int[10];
    int max_1;
    int max_2;

    public void sorted() {
        int i = 0;
        int[] array = new int[10];
        for (i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 10);
            System.out.print(array[i] + " ");
        }



        for (i = 0; i < array.length; i++) {
            if (max_1 < array[i] ) {
                max_2 = max_1;
                max_1 = array[i];
            } else if(array[i]>max_2){
                max_2 = array[i];
            }

        }


    }
}
