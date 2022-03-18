package com.ss.android.lark.mm.module.share.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.lark.mm.module.detail.baseinfo.PermissionUserType;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\bB\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u0000 [2\u00020\u0001:\u0001[Bí\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001aJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010<\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010@\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010A\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010 J\t\u0010B\u001a\u00020\rHÆ\u0003J\t\u0010C\u001a\u00020\rHÆ\u0003J\t\u0010D\u001a\u00020\rHÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010 Jö\u0001\u0010O\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010PJ\u0013\u0010Q\u001a\u00020\r2\b\u0010R\u001a\u0004\u0018\u00010SHÖ\u0003J\t\u0010T\u001a\u00020\u0003HÖ\u0001J\u0006\u0010U\u001a\u00020\rJ\u0006\u0010V\u001a\u00020\rJ\u0006\u0010W\u001a\u00020\rJ\u0006\u0010X\u001a\u00020\rJ\u0006\u0010Y\u001a\u00020\rJ\t\u0010Z\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b$\u0010 R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u001a\u0010\u0018\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b)\u0010 R\u001a\u0010\u0016\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u000e\u0010 R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\f\u0010 R\u001a\u0010\u0017\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010*\"\u0004\b-\u0010,R\u001a\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010*\"\u0004\b.\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001cR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u00103\u001a\u0004\b:\u00100¨\u0006\\"}, d2 = {"Lcom/ss/android/lark/mm/module/share/model/User;", "Ljava/io/Serializable;", "userType", "", "userId", "", "userName", "avatarUrl", "avatarKey", "permissions", "departmentName", "groupDescription", "isExternal", "", "isCrossTenant", "tenantId", "", "tenantName", "canModifyPerm", "hasTips", "allowShare", "isSelected", "isCandidate", "isHost", "fromSource", "actionId", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZZLjava/lang/String;Ljava/lang/String;)V", "getActionId", "()Ljava/lang/String;", "setActionId", "(Ljava/lang/String;)V", "getAllowShare", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAvatarKey", "getAvatarUrl", "getCanModifyPerm", "getDepartmentName", "getFromSource", "setFromSource", "getGroupDescription", "getHasTips", "()Z", "setCandidate", "(Z)V", "setHost", "setSelected", "getPermissions", "()Ljava/lang/Integer;", "setPermissions", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTenantId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTenantName", "getUserId", "getUserName", "getUserType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZZLjava/lang/String;Ljava/lang/String;)Lcom/ss/android/lark/mm/module/share/model/User;", "equals", "other", "", "hashCode", "isEditable", "isGroup", "isOwner", "isPerson", "isReadable", "toString", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class User implements Serializable {
    public static final Companion Companion = new Companion(null);
    private String actionId;
    @SerializedName("allow_share")
    private final Boolean allowShare;
    @SerializedName("avatar_key")
    private final String avatarKey;
    @SerializedName("avatar_url")
    private final String avatarUrl;
    @SerializedName("can_modify_perm")
    private final Boolean canModifyPerm;
    @SerializedName("department_name")
    private final String departmentName;
    private String fromSource;
    @SerializedName("group_description")
    private final String groupDescription;
    @SerializedName("has_tips")
    private final Boolean hasTips;
    private boolean isCandidate;
    @SerializedName("is_cross_tenant")
    private final Boolean isCrossTenant;
    @SerializedName("is_external")
    private final Boolean isExternal;
    private boolean isHost;
    private boolean isSelected;
    @SerializedName("permissions")
    private Integer permissions;
    @SerializedName("tenant_id")
    private final Long tenantId;
    @SerializedName("tenant_name")
    private final String tenantName;
    @SerializedName("user_id")
    private final String userId;
    @SerializedName("user_name")
    private final String userName;
    @SerializedName("user_type")
    private final Integer userType;

    public User() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, 1048575, null);
    }

    public static /* synthetic */ User copy$default(User user, Integer num, String str, String str2, String str3, String str4, Integer num2, String str5, String str6, Boolean bool, Boolean bool2, Long l, String str7, Boolean bool3, Boolean bool4, Boolean bool5, boolean z, boolean z2, boolean z3, String str8, String str9, int i, Object obj) {
        return user.copy((i & 1) != 0 ? user.userType : num, (i & 2) != 0 ? user.userId : str, (i & 4) != 0 ? user.userName : str2, (i & 8) != 0 ? user.avatarUrl : str3, (i & 16) != 0 ? user.avatarKey : str4, (i & 32) != 0 ? user.permissions : num2, (i & 64) != 0 ? user.departmentName : str5, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? user.groupDescription : str6, (i & DynamicModule.f58006b) != 0 ? user.isExternal : bool, (i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? user.isCrossTenant : bool2, (i & 1024) != 0 ? user.tenantId : l, (i & 2048) != 0 ? user.tenantName : str7, (i & 4096) != 0 ? user.canModifyPerm : bool3, (i & 8192) != 0 ? user.hasTips : bool4, (i & 16384) != 0 ? user.allowShare : bool5, (i & 32768) != 0 ? user.isSelected : z, (i & 65536) != 0 ? user.isCandidate : z2, (i & 131072) != 0 ? user.isHost : z3, (i & 262144) != 0 ? user.fromSource : str8, (i & 524288) != 0 ? user.actionId : str9);
    }

    public final Integer component1() {
        return this.userType;
    }

    public final Boolean component10() {
        return this.isCrossTenant;
    }

    public final Long component11() {
        return this.tenantId;
    }

    public final String component12() {
        return this.tenantName;
    }

    public final Boolean component13() {
        return this.canModifyPerm;
    }

    public final Boolean component14() {
        return this.hasTips;
    }

    public final Boolean component15() {
        return this.allowShare;
    }

    public final boolean component16() {
        return this.isSelected;
    }

    public final boolean component17() {
        return this.isCandidate;
    }

    public final boolean component18() {
        return this.isHost;
    }

    public final String component19() {
        return this.fromSource;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component20() {
        return this.actionId;
    }

    public final String component3() {
        return this.userName;
    }

    public final String component4() {
        return this.avatarUrl;
    }

    public final String component5() {
        return this.avatarKey;
    }

    public final Integer component6() {
        return this.permissions;
    }

    public final String component7() {
        return this.departmentName;
    }

    public final String component8() {
        return this.groupDescription;
    }

    public final Boolean component9() {
        return this.isExternal;
    }

    public final User copy(Integer num, String str, String str2, String str3, String str4, Integer num2, String str5, String str6, Boolean bool, Boolean bool2, Long l, String str7, Boolean bool3, Boolean bool4, Boolean bool5, boolean z, boolean z2, boolean z3, String str8, String str9) {
        Intrinsics.checkParameterIsNotNull(str8, "fromSource");
        return new User(num, str, str2, str3, str4, num2, str5, str6, bool, bool2, l, str7, bool3, bool4, bool5, z, z2, z3, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return Intrinsics.areEqual(this.userType, user.userType) && Intrinsics.areEqual(this.userId, user.userId) && Intrinsics.areEqual(this.userName, user.userName) && Intrinsics.areEqual(this.avatarUrl, user.avatarUrl) && Intrinsics.areEqual(this.avatarKey, user.avatarKey) && Intrinsics.areEqual(this.permissions, user.permissions) && Intrinsics.areEqual(this.departmentName, user.departmentName) && Intrinsics.areEqual(this.groupDescription, user.groupDescription) && Intrinsics.areEqual(this.isExternal, user.isExternal) && Intrinsics.areEqual(this.isCrossTenant, user.isCrossTenant) && Intrinsics.areEqual(this.tenantId, user.tenantId) && Intrinsics.areEqual(this.tenantName, user.tenantName) && Intrinsics.areEqual(this.canModifyPerm, user.canModifyPerm) && Intrinsics.areEqual(this.hasTips, user.hasTips) && Intrinsics.areEqual(this.allowShare, user.allowShare) && this.isSelected == user.isSelected && this.isCandidate == user.isCandidate && this.isHost == user.isHost && Intrinsics.areEqual(this.fromSource, user.fromSource) && Intrinsics.areEqual(this.actionId, user.actionId);
    }

    public int hashCode() {
        Integer num = this.userType;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.userId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.userName;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.avatarUrl;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.avatarKey;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num2 = this.permissions;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str5 = this.departmentName;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.groupDescription;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool = this.isExternal;
        int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.isCrossTenant;
        int hashCode10 = (hashCode9 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Long l = this.tenantId;
        int hashCode11 = (hashCode10 + (l != null ? l.hashCode() : 0)) * 31;
        String str7 = this.tenantName;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Boolean bool3 = this.canModifyPerm;
        int hashCode13 = (hashCode12 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.hasTips;
        int hashCode14 = (hashCode13 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.allowShare;
        int hashCode15 = (hashCode14 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        boolean z = this.isSelected;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode15 + i3) * 31;
        boolean z2 = this.isCandidate;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.isHost;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        int i11 = (i10 + i2) * 31;
        String str8 = this.fromSource;
        int hashCode16 = (i11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.actionId;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode16 + i;
    }

    public String toString() {
        return "User(userType=" + this.userType + ", userId=" + this.userId + ", userName=" + this.userName + ", avatarUrl=" + this.avatarUrl + ", avatarKey=" + this.avatarKey + ", permissions=" + this.permissions + ", departmentName=" + this.departmentName + ", groupDescription=" + this.groupDescription + ", isExternal=" + this.isExternal + ", isCrossTenant=" + this.isCrossTenant + ", tenantId=" + this.tenantId + ", tenantName=" + this.tenantName + ", canModifyPerm=" + this.canModifyPerm + ", hasTips=" + this.hasTips + ", allowShare=" + this.allowShare + ", isSelected=" + this.isSelected + ", isCandidate=" + this.isCandidate + ", isHost=" + this.isHost + ", fromSource=" + this.fromSource + ", actionId=" + this.actionId + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/share/model/User$Companion;", "", "()V", "participantToUser", "Lcom/ss/android/lark/mm/module/share/model/User;", "participant", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.model.User$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final User mo165177a(MmParticipants.MmParticipantInfo mmParticipantInfo) {
            Intrinsics.checkParameterIsNotNull(mmParticipantInfo, "participant");
            return new User(Integer.valueOf(PermissionUserType.Companion.mo161614a(mmParticipantInfo.getUserType()).getValue()), mmParticipantInfo.getUserId(), mmParticipantInfo.getUserName(), mmParticipantInfo.getAvatarUrl(), null, null, mmParticipantInfo.getDepartment_name(), null, Boolean.valueOf(mmParticipantInfo.is_external()), null, null, mmParticipantInfo.getTenant_name(), null, null, null, false, false, mmParticipantInfo.isIs_host_user(), "participant_picture", mmParticipantInfo.getAction_id(), 128688, null);
        }
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final Boolean getAllowShare() {
        return this.allowShare;
    }

    public final String getAvatarKey() {
        return this.avatarKey;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Boolean getCanModifyPerm() {
        return this.canModifyPerm;
    }

    public final String getDepartmentName() {
        return this.departmentName;
    }

    public final String getFromSource() {
        return this.fromSource;
    }

    public final String getGroupDescription() {
        return this.groupDescription;
    }

    public final Boolean getHasTips() {
        return this.hasTips;
    }

    public final Integer getPermissions() {
        return this.permissions;
    }

    public final Long getTenantId() {
        return this.tenantId;
    }

    public final String getTenantName() {
        return this.tenantName;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final Integer getUserType() {
        return this.userType;
    }

    public final boolean isCandidate() {
        return this.isCandidate;
    }

    public final Boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public final Boolean isExternal() {
        return this.isExternal;
    }

    public final boolean isHost() {
        return this.isHost;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isEditable() {
        int i;
        Integer num = this.permissions;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if ((i & SharePermission.EDIT.getValue()) == SharePermission.EDIT.getValue()) {
            return true;
        }
        return false;
    }

    public final boolean isGroup() {
        Integer num = this.userType;
        int value = UserType.Group.getValue();
        if (num != null && num.intValue() == value) {
            return true;
        }
        return false;
    }

    public final boolean isOwner() {
        int i;
        Integer num = this.permissions;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if ((i & SharePermission.OWNER.getValue()) == SharePermission.OWNER.getValue()) {
            return true;
        }
        return false;
    }

    public final boolean isPerson() {
        Integer num = this.userType;
        int value = UserType.Person.getValue();
        if (num != null && num.intValue() == value) {
            return true;
        }
        return false;
    }

    public final boolean isReadable() {
        int i;
        Integer num = this.permissions;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if ((i & SharePermission.VIEW.getValue()) == SharePermission.VIEW.getValue()) {
            return true;
        }
        return false;
    }

    public final void setActionId(String str) {
        this.actionId = str;
    }

    public final void setCandidate(boolean z) {
        this.isCandidate = z;
    }

    public final void setHost(boolean z) {
        this.isHost = z;
    }

    public final void setPermissions(Integer num) {
        this.permissions = num;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setFromSource(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.fromSource = str;
    }

    public User(Integer num, String str, String str2, String str3, String str4, Integer num2, String str5, String str6, Boolean bool, Boolean bool2, Long l, String str7, Boolean bool3, Boolean bool4, Boolean bool5, boolean z, boolean z2, boolean z3, String str8, String str9) {
        Intrinsics.checkParameterIsNotNull(str8, "fromSource");
        this.userType = num;
        this.userId = str;
        this.userName = str2;
        this.avatarUrl = str3;
        this.avatarKey = str4;
        this.permissions = num2;
        this.departmentName = str5;
        this.groupDescription = str6;
        this.isExternal = bool;
        this.isCrossTenant = bool2;
        this.tenantId = l;
        this.tenantName = str7;
        this.canModifyPerm = bool3;
        this.hasTips = bool4;
        this.allowShare = bool5;
        this.isSelected = z;
        this.isCandidate = z2;
        this.isHost = z3;
        this.fromSource = str8;
        this.actionId = str9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ User(java.lang.Integer r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.Integer r27, java.lang.String r28, java.lang.String r29, java.lang.Boolean r30, java.lang.Boolean r31, java.lang.Long r32, java.lang.String r33, java.lang.Boolean r34, java.lang.Boolean r35, java.lang.Boolean r36, boolean r37, boolean r38, boolean r39, java.lang.String r40, java.lang.String r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.share.model.User.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
