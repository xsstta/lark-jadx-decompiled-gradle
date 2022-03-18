package com.ss.android.lark.calendar.impl.features.search.serviceimpl;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.calendar.api.entity.CalendarSearchEventsResponse;
import com.ss.android.lark.calendar.api.search.ICalendarModuleForSearch;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.search.CalendarSearchActivity;
import com.ss.android.lark.calendar.impl.features.search.SearchCalendarEventResult;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bH\u0016JI\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/serviceimpl/CalendarModuleForSearch;", "Lcom/ss/android/lark/calendar/api/search/ICalendarModuleForSearch;", "()V", "searchCalendarEvent", "", "searchKey", "", "callBack", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/api/entity/CalendarSearchEventsResponse;", "startCalendarEventDetailActivity", "calendarId", "key", "originalTime", "", "context", "Landroid/content/Context;", "startTime", "endTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Landroid/content/Context;Ljava/lang/Long;Ljava/lang/Long;)V", "startCalendarSearchActivity", "tabPageName", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.b.a */
public final class CalendarModuleForSearch implements ICalendarModuleForSearch {

    /* renamed from: a */
    public static final Companion f82707a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/serviceimpl/CalendarModuleForSearch$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/serviceimpl/CalendarModuleForSearch$searchCalendarEvent$searchCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.b.a$b */
    public static final class C32314b implements IGetDataCallback<SearchCalendarEventResult> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f82708a;

        C32314b(IGetDataCallback iGetDataCallback) {
            this.f82708a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(SearchCalendarEventResult fVar) {
            this.f82708a.onSuccess(CalendarSearchEntityParse.m123242a(fVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f82708a.onError(new ErrorResult("searchCalendarEventErr"));
        }
    }

    @Override // com.ss.android.lark.calendar.api.search.ICalendarModuleForSearch
    /* renamed from: a */
    public void mo108347a(String str, IGetDataCallback<List<CalendarSearchEventsResponse>> iGetDataCallback) {
        if (!TextUtils.isEmpty(str) && iGetDataCallback != null) {
            Log.m165389i("CalendarModuleForSearch", C32673y.m125376b(Long.toString(new Date().getTime()), "quickSearchCalendarEvent", new String[0]));
            UIGetDataCallback wrapAndAddGetDataCallback = new CallbackManager().wrapAndAddGetDataCallback(new C32314b(iGetDataCallback));
            CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
            aVar.mo118969h(str, wrapAndAddGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.calendar.api.search.ICalendarModuleForSearch
    /* renamed from: a */
    public void mo108346a(Context context, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "tabPageName");
        if (context != null) {
            CalendarSearchActivity.Companion aVar = CalendarSearchActivity.f82567c;
            if (str == null) {
                str = "";
            }
            aVar.mo117954a(context, str, str2);
        }
    }

    @Override // com.ss.android.lark.calendar.api.search.ICalendarModuleForSearch
    /* renamed from: a */
    public void mo108348a(String str, String str2, Long l, Context context, Long l2, Long l3) {
        long j;
        String str3;
        long j2;
        if (context != null) {
            long j3 = 0;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            String str4 = "";
            if (str2 != null) {
                str3 = str2;
            } else {
                str3 = str4;
            }
            if (str != null) {
                str4 = str;
            }
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            if (l3 != null) {
                j3 = l3.longValue();
            }
            C31238b.m116868a(context, j, str3, str4, j2, j3);
            GeneralHitPoint.m124272s("fast");
        }
    }
}
