package net.sqlcipher.database;

import android.util.SparseArray;
import androidx.p038g.p039a.AbstractC1088d;

/* access modifiers changed from: package-private */
public class BindingsRecorder implements AbstractC1088d {
    private SparseArray<Object> bindings = new SparseArray<>();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        clearBindings();
    }

    public void clearBindings() {
        this.bindings.clear();
    }

    BindingsRecorder() {
    }

    /* access modifiers changed from: package-private */
    public String[] getBindings() {
        String[] strArr = new String[this.bindings.size()];
        for (int i = 0; i < this.bindings.size(); i++) {
            int keyAt = this.bindings.keyAt(i);
            if (this.bindings.get(keyAt) != null) {
                strArr[i] = this.bindings.get(keyAt).toString();
            } else {
                strArr[i] = "";
            }
        }
        return strArr;
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindNull(int i) {
        this.bindings.put(i, null);
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindBlob(int i, byte[] bArr) {
        this.bindings.put(i, bArr);
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindString(int i, String str) {
        this.bindings.put(i, str);
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindDouble(int i, double d) {
        this.bindings.put(i, Double.valueOf(d));
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindLong(int i, long j) {
        this.bindings.put(i, Long.valueOf(j));
    }
}
