package com.bytedance.ee.bear.drive.biz.preview.more;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/more/AbsDriveMoreMenuPlugin$createOutlineMenuItem$1", "Lcom/bytedance/ee/bear/browser/plugin/MenuItem;", "onClick", "", "v", "Landroid/view/View;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AbsDriveMoreMenuPlugin$createOutlineMenuItem$1 extends MenuItem {
    final /* synthetic */ Drawable $tintDrawable;
    final /* synthetic */ AbsDriveMoreMenuPlugin this$0;

    @Override // com.bytedance.ee.bear.browser.plugin.MenuItem
    public void onClick(View view) {
        C10548d.m43697a(view);
        this.this$0.titleBarViewModel().showOutlineDialog();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AbsDriveMoreMenuPlugin$createOutlineMenuItem$1(AbsDriveMoreMenuPlugin absDriveMoreMenuPlugin, Drawable drawable, String str, Drawable drawable2, String str2) {
        super(str, drawable2, str2);
        this.this$0 = absDriveMoreMenuPlugin;
        this.$tintDrawable = drawable;
    }
}
