package com.ss.android.lark.chat.export.ui.message.style;

/* renamed from: com.ss.android.lark.chat.export.ui.message.style.b */
public class C34034b {

    /* renamed from: a */
    public static C34034b f87997a = new C34034b(new int[]{0, 0, 0, 0}, false);

    /* renamed from: b */
    private int[] f87998b;

    /* renamed from: c */
    private boolean f87999c;

    /* renamed from: d */
    private int f88000d = -1;

    /* renamed from: b */
    public boolean mo126157b() {
        return this.f87999c;
    }

    /* renamed from: c */
    public int mo126158c() {
        return this.f88000d;
    }

    /* renamed from: a */
    public int[] mo126156a() {
        return this.f87998b;
    }

    /* renamed from: a */
    public void mo126153a(int i) {
        this.f88000d = i;
    }

    /* renamed from: a */
    public void mo126155a(boolean z) {
        this.f87999c = z;
    }

    /* renamed from: b */
    public static C34034b m131984b(int i) {
        f87997a.mo126154a(0, 0, 0, 0);
        f87997a.mo126155a(false);
        f87997a.mo126153a(i);
        return f87997a;
    }

    private C34034b(int[] iArr, boolean z) {
        this.f87998b = iArr;
        this.f87999c = z;
    }

    /* renamed from: a */
    public static C34034b m131982a(int i, int i2) {
        f87997a.mo126154a(i, 0, 0, 0);
        f87997a.mo126155a(false);
        f87997a.mo126153a(i2);
        return f87997a;
    }

    /* renamed from: a */
    public void mo126154a(int i, int i2, int i3, int i4) {
        int[] iArr = this.f87998b;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
    }

    /* renamed from: a */
    public static C34034b m131983a(int i, int i2, int i3, int i4, boolean z, int i5) {
        f87997a.mo126154a(i, i2, i3, i4);
        f87997a.mo126155a(z);
        f87997a.mo126153a(i5);
        return f87997a;
    }
}
