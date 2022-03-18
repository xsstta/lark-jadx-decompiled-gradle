package com.bytedance.ee.bear.drive.biz.preview.error.copy;

import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.view.preview.p367c.C7261e;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/copy/DriveCopyFailedPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveCopyFailedPlugin extends AbsDrivePreviewPlugin {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.copy.DriveCopyFailedPlugin$a */
    public static final class RunnableC6577a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveCopyFailedPlugin f18067a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18068b;

        RunnableC6577a(DriveCopyFailedPlugin driveCopyFailedPlugin, DrivePluginHost aVar) {
            this.f18067a = driveCopyFailedPlugin;
            this.f18068b = aVar;
        }

        public final void run() {
            Intrinsics.checkExpressionValueIsNotNull(new C7261e(this.f18067a.getContext()).mo28364a(this.f18067a.getLifecycleOwner(), C6891a.m27236d(this.f18068b), false, this.f18067a.getString(R.string.CreationMobile_ECM_CreateLaterToast)), "RetryViewManager(context…LaterToast)\n            )");
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        addErrorHandler(new RunnableC6577a(this, aVar), ErrCode.COPY_FAILED);
    }
}
