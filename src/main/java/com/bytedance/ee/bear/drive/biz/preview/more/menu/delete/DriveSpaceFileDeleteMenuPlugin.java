package com.bytedance.ee.bear.drive.biz.preview.more.menu.delete;

import com.bytedance.ee.bear.contract.SimpleListDataChangeCallback;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/more/menu/delete/DriveSpaceFileDeleteMenuPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "mDocDataListener", "Lcom/bytedance/ee/bear/contract/SimpleListDataChangeCallback;", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onDetachFromHost", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceFileDeleteMenuPlugin extends AbsDrivePlugin {
    private SimpleListDataChangeCallback mDocDataListener;

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachFromHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onDetachFromHost(aVar);
        SimpleListDataChangeCallback simpleListDataChangeCallback = this.mDocDataListener;
        if (simpleListDataChangeCallback != null) {
            ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31508b(simpleListDataChangeCallback);
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        DriveSpaceFileDeleteMenuPlugin$onAttachToHost$1 driveSpaceFileDeleteMenuPlugin$onAttachToHost$1 = new DriveSpaceFileDeleteMenuPlugin$onAttachToHost$1(this, aVar);
        this.mDocDataListener = driveSpaceFileDeleteMenuPlugin$onAttachToHost$1;
        ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31483a(driveSpaceFileDeleteMenuPlugin$onAttachToHost$1);
    }
}
