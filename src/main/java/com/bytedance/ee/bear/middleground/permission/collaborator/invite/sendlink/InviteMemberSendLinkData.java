package com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink;

import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity;
import com.bytedance.ee.util.io.NonProguard;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012¨\u00066"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkData;", "Lcom/bytedance/ee/util/io/NonProguard;", "sendLinkLimitNum", "", "askOwnerLimitNum", "notNotifyUsers", "", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserEntity;", "blockUsers", "blockedUsers", "privacyUsers", "inviteFailedUsers", "limitUsers", "ownerNotInGroups", "(IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAskOwnerLimitNum", "()I", "setAskOwnerLimitNum", "(I)V", "getBlockUsers", "()Ljava/util/List;", "setBlockUsers", "(Ljava/util/List;)V", "getBlockedUsers", "setBlockedUsers", "getInviteFailedUsers", "setInviteFailedUsers", "getLimitUsers", "setLimitUsers", "getNotNotifyUsers", "setNotNotifyUsers", "getOwnerNotInGroups", "setOwnerNotInGroups", "getPrivacyUsers", "setPrivacyUsers", "getSendLinkLimitNum", "setSendLinkLimitNum", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class InviteMemberSendLinkData implements NonProguard {
    private int askOwnerLimitNum;
    private List<? extends NotNotifyUserEntity> blockUsers;
    private List<? extends NotNotifyUserEntity> blockedUsers;
    private List<? extends NotNotifyUserEntity> inviteFailedUsers;
    private List<? extends NotNotifyUserEntity> limitUsers;
    private List<? extends NotNotifyUserEntity> notNotifyUsers;
    private List<? extends NotNotifyUserEntity> ownerNotInGroups;
    private List<? extends NotNotifyUserEntity> privacyUsers;
    private int sendLinkLimitNum;

    public InviteMemberSendLinkData() {
        this(0, 0, null, null, null, null, null, null, null, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
    }

    public static /* synthetic */ InviteMemberSendLinkData copy$default(InviteMemberSendLinkData inviteMemberSendLinkData, int i, int i2, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i3, Object obj) {
        return inviteMemberSendLinkData.copy((i3 & 1) != 0 ? inviteMemberSendLinkData.sendLinkLimitNum : i, (i3 & 2) != 0 ? inviteMemberSendLinkData.askOwnerLimitNum : i2, (i3 & 4) != 0 ? inviteMemberSendLinkData.notNotifyUsers : list, (i3 & 8) != 0 ? inviteMemberSendLinkData.blockUsers : list2, (i3 & 16) != 0 ? inviteMemberSendLinkData.blockedUsers : list3, (i3 & 32) != 0 ? inviteMemberSendLinkData.privacyUsers : list4, (i3 & 64) != 0 ? inviteMemberSendLinkData.inviteFailedUsers : list5, (i3 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? inviteMemberSendLinkData.limitUsers : list6, (i3 & DynamicModule.f58006b) != 0 ? inviteMemberSendLinkData.ownerNotInGroups : list7);
    }

    public final int component1() {
        return this.sendLinkLimitNum;
    }

    public final int component2() {
        return this.askOwnerLimitNum;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity>, java.util.List<com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity> */
    public final List<NotNotifyUserEntity> component3() {
        return this.notNotifyUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity>, java.util.List<com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity> */
    public final List<NotNotifyUserEntity> component4() {
        return this.blockUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity>, java.util.List<com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity> */
    public final List<NotNotifyUserEntity> component5() {
        return this.blockedUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity>, java.util.List<com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity> */
    public final List<NotNotifyUserEntity> component6() {
        return this.privacyUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity>, java.util.List<com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity> */
    public final List<NotNotifyUserEntity> component7() {
        return this.inviteFailedUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity>, java.util.List<com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity> */
    public final List<NotNotifyUserEntity> component8() {
        return this.limitUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity>, java.util.List<com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity> */
    public final List<NotNotifyUserEntity> component9() {
        return this.ownerNotInGroups;
    }

    public final InviteMemberSendLinkData copy(int i, int i2, List<? extends NotNotifyUserEntity> list, List<? extends NotNotifyUserEntity> list2, List<? extends NotNotifyUserEntity> list3, List<? extends NotNotifyUserEntity> list4, List<? extends NotNotifyUserEntity> list5, List<? extends NotNotifyUserEntity> list6, List<? extends NotNotifyUserEntity> list7) {
        return new InviteMemberSendLinkData(i, i2, list, list2, list3, list4, list5, list6, list7);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InviteMemberSendLinkData) {
                InviteMemberSendLinkData inviteMemberSendLinkData = (InviteMemberSendLinkData) obj;
                if (this.sendLinkLimitNum == inviteMemberSendLinkData.sendLinkLimitNum) {
                    if (!(this.askOwnerLimitNum == inviteMemberSendLinkData.askOwnerLimitNum) || !Intrinsics.areEqual(this.notNotifyUsers, inviteMemberSendLinkData.notNotifyUsers) || !Intrinsics.areEqual(this.blockUsers, inviteMemberSendLinkData.blockUsers) || !Intrinsics.areEqual(this.blockedUsers, inviteMemberSendLinkData.blockedUsers) || !Intrinsics.areEqual(this.privacyUsers, inviteMemberSendLinkData.privacyUsers) || !Intrinsics.areEqual(this.inviteFailedUsers, inviteMemberSendLinkData.inviteFailedUsers) || !Intrinsics.areEqual(this.limitUsers, inviteMemberSendLinkData.limitUsers) || !Intrinsics.areEqual(this.ownerNotInGroups, inviteMemberSendLinkData.ownerNotInGroups)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((this.sendLinkLimitNum * 31) + this.askOwnerLimitNum) * 31;
        List<? extends NotNotifyUserEntity> list = this.notNotifyUsers;
        int i2 = 0;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        List<? extends NotNotifyUserEntity> list2 = this.blockUsers;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<? extends NotNotifyUserEntity> list3 = this.blockedUsers;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<? extends NotNotifyUserEntity> list4 = this.privacyUsers;
        int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<? extends NotNotifyUserEntity> list5 = this.inviteFailedUsers;
        int hashCode5 = (hashCode4 + (list5 != null ? list5.hashCode() : 0)) * 31;
        List<? extends NotNotifyUserEntity> list6 = this.limitUsers;
        int hashCode6 = (hashCode5 + (list6 != null ? list6.hashCode() : 0)) * 31;
        List<? extends NotNotifyUserEntity> list7 = this.ownerNotInGroups;
        if (list7 != null) {
            i2 = list7.hashCode();
        }
        return hashCode6 + i2;
    }

    public String toString() {
        return "InviteMemberSendLinkData(sendLinkLimitNum=" + this.sendLinkLimitNum + ", askOwnerLimitNum=" + this.askOwnerLimitNum + ", notNotifyUsers=" + this.notNotifyUsers + ", blockUsers=" + this.blockUsers + ", blockedUsers=" + this.blockedUsers + ", privacyUsers=" + this.privacyUsers + ", inviteFailedUsers=" + this.inviteFailedUsers + ", limitUsers=" + this.limitUsers + ", ownerNotInGroups=" + this.ownerNotInGroups + ")";
    }

    public final int getAskOwnerLimitNum() {
        return this.askOwnerLimitNum;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity>, java.util.List<com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity> */
    public final List<NotNotifyUserEntity> getBlockUsers() {
        return this.blockUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity>, java.util.List<com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity> */
    public final List<NotNotifyUserEntity> getBlockedUsers() {
        return this.blockedUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity>, java.util.List<com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity> */
    public final List<NotNotifyUserEntity> getInviteFailedUsers() {
        return this.inviteFailedUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity>, java.util.List<com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity> */
    public final List<NotNotifyUserEntity> getLimitUsers() {
        return this.limitUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity>, java.util.List<com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity> */
    public final List<NotNotifyUserEntity> getNotNotifyUsers() {
        return this.notNotifyUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity>, java.util.List<com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity> */
    public final List<NotNotifyUserEntity> getOwnerNotInGroups() {
        return this.ownerNotInGroups;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity>, java.util.List<com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity> */
    public final List<NotNotifyUserEntity> getPrivacyUsers() {
        return this.privacyUsers;
    }

    public final int getSendLinkLimitNum() {
        return this.sendLinkLimitNum;
    }

    public final void setAskOwnerLimitNum(int i) {
        this.askOwnerLimitNum = i;
    }

    public final void setBlockUsers(List<? extends NotNotifyUserEntity> list) {
        this.blockUsers = list;
    }

    public final void setBlockedUsers(List<? extends NotNotifyUserEntity> list) {
        this.blockedUsers = list;
    }

    public final void setInviteFailedUsers(List<? extends NotNotifyUserEntity> list) {
        this.inviteFailedUsers = list;
    }

    public final void setLimitUsers(List<? extends NotNotifyUserEntity> list) {
        this.limitUsers = list;
    }

    public final void setNotNotifyUsers(List<? extends NotNotifyUserEntity> list) {
        this.notNotifyUsers = list;
    }

    public final void setOwnerNotInGroups(List<? extends NotNotifyUserEntity> list) {
        this.ownerNotInGroups = list;
    }

    public final void setPrivacyUsers(List<? extends NotNotifyUserEntity> list) {
        this.privacyUsers = list;
    }

    public final void setSendLinkLimitNum(int i) {
        this.sendLinkLimitNum = i;
    }

    public InviteMemberSendLinkData(int i, int i2, List<? extends NotNotifyUserEntity> list, List<? extends NotNotifyUserEntity> list2, List<? extends NotNotifyUserEntity> list3, List<? extends NotNotifyUserEntity> list4, List<? extends NotNotifyUserEntity> list5, List<? extends NotNotifyUserEntity> list6, List<? extends NotNotifyUserEntity> list7) {
        this.sendLinkLimitNum = i;
        this.askOwnerLimitNum = i2;
        this.notNotifyUsers = list;
        this.blockUsers = list2;
        this.blockedUsers = list3;
        this.privacyUsers = list4;
        this.inviteFailedUsers = list5;
        this.limitUsers = list6;
        this.ownerNotInGroups = list7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InviteMemberSendLinkData(int r11, int r12, java.util.List r13, java.util.List r14, java.util.List r15, java.util.List r16, java.util.List r17, java.util.List r18, java.util.List r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.InviteMemberSendLinkData.<init>(int, int, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
