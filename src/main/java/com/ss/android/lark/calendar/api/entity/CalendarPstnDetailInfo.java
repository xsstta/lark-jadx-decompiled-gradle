package com.ss.android.lark.calendar.api.entity;

import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;", "", "isPstnEnabled", "", "pstnCopyMessage", "", "defaultPhoneNumber", "adminSettings", "Lcom/ss/android/lark/pb/videoconference/v1/GetAdminSettingsResponse;", "(ZLjava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/pb/videoconference/v1/GetAdminSettingsResponse;)V", "getAdminSettings", "()Lcom/ss/android/lark/pb/videoconference/v1/GetAdminSettingsResponse;", "getDefaultPhoneNumber", "()Ljava/lang/String;", "()Z", "getPstnCopyMessage", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.api.entity.a */
public final class CalendarPstnDetailInfo {

    /* renamed from: a */
    private final boolean f74890a;

    /* renamed from: b */
    private final String f74891b;

    /* renamed from: c */
    private final String f74892c;

    /* renamed from: d */
    private final GetAdminSettingsResponse f74893d;

    public CalendarPstnDetailInfo() {
        this(false, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarPstnDetailInfo)) {
            return false;
        }
        CalendarPstnDetailInfo aVar = (CalendarPstnDetailInfo) obj;
        return this.f74890a == aVar.f74890a && Intrinsics.areEqual(this.f74891b, aVar.f74891b) && Intrinsics.areEqual(this.f74892c, aVar.f74892c) && Intrinsics.areEqual(this.f74893d, aVar.f74893d);
    }

    public int hashCode() {
        boolean z = this.f74890a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f74891b;
        int i5 = 0;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f74892c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        GetAdminSettingsResponse getAdminSettingsResponse = this.f74893d;
        if (getAdminSettingsResponse != null) {
            i5 = getAdminSettingsResponse.hashCode();
        }
        return hashCode2 + i5;
    }

    public String toString() {
        return "CalendarPstnDetailInfo(isPstnEnabled=" + this.f74890a + ", pstnCopyMessage=" + this.f74891b + ", defaultPhoneNumber=" + this.f74892c + ", adminSettings=" + this.f74893d + ")";
    }

    /* renamed from: a */
    public final boolean mo108374a() {
        return this.f74890a;
    }

    /* renamed from: b */
    public final String mo108375b() {
        return this.f74891b;
    }

    /* renamed from: c */
    public final String mo108376c() {
        return this.f74892c;
    }

    /* renamed from: d */
    public final GetAdminSettingsResponse mo108377d() {
        return this.f74893d;
    }

    public CalendarPstnDetailInfo(boolean z, String str, String str2, GetAdminSettingsResponse getAdminSettingsResponse) {
        this.f74890a = z;
        this.f74891b = str;
        this.f74892c = str2;
        this.f74893d = getAdminSettingsResponse;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarPstnDetailInfo(boolean z, String str, String str2, GetAdminSettingsResponse getAdminSettingsResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : getAdminSettingsResponse);
    }
}
