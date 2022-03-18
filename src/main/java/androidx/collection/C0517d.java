package androidx.collection;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* renamed from: androidx.collection.d */
public class C0517d<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f1877a;

    /* renamed from: b */
    private int f1878b;

    /* renamed from: c */
    private int f1879c;

    /* renamed from: d */
    private int f1880d;

    /* renamed from: e */
    private int f1881e;

    /* renamed from: f */
    private int f1882f;

    /* renamed from: g */
    private int f1883g;

    /* renamed from: h */
    private int f1884h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2978a(boolean z, K k, V v, V v2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo2979b(K k, V v) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public V mo2981c(K k) {
        return null;
    }

    /* renamed from: a */
    public final void mo2976a() {
        mo2977a(-1);
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f1883g;
        int i3 = this.f1884h + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1879c), Integer.valueOf(this.f1883g), Integer.valueOf(this.f1884h), Integer.valueOf(i));
    }

    public C0517d(int i) {
        if (i > 0) {
            this.f1879c = i;
            this.f1877a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: b */
    public final V mo2980b(K k) {
        V remove;
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            remove = this.f1877a.remove(k);
            if (remove != null) {
                this.f1878b -= m2347c(k, remove);
            }
        }
        if (remove != null) {
            mo2978a(false, k, remove, null);
        }
        return remove;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r0 = mo2981c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f1881e++;
        r1 = r4.f1877a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r4.f1877a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r4.f1878b += m2347c(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        mo2978a(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        mo2977a(r4.f1879c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo2974a(K r5) {
        /*
            r4 = this;
            java.lang.String r0 = "key == null"
            java.util.Objects.requireNonNull(r5, r0)
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f1877a     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0016
            int r5 = r4.f1883g     // Catch:{ all -> 0x0054 }
            int r5 = r5 + 1
            r4.f1883g = r5     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            return r0
        L_0x0016:
            int r0 = r4.f1884h     // Catch:{ all -> 0x0054 }
            int r0 = r0 + 1
            r4.f1884h = r0     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r4.mo2981c(r5)
            if (r0 != 0) goto L_0x0025
            r5 = 0
            return r5
        L_0x0025:
            monitor-enter(r4)
            int r1 = r4.f1881e     // Catch:{ all -> 0x0051 }
            int r1 = r1 + 1
            r4.f1881e = r1     // Catch:{ all -> 0x0051 }
            java.util.LinkedHashMap<K, V> r1 = r4.f1877a     // Catch:{ all -> 0x0051 }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x003a
            java.util.LinkedHashMap<K, V> r2 = r4.f1877a     // Catch:{ all -> 0x0051 }
            r2.put(r5, r1)     // Catch:{ all -> 0x0051 }
            goto L_0x0043
        L_0x003a:
            int r2 = r4.f1878b     // Catch:{ all -> 0x0051 }
            int r3 = r4.m2347c(r5, r0)     // Catch:{ all -> 0x0051 }
            int r2 = r2 + r3
            r4.f1878b = r2     // Catch:{ all -> 0x0051 }
        L_0x0043:
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x004b
            r2 = 0
            r4.mo2978a(r2, r5, r0, r1)
            return r1
        L_0x004b:
            int r5 = r4.f1879c
            r4.mo2977a(r5)
            return r0
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0054:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C0517d.mo2974a(java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2977a(int r5) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C0517d.mo2977a(int):void");
    }

    /* renamed from: c */
    private int m2347c(K k, V v) {
        int b = mo2979b(k, v);
        if (b >= 0) {
            return b;
        }
        throw new IllegalStateException("Negative size: " + ((Object) k) + ContainerUtils.KEY_VALUE_DELIMITER + ((Object) v));
    }

    /* renamed from: a */
    public final V mo2975a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1880d++;
            this.f1878b += m2347c(k, v);
            put = this.f1877a.put(k, v);
            if (put != null) {
                this.f1878b -= m2347c(k, put);
            }
        }
        if (put != null) {
            mo2978a(false, k, put, v);
        }
        mo2977a(this.f1879c);
        return put;
    }
}
