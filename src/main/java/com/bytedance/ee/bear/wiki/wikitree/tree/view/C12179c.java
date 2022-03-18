package com.bytedance.ee.bear.wiki.wikitree.tree.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.view.c */
public class C12179c extends C12183e {

    /* renamed from: a */
    public AbstractC12181a f32782a;

    /* renamed from: b */
    public boolean f32783b;

    /* renamed from: s */
    private Runnable f32784s;

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.view.c$a */
    public interface AbstractC12181a {
        void onExpandClick(boolean z);
    }

    /* renamed from: d */
    private void m50720d() {
        Runnable runnable = this.f32784s;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m50720d();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e
    /* renamed from: c */
    public void mo46605c() {
        super.mo46605c();
        setExpand(false);
        setLoading(false);
        setExpandClickListener(null);
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m50721e() {
        this.f32788e.setClickable(false);
        this.f32790g.setVisibility(8);
        this.f32789f.setVisibility(0);
    }

    public C12179c(Context context) {
        super(context);
    }

    public void setExpandClickListener(AbstractC12181a aVar) {
        this.f32782a = aVar;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e
    /* renamed from: a */
    public void mo46604a(Context context) {
        super.mo46604a(context);
        this.f32790g.setImageDrawable(null);
        setExpand(false);
        this.f32788e.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.C12179c.View$OnClickListenerC121801 */

            public void onClick(View view) {
                if (C12179c.this.f32782a != null) {
                    C12179c.this.f32782a.onExpandClick(!C12179c.this.f32783b);
                }
            }
        });
    }

    public void setExpand(boolean z) {
        int i;
        int i2;
        this.f32783b = z;
        if (z) {
            i = R.drawable.ud_icon_expand_down_filled;
        } else {
            i = R.drawable.ud_icon_global_trianglesmall_outlined;
        }
        this.f32790g.setImageResource(i);
        ImageView imageView = this.f32790g;
        if (this.f32800q) {
            i2 = R.color.ud_C500;
        } else {
            i2 = R.color.icon_n2;
        }
        C13747j.m55728a(imageView, i2);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e
    public void setFocus(boolean z) {
        int i;
        int i2;
        super.setFocus(z);
        if (this.f32783b) {
            i = R.drawable.ud_icon_expand_down_filled;
        } else {
            i = R.drawable.ud_icon_global_trianglesmall_outlined;
        }
        this.f32790g.setImageResource(i);
        ImageView imageView = this.f32790g;
        if (z) {
            i2 = R.color.ud_C500;
        } else {
            i2 = R.color.icon_n2;
        }
        C13747j.m55728a(imageView, i2);
    }

    public void setLoading(boolean z) {
        m50720d();
        if (z) {
            if (this.f32784s == null) {
                this.f32784s = new Runnable() {
                    /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$c$kAPrHWDe4inhGjE4wScD6WNlCmk */

                    public final void run() {
                        C12179c.lambda$kAPrHWDe4inhGjE4wScD6WNlCmk(C12179c.this);
                    }
                };
            }
            postDelayed(this.f32784s, 300);
            return;
        }
        this.f32788e.setClickable(true);
        this.f32790g.setVisibility(0);
        this.f32789f.setVisibility(8);
    }
}
