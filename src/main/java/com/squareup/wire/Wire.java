package com.squareup.wire;

import javax.annotation.Nullable;

public final class Wire {
    public static <T> T get(@Nullable T t, T t2) {
        return t != null ? t : t2;
    }

    private Wire() {
    }
}
