package com.lynx.tasm.behavior.ui;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.p029a.C0863c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.p1221a.AbstractC26623a;
import com.lynx.tasm.behavior.ui.AbstractC26746a;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.ui.view.C26840a;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class UIGroup<T extends ViewGroup> extends LynxUI<T> implements AbstractC26746a, AbstractC26757c {

    /* renamed from: c */
    private static WeakHashMap<View, Integer> f66264c = new WeakHashMap<>();

    /* renamed from: e */
    private static final float[] f66265e = new float[2];

    /* renamed from: f */
    private static final PointF f66266f = new PointF();

    /* renamed from: g */
    private static final float[] f66267g = new float[2];

    /* renamed from: h */
    private static final Matrix f66268h = new Matrix();

    /* renamed from: a */
    private int f66269a;

    /* renamed from: b */
    private Rect f66270b;

    /* renamed from: d */
    private C26783d f66271d;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public ViewGroup.LayoutParams mo53895a(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.AbstractC26746a
    /* renamed from: b */
    public void mo95129b(Canvas canvas, View view, long j) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean needCustomLayout() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public View mo53304h() {
        return this.f66253Z;
    }

    /* renamed from: a */
    public void mo33940a(LynxBaseUI lynxBaseUI, int i) {
        mo95130c(lynxBaseUI, i);
        if (lynxBaseUI instanceof LynxUI) {
            int i2 = -1;
            for (LynxBaseUI lynxBaseUI2 : this.f66242w) {
                if (lynxBaseUI2 instanceof LynxUI) {
                    i2++;
                    continue;
                }
                if (lynxBaseUI2 == lynxBaseUI) {
                    break;
                }
            }
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            if (lynxUI.f66253Z.getParent() != null && (lynxUI.f66253Z.getParent() instanceof ViewGroup)) {
                ((ViewGroup) lynxUI.f66253Z.getParent()).removeView(lynxUI.f66253Z);
                mo95255a(lynxUI);
            }
            ((ViewGroup) this.f66253Z).addView(lynxUI.f66253Z, i2);
            m97048a(lynxUI, i2);
        }
    }

    /* renamed from: a */
    public void mo33939a(LynxBaseUI lynxBaseUI) {
        if (!mo95131d(lynxBaseUI)) {
            return;
        }
        if (lynxBaseUI instanceof LynxUI) {
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            ((ViewGroup) this.f66253Z).removeView(lynxUI.f66253Z);
            mo95255a(lynxUI);
            return;
        }
        mo95041w();
    }

    @Override // com.lynx.tasm.behavior.ui.AbstractC26746a
    /* renamed from: a */
    public void mo95123a(Canvas canvas) {
        int i;
        Path f;
        int i2 = 0;
        this.f66269a = 0;
        if (mo94927J()) {
            BackgroundDrawable c = mo94918A() != null ? mo94918A().mo95533c() : null;
            if (!(c == null || !(c instanceof BackgroundDrawable) || (f = c.mo95494f()) == null)) {
                canvas.clipPath(f);
            }
        }
        if (Build.VERSION.SDK_INT < 18 && mo94930M() != 3) {
            int T = mo94937T();
            int U = mo94938U();
            DisplayMetrics b = this.f66239t.mo94672b();
            if ((mo94930M() & 1) != 0) {
                i = 0 - b.widthPixels;
                T += b.widthPixels * 2;
            } else {
                i = 0;
            }
            if ((mo94930M() & 2) != 0) {
                i2 = 0 - b.heightPixels;
                U += b.heightPixels * 2;
            }
            this.f66270b.set(i, i2, T + i, U + i2);
            canvas.clipRect(this.f66270b);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.AbstractC26746a
    /* renamed from: a */
    public Rect mo95120a(Canvas canvas, View view, long j) {
        for (int i = this.f66269a; i < this.f66242w.size(); i++) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) this.f66242w.get(i);
            if (lynxBaseUI instanceof LynxUI) {
                if (((LynxUI) lynxBaseUI).av() == view) {
                    this.f66269a = i + 1;
                    return lynxBaseUI.mo94936S();
                }
            } else if (lynxBaseUI instanceof LynxFlattenUI) {
                mo95124a((LynxFlattenUI) lynxBaseUI, canvas);
                if (this.f66239t.mo94671a()) {
                    this.f66269a++;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95124a(LynxFlattenUI lynxFlattenUI, Canvas canvas) {
        Rect S = lynxFlattenUI.mo94936S();
        if (S == null) {
            lynxFlattenUI.mo95048a(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(S);
        lynxFlattenUI.mo95048a(canvas);
        canvas.restore();
    }

    /* renamed from: a */
    public LynxBaseUI mo95122a(int i) {
        return (LynxBaseUI) this.f66242w.get(i);
    }

    /* renamed from: a */
    public AbstractC26623a mo95121a(float f, float f2, UIGroup uIGroup) {
        HashMap hashMap = new HashMap();
        for (int aF = uIGroup.aF() - 1; aF >= 0; aF--) {
            LynxBaseUI a = uIGroup.mo95122a(aF);
            if (a instanceof UIShadowProxy) {
                a = ((UIShadowProxy) a).mo53300d();
            }
            if (a instanceof LynxUI) {
                LynxUI lynxUI = (LynxUI) a;
                hashMap.put(lynxUI.av(), lynxUI);
            } else {
                LLog.m96418a(new RuntimeException("ui that need custom layout should not have flatten child!"));
            }
        }
        float[] fArr = {f, f2};
        LynxUI a2 = m97044a(fArr, (ViewGroup) uIGroup.av(), hashMap);
        if (a2 == null) {
            return uIGroup;
        }
        if (!a2.needCustomLayout() || !(a2 instanceof UIGroup)) {
            return a2.mo94945a(fArr[0] + ((float) a2.ab()), fArr[1] + ((float) a2.ac()));
        }
        UIGroup uIGroup2 = (UIGroup) a2;
        return uIGroup2.mo95121a(fArr[0], fArr[1], uIGroup2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void T_() {
        super.T_();
        aE();
    }

    public int aF() {
        return this.f66242w.size();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void an() {
        super.an();
        mo95136p();
    }

    @Override // com.lynx.tasm.behavior.ui.AbstractC26746a
    /* renamed from: f */
    public boolean mo95133f() {
        return aw();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo95134n() {
        View h = mo53304h();
        if (h != null) {
            h.setOnHoverListener(new View.OnHoverListener() {
                /* class com.lynx.tasm.behavior.ui.UIGroup.View$OnHoverListenerC267421 */

                /* renamed from: b */
                private Rect f66273b = new Rect();

                /* renamed from: c */
                private AccessibilityManager f66274c;

                public boolean onHover(View view, MotionEvent motionEvent) {
                    if (this.f66274c == null) {
                        this.f66274c = (AccessibilityManager) view.getContext().getSystemService("accessibility");
                    }
                    AccessibilityManager accessibilityManager = this.f66274c;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled() || !C0863c.m4166a(this.f66274c) || motionEvent.getAction() != 9) {
                        return false;
                    }
                    for (int aF = UIGroup.this.aF() - 1; aF > -1; aF--) {
                        LynxBaseUI a = UIGroup.this.mo95122a(aF);
                        if (a instanceof LynxFlattenUI) {
                            this.f66273b.set(a.mo94940W(), a.mo94939V(), a.mo94940W() + a.mo94937T(), a.mo94939V() + a.mo94938U());
                            if (!this.f66273b.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                continue;
                            } else {
                                CharSequence O = a.mo94932O();
                                if (!TextUtils.isEmpty(O)) {
                                    AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                    obtain.setSource(view);
                                    obtain.setClassName(View.class.getName());
                                    obtain.setContentDescription(O);
                                    view.getParent().requestSendAccessibilityEvent(view, obtain);
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            });
        }
    }

    public void aE() {
        for (LynxBaseUI lynxBaseUI : this.f66242w) {
            lynxBaseUI.T_();
        }
    }

    public void aG() {
        this.f66271d.mo95236b();
        mo95339a(this.f66271d.mo95235a());
        mo95041w();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void ah() {
        if (((ViewGroup) this.f66253Z).isLayoutRequested()) {
            mo95135o();
            super.ah();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: b */
    public void mo53592b() {
        super.mo53592b();
        for (LynxBaseUI lynxBaseUI : this.f66242w) {
            lynxBaseUI.mo53592b();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: j */
    public void mo53306j() {
        if (((ViewGroup) this.f66253Z).isLayoutRequested()) {
            super.mo53306j();
            mo53301e();
        }
    }

    /* renamed from: p */
    public void mo95136p() {
        for (LynxBaseUI lynxBaseUI : this.f66242w) {
            lynxBaseUI.an();
        }
    }

    /* renamed from: l */
    public void mo95109l() {
        for (LynxBaseUI lynxBaseUI : this.f66242w) {
            lynxBaseUI.mo94956a((AbstractC26757c) null);
        }
        this.f66242w.clear();
        if (this.f66253Z != null) {
            ((ViewGroup) this.f66253Z).removeAllViews();
        }
    }

    /* renamed from: o */
    public void mo95135o() {
        if (this.f66239t.mo94671a()) {
            for (LynxBaseUI lynxBaseUI : this.f66242w) {
                lynxBaseUI.ah();
            }
            return;
        }
        for (LynxBaseUI lynxBaseUI2 : this.f66242w) {
            if (lynxBaseUI2 instanceof LynxUI) {
                ((LynxUI) lynxBaseUI2).ah();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: z */
    public void mo95044z() {
        super.mo95044z();
        this.f66271d = new C26783d((ViewGroup) av());
        if (this.f66253Z instanceof AbstractC26746a.AbstractC26747a) {
            ((AbstractC26746a.AbstractC26747a) this.f66253Z).bindDrawChildHook(this);
        }
        mo95134n();
    }

    /* renamed from: e */
    public void mo53301e() {
        if (this.f66239t.mo94671a()) {
            for (LynxBaseUI lynxBaseUI : this.f66242w) {
                if (!needCustomLayout()) {
                    lynxBaseUI.mo53306j();
                } else if (lynxBaseUI instanceof UIGroup) {
                    ((UIGroup) lynxBaseUI).mo53301e();
                }
            }
            return;
        }
        for (int i = 0; i < this.f66242w.size(); i++) {
            LynxBaseUI lynxBaseUI2 = (LynxBaseUI) this.f66242w.get(i);
            if (!needCustomLayout()) {
                if (lynxBaseUI2 instanceof LynxUI) {
                    ((LynxUI) lynxBaseUI2).mo53306j();
                }
            } else if (lynxBaseUI2 instanceof UIGroup) {
                ((UIGroup) lynxBaseUI2).mo53301e();
            }
        }
    }

    public UIGroup(AbstractC26684l lVar) {
        this(lVar, null);
    }

    /* renamed from: e */
    public int mo95132e(LynxBaseUI lynxBaseUI) {
        return this.f66242w.indexOf(lynxBaseUI);
    }

    /* renamed from: a */
    public static Integer m97045a(View view) {
        return f66264c.get(view);
    }

    /* renamed from: d */
    public boolean mo95131d(LynxBaseUI lynxBaseUI) {
        if (!this.f66242w.remove(lynxBaseUI)) {
            return false;
        }
        lynxBaseUI.mo94956a((AbstractC26757c) null);
        return true;
    }

    /* renamed from: a */
    private void mo95255a(LynxUI lynxUI) {
        if (ac) {
            this.f66271d.mo95237b(lynxUI.av());
            mo95339a(this.f66271d.mo95235a());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.AbstractC26746a
    /* renamed from: b */
    public void mo95128b(Canvas canvas) {
        for (int i = this.f66269a; i < this.f66242w.size(); i++) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) this.f66242w.get(i);
            if (lynxBaseUI instanceof LynxFlattenUI) {
                mo95124a((LynxFlattenUI) lynxBaseUI, canvas);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: b */
    public void mo53261b(LynxBaseUI lynxBaseUI) {
        super.mo53261b(lynxBaseUI);
        if (lynxBaseUI instanceof LynxUI) {
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            ((ViewGroup) this.f66253Z).removeView(lynxUI.f66253Z);
            mo95255a(lynxUI);
            return;
        }
        mo95041w();
    }

    /* renamed from: a */
    private void mo95339a(boolean z) {
        if (this.f66253Z instanceof C26840a) {
            ((C26840a) this.f66253Z).setChildrenDrawingOrderEnabled(z);
        } else if (this.f66253Z instanceof UIBody.UIBodyView) {
            ((UIBody.UIBodyView) this.f66253Z).setChildrenDrawingOrderEnabled(z);
        }
    }

    public UIGroup(AbstractC26684l lVar, Object obj) {
        super(lVar, obj);
        this.f66270b = new Rect();
    }

    /* renamed from: c */
    public void mo95130c(LynxBaseUI lynxBaseUI, int i) {
        this.f66242w.add(i, lynxBaseUI);
        lynxBaseUI.mo94956a((AbstractC26757c) this);
    }

    /* renamed from: a */
    public static void m97046a(View view, int i) {
        f66264c.put(view, Integer.valueOf(i));
    }

    /* renamed from: a */
    private void m97048a(LynxUI lynxUI, int i) {
        if (ac) {
            this.f66271d.mo95234a(lynxUI.av());
            mo95339a(this.f66271d.mo95235a());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.AbstractC26746a
    /* renamed from: a */
    public int mo95119a(int i, int i2) {
        C26783d dVar = this.f66271d;
        if (dVar != null) {
            return dVar.mo95233a(i, i2);
        }
        return i2;
    }

    /* renamed from: a */
    private static LynxUI m97044a(float[] fArr, ViewGroup viewGroup, Map<View, LynxUI> map) {
        LynxUI lynxUI = null;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            PointF pointF = f66266f;
            if (m97050a(fArr[0], fArr[1], viewGroup, childAt, pointF)) {
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                if (map.containsKey(childAt)) {
                    lynxUI = map.get(childAt);
                } else if (childAt instanceof ViewGroup) {
                    lynxUI = m97044a(fArr, (ViewGroup) childAt, map);
                }
                if (lynxUI != null) {
                    return lynxUI;
                }
                fArr[0] = f;
                fArr[1] = f2;
            }
        }
        return lynxUI;
    }

    /* renamed from: a */
    private static boolean m97050a(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + ((float) viewGroup.getScrollX())) - ((float) view.getLeft());
        float scrollY = (f2 + ((float) viewGroup.getScrollY())) - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f66267g;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f66268h;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        if (scrollX < BitmapDescriptorFactory.HUE_RED || scrollX >= ((float) (view.getRight() - view.getLeft())) || scrollY < BitmapDescriptorFactory.HUE_RED || scrollY >= ((float) (view.getBottom() - view.getTop()))) {
            return false;
        }
        pointF.set(scrollX, scrollY);
        return true;
    }
}
