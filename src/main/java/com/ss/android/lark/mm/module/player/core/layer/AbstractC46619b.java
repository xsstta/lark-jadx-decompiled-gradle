package com.ss.android.lark.mm.module.player.core.layer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.lark.mm.module.highlight.timeline.HightlightTimeLine;
import com.ss.android.lark.mm.module.player.core.layer.p2312c.AbstractC46626a;
import com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.b */
public abstract class AbstractC46619b extends AbstractC64153a {

    /* renamed from: a */
    protected AbstractC46626a f117320a;

    /* renamed from: b */
    protected ViewGroup f117321b;

    /* renamed from: a */
    public void mo163780a(HightlightTimeLine hightlightTimeLine) {
    }

    /* renamed from: a */
    public void mo163781a(boolean z) {
    }

    /* renamed from: b */
    public void mo163784b(boolean z) {
    }

    public View bh_() {
        return this.f117321b;
    }

    public AbstractC46619b(AbstractC46626a aVar) {
        this.f117320a = aVar;
    }

    /* renamed from: a */
    public View mo163802a(Context context, View view) {
        mo163803a(context, view, new FrameLayout.LayoutParams(-1, -1));
        return this.f117321b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo163803a(Context context, View view, FrameLayout.LayoutParams layoutParams) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.f117321b = frameLayout;
        frameLayout.addView(view, layoutParams);
        return this.f117321b;
    }
}
