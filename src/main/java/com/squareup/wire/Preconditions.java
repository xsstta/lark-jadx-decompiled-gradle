package com.squareup.wire;

import java.util.Objects;

/* access modifiers changed from: package-private */
public final class Preconditions {
    private Preconditions() {
    }

    static void checkNotNull(Object obj, String str) {
        Objects.requireNonNull(obj, str);
    }
}
