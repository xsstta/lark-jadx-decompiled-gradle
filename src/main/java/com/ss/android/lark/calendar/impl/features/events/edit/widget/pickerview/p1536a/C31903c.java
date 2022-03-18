package com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.a.c */
public class C31903c implements AbstractC31902b<Integer> {

    /* renamed from: a */
    private int f81483a;

    /* renamed from: b */
    private int f81484b;

    /* renamed from: c */
    private int f81485c;

    /* renamed from: c */
    public int mo116511c() {
        return this.f81485c;
    }

    public C31903c() {
        this(0, 9);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31902b
    /* renamed from: a */
    public int mo116503a() {
        return ((this.f81484b - this.f81483a) / this.f81485c) + 1;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31902b
    /* renamed from: b */
    public String mo116508b() {
        return String.valueOf(this.f81484b);
    }

    /* renamed from: a */
    public int mo116504a(Integer num) {
        return (num.intValue() - this.f81483a) / this.f81485c;
    }

    /* renamed from: a */
    public Integer mo116507b(int i) {
        if (i < 0 || i >= mo116503a()) {
            return 0;
        }
        return Integer.valueOf(this.f81483a + (i * this.f81485c));
    }

    public C31903c(int i, int i2) {
        this.f81483a = i;
        this.f81484b = i2;
        this.f81485c = 1;
    }

    public C31903c(int i, int i2, int i3) {
        this.f81483a = i;
        this.f81484b = i2;
        this.f81485c = i3;
    }
}
