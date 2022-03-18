package com.bytedance.ee.bear.drive.biz.preview.error.permissionerror;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.biz.permission.DriveSpaceAttachmentMGPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/permissionerror/DriveSpaceAttachmentPermissionErrorPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "handleNoPermission", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceAttachmentPermissionErrorPlugin extends AbsDrivePreviewPlugin {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.permissionerror.DriveSpaceAttachmentPermissionErrorPlugin$a */
    public static final class RunnableC6596a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceAttachmentPermissionErrorPlugin f18090a;

        RunnableC6596a(DriveSpaceAttachmentPermissionErrorPlugin driveSpaceAttachmentPermissionErrorPlugin) {
            this.f18090a = driveSpaceAttachmentPermissionErrorPlugin;
        }

        public final void run() {
            this.f18090a.handleNoPermission();
        }
    }

    public final void handleNoPermission() {
        removePreviewView();
        DrivePluginHost aVar = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
        C6891a.m27235c(aVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DrivePermissionInfo;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.permissionerror.DriveSpaceAttachmentPermissionErrorPlugin$b */
    public static final class C6597b<T> implements AbstractC1178x<C6522b> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceAttachmentPermissionErrorPlugin f18091a;

        C6597b(DriveSpaceAttachmentPermissionErrorPlugin driveSpaceAttachmentPermissionErrorPlugin) {
            this.f18091a = driveSpaceAttachmentPermissionErrorPlugin;
        }

        /* renamed from: a */
        public final void onChanged(C6522b bVar) {
            if (bVar != null && !bVar.mo26063i()) {
                this.f18091a.handleNoPermission();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        addErrorHandler(new RunnableC6596a(this), ErrCode.PERMISSION_DENIED);
        ((DriveSpaceAttachmentMGPermissionVM) viewModel(DriveSpaceAttachmentMGPermissionVM.class)).livePerm().mo5923a(getLifecycleOwner(), new C6597b(this));
    }
}
