package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import java.io.IOException;
import pl.droidsonroids.gif.C70155e;

public class GifTextView extends TextView {

    /* renamed from: a */
    private C70155e.C70157b f175230a;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setCompoundDrawablesVisible(true);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setCompoundDrawablesVisible(false);
    }

    public Parcelable onSaveInstanceState() {
        Drawable[] drawableArr = new Drawable[7];
        if (this.f175230a.f175274c) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            System.arraycopy(compoundDrawables, 0, drawableArr, 0, compoundDrawables.length);
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            drawableArr[4] = compoundDrawablesRelative[0];
            drawableArr[5] = compoundDrawablesRelative[2];
            drawableArr[6] = getBackground();
        }
        return new GifViewSavedState(super.onSaveInstanceState(), drawableArr);
    }

    /* renamed from: a */
    private void m268910a() {
        if (this.f175230a.f175275d >= 0) {
            for (Drawable drawable : getCompoundDrawables()) {
                C70155e.m268948a(this.f175230a.f175275d, drawable);
            }
            for (Drawable drawable2 : getCompoundDrawablesRelative()) {
                C70155e.m268948a(this.f175230a.f175275d, drawable2);
            }
            C70155e.m268948a(this.f175230a.f175275d, getBackground());
        }
    }

    public GifTextView(Context context) {
        super(context);
    }

    public void setBackgroundResource(int i) {
        setBackground(m268909a(i));
    }

    public void setFreezesAnimation(boolean z) {
        this.f175230a.f175274c = z;
    }

    private void setCompoundDrawablesVisible(boolean z) {
        m268912a(getCompoundDrawables(), z);
        m268912a(getCompoundDrawablesRelative(), z);
    }

    /* renamed from: a */
    private Drawable m268909a(int i) {
        if (i == 0) {
            return null;
        }
        Resources resources = getResources();
        String resourceTypeName = resources.getResourceTypeName(i);
        if (!isInEditMode() && C70155e.f175271a.contains(resourceTypeName)) {
            try {
                return new C70149c(resources, i);
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, getContext().getTheme());
        }
        return resources.getDrawable(i);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GifViewSavedState gifViewSavedState = (GifViewSavedState) parcelable;
        super.onRestoreInstanceState(gifViewSavedState.getSuperState());
        Drawable[] compoundDrawables = getCompoundDrawables();
        gifViewSavedState.mo247257a(compoundDrawables[0], 0);
        gifViewSavedState.mo247257a(compoundDrawables[1], 1);
        gifViewSavedState.mo247257a(compoundDrawables[2], 2);
        gifViewSavedState.mo247257a(compoundDrawables[3], 3);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        gifViewSavedState.mo247257a(compoundDrawablesRelative[0], 4);
        gifViewSavedState.mo247257a(compoundDrawablesRelative[2], 5);
        gifViewSavedState.mo247257a(getBackground(), 6);
    }

    public GifTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m268911a(attributeSet, 0, 0);
    }

    /* renamed from: a */
    private static void m268912a(Drawable[] drawableArr, boolean z) {
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.setVisible(z, false);
            }
        }
    }

    public GifTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m268911a(attributeSet, i, 0);
    }

    /* renamed from: a */
    private void m268911a(AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            Drawable a = m268909a(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableLeft", 0));
            Drawable a2 = m268909a(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableTop", 0));
            Drawable a3 = m268909a(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableRight", 0));
            Drawable a4 = m268909a(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableBottom", 0));
            Drawable a5 = m268909a(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableStart", 0));
            Drawable a6 = m268909a(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableEnd", 0));
            if (getLayoutDirection() == 0) {
                if (a5 != null) {
                    a = a5;
                }
                if (a6 == null) {
                    a6 = a3;
                }
            } else {
                if (a5 != null) {
                    a3 = a5;
                }
                if (a6 == null) {
                    a6 = a;
                }
                a = a3;
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(a, a2, a6, a4);
            setBackground(m268909a(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "background", 0)));
            this.f175230a = new C70155e.C70157b(this, attributeSet, i, i2);
            m268910a();
        }
        this.f175230a = new C70155e.C70157b();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(m268909a(i), m268909a(i2), m268909a(i3), m268909a(i4));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesWithIntrinsicBounds(m268909a(i), m268909a(i2), m268909a(i3), m268909a(i4));
    }
}
