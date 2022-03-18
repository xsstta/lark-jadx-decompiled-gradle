package com.ss.android.lark.calendar.impl.features.calendars.subscribe.contactcalendars;

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
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeContactData;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.StableLinearLayoutManager;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u001bJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0002J\u0014\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#J\u0006\u0010%\u001a\u00020\u001bJ\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(J\u0014\u0010)\u001a\u00020\u001b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020$0#J&\u0010+\u001a\u00020\u001b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0015H\u0002J\u0006\u00100\u001a\u00020\u001bJ\u0006\u00101\u001a\u00020\u001bJ\u0006\u00102\u001a\u00020\u001bJ\u0006\u00103\u001a\u00020\u001bJ\u0014\u00104\u001a\u00020\u001b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020$0#J\u0006\u00105\u001a\u00020\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u00066"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/contactcalendars/CalendarSubscribeContactSubView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "subscribeView", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", "(Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;)V", "adapter", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/contactcalendars/CalendarContactSubAdapter;", "getAdapter", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/contactcalendars/CalendarContactSubAdapter;", "calendarSubscribeView", "getCalendarSubscribeView", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", "pageCount", "", "getPageCount", "()I", "setPageCount", "(I)V", "searchText", "", "getSearchText", "()Ljava/lang/String;", "setSearchText", "(Ljava/lang/String;)V", "hideLoading", "", "initErrTipPanel", "tipWidth", "", "tipHeight", "textMarginTop", "loadMore", "calendarList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeContactData;", "loadMoreErr", "setOnLoadingViewClickedListener", "clickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "showCalendarChatters", "calendars", "showCalendars", "calendarChatters", "mode", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout$Mode;", "noMoreText", "showErr", "showLoading", "showNoRecommend", "showNoSearch", "showRecommendCalendars", "updateView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.a.c */
public final class CalendarSubscribeContactSubView extends FrameLayout {

    /* renamed from: a */
    private final CalendarContactSubAdapter f76550a;

    /* renamed from: b */
    private final CalendarSubscribeView f76551b;

    /* renamed from: c */
    private int f76552c;

    /* renamed from: d */
    private String f76553d = "";

    /* renamed from: e */
    private HashMap f76554e;

    /* renamed from: a */
    public View mo110403a(int i) {
        if (this.f76554e == null) {
            this.f76554e = new HashMap();
        }
        View view = (View) this.f76554e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76554e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final CalendarContactSubAdapter getAdapter() {
        return this.f76550a;
    }

    public final CalendarSubscribeView getCalendarSubscribeView() {
        return this.f76551b;
    }

    public final int getPageCount() {
        return this.f76552c;
    }

    public final String getSearchText() {
        return this.f76553d;
    }

    /* renamed from: a */
    public final void mo110404a() {
        this.f76550a.notifyDataSetChanged();
    }

    /* renamed from: f */
    public final void mo110412f() {
        ((LKUIPtrClassicFrameLayout) mo110403a(R.id.rvPtrLayout)).refreshComplete();
    }

    /* renamed from: b */
    public final void mo110406b() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110403a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo110403a(R.id.loadingView)).mo116402a();
    }

    /* renamed from: c */
    public final void mo110408c() {
        RecyclerView recyclerView = (RecyclerView) mo110403a(R.id.rvChatterList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvChatterList");
        recyclerView.setVisibility(8);
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110403a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo110403a(R.id.loadingView)).setErrorText(getResources().getString(R.string.Calendar_SubscribeCalendar_NoMatchingContacts));
        ((CalendarLoadingView) mo110403a(R.id.loadingView)).setErrorTipPanel(C57582a.m223614c(getContext(), R.drawable.illustration_empty_neutral_search_failed));
        ((CalendarLoadingView) mo110403a(R.id.loadingView)).mo116405c();
    }

    /* renamed from: d */
    public final void mo110410d() {
        RecyclerView recyclerView = (RecyclerView) mo110403a(R.id.rvChatterList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvChatterList");
        recyclerView.setVisibility(8);
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110403a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo110403a(R.id.loadingView)).setErrorText(getResources().getString(R.string.Calendar_SubscribeCalendar_NoRecentContacts));
        ((CalendarLoadingView) mo110403a(R.id.loadingView)).setErrorTipPanel(C57582a.m223614c(getContext(), R.drawable.illustration_empty_neutral_no_contact));
        ((CalendarLoadingView) mo110403a(R.id.loadingView)).mo116405c();
    }

    /* renamed from: e */
    public final void mo110411e() {
        RecyclerView recyclerView = (RecyclerView) mo110403a(R.id.rvChatterList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvChatterList");
        recyclerView.setVisibility(8);
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110403a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo110403a(R.id.loadingView)).setErrorText(getResources().getString(R.string.Calendar_Common_FailedtoLoad1));
        ((CalendarLoadingView) mo110403a(R.id.loadingView)).setErrorTipPanel(C57582a.m223614c(getContext(), R.drawable.illustration_empty_negative_load_failed));
        ((CalendarLoadingView) mo110403a(R.id.loadingView)).mo116405c();
    }

    public final void setPageCount(int i) {
        this.f76552c = i;
    }

    public final void setSearchText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f76553d = str;
    }

    public final void setOnLoadingViewClickedListener(CalendarLoadingView.AbstractC31882a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "clickListener");
        ((CalendarLoadingView) mo110403a(R.id.loadingView)).setOnLoadingViewClickedListener(aVar);
    }

    /* renamed from: b */
    public final void mo110407b(ArrayList<SubscribeContactData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendars");
        if (arrayList.size() < 10) {
            SubscribeContactData dVar = new SubscribeContactData("", "", "", false, false);
            dVar.mo110437d(false);
            arrayList.add(dVar);
            LKUIPtrFrameLayout.Mode mode = LKUIPtrFrameLayout.Mode.NONE;
            String b = C32634ae.m125182b(R.string.Calendar_SubscribeCalendar_NoMoreCal);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…scribeCalendar_NoMoreCal)");
            m113715a(arrayList, mode, b);
        } else {
            LKUIPtrFrameLayout.Mode mode2 = LKUIPtrFrameLayout.Mode.LOAD_MORE;
            String b2 = C32634ae.m125182b(R.string.Calendar_SubscribeCalendar_NoMoreCal);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.stri…scribeCalendar_NoMoreCal)");
            m113715a(arrayList, mode2, b2);
        }
        this.f76552c = 1;
    }

    /* renamed from: a */
    public final void mo110405a(ArrayList<SubscribeContactData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendars");
        SubscribeContactData dVar = new SubscribeContactData("", "", "", false, false);
        dVar.mo110437d(false);
        arrayList.add(dVar);
        LKUIPtrFrameLayout.Mode mode = LKUIPtrFrameLayout.Mode.NONE;
        String b = C32634ae.m125182b(R.string.Calendar_SubscribeCalendar_NoMoreRecom);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…ribeCalendar_NoMoreRecom)");
        m113715a(arrayList, mode, b);
    }

    /* renamed from: c */
    public final void mo110409c(ArrayList<SubscribeContactData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        if (arrayList.size() < 10) {
            SubscribeContactData dVar = new SubscribeContactData("", "", "", false, false);
            dVar.mo110437d(false);
            arrayList.add(dVar);
            LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) mo110403a(R.id.rvPtrLayout);
            Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "rvPtrLayout");
            lKUIPtrClassicFrameLayout.setMode(LKUIPtrFrameLayout.Mode.NONE);
        }
        this.f76550a.mo110393b(arrayList);
        this.f76550a.notifyDataSetChanged();
        ((LKUIPtrClassicFrameLayout) mo110403a(R.id.rvPtrLayout)).refreshComplete();
        this.f76552c++;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarSubscribeContactSubView(Context context, final CalendarSubscribeView gVar) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "subscribeView");
        this.f76551b = gVar;
        LayoutInflater.from(context).inflate(R.layout.calendar_pageview_subcribe_calendar_contact, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) mo110403a(R.id.rvChatterList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvChatterList");
        recyclerView.setLayoutManager(new StableLinearLayoutManager(context, 1, false));
        CalendarContactSubAdapter aVar = new CalendarContactSubAdapter(gVar);
        this.f76550a = aVar;
        RecyclerView recyclerView2 = (RecyclerView) mo110403a(R.id.rvChatterList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rvChatterList");
        recyclerView2.setAdapter(aVar);
        ((RecyclerView) mo110403a(R.id.rvChatterList)).addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendars.subscribe.contactcalendars.CalendarSubscribeContactSubView.C306001 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                if (i == 1) {
                    gVar.mo110512h();
                }
            }
        });
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(context);
        ((LKUIPtrClassicFrameLayout) mo110403a(R.id.rvPtrLayout)).setFooterView(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) mo110403a(R.id.rvPtrLayout)).addPtrUIHandler(chatWindowPtrLoadingHeader);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) mo110403a(R.id.rvPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "rvPtrLayout");
        lKUIPtrClassicFrameLayout.setMode(LKUIPtrFrameLayout.Mode.NONE);
        ((LKUIPtrClassicFrameLayout) mo110403a(R.id.rvPtrLayout)).setPtrHandler(new LKUIPtrDefaultHandler2(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendars.subscribe.contactcalendars.CalendarSubscribeContactSubView.C306012 */

            /* renamed from: a */
            final /* synthetic */ CalendarSubscribeContactSubView f76556a;

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f76556a = r1;
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
                CalendarSubscribeView.m113811a(this.f76556a.getCalendarSubscribeView(), this.f76556a.getPageCount(), SubViewType.Contact, null, 4, null);
            }
        });
        View findViewById = ((CalendarLoadingView) mo110403a(R.id.loadingView)).findViewById(R.id.loading_panel);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "loadingView.findViewById…yout>(R.id.loading_panel)");
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) findViewById).getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            View findViewById2 = ((CalendarLoadingView) mo110403a(R.id.loadingView)).findViewById(R.id.error_tip_panel);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "loadingView.findViewById…ut>(R.id.error_tip_panel)");
            ViewGroup.LayoutParams layoutParams3 = ((LinearLayout) findViewById2).getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams2.bottomMargin = C30022a.f74882a.utilsDependency().mo108192a(context) + UIUtils.dp2px(context, 129.0f);
                ((LinearLayout.LayoutParams) layoutParams3).bottomMargin = C30022a.f74882a.utilsDependency().mo108192a(context) + UIUtils.dp2px(context, 129.0f);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: a */
    private final void m113715a(ArrayList<SubscribeContactData> arrayList, LKUIPtrFrameLayout.Mode mode, String str) {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110403a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) mo110403a(R.id.rvChatterList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvChatterList");
        recyclerView.setVisibility(0);
        this.f76550a.mo110392a(arrayList);
        this.f76550a.mo110391a(str);
        this.f76550a.notifyDataSetChanged();
        CalendarPerfMonitor.m124413a("key_subscribe_contact_calendar");
        ((RecyclerView) mo110403a(R.id.rvChatterList)).scrollToPosition(0);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) mo110403a(R.id.rvPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "rvPtrLayout");
        lKUIPtrClassicFrameLayout.setMode(mode);
    }
}
