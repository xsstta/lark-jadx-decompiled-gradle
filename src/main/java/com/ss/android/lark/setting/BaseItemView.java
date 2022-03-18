package com.ss.android.lark.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.C58323b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class BaseItemView extends ConstraintLayout implements AbstractC54113a {

    /* renamed from: a */
    protected boolean f133935a;

    /* renamed from: b */
    protected boolean f133936b;

    /* renamed from: c */
    private TextView f133937c;

    /* renamed from: d */
    private TextView f133938d;

    /* renamed from: e */
    private FrameLayout f133939e;

    /* renamed from: f */
    private SettingDividerView f133940f;

    /* renamed from: g */
    private SettingDividerView f133941g;

    /* renamed from: h */
    private String f133942h;

    /* renamed from: i */
    private String f133943i;

    /* renamed from: j */
    private int f133944j;

    /* renamed from: k */
    private boolean f133945k;

    /* renamed from: l */
    private boolean f133946l;

    /* renamed from: m */
    private int f133947m;

    /* renamed from: n */
    private View f133948n;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ItemType {
    }

    /* access modifiers changed from: protected */
    public abstract void setupContainer(FrameLayout frameLayout);

    @Override // com.ss.android.lark.setting.AbstractC54113a
    /* renamed from: b */
    public boolean mo169823b() {
        if (!this.f133946l || !TextUtils.isEmpty(this.f133943i)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.setting.AbstractC54113a
    /* renamed from: a */
    public boolean mo169821a() {
        if (!this.f133945k || !TextUtils.isEmpty(this.f133942h) || this.f133947m != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.lark.setting.BaseItemView$a */
    public static abstract class AbstractC54107a<T extends AbstractC54107a, S extends BaseItemView> {

        /* renamed from: a */
        protected String f133949a;

        /* renamed from: b */
        protected String f133950b;

        /* renamed from: c */
        protected int f133951c;

        /* renamed from: d */
        protected boolean f133952d;

        /* renamed from: e */
        protected boolean f133953e;

        /* renamed from: f */
        protected int f133954f;

        /* renamed from: g */
        protected Context f133955g;

        /* renamed from: a */
        public abstract S mo185177a();

        /* renamed from: a */
        public AbstractC54107a<T, S> mo185174a(int i) {
            this.f133954f = i;
            return this;
        }

        /* renamed from: b */
        public AbstractC54107a<T, S> mo185178b(String str) {
            this.f133950b = str;
            return this;
        }

        /* renamed from: a */
        public AbstractC54107a mo185175a(String str) {
            this.f133949a = str;
            return this;
        }

        /* renamed from: b */
        public AbstractC54107a<T, S> mo185179b(boolean z) {
            this.f133953e = z;
            return this;
        }

        /* renamed from: a */
        public AbstractC54107a<T, S> mo185176a(boolean z) {
            this.f133952d = z;
            return this;
        }

        public AbstractC54107a(Context context, int i) {
            this.f133951c = i;
            this.f133955g = context;
        }
    }

    public BaseItemView(Context context) {
        this(context, null);
    }

    @Override // com.ss.android.lark.setting.AbstractC54113a
    /* renamed from: c */
    public void mo169824c(boolean z) {
        this.f133935a = z;
        mo185171a(this.f133948n, z, this.f133936b);
    }

    @Override // com.ss.android.lark.setting.AbstractC54113a
    /* renamed from: d */
    public void mo169825d(boolean z) {
        this.f133936b = z;
        mo185171a(this.f133948n, this.f133935a, z);
    }

    private void setBottomDesc(String str) {
        this.f133943i = str;
        this.f133938d.setText(str);
        if (TextUtils.isEmpty(str)) {
            this.f133938d.setVisibility(8);
        } else {
            this.f133938d.setVisibility(0);
        }
    }

    @Override // com.ss.android.lark.setting.AbstractC54113a
    /* renamed from: b */
    public void mo169822b(boolean z) {
        if (z) {
            this.f133945k = false;
            this.f133940f.setVisibility(8);
            return;
        }
        this.f133946l = false;
        this.f133941g.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void setupBackground(View view) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(UIUtils.getColorStateList(getContext(), R.color.bg_color_setting_item));
        view.setBackground(gradientDrawable);
        this.f133948n = view;
    }

    public BaseItemView(AbstractC54107a aVar) {
        super(aVar.f133955g);
        this.f133944j = aVar.f133951c;
        this.f133942h = aVar.f133949a;
        this.f133943i = aVar.f133950b;
        this.f133945k = aVar.f133952d;
        this.f133946l = aVar.f133953e;
        this.f133947m = aVar.f133954f;
    }

    private void setUpperDesc(String str) {
        float f;
        this.f133942h = str;
        this.f133937c.setText(str);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f133940f.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f133939e.getLayoutParams();
        if (TextUtils.isEmpty(str)) {
            this.f133937c.setVisibility(8);
            SettingDividerView settingDividerView = this.f133940f;
            if (this.f133947m > 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = (float) UIHelper.dp2px(16.0f);
            }
            settingDividerView.setLeftBlankWidth(f);
            if (this.f133940f.getVisibility() != 8) {
                layoutParams.setMargins(0, UIHelper.dp2px((float) this.f133947m), 0, 0);
            } else {
                layoutParams2.setMargins(0, UIHelper.dp2px((float) this.f133947m), 0, 0);
            }
        } else {
            this.f133937c.setVisibility(0);
            if (this.f133940f.getVisibility() != 8) {
                layoutParams.setMargins(0, UIHelper.dp2px((float) this.f133947m), 0, 0);
            } else {
                layoutParams2.setMargins(0, UIHelper.dp2px((float) this.f133947m), 0, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo185169a(Context context) {
        int i;
        int a = C57582a.m223601a(context, 16.0f);
        setPadding(a, 0, a, 0);
        TextView textView = new TextView(context);
        this.f133937c = textView;
        textView.setId(R.id.setting_item_top_desc);
        this.f133937c.setMaxLines(1);
        this.f133937c.setTextSize((float) C54114b.f133986a);
        this.f133937c.setTextColor(UIUtils.getColor(getContext(), R.color.text_placeholder));
        ConstraintLayout.LayoutParams a2 = C58323b.m226143a(-1.0f, -2.0f, 16, this.f133947m, 16, 2);
        a2.f2816h = 0;
        a2.f2825q = 0;
        a2.f2827s = 0;
        a2.f2818j = R.id.setting_item_top_divider;
        a2.f2790H = 2;
        addView(this.f133937c, a2);
        SettingDividerView settingDividerView = new SettingDividerView(context);
        this.f133940f = settingDividerView;
        settingDividerView.setId(R.id.setting_item_top_divider);
        SettingDividerView settingDividerView2 = this.f133940f;
        int i2 = 8;
        if (this.f133945k) {
            i = 0;
        } else {
            i = 8;
        }
        settingDividerView2.setVisibility(i);
        ConstraintLayout.LayoutParams a3 = C58323b.m226143a(BitmapDescriptorFactory.HUE_RED, 0.5f, 0, 0, 0, 0);
        a3.f2817i = R.id.setting_item_top_desc;
        a3.f2818j = R.id.setting_item_container;
        a3.f2825q = 0;
        a3.f2827s = 0;
        addView(this.f133940f, a3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f133939e = frameLayout;
        frameLayout.setId(R.id.setting_item_container);
        ConstraintLayout.LayoutParams a4 = C58323b.m226143a(-1.0f, -2.0f, 0, 0, 0, 0);
        a4.f2817i = R.id.setting_item_top_divider;
        a4.f2825q = 0;
        a4.f2827s = 0;
        a4.f2818j = R.id.setting_item_bottom_divider;
        addView(this.f133939e, a4);
        setupContainer(this.f133939e);
        TextView textView2 = new TextView(context);
        this.f133938d = textView2;
        textView2.setId(R.id.setting_item_bottom_desc);
        this.f133938d.setTextSize((float) C54114b.f133986a);
        this.f133938d.setTextColor(UIUtils.getColor(getContext(), R.color.text_placeholder));
        ConstraintLayout.LayoutParams a5 = C58323b.m226143a(-1.0f, -2.0f, 16, 2, 16, 0);
        a5.f2819k = 0;
        a5.f2825q = 0;
        a5.f2817i = R.id.setting_item_bottom_divider;
        a5.f2827s = 0;
        addView(this.f133938d, a5);
        SettingDividerView settingDividerView3 = new SettingDividerView(context);
        this.f133941g = settingDividerView3;
        settingDividerView3.setId(R.id.setting_item_bottom_divider);
        SettingDividerView settingDividerView4 = this.f133941g;
        if (this.f133946l) {
            i2 = 0;
        }
        settingDividerView4.setVisibility(i2);
        ConstraintLayout.LayoutParams a6 = C58323b.m226143a(BitmapDescriptorFactory.HUE_RED, 0.5f, 0, 0, 0, 0);
        a6.f2817i = R.id.setting_item_container;
        a6.f2818j = R.id.setting_item_bottom_desc;
        a6.f2825q = 0;
        a6.f2827s = 0;
        addView(this.f133941g, a6);
        setUpperDesc(this.f133942h);
        setBottomDesc(this.f133943i);
        setClickable(true);
    }

    public BaseItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo185170a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bottom_desc, R.attr.button_color, R.attr.button_text, R.attr.containerType, R.attr.divider_bottom_visible, R.attr.divider_top_visible, R.attr.end_indicator, R.attr.end_indicator_drawable, R.attr.end_indicator_text, R.attr.indicator_text, R.attr.margin_top, R.attr.upper_desc});
            this.f133942h = obtainStyledAttributes.getString(11);
            this.f133943i = obtainStyledAttributes.getString(0);
            this.f133944j = obtainStyledAttributes.getInteger(3, 0);
            this.f133945k = obtainStyledAttributes.getBoolean(5, false);
            this.f133947m = obtainStyledAttributes.getDimensionPixelSize(10, 0);
            this.f133946l = obtainStyledAttributes.getBoolean(4, false);
            obtainStyledAttributes.recycle();
        }
    }

    public BaseItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo185170a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo185171a(View view, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        if (view.getBackground() instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
            int dp2px = UIUtils.dp2px(getContext(), 10.0f);
            if (z) {
                i = dp2px;
            } else {
                i = 0;
            }
            if (z) {
                i2 = dp2px;
            } else {
                i2 = 0;
            }
            if (z2) {
                i3 = dp2px;
            } else {
                i3 = 0;
            }
            if (!z2) {
                dp2px = 0;
            }
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) i3;
            float f4 = (float) dp2px;
            gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
        }
    }
}
