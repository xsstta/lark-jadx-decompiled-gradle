package com.ss.android.lark.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.setting.BaseItemView;
import com.ss.android.lark.utils.UIHelper;

public class ButtonItemView extends BaseItemView {

    /* renamed from: c */
    private TextView f133956c;

    /* renamed from: d */
    private String f133957d;

    /* renamed from: e */
    private int f133958e;

    /* renamed from: f */
    private View.OnClickListener f133959f;

    /* renamed from: com.ss.android.lark.setting.ButtonItemView$a */
    public static class C54108a extends BaseItemView.AbstractC54107a<C54108a, ButtonItemView> {

        /* renamed from: h */
        public String f133960h;

        /* renamed from: i */
        public int f133961i;

        /* renamed from: j */
        public View.OnClickListener f133962j;

        /* renamed from: b */
        public ButtonItemView mo185177a() {
            return new ButtonItemView(this);
        }

        /* renamed from: a */
        public C54108a mo185181a(View.OnClickListener onClickListener) {
            this.f133962j = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C54108a mo185182b(int i) {
            this.f133961i = i;
            return this;
        }

        /* renamed from: c */
        public C54108a mo185184c(String str) {
            this.f133960h = str;
            return this;
        }

        public C54108a(Context context) {
            super(context, 4);
        }
    }

    public ButtonItemView(Context context) {
        this(context, null);
    }

    public void setEnable(boolean z) {
        this.f133956c.setEnabled(z);
    }

    public ButtonItemView(C54108a aVar) {
        super(aVar);
        this.f133957d = aVar.f133960h;
        this.f133958e = aVar.f133961i;
        this.f133959f = aVar.f133962j;
        mo185169a(getContext());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.setting.BaseItemView
    public void setupContainer(FrameLayout frameLayout) {
        TextView textView = new TextView(getContext());
        this.f133956c = textView;
        textView.setId(R.id.setting_item_button);
        this.f133956c.setTextSize((float) C54114b.f133990e);
        this.f133956c.setTextColor(this.f133958e);
        this.f133956c.setMaxLines(1);
        this.f133956c.setText(this.f133957d);
        this.f133956c.setGravity(17);
        setupBackground(this.f133956c);
        this.f133956c.setOnClickListener(this.f133959f);
        frameLayout.addView(this.f133956c, new FrameLayout.LayoutParams(-1, UIHelper.dp2px((float) C54114b.f133989d)));
    }

    public ButtonItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.setting.BaseItemView
    /* renamed from: a */
    public void mo185170a(Context context, AttributeSet attributeSet) {
        super.mo185170a(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bottom_desc, R.attr.button_color, R.attr.button_text, R.attr.containerType, R.attr.divider_bottom_visible, R.attr.divider_top_visible, R.attr.end_indicator, R.attr.end_indicator_drawable, R.attr.end_indicator_text, R.attr.indicator_text, R.attr.margin_top, R.attr.upper_desc});
            this.f133957d = obtainStyledAttributes.getString(2);
            this.f133958e = obtainStyledAttributes.getColor(1, getResources().getColor(R.color.text_title));
            obtainStyledAttributes.recycle();
        }
    }

    public ButtonItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo185170a(context, attributeSet);
        mo185169a(context);
    }
}
