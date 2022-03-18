package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "", "id", "", "name", ShareHitPoint.f121869d, "isSelected", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "()Z", "setSelected", "(Z)V", "getName", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.b */
public final class EquipmentData {

    /* renamed from: a */
    private final String f81084a;

    /* renamed from: b */
    private final String f81085b;

    /* renamed from: c */
    private final String f81086c;

    /* renamed from: d */
    private boolean f81087d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EquipmentData)) {
            return false;
        }
        EquipmentData bVar = (EquipmentData) obj;
        return Intrinsics.areEqual(this.f81084a, bVar.f81084a) && Intrinsics.areEqual(this.f81085b, bVar.f81085b) && Intrinsics.areEqual(this.f81086c, bVar.f81086c) && this.f81087d == bVar.f81087d;
    }

    public int hashCode() {
        String str = this.f81084a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f81085b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f81086c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f81087d;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "EquipmentData(id=" + this.f81084a + ", name=" + this.f81085b + ", type=" + this.f81086c + ", isSelected=" + this.f81087d + ")";
    }

    /* renamed from: a */
    public final String mo116059a() {
        return this.f81084a;
    }

    /* renamed from: b */
    public final String mo116061b() {
        return this.f81085b;
    }

    /* renamed from: c */
    public final String mo116062c() {
        return this.f81086c;
    }

    /* renamed from: d */
    public final boolean mo116063d() {
        return this.f81087d;
    }

    /* renamed from: a */
    public final void mo116060a(boolean z) {
        this.f81087d = z;
    }

    public EquipmentData(String str, String str2, String str3, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, ShareHitPoint.f121869d);
        this.f81084a = str;
        this.f81085b = str2;
        this.f81086c = str3;
        this.f81087d = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EquipmentData(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z);
    }
}
