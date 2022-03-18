package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.core.view.AbstractC0915q;
import androidx.core.widget.AbstractC0950m;
import com.larksuite.suite.R;

public class AppCompatImageButton extends ImageButton implements AbstractC0915q, AbstractC0950m {

    /* renamed from: a */
    private final C0443d f1322a;

    /* renamed from: b */
    private final C0448h f1323b;

    @Override // androidx.core.view.AbstractC0915q
    public ColorStateList getSupportBackgroundTintList() {
        C0443d dVar = this.f1322a;
        if (dVar != null) {
            return dVar.mo2570a();
        }
        return null;
    }

    @Override // androidx.core.view.AbstractC0915q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0443d dVar = this.f1322a;
        if (dVar != null) {
            return dVar.mo2576b();
        }
        return null;
    }

    @Override // androidx.core.widget.AbstractC0950m
    public ColorStateList getSupportImageTintList() {
        C0448h hVar = this.f1323b;
        if (hVar != null) {
            return hVar.mo2601b();
        }
        return null;
    }

    @Override // androidx.core.widget.AbstractC0950m
    public PorterDuff.Mode getSupportImageTintMode() {
        C0448h hVar = this.f1323b;
        if (hVar != null) {
            return hVar.mo2602c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0443d dVar = this.f1322a;
        if (dVar != null) {
            dVar.mo2578c();
        }
        C0448h hVar = this.f1323b;
        if (hVar != null) {
            hVar.mo2603d();
        }
    }

    public boolean hasOverlappingRendering() {
        if (!this.f1323b.mo2600a() || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    public void setImageResource(int i) {
        this.f1323b.mo2596a(i);
    }

    @Override // androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0443d dVar = this.f1322a;
        if (dVar != null) {
            dVar.mo2572a(colorStateList);
        }
    }

    @Override // androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0443d dVar = this.f1322a;
        if (dVar != null) {
            dVar.mo2573a(mode);
        }
    }

    @Override // androidx.core.widget.AbstractC0950m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0448h hVar = this.f1323b;
        if (hVar != null) {
            hVar.mo2597a(colorStateList);
        }
    }

    @Override // androidx.core.widget.AbstractC0950m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0448h hVar = this.f1323b;
        if (hVar != null) {
            hVar.mo2598a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0443d dVar = this.f1322a;
        if (dVar != null) {
            dVar.mo2574a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0443d dVar = this.f1322a;
        if (dVar != null) {
            dVar.mo2571a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0448h hVar = this.f1323b;
        if (hVar != null) {
            hVar.mo2603d();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0448h hVar = this.f1323b;
        if (hVar != null) {
            hVar.mo2603d();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0448h hVar = this.f1323b;
        if (hVar != null) {
            hVar.mo2603d();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(C0424ac.m1773a(context), attributeSet, i);
        C0422aa.m1768a(this, getContext());
        C0443d dVar = new C0443d(this);
        this.f1322a = dVar;
        dVar.mo2575a(attributeSet, i);
        C0448h hVar = new C0448h(this);
        this.f1323b = hVar;
        hVar.mo2599a(attributeSet, i);
    }
}
