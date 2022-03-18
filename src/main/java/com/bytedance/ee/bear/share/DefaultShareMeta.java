package com.bytedance.ee.bear.share;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/share/DefaultShareMeta;", "Lcom/bytedance/ee/bear/share/IShareMeta;", "()V", "getObjType", "", "getShareToken", "", "isOpen", "", "setFlag", "", "flag", "setShareToken", "shareToken", "bitable-api_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DefaultShareMeta implements IShareMeta {
    @Override // com.bytedance.ee.bear.share.IShareMeta
    public int getObjType() {
        return 80;
    }

    @Override // com.bytedance.ee.bear.share.IShareMeta
    public String getShareToken() {
        return "";
    }

    @Override // com.bytedance.ee.bear.share.IShareMeta
    public boolean isOpen() {
        return false;
    }

    @Override // com.bytedance.ee.bear.share.IShareMeta
    public void setFlag(int i) {
    }

    @Override // com.bytedance.ee.bear.share.IShareMeta
    public void setShareToken(String str) {
        Intrinsics.checkParameterIsNotNull(str, "shareToken");
    }
}
