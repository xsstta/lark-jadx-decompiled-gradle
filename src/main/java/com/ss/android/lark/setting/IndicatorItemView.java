package com.ss.android.lark.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.setting.BaseItemView;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57886v;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.C58323b;

public class IndicatorItemView extends BaseItemView {

    /* renamed from: c */
    private TextView f133966c;

    /* renamed from: d */
    private ImageView f133967d;

    /* renamed from: e */
    private TextView f133968e;

    /* renamed from: f */
    private ImageView f133969f;

    /* renamed from: g */
    private String f133970g;

    /* renamed from: h */
    private Drawable f133971h;

    /* renamed from: i */
    private String f133972i;

    /* renamed from: j */
    private Drawable f133973j;

    /* renamed from: k */
    private View.OnClickListener f133974k;

    /* renamed from: com.ss.android.lark.setting.IndicatorItemView$a */
    public static class C54112a extends BaseItemView.AbstractC54107a<C54112a, IndicatorItemView> {

        /* renamed from: h */
        public String f133975h;

        /* renamed from: i */
        public Drawable f133976i;

        /* renamed from: j */
        public String f133977j;

        /* renamed from: k */
        public Drawable f133978k;

        /* renamed from: l */
        public View.OnClickListener f133979l;

        /* renamed from: b */
        public IndicatorItemView mo185177a() {
            return new IndicatorItemView(this);
        }

        /* renamed from: a */
        public C54112a mo185191a(View.OnClickListener onClickListener) {
            this.f133979l = onClickListener;
            return this;
        }

        /* renamed from: c */
        public C54112a mo185193c(String str) {
            this.f133975h = str;
            return this;
        }

        public C54112a(Context context) {
            super(context, 1);
            this.f133976i = UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_right_outlined, C57582a.m223616d(context, R.color.icon_n3));
        }
    }

    public IndicatorItemView(Context context) {
        this(context, null);
    }

    public IndicatorItemView(C54112a aVar) {
        super(aVar);
        this.f133970g = aVar.f133975h;
        this.f133971h = aVar.f133976i;
        this.f133972i = aVar.f133977j;
        this.f133973j = aVar.f133978k;
        this.f133974k = aVar.f133979l;
        mo185169a(aVar.f133955g);
    }

    /* renamed from: a */
    public void mo185189a(boolean z) {
        int i;
        ImageView imageView = this.f133969f;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        if (z) {
            this.f133969f.setImageBitmap(C57886v.m224663a(R.layout.setting_view_upgrade_tip, getContext(), R.dimen.setting_upgrade_tip_width, R.dimen.setting_upgrade_tip_height));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.setting.BaseItemView
    public void setupContainer(FrameLayout frameLayout) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        TextView textView = new TextView(getContext());
        this.f133966c = textView;
        textView.setId(R.id.setting_item_left_text);
        this.f133966c.setTextSize((float) C54114b.f133987b);
        this.f133966c.setTextColor(getContext().getResources().getColorStateList(R.color.text_title));
        this.f133966c.setMaxLines(2);
        m209954a(this.f133966c, this.f133970g);
        ConstraintLayout.LayoutParams a = C58323b.m226143a(BitmapDescriptorFactory.HUE_RED, -2.0f, 16, 0, 16, 0);
        a.f2816h = 0;
        a.f2819k = 0;
        a.f2825q = 0;
        a.f2826r = R.id.setting_item_right_drawable;
        a.f2787E = 1.0f;
        a.f2789G = 2;
        constraintLayout.addView(this.f133966c, a);
        ImageView imageView = new ImageView(getContext());
        this.f133969f = imageView;
        imageView.setId(R.id.setting_item_right_drawable);
        ConstraintLayout.LayoutParams a2 = C58323b.m226143a(-2.0f, -2.0f, 0, 0, 5, 0);
        a2.f2816h = 0;
        a2.f2819k = 0;
        a2.f2824p = R.id.setting_item_left_text;
        a2.f2826r = R.id.setting_item_right_text;
        m209953a(this.f133969f, this.f133973j);
        constraintLayout.addView(this.f133969f, a2);
        m209953a(this.f133969f, this.f133973j);
        TextView textView2 = new TextView(getContext());
        this.f133968e = textView2;
        textView2.setId(R.id.setting_item_right_text);
        this.f133968e.setTextSize((float) C54114b.f133988c);
        this.f133968e.setTextColor(getContext().getResources().getColorStateList(R.color.text_title));
        ConstraintLayout.LayoutParams a3 = C58323b.m226143a(-2.0f, -2.0f, 0, 0, 5, 0);
        a3.f2816h = 0;
        a3.f2819k = 0;
        a3.f2824p = R.id.setting_item_right_drawable;
        a3.f2826r = R.id.setting_item_right_icon;
        constraintLayout.addView(this.f133968e, a3);
        m209954a(this.f133968e, this.f133972i);
        ImageView imageView2 = new ImageView(getContext());
        this.f133967d = imageView2;
        imageView2.setId(R.id.setting_item_right_icon);
        this.f133967d.setImageTintList(getContext().getResources().getColorStateList(R.color.icon_n3));
        ConstraintLayout.LayoutParams a4 = C58323b.m226143a(16.0f, 16.0f, 0, 0, 16, 0);
        a4.f2816h = 0;
        a4.f2819k = 0;
        a4.f2824p = R.id.setting_item_right_text;
        a4.f2827s = 0;
        constraintLayout.addView(this.f133967d, a4);
        m209953a(this.f133967d, this.f133971h);
        setupBackground(constraintLayout);
        constraintLayout.setClickable(true);
        constraintLayout.setOnClickListener(this.f133974k);
        frameLayout.addView(constraintLayout, new ConstraintLayout.LayoutParams(-1, UIHelper.dp2px((float) C54114b.f133989d)));
    }

    public IndicatorItemView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    /* renamed from: a */
    private void m209953a(ImageView imageView, Drawable drawable) {
        int i;
        if (drawable == null) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    private void m209954a(TextView textView, String str) {
        int i;
        textView.setText(str);
        if (TextUtils.isEmpty(str)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.setting.BaseItemView
    /* renamed from: a */
    public void mo185170a(Context context, AttributeSet attributeSet) {
        super.mo185170a(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bottom_desc, R.attr.button_color, R.attr.button_text, R.attr.containerType, R.attr.divider_bottom_visible, R.attr.divider_top_visible, R.attr.end_indicator, R.attr.end_indicator_drawable, R.attr.end_indicator_text, R.attr.indicator_text, R.attr.margin_top, R.attr.upper_desc});
            this.f133970g = obtainStyledAttributes.getString(9);
            this.f133971h = obtainStyledAttributes.getDrawable(6);
            this.f133973j = obtainStyledAttributes.getDrawable(7);
            this.f133972i = obtainStyledAttributes.getString(8);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void mo185190a(boolean z, boolean z2) {
        if (!z && z2) {
            this.f133969f.setVisibility(0);
            this.f133969f.setImageResource(R.drawable.update_red_dot);
        }
    }

    public IndicatorItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo185170a(context, attributeSet);
        mo185169a(context);
    }
}
