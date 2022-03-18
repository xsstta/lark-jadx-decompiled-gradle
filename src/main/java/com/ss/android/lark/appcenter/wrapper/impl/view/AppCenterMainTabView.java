package com.ss.android.lark.appcenter.wrapper.impl.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.res.C0760e;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.MainTabItemView;

public class AppCenterMainTabView extends MainTabItemView {
    /* renamed from: c */
    private void m107231c() {
        setId(R.id.app_center_tab);
        Context context = getContext();
        Resources resources = getResources();
        if (DesktopUtil.m144301a(context)) {
            mo201235a(C0760e.m3682a(resources, R.drawable.appcenter_tab_normal_desktop, context.getTheme()), new MainTabItemView.AbstractC59196a(resources, context) {
                /* class com.ss.android.lark.appcenter.wrapper.impl.view.$$Lambda$AppCenterMainTabView$GkQh5yImUPCltmv7Nxz_pIgi20 */
                public final /* synthetic */ Resources f$0;
                public final /* synthetic */ Context f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.widget.tab.MainTabItemView.AbstractC59196a
                public final Drawable getDrawable() {
                    return AppCenterMainTabView.m270274lambda$GkQh5yImUPCltmv7Nxz_pIgi20(this.f$0, this.f$1);
                }
            });
        } else {
            mo201235a(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_tab_app_filled, UIHelper.getColor(R.color.ud_N500)), new MainTabItemView.AbstractC59196a(resources, context) {
                /* class com.ss.android.lark.appcenter.wrapper.impl.view.$$Lambda$AppCenterMainTabView$9m_jCEQ76AJEnsj1gOXVSGRO4as */
                public final /* synthetic */ Resources f$0;
                public final /* synthetic */ Context f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.widget.tab.MainTabItemView.AbstractC59196a
                public final Drawable getDrawable() {
                    return AppCenterMainTabView.lambda$9m_jCEQ76AJEnsj1gOXVSGRO4as(this.f$0, this.f$1);
                }
            });
        }
        setTabTitle(UIHelper.getString(R.string.Lark_Legacy_AppCenter));
        if (!DesktopUtil.m144301a(context)) {
            setRedDotView(new AppCenterBadgeRedDotView(context));
        }
    }

    public AppCenterMainTabView(Context context) {
        this(context, null);
    }

    public AppCenterMainTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Drawable m107229a(Resources resources, Context context) {
        return C0760e.m3682a(resources, R.drawable.ud_icon_tab_app_colorful, context.getTheme());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Drawable m107230b(Resources resources, Context context) {
        return C0760e.m3682a(resources, R.drawable.appcenter_tab_checked_desktop, context.getTheme());
    }

    public AppCenterMainTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m107231c();
    }
}
