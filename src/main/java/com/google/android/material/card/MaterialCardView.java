package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.cardview.widget.CardView;
import com.google.android.material.shape.AbstractC22413o;
import com.google.android.material.shape.C22394h;
import com.google.android.material.shape.C22398l;
import com.larksuite.suite.R;

public class MaterialCardView extends CardView implements Checkable, AbstractC22413o {

    /* renamed from: e */
    private static final int[] f54155e = {16842911};

    /* renamed from: f */
    private static final int[] f54156f = {16842912};

    /* renamed from: g */
    private static final int[] f54157g = {R.attr.state_dragged};

    /* renamed from: h */
    private static final int f54158h = 2131887352;

    /* renamed from: i */
    private final C22199a f54159i;

    /* renamed from: j */
    private boolean f54160j;

    /* renamed from: k */
    private boolean f54161k;

    /* renamed from: l */
    private boolean f54162l;

    /* renamed from: m */
    private AbstractC22198a f54163m;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface AbstractC22198a {
        /* renamed from: a */
        void mo76886a(MaterialCardView materialCardView, boolean z);
    }

    public boolean W_() {
        return this.f54162l;
    }

    public boolean isChecked() {
        return this.f54161k;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f54159i.mo76907f();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f54159i.mo76908g();
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f54159i.mo76920s();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f54159i.mo76918q();
    }

    public float getProgress() {
        return this.f54159i.mo76912k();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f54159i.mo76911j();
    }

    public ColorStateList getRippleColor() {
        return this.f54159i.mo76919r();
    }

    @Override // com.google.android.material.shape.AbstractC22413o
    public C22398l getShapeAppearanceModel() {
        return this.f54159i.mo76922u();
    }

    public int getStrokeColor() {
        return this.f54159i.mo76897b();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f54159i.mo76901c();
    }

    public int getStrokeWidth() {
        return this.f54159i.mo76903d();
    }

    /* renamed from: c */
    private void mo77237c() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f54159i.mo76921t();
        }
    }

    public boolean X_() {
        C22199a aVar = this.f54159i;
        if (aVar == null || !aVar.mo76917p()) {
            return false;
        }
        return true;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f54159i.mo76909h().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f54159i.mo76909h().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f54159i.mo76909h().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f54159i.mo76909h().top;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C22394h.m81149a(this, this.f54159i.mo76905e());
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f54159i.mo76905e().getBounds());
        return rectF;
    }

    public void toggle() {
        if (X_() && isEnabled()) {
            this.f54161k = !this.f54161k;
            refreshDrawableState();
            mo77237c();
            AbstractC22198a aVar = this.f54163m;
            if (aVar != null) {
                aVar.mo76886a(this, this.f54161k);
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnCheckedChangeListener(AbstractC22198a aVar) {
        this.f54163m = aVar;
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f54159i.mo76899b(colorStateList);
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f54159i.mo76902c(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f54159i.mo76900b(z);
    }

    public void setChecked(boolean z) {
        if (this.f54161k != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f54159i.mo76893a(drawable);
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f54159i.mo76906e(colorStateList);
    }

    public void setProgress(float f) {
        this.f54159i.mo76898b(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f54159i.mo76904d(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f54159i.mo76891a(colorStateList);
    }

    public void setStrokeWidth(int i) {
        this.f54159i.mo76888a(i);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.f54159i.mo76899b(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f54159i.mo76913l();
    }

    public void setCheckedIconResource(int i) {
        this.f54159i.mo76893a(C0215a.m655b(getContext(), i));
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        C22199a aVar = this.f54159i;
        if (aVar != null) {
            aVar.mo76910i();
        }
    }

    public void setDragged(boolean z) {
        if (this.f54162l != z) {
            this.f54162l = z;
            refreshDrawableState();
            mo77237c();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f54159i.mo76914m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f54159i.mo76914m();
        this.f54159i.mo76916o();
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.f54159i.mo76887a(f);
    }

    public void setRippleColorResource(int i) {
        this.f54159i.mo76904d(C0215a.m652a(getContext(), i));
    }

    public void setStrokeColor(int i) {
        this.f54159i.mo76891a(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f54159i.mo76914m();
        this.f54159i.mo76916o();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(X_());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f54160j) {
            if (!this.f54159i.mo76896a()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f54159i.mo76895a(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // com.google.android.material.shape.AbstractC22413o
    public void setShapeAppearanceModel(C22398l lVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(lVar.mo78004a(getBoundsAsRectF()));
        }
        this.f54159i.mo76894a(lVar);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (X_()) {
            mergeDrawableStates(onCreateDrawableState, f54155e);
        }
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f54156f);
        }
        if (W_()) {
            mergeDrawableStates(onCreateDrawableState, f54157g);
        }
        return onCreateDrawableState;
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.cardview.widget.CardView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f54159i.mo76889a(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo76852b(int i, int i2, int i3, int i4) {
        super.mo2810a(i, i2, i3, i4);
    }

    @Override // androidx.cardview.widget.CardView
    /* renamed from: a */
    public void mo2810a(int i, int i2, int i3, int i4) {
        this.f54159i.mo76890a(i, i2, i3, i4);
    }
}
