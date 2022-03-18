package com.ss.android.lark.calendar.impl.features.search.calendar;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0002\u0017\u0018B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nJ\"\u0010\u000f\u001a\u00020\r2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013J\"\u0010\u0014\u001a\u00020\r2\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0013R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarPresenter;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BasePresenterCalendar;", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarModel;", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView;", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView$IViewData;", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView$IViewAction;", "searchChooseView", "searchChooseModel", "(Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView;Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarModel;)V", "mDependency", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarPresenter$Dependency;", "getViewAction", "setDependency", "", "dependency", "updateCalendars", "calendars", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/ArrayList;", "updateSelectedCalendarIds", "selectedCalendarIds", "", "Companion", "Dependency", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.f */
public final class SearchChooseCalendarPresenter extends BasePresenterCalendar<ISearchChooseCalendarContract.ISearchChooseCalendarModel, ISearchChooseCalendarContract.ISearchChooseCalendarView, ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData, ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewAction> {

    /* renamed from: b */
    public static final Companion f82737b = new Companion(null);

    /* renamed from: a */
    public Dependency f82738a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarPresenter$Dependency;", "", "onBackPressed", "", "onSaveSelected", "selectedIds", "", "", "startSubscribeActivity", "requestCode", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.f$b */
    public interface Dependency {
        /* renamed from: a */
        void mo118096a();

        /* renamed from: a */
        void mo118097a(int i);

        /* renamed from: a */
        void mo118098a(List<String> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarPresenter$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewAction mo109713b() {
        return new C32321c(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarPresenter$getViewAction$1", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView$IViewAction;", "onBackPressed", "", "onClickSubscribeCalendar", "onItemClicked", "calendarId", "", "isSelected", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.f$c */
    public static final class C32321c implements ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewAction {

        /* renamed from: a */
        final /* synthetic */ SearchChooseCalendarPresenter f82739a;

        @Override // com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewAction
        /* renamed from: a */
        public void mo118080a() {
            Dependency bVar = this.f82739a.f82738a;
            if (bVar != null) {
                bVar.mo118097a(1);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewAction
        /* renamed from: b */
        public void mo118082b() {
            Dependency bVar = this.f82739a.f82738a;
            if (bVar != null) {
                bVar.mo118096a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32321c(SearchChooseCalendarPresenter fVar) {
            this.f82739a = fVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarPresenter$getViewAction$1$onItemClicked$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.f$c$a */
        public static final class C32322a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ String f82740a;

            /* renamed from: b */
            final /* synthetic */ String f82741b;

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("SearchChooseCalendarPresenter", C32673y.m125373a(this.f82740a, this.f82741b, new String[0]));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("SearchChooseCalendarPresenter", C32673y.m125370a(this.f82740a, this.f82741b, errorResult));
            }

            C32322a(String str, String str2) {
                this.f82740a = str;
                this.f82741b = str2;
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewAction
        /* renamed from: a */
        public void mo118081a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            if (z) {
                ((ISearchChooseCalendarContract.ISearchChooseCalendarModel) this.f82739a.mo118652t()).mo118075a(str);
                String valueOf = String.valueOf(new Date().getTime());
                Log.m165389i("SearchChooseCalendarPresenter", C32673y.m125376b(valueOf, "updateCalendar", "calendar_id", str, "visibility", String.valueOf(true)));
                C30076a.m111290a().mo108425a(str, true, (IGetDataCallback<Boolean>) new C32322a(valueOf, "updateCalendar"));
            } else {
                ((ISearchChooseCalendarContract.ISearchChooseCalendarModel) this.f82739a.mo118652t()).mo118077b(str);
            }
            Dependency bVar = this.f82739a.f82738a;
            if (bVar != null) {
                bVar.mo118098a(((ISearchChooseCalendarContract.ISearchChooseCalendarModel) this.f82739a.mo118652t()).mo118074a());
            }
        }
    }

    /* renamed from: a */
    public final void mo118104a(Dependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f82738a = bVar;
    }

    /* renamed from: a */
    public final void mo118105a(ArrayList<String> arrayList) {
        if (arrayList != null) {
            ((ISearchChooseCalendarContract.ISearchChooseCalendarModel) mo118652t()).mo118076a(arrayList);
            ((ISearchChooseCalendarContract.ISearchChooseCalendarView) mo118651s()).mo118079a();
        }
    }

    /* renamed from: b */
    public final void mo118106b(ArrayList<Calendar> arrayList) {
        if (arrayList != null) {
            ((ISearchChooseCalendarContract.ISearchChooseCalendarModel) mo118652t()).mo118078b(arrayList);
            ((ISearchChooseCalendarContract.ISearchChooseCalendarView) mo118651s()).mo118079a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchChooseCalendarPresenter(ISearchChooseCalendarContract.ISearchChooseCalendarView bVar, ISearchChooseCalendarContract.ISearchChooseCalendarModel aVar) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bVar, "searchChooseView");
        Intrinsics.checkParameterIsNotNull(aVar, "searchChooseModel");
    }
}
