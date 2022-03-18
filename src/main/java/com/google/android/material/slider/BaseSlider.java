package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.p028b.C0745a;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.customview.p030a.AbstractC0951a;
import com.google.android.material.internal.AbstractC22364q;
import com.google.android.material.internal.C22331c;
import com.google.android.material.internal.C22358l;
import com.google.android.material.internal.C22365r;
import com.google.android.material.p984e.C22269a;
import com.google.android.material.p988i.C22313c;
import com.google.android.material.p991l.C22378a;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.slider.AbstractC22419a;
import com.google.android.material.slider.AbstractC22420b;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.p992a.C22497a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends AbstractC22419a<S>, T extends AbstractC22420b<S>> extends View {

    /* renamed from: a */
    public static final int Widget_MaterialComponents_Slider = 2131887391;

    /* renamed from: c */
    private static final String f54986c = "BaseSlider";

    /* renamed from: A */
    private AbstractC22421c f54987A;

    /* renamed from: B */
    private boolean f54988B;

    /* renamed from: C */
    private float f54989C;

    /* renamed from: D */
    private float f54990D;

    /* renamed from: E */
    private ArrayList<Float> f54991E;

    /* renamed from: F */
    private int f54992F;

    /* renamed from: G */
    private int f54993G;

    /* renamed from: H */
    private float f54994H;

    /* renamed from: I */
    private float[] f54995I;

    /* renamed from: J */
    private int f54996J;

    /* renamed from: K */
    private boolean f54997K;

    /* renamed from: L */
    private boolean f54998L;

    /* renamed from: M */
    private boolean f54999M;

    /* renamed from: N */
    private ColorStateList f55000N;

    /* renamed from: O */
    private ColorStateList f55001O;

    /* renamed from: P */
    private ColorStateList f55002P;

    /* renamed from: Q */
    private ColorStateList f55003Q;

    /* renamed from: R */
    private ColorStateList f55004R;

    /* renamed from: S */
    private final MaterialShapeDrawable f55005S;

    /* renamed from: T */
    private float f55006T;

    /* renamed from: b */
    public final C22417b f55007b;

    /* renamed from: d */
    private final Paint f55008d;

    /* renamed from: e */
    private final Paint f55009e;

    /* renamed from: f */
    private final Paint f55010f;

    /* renamed from: g */
    private final Paint f55011g;

    /* renamed from: h */
    private final Paint f55012h;

    /* renamed from: i */
    private final Paint f55013i;

    /* renamed from: j */
    private final AccessibilityManager f55014j;

    /* renamed from: k */
    private BaseSlider<S, L, T>.RunnableC22416a f55015k;

    /* renamed from: l */
    private final AbstractC22418c f55016l;

    /* renamed from: m */
    private final List<C22378a> f55017m;

    /* renamed from: n */
    private final List<L> f55018n;

    /* renamed from: o */
    private final List<T> f55019o;

    /* renamed from: p */
    private final int f55020p;

    /* renamed from: q */
    private int f55021q;

    /* renamed from: r */
    private int f55022r;

    /* renamed from: s */
    private int f55023s;

    /* renamed from: t */
    private int f55024t;

    /* renamed from: u */
    private int f55025u;

    /* renamed from: v */
    private int f55026v;

    /* renamed from: w */
    private int f55027w;

    /* renamed from: x */
    private int f55028x;

    /* renamed from: y */
    private float f55029y;

    /* renamed from: z */
    private MotionEvent f55030z;

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.slider.BaseSlider$c */
    public interface AbstractC22418c {
        /* renamed from: a */
        C22378a mo78135a();
    }

    public int getActiveThumbIndex() {
        return this.f54992F;
    }

    public int getFocusedThumbIndex() {
        return this.f54993G;
    }

    public int getHaloRadius() {
        return this.f55027w;
    }

    public ColorStateList getHaloTintList() {
        return this.f55000N;
    }

    public int getLabelBehavior() {
        return this.f55022r;
    }

    public float getStepSize() {
        return this.f54994H;
    }

    public int getThumbRadius() {
        return this.f55026v;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f55001O;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f55002P;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f55003Q;
    }

    public int getTrackHeight() {
        return this.f55023s;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f55004R;
    }

    public int getTrackSidePadding() {
        return this.f55024t;
    }

    public int getTrackWidth() {
        return this.f54996J;
    }

    public float getValueFrom() {
        return this.f54989C;
    }

    public float getValueTo() {
        return this.f54990D;
    }

    /* renamed from: a */
    public boolean mo78068a() {
        return this.f54987A != null;
    }

    /* renamed from: a */
    public boolean mo78069a(int i, float f) {
        if (((double) Math.abs(f - this.f54991E.get(i).floatValue())) < 1.0E-4d) {
            return false;
        }
        this.f54991E.set(i, Float.valueOf(m81270b(i, f)));
        this.f54993G = i;
        m81271b(i);
        return true;
    }

    /* renamed from: a */
    public String mo78066a(float f) {
        if (mo78068a()) {
            return this.f54987A.mo78148a(f);
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    /* renamed from: a */
    private void m81269a(C22378a aVar, float f) {
        aVar.mo77897a(mo78066a(f));
        int c = (this.f55024t + ((int) (m81275c(f) * ((float) this.f54996J)))) - (aVar.getIntrinsicWidth() / 2);
        int m = m81294m() - (this.f55028x + this.f55026v);
        aVar.setBounds(c, m - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + c, m);
        Rect rect = new Rect(aVar.getBounds());
        C22331c.m80911a(C22365r.m81029f(this), this, rect);
        aVar.setBounds(rect);
        C22365r.m81030g(this).mo77864a(aVar);
    }

    /* renamed from: a */
    public float mo78065a(int i) {
        float v = m81303v();
        float f = (this.f54990D - this.f54989C) / v;
        float f2 = (float) i;
        if (f <= f2) {
            return v;
        }
        return ((float) Math.round(f / f2)) * v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78067a(int i, Rect rect) {
        int c = this.f55024t + ((int) (m81275c(getValues().get(i).floatValue()) * ((float) this.f54996J)));
        int m = m81294m();
        int i2 = this.f55026v;
        rect.set(c - i2, m - i2, c + i2, m + i2);
    }

    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    /* access modifiers changed from: package-private */
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f55007b.mo4848b();
    }

    public float getThumbElevation() {
        return this.f55005S.mo77954S();
    }

    public ColorStateList getThumbTintList() {
        return this.f55005S.mo77948M();
    }

    /* access modifiers changed from: package-private */
    public List<Float> getValues() {
        return new ArrayList(this.f54991E);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.slider.BaseSlider$a */
    public class RunnableC22416a implements Runnable {

        /* renamed from: a */
        int f55039a;

        public void run() {
            BaseSlider.this.f55007b.mo4844a(this.f55039a, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo78141a(int i) {
            this.f55039a = i;
        }

        private RunnableC22416a() {
            this.f55039a = -1;
        }
    }

    /* renamed from: o */
    private boolean m81296o() {
        return m81283e(getValueOfTouchPosition());
    }

    /* renamed from: v */
    private float m81303v() {
        float f = this.f54994H;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo78072d() {
        if (ViewCompat.m4082h(this) == 1) {
            return true;
        }
        return false;
    }

    private float getValueOfTouchPosition() {
        double d = m81278d(this.f55006T);
        if (mo78072d()) {
            d = 1.0d - d;
        }
        float f = this.f54990D;
        float f2 = this.f54989C;
        return (float) ((d * ((double) (f - f2))) + ((double) f2));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.f55006T;
        if (mo78072d()) {
            f = 1.0f - f;
        }
        float f2 = this.f54990D;
        float f3 = this.f54989C;
        return (f * (f2 - f3)) + f3;
    }

    /* renamed from: j */
    private void m81291j() {
        if (this.f54999M) {
            m81282e();
            m81285f();
            m81287g();
            m81289h();
            m81290i();
            this.f54999M = false;
        }
    }

    /* renamed from: m */
    private int m81294m() {
        int i = this.f55025u;
        int i2 = 0;
        if (this.f55022r == 1) {
            i2 = this.f55017m.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    /* renamed from: n */
    private boolean m81295n() {
        if (this.f54997K || Build.VERSION.SDK_INT < 21 || !(getBackground() instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private boolean m81299r() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    private void m81301t() {
        for (T t : this.f55019o) {
            t.mo78146a(this);
        }
    }

    /* renamed from: u */
    private void m81302u() {
        for (T t : this.f55019o) {
            t.mo78147b(this);
        }
    }

    public ColorStateList getTickTintList() {
        if (this.f55002P.equals(this.f55001O)) {
            return this.f55001O;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackTintList() {
        if (this.f55004R.equals(this.f55003Q)) {
            return this.f55003Q;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (C22378a aVar : this.f55017m) {
            m81268a(aVar);
        }
    }

    /* renamed from: e */
    private void m81282e() {
        if (this.f54989C >= this.f54990D) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.toString(this.f54989C), Float.toString(this.f54990D)));
        }
    }

    /* renamed from: f */
    private void m81285f() {
        if (this.f54990D <= this.f54989C) {
            throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.toString(this.f54990D), Float.toString(this.f54989C)));
        }
    }

    /* renamed from: g */
    private void m81287g() {
        if (this.f54994H > BitmapDescriptorFactory.HUE_RED && !m81274b(this.f54990D)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.toString(this.f54994H), Float.toString(this.f54989C), Float.toString(this.f54990D)));
        }
    }

    /* renamed from: q */
    private void m81298q() {
        this.f55008d.setStrokeWidth((float) this.f55023s);
        this.f55009e.setStrokeWidth((float) this.f55023s);
        this.f55012h.setStrokeWidth(((float) this.f55023s) / 2.0f);
        this.f55013i.setStrokeWidth(((float) this.f55023s) / 2.0f);
    }

    /* renamed from: s */
    private void m81300s() {
        for (L l : this.f55018n) {
            Iterator<Float> it = this.f54991E.iterator();
            while (it.hasNext()) {
                l.mo78145a(this, it.next().floatValue(), false);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.RunnableC22416a aVar = this.f55015k;
        if (aVar != null) {
            removeCallbacks(aVar);
        }
        for (C22378a aVar2 : this.f55017m) {
            m81273b(aVar2);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f55034a = this.f54989C;
        sliderState.f55035b = this.f54990D;
        sliderState.f55036c = new ArrayList<>(this.f54991E);
        sliderState.f55037d = this.f54994H;
        sliderState.f55038e = hasFocus();
        return sliderState;
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f54991E.size() == 1) {
            floatValue2 = this.f54989C;
        }
        float c = m81275c(floatValue2);
        float c2 = m81275c(floatValue);
        if (mo78072d()) {
            return new float[]{c2, c};
        }
        return new float[]{c, c2};
    }

    /* renamed from: i */
    private void m81290i() {
        float f = this.f54994H;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (((float) ((int) f)) != f) {
                Log.w(f54986c, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "stepSize", Float.valueOf(f)));
            }
            float f2 = this.f54989C;
            if (((float) ((int) f2)) != f2) {
                Log.w(f54986c, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "valueFrom", Float.valueOf(f2)));
            }
            float f3 = this.f54990D;
            if (((float) ((int) f3)) != f3) {
                Log.w(f54986c, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", "valueTo", Float.valueOf(f3)));
            }
        }
    }

    /* renamed from: l */
    private void m81293l() {
        m81291j();
        int min = Math.min((int) (((this.f54990D - this.f54989C) / this.f54994H) + 1.0f), (this.f54996J / (this.f55023s * 2)) + 1);
        float[] fArr = this.f54995I;
        if (fArr == null || fArr.length != min * 2) {
            this.f54995I = new float[(min * 2)];
        }
        float f = ((float) this.f54996J) / ((float) (min - 1));
        for (int i = 0; i < min * 2; i += 2) {
            float[] fArr2 = this.f54995I;
            fArr2[i] = ((float) this.f55024t) + (((float) (i / 2)) * f);
            fArr2[i + 1] = (float) m81294m();
        }
    }

    /* renamed from: p */
    private void m81297p() {
        if (this.f55022r != 2) {
            Iterator<C22378a> it = this.f55017m.iterator();
            for (int i = 0; i < this.f54991E.size() && it.hasNext(); i++) {
                if (i != this.f54993G) {
                    m81269a(it.next(), this.f54991E.get(i).floatValue());
                }
            }
            if (it.hasNext()) {
                m81269a(it.next(), this.f54991E.get(this.f54993G).floatValue());
            } else {
                throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f55017m.size()), Integer.valueOf(this.f54991E.size())));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f55008d.setColor(m81260a(this.f55004R));
        this.f55009e.setColor(m81260a(this.f55003Q));
        this.f55012h.setColor(m81260a(this.f55002P));
        this.f55013i.setColor(m81260a(this.f55001O));
        for (C22378a aVar : this.f55017m) {
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        if (this.f55005S.isStateful()) {
            this.f55005S.setState(getDrawableState());
        }
        this.f55011g.setColor(m81260a(this.f55000N));
        this.f55011g.setAlpha(63);
    }

    /* renamed from: h */
    private void m81289h() {
        Iterator<Float> it = this.f54991E.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.f54989C || next.floatValue() > this.f54990D) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", Float.toString(next.floatValue()), Float.toString(this.f54989C), Float.toString(this.f54990D)));
            } else if (this.f54994H > BitmapDescriptorFactory.HUE_RED && !m81274b(next.floatValue())) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", Float.toString(next.floatValue()), Float.toString(this.f54989C), Float.toString(this.f54994H), Float.toString(this.f54994H)));
            }
        }
    }

    /* renamed from: k */
    private void m81292k() {
        if (this.f55017m.size() > this.f54991E.size()) {
            List<C22378a> subList = this.f55017m.subList(this.f54991E.size(), this.f55017m.size());
            for (C22378a aVar : subList) {
                if (ViewCompat.m4015I(this)) {
                    m81273b(aVar);
                }
            }
            subList.clear();
        }
        while (this.f55017m.size() < this.f54991E.size()) {
            C22378a a = this.f55016l.mo78135a();
            this.f55017m.add(a);
            if (ViewCompat.m4015I(this)) {
                m81268a(a);
            }
        }
        int i = 1;
        if (this.f55017m.size() == 1) {
            i = 0;
        }
        for (C22378a aVar2 : this.f55017m) {
            aVar2.mo77981n((float) i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo78071c() {
        boolean z;
        if (this.f54992F != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float f = m81284f(valueOfTouchPositionAbsolute);
        this.f54992F = 0;
        float abs = Math.abs(this.f54991E.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.f54991E.size(); i++) {
            float abs2 = Math.abs(this.f54991E.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float f2 = m81284f(this.f54991E.get(i).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!mo78072d() ? f2 - f >= BitmapDescriptorFactory.HUE_RED : f2 - f <= BitmapDescriptorFactory.HUE_RED) {
                z = false;
            } else {
                z = true;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.f54992F = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(f2 - f) < ((float) this.f55020p)) {
                    this.f54992F = -1;
                    return false;
                } else if (z) {
                    this.f54992F = i;
                }
            }
            abs = abs2;
        }
        if (this.f54992F != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo78070b() {
        if (!m81295n() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int c = (int) ((m81275c(this.f54991E.get(this.f54993G).floatValue()) * ((float) this.f54996J)) + ((float) this.f55024t));
                int m = m81294m();
                int i = this.f55027w;
                C0774a.m3767a(background, c - i, m - i, c + i, m + i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setActiveThumbIndex(int i) {
        this.f54992F = i;
    }

    public void setLabelFormatter(AbstractC22421c cVar) {
        this.f54987A = cVar;
    }

    /* access modifiers changed from: package-private */
    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() {
            /* class com.google.android.material.slider.BaseSlider.SliderState.C224151 */

            /* renamed from: a */
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }

            /* renamed from: a */
            public SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel);
            }
        };

        /* renamed from: a */
        float f55034a;

        /* renamed from: b */
        float f55035b;

        /* renamed from: c */
        ArrayList<Float> f55036c;

        /* renamed from: d */
        float f55037d;

        /* renamed from: e */
        boolean f55038e;

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(Parcel parcel) {
            super(parcel);
            this.f55034a = parcel.readFloat();
            this.f55035b = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f55036c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f55037d = parcel.readFloat();
            this.f55038e = parcel.createBooleanArray()[0];
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f55034a);
            parcel.writeFloat(this.f55035b);
            parcel.writeList(this.f55036c);
            parcel.writeFloat(this.f55037d);
            parcel.writeBooleanArray(new boolean[]{this.f55038e});
        }
    }

    public BaseSlider(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m81268a(C22378a aVar) {
        aVar.mo77895a(C22365r.m81029f(this));
    }

    /* renamed from: e */
    private boolean m81283e(float f) {
        return mo78069a(this.f54992F, f);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setThumbElevation(float f) {
        this.f55005S.mo77985r(f);
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f55005S.mo77973g(colorStateList);
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$b */
    private static class C22417b extends AbstractC0951a {

        /* renamed from: c */
        Rect f55041c = new Rect();

        /* renamed from: d */
        private final BaseSlider<?, ?, ?> f55042d;

        C22417b(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f55042d = baseSlider;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.customview.p030a.AbstractC0951a
        /* renamed from: a */
        public void mo4842a(List<Integer> list) {
            for (int i = 0; i < this.f55042d.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        /* renamed from: e */
        private String m81316e(int i) {
            if (i == this.f55042d.getValues().size() - 1) {
                return this.f55042d.getContext().getString(R.string.material_slider_range_end);
            }
            if (i == 0) {
                return this.f55042d.getContext().getString(R.string.material_slider_range_start);
            }
            return "";
        }

        /* access modifiers changed from: protected */
        @Override // androidx.customview.p030a.AbstractC0951a
        /* renamed from: a */
        public int mo4835a(float f, float f2) {
            for (int i = 0; i < this.f55042d.getValues().size(); i++) {
                this.f55042d.mo78067a(i, this.f55041c);
                if (this.f55041c.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.customview.p030a.AbstractC0951a
        /* renamed from: a */
        public void mo4838a(int i, C0864d dVar) {
            dVar.mo4555a(C0864d.C0865a.f3365H);
            List<Float> values = this.f55042d.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.f55042d.getValueFrom();
            float valueTo = this.f55042d.getValueTo();
            if (this.f55042d.isEnabled()) {
                if (floatValue > valueFrom) {
                    dVar.mo4552a(8192);
                }
                if (floatValue < valueTo) {
                    dVar.mo4552a(4096);
                }
            }
            dVar.mo4556a(C0864d.C0868d.m4259a(1, valueFrom, valueTo, floatValue));
            dVar.mo4566b((CharSequence) SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f55042d.getContentDescription() != null) {
                sb.append(this.f55042d.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(m81316e(i));
                sb.append(this.f55042d.mo78066a(floatValue));
            }
            dVar.mo4582e(sb.toString());
            this.f55042d.mo78067a(i, this.f55041c);
            dVar.mo4563b(this.f55041c);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.customview.p030a.AbstractC0951a
        /* renamed from: b */
        public boolean mo4851b(int i, int i2, Bundle bundle) {
            if (!this.f55042d.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float a = this.f55042d.mo78065a(20);
                if (i2 == 8192) {
                    a = -a;
                }
                if (this.f55042d.mo78072d()) {
                    a = -a;
                }
                if (!this.f55042d.mo78069a(i, C0745a.m3626a(this.f55042d.getValues().get(i).floatValue() + a, this.f55042d.getValueFrom(), this.f55042d.getValueTo()))) {
                    return false;
                }
                this.f55042d.mo78070b();
                this.f55042d.postInvalidate();
                mo4836a(i);
                return true;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                if (this.f55042d.mo78069a(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                    this.f55042d.mo78070b();
                    this.f55042d.postInvalidate();
                    mo4836a(i);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    private int m81260a(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* renamed from: f */
    private float m81284f(float f) {
        return (m81275c(f) * ((float) this.f54996J)) + ((float) this.f55024t);
    }

    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 2;
        }
        setLayerType(i, null);
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setLabelBehavior(int i) {
        if (this.f55022r != i) {
            this.f55022r = i;
            requestLayout();
        }
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setTrackHeight(int i) {
        if (this.f55023s != i) {
            this.f55023s = i;
            m81298q();
            postInvalidate();
        }
    }

    public void setValueFrom(float f) {
        this.f54989C = f;
        this.f54999M = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f54990D = f;
        this.f54999M = true;
        postInvalidate();
    }

    /* access modifiers changed from: package-private */
    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    /* renamed from: c */
    private float m81275c(float f) {
        float f2 = this.f54989C;
        float f3 = (f - f2) / (this.f54990D - f2);
        if (mo78072d()) {
            return 1.0f - f3;
        }
        return f3;
    }

    /* renamed from: d */
    private double m81278d(float f) {
        float f2 = this.f54994H;
        if (f2 <= BitmapDescriptorFactory.HUE_RED) {
            return (double) f;
        }
        int i = (int) ((this.f54990D - this.f54989C) / f2);
        return ((double) Math.round(f * ((float) i))) / ((double) i);
    }

    /* renamed from: g */
    private void m81288g(int i) {
        BaseSlider<S, L, T>.RunnableC22416a aVar = this.f55015k;
        if (aVar == null) {
            this.f55015k = new RunnableC22416a();
        } else {
            removeCallbacks(aVar);
        }
        this.f55015k.mo78141a(i);
        postDelayed(this.f55015k, 200);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f55007b.mo4847a(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f54991E.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f54993G = i;
        this.f55007b.mo4853c(i);
        postInvalidate();
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f55001O)) {
            this.f55001O = colorStateList;
            this.f55013i.setColor(m81260a(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f55002P)) {
            this.f55002P = colorStateList;
            this.f55012h.setColor(m81260a(colorStateList));
            invalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f55003Q)) {
            this.f55003Q = colorStateList;
            this.f55009e.setColor(m81260a(colorStateList));
            invalidate();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f55004R)) {
            this.f55004R = colorStateList;
            this.f55008d.setColor(m81260a(colorStateList));
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    /* renamed from: c */
    private boolean m81277c(int i) {
        int i2 = this.f54993G;
        int a = (int) C0745a.m3628a(((long) i2) + ((long) i), 0L, (long) (this.f54991E.size() - 1));
        this.f54993G = a;
        if (a == i2) {
            return false;
        }
        if (this.f54992F != -1) {
            this.f54992F = a;
        }
        mo78070b();
        postInvalidate();
        return true;
    }

    /* renamed from: d */
    private boolean m81280d(int i) {
        if (mo78072d()) {
            if (i == Integer.MIN_VALUE) {
                i = Integer.MAX_VALUE;
            } else {
                i = -i;
            }
        }
        return m81277c(i);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f54991E.size() != arrayList.size() || !this.f54991E.equals(arrayList)) {
                this.f54991E = arrayList;
                this.f54999M = true;
                this.f54993G = 0;
                mo78070b();
                m81292k();
                m81300s();
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f54989C = sliderState.f55034a;
        this.f54990D = sliderState.f55035b;
        setValuesInternal(sliderState.f55036c);
        this.f54994H = sliderState.f55037d;
        if (sliderState.f55038e) {
            requestFocus();
        }
        m81300s();
    }

    public void setHaloRadius(int i) {
        if (i != this.f55027w) {
            this.f55027w = i;
            Drawable background = getBackground();
            if (m81295n() || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                C22269a.m80566a((RippleDrawable) background, this.f55027w);
            }
        }
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f55000N)) {
            this.f55000N = colorStateList;
            Drawable background = getBackground();
            if (m81295n() || !(background instanceof RippleDrawable)) {
                this.f55011g.setColor(m81260a(colorStateList));
                this.f55011g.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setStepSize(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.toString(f), Float.toString(this.f54989C), Float.toString(this.f54990D)));
        } else if (this.f54994H != f) {
            this.f54994H = f;
            this.f54999M = true;
            postInvalidate();
        }
    }

    public void setThumbRadius(int i) {
        if (i != this.f55026v) {
            this.f55026v = i;
            this.f55005S.setShapeAppearanceModel(C22398l.m81156a().mo78019a(0, (float) this.f55026v).mo78024a());
            MaterialShapeDrawable materialShapeDrawable = this.f55005S;
            int i2 = this.f55026v;
            materialShapeDrawable.setBounds(0, 0, i2 * 2, i2 * 2);
            postInvalidate();
        }
    }

    /* renamed from: b */
    private void m81271b(int i) {
        for (L l : this.f55018n) {
            l.mo78145a(this, this.f54991E.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f55014j;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            m81288g(i);
        }
    }

    /* renamed from: e */
    private Float m81281e(int i) {
        float f;
        if (this.f54998L) {
            f = mo78065a(20);
        } else {
            f = m81303v();
        }
        if (i == 21) {
            if (!mo78072d()) {
                f = -f;
            }
            return Float.valueOf(f);
        } else if (i == 22) {
            if (mo78072d()) {
                f = -f;
            }
            return Float.valueOf(f);
        } else if (i == 69) {
            return Float.valueOf(-f);
        } else {
            if (i == 70 || i == 81) {
                return Float.valueOf(f);
            }
            return null;
        }
    }

    /* renamed from: f */
    private void m81286f(int i) {
        if (i == 1) {
            m81277c(Integer.MAX_VALUE);
        } else if (i == 2) {
            m81277c(Integer.MIN_VALUE);
        } else if (i == 17) {
            m81280d(Integer.MAX_VALUE);
        } else if (i == 66) {
            m81280d(Integer.MIN_VALUE);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f54999M) {
            m81291j();
            if (this.f54994H > BitmapDescriptorFactory.HUE_RED) {
                m81293l();
            }
        }
        super.onDraw(canvas);
        int m = m81294m();
        m81267a(canvas, this.f54996J, m);
        if (((Float) Collections.max(getValues())).floatValue() > this.f54989C) {
            m81272b(canvas, this.f54996J, m);
        }
        if (this.f54994H > BitmapDescriptorFactory.HUE_RED) {
            m81266a(canvas);
        }
        if ((this.f54988B || isFocused()) && isEnabled()) {
            m81279d(canvas, this.f54996J, m);
            if (this.f54992F != -1) {
                m81297p();
            }
        }
        m81276c(canvas, this.f54996J, m);
    }

    /* renamed from: a */
    private void m81265a(Resources resources) {
        this.f55021q = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        this.f55024t = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f55025u = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_top);
        this.f55028x = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
    }

    /* renamed from: b */
    private void m81273b(C22378a aVar) {
        AbstractC22364q g = C22365r.m81030g(this);
        if (g != null) {
            g.mo77865b(aVar);
            aVar.mo77898b(C22365r.m81029f(this));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - ((float) this.f55024t)) / ((float) this.f54996J);
        this.f55006T = f;
        float max = Math.max((float) BitmapDescriptorFactory.HUE_RED, f);
        this.f55006T = max;
        this.f55006T = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f55029y = x;
            if (!m81299r()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo78071c()) {
                    requestFocus();
                    this.f54988B = true;
                    m81296o();
                    mo78070b();
                    invalidate();
                    m81301t();
                }
            }
        } else if (actionMasked == 1) {
            this.f54988B = false;
            MotionEvent motionEvent2 = this.f55030z;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f55030z.getX() - motionEvent.getX()) <= ((float) this.f55020p) && Math.abs(this.f55030z.getY() - motionEvent.getY()) <= ((float) this.f55020p)) {
                mo78071c();
            }
            if (this.f54992F != -1) {
                m81296o();
                this.f54992F = -1;
            }
            for (C22378a aVar : this.f55017m) {
                C22365r.m81030g(this).mo77865b(aVar);
            }
            m81302u();
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.f54988B) {
                if (Math.abs(x - this.f55029y) < ((float) this.f55020p)) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m81301t();
            }
            if (mo78071c()) {
                this.f54988B = true;
                m81296o();
                mo78070b();
                invalidate();
            }
        }
        setPressed(this.f54988B);
        this.f55030z = MotionEvent.obtain(motionEvent);
        return true;
    }

    /* renamed from: b */
    private boolean m81274b(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.f54989C))).divide(new BigDecimal(Float.toString(this.f54994H)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m81266a(Canvas canvas) {
        float[] activeRange = getActiveRange();
        int a = m81261a(this.f54995I, activeRange[0]);
        int a2 = m81261a(this.f54995I, activeRange[1]);
        int i = a * 2;
        canvas.drawPoints(this.f54995I, 0, i, this.f55012h);
        int i2 = a2 * 2;
        canvas.drawPoints(this.f54995I, i, i2 - i, this.f55013i);
        float[] fArr = this.f54995I;
        canvas.drawPoints(fArr, i2, fArr.length - i2, this.f55012h);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f54998L = false;
        return super.onKeyUp(i, keyEvent);
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    /* renamed from: a */
    private static int m81261a(float[] fArr, float f) {
        return Math.round(f * ((float) ((fArr.length / 2) - 1)));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f55021q;
        int i4 = 0;
        if (this.f55022r == 1) {
            i4 = this.f55017m.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    /* renamed from: a */
    public static C22378a m81262a(Context context, TypedArray typedArray) {
        return C22378a.m81050a(context, (AttributeSet) null, 0, typedArray.getResourceId(8, 2131887415));
    }

    /* renamed from: b */
    private float m81270b(int i, float f) {
        float f2;
        float f3;
        int i2 = i + 1;
        if (i2 >= this.f54991E.size()) {
            f2 = this.f54990D;
        } else {
            f2 = this.f54991E.get(i2).floatValue();
        }
        int i3 = i - 1;
        if (i3 < 0) {
            f3 = this.f54989C;
        } else {
            f3 = this.f54991E.get(i3).floatValue();
        }
        return C0745a.m3626a(f, f3, f2);
    }

    /* renamed from: a */
    private Boolean m81263a(int i, KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i == 69) {
                        m81277c(-1);
                        return true;
                    } else if (i != 70) {
                        switch (i) {
                            case 21:
                                m81280d(-1);
                                return true;
                            case 22:
                                m81280d(1);
                                return true;
                            case 23:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                m81277c(1);
                return true;
            }
            this.f54992F = this.f54993G;
            postInvalidate();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(m81277c(1));
        } else {
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(m81277c(-1));
            }
            return false;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f54991E.size() == 1) {
            this.f54992F = 0;
        }
        if (this.f54992F == -1) {
            Boolean a = m81263a(i, keyEvent);
            if (a != null) {
                return a.booleanValue();
            }
            return super.onKeyDown(i, keyEvent);
        }
        this.f54998L |= keyEvent.isLongPress();
        Float e = m81281e(i);
        if (e != null) {
            if (m81283e(this.f54991E.get(this.f54992F).floatValue() + e.floatValue())) {
                mo78070b();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return m81277c(1);
            } else {
                if (keyEvent.isShiftPressed()) {
                    return m81277c(-1);
                }
                return false;
            }
        }
        this.f54992F = -1;
        for (C22378a aVar : this.f55017m) {
            C22365r.m81030g(this).mo77865b(aVar);
        }
        postInvalidate();
        return true;
    }

    /* renamed from: b */
    private void m81272b(Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f55024t;
        float f = (float) i;
        float f2 = (float) i2;
        canvas.drawLine(((float) i3) + (activeRange[0] * f), f2, ((float) i3) + (activeRange[1] * f), f2, this.f55009e);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f54992F = -1;
            for (C22378a aVar : this.f55017m) {
                C22365r.m81030g(this).mo77865b(aVar);
            }
            this.f55007b.mo4854d(this.f54993G);
            return;
        }
        m81286f(i);
        this.f55007b.mo4853c(this.f54993G);
    }

    /* renamed from: c */
    private void m81276c(Canvas canvas, int i, int i2) {
        if (!isEnabled()) {
            Iterator<Float> it = this.f54991E.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(((float) this.f55024t) + (m81275c(it.next().floatValue()) * ((float) i)), (float) i2, (float) this.f55026v, this.f55010f);
            }
        }
        Iterator<Float> it2 = this.f54991E.iterator();
        while (it2.hasNext()) {
            canvas.save();
            int c = this.f55024t + ((int) (m81275c(it2.next().floatValue()) * ((float) i)));
            int i3 = this.f55026v;
            canvas.translate((float) (c - i3), (float) (i2 - i3));
            this.f55005S.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: d */
    private void m81279d(Canvas canvas, int i, int i2) {
        if (m81295n()) {
            int c = (int) (((float) this.f55024t) + (m81275c(this.f54991E.get(this.f54993G).floatValue()) * ((float) i)));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.f55027w;
                canvas.clipRect((float) (c - i3), (float) (i2 - i3), (float) (c + i3), (float) (i3 + i2), Region.Op.UNION);
            }
            canvas.drawCircle((float) c, (float) i2, (float) this.f55027w, this.f55011g);
        }
    }

    public BaseSlider(Context context, final AttributeSet attributeSet, final int i) {
        super(C22497a.m81662a(context, attributeSet, i, Widget_MaterialComponents_Slider), attributeSet, i);
        this.f55017m = new ArrayList();
        this.f55018n = new ArrayList();
        this.f55019o = new ArrayList();
        this.f54988B = false;
        this.f54991E = new ArrayList<>();
        this.f54992F = -1;
        this.f54993G = -1;
        this.f54994H = BitmapDescriptorFactory.HUE_RED;
        this.f54998L = false;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f55005S = materialShapeDrawable;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f55008d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f55009e = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f55010f = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f55011g = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f55012h = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f55013i = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        m81265a(context2.getResources());
        this.f55016l = new AbstractC22418c() {
            /* class com.google.android.material.slider.BaseSlider.C224141 */

            @Override // com.google.android.material.slider.BaseSlider.AbstractC22418c
            /* renamed from: a */
            public C22378a mo78135a() {
                TypedArray a = C22358l.m80999a(BaseSlider.this.getContext(), attributeSet, new int[]{16842766, 16842788, 16843078, 16843486, 16843487, R.attr.haloColor, R.attr.haloRadius, R.attr.labelBehavior, R.attr.labelStyle, R.attr.thumbColor, R.attr.thumbElevation, R.attr.thumbRadius, R.attr.tickColor, R.attr.tickColorActive, R.attr.tickColorInactive, R.attr.trackColor, R.attr.trackColorActive, R.attr.trackColorInactive, R.attr.trackHeight}, i, BaseSlider.Widget_MaterialComponents_Slider, new int[0]);
                C22378a a2 = BaseSlider.m81262a(BaseSlider.this.getContext(), a);
                a.recycle();
                return a2;
            }
        };
        m81264a(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.mo77944D(2);
        this.f55020p = ViewConfiguration.get(context2).getScaledTouchSlop();
        C22417b bVar = new C22417b(this);
        this.f55007b = bVar;
        ViewCompat.m4043a(this, bVar);
        this.f55014j = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    /* renamed from: a */
    private void m81264a(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        TypedArray a = C22358l.m80999a(context, attributeSet, new int[]{16842766, 16842788, 16843078, 16843486, 16843487, R.attr.haloColor, R.attr.haloRadius, R.attr.labelBehavior, R.attr.labelStyle, R.attr.thumbColor, R.attr.thumbElevation, R.attr.thumbRadius, R.attr.tickColor, R.attr.tickColorActive, R.attr.tickColorInactive, R.attr.trackColor, R.attr.trackColorActive, R.attr.trackColorInactive, R.attr.trackHeight}, i, Widget_MaterialComponents_Slider, new int[0]);
        this.f54989C = a.getFloat(3, BitmapDescriptorFactory.HUE_RED);
        this.f54990D = a.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.f54989C));
        this.f54994H = a.getFloat(2, BitmapDescriptorFactory.HUE_RED);
        int i4 = 15;
        boolean hasValue = a.hasValue(15);
        if (hasValue) {
            i2 = 15;
        } else {
            i2 = 17;
        }
        if (!hasValue) {
            i4 = 16;
        }
        ColorStateList a2 = C22313c.m80795a(context, a, i2);
        if (a2 == null) {
            a2 = C0215a.m652a(context, R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(a2);
        ColorStateList a3 = C22313c.m80795a(context, a, i4);
        if (a3 == null) {
            a3 = C0215a.m652a(context, R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(a3);
        this.f55005S.mo77973g(C22313c.m80795a(context, a, 9));
        ColorStateList a4 = C22313c.m80795a(context, a, 5);
        if (a4 == null) {
            a4 = C0215a.m652a(context, R.color.material_slider_halo_color);
        }
        setHaloTintList(a4);
        int i5 = 12;
        boolean hasValue2 = a.hasValue(12);
        if (hasValue2) {
            i3 = 12;
        } else {
            i3 = 14;
        }
        if (!hasValue2) {
            i5 = 13;
        }
        ColorStateList a5 = C22313c.m80795a(context, a, i3);
        if (a5 == null) {
            a5 = C0215a.m652a(context, R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(a5);
        ColorStateList a6 = C22313c.m80795a(context, a, i5);
        if (a6 == null) {
            a6 = C0215a.m652a(context, R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(a6);
        setThumbRadius(a.getDimensionPixelSize(11, 0));
        setHaloRadius(a.getDimensionPixelSize(6, 0));
        setThumbElevation(a.getDimension(10, BitmapDescriptorFactory.HUE_RED));
        setTrackHeight(a.getDimensionPixelSize(18, 0));
        this.f55022r = a.getInt(7, 0);
        if (!a.getBoolean(0, true)) {
            setEnabled(false);
        }
        a.recycle();
    }

    /* renamed from: a */
    private void m81267a(Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f55024t;
        float f = (float) i;
        float f2 = ((float) i3) + (activeRange[1] * f);
        if (f2 < ((float) (i3 + i))) {
            float f3 = (float) i2;
            canvas.drawLine(f2, f3, (float) (i3 + i), f3, this.f55008d);
        }
        int i4 = this.f55024t;
        float f4 = ((float) i4) + (activeRange[0] * f);
        if (f4 > ((float) i4)) {
            float f5 = (float) i2;
            canvas.drawLine((float) i4, f5, f4, f5, this.f55008d);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f54996J = Math.max(i - (this.f55024t * 2), 0);
        if (this.f54994H > BitmapDescriptorFactory.HUE_RED) {
            m81293l();
        }
        mo78070b();
    }
}
