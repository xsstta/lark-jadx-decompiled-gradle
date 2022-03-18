package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.solver.widgets.C0668e;
import androidx.constraintlayout.solver.widgets.C0673h;
import androidx.constraintlayout.solver.widgets.C0675j;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import com.larksuite.suite.R;

public class Flow extends VirtualLayout {

    /* renamed from: a */
    private C0668e f1905a;

    public Flow(Context context) {
        super(context);
    }

    public void setFirstHorizontalBias(float f) {
        this.f1905a.mo3699g(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f1905a.mo3695b(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f1905a.mo3700h(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f1905a.mo3703y(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f1905a.mo3687D(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f1905a.mo3697e(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f1905a.mo3690G(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f1905a.mo3685B(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f1905a.mo3692I(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f1905a.mo3602a(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.f1905a.mo3726K(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f1905a.mo3732Q(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f1905a.mo3729N(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f1905a.mo3731P(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f1905a.mo3730O(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f1905a.mo3688E(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f1905a.mo3698f(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f1905a.mo3691H(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f1905a.mo3686C(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f1905a.mo3689F(i);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper, androidx.constraintlayout.widget.VirtualLayout
    /* renamed from: a */
    public void mo3060a(AttributeSet attributeSet) {
        super.mo3060a(attributeSet);
        this.f1905a = new C0668e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843840, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_optimizationLevel});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f1905a.mo3602a(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 1) {
                    this.f1905a.mo3726K(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 11) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        this.f1905a.mo3727L(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                    }
                } else if (index == 12) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        this.f1905a.mo3728M(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                    }
                } else if (index == 2) {
                    this.f1905a.mo3729N(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 3) {
                    this.f1905a.mo3730O(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 4) {
                    this.f1905a.mo3731P(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 5) {
                    this.f1905a.mo3732Q(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 38) {
                    this.f1905a.mo3689F(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 28) {
                    this.f1905a.mo3685B(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 37) {
                    this.f1905a.mo3686C(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 22) {
                    this.f1905a.mo3695b(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 30) {
                    this.f1905a.mo3704z(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 24) {
                    this.f1905a.mo3703y(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 32) {
                    this.f1905a.mo3684A(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 26) {
                    this.f1905a.mo3697e(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 21) {
                    this.f1905a.mo3699g(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 29) {
                    this.f1905a.mo3701i(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 23) {
                    this.f1905a.mo3700h(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 31) {
                    this.f1905a.mo3702j(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 35) {
                    this.f1905a.mo3698f(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 25) {
                    this.f1905a.mo3687D(obtainStyledAttributes.getInt(index, 2));
                } else if (index == 34) {
                    this.f1905a.mo3688E(obtainStyledAttributes.getInt(index, 2));
                } else if (index == 27) {
                    this.f1905a.mo3690G(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 36) {
                    this.f1905a.mo3691H(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 33) {
                    this.f1905a.mo3692I(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2778m = this.f1905a;
        mo3801c();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: a */
    public void mo3061a(ConstraintWidget constraintWidget, boolean z) {
        this.f1905a.mo3737a(z);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void onMeasure(int i, int i2) {
        mo3062a(this.f1905a, i, i2);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    /* renamed from: a */
    public void mo3062a(C0675j jVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (jVar != null) {
            jVar.mo3696b(mode, size, mode2, size2);
            setMeasuredDimension(jVar.mo3733X(), jVar.mo3734Y());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: a */
    public void mo3063a(C0689b.C0690a aVar, C0673h hVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.mo3063a(aVar, hVar, layoutParams, sparseArray);
        if (hVar instanceof C0668e) {
            C0668e eVar = (C0668e) hVar;
            if (layoutParams.f2801S != -1) {
                eVar.mo3602a(layoutParams.f2801S);
            }
        }
    }
}
