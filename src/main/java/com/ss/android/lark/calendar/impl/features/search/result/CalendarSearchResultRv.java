package com.ss.android.lark.calendar.impl.features.search.result;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.C1363f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.CalendarListViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.list.IListDateShowListener;
import com.ss.android.lark.calendar.impl.features.calendarview.list.view.AbstractC30861b;
import com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListEventDateLogic;
import com.ss.android.lark.widget.StableLinearLayoutManager;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u000e*\u0001\u000e\u0018\u0000 K2\u00020\u0001:\u0001KB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010=\u001a\u00020>H\u0002J\u0010\u0010=\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u0017H\u0002J\u0006\u0010@\u001a\u00020>J\u0006\u0010A\u001a\u00020>J\u000e\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020 J\u000e\u0010D\u001a\u00020>2\u0006\u0010E\u001a\u00020*J\u0010\u0010F\u001a\u00020>2\u0006\u0010G\u001a\u00020\u0011H\u0002J\u000e\u0010H\u001a\u00020>2\u0006\u0010I\u001a\u00020\u0011J\u0006\u0010J\u001a\u00020>R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R\u001a\u0010.\u001a\u00020/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001bR\u001a\u00107\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u0010\u0015R\u001a\u0010:\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u0010\u0015¨\u0006L"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/result/CalendarSearchResultRv;", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mListEventDateLogic", "Lcom/ss/android/lark/calendar/impl/features/calendarview/list/view/ListEventDateLogic;", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/ss/android/lark/calendar/impl/features/calendarview/list/view/ListEventDateLogic;)V", "adapter", "Lcom/ss/android/lark/calendar/impl/features/search/result/ResultAdapter;", "getAdapter", "()Lcom/ss/android/lark/calendar/impl/features/search/result/ResultAdapter;", "setAdapter", "(Lcom/ss/android/lark/calendar/impl/features/search/result/ResultAdapter;)V", "checkRedLinePosRunnable", "com/ss/android/lark/calendar/impl/features/search/result/CalendarSearchResultRv$checkRedLinePosRunnable$1", "Lcom/ss/android/lark/calendar/impl/features/search/result/CalendarSearchResultRv$checkRedLinePosRunnable$1;", "endDay", "", "getEndDay$calendar_impl_release", "()I", "setEndDay$calendar_impl_release", "(I)V", "hasPendingSrolling", "", "getHasPendingSrolling$calendar_impl_release", "()Z", "setHasPendingSrolling$calendar_impl_release", "(Z)V", "isDestroyed", "isDestroyed$calendar_impl_release", "setDestroyed$calendar_impl_release", "mListDateShowListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/list/IListDateShowListener;", "getMListEventDateLogic", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/list/view/ListEventDateLogic;", "setMListEventDateLogic", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/list/view/ListEventDateLogic;)V", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recyclerViewListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/list/view/IOnRecyclerViewListener;", "recyclerViewState", "getRecyclerViewState$calendar_impl_release", "setRecyclerViewState$calendar_impl_release", "scrollTime", "", "getScrollTime$calendar_impl_release", "()J", "setScrollTime$calendar_impl_release", "(J)V", "scrollTrigeredByTouch", "getScrollTrigeredByTouch$calendar_impl_release", "setScrollTrigeredByTouch$calendar_impl_release", "selectedDay", "getSelectedDay$calendar_impl_release", "setSelectedDay$calendar_impl_release", "startDay", "getStartDay$calendar_impl_release", "setStartDay$calendar_impl_release", "checkScrolling", "", "needScrollToCurrentTime", "destroy", "refreshViewMask", "setListDateViewListener", "listDateShowListener", "setRecyclerViewListener", "listener", "smoothScroll", "position", "switch2Day", "julianDay", "updateEventDatePosition", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.a.a */
public final class CalendarSearchResultRv {

    /* renamed from: b */
    public static final int f82651b = 80;

    /* renamed from: c */
    public static final int f82652c = f82652c;

    /* renamed from: d */
    public static final Companion f82653d = new Companion(null);

    /* renamed from: r */
    private static final int f82654r = 20;

    /* renamed from: a */
    public IListDateShowListener f82655a;

    /* renamed from: e */
    private C32298b f82656e;

    /* renamed from: f */
    private AbstractC30861b f82657f = new C32297c();

    /* renamed from: g */
    private boolean f82658g;

    /* renamed from: h */
    private int f82659h = new CalendarDate().getJulianDay();

    /* renamed from: i */
    private int f82660i = new CalendarDate().getJulianDay();

    /* renamed from: j */
    private int f82661j = -1;

    /* renamed from: k */
    private long f82662k;

    /* renamed from: l */
    private boolean f82663l;

    /* renamed from: m */
    private int f82664m;

    /* renamed from: n */
    private boolean f82665n;

    /* renamed from: o */
    private final RunnableC32296b f82666o;

    /* renamed from: p */
    private RecyclerView f82667p;

    /* renamed from: q */
    private ListEventDateLogic f82668q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/result/CalendarSearchResultRv$Companion;", "", "()V", "CHECK_RED_LINE_INTERVAL", "", "PREFEACH_THRESHOLD", "SCROLL_INTERVAL", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/result/CalendarSearchResultRv$recyclerViewListener$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/list/view/IOnRecyclerViewListener;", "onAppendAnimation", "", "onRecyclerViewScrollingToEdge", "startDay", "", "endDay", "isSrollingDown", "", "onSelectDateChanged", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.a.a$c */
    public static final class C32297c implements AbstractC30861b {
        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.view.AbstractC30861b
        /* renamed from: a */
        public void mo111727a() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.view.AbstractC30861b
        /* renamed from: a */
        public void mo111728a(int i, int i2, boolean z) {
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.view.AbstractC30861b
        /* renamed from: a */
        public void mo111729a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
        }

        C32297c() {
        }
    }

    /* renamed from: a */
    public final C32298b mo118033a() {
        return this.f82656e;
    }

    /* renamed from: b */
    public final long mo118037b() {
        return this.f82662k;
    }

    /* renamed from: d */
    public final int mo118042d() {
        return this.f82664m;
    }

    /* renamed from: e */
    public final boolean mo118044e() {
        return this.f82665n;
    }

    /* renamed from: h */
    public final RecyclerView mo118047h() {
        return this.f82667p;
    }

    /* renamed from: i */
    public final ListEventDateLogic mo118048i() {
        return this.f82668q;
    }

    /* renamed from: c */
    public final boolean mo118041c() {
        return this.f82663l;
    }

    /* renamed from: g */
    public final void mo118046g() {
        this.f82665n = true;
        this.f82667p.removeCallbacks(this.f82666o);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/result/CalendarSearchResultRv$checkRedLinePosRunnable$1", "Ljava/lang/Runnable;", "run", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.a.a$b */
    public static final class RunnableC32296b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchResultRv f82673a;

        public void run() {
            if (!this.f82673a.mo118044e()) {
                try {
                    this.f82673a.mo118033a().mo118057b();
                    this.f82673a.mo118047h().postDelayed(this, (long) CalendarSearchResultRv.f82652c);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC32296b(CalendarSearchResultRv aVar) {
            this.f82673a = aVar;
        }
    }

    /* renamed from: f */
    public final void mo118045f() {
        RecyclerView.LayoutManager layoutManager = this.f82667p.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            ListEventDateLogic cVar = this.f82668q;
            IListDateShowListener cVar2 = this.f82655a;
            if (cVar2 == null) {
                Intrinsics.throwNpe();
            }
            cVar.mo111803a(cVar2, linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findFirstCompletelyVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), this.f82667p);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    /* renamed from: j */
    private final void m123190j() {
        boolean z;
        if (this.f82658g) {
            int julianDay = new CalendarDate().getJulianDay();
            int i = this.f82661j;
            if (julianDay == i) {
                z = true;
            } else {
                z = false;
            }
            int i2 = this.f82659h;
            int i3 = this.f82660i;
            int i4 = -1;
            if (i2 <= i && i3 >= i) {
                int itemCount = this.f82656e.getItemCount();
                int i5 = -1;
                for (int i6 = 0; i6 < itemCount; i6++) {
                    CalendarListViewData a = this.f82656e.mo118052a(i6);
                    Intrinsics.checkExpressionValueIsNotNull(a, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    int julianDay2 = a.getJulianDay();
                    int i7 = this.f82661j;
                    if (julianDay2 < i7) {
                        i4 = i6;
                    } else if (julianDay2 == i7) {
                        if (i4 < 0) {
                            i4 = i6;
                        }
                        if ((a.getViewType() == 0 || a.getViewType() == 3) && z) {
                            i4 = this.f82656e.mo118058c();
                            if (i5 < 0) {
                                i5 = i6;
                            }
                        }
                    } else if (julianDay2 > i7) {
                        break;
                    }
                }
                if (i4 < 0) {
                    i4 = 0;
                }
            }
            if (i4 >= 0) {
                m123189e(i4);
                this.f82658g = false;
            }
        }
    }

    /* renamed from: c */
    public final void mo118040c(int i) {
        this.f82664m = i;
    }

    /* renamed from: a */
    public final void mo118034a(int i) {
        this.f82659h = i;
    }

    /* renamed from: b */
    public final void mo118038b(int i) {
        this.f82660i = i;
    }

    /* renamed from: a */
    public final void mo118035a(IListDateShowListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listDateShowListener");
        this.f82655a = cVar;
    }

    /* renamed from: b */
    public final void mo118039b(boolean z) {
        this.f82663l = z;
    }

    /* renamed from: a */
    public final void mo118036a(boolean z) {
        this.f82658g = z;
    }

    /* renamed from: d */
    public final void mo118043d(int i) {
        this.f82667p.stopScroll();
        this.f82662k = System.currentTimeMillis();
        this.f82663l = false;
        this.f82661j = i;
        this.f82658g = true;
        m123190j();
    }

    /* renamed from: e */
    private final void m123189e(int i) {
        this.f82662k = System.currentTimeMillis();
        this.f82667p.stopScroll();
        RecyclerView.LayoutManager layoutManager = this.f82667p.getLayoutManager();
        if (layoutManager != null) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, 12);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    public CalendarSearchResultRv(RecyclerView recyclerView, ListEventDateLogic cVar) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(cVar, "mListEventDateLogic");
        this.f82667p = recyclerView;
        this.f82668q = cVar;
        this.f82656e = new C32298b(this, recyclerView.getContext());
        RunnableC32296b bVar = new RunnableC32296b(this);
        this.f82666o = bVar;
        RecyclerView recyclerView2 = this.f82667p;
        recyclerView2.setLayoutManager(new StableLinearLayoutManager(recyclerView2.getContext(), 1, false));
        this.f82667p.addItemDecoration(this.f82656e.mo118054a());
        this.f82667p.setAdapter(this.f82656e);
        this.f82667p.setOnTouchListener(new View.OnTouchListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv.View$OnTouchListenerC322921 */

            /* renamed from: a */
            final /* synthetic */ CalendarSearchResultRv f82669a;

            {
                this.f82669a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f82669a.mo118039b(true);
                return false;
            }
        });
        this.f82667p.postDelayed(bVar, (long) f82652c);
        this.f82667p.addOnScrollListener(new RecyclerView.OnScrollListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv.C322932 */

            /* renamed from: a */
            final /* synthetic */ CalendarSearchResultRv f82670a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f82670a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i);
                this.f82670a.mo118040c(i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i, i2);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                    int c = this.f82670a.mo118033a().mo118058c();
                    if (findFirstVisibleItemPosition <= c && findLastVisibleItemPosition >= c) {
                        int childCount = recyclerView.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i3));
                        }
                    }
                    if (this.f82670a.mo118033a().mo118052a(findFirstVisibleItemPosition) != null && this.f82670a.mo118041c() && System.currentTimeMillis() - this.f82670a.mo118037b() > ((long) CalendarSearchResultRv.f82651b) && this.f82670a.mo118042d() != 0) {
                        this.f82670a.mo118036a(false);
                    }
                    ListEventDateLogic i4 = this.f82670a.mo118048i();
                    IListDateShowListener cVar = this.f82670a.f82655a;
                    if (cVar == null) {
                        Intrinsics.throwNpe();
                    }
                    i4.mo111803a(cVar, findFirstVisibleItemPosition, findFirstCompletelyVisibleItemPosition, findLastVisibleItemPosition, recyclerView);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            }
        });
        this.f82667p.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv.ViewTreeObserver$OnGlobalLayoutListenerC322943 */

            /* renamed from: a */
            final /* synthetic */ CalendarSearchResultRv f82671a;

            public void onGlobalLayout() {
                this.f82671a.mo118045f();
                this.f82671a.mo118047h().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f82671a = r1;
            }
        });
        this.f82667p.setItemAnimator(new C1363f(this) {
            /* class com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv.C322954 */

            /* renamed from: a */
            final /* synthetic */ CalendarSearchResultRv f82672a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f82672a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
            public void onAnimationFinished(RecyclerView.ViewHolder viewHolder) {
                Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
                this.f82672a.mo118045f();
            }
        });
    }
}
