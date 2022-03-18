package com.ss.android.vc.meeting.module.share;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.entity.CalendarInfo;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\f¢\u0006\u0002\u0010\u001aJ\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\nHÆ\u0003J\t\u0010D\u001a\u00020\nHÆ\u0003J\t\u0010E\u001a\u00020\u0012HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010I\u001a\u00020\nHÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\fHÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\bHÆ\u0003J\t\u0010O\u001a\u00020\nHÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\t\u0010R\u001a\u00020\nHÆ\u0003JÑ\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\n2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\fHÆ\u0001J\u0013\u0010T\u001a\u00020\n2\b\u0010U\u001a\u0004\u0018\u00010VHÖ\u0003J\t\u0010W\u001a\u00020XHÖ\u0001J\t\u0010Y\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010+R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R\u001a\u0010\u0017\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010&\"\u0004\b0\u0010(R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010&R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010&R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010&\"\u0004\b1\u0010(R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\"\"\u0004\b5\u0010$R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\"\"\u0004\b7\u0010$R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010 \"\u0004\b9\u0010+R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006Z"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Ljava/io/Serializable;", "id", "", "name", "imageKey", "desc", ShareHitPoint.f121869d, "Lcom/ss/android/vc/meeting/module/share/ShareItemType;", "isSecret", "", "hitTerms", "", "subtitleHitTerms", "isExternal", "isLeave", "hasPermission", "zenModeEndTime", "", "acceptStatus", "Lcom/ss/android/vc/entity/CalendarInfo$CalendarAcceptStatus;", "p2pChatterId", "p2pChatId", "isBlocked", "customStatuses", "Lcom/ss/android/lark/chat/entity/chatter/ChatterCustomStatus;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/vc/meeting/module/share/ShareItemType;ZLjava/util/List;Ljava/util/List;ZZZJLcom/ss/android/vc/entity/CalendarInfo$CalendarAcceptStatus;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getAcceptStatus", "()Lcom/ss/android/vc/entity/CalendarInfo$CalendarAcceptStatus;", "setAcceptStatus", "(Lcom/ss/android/vc/entity/CalendarInfo$CalendarAcceptStatus;)V", "getCustomStatuses", "()Ljava/util/List;", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getHasPermission", "()Z", "setHasPermission", "(Z)V", "getHitTerms", "setHitTerms", "(Ljava/util/List;)V", "getId", "setId", "getImageKey", "setImageKey", "setBlocked", "setSecret", "getName", "setName", "getP2pChatId", "setP2pChatId", "getP2pChatterId", "setP2pChatterId", "getSubtitleHitTerms", "setSubtitleHitTerms", "getType", "()Lcom/ss/android/vc/meeting/module/share/ShareItemType;", "setType", "(Lcom/ss/android/vc/meeting/module/share/ShareItemType;)V", "getZenModeEndTime", "()J", "setZenModeEndTime", "(J)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoChatShareItem implements Serializable {
    private CalendarInfo.CalendarAcceptStatus acceptStatus;
    private final List<ChatterCustomStatus> customStatuses;
    private String desc;
    private boolean hasPermission;
    private List<String> hitTerms;
    private String id;
    private String imageKey;
    private boolean isBlocked;
    private final boolean isExternal;
    private final boolean isLeave;
    private boolean isSecret;
    private String name;
    private String p2pChatId;
    private String p2pChatterId;
    private List<String> subtitleHitTerms;
    private ShareItemType type;
    private long zenModeEndTime;

    public static /* synthetic */ VideoChatShareItem copy$default(VideoChatShareItem videoChatShareItem, String str, String str2, String str3, String str4, ShareItemType shareItemType, boolean z, List list, List list2, boolean z2, boolean z3, boolean z4, long j, CalendarInfo.CalendarAcceptStatus calendarAcceptStatus, String str5, String str6, boolean z5, List list3, int i, Object obj) {
        return videoChatShareItem.copy((i & 1) != 0 ? videoChatShareItem.id : str, (i & 2) != 0 ? videoChatShareItem.name : str2, (i & 4) != 0 ? videoChatShareItem.imageKey : str3, (i & 8) != 0 ? videoChatShareItem.desc : str4, (i & 16) != 0 ? videoChatShareItem.type : shareItemType, (i & 32) != 0 ? videoChatShareItem.isSecret : z, (i & 64) != 0 ? videoChatShareItem.hitTerms : list, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? videoChatShareItem.subtitleHitTerms : list2, (i & DynamicModule.f58006b) != 0 ? videoChatShareItem.isExternal : z2, (i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? videoChatShareItem.isLeave : z3, (i & 1024) != 0 ? videoChatShareItem.hasPermission : z4, (i & 2048) != 0 ? videoChatShareItem.zenModeEndTime : j, (i & 4096) != 0 ? videoChatShareItem.acceptStatus : calendarAcceptStatus, (i & 8192) != 0 ? videoChatShareItem.p2pChatterId : str5, (i & 16384) != 0 ? videoChatShareItem.p2pChatId : str6, (i & 32768) != 0 ? videoChatShareItem.isBlocked : z5, (i & 65536) != 0 ? videoChatShareItem.customStatuses : list3);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.isLeave;
    }

    public final boolean component11() {
        return this.hasPermission;
    }

    public final long component12() {
        return this.zenModeEndTime;
    }

    public final CalendarInfo.CalendarAcceptStatus component13() {
        return this.acceptStatus;
    }

    public final String component14() {
        return this.p2pChatterId;
    }

    public final String component15() {
        return this.p2pChatId;
    }

    public final boolean component16() {
        return this.isBlocked;
    }

    public final List<ChatterCustomStatus> component17() {
        return this.customStatuses;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.imageKey;
    }

    public final String component4() {
        return this.desc;
    }

    public final ShareItemType component5() {
        return this.type;
    }

    public final boolean component6() {
        return this.isSecret;
    }

    public final List<String> component7() {
        return this.hitTerms;
    }

    public final List<String> component8() {
        return this.subtitleHitTerms;
    }

    public final boolean component9() {
        return this.isExternal;
    }

    public final VideoChatShareItem copy(String str, String str2, String str3, String str4, ShareItemType shareItemType, boolean z, List<String> list, List<String> list2, boolean z2, boolean z3, boolean z4, long j, CalendarInfo.CalendarAcceptStatus calendarAcceptStatus, String str5, String str6, boolean z5, List<ChatterCustomStatus> list3) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "imageKey");
        Intrinsics.checkParameterIsNotNull(str4, "desc");
        Intrinsics.checkParameterIsNotNull(shareItemType, ShareHitPoint.f121869d);
        return new VideoChatShareItem(str, str2, str3, str4, shareItemType, z, list, list2, z2, z3, z4, j, calendarAcceptStatus, str5, str6, z5, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChatShareItem)) {
            return false;
        }
        VideoChatShareItem videoChatShareItem = (VideoChatShareItem) obj;
        return Intrinsics.areEqual(this.id, videoChatShareItem.id) && Intrinsics.areEqual(this.name, videoChatShareItem.name) && Intrinsics.areEqual(this.imageKey, videoChatShareItem.imageKey) && Intrinsics.areEqual(this.desc, videoChatShareItem.desc) && Intrinsics.areEqual(this.type, videoChatShareItem.type) && this.isSecret == videoChatShareItem.isSecret && Intrinsics.areEqual(this.hitTerms, videoChatShareItem.hitTerms) && Intrinsics.areEqual(this.subtitleHitTerms, videoChatShareItem.subtitleHitTerms) && this.isExternal == videoChatShareItem.isExternal && this.isLeave == videoChatShareItem.isLeave && this.hasPermission == videoChatShareItem.hasPermission && this.zenModeEndTime == videoChatShareItem.zenModeEndTime && Intrinsics.areEqual(this.acceptStatus, videoChatShareItem.acceptStatus) && Intrinsics.areEqual(this.p2pChatterId, videoChatShareItem.p2pChatterId) && Intrinsics.areEqual(this.p2pChatId, videoChatShareItem.p2pChatId) && this.isBlocked == videoChatShareItem.isBlocked && Intrinsics.areEqual(this.customStatuses, videoChatShareItem.customStatuses);
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.imageKey;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.desc;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        ShareItemType shareItemType = this.type;
        int hashCode5 = (hashCode4 + (shareItemType != null ? shareItemType.hashCode() : 0)) * 31;
        boolean z = this.isSecret;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode5 + i3) * 31;
        List<String> list = this.hitTerms;
        int hashCode6 = (i6 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.subtitleHitTerms;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        boolean z2 = this.isExternal;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (hashCode7 + i7) * 31;
        boolean z3 = this.isLeave;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.hasPermission;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        long j = this.zenModeEndTime;
        int i18 = (((i14 + i15) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        CalendarInfo.CalendarAcceptStatus calendarAcceptStatus = this.acceptStatus;
        int hashCode8 = (i18 + (calendarAcceptStatus != null ? calendarAcceptStatus.hashCode() : 0)) * 31;
        String str5 = this.p2pChatterId;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.p2pChatId;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z5 = this.isBlocked;
        if (!z5) {
            i2 = z5 ? 1 : 0;
        }
        int i19 = (hashCode10 + i2) * 31;
        List<ChatterCustomStatus> list3 = this.customStatuses;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return i19 + i;
    }

    public String toString() {
        return "VideoChatShareItem(id=" + this.id + ", name=" + this.name + ", imageKey=" + this.imageKey + ", desc=" + this.desc + ", type=" + this.type + ", isSecret=" + this.isSecret + ", hitTerms=" + this.hitTerms + ", subtitleHitTerms=" + this.subtitleHitTerms + ", isExternal=" + this.isExternal + ", isLeave=" + this.isLeave + ", hasPermission=" + this.hasPermission + ", zenModeEndTime=" + this.zenModeEndTime + ", acceptStatus=" + this.acceptStatus + ", p2pChatterId=" + this.p2pChatterId + ", p2pChatId=" + this.p2pChatId + ", isBlocked=" + this.isBlocked + ", customStatuses=" + this.customStatuses + ")";
    }

    public final CalendarInfo.CalendarAcceptStatus getAcceptStatus() {
        return this.acceptStatus;
    }

    public final List<ChatterCustomStatus> getCustomStatuses() {
        return this.customStatuses;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final boolean getHasPermission() {
        return this.hasPermission;
    }

    public final List<String> getHitTerms() {
        return this.hitTerms;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageKey() {
        return this.imageKey;
    }

    public final String getName() {
        return this.name;
    }

    public final String getP2pChatId() {
        return this.p2pChatId;
    }

    public final String getP2pChatterId() {
        return this.p2pChatterId;
    }

    public final List<String> getSubtitleHitTerms() {
        return this.subtitleHitTerms;
    }

    public final ShareItemType getType() {
        return this.type;
    }

    public final long getZenModeEndTime() {
        return this.zenModeEndTime;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isExternal() {
        return this.isExternal;
    }

    public final boolean isLeave() {
        return this.isLeave;
    }

    public final boolean isSecret() {
        return this.isSecret;
    }

    public final void setAcceptStatus(CalendarInfo.CalendarAcceptStatus calendarAcceptStatus) {
        this.acceptStatus = calendarAcceptStatus;
    }

    public final void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public final void setHasPermission(boolean z) {
        this.hasPermission = z;
    }

    public final void setHitTerms(List<String> list) {
        this.hitTerms = list;
    }

    public final void setP2pChatId(String str) {
        this.p2pChatId = str;
    }

    public final void setP2pChatterId(String str) {
        this.p2pChatterId = str;
    }

    public final void setSecret(boolean z) {
        this.isSecret = z;
    }

    public final void setSubtitleHitTerms(List<String> list) {
        this.subtitleHitTerms = list;
    }

    public final void setZenModeEndTime(long j) {
        this.zenModeEndTime = j;
    }

    public final void setDesc(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.desc = str;
    }

    public final void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.id = str;
    }

    public final void setImageKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.imageKey = str;
    }

    public final void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    public final void setType(ShareItemType shareItemType) {
        Intrinsics.checkParameterIsNotNull(shareItemType, "<set-?>");
        this.type = shareItemType;
    }

    public VideoChatShareItem(String str, String str2, String str3, String str4, ShareItemType shareItemType, boolean z, List<String> list, List<String> list2, boolean z2, boolean z3, boolean z4, long j, CalendarInfo.CalendarAcceptStatus calendarAcceptStatus, String str5, String str6, boolean z5, List<ChatterCustomStatus> list3) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "imageKey");
        Intrinsics.checkParameterIsNotNull(str4, "desc");
        Intrinsics.checkParameterIsNotNull(shareItemType, ShareHitPoint.f121869d);
        this.id = str;
        this.name = str2;
        this.imageKey = str3;
        this.desc = str4;
        this.type = shareItemType;
        this.isSecret = z;
        this.hitTerms = list;
        this.subtitleHitTerms = list2;
        this.isExternal = z2;
        this.isLeave = z3;
        this.hasPermission = z4;
        this.zenModeEndTime = j;
        this.acceptStatus = calendarAcceptStatus;
        this.p2pChatterId = str5;
        this.p2pChatId = str6;
        this.isBlocked = z5;
        this.customStatuses = list3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VideoChatShareItem(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, com.ss.android.vc.meeting.module.share.ShareItemType r26, boolean r27, java.util.List r28, java.util.List r29, boolean r30, boolean r31, boolean r32, long r33, com.ss.android.vc.entity.CalendarInfo.CalendarAcceptStatus r35, java.lang.String r36, java.lang.String r37, boolean r38, java.util.List r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.share.VideoChatShareItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.vc.meeting.module.share.ShareItemType, boolean, java.util.List, java.util.List, boolean, boolean, boolean, long, com.ss.android.vc.entity.CalendarInfo$CalendarAcceptStatus, java.lang.String, java.lang.String, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
