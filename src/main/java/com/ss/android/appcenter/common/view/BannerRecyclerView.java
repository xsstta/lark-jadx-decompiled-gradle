package com.ss.android.appcenter.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.util.ArrayList;
import java.util.List;

public class BannerRecyclerView extends RecyclerView {

    /* renamed from: a */
    protected boolean f70715a;

    /* renamed from: b */
    public int f70716b;

    /* renamed from: c */
    private boolean f70717c;

    /* renamed from: d */
    private int f70718d;

    /* renamed from: e */
    private int f70719e;

    /* renamed from: f */
    private int f70720f;

    /* renamed from: g */
    private int f70721g;

    /* renamed from: h */
    private AbstractC28213b f70722h;

    /* renamed from: i */
    private boolean f70723i;

    /* renamed from: j */
    private boolean f70724j;

    /* renamed from: k */
    private List<AbstractC28212a> f70725k;

    /* renamed from: com.ss.android.appcenter.common.view.BannerRecyclerView$a */
    public interface AbstractC28212a {
        /* renamed from: a */
        void mo99721a();

        /* renamed from: b */
        void mo99722b();
    }

    /* renamed from: com.ss.android.appcenter.common.view.BannerRecyclerView$b */
    public interface AbstractC28213b {
    }

    public int getRecyclerViewScrollY() {
        return this.f70716b;
    }

    /* renamed from: a */
    private void m103304a() {
        ArrayList arrayList = new ArrayList();
        this.f70725k = arrayList;
        arrayList.add(new AbstractC28212a() {
            /* class com.ss.android.appcenter.common.view.BannerRecyclerView.C282112 */

            @Override // com.ss.android.appcenter.common.view.BannerRecyclerView.AbstractC28212a
            /* renamed from: a */
            public void mo99721a() {
                C27548m.m100547m().mo98227k().mo98189b();
            }

            @Override // com.ss.android.appcenter.common.view.BannerRecyclerView.AbstractC28212a
            /* renamed from: b */
            public void mo99722b() {
                C27548m.m100547m().mo98227k().mo98190c();
                C27548m.m100547m().mo98216a().mo98161b();
            }
        });
    }

    public void setEnableLimitVelocity(boolean z) {
        this.f70717c = z;
    }

    public void setOnPageChangeListener(AbstractC28213b bVar) {
        this.f70722h = bVar;
    }

    public BannerRecyclerView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo100420a(AbstractC28212a aVar) {
        this.f70725k.add(aVar);
    }

    /* renamed from: a */
    private int m103303a(int i) {
        if (i > 0) {
            return Math.min(i, (int) HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        }
        return Math.max(i, -10000);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i) {
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0) {
            this.f70721g = viewConfiguration.getScaledTouchSlop();
        } else if (i == 1) {
            this.f70721g = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f70724j) {
            this.f70724j = true;
            List<AbstractC28212a> list = this.f70725k;
            if (list != null) {
                for (AbstractC28212a aVar : list) {
                    aVar.mo99721a();
                }
            }
        }
        if (!this.f70723i && getChildCount() > 1) {
            this.f70723i = true;
            List<AbstractC28212a> list2 = this.f70725k;
            if (list2 != null) {
                for (AbstractC28212a aVar2 : list2) {
                    aVar2.mo99722b();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        int actionIndex = motionEvent.getActionIndex();
        if (action == 0) {
            this.f70718d = motionEvent.getPointerId(0);
            this.f70719e = (int) (motionEvent.getX() + 0.5f);
            this.f70720f = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (action != 2) {
            if (action != 5) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f70718d = motionEvent.getPointerId(actionIndex);
            this.f70719e = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f70720f = (int) (motionEvent.getY(actionIndex) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (this.f70715a) {
            return true;
        } else {
            int findPointerIndex = motionEvent.findPointerIndex(this.f70718d);
            if (findPointerIndex < 0) {
                return false;
            }
            int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (getScrollState() == 1) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int i = x - this.f70719e;
            int i2 = y - this.f70720f;
            boolean canScrollHorizontally = getLayoutManager().canScrollHorizontally();
            boolean canScrollVertically = getLayoutManager().canScrollVertically();
            if (!canScrollHorizontally || Math.abs(i) <= this.f70721g || (Math.abs(i) < Math.abs(i2) && !canScrollVertically)) {
                z = false;
            } else {
                z = true;
            }
            if (canScrollVertically && Math.abs(i2) > this.f70721g && (Math.abs(i2) >= Math.abs(i) || canScrollHorizontally)) {
                z = true;
            }
            if (!z || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    public BannerRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        if (this.f70717c) {
            i = m103303a(i);
            i2 = m103303a(i2);
        }
        return super.fling(i, i2);
    }

    public BannerRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70717c = true;
        this.f70718d = -1;
        this.f70721g = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.appcenter.common.view.BannerRecyclerView.C282101 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                BannerRecyclerView.this.f70716b += i2;
                BannerRecyclerView bannerRecyclerView = BannerRecyclerView.this;
                bannerRecyclerView.f70716b = Math.max(bannerRecyclerView.f70716b, 0);
            }
        });
        m103304a();
    }
}
