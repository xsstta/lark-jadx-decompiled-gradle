package com.ss.android.vc.common.p3080d;

/* renamed from: com.ss.android.vc.common.d.h */
public class C60723h implements AbstractC60719d {

    /* renamed from: a */
    public static C60723h f151880a = new C60723h();

    /* renamed from: b */
    private int f151881b = Integer.MIN_VALUE;

    public C60723h() {
    }

    @Override // com.ss.android.vc.common.p3080d.AbstractC60719d
    /* renamed from: a */
    public boolean mo208313a() {
        int i = this.f151881b;
        if (i == Integer.MIN_VALUE) {
            return true;
        }
        if (i <= 0) {
            return false;
        }
        this.f151881b = i - 1;
        return true;
    }

    public C60723h(int i) {
        this.f151881b = i + 1;
    }
}
