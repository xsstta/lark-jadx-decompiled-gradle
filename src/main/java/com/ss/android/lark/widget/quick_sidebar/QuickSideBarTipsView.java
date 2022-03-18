package com.ss.android.lark.widget.quick_sidebar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.ss.android.lark.widget.quick_sidebar.tipsview.QuickSideBarTipsItemView;

public class QuickSideBarTipsView extends RelativeLayout {

    /* renamed from: a */
    private QuickSideBarTipsItemView f146050a;

    public QuickSideBarTipsView(Context context) {
        this(context, null);
    }

    public QuickSideBarTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m228844a(Context context, AttributeSet attributeSet) {
        this.f146050a = new QuickSideBarTipsItemView(context, attributeSet);
        addView(this.f146050a, new RelativeLayout.LayoutParams(-1, -2));
    }

    public QuickSideBarTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m228844a(context, attributeSet);
    }

    /* renamed from: a */
    public void mo200024a(String str, int i, float f) {
        this.f146050a.setText(str);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f146050a.getLayoutParams();
        layoutParams.topMargin = (int) (((double) f) - (((double) getWidth()) / 2.8d));
        this.f146050a.setLayoutParams(layoutParams);
    }
}
