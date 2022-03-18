package com.bytedance.ee.bear.drive.biz.preview.error.permissionerror;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error._default.SdkShowFailedRetry;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.view.preview.p367c.C7261e;
import com.bytedance.ee.bear.drive.view.preview.retryview.FailedToRetryView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/permissionerror/DriveImFilePermissionErrorPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "handleShowNoPerm", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveImFilePermissionErrorPlugin extends AbsDrivePreviewPlugin {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.permissionerror.DriveImFilePermissionErrorPlugin$a */
    public static final class RunnableC6595a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveImFilePermissionErrorPlugin f18089a;

        RunnableC6595a(DriveImFilePermissionErrorPlugin driveImFilePermissionErrorPlugin) {
            this.f18089a = driveImFilePermissionErrorPlugin;
        }

        public final void run() {
            this.f18089a.handleShowNoPerm();
        }
    }

    public final void handleShowNoPerm() {
        C7261e eVar = new C7261e(getActivity());
        LifecycleOwner lifecycleOwner = getLifecycleOwner();
        DrivePluginHost aVar = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
        FailedToRetryView a = eVar.mo28363a(lifecycleOwner, C6891a.m27236d(aVar), true);
        Intrinsics.checkExpressionValueIsNotNull(a, "RetryViewManager(activit…previewViewModel(), true)");
        removeAndAddPreviewView(a);
        SdkShowFailedRetry.Companion aVar2 = SdkShowFailedRetry.f18065a;
        BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
        Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
        aVar2.mo26184a(a, openEntity.getFileId());
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        addErrorHandler(new RunnableC6595a(this), ErrCode.PERMISSION_DENIED);
    }
}
