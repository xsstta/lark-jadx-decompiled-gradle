package com.ss.android.lark.littleapp.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.common.utility.Logger;
import com.bytedance.lark.pb.openplatform.v1.OpenAppBadgeNode;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.littleapp.p2131f.C41353c;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.widget.tab.AbstractC59206b;
import com.ss.android.lark.widget.tab.MainTabItemView;

public class GadgetMainTabView extends MainTabItemView {

    /* renamed from: a */
    private OpenAppBadgeNode f105400a;

    public OpenAppBadgeNode getCurrentBadgeNode() {
        return this.f105400a;
    }

    public GadgetMainTabView(Context context) {
        this(context, null);
    }

    public void setTabAppInfo(TabAppInfo tabAppInfo) {
        if (tabAppInfo != null) {
            m164495a(tabAppInfo);
        } else {
            Logger.m15173i("GadgetMainTabView", "setTabAppInfo tabAppInfo is null!");
        }
    }

    public void setCurrentBadgeNode(OpenAppBadgeNode openAppBadgeNode) {
        this.f105400a = openAppBadgeNode;
        if (openAppBadgeNode == null) {
            mo201233a(0);
        } else if (!openAppBadgeNode.need_show.booleanValue()) {
            mo201233a(0);
        } else {
            mo201233a(openAppBadgeNode.badge_num.intValue());
        }
    }

    /* renamed from: a */
    private void m164495a(TabAppInfo tabAppInfo) {
        final String[] strArr;
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
                /* class com.ss.android.lark.littleapp.view.GadgetMainTabView.C414571 */

                @Override // com.ss.android.lark.widget.tab.AbstractC59206b
                /* renamed from: b */
                public String mo149227b() {
                    return strArr[0];
                }

                @Override // com.ss.android.lark.widget.tab.AbstractC59206b
                /* renamed from: a */
                public Drawable mo149226a() {
                    return GadgetMainTabView.this.getResources().getDrawable(R.drawable.gadget_main_tab_default_unselected);
                }
            }, new AbstractC59206b() {
                /* class com.ss.android.lark.littleapp.view.GadgetMainTabView.C414582 */

                @Override // com.ss.android.lark.widget.tab.AbstractC59206b
                /* renamed from: b */
                public String mo149227b() {
                    return strArr[1];
                }

                @Override // com.ss.android.lark.widget.tab.AbstractC59206b
                /* renamed from: a */
                public Drawable mo149226a() {
                    return GadgetMainTabView.this.getResources().getDrawable(R.drawable.gadget_main_tab_default_selected);
                }
            });
            setTabTitle(C41353c.m163937a(tabAppInfo));
            if (!DesktopUtil.m144301a(getContext())) {
                C41465b bVar = new C41465b(getContext());
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                layoutParams.f2815g = R.id.icon;
                layoutParams.f2813e = R.id.icon;
                layoutParams.f2816h = R.id.icon;
                layoutParams.f2818j = R.id.icon;
                mo201236a(bVar, layoutParams);
            }
        }
    }

    public GadgetMainTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GadgetMainTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
