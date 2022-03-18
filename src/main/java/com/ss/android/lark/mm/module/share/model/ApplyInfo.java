package com.ss.android.lark.mm.module.share.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\""}, d2 = {"Lcom/ss/android/lark/mm/module/share/model/ApplyInfo;", "Ljava/io/Serializable;", "ownerUserId", "", "ownerName", "allowApply", "", "notAllowedTips", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAllowApply", "()Ljava/lang/Boolean;", "setAllowApply", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getNotAllowedTips", "()Ljava/lang/String;", "setNotAllowedTips", "(Ljava/lang/String;)V", "getOwnerName", "setOwnerName", "getOwnerUserId", "setOwnerUserId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/ss/android/lark/mm/module/share/model/ApplyInfo;", "equals", "other", "", "hashCode", "", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ApplyInfo implements Serializable {
    @SerializedName("allow_apply")
    private Boolean allowApply;
    @SerializedName("not_allowed_tips")
    private String notAllowedTips;
    @SerializedName("owner_name")
    private String ownerName;
    @SerializedName("owner_user_id")
    private String ownerUserId;

    public ApplyInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ApplyInfo copy$default(ApplyInfo applyInfo, String str, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applyInfo.ownerUserId;
        }
        if ((i & 2) != 0) {
            str2 = applyInfo.ownerName;
        }
        if ((i & 4) != 0) {
            bool = applyInfo.allowApply;
        }
        if ((i & 8) != 0) {
            str3 = applyInfo.notAllowedTips;
        }
        return applyInfo.copy(str, str2, bool, str3);
    }

    public final String component1() {
        return this.ownerUserId;
    }

    public final String component2() {
        return this.ownerName;
    }

    public final Boolean component3() {
        return this.allowApply;
    }

    public final String component4() {
        return this.notAllowedTips;
    }

    public final ApplyInfo copy(@JSONField(name = "owner_user_id") String str, @JSONField(name = "owner_name") String str2, @JSONField(name = "allow_apply") Boolean bool, @JSONField(name = "not_allowed_tips") String str3) {
        return new ApplyInfo(str, str2, bool, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyInfo)) {
            return false;
        }
        ApplyInfo applyInfo = (ApplyInfo) obj;
        return Intrinsics.areEqual(this.ownerUserId, applyInfo.ownerUserId) && Intrinsics.areEqual(this.ownerName, applyInfo.ownerName) && Intrinsics.areEqual(this.allowApply, applyInfo.allowApply) && Intrinsics.areEqual(this.notAllowedTips, applyInfo.notAllowedTips);
    }

    public int hashCode() {
        String str = this.ownerUserId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.ownerName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.allowApply;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str3 = this.notAllowedTips;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ApplyInfo(ownerUserId=" + this.ownerUserId + ", ownerName=" + this.ownerName + ", allowApply=" + this.allowApply + ", notAllowedTips=" + this.notAllowedTips + ")";
    }

    public final Boolean getAllowApply() {
        return this.allowApply;
    }

    public final String getNotAllowedTips() {
        return this.notAllowedTips;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getOwnerUserId() {
        return this.ownerUserId;
    }

    public final void setAllowApply(Boolean bool) {
        this.allowApply = bool;
    }

    public final void setNotAllowedTips(String str) {
        this.notAllowedTips = str;
    }

    public final void setOwnerName(String str) {
        this.ownerName = str;
    }

    public final void setOwnerUserId(String str) {
        this.ownerUserId = str;
    }

    public ApplyInfo(@JSONField(name = "owner_user_id") String str, @JSONField(name = "owner_name") String str2, @JSONField(name = "allow_apply") Boolean bool, @JSONField(name = "not_allowed_tips") String str3) {
        this.ownerUserId = str;
        this.ownerName = str2;
        this.allowApply = bool;
        this.notAllowedTips = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApplyInfo(String str, String str2, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3);
    }
}
