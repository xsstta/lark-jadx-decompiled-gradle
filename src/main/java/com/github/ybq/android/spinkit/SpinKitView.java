package com.github.ybq.android.spinkit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.larksuite.suite.R;

public class SpinKitView extends ProgressBar {

    /* renamed from: a */
    private Style f51833a;

    /* renamed from: b */
    private int f51834b;

    /* renamed from: c */
    private AbstractC21312f f51835c;

    public AbstractC21312f getIndeterminateDrawable() {
        return this.f51835c;
    }

    /* renamed from: a */
    private void m77130a() {
        AbstractC21312f a = C21292a.m77131a(this.f51833a);
        a.mo72410a(this.f51834b);
        setIndeterminateDrawable(a);
    }

    public SpinKitView(Context context) {
        this(context, null);
    }

    public void onScreenStateChanged(int i) {
        AbstractC21312f fVar;
        super.onScreenStateChanged(i);
        if (i == 0 && (fVar = this.f51835c) != null) {
            fVar.stop();
        }
    }

    public void setColor(int i) {
        this.f51834b = i;
        AbstractC21312f fVar = this.f51835c;
        if (fVar != null) {
            fVar.mo72410a(i);
        }
        invalidate();
    }

    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable instanceof AbstractC21312f) {
            ((AbstractC21312f) drawable).stop();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f51835c != null && getVisibility() == 0) {
            this.f51835c.start();
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof AbstractC21312f) {
            setIndeterminateDrawable((AbstractC21312f) drawable);
            return;
        }
        throw new IllegalArgumentException("this d must be instanceof Sprite");
    }

    public void setIndeterminateDrawable(AbstractC21312f fVar) {
        super.setIndeterminateDrawable((Drawable) fVar);
        this.f51835c = fVar;
        if (fVar.mo72412b() == 0) {
            this.f51835c.mo72410a(this.f51834b);
        }
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        if (getVisibility() == 0) {
            this.f51835c.start();
        }
    }

    public SpinKitView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.SpinKitViewStyle);
    }

    public SpinKitView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.SpinKitView);
    }

    public SpinKitView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.SpinKit_Color, R.attr.SpinKit_Style}, i, i2);
        this.f51833a = Style.values()[obtainStyledAttributes.getInt(1, 0)];
        this.f51834b = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        m77130a();
        setIndeterminate(true);
    }
}
