package com.bytedance.ee.bear.middleground.permission.permission.bitableshare;

import com.bytedance.ee.bear.contract.NetService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/bitableshare/ShareTokenData;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "", "shareToken", "(Ljava/lang/String;)V", "getShareToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ShareTokenData extends NetService.Result<String> {
    private final String shareToken;

    public ShareTokenData() {
        this(null, 1, null);
    }

    public static /* synthetic */ ShareTokenData copy$default(ShareTokenData shareTokenData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareTokenData.shareToken;
        }
        return shareTokenData.copy(str);
    }

    public final String component1() {
        return this.shareToken;
    }

    public final ShareTokenData copy(String str) {
        Intrinsics.checkParameterIsNotNull(str, "shareToken");
        return new ShareTokenData(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ShareTokenData) && Intrinsics.areEqual(this.shareToken, ((ShareTokenData) obj).shareToken);
        }
        return true;
    }

    public int hashCode() {
        String str = this.shareToken;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ShareTokenData(shareToken=" + this.shareToken + ")";
    }

    public final String getShareToken() {
        return this.shareToken;
    }

    public ShareTokenData(String str) {
        Intrinsics.checkParameterIsNotNull(str, "shareToken");
        this.shareToken = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareTokenData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
