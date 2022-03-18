package com.ss.android.lark.calendar.impl.features.search.calendar;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract;
import com.ss.android.lark.calendar.impl.features.search.calendar.SearchChooseCalendarAdapter;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarView;", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarAdapter;", "mLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView$IViewAction;", "mViewData", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView$IViewData;", "getRootView", "()Landroid/view/View;", "create", "", "destroy", "initRecycleView", "initTitleView", "setDependency", "viewData", "viewAction", "showCalendar", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.g */
public final class SearchChooseCalendarView implements ISearchChooseCalendarContract.ISearchChooseCalendarView {

    /* renamed from: a */
    public ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewAction f82742a;

    /* renamed from: b */
    private SearchChooseCalendarAdapter f82743b;

    /* renamed from: c */
    private LinearLayoutManager f82744c;

    /* renamed from: d */
    private ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData f82745d;

    /* renamed from: e */
    private final View f82746e;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarView$initRecycleView$1", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarAdapter$OnViewItemClickListener;", "onClickSubscribe", "", "onItemClick", "calendarId", "", "isVisible", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.g$a */
    public static final class C32323a implements SearchChooseCalendarAdapter.OnViewItemClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchChooseCalendarView f82747a;

        @Override // com.ss.android.lark.calendar.impl.features.search.calendar.SearchChooseCalendarAdapter.OnViewItemClickListener
        /* renamed from: a */
        public void mo118090a() {
            SearchChooseCalendarView.m123348a(this.f82747a).mo118080a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32323a(SearchChooseCalendarView gVar) {
            this.f82747a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.calendar.SearchChooseCalendarAdapter.OnViewItemClickListener
        /* renamed from: a */
        public void mo118091a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            SearchChooseCalendarView.m123348a(this.f82747a).mo118081a(str, z);
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m123349b();
        m123350c();
        mo118079a();
    }

    /* renamed from: b */
    private final void m123349b() {
        ((CommonTitleBar) this.f82746e.findViewById(R.id.chooseCalendarTitleBar)).setTitle(C32634ae.m125182b(R.string.Calendar_EventSearch_ChooseCal));
        ((CommonTitleBar) this.f82746e.findViewById(R.id.chooseCalendarTitleBar)).setLeftClickListener(new C32324b(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract.ISearchChooseCalendarView
    /* renamed from: a */
    public void mo118079a() {
        ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData bVar = this.f82745d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        ArrayList<Calendar> a = bVar.mo118083a();
        SearchChooseCalendarAdapter cVar = this.f82743b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        ArrayList<Calendar> arrayList = a;
        ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData bVar2 = this.f82745d;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        cVar.mo118088a(arrayList, bVar2.mo118085b());
    }

    /* renamed from: c */
    private final void m123350c() {
        Context context = this.f82746e.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        RecyclerView recyclerView = (RecyclerView) this.f82746e.findViewById(R.id.searchChooseCalendars);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.searchChooseCalendars");
        SearchChooseCalendarAdapter cVar = new SearchChooseCalendarAdapter(context, recyclerView);
        this.f82743b = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        cVar.mo118087a(new C32323a(this));
        SearchChooseCalendarAdapter cVar2 = this.f82743b;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData bVar = this.f82745d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        cVar2.mo118086a(bVar);
        this.f82744c = new LinearLayoutManager(this.f82746e.getContext(), 1, false);
        RecyclerView recyclerView2 = (RecyclerView) this.f82746e.findViewById(R.id.searchChooseCalendars);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.searchChooseCalendars");
        SearchChooseCalendarAdapter cVar3 = this.f82743b;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        recyclerView2.setAdapter(cVar3);
        RecyclerView recyclerView3 = (RecyclerView) this.f82746e.findViewById(R.id.searchChooseCalendars);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rootView.searchChooseCalendars");
        LinearLayoutManager linearLayoutManager = this.f82744c;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutManager");
        }
        recyclerView3.setLayoutManager(linearLayoutManager);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarView$initTitleView$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.g$b */
    public static final class C32324b extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ SearchChooseCalendarView f82748a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32324b(SearchChooseCalendarView gVar) {
            this.f82748a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            SearchChooseCalendarView.m123348a(this.f82748a).mo118082b();
        }
    }

    public SearchChooseCalendarView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f82746e = view;
    }

    /* renamed from: a */
    public static final /* synthetic */ ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewAction m123348a(SearchChooseCalendarView gVar) {
        ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewAction aVar = gVar.f82742a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo109795a(ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData bVar, ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewAction aVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewData");
        Intrinsics.checkParameterIsNotNull(aVar, "viewAction");
        this.f82745d = bVar;
        this.f82742a = aVar;
    }
}
