package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J9\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomFilterData;", "", "logo", "Landroid/graphics/drawable/Drawable;", "name", "", "isSelected", "", "onItemClick", "Lkotlin/Function0;", "", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "()Z", "setSelected", "(Z)V", "getLogo", "()Landroid/graphics/drawable/Drawable;", "setLogo", "(Landroid/graphics/drawable/Drawable;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getOnItemClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.e */
public final class MeetingRoomFilterData {

    /* renamed from: a */
    private Drawable f81102a;

    /* renamed from: b */
    private String f81103b;

    /* renamed from: c */
    private boolean f81104c;

    /* renamed from: d */
    private final Function0<Unit> f81105d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeetingRoomFilterData)) {
            return false;
        }
        MeetingRoomFilterData eVar = (MeetingRoomFilterData) obj;
        return Intrinsics.areEqual(this.f81102a, eVar.f81102a) && Intrinsics.areEqual(this.f81103b, eVar.f81103b) && this.f81104c == eVar.f81104c && Intrinsics.areEqual(this.f81105d, eVar.f81105d);
    }

    public int hashCode() {
        Drawable drawable = this.f81102a;
        int i = 0;
        int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        String str = this.f81103b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f81104c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode2 + i2) * 31;
        Function0<Unit> function0 = this.f81105d;
        if (function0 != null) {
            i = function0.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        return "MeetingRoomFilterData(logo=" + this.f81102a + ", name=" + this.f81103b + ", isSelected=" + this.f81104c + ", onItemClick=" + this.f81105d + ")";
    }

    /* renamed from: a */
    public final Drawable mo116084a() {
        return this.f81102a;
    }

    /* renamed from: b */
    public final String mo116088b() {
        return this.f81103b;
    }

    /* renamed from: c */
    public final boolean mo116089c() {
        return this.f81104c;
    }

    /* renamed from: d */
    public final Function0<Unit> mo116090d() {
        return this.f81105d;
    }

    /* renamed from: a */
    public final void mo116085a(Drawable drawable) {
        this.f81102a = drawable;
    }

    /* renamed from: a */
    public final void mo116086a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f81103b = str;
    }

    /* renamed from: a */
    public final void mo116087a(boolean z) {
        this.f81104c = z;
    }

    public MeetingRoomFilterData(Drawable drawable, String str, boolean z, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(function0, "onItemClick");
        this.f81102a = drawable;
        this.f81103b = str;
        this.f81104c = z;
        this.f81105d = function0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MeetingRoomFilterData(Drawable drawable, String str, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, str, (i & 4) != 0 ? false : z, function0);
    }
}
