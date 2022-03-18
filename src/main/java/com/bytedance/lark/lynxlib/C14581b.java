package com.bytedance.lark.lynxlib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.lynx.tasm.behavior.ui.background.AbstractC26753c;
import com.lynx.tasm.utils.C26959m;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.lark.lynxlib.b */
public class C14581b extends AbstractC26753c implements Drawable.Callback {

    /* renamed from: a */
    private Drawable f38619a;

    /* renamed from: b */
    private boolean f38620b;

    @Override // com.lynx.tasm.behavior.ui.background.AbstractC26753c
    /* renamed from: e */
    public void mo53850e() {
        this.f38620b = false;
    }

    @Override // com.lynx.tasm.behavior.ui.background.AbstractC26753c
    /* renamed from: d */
    public void mo53848d() {
        m59046f();
    }

    /* renamed from: f */
    private void m59046f() {
        if (!this.f38620b) {
            this.f38620b = true;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.background.AbstractC26753c
    /* renamed from: a */
    public boolean mo53845a() {
        if (this.f38619a != null) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.background.AbstractC26753c
    /* renamed from: b */
    public int mo53846b() {
        Drawable drawable = this.f38619a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // com.lynx.tasm.behavior.ui.background.AbstractC26753c
    /* renamed from: c */
    public int mo53847c() {
        Drawable drawable = this.f38619a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getIntrinsicHeight();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f38619a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.f38619a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* renamed from: a */
    public void mo53844a(Drawable drawable) {
        int i;
        this.f38619a = drawable;
        drawable.setBounds(getBounds());
        this.f38619a.setCallback(this);
        invalidateSelf();
        int i2 = 0;
        if (drawable != null) {
            i2 = drawable.getIntrinsicWidth();
            i = drawable.getIntrinsicHeight();
        } else {
            i = 0;
        }
        Log.m165389i("CardBackgroundLayerDrawable", "drawable ready:size:w=" + i2 + ",h=" + i);
    }

    @Override // com.lynx.tasm.behavior.ui.background.AbstractC26753c
    /* renamed from: a */
    public void mo53843a(int i, int i2) {
        m59046f();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C26959m.m97970a(runnable, drawable);
    }

    public C14581b(Context context, String str) {
        m59045a(context, str);
    }

    /* renamed from: a */
    private void m59045a(Context context, final String str) {
        ImageLoader.with(context).asDrawable().load(str).into(new C38818i<Drawable>() {
            /* class com.bytedance.lark.lynxlib.C14581b.C145821 */

            @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
            /* renamed from: a */
            public void mo49247a(Drawable drawable) {
                Log.m165383e("CardBackgroundLayerDrawable", "load failed:error" + str);
            }

            /* renamed from: b_ */
            public void mo49248a(Drawable drawable) {
                Log.m165389i("CardBackgroundLayerDrawable", "load success:resource-ready" + str);
                C14581b.this.mo53844a(drawable);
            }
        });
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C26959m.m97971a(runnable, drawable, j);
    }
}
