package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0445f;
import androidx.appcompat.widget.C0460p;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.text.C0820a;
import androidx.core.view.C0859a;
import androidx.core.view.C0906h;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C22327a;
import com.google.android.material.internal.C22331c;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.p980a.C22116a;
import com.google.android.material.p982c.C22197a;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {

    /* renamed from: g */
    private static final int f55211g = 2131887311;

    /* renamed from: A */
    private CharSequence f55212A;

    /* renamed from: B */
    private final TextView f55213B;

    /* renamed from: C */
    private boolean f55214C;

    /* renamed from: D */
    private CharSequence f55215D;

    /* renamed from: E */
    private boolean f55216E;

    /* renamed from: F */
    private MaterialShapeDrawable f55217F;

    /* renamed from: G */
    private MaterialShapeDrawable f55218G;

    /* renamed from: H */
    private C22398l f55219H;

    /* renamed from: I */
    private final int f55220I;

    /* renamed from: J */
    private int f55221J;

    /* renamed from: K */
    private final int f55222K;

    /* renamed from: L */
    private int f55223L;

    /* renamed from: M */
    private int f55224M;

    /* renamed from: N */
    private int f55225N;

    /* renamed from: O */
    private int f55226O;

    /* renamed from: P */
    private int f55227P;

    /* renamed from: Q */
    private final Rect f55228Q;

    /* renamed from: R */
    private final Rect f55229R;

    /* renamed from: S */
    private final RectF f55230S;

    /* renamed from: T */
    private Typeface f55231T;

    /* renamed from: U */
    private final CheckableImageButton f55232U;

    /* renamed from: V */
    private ColorStateList f55233V;

    /* renamed from: W */
    private boolean f55234W;

    /* renamed from: a */
    EditText f55235a;
    private int aA;
    private int aB;
    private int aC;
    private int aD;
    private int aE;
    private boolean aF;
    private boolean aG;
    private ValueAnimator aH;
    private boolean aI;
    private PorterDuff.Mode aa;
    private boolean ab;
    private Drawable ac;
    private int ad;
    private View.OnLongClickListener ae;
    private final LinkedHashSet<AbstractC22463b> af;
    private int ag;
    private final SparseArray<AbstractC22488e> ah;

    /* renamed from: ai  reason: collision with root package name */
    private final LinkedHashSet<AbstractC22464c> f175436ai;
    private ColorStateList aj;
    private boolean ak;
    private PorterDuff.Mode al;
    private boolean am;
    private Drawable an;
    private int ao;
    private Drawable ap;
    private View.OnLongClickListener aq;
    private View.OnLongClickListener ar;
    private final CheckableImageButton as;
    private ColorStateList at;
    private ColorStateList au;
    private ColorStateList av;
    private int aw;
    private int ax;
    private int ay;
    private ColorStateList az;

    /* renamed from: b */
    boolean f55236b;

    /* renamed from: c */
    public boolean f55237c;

    /* renamed from: d */
    public final CheckableImageButton f55238d;

    /* renamed from: e */
    final C22327a f55239e;

    /* renamed from: f */
    public boolean f55240f;

    /* renamed from: h */
    private final FrameLayout f55241h;

    /* renamed from: i */
    private final LinearLayout f55242i;

    /* renamed from: j */
    private final LinearLayout f55243j;

    /* renamed from: k */
    private final FrameLayout f55244k;

    /* renamed from: l */
    private CharSequence f55245l;

    /* renamed from: m */
    private final C22489f f55246m;

    /* renamed from: n */
    private int f55247n;

    /* renamed from: o */
    private boolean f55248o;

    /* renamed from: p */
    private TextView f55249p;

    /* renamed from: q */
    private int f55250q;

    /* renamed from: r */
    private int f55251r;

    /* renamed from: s */
    private CharSequence f55252s;

    /* renamed from: t */
    private TextView f55253t;

    /* renamed from: u */
    private ColorStateList f55254u;

    /* renamed from: v */
    private int f55255v;

    /* renamed from: w */
    private ColorStateList f55256w;

    /* renamed from: x */
    private ColorStateList f55257x;

    /* renamed from: y */
    private CharSequence f55258y;

    /* renamed from: z */
    private final TextView f55259z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EndIconMode {
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public interface AbstractC22463b {
        /* renamed from: a */
        void mo78520a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public interface AbstractC22464c {
        /* renamed from: a */
        void mo78521a(TextInputLayout textInputLayout, int i);
    }

    /* renamed from: a */
    public boolean mo78364a() {
        return this.f55216E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo78376g() {
        return this.aF;
    }

    public int getBoxBackgroundColor() {
        return this.f55227P;
    }

    public int getBoxBackgroundMode() {
        return this.f55221J;
    }

    public int getBoxStrokeColor() {
        return this.ay;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.az;
    }

    public int getBoxStrokeWidth() {
        return this.f55224M;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f55225N;
    }

    public int getCounterMaxLength() {
        return this.f55247n;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f55256w;
    }

    public ColorStateList getCounterTextColor() {
        return this.f55256w;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.au;
    }

    public EditText getEditText() {
        return this.f55235a;
    }

    public int getEndIconMode() {
        return this.ag;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f55238d;
    }

    public ColorStateList getHintTextColor() {
        return this.av;
    }

    public int getPlaceholderTextAppearance() {
        return this.f55255v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f55254u;
    }

    public CharSequence getPrefixText() {
        return this.f55258y;
    }

    public TextView getPrefixTextView() {
        return this.f55259z;
    }

    public CharSequence getSuffixText() {
        return this.f55212A;
    }

    public TextView getSuffixTextView() {
        return this.f55213B;
    }

    public Typeface getTypeface() {
        return this.f55231T;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78363a(boolean z) {
        m81516a(z, false);
    }

    /* renamed from: a */
    private void m81516a(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f55235a;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f55235a;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean g = this.f55246m.mo78574g();
        ColorStateList colorStateList2 = this.au;
        if (colorStateList2 != null) {
            this.f55239e.mo77774a(colorStateList2);
            this.f55239e.mo77786b(this.au);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.au;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.aE) : this.aE;
            this.f55239e.mo77774a(ColorStateList.valueOf(colorForState));
            this.f55239e.mo77786b(ColorStateList.valueOf(colorForState));
        } else if (g) {
            this.f55239e.mo77774a(this.f55246m.mo78578k());
        } else if (this.f55248o && (textView = this.f55249p) != null) {
            this.f55239e.mo77774a(textView.getTextColors());
        } else if (z4 && (colorStateList = this.av) != null) {
            this.f55239e.mo77774a(colorStateList);
        }
        if (z3 || (isEnabled() && (z4 || g))) {
            if (z2 || this.aF) {
                m81525c(z);
            }
        } else if (z2 || !this.aF) {
            m81526d(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78359a(int i) {
        boolean z = this.f55248o;
        int i2 = this.f55247n;
        if (i2 == -1) {
            this.f55249p.setText(String.valueOf(i));
            this.f55249p.setContentDescription(null);
            this.f55248o = false;
        } else {
            this.f55248o = i > i2;
            m81508a(getContext(), this.f55249p, i, this.f55247n, this.f55248o);
            if (z != this.f55248o) {
                m81542w();
            }
            this.f55249p.setText(C0820a.m3933a().mo4434a(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f55247n))));
        }
        if (this.f55235a != null && z != this.f55248o) {
            mo78363a(false);
            mo78375f();
            mo78368c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78360a(TextView textView, int i) {
        boolean z = true;
        try {
            TextViewCompat.m4490a(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            TextViewCompat.m4490a(textView, 2131886828);
            textView.setTextColor(ContextCompat.getColor(getContext(), R.color.design_error));
        }
    }

    /* renamed from: a */
    public void mo78362a(AbstractC22464c cVar) {
        this.f175436ai.add(cVar);
    }

    /* renamed from: a */
    public void mo78361a(AbstractC22463b bVar) {
        this.af.add(bVar);
        if (this.f55235a != null) {
            bVar.mo78520a(this);
        }
    }

    /* renamed from: a */
    private void m81515a(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C0774a.m3779g(drawable).mutate();
            if (z) {
                C0774a.m3768a(drawable, colorStateList);
            }
            if (z2) {
                C0774a.m3771a(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    private static void m81514a(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m81520b(checkableImageButton, onLongClickListener);
    }

    /* renamed from: a */
    private void m81512a(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            Drawable mutate = C0774a.m3779g(drawable).mutate();
            C0774a.m3768a(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78358a(float f) {
        if (this.f55239e.mo77800j() != f) {
            if (this.aH == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.aH = valueAnimator;
                valueAnimator.setInterpolator(C22116a.f53780b);
                this.aH.setDuration(167L);
                this.aH.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.google.android.material.textfield.TextInputLayout.C224604 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TextInputLayout.this.f55239e.mo77782b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
            }
            this.aH.setFloatValues(this.f55239e.mo77800j(), f);
            this.aH.start();
        }
    }

    /* renamed from: I */
    private boolean m81495I() {
        if (this.ag != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo78367b() {
        return this.f55246m.mo78573f();
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f55217F.ab();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f55217F.ac();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f55217F.aa();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f55217F.mo77961Z();
    }

    public CharSequence getEndIconContentDescription() {
        return this.f55238d.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f55238d.getDrawable();
    }

    public CharSequence getErrorContentDescription() {
        return this.f55246m.mo78579l();
    }

    public int getErrorCurrentTextColors() {
        return this.f55246m.mo78577j();
    }

    public Drawable getErrorIconDrawable() {
        return this.as.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.f55246m.mo78577j();
    }

    public int getHelperTextCurrentTextColor() {
        return this.f55246m.mo78580m();
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f55239e.mo77789c();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f55239e.mo77801k();
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f55238d.getContentDescription();
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f55238d.getDrawable();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f55259z.getTextColors();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f55232U.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f55232U.getDrawable();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f55213B.getTextColors();
    }

    /* renamed from: C */
    private boolean m81489C() {
        if (this.f55221J != 2 || !m81490D()) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    private boolean m81490D() {
        if (this.f55223L <= -1 || this.f55226O == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    private void m81494H() {
        m81515a(this.f55232U, this.f55234W, this.f55233V, this.ab, this.aa);
    }

    /* renamed from: J */
    private void m81496J() {
        m81515a(this.f55238d, this.ak, this.aj, this.am, this.al);
    }

    /* renamed from: P */
    private void m81502P() {
        if (m81500N()) {
            ((C22476c) this.f55217F).mo77143b();
        }
    }

    /* renamed from: Q */
    private boolean m81503Q() {
        if (this.as.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m81529j() {
        if (m81530k()) {
            ViewCompat.m4039a(this.f55235a, this.f55217F);
        }
    }

    /* renamed from: q */
    private void m81536q() {
        TextView textView = this.f55253t;
        if (textView != null) {
            this.f55241h.addView(textView);
            this.f55253t.setVisibility(0);
        }
    }

    /* renamed from: r */
    private void m81537r() {
        TextView textView = this.f55253t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: d */
    public boolean mo78369d() {
        if (this.f55232U.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public CharSequence getHint() {
        if (this.f55214C) {
            return this.f55215D;
        }
        return null;
    }

    public CharSequence getPlaceholderText() {
        if (this.f55237c) {
            return this.f55252s;
        }
        return null;
    }

    /* renamed from: B */
    private void m81488B() {
        if (this.f55218G != null) {
            if (m81490D()) {
                this.f55218G.mo77973g(ColorStateList.valueOf(this.f55226O));
            }
            invalidate();
        }
    }

    /* renamed from: G */
    private void m81493G() {
        Iterator<AbstractC22463b> it = this.af.iterator();
        while (it.hasNext()) {
            it.next().mo78520a(this);
        }
    }

    /* renamed from: L */
    private boolean m81498L() {
        if ((getStartIconDrawable() != null || this.f55258y != null) && this.f55242i.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    private boolean m81500N() {
        if (!this.f55214C || TextUtils.isEmpty(this.f55215D) || !(this.f55217F instanceof C22476c)) {
            return false;
        }
        return true;
    }

    private AbstractC22488e getEndIconDelegate() {
        AbstractC22488e eVar = this.ah.get(this.ag);
        if (eVar != null) {
            return eVar;
        }
        return this.ah.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.as.getVisibility() == 0) {
            return this.as;
        }
        if (!m81495I() || !mo78374e()) {
            return null;
        }
        return this.f55238d;
    }

    /* renamed from: h */
    private void m81527h() {
        m81528i();
        m81529j();
        mo78375f();
        if (this.f55221J != 0) {
            m81531l();
        }
    }

    /* renamed from: k */
    private boolean m81530k() {
        EditText editText = this.f55235a;
        if (editText == null || this.f55217F == null || editText.getBackground() != null || this.f55221J == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m81531l() {
        if (this.f55221J != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f55241h.getLayoutParams();
            int x = m81543x();
            if (x != layoutParams.topMargin) {
                layoutParams.topMargin = x;
                this.f55241h.requestLayout();
            }
        }
    }

    /* renamed from: m */
    private void m81532m() {
        int i;
        if (this.f55249p != null) {
            EditText editText = this.f55235a;
            if (editText == null) {
                i = 0;
            } else {
                i = editText.getText().length();
            }
            mo78359a(i);
        }
    }

    /* renamed from: n */
    private void m81533n() {
        int i;
        EditText editText = this.f55235a;
        if (editText == null) {
            i = 0;
        } else {
            i = editText.getText().length();
        }
        mo78366b(i);
    }

    /* renamed from: o */
    private void m81534o() {
        TextView textView = this.f55253t;
        if (textView != null && this.f55237c) {
            textView.setText(this.f55252s);
            this.f55253t.setVisibility(0);
            this.f55253t.bringToFront();
        }
    }

    /* renamed from: p */
    private void m81535p() {
        TextView textView = this.f55253t;
        if (textView != null && this.f55237c) {
            textView.setText((CharSequence) null);
            this.f55253t.setVisibility(4);
        }
    }

    /* renamed from: s */
    private void m81538s() {
        int i;
        TextView textView = this.f55259z;
        if (this.f55258y == null || mo78376g()) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        m81497K();
    }

    /* renamed from: y */
    private boolean m81544y() {
        if (this.f55221J != 1 || (Build.VERSION.SDK_INT >= 16 && this.f55235a.getMinLines() > 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private int m81545z() {
        int i = this.f55227P;
        if (this.f55221J == 1) {
            return C22197a.m80098a(C22197a.m80103a(this, (int) R.attr.colorSurface, 0), this.f55227P);
        }
        return i;
    }

    /* renamed from: e */
    public boolean mo78374e() {
        if (this.f55244k.getVisibility() == 0 && this.f55238d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public int getBaseline() {
        EditText editText = this.f55235a;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m81543x();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public MaterialShapeDrawable getBoxBackground() {
        int i = this.f55221J;
        if (i == 1 || i == 2) {
            return this.f55217F;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f55236b || !this.f55248o || (textView = this.f55249p) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public CharSequence getError() {
        if (this.f55246m.mo78572e()) {
            return this.f55246m.mo78575h();
        }
        return null;
    }

    public CharSequence getHelperText() {
        if (this.f55246m.mo78573f()) {
            return this.f55246m.mo78576i();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.textfield.TextInputLayout.SavedState.C224611 */

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
        CharSequence f55264a;

        /* renamed from: b */
        boolean f55265b;

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f55264a) + "}";
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f55264a, parcel, i);
            parcel.writeInt(this.f55265b ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f55264a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f55265b = parcel.readInt() != 1 ? false : true;
        }
    }

    /* renamed from: A */
    private void m81487A() {
        MaterialShapeDrawable materialShapeDrawable = this.f55217F;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(this.f55219H);
            if (m81489C()) {
                this.f55217F.mo77962a((float) this.f55223L, this.f55226O);
            }
            int z = m81545z();
            this.f55227P = z;
            this.f55217F.mo77973g(ColorStateList.valueOf(z));
            if (this.ag == 3) {
                this.f55235a.getBackground().invalidateSelf();
            }
            m81488B();
            invalidate();
        }
    }

    /* renamed from: E */
    private boolean m81491E() {
        int max;
        if (this.f55235a == null || this.f55235a.getMeasuredHeight() >= (max = Math.max(this.f55243j.getMeasuredHeight(), this.f55242i.getMeasuredHeight()))) {
            return false;
        }
        this.f55235a.setMinimumHeight(max);
        return true;
    }

    /* renamed from: F */
    private void m81492F() {
        EditText editText;
        if (this.f55253t != null && (editText = this.f55235a) != null) {
            this.f55253t.setGravity(editText.getGravity());
            this.f55253t.setPadding(this.f55235a.getCompoundPaddingLeft(), this.f55235a.getCompoundPaddingTop(), this.f55235a.getCompoundPaddingRight(), this.f55235a.getCompoundPaddingBottom());
        }
    }

    /* renamed from: M */
    private boolean m81499M() {
        if ((this.as.getVisibility() == 0 || ((m81495I() && mo78374e()) || this.f55212A != null)) && this.f55243j.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    private void m81501O() {
        if (m81500N()) {
            RectF rectF = this.f55230S;
            this.f55239e.mo77777a(rectF, this.f55235a.getWidth(), this.f55235a.getGravity());
            m81510a(rectF);
            rectF.offset((float) (-getPaddingLeft()), (float) (-getPaddingTop()));
            ((C22476c) this.f55217F).mo78535a(rectF);
        }
    }

    /* renamed from: t */
    private void m81539t() {
        int i;
        if (this.f55235a != null) {
            if (mo78369d()) {
                i = 0;
            } else {
                i = ViewCompat.m4094l(this.f55235a);
            }
            ViewCompat.m4058b(this.f55259z, i, this.f55235a.getCompoundPaddingTop(), 0, this.f55235a.getCompoundPaddingBottom());
        }
    }

    /* renamed from: u */
    private void m81540u() {
        boolean z;
        int visibility = this.f55213B.getVisibility();
        int i = 0;
        if (this.f55212A == null || mo78376g()) {
            z = false;
        } else {
            z = true;
        }
        TextView textView = this.f55213B;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.f55213B.getVisibility()) {
            getEndIconDelegate().mo78523a(z);
        }
        m81497K();
    }

    /* renamed from: v */
    private void m81541v() {
        int i;
        if (this.f55235a != null) {
            if (mo78374e() || m81503Q()) {
                i = 0;
            } else {
                i = ViewCompat.m4097m(this.f55235a);
            }
            ViewCompat.m4058b(this.f55213B, 0, this.f55235a.getPaddingTop(), i, this.f55235a.getPaddingBottom());
        }
    }

    /* renamed from: w */
    private void m81542w() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f55249p;
        if (textView != null) {
            if (this.f55248o) {
                i = this.f55250q;
            } else {
                i = this.f55251r;
            }
            mo78360a(textView, i);
            if (!this.f55248o && (colorStateList2 = this.f55256w) != null) {
                this.f55249p.setTextColor(colorStateList2);
            }
            if (this.f55248o && (colorStateList = this.f55257x) != null) {
                this.f55249p.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: x */
    private int m81543x() {
        float c;
        if (!this.f55214C) {
            return 0;
        }
        int i = this.f55221J;
        if (i == 0 || i == 1) {
            c = this.f55239e.mo77789c();
        } else if (i != 2) {
            return 0;
        } else {
            c = this.f55239e.mo77789c() / 2.0f;
        }
        return (int) c;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z;
        if (!this.aI) {
            boolean z2 = true;
            this.aI = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C22327a aVar = this.f55239e;
            if (aVar != null) {
                z = aVar.mo77780a(drawableState) | false;
            } else {
                z = false;
            }
            if (this.f55235a != null) {
                if (!ViewCompat.m4012F(this) || !isEnabled()) {
                    z2 = false;
                }
                mo78363a(z2);
            }
            mo78368c();
            mo78375f();
            if (z) {
                invalidate();
            }
            this.aI = false;
        }
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f55246m.mo78574g()) {
            savedState.f55264a = getError();
        }
        if (!m81495I() || !this.f55238d.isChecked()) {
            z = false;
        } else {
            z = true;
        }
        savedState.f55265b = z;
        return savedState;
    }

    /* renamed from: i */
    private void m81528i() {
        int i = this.f55221J;
        if (i == 0) {
            this.f55217F = null;
            this.f55218G = null;
        } else if (i == 1) {
            this.f55217F = new MaterialShapeDrawable(this.f55219H);
            this.f55218G = new MaterialShapeDrawable();
        } else if (i == 2) {
            if (!this.f55214C || (this.f55217F instanceof C22476c)) {
                this.f55217F = new MaterialShapeDrawable(this.f55219H);
            } else {
                this.f55217F = new C22476c(this.f55219H);
            }
            this.f55218G = null;
        } else {
            throw new IllegalArgumentException(this.f55221J + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m81497K() {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m81497K():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo78368c() {
        Drawable background;
        TextView textView;
        EditText editText = this.f55235a;
        if (editText != null && this.f55221J == 0 && (background = editText.getBackground()) != null) {
            if (C0460p.m2061c(background)) {
                background = background.mutate();
            }
            if (this.f55246m.mo78574g()) {
                background.setColorFilter(C0445f.m1907a(this.f55246m.mo78577j(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f55248o || (textView = this.f55249p) == null) {
                C0774a.m3778f(background);
                this.f55235a.refreshDrawableState();
            } else {
                background.setColorFilter(C0445f.m1907a(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo78375f() {
        boolean z;
        boolean z2;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f55217F != null && this.f55221J != 0) {
            boolean z3 = false;
            if (isFocused() || ((editText2 = this.f55235a) != null && editText2.hasFocus())) {
                z = true;
            } else {
                z = false;
            }
            if (isHovered() || ((editText = this.f55235a) != null && editText.isHovered())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!isEnabled()) {
                this.f55226O = this.aE;
            } else if (this.f55246m.mo78574g()) {
                if (this.az != null) {
                    m81522b(z, z2);
                } else {
                    this.f55226O = this.f55246m.mo78577j();
                }
            } else if (!this.f55248o || (textView = this.f55249p) == null) {
                if (z) {
                    this.f55226O = this.ay;
                } else if (z2) {
                    this.f55226O = this.ax;
                } else {
                    this.f55226O = this.aw;
                }
            } else if (this.az != null) {
                m81522b(z, z2);
            } else {
                this.f55226O = textView.getCurrentTextColor();
            }
            if (getErrorIconDrawable() != null && this.f55246m.mo78572e() && this.f55246m.mo78574g()) {
                z3 = true;
            }
            setErrorIconVisible(z3);
            m81512a(this.as, this.at);
            m81512a(this.f55232U, this.f55233V);
            m81512a(this.f55238d, this.aj);
            if (getEndIconDelegate().mo78541b()) {
                m81521b(this.f55246m.mo78574g());
            }
            if (!z || !isEnabled()) {
                this.f55223L = this.f55224M;
            } else {
                this.f55223L = this.f55225N;
            }
            if (this.f55221J == 1) {
                if (!isEnabled()) {
                    this.f55227P = this.aB;
                } else if (z2 && !z) {
                    this.f55227P = this.aD;
                } else if (z) {
                    this.f55227P = this.aC;
                } else {
                    this.f55227P = this.aA;
                }
            }
            m81487A();
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.aG = z;
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public static class C22462a extends C0859a {

        /* renamed from: a */
        private final TextInputLayout f55266a;

        public C22462a(TextInputLayout textInputLayout) {
            this.f55266a = textInputLayout;
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public void mo4535a(View view, C0864d dVar) {
            CharSequence charSequence;
            boolean z;
            String str;
            String str2;
            super.mo4535a(view, dVar);
            EditText editText = this.f55266a.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = this.f55266a.getHint();
            CharSequence helperText = this.f55266a.getHelperText();
            CharSequence error = this.f55266a.getError();
            int counterMaxLength = this.f55266a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f55266a.getCounterOverflowDescription();
            boolean z2 = !TextUtils.isEmpty(charSequence);
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !TextUtils.isEmpty(helperText);
            boolean z5 = !TextUtils.isEmpty(error);
            if (z5 || !TextUtils.isEmpty(counterOverflowDescription)) {
                z = true;
            } else {
                z = false;
            }
            if (z3) {
                str = hint.toString();
            } else {
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if ((z5 || z4) && !TextUtils.isEmpty(str)) {
                str2 = ", ";
            } else {
                str2 = "";
            }
            sb.append(str2);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            if (z5) {
                helperText = error;
            } else if (!z4) {
                helperText = "";
            }
            sb3.append((Object) helperText);
            String sb4 = sb3.toString();
            if (z2) {
                dVar.mo4575c(charSequence);
            } else if (!TextUtils.isEmpty(sb4)) {
                dVar.mo4575c(sb4);
            }
            if (!TextUtils.isEmpty(sb4)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    dVar.mo4585f(sb4);
                } else {
                    if (z2) {
                        sb4 = ((Object) charSequence) + ", " + sb4;
                    }
                    dVar.mo4575c(sb4);
                }
                dVar.mo4608o(!z2);
            }
            if (charSequence == null || charSequence.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            dVar.mo4571c(counterMaxLength);
            if (z) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                dVar.mo4588g(error);
            }
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public void setBoxStrokeWidth(int i) {
        this.f55224M = i;
        mo78375f();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f55225N = i;
        mo78375f();
    }

    public void setEnabled(boolean z) {
        m81511a(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f55238d.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f55238d.setCheckable(z);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f55238d.setImageDrawable(drawable);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m81513a(this.f55238d, onClickListener, this.aq);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.aq = onLongClickListener;
        m81514a(this.f55238d, onLongClickListener);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f55246m.mo78570c(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f55246m.mo78560a(z);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m81513a(this.as, onClickListener, this.ar);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.ar = onLongClickListener;
        m81514a(this.as, onLongClickListener);
    }

    public void setErrorTextAppearance(int i) {
        this.f55246m.mo78563b(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f55246m.mo78556a(colorStateList);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f55246m.mo78564b(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f55246m.mo78567b(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f55246m.mo78569c(i);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f55238d.setContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f55238d.setImageDrawable(drawable);
    }

    public void setPrefixTextAppearance(int i) {
        TextViewCompat.m4490a(this.f55259z, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f55259z.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f55232U.setCheckable(z);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m81513a(this.f55232U, onClickListener, this.ae);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.ae = onLongClickListener;
        m81514a(this.f55232U, onLongClickListener);
    }

    public void setSuffixTextAppearance(int i) {
        TextViewCompat.m4490a(this.f55213B, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f55213B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C22462a aVar) {
        EditText editText = this.f55235a;
        if (editText != null) {
            ViewCompat.m4043a(editText, aVar);
        }
    }

    /* renamed from: a */
    private void m81509a(Canvas canvas) {
        if (this.f55214C) {
            this.f55239e.mo77775a(canvas);
        }
    }

    /* renamed from: b */
    public void mo78366b(int i) {
        if (i != 0 || this.aF) {
            m81535p();
        } else {
            m81534o();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f55240f = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f55240f = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m81509a(canvas);
        m81519b(canvas);
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f55227P != i) {
            this.f55227P = i;
            this.aA = i;
            this.aC = i;
            this.aD = i;
            m81487A();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f55221J) {
            this.f55221J = i;
            if (this.f55235a != null) {
                m81527h();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.ay != i) {
            this.ay = i;
            mo78375f();
        }
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.az != colorStateList) {
            this.az = colorStateList;
            mo78375f();
        }
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f55250q != i) {
            this.f55250q = i;
            m81542w();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f55257x != colorStateList) {
            this.f55257x = colorStateList;
            m81542w();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f55251r != i) {
            this.f55251r = i;
            m81542w();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f55256w != colorStateList) {
            this.f55256w = colorStateList;
            m81542w();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.au = colorStateList;
        this.av = colorStateList;
        if (this.f55235a != null) {
            mo78363a(false);
        }
    }

    public void setEndIconContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setEndIconContentDescription(charSequence);
    }

    public void setEndIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0215a.m655b(getContext(), i);
        } else {
            drawable = null;
        }
        setEndIconDrawable(drawable);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.aj != colorStateList) {
            this.aj = colorStateList;
            this.ak = true;
            m81496J();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.al != mode) {
            this.al = mode;
            this.am = true;
            m81496J();
        }
    }

    public void setErrorIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0215a.m655b(getContext(), i);
        } else {
            drawable = null;
        }
        setErrorIconDrawable(drawable);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f55214C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setPasswordVisibilityToggleContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0215a.m655b(getContext(), i);
        } else {
            drawable = null;
        }
        setPasswordVisibilityToggleDrawable(drawable);
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.aj = colorStateList;
        this.ak = true;
        m81496J();
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.al = mode;
        this.am = true;
        m81496J();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f55255v = i;
        TextView textView = this.f55253t;
        if (textView != null) {
            TextViewCompat.m4490a(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f55254u != colorStateList) {
            this.f55254u = colorStateList;
            TextView textView = this.f55253t;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setStartIconContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0215a.m655b(getContext(), i);
        } else {
            drawable = null;
        }
        setStartIconDrawable(drawable);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f55233V != colorStateList) {
            this.f55233V = colorStateList;
            this.f55234W = true;
            m81494H();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.aa != mode) {
            this.aa = mode;
            this.ab = true;
            m81494H();
        }
    }

    /* renamed from: c */
    private void m81523c(int i) {
        Iterator<AbstractC22464c> it = this.f175436ai.iterator();
        while (it.hasNext()) {
            it.next().mo78521a(this, i);
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f55215D)) {
            this.f55215D = charSequence;
            this.f55239e.mo77779a(charSequence);
            if (!this.aF) {
                m81501O();
            }
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f55247n != i) {
            if (i > 0) {
                this.f55247n = i;
            } else {
                this.f55247n = -1;
            }
            if (this.f55236b) {
                m81532m();
            }
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f55238d.setContentDescription(charSequence);
        }
    }

    public void setEndIconVisible(boolean z) {
        int i;
        if (mo78374e() != z) {
            CheckableImageButton checkableImageButton = this.f55238d;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            m81541v();
            m81497K();
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        boolean z;
        this.as.setImageDrawable(drawable);
        if (drawable == null || !this.f55246m.mo78572e()) {
            z = false;
        } else {
            z = true;
        }
        setErrorIconVisible(z);
    }

    public void setHintTextAppearance(int i) {
        this.f55239e.mo77790c(i);
        this.av = this.f55239e.mo77805o();
        if (this.f55235a != null) {
            mo78363a(false);
            m81531l();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.av != colorStateList) {
            if (this.au == null) {
                this.f55239e.mo77774a(colorStateList);
            }
            this.av = colorStateList;
            if (this.f55235a != null) {
                mo78363a(false);
            }
        }
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.ag != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.f55237c || !TextUtils.isEmpty(charSequence)) {
            if (!this.f55237c) {
                setPlaceholderTextEnabled(true);
            }
            this.f55252s = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        m81533n();
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f55258y = charSequence2;
        this.f55259z.setText(charSequence);
        m81538s();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f55232U.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f55232U.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m81494H();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconVisible(boolean z) {
        int i;
        if (mo78369d() != z) {
            CheckableImageButton checkableImageButton = this.f55232U;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            m81539t();
            m81497K();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f55212A = charSequence2;
        this.f55213B.setText(charSequence);
        m81540u();
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f55231T) {
            this.f55231T = typeface;
            this.f55239e.mo77791c(typeface);
            this.f55246m.mo78557a(typeface);
            TextView textView = this.f55249p;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* renamed from: b */
    private Rect m81518b(Rect rect) {
        if (this.f55235a != null) {
            Rect rect2 = this.f55229R;
            float b = this.f55239e.mo77781b();
            rect2.left = rect.left + this.f55235a.getCompoundPaddingLeft();
            rect2.top = m81505a(rect, b);
            rect2.right = rect.right - this.f55235a.getCompoundPaddingRight();
            rect2.bottom = m81506a(rect, rect2, b);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    private void m81524c(Rect rect) {
        if (this.f55218G != null) {
            this.f55218G.setBounds(rect.left, rect.bottom - this.f55225N, rect.right, rect.bottom);
        }
    }

    /* renamed from: d */
    private void m81526d(boolean z) {
        ValueAnimator valueAnimator = this.aH;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.aH.cancel();
        }
        if (!z || !this.aG) {
            this.f55239e.mo77782b(BitmapDescriptorFactory.HUE_RED);
        } else {
            mo78358a(BitmapDescriptorFactory.HUE_RED);
        }
        if (m81500N() && ((C22476c) this.f55217F).mo77141a()) {
            m81502P();
        }
        this.aF = true;
        m81535p();
        m81538s();
        m81540u();
    }

    private void setErrorIconVisible(boolean z) {
        int i;
        CheckableImageButton checkableImageButton = this.as;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        FrameLayout frameLayout = this.f55244k;
        if (z) {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        m81541v();
        if (!m81495I()) {
            m81497K();
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f55237c != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f55253t = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_placeholder);
                ViewCompat.m4084h((View) this.f55253t, 1);
                setPlaceholderTextAppearance(this.f55255v);
                setPlaceholderTextColor(this.f55254u);
                m81536q();
            } else {
                m81537r();
                this.f55253t = null;
            }
            this.f55237c = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo4902a());
        setError(savedState.f55264a);
        if (savedState.f55265b) {
            this.f55238d.post(new Runnable() {
                /* class com.google.android.material.textfield.TextInputLayout.RunnableC224582 */

                public void run() {
                    TextInputLayout.this.f55238d.performClick();
                    TextInputLayout.this.f55238d.jumpDrawablesToCurrentState();
                }
            });
        }
        requestLayout();
    }

    public void setError(CharSequence charSequence) {
        if (!this.f55246m.mo78572e()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f55246m.mo78566b(charSequence);
        } else {
            this.f55246m.mo78562b();
        }
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.at = colorStateList;
        Drawable drawable = this.as.getDrawable();
        if (drawable != null) {
            drawable = C0774a.m3779g(drawable).mutate();
            C0774a.m3768a(drawable, colorStateList);
        }
        if (this.as.getDrawable() != drawable) {
            this.as.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.as.getDrawable();
        if (drawable != null) {
            drawable = C0774a.m3779g(drawable).mutate();
            C0774a.m3771a(drawable, mode);
        }
        if (this.as.getDrawable() != drawable) {
            this.as.setImageDrawable(drawable);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo78367b()) {
                setHelperTextEnabled(true);
            }
            this.f55246m.mo78559a(charSequence);
        } else if (mo78367b()) {
            setHelperTextEnabled(false);
        }
    }

    /* renamed from: b */
    private void m81519b(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable = this.f55218G;
        if (materialShapeDrawable != null) {
            Rect bounds = materialShapeDrawable.getBounds();
            bounds.top = bounds.bottom - this.f55223L;
            this.f55218G.draw(canvas);
        }
    }

    /* renamed from: c */
    private void m81525c(boolean z) {
        ValueAnimator valueAnimator = this.aH;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.aH.cancel();
        }
        if (!z || !this.aG) {
            this.f55239e.mo77782b(1.0f);
        } else {
            mo78358a(1.0f);
        }
        this.aF = false;
        if (m81500N()) {
            m81501O();
        }
        m81533n();
        m81538s();
        m81540u();
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.aA = defaultColor;
        this.f55227P = defaultColor;
        this.aB = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.aC = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.aD = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m81487A();
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.aw = colorStateList.getDefaultColor();
            this.aE = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.ax = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.ay = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.ay != colorStateList.getDefaultColor()) {
            this.ay = colorStateList.getDefaultColor();
        }
        mo78375f();
    }

    public void setCounterEnabled(boolean z) {
        if (this.f55236b != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f55249p = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.f55231T;
                if (typeface != null) {
                    this.f55249p.setTypeface(typeface);
                }
                this.f55249p.setMaxLines(1);
                this.f55246m.mo78558a(this.f55249p, 2);
                C0906h.m4356a((ViewGroup.MarginLayoutParams) this.f55249p.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                m81542w();
                m81532m();
            } else {
                this.f55246m.mo78565b(this.f55249p, 2);
                this.f55249p = null;
            }
            this.f55236b = z;
        }
    }

    public void setEndIconMode(int i) {
        boolean z;
        int i2 = this.ag;
        this.ag = i;
        m81523c(i2);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        setEndIconVisible(z);
        if (getEndIconDelegate().mo78538a(this.f55221J)) {
            getEndIconDelegate().mo78522a();
            m81496J();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f55221J + " is not supported by the end icon mode " + i);
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f55214C) {
            this.f55214C = z;
            if (!z) {
                this.f55216E = false;
                if (!TextUtils.isEmpty(this.f55215D) && TextUtils.isEmpty(this.f55235a.getHint())) {
                    this.f55235a.setHint(this.f55215D);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f55235a.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f55215D)) {
                        setHint(hint);
                    }
                    this.f55235a.setHint((CharSequence) null);
                }
                this.f55216E = true;
            }
            if (this.f55235a != null) {
                m81531l();
            }
        }
    }

    /* renamed from: a */
    private Rect m81507a(Rect rect) {
        boolean z;
        if (this.f55235a != null) {
            Rect rect2 = this.f55229R;
            if (ViewCompat.m4082h(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            rect2.bottom = rect.bottom;
            int i = this.f55221J;
            if (i == 1) {
                rect2.left = m81504a(rect.left, z);
                rect2.top = rect.top + this.f55222K;
                rect2.right = m81517b(rect.right, z);
                return rect2;
            } else if (i != 2) {
                rect2.left = m81504a(rect.left, z);
                rect2.top = getPaddingTop();
                rect2.right = m81517b(rect.right, z);
                return rect2;
            } else {
                rect2.left = rect.left + this.f55235a.getPaddingLeft();
                rect2.top = rect.top - m81543x();
                rect2.right = rect.right - this.f55235a.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    private void setEditText(EditText editText) {
        if (this.f55235a == null) {
            if (this.ag != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f55235a = editText;
            m81527h();
            setTextInputAccessibilityDelegate(new C22462a(this));
            this.f55239e.mo77791c(this.f55235a.getTypeface());
            this.f55239e.mo77770a(this.f55235a.getTextSize());
            int gravity = this.f55235a.getGravity();
            this.f55239e.mo77783b((gravity & -113) | 48);
            this.f55239e.mo77771a(gravity);
            this.f55235a.addTextChangedListener(new TextWatcher() {
                /* class com.google.android.material.textfield.TextInputLayout.C224571 */

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void afterTextChanged(Editable editable) {
                    TextInputLayout textInputLayout = TextInputLayout.this;
                    textInputLayout.mo78363a(!textInputLayout.f55240f);
                    if (TextInputLayout.this.f55236b) {
                        TextInputLayout.this.mo78359a(editable.length());
                    }
                    if (TextInputLayout.this.f55237c) {
                        TextInputLayout.this.mo78366b(editable.length());
                    }
                }
            });
            if (this.au == null) {
                this.au = this.f55235a.getHintTextColors();
            }
            if (this.f55214C) {
                if (TextUtils.isEmpty(this.f55215D)) {
                    CharSequence hint = this.f55235a.getHint();
                    this.f55245l = hint;
                    setHint(hint);
                    this.f55235a.setHint((CharSequence) null);
                }
                this.f55216E = true;
            }
            if (this.f55249p != null) {
                mo78359a(this.f55235a.getText().length());
            }
            mo78368c();
            this.f55246m.mo78571d();
            this.f55242i.bringToFront();
            this.f55243j.bringToFront();
            this.f55244k.bringToFront();
            this.as.bringToFront();
            m81493G();
            m81539t();
            m81541v();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m81516a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    /* renamed from: b */
    private void m81521b(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m81496J();
            return;
        }
        Drawable mutate = C0774a.m3779g(getEndIconDrawable()).mutate();
        C0774a.m3766a(mutate, this.f55246m.mo78577j());
        this.f55238d.setImageDrawable(mutate);
    }

    /* renamed from: a */
    private void m81510a(RectF rectF) {
        rectF.left -= (float) this.f55220I;
        rectF.top -= (float) this.f55220I;
        rectF.right += (float) this.f55220I;
        rectF.bottom += (float) this.f55220I;
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    /* renamed from: a */
    private int m81504a(int i, boolean z) {
        int compoundPaddingLeft = i + this.f55235a.getCompoundPaddingLeft();
        if (this.f55258y == null || z) {
            return compoundPaddingLeft;
        }
        return (compoundPaddingLeft - this.f55259z.getMeasuredWidth()) + this.f55259z.getPaddingLeft();
    }

    /* renamed from: b */
    private int m81517b(int i, boolean z) {
        int compoundPaddingRight = i - this.f55235a.getCompoundPaddingRight();
        if (this.f55258y == null || !z) {
            return compoundPaddingRight;
        }
        return compoundPaddingRight + (this.f55259z.getMeasuredWidth() - this.f55259z.getPaddingRight());
    }

    /* renamed from: a */
    private int m81505a(Rect rect, float f) {
        if (m81544y()) {
            return (int) (((float) rect.centerY()) - (f / 2.0f));
        }
        return rect.top + this.f55235a.getCompoundPaddingTop();
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f55245l == null || (editText = this.f55235a) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f55216E;
        this.f55216E = false;
        CharSequence hint = editText.getHint();
        this.f55235a.setHint(this.f55245l);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f55235a.setHint(hint);
            this.f55216E = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean E = m81491E();
        boolean K = m81497K();
        if (E || K) {
            this.f55235a.post(new Runnable() {
                /* class com.google.android.material.textfield.TextInputLayout.RunnableC224593 */

                public void run() {
                    TextInputLayout.this.f55235a.requestLayout();
                }
            });
        }
        m81492F();
        m81539t();
        m81541v();
    }

    /* renamed from: b */
    private static void m81520b(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean J = ViewCompat.m4016J(checkableImageButton);
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (J || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(J);
        checkableImageButton.setPressable(J);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        ViewCompat.m4069d((View) checkableImageButton, i);
    }

    /* renamed from: b */
    private void m81522b(boolean z, boolean z2) {
        int defaultColor = this.az.getDefaultColor();
        int colorForState = this.az.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.az.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f55226O = colorForState2;
        } else if (z2) {
            this.f55226O = colorForState;
        } else {
            this.f55226O = defaultColor;
        }
    }

    /* renamed from: a */
    private static void m81511a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m81511a((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: a */
    private static void m81513a(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m81520b(checkableImageButton, onLongClickListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f55241h.addView(view, layoutParams2);
            this.f55241h.setLayoutParams(layoutParams);
            m81531l();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: a */
    private int m81506a(Rect rect, Rect rect2, float f) {
        if (m81544y()) {
            return (int) (((float) rect2.top) + f);
        }
        return rect.bottom - this.f55235a.getCompoundPaddingBottom();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r28, android.util.AttributeSet r29, int r30) {
        /*
        // Method dump skipped, instructions count: 1618
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f55235a;
        if (editText != null) {
            Rect rect = this.f55228Q;
            C22331c.m80913b(this, editText, rect);
            m81524c(rect);
            if (this.f55214C) {
                this.f55239e.mo77770a(this.f55235a.getTextSize());
                int gravity = this.f55235a.getGravity();
                this.f55239e.mo77783b((gravity & -113) | 48);
                this.f55239e.mo77771a(gravity);
                this.f55239e.mo77787b(m81507a(rect));
                this.f55239e.mo77776a(m81518b(rect));
                this.f55239e.mo77802l();
                if (m81500N() && !this.aF) {
                    m81501O();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m81508a(Context context, TextView textView, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = R.string.character_counter_overflowed_content_description;
        } else {
            i3 = R.string.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i3, Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
