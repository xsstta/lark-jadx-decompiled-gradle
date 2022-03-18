package com.bytedance.ee.bear.sheet.panel.panelcell;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.bytedance.ee.util.ui.ColorUtils;
import com.larksuite.suite.R;

public class SheetColorView extends SheetListItemView {

    /* renamed from: c */
    private View f30338c;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView
    /* renamed from: a */
    public void mo43227a() {
        super.mo43227a();
        View findViewById = findViewById(R.id.list_item_color_icon);
        this.f30338c = findViewById;
        findViewById.setVisibility(0);
    }

    public SheetColorView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private boolean m46878a(String str) {
        if (str == null) {
            return false;
        }
        int a = ColorUtils.m55697a(str);
        boolean a2 = ColorUtils.m55701a(getContext());
        if ((!ColorUtils.m55699a(a) || !a2) && (!ColorUtils.m55702b(a) || a2)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView, com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a
    /* renamed from: a */
    public void mo43222a(SheetItem sheetItem) {
        int i;
        super.mo43222a(sheetItem);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f30338c.getBackground().mutate();
        gradientDrawable.setColor(ColorUtils.m55697a(sheetItem.getValue()));
        if (m46878a(sheetItem.getValue())) {
            i = getResources().getDimensionPixelSize(R.dimen.space_kit_len_1);
        } else {
            i = 0;
        }
        gradientDrawable.setStroke(i, getResources().getColor(R.color.line_border_component));
    }

    public SheetColorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SheetColorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
