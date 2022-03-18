package com.ss.android.vc.common.p3080d;

/* renamed from: com.ss.android.vc.common.d.b */
public class C60714b extends C60721f {

    /* renamed from: b */
    private long[] f151870b;

    /* renamed from: c */
    private int f151871c;

    @Override // com.ss.android.vc.common.p3080d.C60721f
    /* renamed from: a */
    public long mo208309a() {
        if (this.f151871c < 0) {
            this.f151871c = 0;
        }
        int i = this.f151871c;
        long[] jArr = this.f151870b;
        if (i < jArr.length) {
            return jArr[i];
        }
        return jArr[jArr.length - 1];
    }

    @Override // com.ss.android.vc.common.p3080d.C60721f, com.ss.android.vc.common.p3080d.AbstractC60711a, com.ss.android.vc.common.p3080d.AbstractC60718c
    /* renamed from: a */
    public void mo208305a(boolean z) {
        this.f151871c = 0;
        super.mo208305a(z);
    }

    public C60714b(AbstractRunnableC60727j jVar, long[] jArr) {
        super(jVar);
        if (jArr == null || jArr.length == 0) {
            throw new IllegalArgumentException("intervals cannot be empty");
        }
        this.f151870b = jArr;
    }
}
