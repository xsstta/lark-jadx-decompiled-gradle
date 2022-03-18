package com.ss.android.lark.filedetail.impl.open.diver;

import android.os.Bundle;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.ss.android.lark.filedetail.impl.detail.menu.IFileMenuClickDependency;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/filedetail/impl/open/diver/PreviewTask$getJump2ChatMenuItem$1", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/menu/BinderMenuAction$Stub;", "action", "", "p0", "Landroid/os/Bundle;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PreviewTask$getJump2ChatMenuItem$1 extends BinderMenuAction.Stub {
    final /* synthetic */ PreviewTask this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    PreviewTask$getJump2ChatMenuItem$1(PreviewTask fVar) {
        this.this$0 = fVar;
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction.AbstractC5143a
    public void action(Bundle bundle) {
        boolean z;
        IFileMenuClickDependency bVar = this.this$0.f98370h;
        if (bVar != null) {
            z = bVar.mo139827a();
        } else {
            z = false;
        }
        if (z && !this.this$0.mo140092c()) {
            IPreviewLifecycleCallback a = this.this$0.mo140085a();
            if (a != null) {
                a.mo140083a();
            }
            this.this$0.mo140093d();
        }
    }
}
