package com.ss.android.lark.mm.module.share.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010'\u001a\u00020\u0006HÆ\u0003J`\u0010(\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019¨\u00060"}, d2 = {"Lcom/ss/android/lark/mm/module/share/model/PermissionStatus;", "Ljava/io/Serializable;", "objectStatus", "", "reviewStatus", "canModify", "", "objectVersion", "lastEditVersion", "canComment", "isChangeSummary", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Z)V", "getCanComment", "()Ljava/lang/Boolean;", "setCanComment", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCanModify", "setCanModify", "()Z", "setChangeSummary", "(Z)V", "getLastEditVersion", "()Ljava/lang/Integer;", "setLastEditVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getObjectStatus", "setObjectStatus", "getObjectVersion", "setObjectVersion", "getReviewStatus", "setReviewStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Z)Lcom/ss/android/lark/mm/module/share/model/PermissionStatus;", "equals", "other", "", "hashCode", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PermissionStatus implements Serializable {
    @SerializedName("can_comment")
    private Boolean canComment;
    @SerializedName("can_modify")
    private Boolean canModify;
    private boolean isChangeSummary;
    @SerializedName("last_edit_version")
    private Integer lastEditVersion;
    @SerializedName("object_status")
    private Integer objectStatus;
    @SerializedName("object_version")
    private Integer objectVersion;
    @SerializedName("review_status")
    private Integer reviewStatus;

    public PermissionStatus() {
        this(null, null, null, null, null, null, false, SmActions.ACTION_ONTHECALL_ENTRY, null);
    }

    public static /* synthetic */ PermissionStatus copy$default(PermissionStatus permissionStatus, Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, Boolean bool2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            num = permissionStatus.objectStatus;
        }
        if ((i & 2) != 0) {
            num2 = permissionStatus.reviewStatus;
        }
        if ((i & 4) != 0) {
            bool = permissionStatus.canModify;
        }
        if ((i & 8) != 0) {
            num3 = permissionStatus.objectVersion;
        }
        if ((i & 16) != 0) {
            num4 = permissionStatus.lastEditVersion;
        }
        if ((i & 32) != 0) {
            bool2 = permissionStatus.canComment;
        }
        if ((i & 64) != 0) {
            z = permissionStatus.isChangeSummary;
        }
        return permissionStatus.copy(num, num2, bool, num3, num4, bool2, z);
    }

    public final Integer component1() {
        return this.objectStatus;
    }

    public final Integer component2() {
        return this.reviewStatus;
    }

    public final Boolean component3() {
        return this.canModify;
    }

    public final Integer component4() {
        return this.objectVersion;
    }

    public final Integer component5() {
        return this.lastEditVersion;
    }

    public final Boolean component6() {
        return this.canComment;
    }

    public final boolean component7() {
        return this.isChangeSummary;
    }

    public final PermissionStatus copy(@JSONField(name = "object_status") Integer num, @JSONField(name = "review_status") Integer num2, @JSONField(name = "can_modify") Boolean bool, @JSONField(name = "object_version") Integer num3, @JSONField(name = "last_edit_version") Integer num4, @JSONField(name = "can_comment") Boolean bool2, boolean z) {
        return new PermissionStatus(num, num2, bool, num3, num4, bool2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionStatus)) {
            return false;
        }
        PermissionStatus permissionStatus = (PermissionStatus) obj;
        return Intrinsics.areEqual(this.objectStatus, permissionStatus.objectStatus) && Intrinsics.areEqual(this.reviewStatus, permissionStatus.reviewStatus) && Intrinsics.areEqual(this.canModify, permissionStatus.canModify) && Intrinsics.areEqual(this.objectVersion, permissionStatus.objectVersion) && Intrinsics.areEqual(this.lastEditVersion, permissionStatus.lastEditVersion) && Intrinsics.areEqual(this.canComment, permissionStatus.canComment) && this.isChangeSummary == permissionStatus.isChangeSummary;
    }

    public int hashCode() {
        Integer num = this.objectStatus;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.reviewStatus;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Boolean bool = this.canModify;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num3 = this.objectVersion;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.lastEditVersion;
        int hashCode5 = (hashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Boolean bool2 = this.canComment;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.isChangeSummary;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "PermissionStatus(objectStatus=" + this.objectStatus + ", reviewStatus=" + this.reviewStatus + ", canModify=" + this.canModify + ", objectVersion=" + this.objectVersion + ", lastEditVersion=" + this.lastEditVersion + ", canComment=" + this.canComment + ", isChangeSummary=" + this.isChangeSummary + ")";
    }

    public final Boolean getCanComment() {
        return this.canComment;
    }

    public final Boolean getCanModify() {
        return this.canModify;
    }

    public final Integer getLastEditVersion() {
        return this.lastEditVersion;
    }

    public final Integer getObjectStatus() {
        return this.objectStatus;
    }

    public final Integer getObjectVersion() {
        return this.objectVersion;
    }

    public final Integer getReviewStatus() {
        return this.reviewStatus;
    }

    public final boolean isChangeSummary() {
        return this.isChangeSummary;
    }

    public final void setCanComment(Boolean bool) {
        this.canComment = bool;
    }

    public final void setCanModify(Boolean bool) {
        this.canModify = bool;
    }

    public final void setChangeSummary(boolean z) {
        this.isChangeSummary = z;
    }

    public final void setLastEditVersion(Integer num) {
        this.lastEditVersion = num;
    }

    public final void setObjectStatus(Integer num) {
        this.objectStatus = num;
    }

    public final void setObjectVersion(Integer num) {
        this.objectVersion = num;
    }

    public final void setReviewStatus(Integer num) {
        this.reviewStatus = num;
    }

    public PermissionStatus(@JSONField(name = "object_status") Integer num, @JSONField(name = "review_status") Integer num2, @JSONField(name = "can_modify") Boolean bool, @JSONField(name = "object_version") Integer num3, @JSONField(name = "last_edit_version") Integer num4, @JSONField(name = "can_comment") Boolean bool2, boolean z) {
        this.objectStatus = num;
        this.reviewStatus = num2;
        this.canModify = bool;
        this.objectVersion = num3;
        this.lastEditVersion = num4;
        this.canComment = bool2;
        this.isChangeSummary = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PermissionStatus(java.lang.Integer r6, java.lang.Integer r7, java.lang.Boolean r8, java.lang.Integer r9, java.lang.Integer r10, java.lang.Boolean r11, boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto L_0x0008
            r6 = r0
            java.lang.Integer r6 = (java.lang.Integer) r6
        L_0x0008:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000f
            r7 = r0
            java.lang.Integer r7 = (java.lang.Integer) r7
        L_0x000f:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0017
            r8 = r0
            java.lang.Boolean r8 = (java.lang.Boolean) r8
        L_0x0017:
            r1 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001f
            r9 = r0
            java.lang.Integer r9 = (java.lang.Integer) r9
        L_0x001f:
            r2 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0027
            r10 = r0
            java.lang.Integer r10 = (java.lang.Integer) r10
        L_0x0027:
            r3 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x002f
            r11 = r0
            java.lang.Boolean r11 = (java.lang.Boolean) r11
        L_0x002f:
            r0 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0037
            r12 = 0
            r4 = 0
            goto L_0x0038
        L_0x0037:
            r4 = r12
        L_0x0038:
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r0
            r14 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.share.model.PermissionStatus.<init>(java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
