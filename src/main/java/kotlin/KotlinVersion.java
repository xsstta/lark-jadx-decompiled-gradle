package kotlin;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0000H\u0002J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lkotlin/KotlinVersion;", "", "major", "", "minor", "(II)V", "patch", "(III)V", "getMajor", "()I", "getMinor", "getPatch", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "compareTo", "other", "equals", "", "", "hashCode", "isAtLeast", "toString", "", "versionOf", "Companion", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.d */
public final class KotlinVersion implements Comparable<KotlinVersion> {

    /* renamed from: a */
    public static final KotlinVersion f173139a = new KotlinVersion(1, 3, 72);

    /* renamed from: b */
    public static final Companion f173140b = new Companion(null);

    /* renamed from: c */
    private final int f173141c;

    /* renamed from: d */
    private final int f173142d;

    /* renamed from: e */
    private final int f173143e;

    /* renamed from: f */
    private final int f173144f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/KotlinVersion$Companion;", "", "()V", "CURRENT", "Lkotlin/KotlinVersion;", "MAX_COMPONENT_VALUE", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public int hashCode() {
        return this.f173141c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f173142d);
        sb.append('.');
        sb.append(this.f173143e);
        sb.append('.');
        sb.append(this.f173144f);
        return sb.toString();
    }

    /* renamed from: a */
    public int compareTo(KotlinVersion dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "other");
        return this.f173141c - dVar.f173141c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinVersion)) {
            obj = null;
        }
        KotlinVersion dVar = (KotlinVersion) obj;
        if (dVar == null || this.f173141c != dVar.f173141c) {
            return false;
        }
        return true;
    }

    public KotlinVersion(int i, int i2, int i3) {
        this.f173142d = i;
        this.f173143e = i2;
        this.f173144f = i3;
        this.f173141c = m265850b(i, i2, i3);
    }

    /* renamed from: a */
    public final boolean mo239184a(int i, int i2, int i3) {
        int i4;
        int i5 = this.f173142d;
        if (i5 > i || (i5 == i && ((i4 = this.f173143e) > i2 || (i4 == i2 && this.f173144f >= i3)))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final int m265850b(int i, int i2, int i3) {
        boolean z;
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }
}
