package com.ss.android.lark.mm.module.share.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/mm/module/share/model/InviteUser;", "Ljava/io/Serializable;", "userType", "", "userId", "", "permissions", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getPermissions", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUserId", "()Ljava/lang/String;", "getUserType", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ss/android/lark/mm/module/share/model/InviteUser;", "equals", "", "other", "", "hashCode", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteUser implements Serializable {
    @SerializedName("permission")
    private final Integer permissions;
    @SerializedName("user_id")
    private final String userId;
    @SerializedName("user_type")
    private final Integer userType;

    public InviteUser() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ InviteUser copy$default(InviteUser inviteUser, Integer num, String str, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = inviteUser.userType;
        }
        if ((i & 2) != 0) {
            str = inviteUser.userId;
        }
        if ((i & 4) != 0) {
            num2 = inviteUser.permissions;
        }
        return inviteUser.copy(num, str, num2);
    }

    public final Integer component1() {
        return this.userType;
    }

    public final String component2() {
        return this.userId;
    }

    public final Integer component3() {
        return this.permissions;
    }

    public final InviteUser copy(Integer num, String str, Integer num2) {
        return new InviteUser(num, str, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteUser)) {
            return false;
        }
        InviteUser inviteUser = (InviteUser) obj;
        return Intrinsics.areEqual(this.userType, inviteUser.userType) && Intrinsics.areEqual(this.userId, inviteUser.userId) && Intrinsics.areEqual(this.permissions, inviteUser.permissions);
    }

    public int hashCode() {
        Integer num = this.userType;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.userId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.permissions;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "InviteUser(userType=" + this.userType + ", userId=" + this.userId + ", permissions=" + this.permissions + ")";
    }

    public final Integer getPermissions() {
        return this.permissions;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final Integer getUserType() {
        return this.userType;
    }

    public InviteUser(Integer num, String str, Integer num2) {
        this.userType = num;
        this.userId = str;
        this.permissions = num2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InviteUser(Integer num, String str, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2);
    }
}
