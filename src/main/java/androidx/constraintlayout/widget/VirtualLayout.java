package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.C0675j;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: a */
    private boolean f2848a;

    /* renamed from: b */
    private boolean f2849b;

    /* renamed from: a */
    public void mo3062a(C0675j jVar, int i, int i2) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void onAttachedToWindow() {
        ViewParent parent;
        float f;
        super.onAttachedToWindow();
        if ((this.f2848a || this.f2849b) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            if (Build.VERSION.SDK_INT >= 21) {
                f = getElevation();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            for (int i = 0; i < this.f2776k; i++) {
                View viewById = constraintLayout.getViewById(this.f2775j[i]);
                if (viewById != null) {
                    if (this.f2848a) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f2849b && f > BitmapDescriptorFactory.HUE_RED && Build.VERSION.SDK_INT >= 21) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + f);
                    }
                }
            }
        }
    }

    public VirtualLayout(Context context) {
        super(context);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo3803d();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo3803d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: a */
    public void mo3060a(AttributeSet attributeSet) {
        super.mo3060a(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843840, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_optimizationLevel});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f2848a = true;
                } else if (index == 13) {
                    this.f2849b = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
