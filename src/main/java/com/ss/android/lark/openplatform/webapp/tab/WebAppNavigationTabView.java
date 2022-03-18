package com.ss.android.lark.openplatform.webapp.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lark.pb.openplatform.v1.OpenAppBadgeNode;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.widget.tab.AbstractC59206b;
import com.ss.android.lark.widget.tab.NavigationTabItemView;

public class WebAppNavigationTabView extends NavigationTabItemView {

    /* renamed from: a */
    private OpenAppBadgeNode f122797a;

    public OpenAppBadgeNode getCurrentBadgeNode() {
        return this.f122797a;
    }

    public WebAppNavigationTabView(Context context) {
        super(context);
    }

    public void setCurrentBadgeNode(OpenAppBadgeNode openAppBadgeNode) {
        this.f122797a = openAppBadgeNode;
        if (openAppBadgeNode == null) {
            mo201263a(0);
        } else if (!openAppBadgeNode.need_show.booleanValue()) {
            mo201263a(0);
        } else {
            mo201263a(openAppBadgeNode.badge_num.intValue());
        }
    }

    /* renamed from: a */
    public void mo170703a(final TabAppInfo tabAppInfo) {
        if (tabAppInfo == null) {
            C53241h.m205898b("WebAppTabPageSpecV2", "initTabViewIcons tabAppInfo is null!");
            return;
        }
        if (tabAppInfo.getLogo() != null) {
            setRemoteDrawable(new AbstractC59206b() {
                /* class com.ss.android.lark.openplatform.webapp.tab.WebAppNavigationTabView.C488791 */

                @Override // com.ss.android.lark.widget.tab.AbstractC59206b
                /* renamed from: a */
                public Drawable mo149226a() {
                    return WebAppNavigationTabView.this.getResources().getDrawable(R.drawable.webapp_navi_tab_default);
                }

                @Override // com.ss.android.lark.widget.tab.AbstractC59206b
                /* renamed from: b */
                public String mo149227b() {
                    return tabAppInfo.getLogo().getSecretaryDefault();
                }
            });
            setTabTitle(C48880a.m192567a(getContext(), tabAppInfo));
        } else {
            C53241h.m205898b("WebAppTabPageSpecV2", "initTabViewIcons tabAppInfo.logo is null!");
        }
        if (!DesktopUtil.m144301a(getContext())) {
            WebAppBadgeRedDotView bVar = new WebAppBadgeRedDotView(getContext());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f2815g = R.id.icon;
            layoutParams.f2813e = R.id.icon;
            layoutParams.f2816h = R.id.icon;
            layoutParams.f2818j = R.id.icon;
            mo201264a(bVar, layoutParams);
        }
    }

    public WebAppNavigationTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WebAppNavigationTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
