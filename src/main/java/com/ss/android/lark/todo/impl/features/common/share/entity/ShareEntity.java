package com.ss.android.lark.todo.impl.features.common.share.entity;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/share/entity/ShareEntity;", "Ljava/io/Serializable;", UpdateKey.STATUS, "Lcom/ss/android/lark/todo/impl/features/common/share/entity/ShareStatus;", "errorStr", "", "(Lcom/ss/android/lark/todo/impl/features/common/share/entity/ShareStatus;Ljava/lang/String;)V", "getErrorStr", "()Ljava/lang/String;", "setErrorStr", "(Ljava/lang/String;)V", "getStatus", "()Lcom/ss/android/lark/todo/impl/features/common/share/entity/ShareStatus;", "setStatus", "(Lcom/ss/android/lark/todo/impl/features/common/share/entity/ShareStatus;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ShareEntity implements Serializable {
    private String errorStr;
    private ShareStatus status;

    public static /* synthetic */ ShareEntity copy$default(ShareEntity shareEntity, ShareStatus shareStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            shareStatus = shareEntity.status;
        }
        if ((i & 2) != 0) {
            str = shareEntity.errorStr;
        }
        return shareEntity.copy(shareStatus, str);
    }

    public final ShareStatus component1() {
        return this.status;
    }

    public final String component2() {
        return this.errorStr;
    }

    public final ShareEntity copy(ShareStatus shareStatus, String str) {
        Intrinsics.checkParameterIsNotNull(shareStatus, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(str, "errorStr");
        return new ShareEntity(shareStatus, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareEntity)) {
            return false;
        }
        ShareEntity shareEntity = (ShareEntity) obj;
        return Intrinsics.areEqual(this.status, shareEntity.status) && Intrinsics.areEqual(this.errorStr, shareEntity.errorStr);
    }

    public int hashCode() {
        ShareStatus shareStatus = this.status;
        int i = 0;
        int hashCode = (shareStatus != null ? shareStatus.hashCode() : 0) * 31;
        String str = this.errorStr;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ShareEntity(status=" + this.status + ", errorStr=" + this.errorStr + ")";
    }

    public final String getErrorStr() {
        return this.errorStr;
    }

    public final ShareStatus getStatus() {
        return this.status;
    }

    public final void setErrorStr(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.errorStr = str;
    }

    public final void setStatus(ShareStatus shareStatus) {
        Intrinsics.checkParameterIsNotNull(shareStatus, "<set-?>");
        this.status = shareStatus;
    }

    public ShareEntity(ShareStatus shareStatus, String str) {
        Intrinsics.checkParameterIsNotNull(shareStatus, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(str, "errorStr");
        this.status = shareStatus;
        this.errorStr = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareEntity(ShareStatus shareStatus, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(shareStatus, (i & 2) != 0 ? "" : str);
    }
}
