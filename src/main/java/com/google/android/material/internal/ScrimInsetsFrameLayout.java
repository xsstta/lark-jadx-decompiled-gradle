package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0912n;
import androidx.core.view.C0883ab;
import androidx.core.view.ViewCompat;
import com.larksuite.suite.R;

public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: a */
    Drawable f54657a;

    /* renamed from: b */
    Rect f54658b;

    /* renamed from: c */
    private Rect f54659c;

    /* renamed from: d */
    private boolean f54660d;

    /* renamed from: e */
    private boolean f54661e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo77760a(C0883ab abVar) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f54657a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f54657a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f54661e = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f54660d = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f54657a = drawable;
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f54658b != null && this.f54657a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f54660d) {
                this.f54659c.set(0, 0, width, this.f54658b.top);
                this.f54657a.setBounds(this.f54659c);
                this.f54657a.draw(canvas);
            }
            if (this.f54661e) {
                this.f54659c.set(0, height - this.f54658b.bottom, width, height);
                this.f54657a.setBounds(this.f54659c);
                this.f54657a.draw(canvas);
            }
            this.f54659c.set(0, this.f54658b.top, this.f54658b.left, height - this.f54658b.bottom);
            this.f54657a.setBounds(this.f54659c);
            this.f54657a.draw(canvas);
            this.f54659c.set(width - this.f54658b.right, this.f54658b.top, width, height - this.f54658b.bottom);
            this.f54657a.setBounds(this.f54659c);
            this.f54657a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54659c = new Rect();
        this.f54660d = true;
        this.f54661e = true;
        TypedArray a = C22358l.m80999a(context, attributeSet, new int[]{R.attr.insetForeground}, i, 2131887307, new int[0]);
        this.f54657a = a.getDrawable(0);
        a.recycle();
        setWillNotDraw(true);
        ViewCompat.m4044a(this, new AbstractC0912n() {
            /* class com.google.android.material.internal.ScrimInsetsFrameLayout.C223261 */

            @Override // androidx.core.view.AbstractC0912n
            public C0883ab onApplyWindowInsets(View view, C0883ab abVar) {
                boolean z;
                if (ScrimInsetsFrameLayout.this.f54658b == null) {
                    ScrimInsetsFrameLayout.this.f54658b = new Rect();
                }
                ScrimInsetsFrameLayout.this.f54658b.set(abVar.mo4642a(), abVar.mo4644b(), abVar.mo4646c(), abVar.mo4647d());
                ScrimInsetsFrameLayout.this.mo77760a(abVar);
                ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
                if (!abVar.mo4648e() || ScrimInsetsFrameLayout.this.f54657a == null) {
                    z = true;
                } else {
                    z = false;
                }
                scrimInsetsFrameLayout.setWillNotDraw(z);
                ViewCompat.m4073e(ScrimInsetsFrameLayout.this);
                return abVar.mo4651g();
            }
        });
    }
}
