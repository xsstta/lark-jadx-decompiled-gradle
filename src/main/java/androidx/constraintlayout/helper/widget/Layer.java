package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class Layer extends ConstraintHelper {

    /* renamed from: a */
    ConstraintLayout f1906a;

    /* renamed from: b */
    protected float f1907b = Float.NaN;

    /* renamed from: c */
    protected float f1908c = Float.NaN;

    /* renamed from: d */
    protected float f1909d = Float.NaN;

    /* renamed from: e */
    protected float f1910e = Float.NaN;

    /* renamed from: f */
    protected float f1911f = Float.NaN;

    /* renamed from: g */
    protected float f1912g = Float.NaN;

    /* renamed from: h */
    boolean f1913h = true;

    /* renamed from: i */
    View[] f1914i;

    /* renamed from: q */
    private float f1915q = Float.NaN;

    /* renamed from: r */
    private float f1916r = Float.NaN;

    /* renamed from: s */
    private float f1917s = Float.NaN;

    /* renamed from: t */
    private float f1918t = 1.0f;

    /* renamed from: u */
    private float f1919u = 1.0f;

    /* renamed from: v */
    private float f1920v;

    /* renamed from: w */
    private float f1921w;

    /* renamed from: x */
    private boolean f1922x;

    /* renamed from: y */
    private boolean f1923y;

    /* renamed from: b */
    private void m2394b() {
        if (!(this.f1906a == null || this.f2776k == 0)) {
            View[] viewArr = this.f1914i;
            if (viewArr == null || viewArr.length != this.f2776k) {
                this.f1914i = new View[this.f2776k];
            }
            for (int i = 0; i < this.f2776k; i++) {
                this.f1914i[i] = this.f1906a.getViewById(this.f2775j[i]);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        this.f1906a = (ConstraintLayout) getParent();
        if (this.f1922x || this.f1923y) {
            int visibility = getVisibility();
            if (Build.VERSION.SDK_INT >= 21) {
                f = getElevation();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            for (int i = 0; i < this.f2776k; i++) {
                View viewById = this.f1906a.getViewById(this.f2775j[i]);
                if (viewById != null) {
                    if (this.f1922x) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f1923y && f > BitmapDescriptorFactory.HUE_RED && Build.VERSION.SDK_INT >= 21) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + f);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private void m2395e() {
        double d;
        if (this.f1906a != null) {
            if (this.f1914i == null) {
                m2394b();
            }
            mo3085a();
            if (Float.isNaN(this.f1917s)) {
                d = 0.0d;
            } else {
                d = Math.toRadians((double) this.f1917s);
            }
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = this.f1918t;
            float f2 = f * cos;
            float f3 = this.f1919u;
            float f4 = (-f3) * sin;
            float f5 = f * sin;
            float f6 = f3 * cos;
            for (int i = 0; i < this.f2776k; i++) {
                View view = this.f1914i[i];
                float left = ((float) ((view.getLeft() + view.getRight()) / 2)) - this.f1907b;
                float top = ((float) ((view.getTop() + view.getBottom()) / 2)) - this.f1908c;
                view.setTranslationX((((f2 * left) + (f4 * top)) - left) + this.f1920v);
                view.setTranslationY((((left * f5) + (f6 * top)) - top) + this.f1921w);
                view.setScaleY(this.f1919u);
                view.setScaleX(this.f1918t);
                if (!Float.isNaN(this.f1917s)) {
                    view.setRotation(this.f1917s);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3085a() {
        if (this.f1906a != null) {
            if (!(this.f1913h || Float.isNaN(this.f1907b) || Float.isNaN(this.f1908c))) {
                return;
            }
            if (Float.isNaN(this.f1915q) || Float.isNaN(this.f1916r)) {
                View[] e = mo3805e(this.f1906a);
                int left = e[0].getLeft();
                int top = e[0].getTop();
                int right = e[0].getRight();
                int bottom = e[0].getBottom();
                for (int i = 0; i < this.f2776k; i++) {
                    View view = e[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.f1909d = (float) right;
                this.f1910e = (float) bottom;
                this.f1911f = (float) left;
                this.f1912g = (float) top;
                if (Float.isNaN(this.f1915q)) {
                    this.f1907b = (float) ((left + right) / 2);
                } else {
                    this.f1907b = this.f1915q;
                }
                if (Float.isNaN(this.f1916r)) {
                    this.f1908c = (float) ((top + bottom) / 2);
                } else {
                    this.f1908c = this.f1916r;
                }
            } else {
                this.f1908c = this.f1916r;
                this.f1907b = this.f1915q;
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo3803d();
    }

    public void setPivotX(float f) {
        this.f1915q = f;
        m2395e();
    }

    public void setPivotY(float f) {
        this.f1916r = f;
        m2395e();
    }

    public void setRotation(float f) {
        this.f1917s = f;
        m2395e();
    }

    public void setScaleX(float f) {
        this.f1918t = f;
        m2395e();
    }

    public void setScaleY(float f) {
        this.f1919u = f;
        m2395e();
    }

    public void setTranslationX(float f) {
        this.f1920v = f;
        m2395e();
    }

    public void setTranslationY(float f) {
        this.f1921w = f;
        m2395e();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo3803d();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: a */
    public void mo3086a(ConstraintLayout constraintLayout) {
        this.f1906a = constraintLayout;
        float rotation = getRotation();
        if (rotation != BitmapDescriptorFactory.HUE_RED) {
            this.f1917s = rotation;
        } else if (!Float.isNaN(this.f1917s)) {
            this.f1917s = rotation;
        }
    }

    public Layer(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: b */
    public void mo3087b(ConstraintLayout constraintLayout) {
        m2394b();
        this.f1907b = Float.NaN;
        this.f1908c = Float.NaN;
        ConstraintWidget a = ((ConstraintLayout.LayoutParams) getLayoutParams()).mo3844a();
        a.mo3579o(0);
        a.mo3581p(0);
        mo3085a();
        layout(((int) this.f1911f) - getPaddingLeft(), ((int) this.f1912g) - getPaddingTop(), ((int) this.f1909d) + getPaddingRight(), ((int) this.f1910e) + getPaddingBottom());
        m2395e();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: a */
    public void mo3060a(AttributeSet attributeSet) {
        super.mo3060a(attributeSet);
        this.f2779n = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843840, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_optimizationLevel});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f1922x = true;
                } else if (index == 13) {
                    this.f1923y = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
