package com.ss.android.lark.contact.impl.setting.one_way_contact.entity;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/entity/ExceptionUser;", "Ljava/io/Serializable;", "avatarKey", "", "userName", "tenantName", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarKey", "()Ljava/lang/String;", "getTenantName", "getUserId", "getUserName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ExceptionUser implements Serializable {
    private final String avatarKey;
    private final String tenantName;
    private final String userId;
    private final String userName;

    public static /* synthetic */ ExceptionUser copy$default(ExceptionUser exceptionUser, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exceptionUser.avatarKey;
        }
        if ((i & 2) != 0) {
            str2 = exceptionUser.userName;
        }
        if ((i & 4) != 0) {
            str3 = exceptionUser.tenantName;
        }
        if ((i & 8) != 0) {
            str4 = exceptionUser.userId;
        }
        return exceptionUser.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.avatarKey;
    }

    public final String component2() {
        return this.userName;
    }

    public final String component3() {
        return this.tenantName;
    }

    public final String component4() {
        return this.userId;
    }

    public final ExceptionUser copy(String str, String str2, String str3, String str4) {
        return new ExceptionUser(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExceptionUser)) {
            return false;
        }
        ExceptionUser exceptionUser = (ExceptionUser) obj;
        return Intrinsics.areEqual(this.avatarKey, exceptionUser.avatarKey) && Intrinsics.areEqual(this.userName, exceptionUser.userName) && Intrinsics.areEqual(this.tenantName, exceptionUser.tenantName) && Intrinsics.areEqual(this.userId, exceptionUser.userId);
    }

    public int hashCode() {
        String str = this.avatarKey;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.tenantName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.userId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ExceptionUser(avatarKey=" + this.avatarKey + ", userName=" + this.userName + ", tenantName=" + this.tenantName + ", userId=" + this.userId + ")";
    }

    public final String getAvatarKey() {
        return this.avatarKey;
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

    public ExceptionUser(String str, String str2, String str3, String str4) {
        this.avatarKey = str;
        this.userName = str2;
        this.tenantName = str3;
        this.userId = str4;
    }
}
