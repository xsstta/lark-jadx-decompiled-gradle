package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ss/android/vc/entity/ParticipantChange;", "Ljava/io/Serializable;", "meetingId", "", "upsertParticipants", "", "Lcom/ss/android/vc/entity/Participant;", "removeParticipants", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getMeetingId", "()Ljava/lang/String;", "setMeetingId", "(Ljava/lang/String;)V", "getRemoveParticipants", "()Ljava/util/List;", "setRemoveParticipants", "(Ljava/util/List;)V", "getUpsertParticipants", "setUpsertParticipants", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ParticipantChange implements Serializable {
    private String meetingId;
    private List<? extends Participant> removeParticipants;
    private List<? extends Participant> upsertParticipants;

    public ParticipantChange() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.vc.entity.ParticipantChange */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParticipantChange copy$default(ParticipantChange participantChange, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = participantChange.meetingId;
        }
        if ((i & 2) != 0) {
            list = participantChange.upsertParticipants;
        }
        if ((i & 4) != 0) {
            list2 = participantChange.removeParticipants;
        }
        return participantChange.copy(str, list, list2);
    }

    public final String component1() {
        return this.meetingId;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.vc.entity.Participant>, java.util.List<com.ss.android.vc.entity.Participant> */
    public final List<Participant> component2() {
        return this.upsertParticipants;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.vc.entity.Participant>, java.util.List<com.ss.android.vc.entity.Participant> */
    public final List<Participant> component3() {
        return this.removeParticipants;
    }

    public final ParticipantChange copy(String str, List<? extends Participant> list, List<? extends Participant> list2) {
        return new ParticipantChange(str, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParticipantChange)) {
            return false;
        }
        ParticipantChange participantChange = (ParticipantChange) obj;
        return Intrinsics.areEqual(this.meetingId, participantChange.meetingId) && Intrinsics.areEqual(this.upsertParticipants, participantChange.upsertParticipants) && Intrinsics.areEqual(this.removeParticipants, participantChange.removeParticipants);
    }

    public int hashCode() {
        String str = this.meetingId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<? extends Participant> list = this.upsertParticipants;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<? extends Participant> list2 = this.removeParticipants;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ParticipantChange(meetingId=" + this.meetingId + ", upsertParticipants=" + this.upsertParticipants + ", removeParticipants=" + this.removeParticipants + ")";
    }

    public final String getMeetingId() {
        return this.meetingId;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.vc.entity.Participant>, java.util.List<com.ss.android.vc.entity.Participant> */
    public final List<Participant> getRemoveParticipants() {
        return this.removeParticipants;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.vc.entity.Participant>, java.util.List<com.ss.android.vc.entity.Participant> */
    public final List<Participant> getUpsertParticipants() {
        return this.upsertParticipants;
    }

    public final void setMeetingId(String str) {
        this.meetingId = str;
    }

    public final void setRemoveParticipants(List<? extends Participant> list) {
        this.removeParticipants = list;
    }

    public final void setUpsertParticipants(List<? extends Participant> list) {
        this.upsertParticipants = list;
    }

    public ParticipantChange(String str, List<? extends Participant> list, List<? extends Participant> list2) {
        this.meetingId = str;
        this.upsertParticipants = list;
        this.removeParticipants = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParticipantChange(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
