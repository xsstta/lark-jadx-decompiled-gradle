package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C0859a;
import androidx.core.view.C0906h;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C22365r;
import com.google.android.material.shape.AbstractC22389c;
import com.google.android.material.shape.C22387a;
import com.google.android.material.shape.C22398l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: d */
    private static final String f54115d = "MaterialButtonToggleGroup";

    /* renamed from: e */
    private static final int f54116e = 2131887366;

    /* renamed from: a */
    public boolean f54117a;

    /* renamed from: b */
    public boolean f54118b;

    /* renamed from: c */
    public int f54119c;

    /* renamed from: f */
    private final List<C22193b> f54120f;

    /* renamed from: g */
    private final C22192a f54121g;

    /* renamed from: h */
    private final C22195d f54122h;

    /* renamed from: i */
    private final LinkedHashSet<AbstractC22194c> f54123i;

    /* renamed from: j */
    private final Comparator<MaterialButton> f54124j;

    /* renamed from: k */
    private Integer[] f54125k;

    /* renamed from: l */
    private boolean f54126l;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    public interface AbstractC22194c {
        /* renamed from: a */
        void mo76825a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* renamed from: b */
    public boolean mo76809b() {
        return this.f54118b;
    }

    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f54118b) {
            return this.f54119c;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f54119c;
        if (i != -1) {
            m80049d(i);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m80047c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m80047c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m80047c(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    private void m80050e() {
        TreeMap treeMap = new TreeMap(this.f54124j);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m80041a(i), Integer.valueOf(i));
        }
        this.f54125k = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo76810c() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton a = m80041a(i);
            if (a.getVisibility() != 8) {
                C22398l.C22400a n = a.getShapeAppearanceModel().mo78017n();
                m80043a(n, m80042a(i, firstVisibleChildIndex, lastVisibleChildIndex));
                a.setShapeAppearanceModel(n.mo78024a());
            }
        }
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton a = m80041a(i);
            if (a.isChecked()) {
                arrayList.add(Integer.valueOf(a.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private void m80048d() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton a = m80041a(i);
                int min = Math.min(a.getStrokeWidth(), m80041a(i - 1).getStrokeWidth());
                LinearLayout.LayoutParams b = m80044b(a);
                if (getOrientation() == 0) {
                    C0906h.m4358b(b, 0);
                    C0906h.m4356a(b, -min);
                } else {
                    b.bottomMargin = 0;
                    b.topMargin = -min;
                }
                a.setLayoutParams(b);
            }
            m80045b(firstVisibleChildIndex);
        }
    }

    /* renamed from: a */
    public void mo76805a() {
        this.f54117a = true;
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton a = m80041a(i);
            a.setChecked(false);
            mo76808b(a.getId(), false);
        }
        this.f54117a = false;
        setCheckedId(-1);
    }

    public void setSelectionRequired(boolean z) {
        this.f54126l = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    public class C22192a implements MaterialButton.AbstractC22188a {
        private C22192a() {
        }

        @Override // com.google.android.material.button.MaterialButton.AbstractC22188a
        /* renamed from: a */
        public void mo76802a(MaterialButton materialButton, boolean z) {
            int i;
            if (!MaterialButtonToggleGroup.this.f54117a) {
                if (MaterialButtonToggleGroup.this.f54118b) {
                    MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                    if (z) {
                        i = materialButton.getId();
                    } else {
                        i = -1;
                    }
                    materialButtonToggleGroup.f54119c = i;
                }
                if (MaterialButtonToggleGroup.this.mo76806a(materialButton.getId(), z)) {
                    MaterialButtonToggleGroup.this.mo76808b(materialButton.getId(), materialButton.isChecked());
                }
                MaterialButtonToggleGroup.this.invalidate();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public class C22195d implements MaterialButton.AbstractC22189b {
        private C22195d() {
        }

        @Override // com.google.android.material.button.MaterialButton.AbstractC22189b
        /* renamed from: a */
        public void mo76803a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private MaterialButton m80041a(int i) {
        return (MaterialButton) getChildAt(i);
    }

    private void setCheckedId(int i) {
        this.f54119c = i;
        mo76808b(i, true);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m80050e();
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public static class C22193b {

        /* renamed from: e */
        private static final AbstractC22389c f54130e = new C22387a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: a */
        AbstractC22389c f54131a;

        /* renamed from: b */
        AbstractC22389c f54132b;

        /* renamed from: c */
        AbstractC22389c f54133c;

        /* renamed from: d */
        AbstractC22389c f54134d;

        /* renamed from: a */
        public static C22193b m80060a(C22193b bVar) {
            AbstractC22389c cVar = bVar.f54131a;
            AbstractC22389c cVar2 = bVar.f54134d;
            AbstractC22389c cVar3 = f54130e;
            return new C22193b(cVar, cVar2, cVar3, cVar3);
        }

        /* renamed from: b */
        public static C22193b m80062b(C22193b bVar) {
            AbstractC22389c cVar = f54130e;
            return new C22193b(cVar, cVar, bVar.f54132b, bVar.f54133c);
        }

        /* renamed from: c */
        public static C22193b m80064c(C22193b bVar) {
            AbstractC22389c cVar = bVar.f54131a;
            AbstractC22389c cVar2 = f54130e;
            return new C22193b(cVar, cVar2, bVar.f54132b, cVar2);
        }

        /* renamed from: d */
        public static C22193b m80065d(C22193b bVar) {
            AbstractC22389c cVar = f54130e;
            return new C22193b(cVar, bVar.f54134d, cVar, bVar.f54133c);
        }

        /* renamed from: a */
        public static C22193b m80061a(C22193b bVar, View view) {
            if (C22365r.m81024a(view)) {
                return m80062b(bVar);
            }
            return m80060a(bVar);
        }

        /* renamed from: b */
        public static C22193b m80063b(C22193b bVar, View view) {
            if (C22365r.m81024a(view)) {
                return m80060a(bVar);
            }
            return m80062b(bVar);
        }

        C22193b(AbstractC22389c cVar, AbstractC22389c cVar2, AbstractC22389c cVar3, AbstractC22389c cVar4) {
            this.f54131a = cVar;
            this.f54132b = cVar3;
            this.f54133c = cVar4;
            this.f54134d = cVar2;
        }
    }

    /* renamed from: c */
    private boolean m80047c(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m80049d(int i) {
        m80046c(i, true);
        mo76806a(i, true);
        setCheckedId(i);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ViewCompat.m4025a());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* renamed from: b */
    private LinearLayout.LayoutParams m80044b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.mo76744a(this.f54121g);
        materialButton.setOnPressedChangeListenerInternal(this.f54122h);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0864d a = C0864d.m4171a(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (mo76809b()) {
            i = 1;
        } else {
            i = 2;
        }
        a.mo4559a(C0864d.C0866b.m4257a(1, visibleButtonCount, false, i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f54118b != z) {
            this.f54118b = z;
            mo76805a();
        }
    }

    /* renamed from: b */
    private void m80045b(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m80041a(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            C0906h.m4358b(layoutParams, 0);
            C0906h.m4356a(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.mo76746b(this.f54121g);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f54120f.remove(indexOfChild);
        }
        mo76810c();
        m80048d();
    }

    /* renamed from: a */
    public int mo76804a(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && m80047c(i2)) {
                i++;
            }
        }
        return -1;
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo76810c();
        m80048d();
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private static void m80043a(C22398l.C22400a aVar, C22193b bVar) {
        if (bVar == null) {
            aVar.mo78018a(BitmapDescriptorFactory.HUE_RED);
        } else {
            aVar.mo78021a(bVar.f54131a).mo78036d(bVar.f54134d).mo78027b(bVar.f54132b).mo78032c(bVar.f54133c);
        }
    }

    /* renamed from: c */
    private void m80046c(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f54117a = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f54117a = false;
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f54125k;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(f54115d, "Child order wasn't updated");
        return i2;
    }

    /* renamed from: b */
    public void mo76808b(int i, boolean z) {
        Iterator<AbstractC22194c> it = this.f54123i.iterator();
        while (it.hasNext()) {
            it.next().mo76825a(this, i, z);
        }
    }

    /* renamed from: a */
    public boolean mo76806a(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.f54126l || !checkedButtonIds.isEmpty()) {
            if (z && this.f54118b) {
                checkedButtonIds.remove(Integer.valueOf(i));
                for (Integer num : checkedButtonIds) {
                    int intValue = num.intValue();
                    m80046c(intValue, false);
                    mo76808b(intValue, false);
                }
            }
            return true;
        }
        m80046c(i, true);
        this.f54119c = i;
        return false;
    }

    /* renamed from: a */
    private C22193b m80042a(int i, int i2, int i3) {
        boolean z;
        C22193b bVar = this.f54120f.get(i);
        if (i2 == i3) {
            return bVar;
        }
        if (getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == i2) {
            if (z) {
                return C22193b.m80061a(bVar, this);
            }
            return C22193b.m80064c(bVar);
        } else if (i != i3) {
            return null;
        } else {
            if (z) {
                return C22193b.m80063b(bVar, this);
            }
            return C22193b.m80065d(bVar);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f54115d, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            mo76806a(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        C22398l shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f54120f.add(new C22193b(shapeAppearanceModel.mo78009f(), shapeAppearanceModel.mo78012i(), shapeAppearanceModel.mo78010g(), shapeAppearanceModel.mo78011h()));
        ViewCompat.m4043a(materialButton, new C0859a() {
            /* class com.google.android.material.button.MaterialButtonToggleGroup.C221912 */

            @Override // androidx.core.view.C0859a
            /* renamed from: a */
            public void mo4535a(View view, C0864d dVar) {
                super.mo4535a(view, dVar);
                dVar.mo4567b(C0864d.C0867c.m4258a(0, 1, MaterialButtonToggleGroup.this.mo76804a(view), 1, false, ((MaterialButton) view).isChecked()));
            }
        });
    }
}
