package com.ss.android.vc.meeting.utils.meetingcheck;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.JoinMeetingPreCheckEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0002\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/ss/android/vc/meeting/utils/meetingcheck/MeetingCheckData;", "", "isPassed", "", "response", "Lcom/ss/android/vc/entity/response/JoinMeetingPreCheckEntity;", "vendorType", "Lcom/ss/android/vc/entity/VideoChat$VendorType;", "(Ljava/lang/Boolean;Lcom/ss/android/vc/entity/response/JoinMeetingPreCheckEntity;Lcom/ss/android/vc/entity/VideoChat$VendorType;)V", "()Ljava/lang/Boolean;", "setPassed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getResponse", "()Lcom/ss/android/vc/entity/response/JoinMeetingPreCheckEntity;", "setResponse", "(Lcom/ss/android/vc/entity/response/JoinMeetingPreCheckEntity;)V", "getVendorType", "()Lcom/ss/android/vc/entity/VideoChat$VendorType;", "setVendorType", "(Lcom/ss/android/vc/entity/VideoChat$VendorType;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lcom/ss/android/vc/entity/response/JoinMeetingPreCheckEntity;Lcom/ss/android/vc/entity/VideoChat$VendorType;)Lcom/ss/android/vc/meeting/utils/meetingcheck/MeetingCheckData;", "equals", "other", "hashCode", "", "toString", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.utils.meetingcheck.b */
public final class MeetingCheckData {

    /* renamed from: a */
    private Boolean f160466a;

    /* renamed from: b */
    private JoinMeetingPreCheckEntity f160467b;

    /* renamed from: c */
    private VideoChat.VendorType f160468c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeetingCheckData)) {
            return false;
        }
        MeetingCheckData bVar = (MeetingCheckData) obj;
        return Intrinsics.areEqual(this.f160466a, bVar.f160466a) && Intrinsics.areEqual(this.f160467b, bVar.f160467b) && Intrinsics.areEqual(this.f160468c, bVar.f160468c);
    }

    public int hashCode() {
        Boolean bool = this.f160466a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        JoinMeetingPreCheckEntity joinMeetingPreCheckEntity = this.f160467b;
        int hashCode2 = (hashCode + (joinMeetingPreCheckEntity != null ? joinMeetingPreCheckEntity.hashCode() : 0)) * 31;
        VideoChat.VendorType vendorType = this.f160468c;
        if (vendorType != null) {
            i = vendorType.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "MeetingCheckData(isPassed=" + this.f160466a + ", response=" + this.f160467b + ", vendorType=" + this.f160468c + ")";
    }

    /* renamed from: a */
    public final Boolean mo219661a() {
        return this.f160466a;
    }

    /* renamed from: b */
    public final JoinMeetingPreCheckEntity mo219665b() {
        return this.f160467b;
    }

    /* renamed from: c */
    public final VideoChat.VendorType mo219666c() {
        return this.f160468c;
    }

    /* renamed from: a */
    public final void mo219662a(VideoChat.VendorType vendorType) {
        this.f160468c = vendorType;
    }

    /* renamed from: a */
    public final void mo219663a(JoinMeetingPreCheckEntity joinMeetingPreCheckEntity) {
        this.f160467b = joinMeetingPreCheckEntity;
    }

    /* renamed from: a */
    public final void mo219664a(Boolean bool) {
        this.f160466a = bool;
    }

    public MeetingCheckData(Boolean bool, JoinMeetingPreCheckEntity joinMeetingPreCheckEntity, VideoChat.VendorType vendorType) {
        this.f160466a = bool;
        this.f160467b = joinMeetingPreCheckEntity;
        this.f160468c = vendorType;
    }
}
