package com.ss.android.lark.mm.module.share.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u0006\u0010\u0018\u001a\u00020\u0005J\u0006\u0010\u0019\u001a\u00020\u0005J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010Jb\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0006\u0010'\u001a\u00020\u0005J\u0006\u0010(\u001a\u00020\u0005J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0004\u0010\u0010R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013¨\u0006*"}, d2 = {"Lcom/ss/android/lark/mm/module/share/model/LinkShare;", "Ljava/io/Serializable;", UpdateKey.STATUS, "", "isOpen", "", "avatarUrl", "", "shareType", "scopeUserType", "permissions", "canModify", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getAvatarUrl", "()Ljava/lang/String;", "getCanModify", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPermissions", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScopeUserType", "getShareType", "getStatus", "canEdit", "canView", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/ss/android/lark/mm/module/share/model/LinkShare;", "equals", "other", "", "hashCode", "isInternal", "isOwner", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LinkShare implements Serializable {
    @SerializedName("avatar_url")
    private final String avatarUrl;
    @SerializedName("can_modify_perm")
    private final Boolean canModify;
    @SerializedName("is_open")
    private final Boolean isOpen;
    @SerializedName("permissions")
    private final Integer permissions;
    @SerializedName("scope_user_type")
    private final Integer scopeUserType;
    @SerializedName("share_type")
    private final Integer shareType;
    @SerializedName(UpdateKey.STATUS)
    private final Integer status;

    public LinkShare() {
        this(null, null, null, null, null, null, null, SmActions.ACTION_ONTHECALL_ENTRY, null);
    }

    public static /* synthetic */ LinkShare copy$default(LinkShare linkShare, Integer num, Boolean bool, String str, Integer num2, Integer num3, Integer num4, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = linkShare.status;
        }
        if ((i & 2) != 0) {
            bool = linkShare.isOpen;
        }
        if ((i & 4) != 0) {
            str = linkShare.avatarUrl;
        }
        if ((i & 8) != 0) {
            num2 = linkShare.shareType;
        }
        if ((i & 16) != 0) {
            num3 = linkShare.scopeUserType;
        }
        if ((i & 32) != 0) {
            num4 = linkShare.permissions;
        }
        if ((i & 64) != 0) {
            bool2 = linkShare.canModify;
        }
        return linkShare.copy(num, bool, str, num2, num3, num4, bool2);
    }

    public final Integer component1() {
        return this.status;
    }

    public final Boolean component2() {
        return this.isOpen;
    }

    public final String component3() {
        return this.avatarUrl;
    }

    public final Integer component4() {
        return this.shareType;
    }

    public final Integer component5() {
        return this.scopeUserType;
    }

    public final Integer component6() {
        return this.permissions;
    }

    public final Boolean component7() {
        return this.canModify;
    }

    public final LinkShare copy(Integer num, Boolean bool, String str, Integer num2, Integer num3, Integer num4, Boolean bool2) {
        return new LinkShare(num, bool, str, num2, num3, num4, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkShare)) {
            return false;
        }
        LinkShare linkShare = (LinkShare) obj;
        return Intrinsics.areEqual(this.status, linkShare.status) && Intrinsics.areEqual(this.isOpen, linkShare.isOpen) && Intrinsics.areEqual(this.avatarUrl, linkShare.avatarUrl) && Intrinsics.areEqual(this.shareType, linkShare.shareType) && Intrinsics.areEqual(this.scopeUserType, linkShare.scopeUserType) && Intrinsics.areEqual(this.permissions, linkShare.permissions) && Intrinsics.areEqual(this.canModify, linkShare.canModify);
    }

    public int hashCode() {
        Integer num = this.status;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Boolean bool = this.isOpen;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.avatarUrl;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.shareType;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.scopeUserType;
        int hashCode5 = (hashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.permissions;
        int hashCode6 = (hashCode5 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Boolean bool2 = this.canModify;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        return "LinkShare(status=" + this.status + ", isOpen=" + this.isOpen + ", avatarUrl=" + this.avatarUrl + ", shareType=" + this.shareType + ", scopeUserType=" + this.scopeUserType + ", permissions=" + this.permissions + ", canModify=" + this.canModify + ")";
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Boolean getCanModify() {
        return this.canModify;
    }

    public final Integer getPermissions() {
        return this.permissions;
    }

    public final Integer getScopeUserType() {
        return this.scopeUserType;
    }

    public final Integer getShareType() {
        return this.shareType;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Boolean isOpen() {
        return this.isOpen;
    }

    public final boolean canEdit() {
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

    public final boolean canView() {
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

    public final boolean isInternal() {
        Integer num = this.shareType;
        int value = ShareType.Internal.getValue();
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

    public LinkShare(Integer num, Boolean bool, String str, Integer num2, Integer num3, Integer num4, Boolean bool2) {
        this.status = num;
        this.isOpen = bool;
        this.avatarUrl = str;
        this.shareType = num2;
        this.scopeUserType = num3;
        this.permissions = num4;
        this.canModify = bool2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinkShare(Integer num, Boolean bool, String str, Integer num2, Integer num3, Integer num4, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4, (i & 64) != 0 ? null : bool2);
    }
}
