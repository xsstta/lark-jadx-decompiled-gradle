package com.ss.android.lark.create.groupchat.dto;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0001@Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÂ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003Jm\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u00107\u001a\u00020\u00032\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\u0010\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010)J\t\u0010?\u001a\u00020\bHÖ\u0001R\u000e\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0018\"\u0004\b\u001b\u0010\u001aR\u001a\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0018\"\u0004\b\u001e\u0010\u001aR$\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001a¨\u0006A"}, d2 = {"Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "Ljava/io/Serializable;", "isOpenChat", "", "mode", "Lcom/ss/android/lark/create/groupchat/dto/CreateGroupMode;", "_isPublic", "name", "", "description", "fromChatId", "showGroupTypeSelector", "isCreateTopicGroup", "isCrossTenant", "isCrossWithKa", "(ZLcom/ss/android/lark/create/groupchat/dto/CreateGroupMode;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getFromChatId", "setFromChatId", "hasMultiEntity", "getHasMultiEntity", "()Z", "setHasMultiEntity", "(Z)V", "setCreateTopicGroup", "setCrossTenant", "setCrossWithKa", "setOpenChat", "value", "isPublic", "setPublic", "getMode", "()Lcom/ss/android/lark/create/groupchat/dto/CreateGroupMode;", "setMode", "(Lcom/ss/android/lark/create/groupchat/dto/CreateGroupMode;)V", "getName", "setName", "onTypeChangeListener", "Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo$OnTypeChangeListener;", "getShowGroupTypeSelector", "setShowGroupTypeSelector", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "setTypeChangeListener", "", "listener", "toString", "OnTypeChangeListener", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupCreateInfo implements Serializable {
    private boolean _isPublic;
    private String description;
    private String fromChatId;
    private boolean hasMultiEntity;
    private boolean isCreateTopicGroup;
    private boolean isCrossTenant;
    private boolean isCrossWithKa;
    private boolean isOpenChat;
    private boolean isPublic;
    private CreateGroupMode mode;
    private String name;
    private transient OnTypeChangeListener onTypeChangeListener;
    private boolean showGroupTypeSelector;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo$OnTypeChangeListener;", "", "onTypeChanged", "", "isPublic", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.dto.GroupCreateInfo$a */
    public interface OnTypeChangeListener {
        void onTypeChanged(boolean z);
    }

    public GroupCreateInfo() {
        this(false, null, false, null, null, null, false, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
    }

    private final boolean component3() {
        return this._isPublic;
    }

    public static /* synthetic */ GroupCreateInfo copy$default(GroupCreateInfo groupCreateInfo, boolean z, CreateGroupMode createGroupMode, boolean z2, String str, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        return groupCreateInfo.copy((i & 1) != 0 ? groupCreateInfo.isOpenChat : z, (i & 2) != 0 ? groupCreateInfo.mode : createGroupMode, (i & 4) != 0 ? groupCreateInfo._isPublic : z2, (i & 8) != 0 ? groupCreateInfo.name : str, (i & 16) != 0 ? groupCreateInfo.description : str2, (i & 32) != 0 ? groupCreateInfo.fromChatId : str3, (i & 64) != 0 ? groupCreateInfo.showGroupTypeSelector : z3, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? groupCreateInfo.isCreateTopicGroup : z4, (i & DynamicModule.f58006b) != 0 ? groupCreateInfo.isCrossTenant : z5, (i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? groupCreateInfo.isCrossWithKa : z6);
    }

    public final boolean component1() {
        return this.isOpenChat;
    }

    public final boolean component10() {
        return this.isCrossWithKa;
    }

    public final CreateGroupMode component2() {
        return this.mode;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.fromChatId;
    }

    public final boolean component7() {
        return this.showGroupTypeSelector;
    }

    public final boolean component8() {
        return this.isCreateTopicGroup;
    }

    public final boolean component9() {
        return this.isCrossTenant;
    }

    public final GroupCreateInfo copy(boolean z, CreateGroupMode createGroupMode, boolean z2, String str, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkParameterIsNotNull(createGroupMode, "mode");
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "description");
        Intrinsics.checkParameterIsNotNull(str3, "fromChatId");
        return new GroupCreateInfo(z, createGroupMode, z2, str, str2, str3, z3, z4, z5, z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupCreateInfo)) {
            return false;
        }
        GroupCreateInfo groupCreateInfo = (GroupCreateInfo) obj;
        return this.isOpenChat == groupCreateInfo.isOpenChat && Intrinsics.areEqual(this.mode, groupCreateInfo.mode) && this._isPublic == groupCreateInfo._isPublic && Intrinsics.areEqual(this.name, groupCreateInfo.name) && Intrinsics.areEqual(this.description, groupCreateInfo.description) && Intrinsics.areEqual(this.fromChatId, groupCreateInfo.fromChatId) && this.showGroupTypeSelector == groupCreateInfo.showGroupTypeSelector && this.isCreateTopicGroup == groupCreateInfo.isCreateTopicGroup && this.isCrossTenant == groupCreateInfo.isCrossTenant && this.isCrossWithKa == groupCreateInfo.isCrossWithKa;
    }

    public int hashCode() {
        boolean z = this.isOpenChat;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        CreateGroupMode createGroupMode = this.mode;
        int i6 = 0;
        int hashCode = (i5 + (createGroupMode != null ? createGroupMode.hashCode() : 0)) * 31;
        boolean z2 = this._isPublic;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (hashCode + i7) * 31;
        String str = this.name;
        int hashCode2 = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.fromChatId;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        int i11 = (hashCode3 + i6) * 31;
        boolean z3 = this.showGroupTypeSelector;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        boolean z4 = this.isCreateTopicGroup;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        boolean z5 = this.isCrossTenant;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        boolean z6 = this.isCrossWithKa;
        if (!z6) {
            i = z6 ? 1 : 0;
        }
        return i23 + i;
    }

    public String toString() {
        return "GroupCreateInfo(isOpenChat=" + this.isOpenChat + ", mode=" + this.mode + ", _isPublic=" + this._isPublic + ", name=" + this.name + ", description=" + this.description + ", fromChatId=" + this.fromChatId + ", showGroupTypeSelector=" + this.showGroupTypeSelector + ", isCreateTopicGroup=" + this.isCreateTopicGroup + ", isCrossTenant=" + this.isCrossTenant + ", isCrossWithKa=" + this.isCrossWithKa + ")";
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFromChatId() {
        return this.fromChatId;
    }

    public final boolean getHasMultiEntity() {
        return this.hasMultiEntity;
    }

    public final CreateGroupMode getMode() {
        return this.mode;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getShowGroupTypeSelector() {
        return this.showGroupTypeSelector;
    }

    public final boolean isCreateTopicGroup() {
        return this.isCreateTopicGroup;
    }

    public final boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public final boolean isCrossWithKa() {
        return this.isCrossWithKa;
    }

    public final boolean isOpenChat() {
        return this.isOpenChat;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final void setCreateTopicGroup(boolean z) {
        this.isCreateTopicGroup = z;
    }

    public final void setCrossTenant(boolean z) {
        this.isCrossTenant = z;
    }

    public final void setCrossWithKa(boolean z) {
        this.isCrossWithKa = z;
    }

    public final void setHasMultiEntity(boolean z) {
        this.hasMultiEntity = z;
    }

    public final void setOpenChat(boolean z) {
        this.isOpenChat = z;
    }

    public final void setShowGroupTypeSelector(boolean z) {
        this.showGroupTypeSelector = z;
    }

    public final void setTypeChangeListener(OnTypeChangeListener aVar) {
        this.onTypeChangeListener = aVar;
    }

    public final void setDescription(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.description = str;
    }

    public final void setFromChatId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.fromChatId = str;
    }

    public final void setMode(CreateGroupMode createGroupMode) {
        Intrinsics.checkParameterIsNotNull(createGroupMode, "<set-?>");
        this.mode = createGroupMode;
    }

    public final void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    public final void setPublic(boolean z) {
        boolean z2;
        OnTypeChangeListener aVar;
        if (this.isPublic != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isPublic = z;
        this._isPublic = z;
        if (!this.isCreateTopicGroup && z2 && (aVar = this.onTypeChangeListener) != null) {
            aVar.onTypeChanged(z);
        }
    }

    public GroupCreateInfo(boolean z, CreateGroupMode createGroupMode, boolean z2, String str, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkParameterIsNotNull(createGroupMode, "mode");
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "description");
        Intrinsics.checkParameterIsNotNull(str3, "fromChatId");
        this.isOpenChat = z;
        this.mode = createGroupMode;
        this._isPublic = z2;
        this.name = str;
        this.description = str2;
        this.fromChatId = str3;
        this.showGroupTypeSelector = z3;
        this.isCreateTopicGroup = z4;
        this.isCrossTenant = z5;
        this.isCrossWithKa = z6;
        this.isPublic = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GroupCreateInfo(boolean r12, com.ss.android.lark.create.groupchat.dto.CreateGroupMode r13, boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.create.groupchat.dto.GroupCreateInfo.<init>(boolean, com.ss.android.lark.create.groupchat.dto.CreateGroupMode, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
