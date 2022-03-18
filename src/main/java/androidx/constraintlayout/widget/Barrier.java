package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.solver.widgets.C0640a;
import androidx.constraintlayout.solver.widgets.C0667d;
import androidx.constraintlayout.solver.widgets.C0673h;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;

public class Barrier extends ConstraintHelper {

    /* renamed from: a */
    private int f2762a;

    /* renamed from: b */
    private int f2763b;

    /* renamed from: c */
    private C0640a f2764c;

    public int getType() {
        return this.f2762a;
    }

    public int getMargin() {
        return this.f2764c.mo3608g();
    }

    /* renamed from: a */
    public boolean mo3787a() {
        return this.f2764c.mo3606c();
    }

    public void setType(int i) {
        this.f2762a = i;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2764c.mo3603a(z);
    }

    public void setMargin(int i) {
        this.f2764c.mo3605b(i);
    }

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void setDpMargin(int i) {
        C0640a aVar = this.f2764c;
        aVar.mo3605b((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: a */
    public void mo3060a(AttributeSet attributeSet) {
        super.mo3060a(attributeSet);
        this.f2764c = new C0640a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843840, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_optimizationLevel});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.f2764c.mo3603a(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == 16) {
                    this.f2764c.mo3605b(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2778m = this.f2764c;
        mo3801c();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: a */
    public void mo3061a(ConstraintWidget constraintWidget, boolean z) {
        m3331a(constraintWidget, this.f2762a, z);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* renamed from: a */
    private void m3331a(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f2763b = i;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.f2762a;
            if (i2 == 5) {
                this.f2763b = 0;
            } else if (i2 == 6) {
                this.f2763b = 1;
            }
        } else if (z) {
            int i3 = this.f2762a;
            if (i3 == 5) {
                this.f2763b = 1;
            } else if (i3 == 6) {
                this.f2763b = 0;
            }
        } else {
            int i4 = this.f2762a;
            if (i4 == 5) {
                this.f2763b = 0;
            } else if (i4 == 6) {
                this.f2763b = 1;
            }
        }
        if (constraintWidget instanceof C0640a) {
            ((C0640a) constraintWidget).mo3602a(this.f2763b);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: a */
    public void mo3063a(C0689b.C0690a aVar, C0673h hVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.mo3063a(aVar, hVar, layoutParams, sparseArray);
        if (hVar instanceof C0640a) {
            C0640a aVar2 = (C0640a) hVar;
            m3331a(aVar2, aVar.f2876d.ab, ((C0667d) hVar.mo3595v()).mo3660Y());
            aVar2.mo3603a(aVar.f2876d.aj);
            aVar2.mo3605b(aVar.f2876d.ac);
        }
    }
}
