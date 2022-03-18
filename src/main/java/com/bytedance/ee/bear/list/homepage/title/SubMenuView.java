package com.bytedance.ee.bear.list.homepage.title;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.bear.list.homepage.AbstractC8474e;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;

public class SubMenuView extends RelativeLayout implements AbstractC8474e {

    /* renamed from: a */
    public AbstractC8474e.AbstractC8475a f22980a;

    /* renamed from: b */
    public boolean f22981b;

    /* renamed from: c */
    private TextView f22982c;

    /* renamed from: d */
    private AppCompatImageView f22983d;

    /* renamed from: e */
    private AppCompatImageView f22984e;

    /* renamed from: f */
    private FilterState f22985f;

    /* renamed from: g */
    private boolean f22986g;

    public enum FilterState {
        CHECKED,
        DEFAULT
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    /* renamed from: b */
    public void mo33138b() {
        AppCompatImageView appCompatImageView = this.f22983d;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    /* renamed from: a */
    public void mo33135a() {
        AppCompatImageView appCompatImageView = this.f22984e;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    public void setViewDelegate(AbstractC8474e.AbstractC8475a aVar) {
        this.f22980a = aVar;
    }

    public SubMenuView(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    /* renamed from: a */
    public void mo33136a(String str) {
        this.f22982c.setText(str);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    public void setOffline(boolean z) {
        this.f22986g = z;
        setFilterState(this.f22985f);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    /* renamed from: a */
    public void mo33137a(boolean z) {
        int i;
        this.f22981b = z;
        C13747j.m55728a((ImageView) this.f22984e, (int) R.color.icon_n2);
        AppCompatImageView appCompatImageView = this.f22984e;
        Resources resources = getResources();
        if (z) {
            i = R.drawable.ud_icon_disorder_list_outlined;
        } else {
            i = R.drawable.ud_icon_borders_outlined;
        }
        appCompatImageView.setImageDrawable(resources.getDrawable(i));
    }

    /* renamed from: b */
    private void m35235b(Context context) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.f22983d = appCompatImageView;
        appCompatImageView.setId(R.id.iv_filter);
        this.f22983d.setImageResource(R.drawable.ud_icon_filter_outlined);
        C13747j.m55728a((ImageView) this.f22983d, (int) R.color.icon_n2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_22);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.addRule(15);
        layoutParams.addRule(16, R.id.iv_grid);
        layoutParams.rightMargin = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_20);
        addView(this.f22983d, layoutParams);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_2);
        this.f22983d.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        this.f22983d.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.homepage.title.SubMenuView.C85012 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (SubMenuView.this.f22980a != null) {
                    SubMenuView.this.f22980a.mo30969h();
                }
            }
        });
    }

    /* renamed from: c */
    private void m35236c(Context context) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.f22984e = appCompatImageView;
        appCompatImageView.setId(R.id.iv_grid);
        this.f22984e.setImageDrawable(context.getResources().getDrawable(R.drawable.ud_icon_borders_outlined));
        C13747j.m55728a((ImageView) this.f22984e, (int) R.color.icon_n2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_22);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.rightMargin = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_18);
        layoutParams.addRule(21);
        layoutParams.addRule(15);
        addView(this.f22984e, layoutParams);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_2);
        this.f22984e.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        this.f22984e.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.homepage.title.SubMenuView.C85023 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                SubMenuView subMenuView = SubMenuView.this;
                subMenuView.f22981b = !subMenuView.f22981b;
                SubMenuView subMenuView2 = SubMenuView.this;
                subMenuView2.mo33137a(subMenuView2.f22981b);
                if (SubMenuView.this.f22980a != null) {
                    SubMenuView.this.f22980a.mo30965b(SubMenuView.this.f22981b);
                }
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    public void setFilterState(FilterState filterState) {
        int i;
        this.f22985f = filterState;
        this.f22983d.setImageResource(R.drawable.ud_icon_filter_outlined);
        FilterState filterState2 = FilterState.CHECKED;
        int i2 = R.color.icon_disable;
        if (filterState == filterState2) {
            if (!this.f22986g) {
                i2 = R.color.space_list_icon_filter_blue;
            }
            this.f22983d.setBackgroundDrawable(getResources().getDrawable(R.drawable.list_filter_icon_selected_bg));
            if (this.f22986g) {
                i = R.color.space_list_bg_filter_icon_offline;
            } else {
                i = R.color.space_list_bg_filter_icon_selected;
            }
            C13747j.m55726a((View) this.f22983d, i);
        } else {
            this.f22983d.setBackgroundDrawable(null);
            if (!this.f22986g) {
                i2 = R.color.icon_n2;
            }
        }
        C13747j.m55728a((ImageView) this.f22983d, i2);
    }

    /* renamed from: a */
    private void m35233a(Context context) {
        TextView textView = new TextView(context);
        this.f22982c = textView;
        textView.setId(R.id.tv_sort);
        this.f22982c.setMaxLines(1);
        this.f22982c.setMaxEms(16);
        this.f22982c.setEllipsize(TextUtils.TruncateAt.END);
        this.f22982c.setTextColor(context.getResources().getColor(R.color.text_caption));
        this.f22982c.setTextSize(2, 14.0f);
        C13747j.m55726a(this.f22982c, (int) R.color.text_caption);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_16);
        layoutParams.topMargin = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_12);
        layoutParams.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_12);
        layoutParams.addRule(9);
        addView(this.f22982c, layoutParams);
        this.f22982c.setGravity(48);
        this.f22982c.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.homepage.title.SubMenuView.C85001 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (SubMenuView.this.f22980a != null) {
                    SubMenuView.this.f22980a.mo30971j();
                }
            }
        });
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R.drawable.ud_icon_down_outlined);
        C13747j.m55728a((ImageView) appCompatImageView, (int) R.color.icon_n2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_16);
        layoutParams2.height = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_16);
        layoutParams2.topMargin = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_14);
        layoutParams2.leftMargin = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_6);
        layoutParams2.rightMargin = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_16);
        layoutParams2.addRule(1, R.id.tv_sort);
        addView(appCompatImageView, layoutParams2);
    }

    public SubMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m35234a(Context context, AttributeSet attributeSet) {
        m35236c(context);
        m35235b(context);
        m35233a(context);
    }

    public SubMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22985f = FilterState.DEFAULT;
        m35234a(context, attributeSet);
    }
}
