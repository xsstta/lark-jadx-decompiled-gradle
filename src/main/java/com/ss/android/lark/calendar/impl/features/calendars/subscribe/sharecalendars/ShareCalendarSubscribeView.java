package com.ss.android.lark.calendar.impl.features.calendars.subscribe.sharecalendars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeView;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.SubViewType;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeBaseData;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.widget.StableLinearLayoutManager;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001d\u001a\u00020\u001eJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\u0014\u0010%\u001a\u00020\u001e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'J\u0006\u0010)\u001a\u00020\u001eJ\u000e\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020\u001eJ\u0006\u0010.\u001a\u00020\u001eJ\u0006\u0010/\u001a\u00020\u001eJ\u001e\u00100\u001a\u00020\u001e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u00101\u001a\u000202H\u0002J\u0014\u00103\u001a\u00020\u001e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'J\u0006\u00104\u001a\u00020\u001eJ\u0014\u00105\u001a\u00020\u001e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'J\u0006\u00106\u001a\u00020\u001eR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u00067"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/sharecalendars/ShareCalendarSubscribeView;", "Landroid/widget/FrameLayout;", "mContext", "Landroid/content/Context;", "calendarSubscribeView", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", "(Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;)V", "adapter", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/sharecalendars/ShareCalendarSubscribeAdapter;", "getCalendarSubscribeView", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", "setCalendarSubscribeView", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;)V", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "pageCount", "", "getPageCount", "()I", "setPageCount", "(I)V", "searchText", "", "getSearchText", "()Ljava/lang/String;", "setSearchText", "(Ljava/lang/String;)V", "hideLoadingView", "", "initErrTipPanel", "tipWidth", "", "tipHeight", "textMarginTop", "initPullToRefresh", "loadMore", "calendarList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeBaseData;", "loadMoreErr", "setOnLoadingViewClickedListener", "listener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "showErr", "showLoading", "showNoMatchingPublicCalendar", "showPublicCalendars", "mode", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout$Mode;", "showRecommendCalendars", "showRemindSearchToSubscribeCalendar", "showSearchCalendars", "updateView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c.c */
public final class ShareCalendarSubscribeView extends FrameLayout {

    /* renamed from: a */
    private ShareCalendarSubscribeAdapter f76624a;

    /* renamed from: b */
    private String f76625b = "";

    /* renamed from: c */
    private int f76626c;

    /* renamed from: d */
    private Context f76627d;

    /* renamed from: e */
    private CalendarSubscribeView f76628e;

    /* renamed from: f */
    private HashMap f76629f;

    /* renamed from: a */
    public View mo110483a(int i) {
        if (this.f76629f == null) {
            this.f76629f = new HashMap();
        }
        View view = (View) this.f76629f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76629f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final CalendarSubscribeView getCalendarSubscribeView() {
        return this.f76628e;
    }

    public final Context getMContext() {
        return this.f76627d;
    }

    public final int getPageCount() {
        return this.f76626c;
    }

    public final String getSearchText() {
        return this.f76625b;
    }

    /* renamed from: a */
    public final void mo110484a() {
        this.f76624a.notifyDataSetChanged();
    }

    /* renamed from: g */
    public final void mo110493g() {
        ((LKUIPtrClassicFrameLayout) mo110483a(R.id.ptrFrameLayout)).refreshComplete();
    }

    /* renamed from: b */
    public final void mo110486b() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110483a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo110483a(R.id.loadingView)).mo116402a();
    }

    /* renamed from: c */
    public final void mo110488c() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110483a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(8);
        ((CalendarLoadingView) mo110483a(R.id.loadingView)).mo116404b();
    }

    /* renamed from: h */
    private final void m113797h() {
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) mo110483a(R.id.ptrFrameLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "ptrFrameLayout");
        lKUIPtrClassicFrameLayout.setMode(LKUIPtrFrameLayout.Mode.NONE);
        ((LKUIPtrClassicFrameLayout) mo110483a(R.id.ptrFrameLayout)).setPtrHandler(new C30617a(this));
    }

    /* renamed from: d */
    public final void mo110490d() {
        RecyclerView recyclerView = (RecyclerView) mo110483a(R.id.subscribeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "subscribeRecycleView");
        recyclerView.setVisibility(8);
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110483a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo110483a(R.id.loadingView)).setErrorText(getResources().getString(R.string.Calendar_SubscribeCalendar_NoMatchingPublicCalendars));
        ((CalendarLoadingView) mo110483a(R.id.loadingView)).setErrorTipPanel(getResources().getDrawable(R.drawable.illustration_empty_neutral_search_failed));
        ((CalendarLoadingView) mo110483a(R.id.loadingView)).mo116405c();
    }

    /* renamed from: e */
    public final void mo110491e() {
        RecyclerView recyclerView = (RecyclerView) mo110483a(R.id.subscribeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "subscribeRecycleView");
        recyclerView.setVisibility(8);
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110483a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo110483a(R.id.loadingView)).setErrorText(getResources().getString(R.string.Calendar_SubscribeCalendar_SearchPublicCalendarsToSubscribe));
        ((CalendarLoadingView) mo110483a(R.id.loadingView)).setErrorTipPanel(getResources().getDrawable(R.drawable.illustration_placeholder_common_no_content));
        ((CalendarLoadingView) mo110483a(R.id.loadingView)).mo116405c();
    }

    /* renamed from: f */
    public final void mo110492f() {
        RecyclerView recyclerView = (RecyclerView) mo110483a(R.id.subscribeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "subscribeRecycleView");
        recyclerView.setVisibility(8);
        ((LKUIPtrClassicFrameLayout) mo110483a(R.id.ptrFrameLayout)).refreshComplete();
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110483a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo110483a(R.id.loadingView)).setErrorText(getResources().getString(R.string.Calendar_Common_FailedtoLoad1));
        ((CalendarLoadingView) mo110483a(R.id.loadingView)).setErrorTipPanel(getResources().getDrawable(R.drawable.illustration_empty_negative_load_failed));
        ((CalendarLoadingView) mo110483a(R.id.loadingView)).mo116405c();
    }

    public final void setPageCount(int i) {
        this.f76626c = i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/sharecalendars/ShareCalendarSubscribeView$initPullToRefresh$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "onLoadMoreBegin", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "onRefreshBegin", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c.c$a */
    public static final class C30617a extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ ShareCalendarSubscribeView f76631a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30617a(ShareCalendarSubscribeView cVar) {
            this.f76631a = cVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            CalendarSubscribeView.m113811a(this.f76631a.getCalendarSubscribeView(), this.f76631a.getPageCount(), SubViewType.ShareCalendar, null, 4, null);
        }
    }

    public final void setCalendarSubscribeView(CalendarSubscribeView gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "<set-?>");
        this.f76628e = gVar;
    }

    public final void setMContext(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "<set-?>");
        this.f76627d = context;
    }

    public final void setSearchText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f76625b = str;
    }

    /* renamed from: a */
    public final void mo110485a(ArrayList<SubscribeBaseData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        m113796a(arrayList, LKUIPtrFrameLayout.Mode.NONE);
    }

    public final void setOnLoadingViewClickedListener(CalendarLoadingView.AbstractC31882a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        ((CalendarLoadingView) mo110483a(R.id.loadingView)).setOnLoadingViewClickedListener(aVar);
    }

    /* renamed from: b */
    public final void mo110487b(ArrayList<SubscribeBaseData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        SubscribeBaseData bVar = new SubscribeBaseData("", "", "", false, false);
        bVar.mo110437d(false);
        arrayList.add(bVar);
        this.f76626c = 1;
        m113796a(arrayList, LKUIPtrFrameLayout.Mode.NONE);
    }

    /* renamed from: c */
    public final void mo110489c(ArrayList<SubscribeBaseData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        if (arrayList.size() < 24) {
            SubscribeBaseData bVar = new SubscribeBaseData("", "", "", false, false);
            bVar.mo110437d(false);
            arrayList.add(bVar);
            LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) mo110483a(R.id.ptrFrameLayout);
            Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "ptrFrameLayout");
            lKUIPtrClassicFrameLayout.setMode(LKUIPtrFrameLayout.Mode.NONE);
        }
        this.f76624a.mo110477b(arrayList);
        this.f76624a.notifyDataSetChanged();
        ((LKUIPtrClassicFrameLayout) mo110483a(R.id.ptrFrameLayout)).refreshComplete();
        this.f76626c++;
    }

    /* renamed from: a */
    private final void m113796a(ArrayList<SubscribeBaseData> arrayList, LKUIPtrFrameLayout.Mode mode) {
        this.f76626c = 1;
        RecyclerView recyclerView = (RecyclerView) mo110483a(R.id.subscribeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "subscribeRecycleView");
        recyclerView.setVisibility(0);
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110483a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(8);
        this.f76624a.mo110476a(arrayList);
        this.f76624a.notifyDataSetChanged();
        CalendarPerfMonitor.m124413a("key_subscribe_public_calendar");
        ((RecyclerView) mo110483a(R.id.subscribeRecycleView)).scrollToPosition(0);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) mo110483a(R.id.ptrFrameLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "ptrFrameLayout");
        lKUIPtrClassicFrameLayout.setMode(mode);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareCalendarSubscribeView(Context context, CalendarSubscribeView gVar) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(gVar, "calendarSubscribeView");
        this.f76627d = context;
        this.f76628e = gVar;
        LayoutInflater.from(getContext()).inflate(R.layout.calendar_subscribe_public_calendar_view, (ViewGroup) this, true);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        RecyclerView recyclerView = (RecyclerView) mo110483a(R.id.subscribeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "subscribeRecycleView");
        recyclerView.setLayoutManager(new StableLinearLayoutManager(getContext(), 1, false));
        this.f76624a = new ShareCalendarSubscribeAdapter(this.f76628e);
        RecyclerView recyclerView2 = (RecyclerView) mo110483a(R.id.subscribeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "subscribeRecycleView");
        recyclerView2.setAdapter(this.f76624a);
        ((RecyclerView) mo110483a(R.id.subscribeRecycleView)).addOnScrollListener(new RecyclerView.OnScrollListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendars.subscribe.sharecalendars.ShareCalendarSubscribeView.C306161 */

            /* renamed from: a */
            final /* synthetic */ ShareCalendarSubscribeView f76630a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f76630a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                if (i == 1) {
                    this.f76630a.getCalendarSubscribeView().mo110512h();
                }
            }
        });
        m113797h();
        View findViewById = ((CalendarLoadingView) mo110483a(R.id.loadingView)).findViewById(R.id.loading_panel);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "loadingView.findViewById…yout>(R.id.loading_panel)");
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) findViewById).getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            View findViewById2 = ((CalendarLoadingView) mo110483a(R.id.loadingView)).findViewById(R.id.error_tip_panel);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "loadingView.findViewById…ut>(R.id.error_tip_panel)");
            ViewGroup.LayoutParams layoutParams3 = ((LinearLayout) findViewById2).getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams2.bottomMargin = C30022a.f74882a.utilsDependency().mo108192a(getContext()) + UIUtils.dp2px(getContext(), 129.0f);
                ((LinearLayout.LayoutParams) layoutParams3).bottomMargin = C30022a.f74882a.utilsDependency().mo108192a(getContext()) + UIUtils.dp2px(getContext(), 129.0f);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }
}
