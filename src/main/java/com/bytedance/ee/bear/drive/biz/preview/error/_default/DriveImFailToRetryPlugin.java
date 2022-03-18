package com.bytedance.ee.bear.drive.biz.preview.error._default;

import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.biz.preview.error._default.SdkShowFailedRetry;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.view.preview.retryview.FailedToRetryView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/_default/DriveImFailToRetryPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/error/_default/DriveFailedToRetryPlugin;", "()V", "showFailedToRetryView", "Lcom/bytedance/ee/bear/drive/view/preview/retryview/FailedToRetryView;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveImFailToRetryPlugin extends DriveFailedToRetryPlugin {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.preview.error._default.DriveFailedToRetryPlugin
    public FailedToRetryView showFailedToRetryView() {
        FailedToRetryView showFailedToRetryView = super.showFailedToRetryView();
        DrivePluginHost aVar = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
        C1177w<Boolean> liveOuterExportVisible = C6891a.m27236d(aVar).liveOuterExportVisible();
        Intrinsics.checkExpressionValueIsNotNull(liveOuterExportVisible, "host.previewViewModel().liveOuterExportVisible()");
        if (Intrinsics.areEqual((Object) liveOuterExportVisible.mo5927b(), (Object) true)) {
            SdkShowFailedRetry.Companion aVar2 = SdkShowFailedRetry.f18065a;
            BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
            aVar2.mo26184a(showFailedToRetryView, openEntity.getFileId());
        }
        return showFailedToRetryView;
    }
}
