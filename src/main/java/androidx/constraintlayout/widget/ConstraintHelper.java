package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.AbstractC0672g;
import androidx.constraintlayout.solver.widgets.C0667d;
import androidx.constraintlayout.solver.widgets.C0673h;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.Arrays;
import java.util.HashMap;

public abstract class ConstraintHelper extends View {

    /* renamed from: a */
    private View[] f2773a;

    /* renamed from: b */
    private HashMap<Integer, String> f2774b;

    /* renamed from: j */
    protected int[] f2775j;

    /* renamed from: k */
    protected int f2776k;

    /* renamed from: l */
    protected Context f2777l;

    /* renamed from: m */
    protected AbstractC0672g f2778m;

    /* renamed from: n */
    protected boolean f2779n;

    /* renamed from: o */
    protected String f2780o;

    /* renamed from: p */
    protected String f2781p;

    /* renamed from: a */
    public void mo3061a(ConstraintWidget constraintWidget, boolean z) {
    }

    /* renamed from: a */
    public void mo3086a(ConstraintLayout constraintLayout) {
    }

    /* renamed from: b */
    public void mo3087b(ConstraintLayout constraintLayout) {
    }

    /* renamed from: f */
    public void mo3806f(ConstraintLayout constraintLayout) {
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3803d() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo3802c((ConstraintLayout) parent);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2775j, this.f2776k);
    }

    /* renamed from: c */
    public void mo3801c() {
        if (this.f2778m != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).an = (ConstraintWidget) this.f2778m;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2780o;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2781p;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public ConstraintHelper(Context context) {
        super(context);
        this.f2775j = new int[32];
        this.f2774b = new HashMap<>();
        this.f2777l = context;
        mo3060a((AttributeSet) null);
    }

    public void setReferencedIds(int[] iArr) {
        this.f2780o = null;
        this.f2776k = 0;
        for (int i : iArr) {
            m3347a(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo3802c(ConstraintLayout constraintLayout) {
        float f;
        int visibility = getVisibility();
        if (Build.VERSION.SDK_INT >= 21) {
            f = getElevation();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        for (int i = 0; i < this.f2776k; i++) {
            View viewById = constraintLayout.getViewById(this.f2775j[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (f > BitmapDescriptorFactory.HUE_RED && Build.VERSION.SDK_INT >= 21) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + f);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public View[] mo3805e(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f2773a;
        if (viewArr == null || viewArr.length != this.f2776k) {
            this.f2773a = new View[this.f2776k];
        }
        for (int i = 0; i < this.f2776k; i++) {
            this.f2773a[i] = constraintLayout.getViewById(this.f2775j[i]);
        }
        return this.f2773a;
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f2780o = str;
        if (str != null) {
            int i = 0;
            this.f2776k = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m3348a(str.substring(i));
                    return;
                } else {
                    m3348a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.f2781p = str;
        if (str != null) {
            int i = 0;
            this.f2776k = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m3350b(str.substring(i));
                    return;
                } else {
                    m3350b(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: a */
    private void m3347a(int i) {
        if (i != getId()) {
            int i2 = this.f2776k + 1;
            int[] iArr = this.f2775j;
            if (i2 > iArr.length) {
                this.f2775j = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f2775j;
            int i3 = this.f2776k;
            iArr2[i3] = i;
            this.f2776k = i3 + 1;
        }
    }

    /* renamed from: b */
    private void m3350b(String str) {
        if (!(str == null || str.length() == 0 || this.f2777l == null)) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).f2804V)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        m3347a(childAt.getId());
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private int m3351c(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i = ((Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m3346a(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = R$id.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            return this.f2777l.getResources().getIdentifier(str, "id", this.f2777l.getPackageName());
        }
        return i;
    }

    /* renamed from: d */
    public void mo3804d(ConstraintLayout constraintLayout) {
        String str;
        int a;
        if (isInEditMode()) {
            setIds(this.f2780o);
        }
        AbstractC0672g gVar = this.f2778m;
        if (gVar != null) {
            gVar.mo3723j();
            for (int i = 0; i < this.f2776k; i++) {
                int i2 = this.f2775j[i];
                View viewById = constraintLayout.getViewById(i2);
                if (viewById == null && (a = m3346a(constraintLayout, (str = this.f2774b.get(Integer.valueOf(i2))))) != 0) {
                    this.f2775j[i] = a;
                    this.f2774b.put(Integer.valueOf(a), str);
                    viewById = constraintLayout.getViewById(a);
                }
                if (viewById != null) {
                    this.f2778m.mo3721a(constraintLayout.getViewWidget(viewById));
                }
            }
            this.f2778m.mo3722a(constraintLayout.mLayoutWidget);
        }
    }

    /* renamed from: a */
    private void m3348a(String str) {
        if (str != null && str.length() != 0 && this.f2777l != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int c = m3351c(trim);
            if (c != 0) {
                this.f2774b.put(Integer.valueOf(c), trim);
                m3347a(c);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3060a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843840, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_optimizationLevel});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2780o = string;
                    setIds(string);
                } else if (index == 20) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2781p = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f2779n) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f2780o == null) {
            m3347a(i);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2775j = new int[32];
        this.f2774b = new HashMap<>();
        this.f2777l = context;
        mo3060a(attributeSet);
    }

    /* renamed from: a */
    private int m3346a(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2777l.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private int[] m3349a(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i = 0;
        for (String str2 : split) {
            int c = m3351c(str2.trim());
            if (c != 0) {
                iArr[i] = c;
                i++;
            }
        }
        if (i != split.length) {
            return Arrays.copyOf(iArr, i);
        }
        return iArr;
    }

    /* renamed from: a */
    public void mo3800a(C0667d dVar, AbstractC0672g gVar, SparseArray<ConstraintWidget> sparseArray) {
        gVar.mo3723j();
        for (int i = 0; i < this.f2776k; i++) {
            gVar.mo3721a(sparseArray.get(this.f2775j[i]));
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2775j = new int[32];
        this.f2774b = new HashMap<>();
        this.f2777l = context;
        mo3060a(attributeSet);
    }

    /* renamed from: a */
    public void mo3063a(C0689b.C0690a aVar, C0673h hVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        if (aVar.f2876d.ae != null) {
            setReferencedIds(aVar.f2876d.ae);
        } else if (aVar.f2876d.af != null && aVar.f2876d.af.length() > 0) {
            aVar.f2876d.ae = m3349a(this, aVar.f2876d.af);
        }
        hVar.mo3723j();
        if (aVar.f2876d.ae != null) {
            for (int i = 0; i < aVar.f2876d.ae.length; i++) {
                ConstraintWidget constraintWidget = sparseArray.get(aVar.f2876d.ae[i]);
                if (constraintWidget != null) {
                    hVar.mo3721a(constraintWidget);
                }
            }
        }
    }
}
