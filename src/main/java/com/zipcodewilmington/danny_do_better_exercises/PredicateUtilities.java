package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Modified by kristofer 3/4/2024.
 */
public class PredicateUtilities {
    /**
     * @param x
     * @param y
     * @return true if `x` is greater than `y`
     */
    public Boolean isGreaterThan(int x, int y) {
        boolean answer = x > y;
        return answer;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than `y`
     */
    public Boolean isLessThan(int x, int y) {
        boolean answer = x < y;
        return answer;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is greater than or equal to `y`
     */
    public Boolean isGreaterThanOrEqualTo(int x, int y) {
        boolean answer = x == y;
        return answer;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than or equal to `y`
     */
    public Boolean isLessThanOrEqualTo(int x, int y) {
        boolean answer = x <= y;
        return answer;
    }


    /**
     * @return true
     */
    public Boolean returnTrue() {
        boolean answer = true;
        return answer;
    }

    /**
     * @return false
     */
    public Boolean returnFalse() {
        boolean answer = false;
        return answer;
    }

}