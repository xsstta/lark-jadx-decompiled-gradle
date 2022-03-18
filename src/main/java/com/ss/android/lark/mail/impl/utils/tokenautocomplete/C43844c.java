package com.ss.android.lark.mail.impl.utils.tokenautocomplete;

import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.c */
public class C43844c {

    /* renamed from: a */
    public final int f111270a;

    /* renamed from: b */
    public final int f111271b;

    /* renamed from: a */
    public int mo156213a() {
        return this.f111271b - this.f111270a;
    }

    public String toString() {
        return String.format(Locale.US, "[%d..%d]", Integer.valueOf(this.f111270a), Integer.valueOf(this.f111271b));
    }

    /* renamed from: a */
    public boolean mo156214a(int i) {
        if (i < this.f111270a || i > this.f111271b) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C43844c)) {
            return false;
        }
        C43844c cVar = (C43844c) obj;
        if (cVar.f111270a == this.f111270a && cVar.f111271b == this.f111271b) {
            return true;
        }
        return false;
    }

    C43844c(int i, int i2) {
        if (i <= i2) {
            this.f111270a = i;
            this.f111271b = i2;
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Start (%d) cannot be greater than end (%d)", Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
