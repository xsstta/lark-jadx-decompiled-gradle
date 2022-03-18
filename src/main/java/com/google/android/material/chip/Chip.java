package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.C0859a;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.customview.p030a.AbstractC0951a;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.google.android.material.chip.C22208a;
import com.google.android.material.internal.C22358l;
import com.google.android.material.internal.C22365r;
import com.google.android.material.p980a.C22123h;
import com.google.android.material.p988i.AbstractC22318f;
import com.google.android.material.p988i.C22314d;
import com.google.android.material.p989j.C22375b;
import com.google.android.material.shape.AbstractC22413o;
import com.google.android.material.shape.C22394h;
import com.google.android.material.shape.C22398l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Chip extends AppCompatCheckBox implements C22208a.AbstractC22209a, AbstractC22413o {

    /* renamed from: a */
    public static final Rect f54190a = new Rect();

    /* renamed from: e */
    private static final int f54191e = 2131887354;

    /* renamed from: f */
    private static final int[] f54192f = {16842913};

    /* renamed from: g */
    private static final int[] f54193g = {16842911};

    /* renamed from: b */
    public C22208a f54194b;

    /* renamed from: c */
    public View.OnClickListener f54195c;

    /* renamed from: d */
    public boolean f54196d;

    /* renamed from: h */
    private InsetDrawable f54197h;

    /* renamed from: i */
    private RippleDrawable f54198i;

    /* renamed from: j */
    private CompoundButton.OnCheckedChangeListener f54199j;

    /* renamed from: k */
    private boolean f54200k;

    /* renamed from: l */
    private boolean f54201l;

    /* renamed from: m */
    private boolean f54202m;

    /* renamed from: n */
    private boolean f54203n;

    /* renamed from: o */
    private int f54204o;

    /* renamed from: p */
    private int f54205p;

    /* renamed from: q */
    private final C22203a f54206q;

    /* renamed from: r */
    private final Rect f54207r;

    /* renamed from: s */
    private final RectF f54208s;

    /* renamed from: t */
    private final AbstractC22318f f54209t;

    /* renamed from: f */
    public boolean mo76936f() {
        return this.f54203n;
    }

    public Drawable getChipDrawable() {
        return this.f54194b;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f54197h;
        if (insetDrawable == null) {
            return this.f54194b;
        }
        return insetDrawable;
    }

    public CharSequence getChipText() {
        return getText();
    }

    @Override // com.google.android.material.shape.AbstractC22413o
    public C22398l getShapeAppearanceModel() {
        return this.f54194b.getShapeAppearanceModel();
    }

    private C22314d getTextAppearance() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77203o();
        }
        return null;
    }

    /* renamed from: i */
    private void m80170i() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider() {
                /* class com.google.android.material.chip.Chip.C222022 */

                public void getOutline(View view, Outline outline) {
                    if (Chip.this.f54194b != null) {
                        Chip.this.f54194b.getOutline(outline);
                    } else {
                        outline.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public boolean mo76931c() {
        C22208a aVar = this.f54194b;
        if (aVar == null || aVar.mo77221u() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo76932d() {
        C22208a aVar = this.f54194b;
        if (aVar == null || !aVar.mo77220t()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo76935e() {
        C22208a aVar = this.f54194b;
        if (aVar == null || !aVar.mo77231y()) {
            return false;
        }
        return true;
    }

    public Drawable getCheckedIcon() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77232z();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77114A();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77181h();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return Math.max((float) BitmapDescriptorFactory.HUE_RED, aVar.mo77189j());
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getChipEndPadding() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77127K();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public Drawable getChipIcon() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77209q();
        }
        return null;
    }

    public float getChipIconSize() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77213s();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getChipIconTint() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77211r();
        }
        return null;
    }

    public float getChipMinHeight() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77184i();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getChipStartPadding() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77120D();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getChipStrokeColor() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77192k();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77195l();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public Drawable getCloseIcon() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77221u();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77228x();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77126J();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getCloseIconSize() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77226w();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getCloseIconStartPadding() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77125I();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getCloseIconTint() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77224v();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77207p();
        }
        return null;
    }

    public C22123h getHideMotionSpec() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77118C();
        }
        return null;
    }

    public float getIconEndPadding() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77122F();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getIconStartPadding() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77121E();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getRippleColor() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77198m();
        }
        return null;
    }

    public C22123h getShowMotionSpec() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77116B();
        }
        return null;
    }

    public float getTextEndPadding() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77124H();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getTextStartPadding() {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            return aVar.mo77123G();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C22394h.m81149a(this, this.f54194b);
    }

    /* renamed from: g */
    private void m80168g() {
        if (!mo76931c() || !mo76932d() || this.f54195c == null) {
            ViewCompat.m4043a(this, (C0859a) null);
        } else {
            ViewCompat.m4043a(this, this.f54206q);
        }
    }

    /* renamed from: j */
    private void m80171j() {
        if (C22375b.f54805a) {
            m80173l();
            return;
        }
        this.f54194b.mo77140a(true);
        ViewCompat.m4039a(this, getBackgroundDrawable());
        m80169h();
        m80172k();
    }

    /* renamed from: k */
    private void m80172k() {
        if (getBackgroundDrawable() == this.f54197h && this.f54194b.getCallback() == null) {
            this.f54194b.setCallback(this.f54197h);
        }
    }

    /* renamed from: n */
    private void m80175n() {
        TextPaint paint = getPaint();
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C22314d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo77674b(getContext(), paint, this.f54209t);
        }
    }

    /* renamed from: o */
    private void m80176o() {
        if (this.f54197h != null) {
            this.f54197h = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m80171j();
        }
    }

    @Override // com.google.android.material.chip.C22208a.AbstractC22209a
    /* renamed from: a */
    public void mo76928a() {
        mo76929a(this.f54205p);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* renamed from: b */
    public boolean mo76930b() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f54195c;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f54206q.mo4844a(1, 1);
        return z;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatCheckBox
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        C22208a aVar = this.f54194b;
        if (aVar == null || !aVar.mo77171f()) {
            z = false;
        } else {
            z = this.f54194b.mo77142a(m80174m());
        }
        if (z) {
            invalidate();
        }
    }

    public RectF getCloseIconTouchBounds() {
        this.f54208s.setEmpty();
        if (mo76931c()) {
            this.f54194b.mo77133a(this.f54208s);
        }
        return this.f54208s;
    }

    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f54207r.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f54207r;
    }

    /* renamed from: l */
    private void m80173l() {
        this.f54198i = new RippleDrawable(C22375b.m81040b(this.f54194b.mo77198m()), getBackgroundDrawable(), null);
        this.f54194b.mo77140a(false);
        ViewCompat.m4039a(this, this.f54198i);
        m80169h();
    }

    /* renamed from: h */
    private void m80169h() {
        C22208a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f54194b) != null) {
            int K = (int) (aVar.mo77127K() + this.f54194b.mo77124H() + this.f54194b.mo77157d());
            int D = (int) (this.f54194b.mo77120D() + this.f54194b.mo77123G() + this.f54194b.mo77151c());
            if (this.f54197h != null) {
                Rect rect = new Rect();
                this.f54197h.getPadding(rect);
                D += rect.left;
                K += rect.right;
            }
            ViewCompat.m4058b(this, D, getPaddingTop(), K, getPaddingBottom());
        }
    }

    /* renamed from: m */
    private int[] m80174m() {
        int i;
        int i2 = 0;
        if (isEnabled()) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f54196d) {
            i++;
        }
        if (this.f54202m) {
            i++;
        }
        if (this.f54201l) {
            i++;
        }
        if (isChecked()) {
            i++;
        }
        int[] iArr = new int[i];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i2 = 1;
        }
        if (this.f54196d) {
            iArr[i2] = 16842908;
            i2++;
        }
        if (this.f54202m) {
            iArr[i2] = 16843623;
            i2++;
        }
        if (this.f54201l) {
            iArr[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            iArr[i2] = 16842913;
        }
        return iArr;
    }

    /* renamed from: b */
    private void m80167b(C22208a aVar) {
        aVar.mo77137a(this);
    }

    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f54199j = onCheckedChangeListener;
    }

    public Chip(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m80165a(C22208a aVar) {
        if (aVar != null) {
            aVar.mo77137a((C22208a.AbstractC22209a) null);
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77161d(z);
        }
    }

    public void setCheckableResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77204o(i);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77155c(drawable);
        }
    }

    public void setCheckedIconResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77210q(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77169f(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77212r(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77208p(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77132a(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77131a(i);
        }
    }

    public void setChipCornerRadius(float f) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77144b(f);
        }
    }

    public void setChipCornerRadiusResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77153c(i);
        }
    }

    public void setChipEndPadding(float f) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77199m(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77117B(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77134a(drawable);
        }
    }

    public void setChipIconResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77186i(i);
        }
    }

    public void setChipIconSize(float f) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77158d(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77194k(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77160d(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77191j(i);
        }
    }

    public void setChipIconVisible(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77183h(i);
        }
    }

    public void setChipMinHeight(float f) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77130a(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77145b(i);
        }
    }

    public void setChipStartPadding(float f) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77167f(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77222u(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77146b(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77159d(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77152c(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77164e(i);
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77149b(charSequence);
        }
    }

    public void setCloseIconEndPadding(float f) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77196l(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77115A(i);
        }
    }

    public void setCloseIconSize(float f) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77163e(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77202n(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77193k(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77233z(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77165e(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77200m(i);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f54203n = z;
        mo76929a(this.f54205p);
    }

    public void setHideMotionSpec(C22123h hVar) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77148b(hVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77219t(i);
        }
    }

    public void setIconEndPadding(float f) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77182h(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77227w(i);
        }
    }

    public void setIconStartPadding(float f) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77172g(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77225v(i);
        }
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f54195c = onClickListener;
        m80168g();
    }

    @Override // com.google.android.material.shape.AbstractC22413o
    public void setShapeAppearanceModel(C22398l lVar) {
        this.f54194b.setShapeAppearanceModel(lVar);
    }

    public void setShowMotionSpec(C22123h hVar) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77136a(hVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77214s(i);
        }
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77190j(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77230y(i);
        }
    }

    public void setTextStartPadding(float f) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77185i(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77229x(i);
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f54202m != z) {
            this.f54202m = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f54201l != z) {
            this.f54201l = z;
            refreshDrawableState();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f54204o != i) {
            this.f54204o = i;
            m80169h();
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77166e(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77150b(z);
        }
    }

    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77147b(drawable);
        }
        m80168g();
    }

    public void setCloseIconResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77197l(i);
        }
        m80168g();
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77985r(f);
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f54194b != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77119C(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77173g(i);
        }
        m80175n();
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (m80166a(motionEvent) || this.f54206q.mo4847a(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f54206q.mo4846a(keyEvent) || this.f54206q.mo4852c() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f54206q.mo4852c() == 1 || this.f54206q.mo4848b() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f54192f);
        }
        if (mo76935e()) {
            mergeDrawableStates(onCreateDrawableState, f54193g);
        }
        return onCreateDrawableState;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f54198i) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f54198i) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C22208a aVar = this.f54194b;
        if (aVar == null) {
            this.f54200k = z;
        } else if (aVar.mo77231y()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f54199j) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setChipDrawable(C22208a aVar) {
        C22208a aVar2 = this.f54194b;
        if (aVar2 != aVar) {
            m80165a(aVar2);
            this.f54194b = aVar;
            aVar.mo77170f(false);
            m80167b(this.f54194b);
            mo76929a(this.f54205p);
        }
    }

    public void setCloseIconVisible(boolean z) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77156c(z);
        }
        m80168g();
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f54194b != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C22208a aVar = this.f54194b;
                if (aVar != null) {
                    aVar.mo77135a(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77154c(colorStateList);
        }
        if (!this.f54194b.mo77141a()) {
            m80173l();
        }
    }

    public void setRippleColorResource(int i) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77168f(i);
            if (!this.f54194b.mo77141a()) {
                m80173l();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.Chip$a */
    public class C22203a extends AbstractC0951a {
        /* access modifiers changed from: protected */
        @Override // androidx.customview.p030a.AbstractC0951a
        /* renamed from: a */
        public void mo4842a(List<Integer> list) {
            list.add(0);
            if (Chip.this.mo76931c() && Chip.this.mo76932d() && Chip.this.f54195c != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.customview.p030a.AbstractC0951a
        /* renamed from: a */
        public void mo4841a(C0864d dVar) {
            String str;
            dVar.mo4560a(Chip.this.mo76935e());
            dVar.mo4592h(Chip.this.isClickable());
            if (Chip.this.mo76935e() || Chip.this.isClickable()) {
                if (Chip.this.mo76935e()) {
                    str = "android.widget.CompoundButton";
                } else {
                    str = "android.widget.Button";
                }
                dVar.mo4566b((CharSequence) str);
            } else {
                dVar.mo4566b("android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                dVar.mo4575c(text);
            } else {
                dVar.mo4582e(text);
            }
        }

        C22203a(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.customview.p030a.AbstractC0951a
        /* renamed from: a */
        public void mo4839a(int i, boolean z) {
            if (i == 1) {
                Chip.this.f54196d = z;
                Chip.this.refreshDrawableState();
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.customview.p030a.AbstractC0951a
        /* renamed from: a */
        public int mo4835a(float f, float f2) {
            if (!Chip.this.mo76931c() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) {
                return 0;
            }
            return 1;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.customview.p030a.AbstractC0951a
        /* renamed from: a */
        public void mo4838a(int i, C0864d dVar) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    dVar.mo4582e(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    dVar.mo4582e(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
                }
                dVar.mo4563b(Chip.this.getCloseIconTouchBoundsInt());
                dVar.mo4555a(C0864d.C0865a.f3373e);
                dVar.mo4598j(Chip.this.isEnabled());
                return;
            }
            dVar.mo4582e(charSequence);
            dVar.mo4563b(Chip.f54190a);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.customview.p030a.AbstractC0951a
        /* renamed from: b */
        public boolean mo4851b(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.mo76930b();
            }
            return false;
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void setTextAppearance(C22314d dVar) {
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77138a(dVar);
        }
        m80175n();
    }

    /* renamed from: a */
    private boolean m80166a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = AbstractC0951a.class.getDeclaredField("k");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f54206q)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = AbstractC0951a.class.getDeclaredMethod(C13998f.f36682a, Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f54206q, Integer.MIN_VALUE);
                    return true;
                }
            } catch (NoSuchMethodException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (IllegalAccessException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (InvocationTargetException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (NoSuchFieldException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        }
        return false;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (mo76935e() || isClickable()) {
            if (mo76935e()) {
                str = "android.widget.CompoundButton";
            } else {
                str = "android.widget.Button";
            }
            accessibilityNodeInfo.setClassName(str);
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(mo76935e());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C0864d a = C0864d.m4171a(accessibilityNodeInfo);
            if (chipGroup.mo77079b()) {
                i = chipGroup.mo77074a(this);
            } else {
                i = -1;
            }
            a.mo4567b(C0864d.C0867c.m4258a(chipGroup.mo77707b(this), 1, i, 1, false, isChecked()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f54201l
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f54201l
            if (r0 == 0) goto L_0x0034
            r5.mo76930b()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private void m80164a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* renamed from: a */
    public boolean mo76929a(int i) {
        int i2;
        this.f54205p = i;
        int i3 = 0;
        if (!mo76936f()) {
            if (this.f54197h != null) {
                m80176o();
            } else {
                m80171j();
            }
            return false;
        }
        int max = Math.max(0, i - this.f54194b.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f54194b.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            if (max2 > 0) {
                i2 = max2 / 2;
            } else {
                i2 = 0;
            }
            if (max > 0) {
                i3 = max / 2;
            }
            if (this.f54197h != null) {
                Rect rect = new Rect();
                this.f54197h.getPadding(rect);
                if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                    m80171j();
                    return true;
                }
            }
            if (Build.VERSION.SDK_INT >= 16) {
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
            } else {
                setMinHeight(i);
                setMinWidth(i);
            }
            m80162a(i2, i3, i2, i3);
            m80171j();
            return true;
        }
        if (this.f54197h != null) {
            m80176o();
        } else {
            m80171j();
        }
        return false;
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (aVar.mo77128L()) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            C22208a aVar2 = this.f54194b;
            if (aVar2 != null) {
                aVar2.mo77139a(charSequence);
            }
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C22208a aVar = this.f54194b;
        if (aVar != null) {
            aVar.mo77173g(i);
        }
        m80175n();
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f54206q.mo4843a(z, i, rect);
    }

    /* renamed from: a */
    private void m80163a(Context context, AttributeSet attributeSet, int i) {
        TypedArray a = C22358l.m80999a(context, attributeSet, new int[]{16842804, 16842904, 16842923, 16843039, 16843087, 16843237, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding}, i, f54191e, new int[0]);
        this.f54203n = a.getBoolean(31, false);
        this.f54205p = (int) Math.ceil((double) a.getDimension(19, (float) Math.ceil((double) C22365r.m81020a(getContext(), 48))));
        a.recycle();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: a */
    private void m80162a(int i, int i2, int i3, int i4) {
        this.f54197h = new InsetDrawable((Drawable) this.f54194b, i, i2, i3, i4);
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }
}
