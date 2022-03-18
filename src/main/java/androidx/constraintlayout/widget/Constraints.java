package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;

public class Constraints extends ViewGroup {

    /* renamed from: a */
    C0689b f2844a;

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public C0689b getConstraintSet() {
        if (this.f2844a == null) {
            this.f2844a = new C0689b();
        }
        this.f2844a.mo3893a(this);
        return this.f2844a;
    }

    /* renamed from: b */
    private void m3371b(AttributeSet attributeSet) {
        Log.v("Constraints", " ################# init");
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float aA;
        public float aB;
        public float ap = 1.0f;
        public boolean aq;
        public float ar;
        public float as;
        public float at;
        public float au;
        public float av = 1.0f;
        public float aw = 1.0f;
        public float ax;
        public float ay;
        public float az;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843189, 16843190, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animate_relativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.deriveConstraintsFrom, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.transitionEasing, R.attr.transitionPathRotate});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.ap = obtainStyledAttributes.getFloat(index, this.ap);
                } else if (index == 28) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.ar = obtainStyledAttributes.getFloat(index, this.ar);
                        this.aq = true;
                    }
                } else if (index == 23) {
                    this.at = obtainStyledAttributes.getFloat(index, this.at);
                } else if (index == 24) {
                    this.au = obtainStyledAttributes.getFloat(index, this.au);
                } else if (index == 22) {
                    this.as = obtainStyledAttributes.getFloat(index, this.as);
                } else if (index == 20) {
                    this.av = obtainStyledAttributes.getFloat(index, this.av);
                } else if (index == 21) {
                    this.aw = obtainStyledAttributes.getFloat(index, this.aw);
                } else if (index == 16) {
                    this.ax = obtainStyledAttributes.getFloat(index, this.ax);
                } else if (index == 17) {
                    this.ay = obtainStyledAttributes.getFloat(index, this.ay);
                } else if (index == 18) {
                    this.az = obtainStyledAttributes.getFloat(index, this.az);
                } else if (index == 19) {
                    this.aA = obtainStyledAttributes.getFloat(index, this.aA);
                } else if (index == 27 && Build.VERSION.SDK_INT >= 21) {
                    this.aB = obtainStyledAttributes.getFloat(index, this.aB);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3371b(attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3371b(attributeSet);
        super.setVisibility(8);
    }
}
