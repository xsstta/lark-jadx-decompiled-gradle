package com.ss.android.appcenter.engine.vlayout;

import android.os.Build;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.ss.android.appcenter.engine.vlayout.h */
public final class C28288h<T extends Comparable<? super T>> {

    /* renamed from: a */
    private final T f71038a;

    /* renamed from: b */
    private final T f71039b;

    /* renamed from: a */
    public T mo100809a() {
        return this.f71038a;
    }

    /* renamed from: b */
    public T mo100812b() {
        return this.f71039b;
    }

    public String toString() {
        return String.format("[%s, %s]", this.f71038a, this.f71039b);
    }

    public int hashCode() {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(this.f71038a, this.f71039b);
        }
        return Arrays.hashCode(new Object[]{this.f71038a, this.f71039b});
    }

    /* renamed from: a */
    public boolean mo100810a(C28288h<T> hVar) {
        boolean z;
        boolean z2;
        if (hVar != null) {
            if (hVar.f71038a.compareTo(this.f71038a) >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (hVar.f71039b.compareTo(this.f71039b) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || !z2) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("value must not be null");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28288h)) {
            return false;
        }
        C28288h hVar = (C28288h) obj;
        if (!this.f71038a.equals(hVar.f71038a) || !this.f71039b.equals(hVar.f71039b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo100811a(T t) {
        boolean z;
        boolean z2;
        if (t != null) {
            if (t.compareTo(this.f71038a) >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (t.compareTo(this.f71039b) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || !z2) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("value must not be null");
    }

    /* renamed from: a */
    public static <T extends Comparable<? super T>> C28288h<T> m103770a(T t, T t2) {
        return new C28288h<>(t, t2);
    }

    public C28288h(T t, T t2) {
        if (t == null) {
            throw new IllegalArgumentException("lower must not be null");
        } else if (t2 != null) {
            this.f71038a = t;
            this.f71039b = t2;
            if (t.compareTo(t2) > 0) {
                throw new IllegalArgumentException("lower must be less than or equal to upper");
            }
        } else {
            throw new IllegalArgumentException("upper must not be null");
        }
    }
}
