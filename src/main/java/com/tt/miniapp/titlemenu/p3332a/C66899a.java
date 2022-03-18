package com.tt.miniapp.titlemenu.p3332a;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.titlemenu.AppBrandDotView;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.titlemenu.a.a */
public class C66899a extends RelativeLayout {

    /* renamed from: a */
    boolean f168742a = true;

    /* renamed from: b */
    private int f168743b;

    /* renamed from: c */
    private int f168744c;

    /* renamed from: d */
    private AppBrandDotView f168745d;

    /* renamed from: e */
    private ImageView f168746e;

    /* renamed from: f */
    private ImageView f168747f;

    /* renamed from: g */
    private int f168748g;

    /* renamed from: h */
    private int f168749h;

    /* renamed from: i */
    private TextView f168750i;

    /* renamed from: j */
    private int f168751j;

    /* renamed from: k */
    private int f168752k;

    /* renamed from: l */
    private IAppContext f168753l;

    /* renamed from: m */
    private Context f168754m;

    public int getItemHeight() {
        return this.f168752k;
    }

    public int getItemWidth() {
        return this.f168751j;
    }

    public boolean performClick() {
        if (this.f168742a) {
            m260909a();
        }
        return super.performClick();
    }

    /* renamed from: a */
    private void m260909a() {
        C66020b.m258530a("mp_host_custom_click", this.f168753l).mo231090a("params_title", this.f168750i.getText()).mo231092a();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void setReportHostCustomClickEvent(boolean z) {
        this.f168742a = z;
    }

    public void setLabel(String str) {
        this.f168750i.setText(str);
    }

    public void setBadgeEnable(boolean z) {
        if (z) {
            this.f168747f.setVisibility(0);
        } else {
            this.f168747f.setVisibility(8);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f168746e.setImageDrawable(drawable);
        this.f168746e.setImageTintList(ContextCompat.getColorStateList(this.f168754m, R.color.icon_n1));
        this.f168746e.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
    }

    public void setLabelWidth(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f168750i.getLayoutParams();
        layoutParams.width = i;
        this.f168750i.setLayoutParams(layoutParams);
        int i2 = this.f168743b;
        if (i2 >= i) {
            i = i2;
        }
        this.f168751j = i;
    }

    public void setBadgeCount(String str) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f168745d.getLayoutParams();
        if (str.length() > 1) {
            layoutParams.leftMargin = (int) C67590h.m263065a(getContext(), 37.0f);
        } else {
            layoutParams.leftMargin = (int) C67590h.m263065a(getContext(), 40.0f);
        }
        this.f168745d.setLayoutParams(layoutParams);
        this.f168745d.setBadge(str);
    }

    /* renamed from: a */
    public void mo232913a(int i) {
        int round = Math.round(this.f168750i.getPaint().measureText(this.f168750i.getText().toString()));
        float dimension = this.f168753l.getCurrentActivity().getResources().getDimension(R.dimen.microapp_m_text_size_12);
        float dimension2 = this.f168753l.getCurrentActivity().getResources().getDimension(R.dimen.microapp_m_text_size_10);
        Layout layout = this.f168750i.getLayout();
        if (layout != null) {
            boolean z = true;
            if (layout.getEllipsisCount(layout.getLineCount() - 1) <= 0) {
                z = false;
            }
            if (z) {
                this.f168750i.setTextSize(0, dimension2);
            } else {
                this.f168750i.setTextSize(0, dimension);
            }
        } else if (round >= i) {
            this.f168750i.setTextSize(0, dimension2);
        } else {
            this.f168750i.setTextSize(0, dimension);
        }
    }

    public C66899a(Context context, IAppContext iAppContext) {
        super(context);
        this.f168753l = iAppContext;
        this.f168754m = context;
        this.f168743b = (int) C67590h.m263065a(context, 52.0f);
        this.f168744c = (int) C67590h.m263065a(context, 52.0f);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout.setId(View.generateViewId());
        addView(relativeLayout, layoutParams);
        this.f168746e = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f168743b, this.f168744c);
        this.f168746e.setLayoutParams(layoutParams2);
        this.f168746e.setImageDrawable(new ColorDrawable(ContextCompat.getColor(context, R.color.bg_filler)));
        int a = (int) C67590h.m263065a(context, 13.0f);
        this.f168746e.setPadding(a, a, a, a);
        this.f168746e.setId(View.generateViewId());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ContextCompat.getColor(context, R.color.bg_float));
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C67590h.m263065a(context, 12.0f));
        this.f168746e.setBackground(gradientDrawable);
        this.f168748g = (int) C67590h.m263065a(context, 62.0f);
        this.f168749h = (int) C67590h.m263065a(context, 32.0f);
        TextView textView = new TextView(context);
        this.f168750i = textView;
        textView.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f168748g, -2);
        this.f168750i.setLayoutParams(layoutParams3);
        this.f168750i.setTextColor(ContextCompat.getColor(context, R.color.text_caption));
        this.f168750i.setGravity(17);
        this.f168750i.setTextSize(0, iAppContext.getCurrentActivity().getResources().getDimension(R.dimen.microapp_m_text_size_12));
        this.f168750i.setMaxLines(2);
        this.f168750i.setEllipsize(TextUtils.TruncateAt.END);
        this.f168750i.setLineSpacing(C67590h.m263065a(context, 2.0f), 1.0f);
        this.f168750i.setIncludeFontPadding(false);
        layoutParams.addRule(14);
        layoutParams2.addRule(14);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, relativeLayout.getId());
        layoutParams3.topMargin = (int) C67590h.m263065a(context, 6.0f);
        relativeLayout.addView(this.f168746e);
        addView(this.f168750i);
        AppBrandDotView appBrandDotView = new AppBrandDotView(context);
        this.f168745d = appBrandDotView;
        appBrandDotView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(7, this.f168746e.getId());
        layoutParams4.addRule(6, this.f168746e.getId());
        relativeLayout.addView(this.f168745d, layoutParams4);
        ImageView imageView = new ImageView(context);
        this.f168747f = imageView;
        imageView.setImageResource(R.drawable.microapp_dialog_icon_reddot);
        this.f168747f.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) C67590h.m263065a(getContext(), 8.0f), (int) C67590h.m263065a(getContext(), 8.0f));
        layoutParams5.addRule(7, this.f168746e.getId());
        layoutParams5.addRule(6, this.f168746e.getId());
        relativeLayout.addView(this.f168747f, layoutParams5);
        int i = this.f168743b;
        int i2 = this.f168748g;
        this.f168751j = i < i2 ? i2 : i;
        this.f168752k = this.f168744c + this.f168749h + layoutParams3.topMargin;
        setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
    }
}
