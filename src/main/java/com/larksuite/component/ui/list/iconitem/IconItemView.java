package com.larksuite.component.ui.list.iconitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.list.LarkListItemView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;

public class IconItemView extends LarkListItemView {

    /* renamed from: a */
    ImageView f62735a;

    /* renamed from: b */
    TextView f62736b;

    /* renamed from: c */
    TextView f62737c;

    /* renamed from: d */
    TextView f62738d;

    /* renamed from: e */
    LinearLayout f62739e;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.ui.list.LarkListItemView
    /* renamed from: a */
    public void mo89812a() {
        mo89814a(IconItemModel.class, IconItemView.class, new IconItemBinder());
        mo89814a(IconItemTagModel.class, IconItemView.class, new IconItemTagBinder());
    }

    public IconItemView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo89824a(IconItemModel bVar) {
        mo89813a(this, bVar);
    }

    /* renamed from: a */
    public void mo89823a(int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i, new int[]{R.attr.icon_margin_start, R.attr.icon_size, R.attr.subtitle_size, R.attr.tag_size, R.attr.title_size});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, (int) C25653b.m91892a(getContext(), 20.0f));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, (int) C25653b.m91892a(getContext(), 20.0f));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(4, C25653b.m91897c(getContext(), 16.0f));
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(2, C25653b.m91897c(getContext(), 14.0f));
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(3, C25653b.m91897c(getContext(), 14.0f));
        obtainStyledAttributes.recycle();
        ((LinearLayout.LayoutParams) this.f62735a.getLayoutParams()).setMarginStart(dimensionPixelSize);
        this.f62735a.getLayoutParams().width = dimensionPixelSize2;
        this.f62735a.getLayoutParams().height = dimensionPixelSize2;
        this.f62736b.setTextSize(0, (float) dimensionPixelSize3);
        this.f62738d.setTextSize(0, (float) dimensionPixelSize4);
        this.f62737c.setTextSize(0, (float) dimensionPixelSize5);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.ui.list.LarkListItemView
    /* renamed from: a */
    public View mo89811a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int a = (int) C25653b.m91892a(context, 16.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f62735a = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        layoutParams.setMarginStart((int) C25653b.m91892a(context, 20.0f));
        linearLayout.addView(this.f62735a, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f62739e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f62739e.setPaddingRelative(0, a, 0, a);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.gravity = 16;
        layoutParams2.weight = 1.0f;
        layoutParams2.setMarginStart(a);
        layoutParams2.setMarginEnd(a);
        this.f62739e.setLayoutParams(layoutParams2);
        TextView textView = new TextView(context);
        this.f62736b = textView;
        textView.setTextColor(ContextCompat.getColor(context, R.color.text_title));
        this.f62736b.setTextSize(16.0f);
        this.f62736b.setEllipsize(TextUtils.TruncateAt.END);
        this.f62736b.setSingleLine(true);
        this.f62736b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = new TextView(context);
        this.f62738d = textView2;
        textView2.setTextColor(ContextCompat.getColor(context, R.color.text_placeholder));
        this.f62738d.setTextSize(14.0f);
        this.f62738d.setEllipsize(TextUtils.TruncateAt.END);
        this.f62738d.setMaxLines(2);
        this.f62738d.setPaddingRelative(0, (int) C25653b.m91892a(context, 2.0f), 0, 0);
        this.f62738d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f62739e.addView(this.f62736b);
        this.f62739e.addView(this.f62738d);
        linearLayout.addView(this.f62739e, layoutParams2);
        TextView textView3 = new TextView(context);
        this.f62737c = textView3;
        textView3.setTextColor(ContextCompat.getColor(context, R.color.icon_n3));
        this.f62737c.setCompoundDrawablePadding((int) C25653b.m91892a(context, 5.0f));
        this.f62737c.setSingleLine(true);
        this.f62737c.setEllipsize(TextUtils.TruncateAt.START);
        this.f62737c.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginEnd((int) C25653b.m91892a(context, 20.0f));
        layoutParams3.gravity = 16;
        linearLayout.addView(this.f62737c, layoutParams3);
        return linearLayout;
    }

    public IconItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            mo89823a(attributeSet.getStyleAttribute());
        }
    }

    public IconItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            mo89823a(attributeSet.getStyleAttribute());
        }
    }
}
