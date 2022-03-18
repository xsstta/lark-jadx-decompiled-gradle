package com.bytedance.ee.bear.drive.biz.preview.error.notfound;

import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/notfound/DriveSpaceFileNotFoundPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/error/notfound/DriveFileNotFoundPlugin;", "()V", "handleFileNotFound", "", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceFileNotFoundPlugin extends DriveFileNotFoundPlugin {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.preview.error.notfound.DriveFileNotFoundPlugin
    public void handleFileNotFound(AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.handleFileNotFound(nVar);
        BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
        Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
        ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31522e(openEntity.getFileId());
    }
}
