package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: a */
    public abstract long mo73814a();

    /* renamed from: b */
    public abstract int mo73815b();

    /* renamed from: c */
    public abstract long mo73816c();

    /* renamed from: d */
    public abstract String mo73817d();

    public String toString() {
        long a = mo73814a();
        int b = mo73815b();
        long c = mo73816c();
        String d = mo73817d();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 53);
        sb.append(a);
        sb.append("\t");
        sb.append(b);
        sb.append("\t");
        sb.append(c);
        sb.append(d);
        return sb.toString();
    }
}
