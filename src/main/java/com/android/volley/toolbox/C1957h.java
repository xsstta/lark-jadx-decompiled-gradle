package com.android.volley.toolbox;

import com.android.volley.C1930e;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.android.volley.toolbox.h */
public final class C1957h {

    /* renamed from: a */
    private final int f6660a;

    /* renamed from: b */
    private final List<C1930e> f6661b;

    /* renamed from: c */
    private final int f6662c;

    /* renamed from: d */
    private final InputStream f6663d;

    /* renamed from: a */
    public final int mo9845a() {
        return this.f6660a;
    }

    /* renamed from: c */
    public final int mo9847c() {
        return this.f6662c;
    }

    /* renamed from: d */
    public final InputStream mo9848d() {
        return this.f6663d;
    }

    /* renamed from: b */
    public final List<C1930e> mo9846b() {
        return Collections.unmodifiableList(this.f6661b);
    }

    public C1957h(int i, List<C1930e> list) {
        this(i, list, -1, null);
    }

    public C1957h(int i, List<C1930e> list, int i2, InputStream inputStream) {
        this.f6660a = i;
        this.f6661b = list;
        this.f6662c = i2;
        this.f6663d = inputStream;
    }
}
