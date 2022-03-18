package com.ss.android.lark.filedetail.impl.open.diver;

import android.os.Bundle;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.DownloadMenu;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.OpenExternalMenu;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.filedetail.impl.open.C38303c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/filedetail/impl/open/diver/PreviewTask$getOpenByOtherAppMenuItem$1", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/menu/BinderMenuAction$Stub;", "action", "", "extra", "Landroid/os/Bundle;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PreviewTask$getOpenByOtherAppMenuItem$1 extends BinderMenuAction.Stub {
    final /* synthetic */ OpenExternalMenu $menu;
    final /* synthetic */ PreviewTask this$0;

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction.AbstractC5143a
    public void action(Bundle bundle) {
        if (C38303c.m150714a()) {
            Log.m165383e("PreviewTask", "[cipher] PreviewTask: Cipher is ON, open by other app is forbidden!");
            LKUIToast.enableToast();
            LKUIToast.show(LarkContext.getApplication(), (int) R.string.Lark_Core_SecuritySettingCannotShare);
            return;
        }
        Log.m165389i("PreviewTask", "OpenByOtherApp menu start download");
        this.this$0.mo140086a((DownloadMenu) this.$menu, true);
    }

    PreviewTask$getOpenByOtherAppMenuItem$1(PreviewTask fVar, OpenExternalMenu openExternalMenu) {
        this.this$0 = fVar;
        this.$menu = openExternalMenu;
    }
}
