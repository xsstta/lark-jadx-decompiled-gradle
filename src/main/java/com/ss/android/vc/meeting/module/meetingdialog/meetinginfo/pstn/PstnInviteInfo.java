package com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/PstnInviteInfo;", "", "country", "", "telNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "getTelNumber", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.e */
public final class PstnInviteInfo {

    /* renamed from: a */
    private final String f156603a;

    /* renamed from: b */
    private final String f156604b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PstnInviteInfo)) {
            return false;
        }
        PstnInviteInfo eVar = (PstnInviteInfo) obj;
        return Intrinsics.areEqual(this.f156603a, eVar.f156603a) && Intrinsics.areEqual(this.f156604b, eVar.f156604b);
    }

    public int hashCode() {
        String str = this.f156603a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f156604b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "PstnInviteInfo(country=" + this.f156603a + ", telNumber=" + this.f156604b + ")";
    }

    /* renamed from: a */
    public final String mo215502a() {
        return this.f156603a;
    }

    /* renamed from: b */
    public final String mo215503b() {
        return this.f156604b;
    }

    public PstnInviteInfo(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "country");
        Intrinsics.checkParameterIsNotNull(str2, "telNumber");
        this.f156603a = str;
        this.f156604b = str2;
    }
}
