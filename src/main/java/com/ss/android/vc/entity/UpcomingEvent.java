package com.ss.android.vc.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/ss/android/vc/entity/UpcomingEvent;", "", "id", "", "eventInfo", "Lcom/ss/android/vc/entity/VCEventAbbrInfo;", "vcInfo", "Lcom/ss/android/vc/entity/VCMeetingAbbrInfo;", "(Ljava/lang/String;Lcom/ss/android/vc/entity/VCEventAbbrInfo;Lcom/ss/android/vc/entity/VCMeetingAbbrInfo;)V", "getEventInfo", "()Lcom/ss/android/vc/entity/VCEventAbbrInfo;", "setEventInfo", "(Lcom/ss/android/vc/entity/VCEventAbbrInfo;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getVcInfo", "()Lcom/ss/android/vc/entity/VCMeetingAbbrInfo;", "setVcInfo", "(Lcom/ss/android/vc/entity/VCMeetingAbbrInfo;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.n */
public final class UpcomingEvent {

    /* renamed from: a */
    private String f152542a;

    /* renamed from: b */
    private VCEventAbbrInfo f152543b;

    /* renamed from: c */
    private VCMeetingAbbrInfo f152544c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpcomingEvent)) {
            return false;
        }
        UpcomingEvent nVar = (UpcomingEvent) obj;
        return Intrinsics.areEqual(this.f152542a, nVar.f152542a) && Intrinsics.areEqual(this.f152543b, nVar.f152543b) && Intrinsics.areEqual(this.f152544c, nVar.f152544c);
    }

    public int hashCode() {
        String str = this.f152542a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        VCEventAbbrInfo rVar = this.f152543b;
        int hashCode2 = (hashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        VCMeetingAbbrInfo sVar = this.f152544c;
        if (sVar != null) {
            i = sVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "UpcomingEvent(id=" + this.f152542a + ", eventInfo=" + this.f152543b + ", vcInfo=" + this.f152544c + ")";
    }

    public UpcomingEvent(String str, VCEventAbbrInfo rVar, VCMeetingAbbrInfo sVar) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(rVar, "eventInfo");
        this.f152542a = str;
        this.f152543b = rVar;
        this.f152544c = sVar;
    }
}
