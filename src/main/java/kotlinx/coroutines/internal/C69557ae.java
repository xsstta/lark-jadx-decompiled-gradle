package kotlinx.coroutines.internal;

import kotlin.text.StringsKt;

/* renamed from: kotlinx.coroutines.internal.ae */
public final /* synthetic */ class C69557ae {
    /* renamed from: a */
    public static final boolean m266977a(String str, boolean z) {
        String a = C69555ac.m266969a(str);
        if (a != null) {
            return Boolean.parseBoolean(a);
        }
        return z;
    }

    /* renamed from: a */
    public static final int m266973a(String str, int i, int i2, int i3) {
        return (int) C69555ac.m266967a(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: a */
    public static final long m266975a(String str, long j, long j2, long j3) {
        String a = C69555ac.m266969a(str);
        if (a == null) {
            return j;
        }
        Long longOrNull = StringsKt.toLongOrNull(a);
        if (longOrNull != null) {
            long longValue = longOrNull.longValue();
            if (j2 <= longValue && j3 >= longValue) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + a + '\'').toString());
    }

    /* renamed from: a */
    public static /* synthetic */ int m266974a(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C69555ac.m266965a(str, i, i2, i3);
    }

    /* renamed from: a */
    public static /* synthetic */ long m266976a(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C69555ac.m266967a(str, j, j2, j3);
    }
}
