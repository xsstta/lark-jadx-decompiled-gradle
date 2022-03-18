package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.graphics.C0773d;
import androidx.core.text.C0824c;
import androidx.core.view.AbstractC0915q;
import androidx.core.widget.AbstractC0939b;
import androidx.core.widget.AbstractC0949l;
import androidx.core.widget.TextViewCompat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements AbstractC0915q, AbstractC0939b, AbstractC0949l {
    private final C0443d mBackgroundTintHelper;
    private Future<C0824c> mPrecomputedTextFuture;
    private final C0451k mTextClassifierHelper;
    private final C0452l mTextHelper;

    public int getFirstBaselineToTopHeight() {
        return TextViewCompat.m4498c(this);
    }

    public int getLastBaselineToBottomHeight() {
        return TextViewCompat.m4500d(this);
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.mo2632j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.mo2633k();
    }

    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    public C0824c.C0825a getTextMetricsParamsCompat() {
        return TextViewCompat.m4502e(this);
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

    private void consumeTextFutureAndSetBlocking() {
        Future<C0824c> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                TextViewCompat.m4495a(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
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

    public TextClassifier getTextClassifier() {
        C0451k kVar;
        if (Build.VERSION.SDK_INT >= 28 || (kVar = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        return kVar.mo2610a();
    }

    public void setLineHeight(int i) {
        TextViewCompat.m4501d(this, i);
    }

    public void setPrecomputedText(C0824c cVar) {
        TextViewCompat.m4495a(this, cVar);
    }

    public void setTextMetricsParamsCompat(C0824c.C0825a aVar) {
        TextViewCompat.m4494a(this, aVar);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m4488a(this, callback));
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

    public void setTextFuture(Future<C0824c> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0447g.m1927a(super.onCreateInputConnection(editorInfo), editorInfo, this);
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

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            TextViewCompat.m4496b(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            TextViewCompat.m4499c(this, i);
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

    public void setTextClassifier(TextClassifier textClassifier) {
        C0451k kVar;
        if (Build.VERSION.SDK_INT >= 28 || (kVar = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            kVar.mo2611a(textClassifier);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
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

    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            typeface2 = C0773d.m3737a(getContext(), typeface, i);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0424ac.m1773a(context), attributeSet, i);
        C0422aa.m1768a(this, getContext());
        C0443d dVar = new C0443d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo2575a(attributeSet, i);
        C0452l lVar = new C0452l(this);
        this.mTextHelper = lVar;
        lVar.mo2619a(attributeSet, i);
        lVar.mo2624b();
        this.mTextClassifierHelper = new C0451k(this);
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

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo2612a();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo2612a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo2612a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo2612a();
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper != null && !f3562d && this.mTextHelper.mo2626d()) {
            this.mTextHelper.mo2625c();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = C0215a.m655b(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = C0215a.m655b(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = C0215a.m655b(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = C0215a.m655b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo2612a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = C0215a.m655b(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = C0215a.m655b(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = C0215a.m655b(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = C0215a.m655b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0452l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo2612a();
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
