package com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.b.e */
public class C13232e extends DynamicDrawableSpan {

    /* renamed from: a */
    private final Context f35057a;

    /* renamed from: b */
    private final int f35058b;

    /* renamed from: c */
    private final int f35059c;

    /* renamed from: d */
    private final int f35060d;

    /* renamed from: e */
    private int f35061e;

    /* renamed from: f */
    private int f35062f;

    /* renamed from: g */
    private int f35063g;

    /* renamed from: h */
    private Drawable f35064h;

    /* renamed from: i */
    private WeakReference<Drawable> f35065i;

    /* renamed from: j */
    private String f35066j;

    /* renamed from: a */
    private Drawable m53940a() {
        WeakReference<Drawable> weakReference = this.f35065i;
        if (weakReference == null || weakReference.get() == null) {
            this.f35065i = new WeakReference<>(getDrawable());
        }
        return this.f35065i.get();
    }

    public Drawable getDrawable() {
        if (this.f35064h == null) {
            try {
                Drawable a = LarkHostDependManager.f34682b.mo49086a().mo48916a(this.f35057a, this.f35058b);
                this.f35064h = a;
                int i = this.f35059c;
                this.f35061e = i;
                int intrinsicWidth = (i * a.getIntrinsicWidth()) / this.f35064h.getIntrinsicHeight();
                this.f35062f = intrinsicWidth;
                int i2 = this.f35060d;
                int i3 = this.f35061e;
                int i4 = (i2 - i3) / 2;
                this.f35063g = i4;
                this.f35064h.setBounds(0, i4, intrinsicWidth, i3 + i4);
            } catch (Exception e) {
                AppBrandLogger.m52829e("EmojiconSpan", e.getMessage());
            }
        }
        return this.f35064h;
    }

    public C13232e(Context context, int i, String str, int i2, int i3, int i4) {
        super(i3);
        this.f35057a = context;
        this.f35058b = i;
        this.f35059c = i2;
        this.f35061e = i2;
        this.f35062f = i2;
        this.f35060d = i4;
        this.f35066j = str;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable a = m53940a();
        canvas.save();
        int i6 = i5 - a.getBounds().bottom;
        if (this.mVerticalAlignment == 1) {
            i6 = ((i3 + ((i5 - i3) / 2)) - ((a.getBounds().bottom - a.getBounds().top) / 2)) - this.f35063g;
        }
        canvas.translate(f, (float) i6);
        a.draw(canvas);
        canvas.restore();
    }
}
