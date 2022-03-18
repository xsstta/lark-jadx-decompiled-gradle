package com.bytedance.ies.xelement.swiper;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* access modifiers changed from: package-private */
public class ViewPager extends ViewGroup {

    /* renamed from: a */
    public final Scroller f38461a;

    /* renamed from: b */
    public int f38462b;

    /* renamed from: c */
    public boolean f38463c;

    /* renamed from: d */
    public final int f38464d;

    /* renamed from: e */
    public final List<AbstractC14548d> f38465e;

    /* renamed from: f */
    public boolean f38466f;

    /* renamed from: g */
    public boolean f38467g;

    /* renamed from: h */
    private int f38468h;

    /* renamed from: i */
    private int f38469i;

    /* renamed from: j */
    private boolean f38470j;

    /* renamed from: k */
    private int f38471k;

    /* renamed from: l */
    private int f38472l;

    /* renamed from: m */
    private int f38473m;

    /* renamed from: n */
    private float f38474n;

    /* renamed from: o */
    private AbstractC14546b f38475o;

    /* renamed from: p */
    private AbstractC14555a f38476p;

    /* renamed from: q */
    private int f38477q;

    /* renamed from: r */
    private boolean f38478r;

    /* renamed from: s */
    private AbstractC14547c f38479s;

    /* renamed from: t */
    private final GestureDetector f38480t;

    /* renamed from: com.bytedance.ies.xelement.swiper.ViewPager$b */
    public interface AbstractC14546b {
        /* renamed from: a */
        void mo53579a(int i, int i2);
    }

    /* renamed from: com.bytedance.ies.xelement.swiper.ViewPager$c */
    public interface AbstractC14547c {
        /* renamed from: a */
        void mo53580a(View view);

        /* renamed from: a */
        void mo53581a(View view, int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.swiper.ViewPager$d */
    public static abstract class AbstractC14548d {

        /* renamed from: a */
        boolean f38483a;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo53585b(float f) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo53586c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo53587d() {
        }

        AbstractC14548d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo53582a() {
            if (!this.f38483a) {
                this.f38483a = true;
                mo53586c();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo53584b() {
            if (this.f38483a) {
                this.f38483a = false;
                mo53587d();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo53583a(float f) {
            mo53585b(f);
        }
    }

    /* renamed from: a */
    public int mo53552a() {
        return this.f38468h;
    }

    /* renamed from: c */
    public int mo53566c() {
        return this.f38473m;
    }

    public void requestLayout() {
        super.requestLayout();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ies.xelement.swiper.ViewPager$a */
    public static class C14545a extends ViewGroup.LayoutParams {

        /* renamed from: a */
        int f38482a;

        public C14545a() {
            super(-1, -1);
        }
    }

    /* renamed from: d */
    private int m58833d() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: e */
    private void m58835e() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount > -1) {
                m58831b(getChildAt(childCount));
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    private List<View> m58837g() {
        int childCount = getChildCount();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < childCount; i++) {
            linkedList.add(getChildAt(i));
        }
        return linkedList;
    }

    /* renamed from: h */
    private void m58838h() {
        if (getChildCount() >= 1) {
            int paddingLeft = getPaddingLeft() + mo53566c() + (mo53562b() / 2);
            int scrollX = getScrollX();
            View i = m58839i();
            this.f38461a.startScroll(scrollX, 0, ((((i.getLeft() - scrollX) + i.getRight()) - scrollX) / 2) - paddingLeft, 0, this.f38469i);
            invalidate();
        }
    }

    /* renamed from: j */
    private void m58840j() {
        if (this.f38479s != null) {
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount > -1) {
                    View childAt = getChildAt(childCount);
                    this.f38479s.mo53581a(childAt, ((childAt.getLeft() - getScrollX()) - mo53566c()) - getPaddingLeft());
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public int mo53562b() {
        int i = this.f38472l;
        if (i > 0) {
            return i;
        }
        int d = m58833d();
        float f = this.f38474n;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            return (int) Math.ceil((double) (((float) d) * f));
        }
        return d;
    }

    public void computeScroll() {
        AbstractC14546b bVar;
        if (this.f38461a.computeScrollOffset()) {
            scrollTo(this.f38461a.getCurrX(), getScrollY());
            invalidate();
        } else if (getChildCount() >= 1 && !this.f38466f) {
            int i = this.f38468h;
            int i2 = ((C14545a) m58839i().getLayoutParams()).f38482a;
            this.f38468h = i2;
            if (i != i2 && (bVar = this.f38475o) != null) {
                bVar.mo53579a(i, i2);
            }
        }
    }

    /* renamed from: i */
    private View m58839i() {
        int paddingLeft = getPaddingLeft() + mo53566c() + (mo53562b() / 2);
        int scrollX = getScrollX();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int left = childAt.getLeft() - scrollX;
            int right = childAt.getRight() - scrollX;
            int i2 = this.f38462b;
            if (i2 > 0) {
                right += this.f38471k;
            } else if (i2 < 0) {
                left -= this.f38471k;
            }
            if (left <= paddingLeft && right >= paddingLeft) {
                return childAt;
            }
        }
        return getChildAt(0);
    }

    /* renamed from: f */
    private void m58836f() {
        int b;
        int i;
        int i2;
        int i3;
        if (this.f38477q >= 1 && (b = mo53562b()) > 0) {
            int scrollX = getScrollX();
            int i4 = this.f38471k + b;
            if (i4 > 0) {
                int paddingTop = getPaddingTop();
                List<View> g = m58837g();
                if (scrollX >= 0) {
                    i = (scrollX / i4) % this.f38477q;
                    i2 = scrollX - (scrollX % i4);
                } else {
                    int i5 = scrollX / i4;
                    int i6 = scrollX % i4;
                    if (i6 != 0) {
                        i5--;
                    }
                    int i7 = this.f38477q;
                    i = ((i5 % i7) + i7) % i7;
                    if (i6 == 0) {
                        i3 = -this.f38471k;
                    } else {
                        i3 = b;
                    }
                    i2 = ((scrollX - i3) - i6) - this.f38471k;
                }
                int max = scrollX + Math.max(0, (getWidth() - getPaddingRight()) - this.f38471k);
                while (true) {
                    View e = m58834e(i);
                    g.remove(e);
                    int i8 = i2 + b;
                    int measuredHeight = e.getMeasuredHeight() + paddingTop;
                    if (!(i2 == e.getLeft() && paddingTop == e.getTop() && i8 == e.getRight() && measuredHeight == e.getBottom())) {
                        e.layout(i2, paddingTop, i8, measuredHeight);
                    }
                    m58840j();
                    if (i8 >= max) {
                        break;
                    }
                    i2 = this.f38471k + i8;
                    i = (i + 1) % this.f38477q;
                }
                for (View view : g) {
                    m58830a(view);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo53565b(boolean z) {
        this.f38470j = z;
    }

    public ViewPager(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo53554a(int i) {
        this.f38469i = i;
    }

    /* renamed from: a */
    public void mo53553a(float f) {
        this.f38472l = -1;
        this.f38474n = f;
        mo53559a(this.f38476p);
    }

    /* renamed from: b */
    public void mo53564b(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f38471k = i;
        mo53559a(this.f38476p);
    }

    /* renamed from: c */
    public void mo53567c(int i) {
        this.f38474n = -1.0f;
        this.f38472l = i;
        mo53559a(this.f38476p);
    }

    /* renamed from: a */
    private void m58830a(View view) {
        removeView(view);
        AbstractC14547c cVar = this.f38479s;
        if (cVar != null) {
            cVar.mo53580a(view);
        }
        this.f38476p.mo53613a(this, ((C14545a) view.getLayoutParams()).f38482a, view);
    }

    /* renamed from: b */
    private void m58831b(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(mo53562b(), 1073741824), m58832c(view));
    }

    /* renamed from: d */
    public void mo53569d(int i) {
        int i2 = this.f38473m;
        this.f38473m = i;
        scrollBy(i2 - i, 0);
    }

    /* renamed from: e */
    private View m58834e(int i) {
        for (int childCount = getChildCount() - 1; childCount > -1; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C14545a) childAt.getLayoutParams()).f38482a == i) {
                return childAt;
            }
        }
        View a = this.f38476p.mo53612a(this, i);
        C14545a aVar = new C14545a();
        aVar.f38482a = i;
        addViewInLayout(a, 0, aVar, true);
        m58831b(a);
        return a;
    }

    /* renamed from: a */
    public void mo53556a(AbstractC14546b bVar) {
        this.f38475o = bVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            this.f38466f = false;
            if (!this.f38463c) {
                m58838h();
            }
        }
        if (this.f38478r) {
            return this.f38480t.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: c */
    private int m58832c(View view) {
        C14545a aVar = (C14545a) view.getLayoutParams();
        if (aVar.height >= 0) {
            return View.MeasureSpec.makeMeasureSpec(aVar.height, 1073741824);
        }
        int max = Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (aVar.height == -1) {
            return View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        }
        if (aVar.height == -2) {
            return View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 1073741824);
    }

    /* renamed from: b */
    public void mo53563b(float f) {
        if (getChildCount() >= 1) {
            int paddingLeft = getPaddingLeft() + mo53566c();
            int scrollX = getScrollX();
            int i = 0;
            if (f < BitmapDescriptorFactory.HUE_RED) {
                int childCount = getChildCount();
                int i2 = Integer.MAX_VALUE;
                while (i < childCount) {
                    int left = getChildAt(i).getLeft() - scrollX;
                    if (left > paddingLeft && left < i2) {
                        i2 = left;
                    }
                    i++;
                }
                if (i2 != Integer.MAX_VALUE) {
                    this.f38461a.startScroll(scrollX, 0, i2 - paddingLeft, 0, this.f38469i);
                }
            } else {
                int childCount2 = getChildCount();
                int i3 = Integer.MIN_VALUE;
                while (i < childCount2) {
                    int left2 = getChildAt(i).getLeft() - scrollX;
                    if (left2 < paddingLeft && left2 > i3) {
                        i3 = left2;
                    }
                    i++;
                }
                if (i3 != Integer.MIN_VALUE) {
                    this.f38461a.startScroll(scrollX, 0, i3 - paddingLeft, 0, this.f38469i);
                }
            }
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo53557a(AbstractC14547c cVar) {
        if (this.f38479s != null) {
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount <= -1) {
                    break;
                }
                this.f38479s.mo53580a(getChildAt(childCount));
            }
        }
        this.f38479s = cVar;
        m58840j();
    }

    /* renamed from: a */
    public void mo53558a(AbstractC14548d dVar) {
        this.f38465e.add(dVar);
    }

    /* renamed from: a */
    public void mo53559a(AbstractC14555a aVar) {
        if (this.f38476p != null) {
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount <= -1) {
                    break;
                }
                m58830a(getChildAt(childCount));
            }
        } else {
            removeAllViews();
        }
        this.f38476p = aVar;
        if (aVar != null) {
            this.f38477q = aVar.mo53611a();
            setScrollX((-mo53566c()) - getPaddingLeft());
            requestLayout();
        }
    }

    /* renamed from: a */
    public void mo53560a(boolean z) {
        this.f38478r = z;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38468h = -1;
        this.f38469i = LocationRequest.PRIORITY_INDOOR;
        this.f38474n = 1.0f;
        this.f38465e = new ArrayList();
        this.f38478r = true;
        this.f38467g = false;
        this.f38480t = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ies.xelement.swiper.ViewPager.C145441 */

            public boolean onDown(MotionEvent motionEvent) {
                ViewPager.this.f38463c = false;
                ViewPager.this.f38462b = 0;
                ViewPager.this.f38466f = true;
                ViewPager.this.f38467g = true;
                return true;
            }

            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                boolean onFling = super.onFling(motionEvent, motionEvent2, f, f2);
                if (f >= ((float) (-ViewPager.this.f38464d)) && f <= ((float) ViewPager.this.f38464d)) {
                    return onFling;
                }
                ViewPager.this.f38463c = true;
                ViewPager.this.f38461a.abortAnimation();
                ViewPager.this.mo53563b(f);
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }

            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                ViewPager.this.getParent().requestDisallowInterceptTouchEvent(true);
                if (ViewPager.this.f38467g) {
                    ViewPager.this.f38467g = false;
                    for (AbstractC14548d dVar : ViewPager.this.f38465e) {
                        dVar.mo53582a();
                    }
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.f38462b = (int) (((float) viewPager.f38462b) + f);
                ViewPager.this.scrollBy((int) (((double) f) + 0.5d), 0);
                return super.onScroll(motionEvent, motionEvent2, f, f2);
            }
        });
        this.f38464d = (int) (getResources().getDisplayMetrics().density * 600.0f);
        this.f38461a = new Scroller(context, new LinearInterpolator());
    }

    /* renamed from: a */
    public void mo53555a(int i, boolean z) {
        int i2;
        if (this.f38477q >= 1 && getChildCount() >= 1) {
            if (i < 0) {
                i = 0;
            }
            int i3 = this.f38477q;
            if (i >= i3) {
                i = i3 - 1;
            }
            int b = mo53562b();
            int paddingLeft = getPaddingLeft() + mo53566c() + (b / 2);
            int scrollX = getScrollX();
            View i4 = m58839i();
            int i5 = (i - ((C14545a) i4.getLayoutParams()).f38482a) * (b + this.f38471k);
            int left = (((i4.getLeft() - scrollX) + i4.getRight()) - scrollX) / 2;
            for (AbstractC14548d dVar : this.f38465e) {
                dVar.mo53582a();
            }
            Scroller scroller = this.f38461a;
            int i6 = (left - paddingLeft) + i5;
            if (z) {
                i2 = this.f38469i;
            } else {
                i2 = 0;
            }
            scroller.startScroll(scrollX, 0, i6, 0, i2);
            invalidate();
        }
    }

    public void scrollTo(int i, int i2) {
        if (this.f38470j) {
            super.scrollTo(i, i2);
            m58836f();
        } else {
            int i3 = (-getPaddingLeft()) - this.f38473m;
            if (i < i3) {
                i = i3;
            }
            int b = (((this.f38477q - 1) * (mo53562b() + this.f38471k)) - getPaddingLeft()) - mo53566c();
            if (i > b) {
                i = b;
            }
            super.scrollTo(i, i2);
            m58836f();
        }
        for (AbstractC14548d dVar : this.f38465e) {
            dVar.mo53583a((float) i);
        }
        if (!this.f38466f && this.f38461a.isFinished()) {
            for (AbstractC14548d dVar2 : this.f38465e) {
                dVar2.mo53584b();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalStateException();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        super.setPadding(i, i2, i3, i4);
        scrollBy(paddingLeft - i, 0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m58835e();
        m58836f();
    }
}
