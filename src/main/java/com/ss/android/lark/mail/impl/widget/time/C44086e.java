package com.ss.android.lark.mail.impl.widget.time;

import com.ss.android.lark.widget.wheelpicker.AbstractC59265j;

/* renamed from: com.ss.android.lark.mail.impl.widget.time.e */
public class C44086e implements AbstractC59265j<Integer> {

    /* renamed from: a */
    private int f111918a;

    /* renamed from: b */
    private int f111919b;

    /* renamed from: c */
    private int f111920c;

    /* renamed from: b */
    public int mo156884b() {
        return this.f111920c;
    }

    public C44086e() {
        this(0, 9);
    }

    @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59265j
    /* renamed from: a */
    public int mo156880a() {
        return ((this.f111919b - this.f111918a) / this.f111920c) + 1;
    }

    /* renamed from: a */
    public int mo156882a(Integer num) {
        return (num.intValue() - this.f111918a) / this.f111920c;
    }

    /* renamed from: a */
    public Integer mo156885b(int i) {
        if (i < 0 || i >= mo156880a()) {
            return 0;
        }
        return Integer.valueOf(this.f111918a + (i * this.f111920c));
    }

    public C44086e(int i, int i2) {
        this.f111918a = i;
        this.f111919b = i2;
        this.f111920c = 1;
    }

    public C44086e(int i, int i2, int i3) {
        this.f111918a = i;
        this.f111919b = i2;
        this.f111920c = i3;
    }
}
