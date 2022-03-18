package com.bytedance.ee.bear.bitable;

import com.bytedance.ee.bear.bitable.card.viewmodel.share.ShareMetaFetcher;
import com.bytedance.ee.bear.share.IBitableApi;
import com.bytedance.ee.bear.share.IShareMeta;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/bitable/BitableApiImpl;", "Lcom/bytedance/ee/bear/share/IBitableApi;", "()V", "fetchShareMeta", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/share/IShareMeta;", "baseToken", "", "tableId", "viewId", "shareType", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.a */
public final class BitableApiImpl implements IBitableApi {
    @Override // com.bytedance.ee.bear.share.IBitableApi
    /* renamed from: a */
    public AbstractC68307f<IShareMeta> mo17422a(String str, String str2, String str3, int i) {
        Intrinsics.checkParameterIsNotNull(str, "baseToken");
        Intrinsics.checkParameterIsNotNull(str2, "tableId");
        Intrinsics.checkParameterIsNotNull(str3, "viewId");
        return ShareMetaFetcher.f14041a.mo18649a(str, str2, str3, i);
    }
}
