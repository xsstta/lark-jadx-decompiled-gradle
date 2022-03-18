package com.ss.android.vc.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/ss/android/vc/entity/HistoryMeeting;", "", "id", "", "historyType", "Lcom/ss/android/vc/entity/VCHistoryType;", "eventInfo", "Lcom/ss/android/vc/entity/VCEventAbbrInfo;", "vcInfo", "Lcom/ss/android/vc/entity/VCMeetingAbbrInfo;", "(Ljava/lang/String;Lcom/ss/android/vc/entity/VCHistoryType;Lcom/ss/android/vc/entity/VCEventAbbrInfo;Lcom/ss/android/vc/entity/VCMeetingAbbrInfo;)V", "getEventInfo", "()Lcom/ss/android/vc/entity/VCEventAbbrInfo;", "setEventInfo", "(Lcom/ss/android/vc/entity/VCEventAbbrInfo;)V", "getHistoryType", "()Lcom/ss/android/vc/entity/VCHistoryType;", "setHistoryType", "(Lcom/ss/android/vc/entity/VCHistoryType;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getVcInfo", "()Lcom/ss/android/vc/entity/VCMeetingAbbrInfo;", "setVcInfo", "(Lcom/ss/android/vc/entity/VCMeetingAbbrInfo;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.e */
public final class HistoryMeeting {

    /* renamed from: a */
    private String f152490a;

    /* renamed from: b */
    private VCHistoryType f152491b;

    /* renamed from: c */
    private VCEventAbbrInfo f152492c;

    /* renamed from: d */
    private VCMeetingAbbrInfo f152493d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryMeeting)) {
            return false;
        }
        HistoryMeeting eVar = (HistoryMeeting) obj;
        return Intrinsics.areEqual(this.f152490a, eVar.f152490a) && Intrinsics.areEqual(this.f152491b, eVar.f152491b) && Intrinsics.areEqual(this.f152492c, eVar.f152492c) && Intrinsics.areEqual(this.f152493d, eVar.f152493d);
    }

    public int hashCode() {
        String str = this.f152490a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        VCHistoryType vCHistoryType = this.f152491b;
        int hashCode2 = (hashCode + (vCHistoryType != null ? vCHistoryType.hashCode() : 0)) * 31;
        VCEventAbbrInfo rVar = this.f152492c;
        int hashCode3 = (hashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        VCMeetingAbbrInfo sVar = this.f152493d;
        if (sVar != null) {
            i = sVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "HistoryMeeting(id=" + this.f152490a + ", historyType=" + this.f152491b + ", eventInfo=" + this.f152492c + ", vcInfo=" + this.f152493d + ")";
    }

    public HistoryMeeting(String str, VCHistoryType vCHistoryType, VCEventAbbrInfo rVar, VCMeetingAbbrInfo sVar) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(vCHistoryType, "historyType");
        this.f152490a = str;
        this.f152491b = vCHistoryType;
        this.f152492c = rVar;
        this.f152493d = sVar;
    }
}
