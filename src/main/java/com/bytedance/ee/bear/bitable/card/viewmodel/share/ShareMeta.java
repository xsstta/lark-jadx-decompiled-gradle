package com.bytedance.ee.bear.bitable.card.viewmodel.share;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.share.IShareMeta;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\n\u001a\u00020\u0005HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0007HÂ\u0003J\t\u0010\f\u001a\u00020\u0005HÂ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/viewmodel/share/ShareMeta;", "Lcom/bytedance/ee/bear/share/IShareMeta;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "flag", "", "shareToken", "", "objType", "(ILjava/lang/String;I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getObjType", "getShareToken", "hashCode", "isOpen", "setFlag", "", "setShareToken", "toString", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ShareMeta extends NetService.Result<Serializable> implements IShareMeta {
    private int flag;
    private int objType;
    private String shareToken;

    public ShareMeta() {
        this(0, null, 0, 7, null);
    }

    private final int component1() {
        return this.flag;
    }

    private final String component2() {
        return this.shareToken;
    }

    private final int component3() {
        return this.objType;
    }

    public static /* synthetic */ ShareMeta copy$default(ShareMeta shareMeta, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = shareMeta.flag;
        }
        if ((i3 & 2) != 0) {
            str = shareMeta.shareToken;
        }
        if ((i3 & 4) != 0) {
            i2 = shareMeta.objType;
        }
        return shareMeta.copy(i, str, i2);
    }

    public final ShareMeta copy(int i, String str, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "shareToken");
        return new ShareMeta(i, str, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShareMeta) {
                ShareMeta shareMeta = (ShareMeta) obj;
                if ((this.flag == shareMeta.flag) && Intrinsics.areEqual(this.shareToken, shareMeta.shareToken)) {
                    if (this.objType == shareMeta.objType) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.flag * 31;
        String str = this.shareToken;
        return ((i + (str != null ? str.hashCode() : 0)) * 31) + this.objType;
    }

    public String toString() {
        return "ShareMeta(flag=" + this.flag + ", shareToken=" + this.shareToken + ", objType=" + this.objType + ")";
    }

    @Override // com.bytedance.ee.bear.share.IShareMeta
    public int getObjType() {
        return this.objType;
    }

    @Override // com.bytedance.ee.bear.share.IShareMeta
    public String getShareToken() {
        return this.shareToken;
    }

    @Override // com.bytedance.ee.bear.share.IShareMeta
    public boolean isOpen() {
        if (this.flag == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.share.IShareMeta
    public void setFlag(int i) {
        this.flag = i;
    }

    @Override // com.bytedance.ee.bear.share.IShareMeta
    public void setShareToken(String str) {
        Intrinsics.checkParameterIsNotNull(str, "shareToken");
        this.shareToken = str;
    }

    public ShareMeta(int i, String str, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "shareToken");
        this.flag = i;
        this.shareToken = str;
        this.objType = i2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShareMeta(int r1, java.lang.String r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0005
            r1 = 0
        L_0x0005:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000b
            java.lang.String r2 = ""
        L_0x000b:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x001a
            com.bytedance.ee.bear.list.dto.a r3 = com.bytedance.ee.bear.list.dto.C8275a.f22380m
            java.lang.String r4 = "DocumentType.BITABLE_FORM"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            int r3 = r3.mo32555b()
        L_0x001a:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.bitable.card.viewmodel.share.ShareMeta.<init>(int, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
