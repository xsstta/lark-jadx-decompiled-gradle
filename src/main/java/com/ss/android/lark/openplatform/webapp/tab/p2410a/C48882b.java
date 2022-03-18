package com.ss.android.lark.openplatform.webapp.tab.p2410a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.larksuite.suite.R;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.openplatform.webapp.tab.C48898e;
import com.ss.android.lark.openplatform.webapp.tab.plugin.SetMainNavRightItemsPlugin;

/* renamed from: com.ss.android.lark.openplatform.webapp.tab.a.b */
public class C48882b implements AbstractC44545b, C48898e.AbstractC48899a {

    /* renamed from: a */
    private Context f122803a;

    /* renamed from: b */
    private ImageView f122804b;

    /* renamed from: c */
    private SetMainNavRightItemsPlugin.Item f122805c;

    @Override // com.ss.android.lark.openplatform.webapp.tab.C48898e.AbstractC48899a
    /* renamed from: a */
    public void mo170712a() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44545b
    public View getContentView() {
        m192574b(this.f122805c);
        return this.f122804b;
    }

    /* renamed from: c */
    private void m192575c() {
        this.f122804b.setImageResource(R.drawable.webapp_icon_more_popupwindow);
        this.f122804b.setVisibility(8);
    }

    /* renamed from: b */
    private void m192573b() {
        if (this.f122804b == null) {
            ImageView imageView = new ImageView(this.f122803a);
            this.f122804b = imageView;
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.openplatform.webapp.tab.p2410a.$$Lambda$b$uzj_MGwG_oJHdimpk4A5qMjkOWc */

                public final void onClick(View view) {
                    C48882b.lambda$uzj_MGwG_oJHdimpk4A5qMjkOWc(C48882b.this, view);
                }
            });
            this.f122804b.setClickable(true);
        }
    }

    public C48882b(Context context) {
        this.f122803a = context;
    }

    /* renamed from: a */
    public void mo170713a(SetMainNavRightItemsPlugin.Item item) {
        this.f122805c = item;
        m192574b(item);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m192571a(View view) {
        SetMainNavRightItemsPlugin.Item item = this.f122805c;
        if (item != null) {
            item.onClick.run();
        }
    }

    /* renamed from: b */
    private void m192574b(SetMainNavRightItemsPlugin.Item item) {
        m192573b();
        if (item == null) {
            m192575c();
        } else {
            m192576c(item);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m192572a(String str) {
        if (this.f122804b.getVisibility() != 0) {
            this.f122804b.setVisibility(0);
        }
        ComponentCallbacks2C2115c.m9141a(this.f122804b).mo10415a(str).mo10399a(this.f122804b);
    }

    /* renamed from: c */
    private void m192576c(SetMainNavRightItemsPlugin.Item item) {
        if (item != null) {
            this.f122804b.post(new Runnable(item.iconURL) {
                /* class com.ss.android.lark.openplatform.webapp.tab.p2410a.$$Lambda$b$_Gxc6Hjcc6G_VNlpJanBlN6UOAM */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C48882b.lambda$_Gxc6Hjcc6G_VNlpJanBlN6UOAM(C48882b.this, this.f$1);
                }
            });
        }
    }
}
