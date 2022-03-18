package com.bytedance.ies.xelement.picker.p818a;

/* renamed from: com.bytedance.ies.xelement.picker.a.c */
public class C14497c implements AbstractC14498d<Integer> {

    /* renamed from: a */
    private int f38253a;

    /* renamed from: b */
    private int f38254b;

    /* renamed from: c */
    private int f38255c;

    @Override // com.bytedance.ies.xelement.picker.p818a.AbstractC14498d
    /* renamed from: a */
    public int mo53384a() {
        return (this.f38254b - this.f38253a) + 1;
    }

    /* renamed from: a */
    public Integer mo53386b(int i) {
        if (i < 0 || i >= mo53384a()) {
            return 0;
        }
        return Integer.valueOf((this.f38253a + i) % this.f38255c);
    }

    public C14497c(int i, int i2, int i3) {
        if (i3 != 0) {
            this.f38255c = i3;
            this.f38253a = i;
            if (i2 > i) {
                this.f38254b = i2;
            } else {
                this.f38254b = i2 + i3;
            }
        } else {
            throw new IllegalArgumentException("period can not be zero");
        }
    }
}
