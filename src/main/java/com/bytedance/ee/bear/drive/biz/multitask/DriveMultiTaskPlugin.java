package com.bytedance.ee.bear.drive.biz.multitask;

import androidx.lifecycle.C1144ai;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/multitask/DriveMultiTaskPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachPreview", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveMultiTaskPlugin extends AbsDrivePlugin {
    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        super.onAttachPreview();
        ((DriveMultiTaskVM) new C1144ai(getActivity()).mo6005a(DriveMultiTaskVM.class)).setCurrentDriveViewModel(((DrivePluginHost) getHost()).mo27261l());
    }
}
