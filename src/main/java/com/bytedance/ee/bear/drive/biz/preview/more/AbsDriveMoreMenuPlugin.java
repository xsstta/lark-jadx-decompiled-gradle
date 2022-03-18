package com.bytedance.ee.bear.drive.biz.preview.more;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.AbstractC1142af;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.view.preview.wrapper.TitleBarViewModel;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0004J\b\u0010\u0007\u001a\u00020\u0004H\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J!\u0010\u000e\u001a\u00020\t2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0010\"\u00020\u0004H\u0004¢\u0006\u0002\u0010\u0011J\u0016\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0004¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/more/AbsDriveMoreMenuPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "createMoreMenuItem", "Lcom/bytedance/ee/bear/browser/plugin/MenuItem;", "action", "Ljava/lang/Runnable;", "createOutlineMenuItem", "onAttachToUIContainer", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "showRightMenu", "items", "", "([Lcom/bytedance/ee/bear/browser/plugin/MenuItem;)V", "", "titleBarViewModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/TitleBarViewModel;", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public abstract class AbsDriveMoreMenuPlugin extends AbsDrivePlugin {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/more/AbsDriveMoreMenuPlugin$Companion;", "", "()V", "FEED_MENU_ID", "", "GUEST_PRESENTATION_MENU_ID", "MORE_MENU_ID", "OUTLINE_MENU_ID", "SHARE_MENU_ID", "TAG", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.AbsDriveMoreMenuPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final TitleBarViewModel titleBarViewModel() {
        AbstractC1142af viewModel = viewModel(TitleBarViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "viewModel(TitleBarViewModel::class.java)");
        return (TitleBarViewModel) viewModel;
    }

    /* access modifiers changed from: protected */
    public final MenuItem createOutlineMenuItem() {
        Drawable a = C13747j.m55724a(getContext(), (int) R.drawable.ud_icon_table_group_outlined, (int) R.color.facade_selector_icon_n1);
        return new AbsDriveMoreMenuPlugin$createOutlineMenuItem$1(this, a, "ccm_drive_outline_menu", a, "");
    }

    /* access modifiers changed from: protected */
    public final MenuItem createMoreMenuItem(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "action");
        Drawable a = C13747j.m55724a(getContext(), (int) R.drawable.ud_icon_more_outlined, (int) R.color.facade_selector_icon_n1);
        return new AbsDriveMoreMenuPlugin$createMoreMenuItem$1(this, runnable, a, "ccm_drive_more_menu", a, "");
    }

    /* access modifiers changed from: protected */
    public final void showRightMenu(List<? extends MenuItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "items");
        getTitleBar().mo19528h(true);
        TitleBar titleBar = getTitleBar();
        Intrinsics.checkExpressionValueIsNotNull(titleBar, "titleBar");
        titleBar.mo19508a().mo45073a();
        getTitleBar().mo19514a(list, TitleBar.MenuType.Right);
    }

    /* access modifiers changed from: protected */
    public final void showRightMenu(MenuItem... menuItemArr) {
        Intrinsics.checkParameterIsNotNull(menuItemArr, "items");
        getTitleBar().mo19528h(true);
        TitleBar titleBar = getTitleBar();
        Intrinsics.checkExpressionValueIsNotNull(titleBar, "titleBar");
        titleBar.mo19508a().mo45073a();
        getTitleBar().mo19514a(C69043h.m265716a(menuItemArr), TitleBar.MenuType.Right);
    }

    public void onAttachToUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onAttachToUIContainer((C4943e) aVar, nVar);
    }
}
