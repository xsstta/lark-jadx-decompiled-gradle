package com.ss.android.lark.calendar.impl.features.events.edit.data;

import com.ss.android.lark.calendar.impl.utils.RepeatMode;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/data/RepeatFragmentData;", "", "chosenIndex", "", "repeatLists", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "customRepeatMode", "Lcom/ss/android/lark/calendar/impl/utils/RepeatMode;", "(ILjava/util/ArrayList;Lcom/ss/android/lark/calendar/impl/utils/RepeatMode;)V", "getChosenIndex", "()I", "setChosenIndex", "(I)V", "getCustomRepeatMode", "()Lcom/ss/android/lark/calendar/impl/utils/RepeatMode;", "setCustomRepeatMode", "(Lcom/ss/android/lark/calendar/impl/utils/RepeatMode;)V", "getRepeatLists", "()Ljava/util/ArrayList;", "setRepeatLists", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.data.g */
public final class RepeatFragmentData {

    /* renamed from: a */
    private int f80214a;

    /* renamed from: b */
    private ArrayList<String> f80215b;

    /* renamed from: c */
    private RepeatMode f80216c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepeatFragmentData)) {
            return false;
        }
        RepeatFragmentData gVar = (RepeatFragmentData) obj;
        return this.f80214a == gVar.f80214a && Intrinsics.areEqual(this.f80215b, gVar.f80215b) && Intrinsics.areEqual(this.f80216c, gVar.f80216c);
    }

    public int hashCode() {
        int i = this.f80214a * 31;
        ArrayList<String> arrayList = this.f80215b;
        int i2 = 0;
        int hashCode = (i + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        RepeatMode repeatMode = this.f80216c;
        if (repeatMode != null) {
            i2 = repeatMode.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "RepeatFragmentData(chosenIndex=" + this.f80214a + ", repeatLists=" + this.f80215b + ", customRepeatMode=" + this.f80216c + ")";
    }

    /* renamed from: a */
    public final int mo115114a() {
        return this.f80214a;
    }

    /* renamed from: b */
    public final ArrayList<String> mo115115b() {
        return this.f80215b;
    }

    public RepeatFragmentData(int i, ArrayList<String> arrayList, RepeatMode repeatMode) {
        Intrinsics.checkParameterIsNotNull(arrayList, "repeatLists");
        this.f80214a = i;
        this.f80215b = arrayList;
        this.f80216c = repeatMode;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepeatFragmentData(int i, ArrayList arrayList, RepeatMode repeatMode, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, arrayList, (i2 & 4) != 0 ? null : repeatMode);
    }
}
