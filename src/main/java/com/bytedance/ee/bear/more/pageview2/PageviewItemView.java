package com.bytedance.ee.bear.more.pageview2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class PageviewItemView extends FrameLayout {

    /* renamed from: a */
    public TextView f27625a;

    /* renamed from: b */
    public TextView f27626b;

    /* renamed from: c */
    private final String f27627c = "PageviewItemView";

    /* renamed from: d */
    private View f27628d;

    /* renamed from: e */
    private TextView f27629e;

    /* renamed from: f */
    private TextView f27630f;

    /* renamed from: g */
    private ImageView f27631g;

    /* renamed from: a */
    private void m42724a() {
        C13479a.m54772d("PageviewItemView", "initViews: ");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.pageview_item_ret, (ViewGroup) this, true);
        this.f27628d = inflate;
        this.f27629e = (TextView) inflate.findViewById(R.id.title);
        this.f27630f = (TextView) this.f27628d.findViewById(R.id.value);
        this.f27625a = (TextView) this.f27628d.findViewById(R.id.today_value);
        this.f27626b = (TextView) this.f27628d.findViewById(R.id.today_value2);
        this.f27631g = (ImageView) this.f27628d.findViewById(R.id.image_up);
        this.f27625a.setText("N/A");
        this.f27631g.setVisibility(4);
        this.f27625a.setVisibility(4);
        this.f27626b.setVisibility(8);
    }

    public void setTitle(String str) {
        this.f27629e.setText(str);
    }

    public void setValue(String str) {
        this.f27630f.setText(str);
    }

    public PageviewItemView(Context context) {
        super(context);
        m42724a();
    }

    public void setTodayValue(final String str) {
        if (!str.equals("0")) {
            this.f27625a.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.bytedance.ee.bear.more.pageview2.PageviewItemView.ViewTreeObserver$OnPreDrawListenerC102391 */

                public boolean onPreDraw() {
                    PageviewItemView.this.f27625a.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (PageviewItemView.this.f27625a.getLineCount() > 1) {
                        PageviewItemView.this.f27625a.setText(C10539a.m43639a(PageviewItemView.this.getContext(), R.string.CreationMobile_Stats_Basic_DailyNew, "new_daily", ""));
                        PageviewItemView.this.f27626b.setText(str);
                        PageviewItemView.this.f27626b.setVisibility(0);
                    }
                    return false;
                }
            });
            this.f27631g.setVisibility(0);
            this.f27625a.setVisibility(0);
            this.f27626b.setVisibility(8);
            this.f27625a.setText(C10539a.m43639a(getContext(), R.string.CreationMobile_Stats_Basic_DailyNew, "new_daily", str));
            return;
        }
        this.f27631g.setVisibility(4);
        this.f27625a.setVisibility(4);
        this.f27626b.setVisibility(8);
    }

    public PageviewItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m42724a();
    }

    public PageviewItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m42724a();
    }
}
