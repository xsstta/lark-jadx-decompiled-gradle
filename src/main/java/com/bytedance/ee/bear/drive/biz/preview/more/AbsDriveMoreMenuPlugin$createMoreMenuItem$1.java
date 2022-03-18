package com.bytedance.ee.bear.drive.biz.preview.more;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/more/AbsDriveMoreMenuPlugin$createMoreMenuItem$1", "Lcom/bytedance/ee/bear/browser/plugin/MenuItem;", "onClick", "", "v", "Landroid/view/View;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AbsDriveMoreMenuPlugin$createMoreMenuItem$1 extends MenuItem {
    final /* synthetic */ Runnable $action;
    final /* synthetic */ Drawable $tintDrawable;
    final /* synthetic */ AbsDriveMoreMenuPlugin this$0;

    @Override // com.bytedance.ee.bear.browser.plugin.MenuItem
    public void onClick(View view) {
        String str;
        Intrinsics.checkParameterIsNotNull(view, "v");
        this.$action.run();
        LiveData<Integer> livePreviewType = ((DrivePluginHost) this.this$0.getHost()).mo27261l().livePreviewType();
        Intrinsics.checkExpressionValueIsNotNull(livePreviewType, "host.driveViewModel.livePreviewType()");
        Integer b = livePreviewType.mo5927b();
        if (b != null && b.intValue() == 4) {
            LiveData<Integer> livePreviewType2 = ((DrivePluginHost) this.this$0.getHost()).mo27261l().livePreviewType();
            Intrinsics.checkExpressionValueIsNotNull(livePreviewType2, "host.driveViewModel.livePreviewType()");
            Integer b2 = livePreviewType2.mo5927b();
            if (b2 != null && b2.intValue() == 4) {
                str = "preview";
            } else {
                str = "card";
            }
            DrivePluginHost aVar = (DrivePluginHost) this.this$0.getHost();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
            C6891a.m27229a(aVar).mo27907a(((DrivePluginHost) this.this$0.getHost()).mo27261l().getFileModel(), "more", str);
        }
        DrivePluginHost aVar2 = (DrivePluginHost) this.this$0.getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "host");
        C6891a.m27229a(aVar2).mo27911a(((DrivePluginHost) this.this$0.getHost()).mo27261l().getFileModel(), "more", "ccm_space_docs_more_menu_view", (Map<String, Object>) null);
        DrivePluginHost aVar3 = (DrivePluginHost) this.this$0.getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar3, "host");
        C6891a.m27229a(aVar3).mo27948d(((DrivePluginHost) this.this$0.getHost()).mo27261l().getFileModel());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AbsDriveMoreMenuPlugin$createMoreMenuItem$1(AbsDriveMoreMenuPlugin absDriveMoreMenuPlugin, Runnable runnable, Drawable drawable, String str, Drawable drawable2, String str2) {
        super(str, drawable2, str2);
        this.this$0 = absDriveMoreMenuPlugin;
        this.$action = runnable;
        this.$tintDrawable = drawable;
    }
}
