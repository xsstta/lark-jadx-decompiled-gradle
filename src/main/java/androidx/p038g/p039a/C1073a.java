package androidx.p038g.p039a;

/* renamed from: androidx.g.a.a */
public final class C1073a implements AbstractC1089e {

    /* renamed from: a */
    private final String f4054a;

    /* renamed from: b */
    private final Object[] f4055b;

    @Override // androidx.p038g.p039a.AbstractC1089e
    /* renamed from: b */
    public String mo5696b() {
        return this.f4054a;
    }

    public C1073a(String str) {
        this(str, null);
    }

    @Override // androidx.p038g.p039a.AbstractC1089e
    /* renamed from: a */
    public void mo5695a(AbstractC1088d dVar) {
        m5178a(dVar, this.f4055b);
    }

    public C1073a(String str, Object[] objArr) {
        this.f4054a = str;
        this.f4055b = objArr;
    }

    /* renamed from: a */
    public static void m5178a(AbstractC1088d dVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                m5177a(dVar, i, obj);
            }
        }
    }

    /* renamed from: a */
    private static void m5177a(AbstractC1088d dVar, int i, Object obj) {
        long j;
        if (obj == null) {
            dVar.bindNull(i);
        } else if (obj instanceof byte[]) {
            dVar.bindBlob(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            dVar.bindDouble(i, (double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            dVar.bindDouble(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            dVar.bindLong(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            dVar.bindLong(i, (long) ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            dVar.bindLong(i, (long) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            dVar.bindLong(i, (long) ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            dVar.bindString(i, (String) obj);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            dVar.bindLong(i, j);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte," + " string");
        }
    }
}
