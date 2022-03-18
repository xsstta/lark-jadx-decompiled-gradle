package com.ss.android.lark.mm.module.participant.model;

import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J;\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/model/ParticipantModel;", "Ljava/io/Serializable;", "participantsData", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "suggestionData", "selectedUsers", "", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "uuid", "", "(Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;Ljava/util/List;Ljava/lang/String;)V", "getParticipantsData", "()Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "setParticipantsData", "(Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;)V", "getSelectedUsers", "()Ljava/util/List;", "setSelectedUsers", "(Ljava/util/List;)V", "getSuggestionData", "setSuggestionData", "getUuid", "()Ljava/lang/String;", "setUuid", "(Ljava/lang/String;)V", "clear", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ParticipantModel implements Serializable {
    private MmParticipants participantsData;
    private List<MmParticipants.MmParticipantInfo> selectedUsers;
    private MmParticipants suggestionData;
    private String uuid;

    public ParticipantModel() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.participant.model.ParticipantModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParticipantModel copy$default(ParticipantModel participantModel, MmParticipants mmParticipants, MmParticipants mmParticipants2, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            mmParticipants = participantModel.participantsData;
        }
        if ((i & 2) != 0) {
            mmParticipants2 = participantModel.suggestionData;
        }
        if ((i & 4) != 0) {
            list = participantModel.selectedUsers;
        }
        if ((i & 8) != 0) {
            str = participantModel.uuid;
        }
        return participantModel.copy(mmParticipants, mmParticipants2, list, str);
    }

    public final MmParticipants component1() {
        return this.participantsData;
    }

    public final MmParticipants component2() {
        return this.suggestionData;
    }

    public final List<MmParticipants.MmParticipantInfo> component3() {
        return this.selectedUsers;
    }

    public final String component4() {
        return this.uuid;
    }

    public final ParticipantModel copy(MmParticipants mmParticipants, MmParticipants mmParticipants2, List<MmParticipants.MmParticipantInfo> list, String str) {
        Intrinsics.checkParameterIsNotNull(list, "selectedUsers");
        Intrinsics.checkParameterIsNotNull(str, "uuid");
        return new ParticipantModel(mmParticipants, mmParticipants2, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParticipantModel)) {
            return false;
        }
        ParticipantModel participantModel = (ParticipantModel) obj;
        return Intrinsics.areEqual(this.participantsData, participantModel.participantsData) && Intrinsics.areEqual(this.suggestionData, participantModel.suggestionData) && Intrinsics.areEqual(this.selectedUsers, participantModel.selectedUsers) && Intrinsics.areEqual(this.uuid, participantModel.uuid);
    }

    public int hashCode() {
        MmParticipants mmParticipants = this.participantsData;
        int i = 0;
        int hashCode = (mmParticipants != null ? mmParticipants.hashCode() : 0) * 31;
        MmParticipants mmParticipants2 = this.suggestionData;
        int hashCode2 = (hashCode + (mmParticipants2 != null ? mmParticipants2.hashCode() : 0)) * 31;
        List<MmParticipants.MmParticipantInfo> list = this.selectedUsers;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.uuid;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ParticipantModel(participantsData=" + this.participantsData + ", suggestionData=" + this.suggestionData + ", selectedUsers=" + this.selectedUsers + ", uuid=" + this.uuid + ")";
    }

    public final MmParticipants getParticipantsData() {
        return this.participantsData;
    }

    public final List<MmParticipants.MmParticipantInfo> getSelectedUsers() {
        return this.selectedUsers;
    }

    public final MmParticipants getSuggestionData() {
        return this.suggestionData;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void clear() {
        MmParticipants mmParticipants = null;
        this.participantsData = mmParticipants;
        this.suggestionData = mmParticipants;
        this.selectedUsers.clear();
        String uuid2 = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid2, "UUID.randomUUID().toString()");
        this.uuid = uuid2;
    }

    public final void setParticipantsData(MmParticipants mmParticipants) {
        this.participantsData = mmParticipants;
    }

    public final void setSuggestionData(MmParticipants mmParticipants) {
        this.suggestionData = mmParticipants;
    }

    public final void setSelectedUsers(List<MmParticipants.MmParticipantInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.selectedUsers = list;
    }

    public final void setUuid(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.uuid = str;
    }

    public ParticipantModel(MmParticipants mmParticipants, MmParticipants mmParticipants2, List<MmParticipants.MmParticipantInfo> list, String str) {
        Intrinsics.checkParameterIsNotNull(list, "selectedUsers");
        Intrinsics.checkParameterIsNotNull(str, "uuid");
        this.participantsData = mmParticipants;
        this.suggestionData = mmParticipants2;
        this.selectedUsers = list;
        this.uuid = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ParticipantModel(com.ss.android.lark.mm.module.participant.model.MmParticipants r2, com.ss.android.lark.mm.module.participant.model.MmParticipants r3, java.util.List r4, java.lang.String r5, int r6, kotlin.jvm.internal.DefaultConstructorMarker r7) {
        /*
            r1 = this;
            r7 = r6 & 1
            r0 = 0
            if (r7 == 0) goto L_0x0008
            r2 = r0
            com.ss.android.lark.mm.module.participant.model.MmParticipants r2 = (com.ss.android.lark.mm.module.participant.model.MmParticipants) r2
        L_0x0008:
            r7 = r6 & 2
            if (r7 == 0) goto L_0x000f
            r3 = r0
            com.ss.android.lark.mm.module.participant.model.MmParticipants r3 = (com.ss.android.lark.mm.module.participant.model.MmParticipants) r3
        L_0x000f:
            r7 = r6 & 4
            if (r7 == 0) goto L_0x001a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
        L_0x001a:
            r6 = r6 & 8
            if (r6 == 0) goto L_0x002b
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "UUID.randomUUID().toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
        L_0x002b:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.participant.model.ParticipantModel.<init>(com.ss.android.lark.mm.module.participant.model.MmParticipants, com.ss.android.lark.mm.module.participant.model.MmParticipants, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
