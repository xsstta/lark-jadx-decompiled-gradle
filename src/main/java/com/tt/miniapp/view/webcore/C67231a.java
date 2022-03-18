package com.tt.miniapp.view.webcore;

import android.content.Context;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.AbstractC65853c;
import com.tt.miniapp.component.nativeview.NativeViewManager;
import com.tt.miniapp.p3307n.C66493a;
import com.tt.miniapp.util.C67047m;
import com.tt.miniapp.view.C67160b;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.DebugUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tt.miniapp.view.webcore.a */
public class C67231a extends ViewGroup {

    /* renamed from: a */
    private WebViewWrapper f169704a;

    /* renamed from: b */
    private List<View> f169705b;

    /* renamed from: c */
    private ArrayList<C67233a> f169706c = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<Integer> f169707d = new ArrayList<>();

    /* renamed from: e */
    private SparseArray<View> f169708e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<C67235c> f169709f = new SparseArray<>();

    /* renamed from: g */
    private int f169710g;

    /* renamed from: h */
    private int f169711h;

    /* renamed from: i */
    private int f169712i;

    /* renamed from: j */
    private int f169713j;

    /* renamed from: k */
    private int f169714k;

    /* renamed from: l */
    private C67160b f169715l;

    /* renamed from: m */
    private IAppContext f169716m;

    /* renamed from: n */
    private C67231a f169717n;

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public List<View> getInterceptViews() {
        return this.f169705b;
    }

    /* renamed from: com.tt.miniapp.view.webcore.a$c */
    public static class C67235c {

        /* renamed from: a */
        public int f169725a;

        /* renamed from: b */
        public int f169726b;

        /* renamed from: a */
        public static C67235c m262048a() {
            return new C67235c();
        }

        /* renamed from: c */
        public void mo233824c(int i) {
            this.f169725a = i;
        }

        /* renamed from: d */
        public void mo233825d(int i) {
            this.f169726b = i;
        }

        /* renamed from: b */
        public int mo233823b(int i) {
            int i2 = i - this.f169726b;
            this.f169726b = i;
            return i2;
        }

        /* renamed from: a */
        public int mo233822a(int i) {
            int i2 = i - this.f169725a;
            this.f169725a = i;
            return i2;
        }
    }

    /* renamed from: f */
    private boolean m262038f() {
        if (this.f169710g == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C67234b(-2, -2, 0, 0);
    }

    /* renamed from: e */
    private boolean m262037e() {
        if (!mo233800a() || !m262038f()) {
            return false;
        }
        return true;
    }

    public int getCurScrollX() {
        if (this.f169710g == 1) {
            return this.f169713j;
        }
        return this.f169711h;
    }

    public int getCurScrollY() {
        if (this.f169710g == 1) {
            return this.f169714k;
        }
        return this.f169712i;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.view.webcore.a$a */
    public static class C67233a implements Comparable<C67233a> {

        /* renamed from: a */
        public int f169719a;

        /* renamed from: b */
        private int f169720b;

        public String toString() {
            return "IndexNode: index=" + this.f169719a + ", zIndex=" + this.f169720b;
        }

        /* renamed from: a */
        public int compareTo(C67233a aVar) {
            int i = this.f169720b;
            int i2 = aVar.f169720b;
            if (i > i2) {
                return 1;
            }
            if (i < i2) {
                return -1;
            }
            return 0;
        }

        public C67233a(int i, int i2) {
            this.f169719a = i;
            this.f169720b = i2;
        }
    }

    /* renamed from: b */
    private boolean m262033b() {
        NativeViewManager nativeViewManager;
        RenderViewManager.IRender currentIRender = AppbrandApplicationImpl.getInst(this.f169716m).getRenderViewManager().getCurrentIRender();
        if (currentIRender == null || (nativeViewManager = currentIRender.getNativeViewManager()) == null) {
            return true;
        }
        View focusedInput = nativeViewManager.getFocusedInput();
        if (focusedInput instanceof AbstractC65853c) {
            return ((AbstractC65853c) focusedInput).mo230589b();
        }
        return false;
    }

    /* renamed from: c */
    private void m262035c() {
        int childCount = getChildCount();
        if (childCount >= 1) {
            this.f169706c.clear();
            this.f169707d.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getLayoutParams() instanceof C67234b) {
                    this.f169706c.add(new C67233a(i, ((C67234b) childAt.getLayoutParams()).f169723c));
                }
            }
            Collections.sort(this.f169706c);
            for (int i2 = 0; i2 < childCount; i2++) {
                this.f169707d.add(Integer.valueOf(this.f169706c.get(i2).f169719a));
            }
            if (DebugUtil.debug()) {
                m262036d();
            }
        }
    }

    /* renamed from: d */
    private void m262036d() {
        StringBuilder sb = new StringBuilder();
        if (this.f169706c != null) {
            for (int i = 0; i < this.f169706c.size(); i++) {
                sb.append("[");
                sb.append(this.f169706c.get(i).toString());
                sb.append("]");
            }
        }
        sb.append("\n");
        if (this.f169707d != null) {
            for (int i2 = 0; i2 < this.f169707d.size(); i2++) {
                sb.append("(");
                sb.append("key=" + i2 + ", value=" + this.f169707d.get(i2));
                sb.append(")");
            }
        }
        AppBrandLogger.m52830i("tma_AbsoluteLayout", sb.toString());
    }

    /* renamed from: a */
    public boolean mo233800a() {
        RenderViewManager.IRender currentIRender = AppbrandApplicationImpl.getInst(this.f169716m).getRenderViewManager().getCurrentIRender();
        if (currentIRender != null) {
            return currentIRender.isRenderInBrowserEnabled();
        }
        return false;
    }

    /* renamed from: com.tt.miniapp.view.webcore.a$b */
    public static class C67234b extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public int f169721a;

        /* renamed from: b */
        public int f169722b;

        /* renamed from: c */
        public int f169723c;

        /* renamed from: d */
        public boolean f169724d;

        public C67234b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C67234b(int i, int i2, int i3, int i4) {
            super(i, i2);
            this.f169721a = i3;
            this.f169722b = i4;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C67234b;
    }

    public void setOppositeAbsoluteLayout(C67231a aVar) {
        this.f169717n = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C67234b(layoutParams);
    }

    /* renamed from: a */
    private boolean m262032a(MotionEvent motionEvent) {
        if (m262037e()) {
            return !m262034b(motionEvent);
        }
        return true;
    }

    /* renamed from: b */
    public C67235c mo233801b(int i) {
        return this.f169709f.get(i);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C67160b bVar = this.f169715l;
        if (bVar != null) {
            bVar.mo233531a(view);
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        C67160b bVar = this.f169715l;
        if (bVar != null) {
            bVar.mo233533b(view);
        }
    }

    /* renamed from: a */
    private void m262031a(Context context) {
        setChildrenDrawingOrderEnabled(true);
        C67160b bVar = new C67160b(this);
        this.f169715l = bVar;
        bVar.mo233532a(new C67160b.AbstractC67162a() {
            /* class com.tt.miniapp.view.webcore.C67231a.C672321 */

            @Override // com.tt.miniapp.view.C67160b.AbstractC67162a
            /* renamed from: a */
            public void mo230766a(View view, boolean z) {
                if (view instanceof C67160b.AbstractC67162a) {
                    ((C67160b.AbstractC67162a) view).mo230766a(view, z);
                }
            }
        });
        this.f169705b = new ArrayList();
    }

    public void removeView(View view) {
        this.f169708e.delete(view.getId());
        this.f169709f.delete(view.getId());
        super.removeView(view);
    }

    /* renamed from: a */
    public void mo233795a(int i) {
        C67235c cVar = this.f169709f.get(i);
        if (cVar != null) {
            cVar.mo233824c(getCurScrollX());
            cVar.mo233825d(getCurScrollY());
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        AppBrandLogger.m52830i("tma_AbsoluteLayout", "dispatchTouchEvent: consumed = ", Boolean.valueOf(dispatchTouchEvent), " event action = ", Integer.valueOf(motionEvent.getAction()));
        return dispatchTouchEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (C66493a.m259858a(this.f169716m) != 0 && m262033b() && m262032a(motionEvent)) {
            C67047m.m261304a(this.f169716m.getCurrentActivity());
            HostDependManager.getInst().clearFocusWhenHideSoftKeyboard(this.f169716m);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: b */
    private boolean m262034b(MotionEvent motionEvent) {
        if (!mo233800a() || motionEvent.getAction() != 0) {
            return false;
        }
        if (this.f169717n == null || !m262038f()) {
            return !this.f169704a.mo233948a().onTouchEvent(motionEvent);
        }
        return this.f169717n.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public void mo233798a(View view) {
        C67235c a = C67235c.m262048a();
        a.f169725a = getCurScrollX();
        a.f169726b = getCurScrollY();
        mo233799a(view, a);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        Integer num;
        if (i != this.f169707d.size() || (num = this.f169707d.get(i2)) == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        WebViewWrapper kVar = this.f169704a;
        if (kVar != null) {
            int measuredWidth = kVar.mo233948a().getMeasuredWidth();
            this.f169704a.mo233948a().getContentHeight();
            float f = getResources().getDisplayMetrics().density;
            setMeasuredDimension(measuredWidth, Integer.MAX_VALUE);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    /* renamed from: a */
    public void mo233799a(View view, C67235c cVar) {
        this.f169708e.put(view.getId(), view);
        if (cVar == null) {
            cVar = C67235c.m262048a();
        }
        this.f169709f.put(view.getId(), cVar);
    }

    /* renamed from: a */
    public void mo233796a(int i, int i2, int i3) {
        View view;
        this.f169713j = i2;
        this.f169714k = i3;
        if (i != -1) {
            C67235c cVar = this.f169709f.get(i);
            if (cVar == null) {
                AppBrandLogger.m52829e("tma_AbsoluteLayout", "onBackScrollChanged: viewId=" + i + ", offset=null");
                return;
            }
            int a = cVar.mo233822a(i2);
            int b = cVar.mo233823b(i3);
            AppBrandLogger.m52830i("tma_AbsoluteLayout", "onBackScrollChanged: viewId=" + i + ", scrollY=" + i3 + ", offsetY=" + b);
            if ((a != 0 || b != 0) && (view = this.f169708e.get(i)) != null && view.getVisibility() != 8 && (view.getLayoutParams() instanceof C67234b)) {
                C67234b bVar = (C67234b) view.getLayoutParams();
                bVar.f169721a -= a;
                bVar.f169722b -= b;
                view.offsetLeftAndRight(-a);
                view.offsetTopAndBottom(-b);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        AppBrandLogger.m52830i("tma_AbsoluteLayout", "onScrollChanged : ");
    }

    public C67231a(Context context, WebViewWrapper kVar, int i, IAppContext iAppContext) {
        super(context);
        this.f169716m = iAppContext;
        this.f169704a = kVar;
        this.f169710g = i;
        m262031a(context);
    }

    /* renamed from: a */
    public void mo233797a(int i, int i2, int i3, int i4) {
        int childCount;
        this.f169711h = i;
        this.f169712i = i2;
        int i5 = i - i3;
        int i6 = i2 - i4;
        if (!(i5 == 0 && i6 == 0) && (childCount = getChildCount()) >= 1) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8 && (childAt.getLayoutParams() instanceof C67234b)) {
                    C67234b bVar = (C67234b) childAt.getLayoutParams();
                    if (!bVar.f169724d) {
                        bVar.f169721a -= i5;
                        bVar.f169722b -= i6;
                        childAt.offsetLeftAndRight(-i5);
                        childAt.offsetTopAndBottom(-i6);
                    }
                }
            }
            C67160b bVar2 = this.f169715l;
            if (bVar2 != null) {
                bVar2.mo233530a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AppBrandLogger.m52828d("tma_AbsoluteLayout", "onLayout");
        m262035c();
        int childCount = getChildCount();
        if (childCount >= 1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8) {
                    C67234b bVar = (C67234b) childAt.getLayoutParams();
                    int i6 = bVar.f169721a;
                    int i7 = bVar.f169722b;
                    AppBrandLogger.m52830i("tma_AbsoluteLayout", "onLayout: viewId=" + childAt.getId() + ", top=" + i7);
                    childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
                }
            }
        }
    }
}
