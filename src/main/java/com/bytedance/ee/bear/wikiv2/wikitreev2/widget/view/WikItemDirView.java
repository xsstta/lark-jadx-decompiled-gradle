package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;

public class WikItemDirView extends WikItemLeafView {

    /* renamed from: a */
    public AbstractC12512a f33537a;

    /* renamed from: b */
    public boolean f33538b;

    /* renamed from: s */
    private Runnable f33539s;

    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemDirView$a */
    public interface AbstractC12512a {
        /* renamed from: a */
        void mo47664a(boolean z);
    }

    /* renamed from: d */
    public boolean mo47656d() {
        return this.f33538b;
    }

    /* renamed from: g */
    private void m52033g() {
        Runnable runnable = this.f33539s;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m52033g();
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView
    /* renamed from: e */
    public void mo47657e() {
        super.mo47657e();
        setExpand(false);
        setLoading(false);
        setExpandClickListener(null);
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView
    /* renamed from: f */
    public void mo47658f() {
        super.mo47658f();
        setLoading(false);
        setExpandClickListener(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m52034h() {
        this.f33543e.setClickable(false);
        this.f33545g.setVisibility(8);
        this.f33544f.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView
    /* renamed from: c */
    public void mo47655c() {
        super.mo47655c();
        this.f33545g.setImageDrawable(null);
        setExpand(false);
        this.f33543e.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemDirView.C125111 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (WikItemDirView.this.f33537a != null) {
                    WikItemDirView.this.f33537a.mo47664a(!WikItemDirView.this.f33538b);
                }
            }
        });
    }

    public WikItemDirView(Context context) {
        super(context);
    }

    public void setExpandClickListener(AbstractC12512a aVar) {
        this.f33537a = aVar;
    }

    public void setExpand(boolean z) {
        int i;
        int i2;
        this.f33538b = z;
        if (z) {
            i = R.drawable.ud_icon_expand_down_filled;
        } else {
            i = R.drawable.ud_icon_global_trianglesmall_outlined;
        }
        this.f33545g.setImageResource(i);
        ImageView imageView = this.f33545g;
        if (this.f33555q) {
            i2 = R.color.ud_C500;
        } else {
            i2 = R.color.icon_n2;
        }
        C13747j.m55728a(imageView, i2);
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView
    public void setFocus(boolean z) {
        int i;
        int i2;
        super.setFocus(z);
        if (this.f33538b) {
            i = R.drawable.ud_icon_expand_down_filled;
        } else {
            i = R.drawable.ud_icon_global_trianglesmall_outlined;
        }
        this.f33545g.setImageResource(i);
        ImageView imageView = this.f33545g;
        if (z) {
            i2 = R.color.ud_C500;
        } else {
            i2 = R.color.icon_n2;
        }
        C13747j.m55728a(imageView, i2);
    }

    public void setLoading(boolean z) {
        m52033g();
        if (z) {
            if (this.f33539s == null) {
                this.f33539s = new Runnable() {
                    /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.$$Lambda$WikItemDirView$JGwolwWs9ahyjVyJHg8vjBGmZI */

                    public final void run() {
                        WikItemDirView.m270126lambda$JGwolwWs9ahyjVyJHg8vjBGmZI(WikItemDirView.this);
                    }
                };
            }
            postDelayed(this.f33539s, 300);
            return;
        }
        this.f33543e.setClickable(true);
        this.f33545g.setVisibility(0);
        this.f33544f.setVisibility(8);
    }

    public WikItemDirView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
