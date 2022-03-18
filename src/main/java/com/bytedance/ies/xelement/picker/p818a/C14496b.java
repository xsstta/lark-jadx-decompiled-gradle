package com.bytedance.ies.xelement.picker.p818a;

/* renamed from: com.bytedance.ies.xelement.picker.a.b */
public class C14496b implements AbstractC14498d<Integer> {

    /* renamed from: a */
    private int f38251a;

    /* renamed from: b */
    private int f38252b;

    @Override // com.bytedance.ies.xelement.picker.p818a.AbstractC14498d
    /* renamed from: a */
    public int mo53384a() {
        return (this.f38252b - this.f38251a) + 1;
    }

    /* renamed from: a */
    public Integer mo53386b(int i) {
        if (i < 0 || i >= mo53384a()) {
            return 0;
        }
        return Integer.valueOf(this.f38251a + i);
    }

    public C14496b(int i, int i2) {
        this.f38251a = i;
        this.f38252b = i2;
    }
}
