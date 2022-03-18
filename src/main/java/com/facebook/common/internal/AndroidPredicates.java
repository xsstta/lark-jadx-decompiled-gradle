package com.facebook.common.internal;

public class AndroidPredicates {
    private AndroidPredicates() {
    }

    public static <T> Predicate<T> False() {
        return new Predicate<T>() {
            /* class com.facebook.common.internal.AndroidPredicates.C210192 */

            @Override // com.facebook.common.internal.Predicate
            public boolean apply(T t) {
                return false;
            }
        };
    }

    public static <T> Predicate<T> True() {
        return new Predicate<T>() {
            /* class com.facebook.common.internal.AndroidPredicates.C210181 */

            @Override // com.facebook.common.internal.Predicate
            public boolean apply(T t) {
                return true;
            }
        };
    }
}
