package com.ss.android.appcenter.engine.vlayout;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx;
import com.ss.android.appcenter.engine.vlayout.extend.PerformanceMonitor;
import com.ss.android.appcenter.engine.vlayout.extend.ViewLifeCycleHelper;
import com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28263b;
import com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28269f;
import com.ss.android.appcenter.engine.vlayout.p1301a.C28267d;
import com.ss.android.appcenter.engine.vlayout.p1301a.C28268e;
import com.ss.android.appcenter.engine.vlayout.p1301a.C28273h;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VirtualLayoutManager extends ExposeLinearLayoutManagerEx implements AbstractC28282e {

    /* renamed from: d */
    private static boolean f70923d;

    /* renamed from: w */
    private static AbstractC28280c f70924w = new C28267d();

    /* renamed from: A */
    private Rect f70925A;

    /* renamed from: B */
    private boolean f70926B;

    /* renamed from: C */
    private int f70927C;

    /* renamed from: D */
    private boolean f70928D;

    /* renamed from: a */
    protected AbstractC28285g f70929a;

    /* renamed from: b */
    protected AbstractC28285g f70930b;

    /* renamed from: c */
    public RecyclerView f70931c;

    /* renamed from: e */
    private boolean f70932e;

    /* renamed from: f */
    private boolean f70933f;

    /* renamed from: g */
    private boolean f70934g;

    /* renamed from: h */
    private boolean f70935h;

    /* renamed from: i */
    private boolean f70936i;

    /* renamed from: j */
    private int f70937j;

    /* renamed from: k */
    private PerformanceMonitor f70938k;

    /* renamed from: l */
    private ViewLifeCycleHelper f70939l;

    /* renamed from: m */
    private Comparator<Pair<C28288h<Integer>, Integer>> f70940m;

    /* renamed from: n */
    private AbstractC28281d f70941n;

    /* renamed from: o */
    private C28268e f70942o;

    /* renamed from: p */
    private HashMap<Integer, AbstractC28280c> f70943p;

    /* renamed from: q */
    private HashMap<Integer, AbstractC28280c> f70944q;

    /* renamed from: r */
    private AbstractC28263b.AbstractC28264a f70945r;

    /* renamed from: s */
    private C28257a f70946s;

    /* renamed from: t */
    private int f70947t;

    /* renamed from: u */
    private C28259c f70948u;

    /* renamed from: v */
    private List<Pair<C28288h<Integer>, Integer>> f70949v;

    /* renamed from: x */
    private AbstractC28280c f70950x;

    /* renamed from: y */
    private AbstractC28284f f70951y;

    /* renamed from: z */
    private boolean f70952z;

    /* renamed from: com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager$b */
    public interface AbstractC28258b {
        /* renamed from: a */
        boolean mo100701a();
    }

    /* renamed from: com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager$a */
    public static class C28257a {

        /* renamed from: a */
        public int f70959a;

        /* renamed from: b */
        public int f70960b;

        /* renamed from: c */
        public boolean f70961c;

        C28257a() {
        }
    }

    /* renamed from: com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager$c */
    public static class C28259c {

        /* renamed from: a */
        public ExposeLinearLayoutManagerEx.C28252c f70962a;

        C28259c() {
        }

        /* renamed from: a */
        public int mo100702a() {
            return this.f70962a.f70907c;
        }

        /* renamed from: b */
        public int mo100706b() {
            return this.f70962a.f70909e;
        }

        /* renamed from: d */
        public int mo100708d() {
            return this.f70962a.f70910f;
        }

        /* renamed from: e */
        public int mo100709e() {
            return this.f70962a.f70911g;
        }

        /* renamed from: c */
        public boolean mo100707c() {
            if (this.f70962a.f70915k != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public View mo100703a(RecyclerView.Recycler recycler) {
            return this.f70962a.mo100673a(recycler);
        }

        /* renamed from: a */
        public boolean mo100705a(RecyclerView.State state) {
            return this.f70962a.mo100674a(state);
        }

        /* renamed from: a */
        public View mo100704a(RecyclerView.Recycler recycler, int i) {
            int i2 = this.f70962a.f70909e;
            this.f70962a.f70909e = i;
            View a = mo100703a(recycler);
            this.f70962a.f70909e = i2;
            return a;
        }
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28282e
    /* renamed from: b */
    public AbstractC28285g mo100691b() {
        return this.f70929a;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28282e, com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx
    public boolean isEnableMarginOverLap() {
        return this.f70936i;
    }

    /* renamed from: a */
    public void mo100687a(AbstractC28281d dVar) {
        if (dVar != null) {
            LinkedList linkedList = new LinkedList();
            AbstractC28281d dVar2 = this.f70941n;
            if (dVar2 != null) {
                for (AbstractC28280c cVar : dVar2.mo100779a()) {
                    linkedList.add(cVar);
                }
            }
            this.f70941n = dVar;
            if (linkedList.size() > 0) {
                this.f70941n.mo100780a(linkedList);
            }
            this.f70926B = false;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("finder is null");
    }

    /* renamed from: a */
    public void mo100688a(List<AbstractC28280c> list) {
        AbstractC28263b.AbstractC28264a aVar;
        for (AbstractC28280c cVar : this.f70941n.mo100779a()) {
            this.f70944q.put(Integer.valueOf(System.identityHashCode(cVar)), cVar);
        }
        if (list != null) {
            int i = 0;
            for (AbstractC28280c cVar2 : list) {
                if (cVar2 instanceof AbstractC28269f) {
                    ((AbstractC28269f) cVar2).mo100740a(this.f70942o);
                }
                if ((cVar2 instanceof AbstractC28263b) && (aVar = this.f70945r) != null) {
                    ((AbstractC28263b) cVar2).mo100728a(aVar);
                }
                if (cVar2.mo100730b() > 0) {
                    cVar2.mo100773a(i, (cVar2.mo100730b() + i) - 1);
                } else {
                    cVar2.mo100773a(-1, -1);
                }
                i += cVar2.mo100730b();
            }
        }
        this.f70941n.mo100780a(list);
        for (AbstractC28280c cVar3 : this.f70941n.mo100779a()) {
            this.f70943p.put(Integer.valueOf(System.identityHashCode(cVar3)), cVar3);
        }
        Iterator<Map.Entry<Integer, AbstractC28280c>> it = this.f70944q.entrySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next().getKey();
            if (this.f70943p.containsKey(key)) {
                this.f70943p.remove(key);
                it.remove();
            }
        }
        for (AbstractC28280c cVar4 : this.f70944q.values()) {
            cVar4.mo100733b(this);
        }
        if (!this.f70944q.isEmpty() || !this.f70943p.isEmpty()) {
            this.f70926B = false;
        }
        this.f70944q.clear();
        this.f70943p.clear();
        requestLayout();
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28282e
    /* renamed from: a */
    public void mo100686a(C28259c cVar, View view, int i) {
        showView(view);
        if (!cVar.mo100707c()) {
            addView(view, i);
        } else {
            addDisappearingView(view, i);
        }
    }

    /* renamed from: a */
    public void mo100689a(boolean z) {
        this.f70952z = z;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28282e
    /* renamed from: a */
    public void mo100683a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        PerformanceMonitor performanceMonitor = this.f70938k;
        if (performanceMonitor != null) {
            performanceMonitor.recordStart("layout", view);
        }
        layoutDecorated(view, i + marginLayoutParams.leftMargin, i2 + marginLayoutParams.topMargin, i3 - marginLayoutParams.rightMargin, i4 - marginLayoutParams.bottomMargin);
        PerformanceMonitor performanceMonitor2 = this.f70938k;
        if (performanceMonitor2 != null) {
            performanceMonitor2.recordEnd("layout", view);
        }
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28282e
    /* renamed from: c */
    public int mo100692c() {
        return super.getWidth();
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28282e
    /* renamed from: d */
    public int mo100693d() {
        return super.getHeight();
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28282e
    /* renamed from: e */
    public boolean mo100694e() {
        return isLayoutRTL();
    }

    /* renamed from: f */
    public List<AbstractC28280c> mo100695f() {
        return this.f70941n.mo100779a();
    }

    @Override // com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public /* bridge */ /* synthetic */ int findFirstVisibleItemPosition() {
        return super.findFirstVisibleItemPosition();
    }

    @Override // com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public /* bridge */ /* synthetic */ int findLastVisibleItemPosition() {
        return super.findLastVisibleItemPosition();
    }

    /* renamed from: g */
    public int mo100696g() {
        return this.mLayoutState.f70911g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28282e, androidx.recyclerview.widget.LinearLayoutManager
    public int getOrientation() {
        return super.getOrientation();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.mCurrentPendingSavedState == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean canScrollHorizontally() {
        if (!this.f70934g || this.f70932e) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean canScrollVertically() {
        if (this.f70952z && this.f70935h && !this.f70932e) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28282e
    /* renamed from: a */
    public final View mo100680a() {
        RecyclerView recyclerView = this.f70931c;
        if (recyclerView == null) {
            return null;
        }
        View a = this.f70951y.mo100700a(recyclerView.getContext());
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        attachViewHolder(layoutParams, new C28260d(a));
        a.setLayoutParams(layoutParams);
        return a;
    }

    /* renamed from: com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager$d */
    private static class C28260d extends RecyclerView.ViewHolder {
        public C28260d(View view) {
            super(view);
        }
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28282e
    /* renamed from: a */
    public void mo100682a(View view) {
        removeView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public /* bridge */ /* synthetic */ void assertNotInLayoutOrScroll(String str) {
        super.assertNotInLayoutOrScroll(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx
    public void hideView(View view) {
        super.hideView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public /* bridge */ /* synthetic */ void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public void scrollToPosition(int i) {
        super.scrollToPosition(i);
    }

    @Override // com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx
    public /* bridge */ /* synthetic */ void setRecycleOffset(int i) {
        super.setRecycleOffset(i);
    }

    @Override // com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx
    public void showView(View view) {
        super.showView(view);
    }

    public VirtualLayoutManager(Context context) {
        this(context, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.AbstractC1331b, com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public /* bridge */ /* synthetic */ PointF computeScrollVectorForPosition(int i) {
        return super.computeScrollVectorForPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f70931c = recyclerView;
    }

    /* renamed from: b */
    public RecyclerView.ViewHolder mo100690b(View view) {
        RecyclerView recyclerView = this.f70931c;
        if (recyclerView != null) {
            return recyclerView.getChildViewHolder(view);
        }
        return null;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public void setOrientation(int i) {
        this.f70929a = AbstractC28285g.m103736a(this, i);
        super.setOrientation(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setReverseLayout(boolean z) {
        if (!z) {
            super.setReverseLayout(false);
            return;
        }
        throw new UnsupportedOperationException("VirtualLayoutManager does not support reverse layout in current version.");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if (!z) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("VirtualLayoutManager does not support stack from end.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (AbstractC28280c cVar : this.f70941n.mo100779a()) {
            cVar.mo100775a(i, this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        for (AbstractC28280c cVar : this.f70941n.mo100779a()) {
            cVar.mo100741a(this);
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: a */
        public float f70956a = Float.NaN;

        /* renamed from: b */
        private int f70957b = Integer.MIN_VALUE;

        /* renamed from: c */
        private int f70958c = Integer.MIN_VALUE;

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachAndScrapAttachedViews(RecyclerView.Recycler recycler) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            RecyclerView.ViewHolder b = mo100690b(getChildAt(childCount));
            if ((b instanceof AbstractC28258b) && ((AbstractC28258b) b).mo100701a()) {
                ExposeLinearLayoutManagerEx.C28253d.m103554a(b, 0, 6);
            }
        }
        super.detachAndScrapAttachedViews(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.ss.android.appcenter.engine.vlayout.AbstractC28282e, androidx.recyclerview.widget.LinearLayoutManager
    public View findViewByPosition(int i) {
        View findViewByPosition = super.findViewByPosition(i);
        if (findViewByPosition != null && getPosition(findViewByPosition) == i) {
            return findViewByPosition;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && getPosition(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((RecyclerView.LayoutParams) ((LayoutParams) layoutParams));
        }
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            return new LayoutParams((RecyclerView.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (AbstractC28280c cVar : this.f70941n.mo100779a()) {
            cVar.mo100776b(i, this);
        }
        ViewLifeCycleHelper viewLifeCycleHelper = this.f70939l;
        if (viewLifeCycleHelper != null) {
            viewLifeCycleHelper.mo100792a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = findLastVisibleItemPosition();
        for (AbstractC28280c cVar : this.f70941n.mo100779a()) {
            cVar.mo100774a(i, findFirstVisibleItemPosition, findLastVisibleItemPosition, this);
        }
    }

    /* renamed from: a */
    private int m103560a(C28288h<Integer> hVar) {
        Pair<C28288h<Integer>, Integer> pair;
        Pair<C28288h<Integer>, Integer> pair2;
        int size = this.f70949v.size();
        if (size == 0) {
            return -1;
        }
        int i = 0;
        int i2 = size - 1;
        int i3 = -1;
        while (true) {
            pair = null;
            if (i > i2) {
                break;
            }
            i3 = (i + i2) / 2;
            pair2 = this.f70949v.get(i3);
            C28288h<Integer> hVar2 = (C28288h) pair2.first;
            if (hVar2 == null) {
                break;
            } else if (hVar2.mo100811a(hVar.mo100809a()) || hVar2.mo100811a(hVar.mo100812b()) || hVar.mo100810a(hVar2)) {
                pair = pair2;
            } else if (hVar2.mo100809a().intValue() > hVar.mo100812b().intValue()) {
                i2 = i3 - 1;
            } else if (hVar2.mo100812b().intValue() < hVar.mo100809a().intValue()) {
                i = i3 + 1;
            }
        }
        pair = pair2;
        if (pair == null) {
            return -1;
        }
        return i3;
    }

    public static class InflateLayoutParams extends LayoutParams {
        public InflateLayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachAndScrapView(View view, RecyclerView.Recycler recycler) {
        super.detachAndScrapView(view, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void moveView(int i, int i2) {
        super.moveView(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        super.onAdapterChanged(adapter, adapter2);
    }

    @Override // com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        super.scrollToPositionWithOffset(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new InflateLayoutParams(context, attributeSet);
    }

    public VirtualLayoutManager(Context context, int i) {
        this(context, i, false);
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28282e
    /* renamed from: a */
    public void mo100684a(View view, boolean z) {
        showView(view);
        addHiddenView(view, z);
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28282e
    /* renamed from: a */
    public void mo100685a(C28259c cVar, View view) {
        int i;
        if (cVar.mo100708d() == 1) {
            i = -1;
        } else {
            i = 0;
        }
        mo100686a(cVar, view, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachAndScrapViewAt(int i, RecyclerView.Recycler recycler) {
        RecyclerView.ViewHolder b = mo100690b(getChildAt(i));
        if ((b instanceof AbstractC28258b) && ((AbstractC28258b) b).mo100701a()) {
            ExposeLinearLayoutManagerEx.C28253d.m103554a(b, 0, 4);
        }
        super.detachAndScrapViewAt(i, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        for (AbstractC28280c cVar : this.f70941n.mo100779a()) {
            cVar.mo100733b(this);
        }
        this.f70931c = null;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx
    public void onAnchorReady(RecyclerView.State state, ExposeLinearLayoutManagerEx.C28250a aVar) {
        super.onAnchorReady(state, aVar);
        boolean z = true;
        while (z) {
            this.f70946s.f70959a = aVar.f70888a;
            this.f70946s.f70960b = aVar.f70889b;
            this.f70946s.f70961c = aVar.f70890c;
            AbstractC28280c a = this.f70941n.mo100778a(aVar.f70888a);
            if (a != null) {
                a.mo100714a(state, this.f70946s, this);
            }
            if (this.f70946s.f70959a == aVar.f70888a) {
                z = false;
            } else {
                aVar.f70888a = this.f70946s.f70959a;
            }
            aVar.f70889b = this.f70946s.f70960b;
            this.f70946s.f70959a = -1;
        }
        this.f70946s.f70959a = aVar.f70888a;
        this.f70946s.f70960b = aVar.f70889b;
        for (AbstractC28280c cVar : this.f70941n.mo100779a()) {
            cVar.mo100777b(state, this.f70946s, this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection("VLM onLayoutChildren");
        }
        if (this.f70932e && state.didStructureChange()) {
            this.f70926B = false;
            this.f70928D = true;
        }
        m103562a(recycler, state);
        try {
            super.onLayoutChildren(recycler, state);
            m103563a(recycler, state, Integer.MAX_VALUE);
            if ((this.f70933f || this.f70932e) && this.f70928D) {
                this.f70926B = true;
                View childAt = getChildAt(getChildCount() - 1);
                if (childAt != null) {
                    this.f70927C = getDecoratedBottom(childAt) + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin + computeAlignOffset(childAt, true, false);
                    RecyclerView recyclerView = this.f70931c;
                    if (recyclerView != null && this.f70933f) {
                        ViewParent parent = recyclerView.getParent();
                        if (parent instanceof View) {
                            this.f70927C = Math.min(this.f70927C, ((View) parent).getMeasuredHeight());
                        }
                    }
                } else {
                    this.f70928D = false;
                }
                this.f70928D = false;
                if (this.f70931c != null && getItemCount() > 0) {
                    this.f70931c.post(new Runnable() {
                        /* class com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager.RunnableC282552 */

                        public void run() {
                            if (VirtualLayoutManager.this.f70931c != null) {
                                VirtualLayoutManager.this.f70931c.requestLayout();
                            }
                        }
                    });
                }
            }
            if (Build.VERSION.SDK_INT >= 18) {
                Trace.endSection();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } catch (Throwable th) {
            m103563a(recycler, state, Integer.MAX_VALUE);
            throw th;
        }
    }

    /* renamed from: a */
    private void m103562a(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f70947t == 0) {
            for (AbstractC28280c cVar : this.f70941n.mo100781b()) {
                cVar.mo100727a(recycler, state, this);
            }
        }
        this.f70947t++;
    }

    /* renamed from: a */
    public AbstractC28280c mo100681a(AbstractC28280c cVar, boolean z) {
        List<AbstractC28280c> a;
        int indexOf;
        int i;
        AbstractC28280c cVar2;
        if (cVar == null || (indexOf = (a = this.f70941n.mo100779a()).indexOf(cVar)) == -1) {
            return null;
        }
        if (z) {
            i = indexOf - 1;
        } else {
            i = indexOf + 1;
        }
        if (i < 0 || i >= a.size() || (cVar2 = a.get(i)) == null || cVar2.mo100735c()) {
            return null;
        }
        return cVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.ss.android.appcenter.engine.vlayout.AbstractC28282e
    public void measureChild(View view, int i, int i2) {
        m103561a(view, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.ss.android.appcenter.engine.vlayout.AbstractC28282e
    public void measureChildWithMargins(View view, int i, int i2) {
        m103564b(view, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        super.smoothScrollToPosition(recyclerView, state, i);
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28282e
    /* renamed from: a */
    public int mo100679a(int i, int i2, boolean z) {
        return getChildMeasureSpec(i, 0, i2, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public /* bridge */ /* synthetic */ int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public /* bridge */ /* synthetic */ int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return super.scrollVerticallyBy(i, recycler, state);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx
    public int computeAlignOffset(View view, boolean z, boolean z2) {
        return computeAlignOffset(getPosition(view), z, z2);
    }

    /* renamed from: a */
    private int m103559a(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i;
        }
        if ((View.MeasureSpec.getSize(i) - i2) - i3 < 0) {
            return View.MeasureSpec.makeMeasureSpec(0, mode);
        }
        return View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - i2) - i3, mode);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx
    public int computeAlignOffset(int i, boolean z, boolean z2) {
        AbstractC28280c a;
        if (i == -1 || (a = this.f70941n.mo100778a(i)) == null) {
            return 0;
        }
        return a.mo100710a(i - a.mo100772a().mo100809a().intValue(), z, z2, this);
    }

    public VirtualLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        this.f70937j = -1;
        this.f70940m = new Comparator<Pair<C28288h<Integer>, Integer>>() {
            /* class com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager.C282541 */

            /* renamed from: a */
            public int compare(Pair<C28288h<Integer>, Integer> pair, Pair<C28288h<Integer>, Integer> pair2) {
                if (pair == null && pair2 == null) {
                    return 0;
                }
                if (pair == null) {
                    return -1;
                }
                if (pair2 == null) {
                    return 1;
                }
                return ((Integer) ((C28288h) pair.first).mo100809a()).intValue() - ((Integer) ((C28288h) pair2.first).mo100809a()).intValue();
            }
        };
        this.f70942o = C28268e.f70979e;
        this.f70943p = new HashMap<>();
        this.f70944q = new HashMap<>();
        this.f70946s = new C28257a();
        int i2 = 0;
        this.f70947t = 0;
        this.f70948u = new C28259c();
        this.f70949v = new ArrayList();
        this.f70950x = f70924w;
        this.f70951y = new AbstractC28284f() {
            /* class com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager.C282563 */

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28284f
            /* renamed from: a */
            public View mo100700a(Context context) {
                return new LayoutView(context);
            }
        };
        this.f70952z = true;
        this.f70925A = new Rect();
        this.f70926B = false;
        this.f70927C = 0;
        this.f70928D = false;
        this.f70929a = AbstractC28285g.m103736a(this, i);
        this.f70930b = AbstractC28285g.m103736a(this, i != 1 ? 1 : i2);
        this.f70935h = super.canScrollVertically();
        this.f70934g = super.canScrollHorizontally();
        mo100687a(new C28289i());
    }

    /* renamed from: b */
    private void m103564b(View view, int i, int i2) {
        calculateItemDecorationsForChild(view, this.f70925A);
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (getOrientation() == 1) {
            i = m103559a(i, layoutParams.leftMargin + this.f70925A.left, layoutParams.rightMargin + this.f70925A.right);
        }
        if (getOrientation() == 0) {
            i2 = m103559a(i2, this.f70925A.top, this.f70925A.bottom);
        }
        PerformanceMonitor performanceMonitor = this.f70938k;
        if (performanceMonitor != null) {
            performanceMonitor.recordStart("measure", view);
        }
        view.measure(i, i2);
        PerformanceMonitor performanceMonitor2 = this.f70938k;
        if (performanceMonitor2 != null) {
            performanceMonitor2.recordEnd("measure", view);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx
    public int scrollInternalBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection("VLM scroll");
        }
        m103562a(recycler, state);
        int i3 = 0;
        try {
            if (!this.f70932e) {
                i = super.scrollInternalBy(i, recycler, state);
            } else {
                if (getChildCount() != 0) {
                    if (i != 0) {
                        this.mLayoutState.f70906b = true;
                        ensureLayoutStateExpose();
                        if (i > 0) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                        int abs = Math.abs(i);
                        updateLayoutStateExpose(i2, abs, true, state);
                        int fill = this.mLayoutState.f70912h + fill(recycler, this.mLayoutState, state, false);
                        if (fill < 0) {
                            m103563a(recycler, state, 0);
                            return 0;
                        } else if (abs > fill) {
                            i = i2 * fill;
                        }
                    }
                }
                m103563a(recycler, state, 0);
                return 0;
            }
            i3 = i;
        } catch (Exception e) {
            Log.m165399w("VirtualLayoutManager", e);
            if (f70923d) {
                throw e;
            }
        } catch (Throwable th) {
            m103563a(recycler, state, 0);
            throw th;
        }
        m103563a(recycler, state, i3);
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
        return i3;
    }

    /* renamed from: a */
    private void m103561a(View view, int i, int i2) {
        calculateItemDecorationsForChild(view, this.f70925A);
        int a = m103559a(i, this.f70925A.left, this.f70925A.right);
        int a2 = m103559a(i2, this.f70925A.top, this.f70925A.bottom);
        PerformanceMonitor performanceMonitor = this.f70938k;
        if (performanceMonitor != null) {
            performanceMonitor.recordStart("measure", view);
        }
        view.measure(a, a2);
        PerformanceMonitor performanceMonitor2 = this.f70938k;
        if (performanceMonitor2 != null) {
            performanceMonitor2.recordEnd("measure", view);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx
    public void recycleChildren(RecyclerView.Recycler recycler, int i, int i2) {
        if (i != i2) {
            if (f70923d) {
                Log.m165379d("VirtualLayoutManager", "Recycling " + Math.abs(i - i2) + " items");
            }
            if (i2 > i) {
                View childAt = getChildAt(i2 - 1);
                int position = getPosition(getChildAt(i));
                int position2 = getPosition(childAt);
                int i3 = i;
                while (i < i2) {
                    int position3 = getPosition(getChildAt(i3));
                    if (position3 != -1) {
                        AbstractC28280c a = this.f70941n.mo100778a(position3);
                        if (a == null || a.mo100715a(position3, position, position2, (AbstractC28282e) this, true)) {
                            removeAndRecycleViewAt(i3, recycler);
                        } else {
                            i3++;
                        }
                    } else {
                        removeAndRecycleViewAt(i3, recycler);
                    }
                    i++;
                }
                return;
            }
            View childAt2 = getChildAt(i);
            int position4 = getPosition(getChildAt(i2 + 1));
            int position5 = getPosition(childAt2);
            while (i > i2) {
                int position6 = getPosition(getChildAt(i));
                if (position6 != -1) {
                    AbstractC28280c a2 = this.f70941n.mo100778a(position6);
                    if (a2 == null || a2.mo100715a(position6, position4, position5, (AbstractC28282e) this, false)) {
                        removeAndRecycleViewAt(i, recycler);
                    }
                } else {
                    removeAndRecycleViewAt(i, recycler);
                }
                i--;
            }
        }
    }

    /* renamed from: a */
    private void m103563a(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        int i2 = this.f70947t - 1;
        this.f70947t = i2;
        if (i2 <= 0) {
            this.f70947t = 0;
            int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = findLastVisibleItemPosition();
            for (AbstractC28280c cVar : this.f70941n.mo100779a()) {
                try {
                    cVar.mo100713a(recycler, state, findFirstVisibleItemPosition, findLastVisibleItemPosition, i, this);
                } catch (Exception e) {
                    if (f70923d) {
                        throw e;
                    }
                }
            }
            ViewLifeCycleHelper viewLifeCycleHelper = this.f70939l;
            if (viewLifeCycleHelper != null) {
                viewLifeCycleHelper.mo100792a();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public /* bridge */ /* synthetic */ View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return super.onFocusSearchFailed(view, i, recycler, state);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.engine.vlayout.ExposeLinearLayoutManagerEx
    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, ExposeLinearLayoutManagerEx.C28252c cVar, C28273h hVar) {
        AbstractC28280c cVar2;
        int i;
        int i2 = cVar.f70909e;
        this.f70948u.f70962a = cVar;
        AbstractC28281d dVar = this.f70941n;
        if (dVar == null) {
            cVar2 = null;
        } else {
            cVar2 = dVar.mo100778a(i2);
        }
        if (cVar2 == null) {
            cVar2 = this.f70950x;
        }
        cVar2.mo100726a(recycler, state, this.f70948u, hVar, this);
        this.f70948u.f70962a = null;
        if (cVar.f70909e == i2) {
            Log.m165397w("VirtualLayoutManager", "layoutHelper[" + cVar2.getClass().getSimpleName() + "@" + cVar2.toString() + "] consumes no item!");
            hVar.f71003b = true;
            return;
        }
        int i3 = cVar.f70909e - cVar.f70910f;
        if (hVar.f71004c) {
            i = 0;
        } else {
            i = hVar.f71002a;
        }
        C28288h<Integer> hVar2 = new C28288h<>(Integer.valueOf(Math.min(i2, i3)), Integer.valueOf(Math.max(i2, i3)));
        int a = m103560a(hVar2);
        if (a >= 0) {
            Pair<C28288h<Integer>, Integer> pair = this.f70949v.get(a);
            if (pair == null || !((C28288h) pair.first).equals(hVar2) || ((Integer) pair.second).intValue() != i) {
                this.f70949v.remove(a);
            } else {
                return;
            }
        }
        this.f70949v.add(Pair.create(hVar2, Integer.valueOf(i)));
        Collections.sort(this.f70949v, this.f70940m);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a1  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(androidx.recyclerview.widget.RecyclerView.Recycler r9, androidx.recyclerview.widget.RecyclerView.State r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager.onMeasure(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, int, int):void");
    }
}
