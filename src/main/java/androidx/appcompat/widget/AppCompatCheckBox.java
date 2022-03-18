package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.view.AbstractC0915q;
import androidx.core.widget.AbstractC0948k;
import com.larksuite.suite.R;

public class AppCompatCheckBox extends CheckBox implements AbstractC0915q, AbstractC0948k {

    /* renamed from: a */
    private final C0444e f1314a;

    /* renamed from: b */
    private final C0443d f1315b;

    /* renamed from: c */
    private final C0452l f1316c;

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0444e eVar = this.f1314a;
        if (eVar != null) {
            return eVar.mo2579a(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    @Override // androidx.core.view.AbstractC0915q
    public ColorStateList getSupportBackgroundTintList() {
        C0443d dVar = this.f1315b;
        if (dVar != null) {
            return dVar.mo2570a();
        }
        return null;
    }

    @Override // androidx.core.view.AbstractC0915q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0443d dVar = this.f1315b;
        if (dVar != null) {
            return dVar.mo2576b();
        }
        return null;
    }

    @Override // androidx.core.widget.AbstractC0948k
    public ColorStateList getSupportButtonTintList() {
        C0444e eVar = this.f1314a;
        if (eVar != null) {
            return eVar.mo2580a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0444e eVar = this.f1314a;
        if (eVar != null) {
            return eVar.mo2584b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0443d dVar = this.f1315b;
        if (dVar != null) {
            dVar.mo2578c();
        }
        C0452l lVar = this.f1316c;
        if (lVar != null) {
            lVar.mo2624b();
        }
    }

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    @Override // androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0443d dVar = this.f1315b;
        if (dVar != null) {
            dVar.mo2572a(colorStateList);
        }
    }

    @Override // androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0443d dVar = this.f1315b;
        if (dVar != null) {
            dVar.mo2573a(mode);
        }
    }

    @Override // androidx.core.widget.AbstractC0948k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0444e eVar = this.f1314a;
        if (eVar != null) {
            eVar.mo2581a(colorStateList);
        }
    }

    @Override // androidx.core.widget.AbstractC0948k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0444e eVar = this.f1314a;
        if (eVar != null) {
            eVar.mo2582a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0443d dVar = this.f1315b;
        if (dVar != null) {
            dVar.mo2574a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0443d dVar = this.f1315b;
        if (dVar != null) {
            dVar.mo2571a(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0215a.m655b(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0444e eVar = this.f1314a;
        if (eVar != null) {
            eVar.mo2585c();
        }
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(C0424ac.m1773a(context), attributeSet, i);
        C0422aa.m1768a(this, getContext());
        C0444e eVar = new C0444e(this);
        this.f1314a = eVar;
        eVar.mo2583a(attributeSet, i);
        C0443d dVar = new C0443d(this);
        this.f1315b = dVar;
        dVar.mo2575a(attributeSet, i);
        C0452l lVar = new C0452l(this);
        this.f1316c = lVar;
        lVar.mo2619a(attributeSet, i);
    }
}
