package com.commonsware.cwac.saferoom;

import android.util.SparseArray;
import androidx.p038g.p039a.AbstractC1088d;

/* renamed from: com.commonsware.cwac.saferoom.a */
class C20932a implements AbstractC1088d {

    /* renamed from: a */
    private SparseArray<Object> f51258a = new SparseArray<>();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo70773a();
    }

    /* renamed from: a */
    public void mo70773a() {
        this.f51258a.clear();
    }

    C20932a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String[] mo70774b() {
        String[] strArr = new String[this.f51258a.size()];
        for (int i = 0; i < this.f51258a.size(); i++) {
            int keyAt = this.f51258a.keyAt(i);
            if (this.f51258a.get(keyAt) != null) {
                strArr[i] = this.f51258a.get(keyAt).toString();
            } else {
                strArr[i] = "";
            }
        }
        return strArr;
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindNull(int i) {
        this.f51258a.put(i, null);
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindBlob(int i, byte[] bArr) {
        this.f51258a.put(i, bArr);
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindString(int i, String str) {
        this.f51258a.put(i, str);
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindDouble(int i, double d) {
        this.f51258a.put(i, Double.valueOf(d));
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindLong(int i, long j) {
        this.f51258a.put(i, Long.valueOf(j));
    }
}
