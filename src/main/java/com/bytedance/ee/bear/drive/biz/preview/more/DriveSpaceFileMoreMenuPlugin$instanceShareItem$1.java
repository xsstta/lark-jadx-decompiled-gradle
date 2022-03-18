package com.bytedance.ee.bear.drive.biz.preview.more;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.share.C6689a;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/more/DriveSpaceFileMoreMenuPlugin$instanceShareItem$1", "Lcom/bytedance/ee/bear/browser/plugin/MenuItem;", "onClick", "", "v", "Landroid/view/View;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceFileMoreMenuPlugin$instanceShareItem$1 extends MenuItem {
    final /* synthetic */ Drawable $tintDrawable;
    final /* synthetic */ DriveSpaceFileMoreMenuPlugin this$0;

    @Override // com.bytedance.ee.bear.browser.plugin.MenuItem
    public void onClick(View view) {
        this.this$0.mTitleBarBadgeStrategyManger.mo25043h();
        C10548d.m43697a(view);
        DrivePluginHost aVar = (DrivePluginHost) this.this$0.getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
        C6891a.m27229a(aVar).mo27911a(((DrivePluginHost) this.this$0.getHost()).mo27261l().getFileModel(), "share", "ccm_permission_share_view", (Map<String, Object>) null);
        C6689a.m26419a(this.this$0.getActivity(), ((DrivePluginHost) this.this$0.getHost()).mo27261l(), ((DriveMGPermissionVM) this.this$0.viewModel(DriveMGPermissionVM.class)).livePerm().mo5927b(), (DrivePluginHost) this.this$0.getHost());
        this.this$0.initMenuActions();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DriveSpaceFileMoreMenuPlugin$instanceShareItem$1(DriveSpaceFileMoreMenuPlugin driveSpaceFileMoreMenuPlugin, Drawable drawable, String str, Drawable drawable2, String str2) {
        super(str, drawable2, str2);
        this.this$0 = driveSpaceFileMoreMenuPlugin;
        this.$tintDrawable = drawable;
    }
}
