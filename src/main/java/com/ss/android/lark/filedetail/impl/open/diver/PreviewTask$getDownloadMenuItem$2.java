package com.ss.android.lark.filedetail.impl.open.diver;

import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadCallBack;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/filedetail/impl/open/diver/PreviewTask$getDownloadMenuItem$2", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/menu/BinderProxyDownloadCallBack$Stub;", "cancel", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PreviewTask$getDownloadMenuItem$2 extends BinderProxyDownloadCallBack.Stub {
    final /* synthetic */ PreviewTask this$0;

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5151a
    public void cancel() {
        Log.m165389i("PreviewTask", "download menu cancel download");
        this.this$0.mo140094e();
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    PreviewTask$getDownloadMenuItem$2(PreviewTask fVar) {
        this.this$0 = fVar;
    }
}
