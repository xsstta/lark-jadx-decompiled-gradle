package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\b\u0010 \u001a\u00020\u0003H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/ss/android/vc/entity/InMeetingUpdateMessage;", "Ljava/io/Serializable;", "meetingId", "", "inMeetingInfo", "Lcom/ss/android/vc/entity/VideoChatInMeetingInfo;", "participants", "", "Lcom/ss/android/vc/entity/Participant;", "(Ljava/lang/String;Lcom/ss/android/vc/entity/VideoChatInMeetingInfo;Ljava/util/List;)V", "getInMeetingInfo", "()Lcom/ss/android/vc/entity/VideoChatInMeetingInfo;", "setInMeetingInfo", "(Lcom/ss/android/vc/entity/VideoChatInMeetingInfo;)V", "getMeetingId", "()Ljava/lang/String;", "setMeetingId", "(Ljava/lang/String;)V", "getParticipants", "()Ljava/util/List;", "setParticipants", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InMeetingUpdateMessage implements Serializable {
    private VideoChatInMeetingInfo inMeetingInfo;
    private String meetingId;
    private List<? extends Participant> participants;

    public InMeetingUpdateMessage() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.vc.entity.InMeetingUpdateMessage */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InMeetingUpdateMessage copy$default(InMeetingUpdateMessage inMeetingUpdateMessage, String str, VideoChatInMeetingInfo videoChatInMeetingInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inMeetingUpdateMessage.meetingId;
        }
        if ((i & 2) != 0) {
            videoChatInMeetingInfo = inMeetingUpdateMessage.inMeetingInfo;
        }
        if ((i & 4) != 0) {
            list = inMeetingUpdateMessage.participants;
        }
        return inMeetingUpdateMessage.copy(str, videoChatInMeetingInfo, list);
    }

    public final String component1() {
        return this.meetingId;
    }

    public final VideoChatInMeetingInfo component2() {
        return this.inMeetingInfo;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.vc.entity.Participant>, java.util.List<com.ss.android.vc.entity.Participant> */
    public final List<Participant> component3() {
        return this.participants;
    }

    public final InMeetingUpdateMessage copy(String str, VideoChatInMeetingInfo videoChatInMeetingInfo, List<? extends Participant> list) {
        return new InMeetingUpdateMessage(str, videoChatInMeetingInfo, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InMeetingUpdateMessage)) {
            return false;
        }
        InMeetingUpdateMessage inMeetingUpdateMessage = (InMeetingUpdateMessage) obj;
        return Intrinsics.areEqual(this.meetingId, inMeetingUpdateMessage.meetingId) && Intrinsics.areEqual(this.inMeetingInfo, inMeetingUpdateMessage.inMeetingInfo) && Intrinsics.areEqual(this.participants, inMeetingUpdateMessage.participants);
    }

    public int hashCode() {
        String str = this.meetingId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        VideoChatInMeetingInfo videoChatInMeetingInfo = this.inMeetingInfo;
        int hashCode2 = (hashCode + (videoChatInMeetingInfo != null ? videoChatInMeetingInfo.hashCode() : 0)) * 31;
        List<? extends Participant> list = this.participants;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final VideoChatInMeetingInfo getInMeetingInfo() {
        return this.inMeetingInfo;
    }

    public final String getMeetingId() {
        return this.meetingId;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.vc.entity.Participant>, java.util.List<com.ss.android.vc.entity.Participant> */
    public final List<Participant> getParticipants() {
        return this.participants;
    }

    public String toString() {
        return "InMeetingUpdateMessage(meetingId=" + this.meetingId + ", inMeetingInfo=" + this.inMeetingInfo + ')';
    }

    public final void setInMeetingInfo(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        this.inMeetingInfo = videoChatInMeetingInfo;
    }

    public final void setMeetingId(String str) {
        this.meetingId = str;
    }

    public final void setParticipants(List<? extends Participant> list) {
        this.participants = list;
    }

    public InMeetingUpdateMessage(String str, VideoChatInMeetingInfo videoChatInMeetingInfo, List<? extends Participant> list) {
        this.meetingId = str;
        this.inMeetingInfo = videoChatInMeetingInfo;
        this.participants = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InMeetingUpdateMessage(String str, VideoChatInMeetingInfo videoChatInMeetingInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : videoChatInMeetingInfo, (i & 4) != 0 ? null : list);
    }
}
