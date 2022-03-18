package com.larksuite.component.universe_design.datepicker.impl.data;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ*\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R$\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/data/Week;", "", "row", "", "baseDays", "", "Lcom/larksuite/component/universe_design/datepicker/impl/data/BaseDay;", "(I[Lcom/larksuite/component/universe_design/datepicker/impl/data/BaseDay;)V", "getBaseDays", "()[Lcom/larksuite/component/universe_design/datepicker/impl/data/BaseDay;", "setBaseDays", "([Lcom/larksuite/component/universe_design/datepicker/impl/data/BaseDay;)V", "[Lcom/larksuite/component/universe_design/datepicker/impl/data/BaseDay;", "getRow", "()I", "setRow", "(I)V", "component1", "component2", "copy", "(I[Lcom/larksuite/component/universe_design/datepicker/impl/data/BaseDay;)Lcom/larksuite/component/universe_design/datepicker/impl/data/Week;", "equals", "", "other", "hashCode", "toString", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.datepicker.impl.data.b */
public final class Week {

    /* renamed from: a */
    private int f63231a;

    /* renamed from: b */
    private BaseDay[] f63232b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Week)) {
            return false;
        }
        Week bVar = (Week) obj;
        return this.f63231a == bVar.f63231a && Intrinsics.areEqual(this.f63232b, bVar.f63232b);
    }

    public int hashCode() {
        int i = this.f63231a * 31;
        BaseDay[] aVarArr = this.f63232b;
        return i + (aVarArr != null ? Arrays.hashCode(aVarArr) : 0);
    }

    public String toString() {
        return "Week(row=" + this.f63231a + ", baseDays=" + Arrays.toString(this.f63232b) + ")";
    }

    /* renamed from: a */
    public final BaseDay[] mo90522a() {
        return this.f63232b;
    }

    public Week(int i, BaseDay[] aVarArr) {
        Intrinsics.checkParameterIsNotNull(aVarArr, "baseDays");
        this.f63231a = i;
        this.f63232b = aVarArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Week(int i, BaseDay[] aVarArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new BaseDay[7] : aVarArr);
    }
}
