package com.scwang.smartrefresh.layout.p1235b;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ScrollingView;
import androidx.core.widget.NestedScrollView;
import androidx.legacy.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27124c;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27130i;
import com.scwang.smartrefresh.layout.p1237d.C27145c;
import java.util.Collections;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.scwang.smartrefresh.layout.b.a */
public class C27131a implements AbstractC27124c {

    /* renamed from: a */
    protected int f67440a = Integer.MAX_VALUE;

    /* renamed from: b */
    protected int f67441b = (Integer.MAX_VALUE - 1);

    /* renamed from: c */
    protected View f67442c;

    /* renamed from: d */
    protected View f67443d;

    /* renamed from: e */
    protected View f67444e;

    /* renamed from: f */
    protected View f67445f;

    /* renamed from: g */
    protected View f67446g;

    /* renamed from: h */
    protected boolean f67447h = true;

    /* renamed from: i */
    protected boolean f67448i = true;

    /* renamed from: j */
    protected MotionEvent f67449j;

    /* renamed from: k */
    protected C27136d f67450k = new C27136d();

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: h */
    public void mo96479h() {
        this.f67449j = null;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: e */
    public View mo96476e() {
        return this.f67442c;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: f */
    public View mo96477f() {
        return this.f67444e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo96486a(View view) {
        return (view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof ScrollingView) || (view instanceof NestedScrollingChild) || (view instanceof NestedScrollingParent) || (view instanceof WebView) || (view instanceof ViewPager);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: a */
    public boolean mo96469a() {
        return this.f67447h && this.f67450k.mo96480a(this.f67442c);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: a */
    public void mo96466a(AbstractC27128g gVar, View view, View view2) {
        mo96484a(this.f67442c, gVar);
        if (view != null || view2 != null) {
            this.f67445f = view;
            this.f67446g = view2;
            FrameLayout frameLayout = new FrameLayout(this.f67442c.getContext());
            gVar.mo96459a().getLayout().removeView(this.f67442c);
            ViewGroup.LayoutParams layoutParams = this.f67442c.getLayoutParams();
            frameLayout.addView(this.f67442c, -1, -1);
            gVar.mo96459a().getLayout().addView(frameLayout, layoutParams);
            this.f67442c = frameLayout;
            if (view != null) {
                view.setClickable(true);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeView(view);
                layoutParams2.height = m98611b(view);
                viewGroup.addView(new Space(this.f67442c.getContext()), indexOfChild, layoutParams2);
                frameLayout.addView(view);
            }
            if (view2 != null) {
                view2.setClickable(true);
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
                int indexOfChild2 = viewGroup2.indexOfChild(view2);
                viewGroup2.removeView(view2);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(layoutParams3);
                layoutParams3.height = m98611b(view2);
                viewGroup2.addView(new Space(this.f67442c.getContext()), indexOfChild2, layoutParams3);
                layoutParams4.gravity = 80;
                frameLayout.addView(view2, layoutParams4);
            }
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: a */
    public void mo96467a(AbstractC27130i iVar) {
        if (iVar instanceof C27136d) {
            this.f67450k = (C27136d) iVar;
        } else {
            this.f67450k.mo96489a(iVar);
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: a */
    public void mo96468a(boolean z) {
        this.f67450k.mo96490a(z);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: c */
    public int mo96473c() {
        return this.f67442c.getMeasuredWidth();
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: d */
    public int mo96475d() {
        return this.f67442c.getMeasuredHeight();
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: g */
    public ViewGroup.LayoutParams mo96478g() {
        return this.f67442c.getLayoutParams();
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: b */
    public boolean mo96472b() {
        if (!this.f67448i || !this.f67450k.mo96481b(this.f67442c)) {
            return false;
        }
        return true;
    }

    public C27131a(View view) {
        this.f67443d = view;
        this.f67442c = view;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: a */
    public void mo96462a(int i) {
        this.f67443d.setTranslationY((float) i);
        View view = this.f67445f;
        if (view != null) {
            view.setTranslationY((float) Math.max(0, i));
        }
        View view2 = this.f67446g;
        if (view2 != null) {
            view2.setTranslationY((float) Math.min(0, i));
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: c */
    public ValueAnimator.AnimatorUpdateListener mo96474c(int i) {
        View view = this.f67444e;
        if (view == null || i == 0) {
            return null;
        }
        if ((i >= 0 || !C27145c.m98686b(view)) && (i <= 0 || !C27145c.m98682a(this.f67444e))) {
            return null;
        }
        return new ValueAnimator.AnimatorUpdateListener(i) {
            /* class com.scwang.smartrefresh.layout.p1235b.C27131a.C271332 */

            /* renamed from: a */
            int f67453a;

            /* renamed from: b */
            final /* synthetic */ int f67454b;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                try {
                    if (C27131a.this.f67444e instanceof AbsListView) {
                        C27131a.m98610a((AbsListView) C27131a.this.f67444e, intValue - this.f67453a);
                    } else {
                        C27131a.this.f67444e.scrollBy(0, intValue - this.f67453a);
                    }
                } catch (Throwable unused) {
                }
                this.f67453a = intValue;
            }

            {
                this.f67454b = r2;
                this.f67453a = r2;
            }
        };
    }

    public C27131a(Context context) {
        View view = new View(context);
        this.f67443d = view;
        this.f67442c = view;
    }

    /* renamed from: b */
    protected static int m98611b(View view) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        if (layoutParams.height > 0) {
            i = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
        } else {
            i = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, i);
        return view.getMeasuredHeight();
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: b */
    public void mo96470b(int i) {
        View view = this.f67444e;
        if (view instanceof ScrollView) {
            ((ScrollView) view).fling(i);
        } else if (view instanceof AbsListView) {
            if (Build.VERSION.SDK_INT >= 21) {
                ((AbsListView) this.f67444e).fling(i);
            }
        } else if (view instanceof WebView) {
            ((WebView) view).flingScroll(0, i);
        } else if (view instanceof RecyclerView) {
            ((RecyclerView) view).fling(0, i);
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).mo4756d(i);
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: a */
    public void mo96465a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        this.f67449j = obtain;
        obtain.offsetLocation((float) (-this.f67442c.getLeft()), (float) (-this.f67442c.getTop()));
        this.f67450k.mo96488a(this.f67449j);
        this.f67444e = mo96482a(this.f67442c, this.f67449j, this.f67444e);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: a */
    public void mo96463a(int i, int i2) {
        this.f67442c.measure(i, i2);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: b */
    public void mo96471b(int i, int i2) {
        this.f67440a = i;
        this.f67441b = i2;
    }

    /* renamed from: a */
    protected static void m98610a(AbsListView absListView, int i) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            absListView.scrollListBy(i);
        } else if (absListView instanceof ListView) {
            int firstVisiblePosition = absListView.getFirstVisiblePosition();
            if (firstVisiblePosition != -1 && (childAt = absListView.getChildAt(0)) != null) {
                ((ListView) absListView).setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
            }
        } else {
            absListView.smoothScrollBy(i, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo96483a(View view, boolean z) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(Collections.singletonList(view));
        View view2 = null;
        while (!linkedBlockingQueue.isEmpty() && view2 == null) {
            View view3 = (View) linkedBlockingQueue.poll();
            if (view3 != null) {
                if ((z || view3 != view) && mo96486a(view3)) {
                    view2 = view3;
                } else if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        linkedBlockingQueue.add(viewGroup.getChildAt(i));
                    }
                }
            }
        }
        return view2 == null ? view : view2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96484a(View view, AbstractC27128g gVar) {
        boolean z;
        this.f67444e = null;
        while (true) {
            View view2 = this.f67444e;
            if (view2 == null || ((view2 instanceof NestedScrollingParent) && !(view2 instanceof NestedScrollingChild))) {
                if (view2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                view = mo96483a(view, z);
                if (view != this.f67444e) {
                    try {
                        if (view instanceof CoordinatorLayout) {
                            gVar.mo96459a().mo96390g(false);
                            mo96485a((ViewGroup) view, gVar.mo96459a());
                        }
                    } catch (Throwable unused) {
                    }
                    this.f67444e = view;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96485a(ViewGroup viewGroup, final AbstractC27129h hVar) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof AppBarLayout) {
                ((AppBarLayout) childAt).addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new AppBarLayout.AbstractC22134b() {
                    /* class com.scwang.smartrefresh.layout.p1235b.C27131a.C271321 */

                    @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
                    public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                        boolean z;
                        C27131a aVar = C27131a.this;
                        boolean z2 = true;
                        if (i >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        aVar.f67447h = z;
                        C27131a aVar2 = C27131a.this;
                        if (!hVar.mo96432u() || appBarLayout.getTotalScrollRange() + i > 0) {
                            z2 = false;
                        }
                        aVar2.f67448i = z2;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo96482a(View view, MotionEvent motionEvent, View view2) {
        if ((view instanceof ViewGroup) && motionEvent != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (C27145c.m98685a(viewGroup, childAt, motionEvent.getX(), motionEvent.getY(), pointF)) {
                    if (!(childAt instanceof ViewPager) && mo96486a(childAt)) {
                        return childAt;
                    } else {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.offsetLocation(pointF.x, pointF.y);
                        return mo96482a(childAt, obtain, view2);
                    }
                }
            }
        }
        return view2;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27124c
    /* renamed from: a */
    public void mo96464a(int i, int i2, int i3, int i4) {
        this.f67442c.layout(i, i2, i3, i4);
    }
}
