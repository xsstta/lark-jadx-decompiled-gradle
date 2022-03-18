package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.view.AbstractC0915q;
import androidx.core.widget.AbstractC0939b;
import androidx.core.widget.AbstractC0949l;
import androidx.core.widget.TextViewCompat;
import com.larksuite.suite.R;

public class AppCompatButton extends Button implements AbstractC0915q, AbstractC0939b, AbstractC0949l {
    private final C0443d mBackgroundTintHelper;
    private final C0452l mTextHelper;

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.mo2632j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.mo2633k();
    }

    @Override // androidx.core.view.AbstractC0915q
    public ColorStateList getSupportBackgroundTintList() {
        C0443d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.mo2570a();
        }
        return null;
    }

    @Override // androidx.core.view.AbstractC0915q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0443d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.mo2576b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0443d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2578c();
        }
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo2624b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (f3562d) {
            return super.getAutoSizeMaxTextSize();
        }
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            return lVar.mo2630h();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f3562d) {
            return super.getAutoSizeMinTextSize();
        }
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            return lVar.mo2629g();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (f3562d) {
            return super.getAutoSizeStepGranularity();
        }
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            return lVar.mo2628f();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f3562d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            return lVar.mo2631i();
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (!f3562d) {
            C0452l lVar = this.mTextHelper;
            if (lVar != null) {
                return lVar.mo2627e();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public AppCompatButton(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m4488a(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo2621a(z);
        }
    }

    @Override // androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0443d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2572a(colorStateList);
        }
    }

    @Override // androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0443d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2573a(mode);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f3562d) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo2613a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0443d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2574a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0443d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2571a(i);
        }
    }

    @Override // androidx.core.widget.AbstractC0949l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.mo2617a(colorStateList);
        this.mTextHelper.mo2624b();
    }

    @Override // androidx.core.widget.AbstractC0949l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.mo2618a(mode);
        this.mTextHelper.mo2624b();
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (f3562d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo2623a(iArr, i);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo2616a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (f3562d) {
            super.setTextSize(i, f);
            return;
        }
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo2614a(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C0424ac.m1773a(context), attributeSet, i);
        C0422aa.m1768a(this, getContext());
        C0443d dVar = new C0443d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo2575a(attributeSet, i);
        C0452l lVar = new C0452l(this);
        this.mTextHelper = lVar;
        lVar.mo2619a(attributeSet, i);
        lVar.mo2624b();
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (f3562d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo2615a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper != null && !f3562d && this.mTextHelper.mo2626d()) {
            this.mTextHelper.mo2625c();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo2622a(z, i, i2, i3, i4);
        }
    }
}
