package Array;

import java.lang.reflect.Array;

public class MyArray<T> {

    @SuppressWarnings("All")
    T[] resizeArray(T[] array, int newLength, Class<T> mClass) {
        //Assumptions
        if (array == null || array.length == 0 || newLength <= array.length)
            throw new RuntimeException("Wrong");

        //https://www.techiedelight.com/creating-generic-array-java/
        T[] newArray = (T[]) Array.newInstance(mClass, newLength);
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    @SuppressWarnings("All")
    T getAt(T[] array, int index) {
        if (index < 0)
            return (T) Integer.valueOf(-1);

        return array[index];
    }

}