package com.ss.android.lark.mm.statistics.hitpoint;

import com.ss.android.lark.mm.p2288b.C45856g;
import com.ss.android.lark.utils.C57859q;

/* renamed from: com.ss.android.lark.mm.statistics.hitpoint.f */
public class C47084f {

    /* renamed from: a */
    public final String f118569a;

    /* renamed from: b */
    public final boolean f118570b;

    /* renamed from: c */
    public final int f118571c;

    /* renamed from: d */
    public final boolean f118572d;

    /* renamed from: e */
    private final String f118573e;

    /* renamed from: a */
    public String mo165407a() {
        return C57859q.m224565a(this.f118573e);
    }

    public String toString() {
        return "MmHitPointContext{conference_id='" + this.f118569a + '\'' + ", is_page_owner=" + this.f118570b + ", token='" + this.f118573e + '\'' + ", object_type=" + this.f118571c + ", is_page_editor=" + this.f118572d + ", uuid=" + C45856g.m181667a() + '}';
    }

    public C47084f(String str, boolean z, String str2, int i, boolean z2) {
        this.f118569a = str;
        this.f118570b = z;
        this.f118573e = str2;
        this.f118571c = i;
        this.f118572d = z2;
    }
}
