package com.scwang.smart.refresh.layout.p1233e;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.suite.R;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27080b;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27083e;
import com.scwang.smart.refresh.layout.p1230b.AbstractC27085a;
import com.scwang.smart.refresh.layout.p1230b.AbstractC27094j;
import com.scwang.smart.refresh.layout.p1231c.C27095a;
import com.scwang.smart.refresh.layout.p1232d.C27100a;
import com.scwang.smart.refresh.layout.p1232d.animationInterpolatorC27102b;
import java.util.LinkedList;

/* renamed from: com.scwang.smart.refresh.layout.e.a */
public class C27103a implements ValueAnimator.AnimatorUpdateListener, AbstractC27080b, AbstractC27085a {

    /* renamed from: a */
    protected View f67353a;

    /* renamed from: b */
    protected View f67354b;

    /* renamed from: c */
    protected View f67355c;

    /* renamed from: d */
    protected View f67356d;

    /* renamed from: e */
    protected View f67357e;

    /* renamed from: f */
    protected int f67358f;

    /* renamed from: g */
    protected boolean f67359g = true;

    /* renamed from: h */
    protected boolean f67360h = true;

    /* renamed from: i */
    protected C27095a f67361i = new C27095a();

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27080b
    /* renamed from: a */
    public View mo96300a() {
        return this.f67353a;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27080b
    /* renamed from: b */
    public View mo96306b() {
        return this.f67355c;
    }

    @Override // com.scwang.smart.refresh.layout.p1230b.AbstractC27085a
    /* renamed from: a */
    public void mo96310a(boolean z, boolean z2) {
        this.f67359g = z;
        this.f67360h = z2;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27080b
    /* renamed from: c */
    public boolean mo96307c() {
        if (!this.f67359g || !this.f67361i.mo96325a(this.f67353a)) {
            return false;
        }
        return true;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27080b
    /* renamed from: d */
    public boolean mo96308d() {
        if (!this.f67360h || !this.f67361i.mo96326b(this.f67353a)) {
            return false;
        }
        return true;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27080b
    /* renamed from: a */
    public void mo96305a(boolean z) {
        this.f67361i.f67318c = z;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27080b
    /* renamed from: a */
    public void mo96304a(AbstractC27094j jVar) {
        if (jVar instanceof C27095a) {
            this.f67361i = (C27095a) jVar;
        } else {
            this.f67361i.f67317b = jVar;
        }
    }

    public C27103a(View view) {
        this.f67355c = view;
        this.f67354b = view;
        this.f67353a = view;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27080b
    /* renamed from: a */
    public ValueAnimator.AnimatorUpdateListener mo96299a(int i) {
        View view = this.f67355c;
        if (view == null || i == 0) {
            return null;
        }
        if ((i >= 0 || !view.canScrollVertically(1)) && (i <= 0 || !this.f67355c.canScrollVertically(-1))) {
            return null;
        }
        this.f67358f = i;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27080b
    /* renamed from: a */
    public void mo96302a(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset((float) (-this.f67353a.getLeft()), (float) (-this.f67353a.getTop()));
        View view = this.f67355c;
        View view2 = this.f67353a;
        if (view != view2) {
            this.f67355c = mo96334a(view2, pointF, view);
        }
        if (this.f67355c == this.f67353a) {
            this.f67361i.f67316a = null;
        } else {
            this.f67361i.f67316a = pointF;
        }
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = ((float) (intValue - this.f67358f)) * this.f67355c.getScaleY();
            View view = this.f67355c;
            if (view instanceof AbsListView) {
                animationInterpolatorC27102b.m98453a((AbsListView) view, (int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f67358f = intValue;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo96335a(View view, boolean z) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = linkedList;
        linkedList2.add(view);
        View view2 = null;
        while (linkedList2.size() > 0 && view2 == null) {
            View view3 = (View) linkedList.poll();
            if (view3 != null) {
                if ((z || view3 != view) && animationInterpolatorC27102b.m98459c(view3)) {
                    view2 = view3;
                } else if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        linkedList2.add(viewGroup.getChildAt(i));
                    }
                }
            }
        }
        return view2 == null ? view : view2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96336a(View view, AbstractC27083e eVar) {
        boolean z;
        boolean isInEditMode = this.f67353a.isInEditMode();
        View view2 = null;
        while (true) {
            if (view2 != null && (!(view2 instanceof NestedScrollingParent) || (view2 instanceof NestedScrollingChild))) {
                break;
            }
            if (view2 == null) {
                z = true;
            } else {
                z = false;
            }
            view = mo96335a(view, z);
            if (view == view2) {
                break;
            }
            if (!isInEditMode) {
                C27100a.m98448a(view, eVar, this);
            }
            view2 = view;
        }
        if (view2 != null) {
            this.f67355c = view2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo96334a(View view, PointF pointF, View view2) {
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (animationInterpolatorC27102b.m98456a(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && animationInterpolatorC27102b.m98459c(childAt)) {
                        return childAt;
                    } else {
                        pointF.offset(pointF2.x, pointF2.y);
                        View a = mo96334a(childAt, pointF, view2);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return a;
                    }
                }
            }
        }
        return view2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27080b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo96301a(int r6, int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.p1233e.C27103a.mo96301a(int, int, int):void");
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27080b
    /* renamed from: a */
    public void mo96303a(AbstractC27083e eVar, View view, View view2) {
        mo96336a(this.f67353a, eVar);
        if (view != null || view2 != null) {
            this.f67356d = view;
            this.f67357e = view2;
            FrameLayout frameLayout = new FrameLayout(this.f67353a.getContext());
            int indexOfChild = eVar.mo96287a().getLayout().indexOfChild(this.f67353a);
            eVar.mo96287a().getLayout().removeView(this.f67353a);
            frameLayout.addView(this.f67353a, 0, new ViewGroup.LayoutParams(-1, -1));
            eVar.mo96287a().getLayout().addView(frameLayout, indexOfChild, this.f67353a.getLayoutParams());
            this.f67353a = frameLayout;
            if (view != null) {
                view.setTag(R.id.srl_tag, "fixed-top");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                int indexOfChild2 = viewGroup.indexOfChild(view);
                viewGroup.removeView(view);
                layoutParams.height = animationInterpolatorC27102b.m98451a(view);
                viewGroup.addView(new Space(this.f67353a.getContext()), indexOfChild2, layoutParams);
                frameLayout.addView(view, 1, layoutParams);
            }
            if (view2 != null) {
                view2.setTag(R.id.srl_tag, "fixed-bottom");
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
                int indexOfChild3 = viewGroup2.indexOfChild(view2);
                viewGroup2.removeView(view2);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
                layoutParams2.height = animationInterpolatorC27102b.m98451a(view2);
                viewGroup2.addView(new Space(this.f67353a.getContext()), indexOfChild3, layoutParams2);
                layoutParams3.gravity = 80;
                frameLayout.addView(view2, 1, layoutParams3);
            }
        }
    }
}
