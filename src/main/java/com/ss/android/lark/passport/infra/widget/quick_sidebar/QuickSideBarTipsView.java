package com.ss.android.lark.passport.infra.widget.quick_sidebar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.ss.android.lark.passport.infra.widget.quick_sidebar.tipsview.QuickSideBarTipsItemView;

public class QuickSideBarTipsView extends RelativeLayout {

    /* renamed from: a */
    private QuickSideBarTipsItemView f123685a;

    public QuickSideBarTipsView(Context context) {
        this(context, null);
    }

    public QuickSideBarTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m194164a(Context context, AttributeSet attributeSet) {
        this.f123685a = new QuickSideBarTipsItemView(context, attributeSet);
        addView(this.f123685a, new RelativeLayout.LayoutParams(-1, -2));
    }

    public QuickSideBarTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m194164a(context, attributeSet);
    }
}
