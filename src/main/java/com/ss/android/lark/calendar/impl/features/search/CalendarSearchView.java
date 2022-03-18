package com.ss.android.lark.calendar.impl.features.search;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.CalendarListViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.list.IListDateShowListener;
import com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListEventDateLogic;
import com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract;
import com.ss.android.lark.calendar.impl.features.search.filter.CalendarSearchFilterAdapter;
import com.ss.android.lark.calendar.impl.features.search.filter.SearchFilterData;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseViewCalendar;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001$B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0016J\b\u0010\"\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchView;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BaseViewCalendar;", "Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewData;", "Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewAction;", "Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewApi;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "filterAdapter", "Lcom/ss/android/lark/calendar/impl/features/search/filter/CalendarSearchFilterAdapter;", "filterItemList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/search/filter/SearchFilterData;", "Lkotlin/collections/ArrayList;", "meetingRoomLevelsFG", "", "getRootView", "()Landroid/view/View;", "rv", "Lcom/ss/android/lark/calendar/impl/features/search/result/CalendarSearchResultRv;", "clearSearchBarFocus", "", "create", "destroy", "getCalendarTag", "", "getTimeTag", "initResultList", "initSearchFilterView", "initTitleBar", "refreshFilter", "refreshSearchBar", "refreshSearchResultList", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.b */
public final class CalendarSearchView extends BaseViewCalendar<ICalendarSearchContract.ICalendarSearchViewData, ICalendarSearchContract.ICalendarSearchViewAction> implements ICalendarSearchContract.ICalendarSearchViewApi {

    /* renamed from: c */
    public static final Companion f82693c = new Companion(null);

    /* renamed from: a */
    public final Context f82694a;

    /* renamed from: b */
    public CalendarSearchResultRv f82695b;

    /* renamed from: d */
    private final ArrayList<SearchFilterData> f82696d = new ArrayList<>();

    /* renamed from: e */
    private CalendarSearchFilterAdapter f82697e;

    /* renamed from: f */
    private final boolean f82698f = C30022a.f74883b.mo112707o();

    /* renamed from: g */
    private final View f82699g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchView$Companion;", "", "()V", "SEARCH_FILTER_ATTENDEE", "", "SEARCH_FILTER_CALENDAR", "SEARCH_FILTER_MEETING_ROOM", "SEARCH_FILTER_TIME", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    public final View mo118063e() {
        return this.f82699g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.b$l */
    static final class RunnableC32313l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchView f82706a;

        RunnableC32313l(CalendarSearchView bVar) {
            this.f82706a = bVar;
        }

        public final void run() {
            CalendarSearchView.m123222a(this.f82706a).mo118045f();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewApi
    /* renamed from: b */
    public void mo118060b() {
        ((EditText) this.f82699g.findViewById(R.id.etSearch)).clearFocus();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseViewCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m123223f();
        m123224g();
        m123225h();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseViewCalendar, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        CalendarSearchResultRv aVar = this.f82695b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        aVar.mo118046g();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.b$e */
    public static final class C32306e extends Lambda implements Function0<Unit> {
        final /* synthetic */ CalendarSearchView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32306e(CalendarSearchView bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            KeyboardUtils.hideKeyboard(this.this$0.f82694a);
            ((ICalendarSearchContract.ICalendarSearchViewAction) this.this$0.mo118655q()).mo117975c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.b$g */
    public static final class C32308g extends Lambda implements Function0<Unit> {
        final /* synthetic */ CalendarSearchView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32308g(CalendarSearchView bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            KeyboardUtils.hideKeyboard(this.this$0.f82694a);
            Context context = this.this$0.f82694a;
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            ((ICalendarSearchContract.ICalendarSearchViewAction) this.this$0.mo118655q()).mo117971a(context);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewApi
    /* renamed from: a */
    public void mo118059a() {
        ((EditText) this.f82699g.findViewById(R.id.etSearch)).setText(((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118020a());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.b$d */
    public static final class C32305d extends Lambda implements Function0<Unit> {
        final /* synthetic */ CalendarSearchView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32305d(CalendarSearchView bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            KeyboardUtils.hideKeyboard(this.this$0.f82694a);
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo118063e().findViewById(R.id.fragmentContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "rootView.fragmentContainer");
            ((ICalendarSearchContract.ICalendarSearchViewAction) this.this$0.mo118655q()).mo117970a(frameLayout.getId());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.b$f */
    public static final class C32307f extends Lambda implements Function0<Unit> {
        final /* synthetic */ CalendarSearchView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32307f(CalendarSearchView bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            KeyboardUtils.hideKeyboard(this.this$0.f82694a);
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo118063e().findViewById(R.id.fragmentContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "rootView.fragmentContainer");
            ((ICalendarSearchContract.ICalendarSearchViewAction) this.this$0.mo118655q()).mo117974b(frameLayout.getId());
        }
    }

    /* renamed from: f */
    private final void m123223f() {
        ((ImageView) this.f82699g.findViewById(R.id.ivBack)).setOnClickListener(new View$OnClickListenerC32309h(this));
        ((TextView) this.f82699g.findViewById(R.id.tvCancel)).setOnClickListener(new View$OnClickListenerC32310i(this));
        ((ImageView) this.f82699g.findViewById(R.id.ivSearchDelete)).setOnClickListener(new View$OnClickListenerC32311j(this));
        ((EditText) this.f82699g.findViewById(R.id.etSearch)).addTextChangedListener(new C32312k(this));
    }

    /* renamed from: h */
    private final void m123225h() {
        RecyclerView recyclerView = (RecyclerView) this.f82699g.findViewById(R.id.resultList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.resultList");
        Context context = this.f82694a;
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        CalendarSearchResultRv aVar = new CalendarSearchResultRv(recyclerView, new ListEventDateLogic(context, true));
        this.f82695b = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        aVar.mo118035a(new C32303b(this));
        ((RecyclerView) this.f82699g.findViewById(R.id.resultList)).addOnScrollListener(new C32304c(this));
    }

    /* renamed from: j */
    private final String m123227j() {
        if (((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118022c() > 0) {
            Context context = this.f82694a;
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            String quantityString = context.getResources().getQuantityString(R.plurals.Calendar_Plural_SearchInCalendar, ((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118022c(), Integer.valueOf(((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118022c()));
            Intrinsics.checkExpressionValueIsNotNull(quantityString, "context.resources.getQua…tSelectedCalendarCount())");
            return quantityString;
        }
        String b = C32634ae.m125182b(R.string.Calendar_EventSearch_ChooseCal);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…ar_EventSearch_ChooseCal)");
        return b;
    }

    /* renamed from: g */
    private final void m123224g() {
        this.f82697e = new CalendarSearchFilterAdapter();
        this.f82696d.clear();
        ArrayList<SearchFilterData> arrayList = this.f82696d;
        String b = C32634ae.m125182b(R.string.Calendar_EventSearch_ChooseCal);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…ar_EventSearch_ChooseCal)");
        arrayList.add(new SearchFilterData(b, new C32305d(this)));
        ArrayList<SearchFilterData> arrayList2 = this.f82696d;
        String b2 = C32634ae.m125182b(R.string.Calendar_EventSearch_Guest);
        Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.stri…lendar_EventSearch_Guest)");
        arrayList2.add(new SearchFilterData(b2, new C32306e(this)));
        if (!this.f82698f) {
            ArrayList<SearchFilterData> arrayList3 = this.f82696d;
            String b3 = C32634ae.m125182b(R.string.Calendar_EventSearch_Room);
            Intrinsics.checkExpressionValueIsNotNull(b3, "ResUtil.getString(R.stri…alendar_EventSearch_Room)");
            arrayList3.add(new SearchFilterData(b3, new C32307f(this)));
        }
        ArrayList<SearchFilterData> arrayList4 = this.f82696d;
        String b4 = C32634ae.m125182b(R.string.Calendar_EventSearch_Date);
        Intrinsics.checkExpressionValueIsNotNull(b4, "ResUtil.getString(R.stri…alendar_EventSearch_Date)");
        arrayList4.add(new SearchFilterData(b4, new C32308g(this)));
        CalendarSearchFilterAdapter aVar = this.f82697e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
        }
        aVar.mo118198a(this.f82696d);
        RecyclerView recyclerView = (RecyclerView) this.f82699g.findViewById(R.id.rvFilter);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.rvFilter");
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f82694a, 0, false));
        RecyclerView recyclerView2 = (RecyclerView) this.f82699g.findViewById(R.id.rvFilter);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.rvFilter");
        CalendarSearchFilterAdapter aVar2 = this.f82697e;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
        }
        recyclerView2.setAdapter(aVar2);
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewApi
    /* renamed from: c */
    public void mo118061c() {
        ArrayList<CalendarListViewData> b = ((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118021b();
        if (b.size() > 0) {
            FrameLayout frameLayout = (FrameLayout) this.f82699g.findViewById(R.id.flNoResult);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "rootView.flNoResult");
            frameLayout.setVisibility(8);
            FrameLayout frameLayout2 = (FrameLayout) this.f82699g.findViewById(R.id.resultListContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "rootView.resultListContainer");
            frameLayout2.setVisibility(0);
            CalendarSearchResultRv aVar = this.f82695b;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rv");
            }
            ArrayList<CalendarListViewData> arrayList = b;
            aVar.mo118034a(((CalendarListViewData) CollectionsKt.first((List) arrayList)).getJulianDay());
            CalendarSearchResultRv aVar2 = this.f82695b;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rv");
            }
            aVar2.mo118038b(((CalendarListViewData) CollectionsKt.last((List) arrayList)).getJulianDay());
            CalendarSearchResultRv aVar3 = this.f82695b;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rv");
            }
            aVar3.mo118033a().mo118056a(b);
            CalendarSearchResultRv aVar4 = this.f82695b;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rv");
            }
            aVar4.mo118033a().notifyDataSetChanged();
            CalendarSearchResultRv aVar5 = this.f82695b;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rv");
            }
            aVar5.mo118043d(new CalendarDate().getJulianDay());
            CalendarSearchResultRv aVar6 = this.f82695b;
            if (aVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rv");
            }
            aVar6.mo118047h().post(new RunnableC32313l(this));
            return;
        }
        FrameLayout frameLayout3 = (FrameLayout) this.f82699g.findViewById(R.id.resultListContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "rootView.resultListContainer");
        frameLayout3.setVisibility(8);
        FrameLayout frameLayout4 = (FrameLayout) this.f82699g.findViewById(R.id.flNoResult);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout4, "rootView.flNoResult");
        frameLayout4.setVisibility(0);
        TextView textView = (TextView) this.f82699g.findViewById(R.id.tvNoResult);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.tvNoResult");
        textView.setText(C32634ae.m125182b(R.string.Calendar_EventSearch_NoResult));
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewApi
    /* renamed from: d */
    public void mo118062d() {
        this.f82696d.get(0).mo118203a(((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118023d());
        this.f82696d.get(0).mo118201a(m123227j());
        this.f82696d.get(1).mo118203a(((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118024e());
        this.f82696d.get(1).mo118202a(((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118030k());
        if (this.f82698f) {
            this.f82696d.get(2).mo118203a(((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118029j());
            this.f82696d.get(2).mo118201a(m123226i());
        } else {
            this.f82696d.get(2).mo118203a(((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118025f());
            this.f82696d.get(2).mo118201a(((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118026g());
            this.f82696d.get(3).mo118203a(((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118029j());
            this.f82696d.get(3).mo118201a(m123226i());
        }
        CalendarSearchFilterAdapter aVar = this.f82697e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
        }
        aVar.notifyDataSetChanged();
    }

    /* renamed from: i */
    private final String m123226i() {
        int i;
        String str;
        String str2;
        if (this.f82698f) {
            i = 2;
        } else {
            i = 3;
        }
        if (!this.f82696d.get(i).mo118204b()) {
            String b = C32634ae.m125182b(R.string.Calendar_EventSearch_Date);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…alendar_EventSearch_Date)");
            return b;
        }
        AbstractC30039ah utilsDependency = C30022a.f74882a.utilsDependency();
        AbstractC30052p languageDependency = C30022a.f74882a.languageDependency();
        Intrinsics.checkExpressionValueIsNotNull(languageDependency, "CalendarDependencyHolder…ency.languageDependency()");
        new SimpleDateFormat("MM/dd", languageDependency.mo108248a());
        Context a = C32634ae.m125179a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getAppContext()");
        long j = (long) 1000;
        Date date = new Date(((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118027h() * j);
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
        DatePreciseness datePreciseness = DatePreciseness.DAY;
        String e = TimeFormatUtils.m219289e(a, date, new Options(id, DisplayPattern.ABSOLUTE, LengthType.SHORT, datePreciseness, null, false, false, false, false, 496, null));
        Context a2 = C32634ae.m125179a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "ResUtil.getAppContext()");
        Date date2 = new Date(((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118028i() * j);
        TimeZone timeZone2 = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone2, "TimeZone.getDefault()");
        String id2 = timeZone2.getID();
        Intrinsics.checkExpressionValueIsNotNull(id2, "TimeZone.getDefault().id");
        DatePreciseness datePreciseness2 = DatePreciseness.DAY;
        String e2 = TimeFormatUtils.m219289e(a2, date2, new Options(id2, DisplayPattern.ABSOLUTE, LengthType.SHORT, datePreciseness2, null, false, false, false, false, 496, null));
        if (((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118027h() == -1) {
            str = C32634ae.m125182b(R.string.Lark_Search_AnyTime);
        } else {
            str = e;
        }
        String a3 = utilsDependency.mo108195a(R.string.Calendar_EventSearch_TimeFilter, "x", str);
        Intrinsics.checkExpressionValueIsNotNull(a3, "utilDependency.mustacheF…artTimeStr\n            })");
        if (((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118028i() == -1) {
            str2 = C32634ae.m125182b(R.string.Lark_Search_AnyTime);
        } else {
            str2 = e2;
        }
        String a4 = utilsDependency.mo108195a(R.string.Calendar_EventSearch_TimeFilterTwo, "y", str2);
        Intrinsics.checkExpressionValueIsNotNull(a4, "utilDependency.mustacheF…endTimeStr\n            })");
        if (((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118027h() == -1) {
            return a4;
        }
        if (((ICalendarSearchContract.ICalendarSearchViewData) mo118654p()).mo118028i() == -1) {
            return a3;
        }
        return e + '-' + e2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0016J8\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchView$initResultList$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/list/IListDateShowListener;", "onRemoveAllDateView", "", "onRemoveNotShowDateView", "dateShowList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "onShowListDateView", "viewTag", "locationY", "firstLineText", "", "monthDayText", "textColor", "isReserveMargin", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.b$b */
    public static final class C32303b implements IListDateShowListener {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchView f82700a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.IListDateShowListener
        /* renamed from: a */
        public void mo111710a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32303b(CalendarSearchView bVar) {
            this.f82700a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.IListDateShowListener
        /* renamed from: a */
        public void mo111712a(ArrayList<Integer> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "dateShowList");
            ListEventDateLogic i = CalendarSearchView.m123222a(this.f82700a).mo118048i();
            FrameLayout frameLayout = (FrameLayout) this.f82700a.mo118063e().findViewById(R.id.resultListContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "rootView.resultListContainer");
            i.mo111802a(frameLayout, arrayList);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.IListDateShowListener
        /* renamed from: a */
        public void mo111711a(int i, int i2, String str, String str2, int i3, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "firstLineText");
            Intrinsics.checkParameterIsNotNull(str2, "monthDayText");
            ListEventDateLogic i4 = CalendarSearchView.m123222a(this.f82700a).mo118048i();
            FrameLayout frameLayout = (FrameLayout) this.f82700a.mo118063e().findViewById(R.id.resultListContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "rootView.resultListContainer");
            i4.mo111801a(frameLayout, i, i2, str, str2, i3, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchView$initResultList$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.b$c */
    public static final class C32304c extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchView f82701a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32304c(CalendarSearchView bVar) {
            this.f82701a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                KeyboardUtils.hideKeyboard(this.f82701a.f82694a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchView$initTitleBar$4", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.b$k */
    public static final class C32312k implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchView f82705a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32312k(CalendarSearchView bVar) {
            this.f82705a = bVar;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                LinearLayout linearLayout = (LinearLayout) this.f82705a.mo118063e().findViewById(R.id.searchBarTint);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.searchBarTint");
                linearLayout.setVisibility(0);
                ImageView imageView = (ImageView) this.f82705a.mo118063e().findViewById(R.id.ivSearchDelete);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.ivSearchDelete");
                imageView.setVisibility(8);
            } else {
                LinearLayout linearLayout2 = (LinearLayout) this.f82705a.mo118063e().findViewById(R.id.searchBarTint);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.searchBarTint");
                linearLayout2.setVisibility(8);
                ImageView imageView2 = (ImageView) this.f82705a.mo118063e().findViewById(R.id.ivSearchDelete);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "rootView.ivSearchDelete");
                imageView2.setVisibility(0);
            }
            EditText editText = (EditText) this.f82705a.mo118063e().findViewById(R.id.etSearch);
            Intrinsics.checkExpressionValueIsNotNull(editText, "rootView.etSearch");
            ((ICalendarSearchContract.ICalendarSearchViewAction) this.f82705a.mo118655q()).mo117972a(editText.getText().toString());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.b$h */
    public static final class View$OnClickListenerC32309h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchView f82702a;

        View$OnClickListenerC32309h(CalendarSearchView bVar) {
            this.f82702a = bVar;
        }

        public final void onClick(View view) {
            ((ICalendarSearchContract.ICalendarSearchViewAction) this.f82702a.mo118655q()).mo117969a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.b$i */
    public static final class View$OnClickListenerC32310i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchView f82703a;

        View$OnClickListenerC32310i(CalendarSearchView bVar) {
            this.f82703a = bVar;
        }

        public final void onClick(View view) {
            ((ICalendarSearchContract.ICalendarSearchViewAction) this.f82703a.mo118655q()).mo117973b();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CalendarSearchResultRv m123222a(CalendarSearchView bVar) {
        CalendarSearchResultRv aVar = bVar.f82695b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        return aVar;
    }

    public CalendarSearchView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f82699g = view;
        this.f82694a = view.getContext();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.b$j */
    public static final class View$OnClickListenerC32311j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchView f82704a;

        View$OnClickListenerC32311j(CalendarSearchView bVar) {
            this.f82704a = bVar;
        }

        public final void onClick(View view) {
            ((EditText) this.f82704a.mo118063e().findViewById(R.id.etSearch)).setText("");
            LinearLayout linearLayout = (LinearLayout) this.f82704a.mo118063e().findViewById(R.id.searchBarTint);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.searchBarTint");
            linearLayout.setVisibility(0);
            ImageView imageView = (ImageView) this.f82704a.mo118063e().findViewById(R.id.ivSearchDelete);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.ivSearchDelete");
            imageView.setVisibility(8);
        }
    }
}
