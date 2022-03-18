package com.ss.android.lark.calendar.impl.features.calendars.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.detail.fragment.CalendarDetailFragment;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewholder.InstanceCardViewHolder;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewholder.InstancesLoadStatusViewHolder;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewholder.InstancesMonthViewHolder;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewholder.InstancesWeekViewHolder;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDateHolder;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.InstanceCardInfo;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.LoadStatus;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.recyclerview.AdapterList;
import com.ss.android.lark.calendar.impl.features.recyclerview.BoundaryCallback;
import com.ss.android.lark.calendar.impl.features.recyclerview.SimpleAdapter;
import com.ss.android.lark.calendar.impl.features.recyclerview.SimpleHolder;
import com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher;
import com.ss.android.lark.calendar.impl.utils.C32645b;
import com.ss.android.lark.calendar.impl.utils.an;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010)\u001a\u00020*H\u0002J\u001a\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010 H\u0016J\u0010\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\tH\u0002J\b\u00102\u001a\u00020*H\u0002JR\u00103\u001a\u00020*2\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0016J\u0006\u0010>\u001a\u00020*J\u0014\u0010?\u001a\u00020*2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020 0\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001dX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006A"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/view/CalendarInstanceListView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnLayoutChangeListener;", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "actionDispatcher", "getActionDispatcher", "()Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "setActionDispatcher", "(Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;)V", "adapter", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/SimpleAdapter;", "currentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "dateContainer", "Landroid/widget/FrameLayout;", "dayAndYRange", "Landroid/util/SparseArray;", "Lkotlin/ranges/IntRange;", "futureMonthColor", "instanceDateViewList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/view/InstanceDateView;", "Lkotlin/collections/ArrayList;", "list", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/AdapterList;", "", "minDate", "monthInfo", "Landroid/widget/TextView;", "pastMonthColor", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "bindDateViews", "", "doAction", "", ShareHitPoint.f121869d, "", "payload", "getDateView", "index", "layoutDates", "onLayoutChange", "v", "Landroid/view/View;", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "scrollToToday", "setList", "adapterList", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarInstanceListView extends ConstraintLayout implements View.OnLayoutChangeListener, ActionDispatcher {

    /* renamed from: a */
    private ActionDispatcher f75720a;

    /* renamed from: b */
    private final RecyclerView f75721b;

    /* renamed from: c */
    private final TextView f75722c;

    /* renamed from: d */
    private final FrameLayout f75723d;

    /* renamed from: e */
    private AdapterList<Object> f75724e;

    /* renamed from: f */
    private final SimpleAdapter f75725f;

    /* renamed from: g */
    private final ArrayList<InstanceDateView> f75726g;

    /* renamed from: h */
    private final SparseArray<IntRange> f75727h;

    /* renamed from: i */
    private CalendarDate f75728i;

    /* renamed from: j */
    private final CalendarDate f75729j;

    /* renamed from: k */
    private final int f75730k;

    /* renamed from: l */
    private final int f75731l;

    public CalendarInstanceListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CalendarInstanceListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final ActionDispatcher getActionDispatcher() {
        return this.f75720a;
    }

    public final RecyclerView getRecyclerView() {
        return this.f75721b;
    }

    /* renamed from: a */
    public final void mo109286a() {
        int abs;
        int julianDay = new CalendarDate().getJulianDay();
        int size = this.f75724e.size();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = this.f75724e.get(i3);
            if ((obj instanceof CalendarDateHolder) && (abs = Math.abs(((CalendarDateHolder) obj).mo109174a().getJulianDay() - julianDay)) < i) {
                i2 = i3;
                i = abs;
            }
        }
        an.m125212a(this.f75721b, i2, false, false, 6, null);
    }

    /* renamed from: c */
    private final void m112422c() {
        boolean z;
        int i;
        int i2;
        int size = this.f75727h.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            CalendarDate julianDay = new CalendarDate().setJulianDay(this.f75727h.keyAt(i4));
            IntRange valueAt = this.f75727h.valueAt(i4);
            InstanceDateView a = m112421a(i4);
            a.setVisibility(0);
            CalendarDate calendarDate = this.f75729j;
            Intrinsics.checkExpressionValueIsNotNull(julianDay, "date");
            a.mo109294a(calendarDate, julianDay);
            if (valueAt.mo239399a() > 0) {
                i2 = valueAt.mo239399a();
            } else if (valueAt.mo239400b() < 0) {
                i2 = valueAt.mo239400b();
            } else {
                i2 = 0;
            }
            a.setTranslationY((float) i2);
        }
        int size2 = this.f75726g.size();
        for (int size3 = this.f75727h.size(); size3 < size2; size3++) {
            InstanceDateView instanceDateView = this.f75726g.get(size3);
            Intrinsics.checkExpressionValueIsNotNull(instanceDateView, "instanceDateViewList[i]");
            instanceDateView.setVisibility(4);
        }
        TextView textView = this.f75722c;
        CalendarDate calendarDate2 = this.f75728i;
        if (calendarDate2 != null) {
            if (calendarDate2.getYear() != this.f75729j.getYear()) {
                z = true;
            } else {
                z = false;
            }
            textView.setText(C32645b.m125234a(calendarDate2, z));
            TextView textView2 = this.f75722c;
            if (calendarDate2.monthDiff(this.f75729j) < 0) {
                i = this.f75731l;
            } else {
                i = this.f75730k;
            }
            textView2.setTextColor(i);
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    /* renamed from: b */
    public final void mo109287b() {
        IntRange kVar;
        long j;
        this.f75727h.clear();
        this.f75728i = null;
        int childCount = this.f75721b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f75721b.getChildAt(i);
            if (childAt != null) {
                int childAdapterPosition = this.f75721b.getChildAdapterPosition(childAt);
                int size = this.f75724e.size();
                if (childAdapterPosition >= 0 && size > childAdapterPosition) {
                    Object obj = this.f75724e.get(childAdapterPosition);
                    if (!(obj instanceof CalendarDateHolder)) {
                        obj = null;
                    }
                    CalendarDateHolder aVar = (CalendarDateHolder) obj;
                    if (aVar != null) {
                        long timeInMilliSeconds = aVar.mo109174a().getTimeInMilliSeconds();
                        CalendarDate calendarDate = this.f75728i;
                        if (calendarDate != null) {
                            j = calendarDate.getTimeInMilliSeconds();
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        if (timeInMilliSeconds < j) {
                            this.f75728i = aVar.mo109174a();
                        }
                    }
                    Object obj2 = this.f75724e.get(childAdapterPosition);
                    if (!(obj2 instanceof InstanceCardInfo)) {
                        obj2 = null;
                    }
                    InstanceCardInfo hVar = (InstanceCardInfo) obj2;
                    if (hVar != null) {
                        int julianDay = hVar.mo109174a().getJulianDay();
                        int y = (int) childAt.getY();
                        IntRange kVar2 = this.f75727h.get(julianDay);
                        if (kVar2 != null) {
                            kVar = new IntRange(Math.min(y, kVar2.mo239399a()), Math.max(y, kVar2.mo239400b()));
                        } else {
                            kVar = new IntRange(y, y);
                        }
                        this.f75727h.put(julianDay, kVar);
                    }
                }
            }
        }
        m112422c();
    }

    public final void setActionDispatcher(ActionDispatcher aVar) {
        this.f75720a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/SimpleHolder;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.view.CalendarInstanceListView$a */
    static final class C30262a extends Lambda implements Function1<SimpleHolder<? extends Object>, Unit> {
        final /* synthetic */ CalendarInstanceListView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30262a(CalendarInstanceListView calendarInstanceListView) {
            super(1);
            this.this$0 = calendarInstanceListView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SimpleHolder<? extends Object> fVar) {
            invoke(fVar);
            return Unit.INSTANCE;
        }

        public final void invoke(SimpleHolder<? extends Object> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            if (!(fVar instanceof InstanceCardViewHolder)) {
                fVar = null;
            }
            InstanceCardViewHolder aVar = (InstanceCardViewHolder) fVar;
            if (aVar != null) {
                aVar.mo109165a((ActionDispatcher) this.this$0);
            }
        }
    }

    public final void setList(AdapterList<Object> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "adapterList");
        if (!Intrinsics.areEqual(this.f75724e, aVar)) {
            this.f75724e.mo109136c();
            this.f75724e = aVar;
            this.f75725f.mo109154a(aVar);
            this.f75724e.mo109128a(this.f75725f);
        }
    }

    /* renamed from: a */
    private final InstanceDateView m112421a(int i) {
        InstanceDateView instanceDateView;
        int size = this.f75726g.size();
        if (i >= 0 && size > i) {
            instanceDateView = this.f75726g.get(i);
        } else {
            Context context = this.f75723d.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "dateContainer.context");
            instanceDateView = new InstanceDateView(context, null, 0, 6, null);
            this.f75726g.add(instanceDateView);
        }
        Intrinsics.checkExpressionValueIsNotNull(instanceDateView, "if (index in instanceDat…)\n            }\n        }");
        if (!Intrinsics.areEqual(instanceDateView.getParent(), this.f75723d)) {
            ViewParent parent = instanceDateView.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(instanceDateView);
            }
            this.f75723d.addView(instanceDateView, new ConstraintLayout.LayoutParams(-1, -2));
        }
        return instanceDateView;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher
    public boolean doAction(String str, Object obj) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        ActionDispatcher aVar = this.f75720a;
        if (aVar != null) {
            return aVar.doAction(str, obj);
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarInstanceListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        AdapterList<Object> aVar = new AdapterList<>();
        this.f75724e = aVar;
        SimpleAdapter a = new SimpleAdapter(aVar).mo109150a(InstanceCardViewHolder.f75596a).mo109150a(InstancesLoadStatusViewHolder.f75601a).mo109150a(InstancesWeekViewHolder.f75611a).mo109150a(InstancesMonthViewHolder.f75609b).mo109151a(new C30262a(this));
        this.f75725f = a;
        this.f75726g = new ArrayList<>();
        this.f75727h = new SparseArray<>();
        this.f75729j = new CalendarDate();
        this.f75730k = UDColorUtils.getColor(context, R.color.text_title);
        this.f75731l = UDColorUtils.getColor(context, R.color.text_placeholder);
        View.inflate(context, R.layout.calendar_view_calendar_instance_list, this);
        View findViewById = findViewById(R.id.month_info);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.month_info)");
        TextView textView = (TextView) findViewById;
        this.f75722c = textView;
        View findViewById2 = findViewById(R.id.instances_date_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.instances_date_container)");
        this.f75723d = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.instances_recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.instances_recycler_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        this.f75721b = recyclerView;
        textView.setTypeface(InstancesMonthViewHolder.f75609b.mo109172a());
        recyclerView.setAdapter(a);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setOverScrollMode(2);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendars.detail.view.CalendarInstanceListView.C302591 */

            /* renamed from: a */
            final /* synthetic */ CalendarInstanceListView f75732a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f75732a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                int i2;
                Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                if (i == 0) {
                    CalendarDetailFragment.Companion aVar = CalendarDetailFragment.f75662b;
                    CalendarInstanceListView calendarInstanceListView = this.f75732a;
                    if (recyclerView.getChildCount() > 0) {
                        i2 = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(recyclerView.getChildCount() - 1));
                    } else {
                        i2 = -1;
                    }
                    aVar.mo109255a(calendarInstanceListView, i2);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                this.f75732a.mo109287b();
            }
        });
        recyclerView.addOnLayoutChangeListener(this);
        new BoundaryCallback(recyclerView).mo109142b(new Function0<Unit>(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendars.detail.view.CalendarInstanceListView.C302602 */
            final /* synthetic */ CalendarInstanceListView this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                ActionDispatcher.C32507a.m124446a(this.this$0, "ACTION_LOAD_FUTURE_INSTANCE", null, 2, null);
            }
        }).mo109141a(new Function0<Unit>(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendars.detail.view.CalendarInstanceListView.C302613 */
            final /* synthetic */ CalendarInstanceListView this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                ActionDispatcher.C32507a.m124446a(this.this$0, "ACTION_LOAD_PAST_INSTANCE", null, 2, null);
            }
        });
        this.f75724e.mo109128a(a);
        this.f75724e.add(new LoadStatus(1, false, true, 2, null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarInstanceListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mo109287b();
    }
}
