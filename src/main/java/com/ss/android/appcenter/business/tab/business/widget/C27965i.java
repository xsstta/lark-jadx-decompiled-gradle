package com.ss.android.appcenter.business.tab.business.widget;

/* renamed from: com.ss.android.appcenter.business.tab.business.widget.i */
public class C27965i {

    /* renamed from: a */
    private String f69965a;

    /* renamed from: b */
    private String f69966b;

    /* renamed from: c */
    private long f69967c;

    /* renamed from: a */
    public String mo99683a() {
        return this.f69965a;
    }

    /* renamed from: b */
    public String mo99685b() {
        return this.f69966b;
    }

    /* renamed from: c */
    public long mo99686c() {
        return this.f69967c;
    }

    public String toString() {
        return String.format("WidgetDataRequest{mCardId='%s', mVersion='%s', mTimeStamp=%d}", this.f69965a, this.f69966b, Long.valueOf(this.f69967c));
    }

    /* renamed from: a */
    public void mo99684a(long j) {
        this.f69967c = j;
    }

    public C27965i(String str, String str2) {
        this.f69965a = str;
        this.f69966b = str2;
    }
}
