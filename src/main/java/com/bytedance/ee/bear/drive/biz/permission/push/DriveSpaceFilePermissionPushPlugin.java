package com.bytedance.ee.bear.drive.biz.permission.push;

import androidx.lifecycle.AbstractC1142af;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/permission/push/DriveSpaceFilePermissionPushPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "mPermissionPush", "Lcom/bytedance/ee/bear/drive/biz/permission/push/DriveSpaceFilePermissionPush;", "onAttachPreview", "", "onDetachPreview", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceFilePermissionPushPlugin extends AbsDrivePlugin {
    private DriveSpaceFilePermissionPush mPermissionPush;

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
        DriveSpaceFilePermissionPush aVar = this.mPermissionPush;
        if (aVar != null) {
            aVar.mo26069b();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        super.onAttachPreview();
        String a = C6891a.m27230a((BasePlugin<DrivePluginHost>) this);
        AbstractC1142af viewModel = viewModel(DriveMGPermissionVM.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "viewModel(DriveMGPermissionVM::class.java)");
        DriveSpaceFilePermissionPush aVar = new DriveSpaceFilePermissionPush(a, (DriveMGPermissionVM) viewModel);
        this.mPermissionPush = aVar;
        if (aVar != null) {
            aVar.mo26068a();
        }
    }
}
