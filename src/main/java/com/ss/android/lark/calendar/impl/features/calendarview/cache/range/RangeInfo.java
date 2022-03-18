package com.ss.android.lark.calendar.impl.features.calendarview.cache.range;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000J\u0006\u0010\u0014\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0000J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;", "", "startDay", "", "endDay", "(II)V", "getEndDay", "()I", "setEndDay", "(I)V", "getStartDay", "setStartDay", "component1", "component2", "copy", "equals", "", "other", "hashCode", "isCross", "isInvalid", "isSubset", "subRange", "reset", "", "toString", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.b.e */
public final class RangeInfo {

    /* renamed from: a */
    public static final Companion f76877a = new Companion(null);

    /* renamed from: b */
    private int f76878b;

    /* renamed from: c */
    private int f76879c;

    public RangeInfo() {
        this(0, 0, 3, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo$Companion;", "", "()V", "INVALID_DAY", "", "forceUnion", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;", "rangeA", "rangeB", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.b.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final RangeInfo mo110801a(RangeInfo eVar, RangeInfo eVar2) {
            Intrinsics.checkParameterIsNotNull(eVar, "rangeA");
            Intrinsics.checkParameterIsNotNull(eVar2, "rangeB");
            return new RangeInfo(Math.min(eVar.mo110796c(), eVar2.mo110796c()), Math.max(eVar.mo110797d(), eVar2.mo110797d()));
        }
    }

    /* renamed from: c */
    public final int mo110796c() {
        return this.f76878b;
    }

    /* renamed from: d */
    public final int mo110797d() {
        return this.f76879c;
    }

    /* renamed from: a */
    public final void mo110790a() {
        this.f76878b = 0;
        this.f76879c = 0;
    }

    public int hashCode() {
        return this.f76878b + (this.f76879c * 2);
    }

    /* renamed from: b */
    public final boolean mo110794b() {
        int i;
        int i2 = this.f76878b;
        if (i2 == 0 || (i = this.f76879c) == 0 || i2 > i) {
            return true;
        }
        return false;
    }

    public String toString() {
        return '[' + this.f76878b + ", " + this.f76879c + ']';
    }

    /* renamed from: a */
    public final void mo110791a(int i) {
        this.f76878b = i;
    }

    /* renamed from: b */
    public final void mo110793b(int i) {
        this.f76879c = i;
    }

    /* renamed from: a */
    public final boolean mo110792a(RangeInfo eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "subRange");
        if (eVar.f76878b < this.f76878b || eVar.f76879c > this.f76879c) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RangeInfo)) {
            return super.equals(obj);
        }
        RangeInfo eVar = (RangeInfo) obj;
        if (eVar.f76878b == this.f76878b && eVar.f76879c == this.f76879c) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo110795b(RangeInfo eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "other");
        if (mo110794b() || eVar.mo110794b() || eVar.f76878b > this.f76879c || eVar.f76879c < this.f76878b) {
            return false;
        }
        return true;
    }

    public RangeInfo(int i, int i2) {
        this.f76878b = i;
        this.f76879c = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RangeInfo(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
