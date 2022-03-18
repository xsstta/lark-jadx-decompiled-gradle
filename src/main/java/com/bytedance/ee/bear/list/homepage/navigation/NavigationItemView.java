package com.bytedance.ee.bear.list.homepage.navigation;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;

class NavigationItemView extends ConstraintLayout {

    /* renamed from: a */
    public LKUIRoundedImageView2 f22890a;

    /* renamed from: b */
    public TextView f22891b;

    /* renamed from: c */
    public UDBadgeView f22892c;

    /* renamed from: d */
    public ConstraintLayout.LayoutParams f22893d;

    public NavigationItemView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo33145a(String str) {
        this.f22891b.setText(str);
        this.f22891b.getPaint().getTextBounds(str, 0, str.length(), new Rect());
        this.f22893d.topMargin = (this.f22891b.getLineHeight() / 2) - C57582a.m223600a(3);
    }

    /* renamed from: a */
    private void m35133a(Context context) {
        int a = C57582a.m223600a(2);
        int a2 = C57582a.m223600a(4);
        int a3 = C57582a.m223600a(6);
        int a4 = C57582a.m223600a(8);
        int a5 = C57582a.m223600a(30);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        setId(R.id.list_navigation_item_container);
        setBackground(getResources().getDrawable(R.drawable.list_navigation_item_selector));
        LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(context);
        this.f22890a = lKUIRoundedImageView2;
        lKUIRoundedImageView2.setId(R.id.list_navigation_item_icon);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(a5, a5);
        layoutParams.f2816h = 0;
        layoutParams.f2812d = 0;
        layoutParams.f2815g = 0;
        layoutParams.topMargin = a2;
        addView(this.f22890a, layoutParams);
        TextView textView = new TextView(context);
        this.f22891b = textView;
        textView.setId(R.id.list_navigation_item_name);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = a4;
        layoutParams2.topMargin = a2;
        layoutParams2.f2817i = R.id.list_navigation_item_icon;
        layoutParams2.f2819k = 0;
        layoutParams2.f2812d = 0;
        layoutParams2.f2815g = 0;
        this.f22891b.setGravity(17);
        this.f22891b.setMaxLines(2);
        this.f22891b.setEllipsize(TextUtils.TruncateAt.END);
        this.f22891b.setTextColor(context.getResources().getColor(R.color.text_title));
        this.f22891b.setTextSize(2, 12.0f);
        addView(this.f22891b, layoutParams2);
        UDBadgeView a6 = new UDBadgeView.Builder().mo90261a(2131887083).mo90262a(context);
        this.f22892c = a6;
        a6.setId(R.id.list_navigation_item_badge);
        Constraints.LayoutParams layoutParams3 = new Constraints.LayoutParams(-2, -2);
        this.f22893d = layoutParams3;
        ((ConstraintLayout.LayoutParams) layoutParams3).rightMargin = a;
        this.f22893d.topMargin = a3;
        this.f22893d.f2816h = R.id.list_navigation_item_name;
        this.f22893d.f2814f = R.id.list_navigation_item_name;
        this.f22892c.setBadgeColor(ContextCompat.getColor(context, R.color.primary_pri_300));
        this.f22892c.mo90238b();
        addView(this.f22892c, this.f22893d);
    }

    public NavigationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m35133a(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f22892c.getVisibility() == 0 && this.f22891b.getLeft() <= this.f22892c.getMeasuredWidth()) {
            this.f22891b.layout(this.f22892c.getMeasuredWidth(), this.f22891b.getTop(), Math.min(this.f22891b.getRight(), getMeasuredWidth()), this.f22891b.getBottom());
            UDBadgeView uDBadgeView = this.f22892c;
            uDBadgeView.layout(0, uDBadgeView.getTop(), this.f22892c.getMeasuredWidth(), this.f22892c.getBottom());
        }
    }
}
