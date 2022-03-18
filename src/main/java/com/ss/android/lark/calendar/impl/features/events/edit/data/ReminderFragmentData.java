package com.ss.android.lark.calendar.impl.features.events.edit.data;

import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001B?\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0019\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/data/ReminderFragmentData;", "", "reminderList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "chosenIndexs", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "isSingleSelect", "", "(Ljava/util/ArrayList;Ljava/util/HashSet;Z)V", "getChosenIndexs", "()Ljava/util/HashSet;", "setChosenIndexs", "(Ljava/util/HashSet;)V", "()Z", "setSingleSelect", "(Z)V", "getReminderList", "()Ljava/util/ArrayList;", "setReminderList", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.data.e */
public final class ReminderFragmentData {

    /* renamed from: a */
    private ArrayList<String> f80203a;

    /* renamed from: b */
    private HashSet<Integer> f80204b;

    /* renamed from: c */
    private boolean f80205c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReminderFragmentData)) {
            return false;
        }
        ReminderFragmentData eVar = (ReminderFragmentData) obj;
        return Intrinsics.areEqual(this.f80203a, eVar.f80203a) && Intrinsics.areEqual(this.f80204b, eVar.f80204b) && this.f80205c == eVar.f80205c;
    }

    public int hashCode() {
        ArrayList<String> arrayList = this.f80203a;
        int i = 0;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        HashSet<Integer> hashSet = this.f80204b;
        if (hashSet != null) {
            i = hashSet.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f80205c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "ReminderFragmentData(reminderList=" + this.f80203a + ", chosenIndexs=" + this.f80204b + ", isSingleSelect=" + this.f80205c + ")";
    }

    /* renamed from: a */
    public final ArrayList<String> mo115093a() {
        return this.f80203a;
    }

    /* renamed from: b */
    public final HashSet<Integer> mo115094b() {
        return this.f80204b;
    }

    /* renamed from: c */
    public final boolean mo115095c() {
        return this.f80205c;
    }

    public ReminderFragmentData(ArrayList<String> arrayList, HashSet<Integer> hashSet, boolean z) {
        Intrinsics.checkParameterIsNotNull(arrayList, "reminderList");
        Intrinsics.checkParameterIsNotNull(hashSet, "chosenIndexs");
        this.f80203a = arrayList;
        this.f80204b = hashSet;
        this.f80205c = z;
    }
}
