package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\f\"\u0004\b\u000f\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/data/ArrangeMeetingData;", "", "eventSummary", "", "isAtAll", "", "isFromMeeting", "(Ljava/lang/String;ZZ)V", "getEventSummary", "()Ljava/lang/String;", "setEventSummary", "(Ljava/lang/String;)V", "()Z", "setAtAll", "(Z)V", "setFromMeeting", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.a.a */
public final class ArrangeMeetingData {

    /* renamed from: a */
    private String f75362a;

    /* renamed from: b */
    private boolean f75363b;

    /* renamed from: c */
    private boolean f75364c;

    public ArrangeMeetingData() {
        this(null, false, false, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArrangeMeetingData)) {
            return false;
        }
        ArrangeMeetingData aVar = (ArrangeMeetingData) obj;
        return Intrinsics.areEqual(this.f75362a, aVar.f75362a) && this.f75363b == aVar.f75363b && this.f75364c == aVar.f75364c;
    }

    public int hashCode() {
        String str = this.f75362a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f75363b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.f75364c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i5 + i;
    }

    public String toString() {
        return "ArrangeMeetingData(eventSummary=" + this.f75362a + ", isAtAll=" + this.f75363b + ", isFromMeeting=" + this.f75364c + ")";
    }

    /* renamed from: a */
    public final String mo108907a() {
        return this.f75362a;
    }

    /* renamed from: c */
    public final boolean mo108912c() {
        return this.f75364c;
    }

    /* renamed from: b */
    public final boolean mo108911b() {
        return this.f75363b;
    }

    /* renamed from: b */
    public final void mo108910b(boolean z) {
        this.f75364c = z;
    }

    /* renamed from: a */
    public final void mo108908a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f75362a = str;
    }

    /* renamed from: a */
    public final void mo108909a(boolean z) {
        this.f75363b = z;
    }

    public ArrangeMeetingData(String str, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "eventSummary");
        this.f75362a = str;
        this.f75363b = z;
        this.f75364c = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArrangeMeetingData(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
