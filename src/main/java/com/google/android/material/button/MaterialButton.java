package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.shape.AbstractC22413o;
import com.google.android.material.shape.C22394h;
import com.google.android.material.shape.C22398l;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends AppCompatButton implements Checkable, AbstractC22413o {

    /* renamed from: a */
    private static final int[] f54099a = {16842911};

    /* renamed from: b */
    private static final int[] f54100b = {16842912};

    /* renamed from: c */
    private static final int f54101c = 2131887340;

    /* renamed from: e */
    private final C22196a f54102e;

    /* renamed from: f */
    private final LinkedHashSet<AbstractC22188a> f54103f;

    /* renamed from: g */
    private AbstractC22189b f54104g;

    /* renamed from: h */
    private PorterDuff.Mode f54105h;

    /* renamed from: i */
    private ColorStateList f54106i;

    /* renamed from: j */
    private Drawable f54107j;

    /* renamed from: k */
    private int f54108k;

    /* renamed from: l */
    private int f54109l;

    /* renamed from: m */
    private int f54110m;

    /* renamed from: n */
    private boolean f54111n;

    /* renamed from: o */
    private boolean f54112o;

    /* renamed from: p */
    private int f54113p;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface AbstractC22188a {
        /* renamed from: a */
        void mo76802a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    interface AbstractC22189b {
        /* renamed from: a */
        void mo76803a(MaterialButton materialButton, boolean z);
    }

    public Drawable getIcon() {
        return this.f54107j;
    }

    public int getIconGravity() {
        return this.f54113p;
    }

    public int getIconPadding() {
        return this.f54110m;
    }

    public int getIconSize() {
        return this.f54108k;
    }

    public ColorStateList getIconTint() {
        return this.f54106i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f54105h;
    }

    public boolean isChecked() {
        return this.f54111n;
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void toggle() {
        setChecked(!this.f54111n);
    }

    /* renamed from: c */
    private boolean mo77451c() {
        if (ViewCompat.m4082h(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m80031d() {
        C22196a aVar = this.f54102e;
        if (aVar == null || aVar.mo76837b()) {
            return false;
        }
        return true;
    }

    private String getA11yClassName() {
        Class cls;
        if (mo76745a()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    /* renamed from: a */
    public boolean mo76745a() {
        C22196a aVar = this.f54102e;
        if (aVar == null || !aVar.mo76847j()) {
            return false;
        }
        return true;
    }

    public int getCornerRadius() {
        if (m80031d()) {
            return this.f54102e.mo76845h();
        }
        return 0;
    }

    public ColorStateList getRippleColor() {
        if (m80031d()) {
            return this.f54102e.mo76842e();
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (m80031d()) {
            return this.f54102e.mo76843f();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m80031d()) {
            return this.f54102e.mo76844g();
        }
        return 0;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f54114a = this.f54111n;
        return savedState;
    }

    @Override // com.google.android.material.shape.AbstractC22413o
    public C22398l getShapeAppearanceModel() {
        if (m80031d()) {
            return this.f54102e.mo76849l();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.AbstractC0915q
    public ColorStateList getSupportBackgroundTintList() {
        if (m80031d()) {
            return this.f54102e.mo76838c();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.AbstractC0915q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m80031d()) {
            return this.f54102e.mo76841d();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m80031d()) {
            C22394h.m81149a(this, this.f54102e.mo76846i());
        }
    }

    /* renamed from: b */
    private void mo77450b() {
        if (this.f54107j != null && getLayout() != null) {
            int i = this.f54113p;
            boolean z = true;
            if (i == 1 || i == 3) {
                this.f54109l = 0;
                m80027a(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i2 = this.f54108k;
            if (i2 == 0) {
                i2 = this.f54107j.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - ViewCompat.m4097m(this)) - i2) - this.f54110m) - ViewCompat.m4094l(this)) / 2;
            boolean c = mo77451c();
            if (this.f54113p != 4) {
                z = false;
            }
            if (c != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.f54109l != measuredWidth) {
                this.f54109l = measuredWidth;
                m80027a(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.button.MaterialButton.SavedState.C221871 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        boolean f54114a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m80035a(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f54114a = z;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m80035a(parcel);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f54114a ? 1 : 0);
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(AbstractC22189b bVar) {
        this.f54104g = bVar;
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo76744a(AbstractC22188a aVar) {
        this.f54103f.add(aVar);
    }

    /* renamed from: b */
    public void mo76746b(AbstractC22188a aVar) {
        this.f54103f.remove(aVar);
    }

    /* renamed from: b */
    private void m80029b(boolean z) {
        if (z) {
            TextViewCompat.m4493a(this, this.f54107j, null, null, null);
        } else {
            TextViewCompat.m4493a(this, null, null, this.f54107j, null);
        }
    }

    public void setBackgroundColor(int i) {
        if (m80031d()) {
            this.f54102e.mo76827a(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0215a.m655b(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setCheckable(boolean z) {
        if (m80031d()) {
            this.f54102e.mo76836b(z);
        }
    }

    public void setCornerRadius(int i) {
        if (m80031d()) {
            this.f54102e.mo76839c(i);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f54107j != drawable) {
            this.f54107j = drawable;
            m80027a(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.f54113p != i) {
            this.f54113p = i;
            mo77450b();
        }
    }

    public void setIconPadding(int i) {
        if (this.f54110m != i) {
            this.f54110m = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0215a.m655b(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f54106i != colorStateList) {
            this.f54106i = colorStateList;
            m80027a(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f54105h != mode) {
            this.f54105h = mode;
            m80027a(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C0215a.m652a(getContext(), i));
    }

    public void setPressed(boolean z) {
        AbstractC22189b bVar = this.f54104g;
        if (bVar != null) {
            bVar.mo76803a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m80031d()) {
            this.f54102e.mo76835b(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m80031d()) {
            this.f54102e.mo76833a(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m80031d()) {
            this.f54102e.mo76840c(colorStateList);
        }
    }

    public void setStrokeWidth(int i) {
        if (m80031d()) {
            this.f54102e.mo76834b(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m80031d()) {
            this.f54102e.mo76829a(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m80031d()) {
            this.f54102e.mo76831a(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo76745a()) {
            mergeDrawableStates(onCreateDrawableState, f54099a);
        }
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f54100b);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo76745a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo4902a());
        setChecked(savedState.f54114a);
    }

    public void setCornerRadiusResource(int i) {
        if (m80031d()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (m80031d()) {
            this.f54102e.mo76846i().mo77985r(f);
        }
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f54108k != i) {
            this.f54108k = i;
            m80027a(true);
        }
    }

    public void setRippleColorResource(int i) {
        if (m80031d()) {
            setRippleColor(C0215a.m652a(getContext(), i));
        }
    }

    @Override // com.google.android.material.shape.AbstractC22413o
    public void setShapeAppearanceModel(C22398l lVar) {
        if (m80031d()) {
            this.f54102e.mo76832a(lVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColorResource(int i) {
        if (m80031d()) {
            setStrokeColor(C0215a.m652a(getContext(), i));
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m80031d()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m80031d()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            this.f54102e.mo76826a();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setChecked(boolean z) {
        if (mo76745a() && isEnabled() && this.f54111n != z) {
            this.f54111n = z;
            refreshDrawableState();
            if (!this.f54112o) {
                this.f54112o = true;
                Iterator<AbstractC22188a> it = this.f54103f.iterator();
                while (it.hasNext()) {
                    it.next().mo76802a(this, this.f54111n);
                }
                this.f54112o = false;
            }
        }
    }

    /* renamed from: a */
    private void m80027a(boolean z) {
        boolean z2;
        Drawable drawable = this.f54107j;
        boolean z3 = false;
        if (drawable != null) {
            Drawable mutate = C0774a.m3779g(drawable).mutate();
            this.f54107j = mutate;
            C0774a.m3768a(mutate, this.f54106i);
            PorterDuff.Mode mode = this.f54105h;
            if (mode != null) {
                C0774a.m3771a(this.f54107j, mode);
            }
            int i = this.f54108k;
            if (i == 0) {
                i = this.f54107j.getIntrinsicWidth();
            }
            int i2 = this.f54108k;
            if (i2 == 0) {
                i2 = this.f54107j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f54107j;
            int i3 = this.f54109l;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.f54113p;
        if (i4 == 1 || i4 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            m80029b(z2);
            return;
        }
        Drawable[] b = TextViewCompat.m4497b(this);
        Drawable drawable3 = b[0];
        Drawable drawable4 = b[2];
        if ((z2 && drawable3 != this.f54107j) || (!z2 && drawable4 != this.f54107j)) {
            z3 = true;
        }
        if (z3) {
            m80029b(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo77450b();
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        mo77450b();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C22196a aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f54102e) != null) {
            aVar.mo76828a(i4 - i2, i3 - i);
        }
    }
}
