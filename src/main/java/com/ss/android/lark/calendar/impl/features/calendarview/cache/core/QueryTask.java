package com.ss.android.lark.calendar.impl.features.calendarview.cache.core;

import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.RangeInfo;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0000J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006J\b\u0010\u001a\u001a\u00020\u000eH\u0016R.\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/QueryTask;", "", "dayRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;", "callbacks", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData;", "Lkotlin/collections/ArrayList;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;Ljava/util/ArrayList;)V", "getCallbacks", "()Ljava/util/ArrayList;", "setCallbacks", "(Ljava/util/ArrayList;)V", "contextId", "", "getDayRange", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;", "getContextId", "isSubTask", "", "subTask", "merge", "other", "setCallback", "", "callback", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.f */
public final class QueryTask {

    /* renamed from: a */
    private String f76936a;

    /* renamed from: b */
    private final RangeInfo f76937b;

    /* renamed from: c */
    private ArrayList<IPrepareChipData> f76938c;

    /* renamed from: a */
    public final String mo110855a() {
        return this.f76936a;
    }

    /* renamed from: b */
    public final RangeInfo mo110858b() {
        return this.f76937b;
    }

    /* renamed from: c */
    public final ArrayList<IPrepareChipData> mo110860c() {
        return this.f76938c;
    }

    public String toString() {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append("contextId = ");
        sb.append(this.f76936a);
        sb.append(", dayRange = ");
        sb.append(this.f76937b);
        sb.append(", callbacks.size = ");
        ArrayList<IPrepareChipData> arrayList = this.f76938c;
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        sb.append(num);
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo110857a(QueryTask fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "subTask");
        return this.f76937b.mo110792a(fVar.f76937b);
    }

    /* renamed from: a */
    public final void mo110856a(IPrepareChipData iPrepareChipData) {
        Intrinsics.checkParameterIsNotNull(iPrepareChipData, "callback");
        if (this.f76938c == null) {
            this.f76938c = new ArrayList<>();
            Unit unit = Unit.INSTANCE;
        }
        ArrayList<IPrepareChipData> arrayList = this.f76938c;
        if (arrayList != null) {
            arrayList.add(iPrepareChipData);
        }
    }

    /* renamed from: b */
    public final QueryTask mo110859b(QueryTask fVar) {
        int i;
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(fVar, "other");
        ArrayList<IPrepareChipData> arrayList2 = fVar.f76938c;
        int i2 = 0;
        if (arrayList2 != null) {
            i = arrayList2.size();
        } else {
            i = 0;
        }
        ArrayList<IPrepareChipData> arrayList3 = this.f76938c;
        if (arrayList3 != null) {
            i2 = arrayList3.size();
        }
        int i3 = i + i2;
        if (i3 > 0) {
            arrayList = new ArrayList(i3);
            ArrayList<IPrepareChipData> arrayList4 = fVar.f76938c;
            if (arrayList4 != null) {
                arrayList.addAll(arrayList4);
            }
            ArrayList<IPrepareChipData> arrayList5 = this.f76938c;
            if (arrayList5 != null) {
                arrayList.addAll(arrayList5);
            }
        } else {
            arrayList = null;
        }
        QueryTask fVar2 = new QueryTask(RangeInfo.f76877a.mo110801a(this.f76937b, fVar.f76937b), arrayList);
        fVar2.f76936a = this.f76936a;
        return fVar2;
    }

    public QueryTask(RangeInfo eVar, ArrayList<IPrepareChipData> arrayList) {
        Intrinsics.checkParameterIsNotNull(eVar, "dayRange");
        this.f76937b = eVar;
        this.f76938c = arrayList;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
        this.f76936a = uuid;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QueryTask(RangeInfo eVar, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i & 2) != 0 ? null : arrayList);
    }
}
