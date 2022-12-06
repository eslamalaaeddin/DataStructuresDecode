package Array;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Float[] array = {1.0f, 2.0f, 3.0f};
        MyArray<Float> myArray = new MyArray<Float>();
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));

        array = myArray.resizeArray(array, 5, Float.class);

        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
        //---------------------------------------------

        System.out.println(myArray.getAt(array, 0));
        System.out.println(myArray.getAt(array, 2));
        System.out.println(myArray.getAt(array, -1));

    }

}
