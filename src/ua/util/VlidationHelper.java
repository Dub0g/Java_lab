package ua.util;

class ValidationHelper {
    static boolean isNonEmpty(String value) {
        return value != null && !value.trim().isEmpty();
    }

    static boolean isPositive(double number) {
        return number > 0;
    }
}
