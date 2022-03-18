package com.bytedance.ee.bear.more.itemv2;

import com.bytedance.ee.bear.contract.BinderIMakeCopyCallback;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/more/itemv2/MakeCopyItemV2$startMakeCopy$1", "Lcom/bytedance/ee/bear/contract/BinderIMakeCopyCallback$Stub;", "onFailed", "", "errorMsg", "", "code", "", "onSucceed", "objToken", "url", "newTitle", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class MakeCopyItemV2$startMakeCopy$1 extends BinderIMakeCopyCallback.Stub {
    final /* synthetic */ IMoreInfo $moreInfo;
    final /* synthetic */ MakeCopyItemV2 this$0;

    MakeCopyItemV2$startMakeCopy$1(MakeCopyItemV2 makeCopyItemV2, IMoreInfo dVar) {
        this.this$0 = makeCopyItemV2;
        this.$moreInfo = dVar;
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5109b
    public void onFailed(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "errorMsg");
        C13479a.m54758a("MakeCopyItemV2", str);
        if (!C13726a.m55676b(this.this$0.getMActivity())) {
            C13479a.m54775e("MakeCopyItemV2", "activity is not active!!!");
        } else {
            this.this$0.showFailedToast(i, this.$moreInfo.mo39036e());
        }
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5109b
    public void onSucceed(String str, String str2, String str3) {
        if (!C13726a.m55676b(this.this$0.getMActivity())) {
            C13479a.m54775e("MakeCopyItemV2", "activity is not active!!!");
        } else {
            this.this$0.onMakeCopySuccess(str2);
        }
    }
}
