package com.larksuite.component.ui.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.p1153e.C25655d;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 02\u00020\u00012\u00020\u0002:\u000201B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\b\u0010\u001a\u001a\u00020\nH\u0003J\u0012\u0010\u001b\u001a\u00020\r2\b\b\u0001\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\nH\u0003J\b\u0010\u001e\u001a\u00020\nH\u0003J\u0012\u0010\u001f\u001a\u00020\u00152\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010 \u001a\u00020\u0010H\u0016J\u0006\u0010!\u001a\u00020\u0010J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0018\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0014J\b\u0010&\u001a\u00020\u0010H\u0016J\u0010\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0010H\u0016J\u0010\u0010)\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010\u0013J\u000e\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0010J\u0010\u0010-\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010.\u001a\u00020\u0015H\u0002J\b\u0010/\u001a\u00020\u0015H\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/larksuite/component/ui/button/LKUICheckBox2;", "Landroid/view/View;", "Landroid/widget/Checkable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCurrDrawable", "Landroid/graphics/drawable/Drawable;", "mDrawableSize", "mIsChecked", "", "mIsRadio", "mOnCheckedChangeListener", "Lcom/larksuite/component/ui/button/LKUICheckBox2$OnCheckedChangeListener;", "doDrawCheckBox", "", "canvas", "Landroid/graphics/Canvas;", "drawable", "drawableStateChanged", "getCheckBoxDrawableRes", "getDrawable", "resId", "getDrawableRes", "getRadioButtonDrawableRes", "init", "isChecked", "isRadio", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "performClick", "setChecked", "checked", "setOnCheckedChangeListener", "listener", "setRadio", "value", "setupAttrs", "setupCurrDrawable", "toggle", "Companion", "OnCheckedChangeListener", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LKUICheckBox2 extends View implements Checkable {

    /* renamed from: a */
    public static final Companion f62503a = new Companion(null);

    /* renamed from: g */
    private static SparseArray<Drawable> f62504g = new SparseArray<>();

    /* renamed from: h */
    private static final int f62505h = R.drawable.lkui_checkbox_enable_checked;

    /* renamed from: i */
    private static final int f62506i = R.drawable.lkui_checkbox_enable_unchecked;

    /* renamed from: j */
    private static final int f62507j = R.drawable.lkui_checkbox_disable_checked;

    /* renamed from: k */
    private static final int f62508k = R.drawable.lkui_checkbox_disable_unchecked;

    /* renamed from: l */
    private static final int f62509l = R.drawable.lkui_radio_button_enable_checked;

    /* renamed from: m */
    private static final int f62510m = R.drawable.lkui_radio_button_enable_unchecked;

    /* renamed from: n */
    private static final int f62511n = R.drawable.lkui_radio_button_disable_checked;

    /* renamed from: o */
    private static final int f62512o = R.drawable.lkui_radio_button_disable_unchecked;

    /* renamed from: b */
    private boolean f62513b;

    /* renamed from: c */
    private boolean f62514c;

    /* renamed from: d */
    private int f62515d;

    /* renamed from: e */
    private Drawable f62516e;

    /* renamed from: f */
    private OnCheckedChangeListener f62517f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/larksuite/component/ui/button/LKUICheckBox2$OnCheckedChangeListener;", "", "onCheckedChanged", "", "buttonView", "Lcom/larksuite/component/ui/button/LKUICheckBox2;", "isChecked", "", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.button.LKUICheckBox2$b */
    public interface OnCheckedChangeListener {
        /* renamed from: a */
        void mo89115a(LKUICheckBox2 lKUICheckBox2, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/larksuite/component/ui/button/LKUICheckBox2$Companion;", "", "()V", "ANDROID_NAMESPACE", "", "CHECKBOX_DISABLE_CHECKED_DRAWABLE_RES", "", "CHECKBOX_DISABLE_UNCHECKED_DRAWABLE_RES", "CHECKBOX_ENABLED_CHECKED_DRAWABLE_RES", "CHECKBOX_ENABLED_UNCHECKED_DRAWABLE_RES", "DEFAULT_SIZE", "RADIO_DISABLE_CHECKED_DRAWABLE_RES", "RADIO_DISABLE_UNCHECKED_DRAWABLE_RES", "RADIO_ENABLED_CHECKED_DRAWABLE_RES", "RADIO_ENABLED_UNCHECKED_DRAWABLE_RES", "mDrawables", "Landroid/util/SparseArray;", "Landroid/graphics/drawable/Drawable;", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.button.LKUICheckBox2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public boolean isChecked() {
        return this.f62514c;
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void toggle() {
        setChecked(!this.f62514c);
    }

    /* renamed from: a */
    private final void m91683a() {
        this.f62516e = m91682a(getDrawableRes());
        invalidate();
    }

    private final int getDrawableRes() {
        if (this.f62513b) {
            return getRadioButtonDrawableRes();
        }
        return getCheckBoxDrawableRes();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m91683a();
        invalidate();
    }

    private final int getCheckBoxDrawableRes() {
        if (isEnabled()) {
            if (isChecked()) {
                return f62505h;
            }
            return f62506i;
        } else if (isChecked()) {
            return f62507j;
        } else {
            return f62508k;
        }
    }

    private final int getRadioButtonDrawableRes() {
        if (isEnabled()) {
            if (isChecked()) {
                return f62509l;
            }
            return f62510m;
        } else if (isChecked()) {
            return f62511n;
        } else {
            return f62512o;
        }
    }

    public final void setOnCheckedChangeListener(OnCheckedChangeListener bVar) {
        this.f62517f = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LKUICheckBox2(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setRadio(boolean z) {
        if (this.f62513b != z) {
            this.f62513b = z;
            m91683a();
        }
    }

    /* renamed from: a */
    private final Drawable m91682a(int i) {
        Drawable drawable = f62504g.get(i);
        if (drawable != null) {
            return drawable;
        }
        Drawable a = C25655d.m91901a(getContext(), i);
        f62504g.put(i, a);
        return a;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (this.f62516e == null) {
            m91683a();
        }
        Drawable drawable = this.f62516e;
        if (drawable != null) {
            m91684a(canvas, drawable);
        }
    }

    public void setChecked(boolean z) {
        if (this.f62514c != z) {
            this.f62514c = z;
            OnCheckedChangeListener bVar = this.f62517f;
            if (bVar != null) {
                bVar.mo89115a(this, z);
            }
            refreshDrawableState();
        }
    }

    private final void setupAttrs(AttributeSet attributeSet) {
        setClickable(attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "clickable", true));
        setChecked(attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "checked", this.f62514c));
        setEnabled(attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "enabled", isEnabled()));
    }

    /* renamed from: a */
    private final void m91685a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            setupAttrs(attributeSet);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.isRadio});
            Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr… styleable.LKUICheckBox2)");
            this.f62513b = obtainStyledAttributes.getBoolean(0, this.f62513b);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LKUICheckBox2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m91685a(attributeSet);
    }

    /* renamed from: a */
    private final void m91684a(Canvas canvas, Drawable drawable) {
        drawable.setBounds(new Rect(getPaddingLeft(), getPaddingTop(), this.f62515d + getPaddingLeft(), this.f62515d + getPaddingTop()));
        drawable.draw(canvas);
        canvas.save();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int a = (int) C25653b.m91892a(getContext(), (float) 18);
            if (layoutParams.width == -2) {
                i = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + a + getPaddingRight(), 1073741824);
            }
            if (layoutParams.height == -2) {
                i2 = View.MeasureSpec.makeMeasureSpec(a + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        }
        this.f62515d = Math.min((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom());
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LKUICheckBox2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m91685a(attributeSet);
    }
}
