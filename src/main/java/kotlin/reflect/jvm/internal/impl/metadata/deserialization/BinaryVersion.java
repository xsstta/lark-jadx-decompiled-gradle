package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public abstract class BinaryVersion {
    public static final Companion Companion = new Companion(null);
    private final int major;
    private final int minor;
    private final int[] numbers;
    private final int patch;
    private final List<Integer> rest;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int[] toArray() {
        return this.numbers;
    }

    public int hashCode() {
        int i = this.major;
        int i2 = i + (i * 31) + this.minor;
        int i3 = i2 + (i2 * 31) + this.patch;
        return i3 + (i3 * 31) + this.rest.hashCode();
    }

    public String toString() {
        boolean z;
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i : array) {
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return "unknown";
        }
        return CollectionsKt.joinToString$default(arrayList2, ".", null, null, 0, null, null, 62, null);
    }

    public final boolean isAtLeast(BinaryVersion binaryVersion) {
        Intrinsics.checkParameterIsNotNull(binaryVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        return isAtLeast(binaryVersion.major, binaryVersion.minor, binaryVersion.patch);
    }

    public boolean equals(Object obj) {
        if (obj != null && Intrinsics.areEqual(getClass(), obj.getClass())) {
            BinaryVersion binaryVersion = (BinaryVersion) obj;
            if (this.major == binaryVersion.major && this.minor == binaryVersion.minor && this.patch == binaryVersion.patch && Intrinsics.areEqual(this.rest, binaryVersion.rest)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isCompatibleTo(kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ourVersion"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            int r0 = r4.major
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0016
            int r0 = r5.major
            if (r0 != 0) goto L_0x0021
            int r0 = r4.minor
            int r5 = r5.minor
            if (r0 != r5) goto L_0x0021
            goto L_0x0022
        L_0x0016:
            int r3 = r5.major
            if (r0 != r3) goto L_0x0021
            int r0 = r4.minor
            int r5 = r5.minor
            if (r0 > r5) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion.isCompatibleTo(kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion):boolean");
    }

    public BinaryVersion(int... iArr) {
        int i;
        int i2;
        List<Integer> list;
        Intrinsics.checkParameterIsNotNull(iArr, "numbers");
        this.numbers = iArr;
        Integer b = C69043h.m265756b(iArr, 0);
        int i3 = -1;
        if (b != null) {
            i = b.intValue();
        } else {
            i = -1;
        }
        this.major = i;
        Integer b2 = C69043h.m265756b(iArr, 1);
        if (b2 != null) {
            i2 = b2.intValue();
        } else {
            i2 = -1;
        }
        this.minor = i2;
        Integer b3 = C69043h.m265756b(iArr, 2);
        this.patch = b3 != null ? b3.intValue() : i3;
        if (iArr.length > 3) {
            list = CollectionsKt.toList(C69043h.m265715a(iArr).subList(3, iArr.length));
        } else {
            list = CollectionsKt.emptyList();
        }
        this.rest = list;
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4 = this.major;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.minor;
        if (i5 > i2) {
            return true;
        }
        if (i5 >= i2 && this.patch >= i3) {
            return true;
        }
        return false;
    }
}
