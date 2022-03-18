package com.ss.android.lark.littleapp.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lark.pb.openplatform.v1.OpenAppBadgeNode;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.littleapp.p2131f.C41353c;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.widget.tab.AbstractC59206b;
import com.ss.android.lark.widget.tab.NavigationTabItemView;

public class GadgetNavigationTabView extends NavigationTabItemView {

    /* renamed from: a */
    private OpenAppBadgeNode f105405a;

    public OpenAppBadgeNode getCurrentBadgeNode() {
        return this.f105405a;
    }

    public GadgetNavigationTabView(Context context) {
        super(context);
    }

    public void setTabAppInfo(TabAppInfo tabAppInfo) {
        if (tabAppInfo != null) {
            m164500a(tabAppInfo);
        }
    }

    public void setCurrentBadgeNode(OpenAppBadgeNode openAppBadgeNode) {
        this.f105405a = openAppBadgeNode;
        if (openAppBadgeNode == null) {
            mo201263a(0);
        } else if (!openAppBadgeNode.need_show.booleanValue()) {
            mo201263a(0);
        } else {
            mo201263a(openAppBadgeNode.badge_num.intValue());
        }
    }

    /* renamed from: a */
    private void m164500a(final TabAppInfo tabAppInfo) {
        if (tabAppInfo.getLogo() != null) {
            setRemoteDrawable(new AbstractC59206b() {
                /* class com.ss.android.lark.littleapp.view.GadgetNavigationTabView.C414591 */

                @Override // com.ss.android.lark.widget.tab.AbstractC59206b
                /* renamed from: a */
                public Drawable mo149226a() {
                    return GadgetNavigationTabView.this.getResources().getDrawable(R.drawable.gadget_navi_tab_default);
                }

                @Override // com.ss.android.lark.widget.tab.AbstractC59206b
                /* renamed from: b */
                public String mo149227b() {
                    return tabAppInfo.getLogo().getSecretaryDefault();
                }
            });
            setTabTitle(C41353c.m163937a(tabAppInfo));
            if (!DesktopUtil.m144301a(getContext())) {
                C41465b bVar = new C41465b(getContext());
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                layoutParams.f2815g = R.id.icon;
                layoutParams.f2813e = R.id.icon;
                layoutParams.f2816h = R.id.icon;
                mo201264a(bVar, layoutParams);
            }
        }
    }

    public GadgetNavigationTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GadgetNavigationTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
