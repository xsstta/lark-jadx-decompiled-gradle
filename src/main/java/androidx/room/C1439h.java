package androidx.room;

import androidx.p038g.p039a.AbstractC1088d;
import androidx.p038g.p039a.AbstractC1089e;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: androidx.room.h */
public class C1439h implements AbstractC1088d, AbstractC1089e {

    /* renamed from: g */
    static final TreeMap<Integer, C1439h> f5052g = new TreeMap<>();

    /* renamed from: a */
    final long[] f5053a;

    /* renamed from: b */
    final double[] f5054b;

    /* renamed from: c */
    final String[] f5055c;

    /* renamed from: d */
    final byte[][] f5056d;

    /* renamed from: e */
    final int f5057e;

    /* renamed from: f */
    int f5058f;

    /* renamed from: h */
    private volatile String f5059h;

    /* renamed from: i */
    private final int[] f5060i;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.p038g.p039a.AbstractC1089e
    /* renamed from: b */
    public String mo5696b() {
        return this.f5059h;
    }

    /* renamed from: a */
    public void mo7613a() {
        TreeMap<Integer, C1439h> treeMap = f5052g;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f5057e), this);
            m6574c();
        }
    }

    /* renamed from: c */
    private static void m6574c() {
        TreeMap<Integer, C1439h> treeMap = f5052g;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindNull(int i) {
        this.f5060i[i] = 1;
    }

    private C1439h(int i) {
        this.f5057e = i;
        int i2 = i + 1;
        this.f5060i = new int[i2];
        this.f5053a = new long[i2];
        this.f5054b = new double[i2];
        this.f5055c = new String[i2];
        this.f5056d = new byte[i2][];
    }

    @Override // androidx.p038g.p039a.AbstractC1089e
    /* renamed from: a */
    public void mo5695a(AbstractC1088d dVar) {
        for (int i = 1; i <= this.f5058f; i++) {
            int i2 = this.f5060i[i];
            if (i2 == 1) {
                dVar.bindNull(i);
            } else if (i2 == 2) {
                dVar.bindLong(i, this.f5053a[i]);
            } else if (i2 == 3) {
                dVar.bindDouble(i, this.f5054b[i]);
            } else if (i2 == 4) {
                dVar.bindString(i, this.f5055c[i]);
            } else if (i2 == 5) {
                dVar.bindBlob(i, this.f5056d[i]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7614b(String str, int i) {
        this.f5059h = str;
        this.f5058f = i;
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindBlob(int i, byte[] bArr) {
        this.f5060i[i] = 5;
        this.f5056d[i] = bArr;
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindDouble(int i, double d) {
        this.f5060i[i] = 3;
        this.f5054b[i] = d;
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindLong(int i, long j) {
        this.f5060i[i] = 2;
        this.f5053a[i] = j;
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindString(int i, String str) {
        this.f5060i[i] = 4;
        this.f5055c[i] = str;
    }

    /* renamed from: a */
    public static C1439h m6573a(String str, int i) {
        TreeMap<Integer, C1439h> treeMap = f5052g;
        synchronized (treeMap) {
            Map.Entry<Integer, C1439h> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C1439h value = ceilingEntry.getValue();
                value.mo7614b(str, i);
                return value;
            }
            C1439h hVar = new C1439h(i);
            hVar.mo7614b(str, i);
            return hVar;
        }
    }
}
