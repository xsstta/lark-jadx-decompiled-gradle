package com.ss.android.lark.openplatform.webapp.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lark.pb.openplatform.v1.OpenAppBadgeNode;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.widget.tab.AbstractC59206b;
import com.ss.android.lark.widget.tab.MainTabItemView;

public class WebAppMainTabView extends MainTabItemView {

    /* renamed from: a */
    private OpenAppBadgeNode f122792a;

    public OpenAppBadgeNode getCurrentBadgeNode() {
        return this.f122792a;
    }

    public WebAppMainTabView(Context context) {
        this(context, null);
    }

    public void setCurrentBadgeNode(OpenAppBadgeNode openAppBadgeNode) {
        this.f122792a = openAppBadgeNode;
        if (openAppBadgeNode == null) {
            mo201233a(0);
        } else if (!openAppBadgeNode.need_show.booleanValue()) {
            mo201233a(0);
        } else {
            mo201233a(openAppBadgeNode.badge_num.intValue());
        }
    }

    /* renamed from: a */
    public void mo170700a(TabAppInfo tabAppInfo) {
        final String[] strArr;
        if (tabAppInfo == null) {
            C53241h.m205898b("WebAppTabPageSpecV2", "initTabViewIcons tabAppInfo is null!");
            return;
        }
        TabAppInfo.Logo logo = tabAppInfo.getLogo();
        if (logo != null) {
            String primaryColorPng = logo.getPrimaryColorPng();
            boolean z = true;
            if (!TextUtils.isEmpty(primaryColorPng)) {
                strArr = new String[]{primaryColorPng, primaryColorPng};
            } else {
                strArr = new String[]{logo.getPrimaryDefault(), logo.getPrimarySelected()};
                z = false;
            }
            setRemoteDrawableTintEnabled(z);
            mo201237a(new AbstractC59206b() {
                /* class com.ss.android.lark.openplatform.webapp.tab.WebAppMainTabView.C488771 */

                @Override // com.ss.android.lark.widget.tab.AbstractC59206b
                /* renamed from: b */
                public String mo149227b() {
                    return strArr[0];
                }

                @Override // com.ss.android.lark.widget.tab.AbstractC59206b
                /* renamed from: a */
                public Drawable mo149226a() {
                    return WebAppMainTabView.this.getResources().getDrawable(R.drawable.webapp_main_tab_default_unselected);
                }
            }, new AbstractC59206b() {
                /* class com.ss.android.lark.openplatform.webapp.tab.WebAppMainTabView.C488782 */

                @Override // com.ss.android.lark.widget.tab.AbstractC59206b
                /* renamed from: b */
                public String mo149227b() {
                    return strArr[1];
                }

                @Override // com.ss.android.lark.widget.tab.AbstractC59206b
                /* renamed from: a */
                public Drawable mo149226a() {
                    return WebAppMainTabView.this.getResources().getDrawable(R.drawable.webapp_main_tab_default_selected);
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
            mo201236a(bVar, layoutParams);
        }
    }

    public WebAppMainTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WebAppMainTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
