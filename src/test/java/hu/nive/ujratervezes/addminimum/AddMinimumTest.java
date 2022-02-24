package hu.nive.ujratervezes.addminimum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*

                | `numbers`             | `n`  | visszatérési érték (vagy exception) |
                | :-------------------- | :--: | :---------------------------------- |
                | `[-2, -1, 0, 1, 2]`   | `3`  | `[-2, -1, -2, 1, 2]`                |
                | `[3, 1, 5, 3, 4]`     | `1`  | `[4, 2, 6, 4, 5]`                   |
                | `[2, 12]`             | `2`  | `[2, 14]`                           |
                | `[]`                  | `1`  | `[]`                                |
                | `null`                | `1`  | `IllegalArgumentException`          |
                | `[2, 12]`             | `0`  | `IllegalArgumentException`          |
                | `[2, 12]`             | `-1` | `IllegalArgumentException`          |
*/

class AddMinimumTest {

    @Test
    void testAddMinimum_validInput() {
        Assertions.assertArrayEquals(new int[]{-2, -1, -2, 1, 2},new AddMinimum().addMinimum(new int[]{-2, -1, 0, 1, 2},3));
    }

    @Test
    void testAddMinimum_validInput1() {
        Assertions.assertArrayEquals(new int[]{4, 2, 6, 4, 5},new AddMinimum().addMinimum(new int[]{3, 1, 5, 3, 4},1));
    }

    @Test
    void testAddMinimum_validInput2() {
        Assertions.assertArrayEquals(new int[]{2, 14},new AddMinimum().addMinimum(new int[]{2, 12},2));
    }

    @Test
    void testAddMinimum_emptyArray() {
        Assertions.assertArrayEquals(new int[]{},new AddMinimum().addMinimum(new int[]{},1));
    }

    @Test
    void testAddMinimum_throwsIllegalArgumentExceptionForNullParameter() {
        AddMinimum addMinimum = new AddMinimum();
        Assertions.assertThrows(IllegalArgumentException.class,()-> addMinimum.addMinimum(null,1));
    }

    @Test
    void testAddMinimum_throwsIllegalArgumentExceptionForZero() {
        AddMinimum addMinimum = new AddMinimum();
        Assertions.assertThrows(IllegalArgumentException.class,()-> addMinimum.addMinimum(new int[]{2, 12},0));
    }

    @Test
    void testAddMinimum_throwsIllegalArgumentExceptionForNegative() {
        AddMinimum addMinimum = new AddMinimum();
        Assertions.assertThrows(IllegalArgumentException.class,()-> addMinimum.addMinimum(new int[]{2, 12},-1));
    }

}