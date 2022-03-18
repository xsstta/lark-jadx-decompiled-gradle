package com.ss.android.lark.filedetail.impl.open.diver;

import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveToSpaceCallback;
import com.ss.android.lark.filedetail.impl.statistic.DriveHitPoint;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/filedetail/impl/open/diver/PreviewTask$getSaveToDriverMenuItem$1", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/menu/BinderSaveToSpaceCallback$Stub;", "onClick", "", "isSaved", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PreviewTask$getSaveToDriverMenuItem$1 extends BinderSaveToSpaceCallback.Stub {
    final /* synthetic */ PreviewTask this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    PreviewTask$getSaveToDriverMenuItem$1(PreviewTask fVar) {
        this.this$0 = fVar;
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5155e
    public void onClick(boolean z) {
        Log.m165389i("PreviewTask", "SaveToDriverMenu click");
        if (!z) {
            DriveHitPoint.f98022a.mo139772a(this.this$0.mo140097h().getFileContent().getMime());
        }
    }
}
