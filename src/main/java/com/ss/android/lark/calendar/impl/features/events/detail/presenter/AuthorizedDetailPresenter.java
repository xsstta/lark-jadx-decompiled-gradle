package com.ss.android.lark.calendar.impl.features.events.detail.presenter;

import android.content.Context;
import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetAuthorizedEventByUniqueFieldResponse;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/AuthorizedDetailPresenter;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/BaseDetailPresenter;", "initData", "Landroid/os/Bundle;", "view", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;", "model", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "(Landroid/os/Bundle;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;)V", "calendarId", "", "key", "originalTime", "", "startTime", "loadEventData", "", "updateInstanceTime", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.a */
public final class AuthorizedDetailPresenter extends BaseDetailPresenter {

    /* renamed from: b */
    public static final Companion f79383b = new Companion(null);

    /* renamed from: a */
    public long f79384a;

    /* renamed from: h */
    private final String f79385h;

    /* renamed from: i */
    private final String f79386i;

    /* renamed from: j */
    private final long f79387j;

    @JvmStatic
    /* renamed from: a */
    public static final void m117976a(Context context, String str, String str2, long j, long j2) {
        f79383b.mo113898a(context, str, str2, j, j2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/AuthorizedDetailPresenter$Companion;", "", "()V", "TAG", "", "startEventDetailActivity", "", "context", "Landroid/content/Context;", "calendarId", "key", "originalTime", "", "startTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113898a(Context context, String str, String str2, long j, long j2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(str2, "key");
            Bundle bundle = new Bundle();
            bundle.putString("calendar_id", str);
            bundle.putString("key", str2);
            bundle.putLong("origin_time", j);
            bundle.putLong("calendar_event_start_time", j2);
            bundle.putInt("enterDetailSource", EventDetailSource.FROM_AUTHORIZED_APP_LINK.getValue());
            BaseDetailPresenter.f79314g.mo113872a(context, bundle);
        }
    }

    /* renamed from: c */
    public final void mo113897c() {
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c != null) {
            long j = this.f79384a;
            if (j != -1) {
                long endTime = j + (c.getEndTime() - c.getStartTime());
                CalendarEventInstance i = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113426i();
                if (i != null) {
                    i.setStartTime(this.f79384a);
                }
                CalendarEventInstance i2 = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113426i();
                if (i2 != null) {
                    i2.setEndTime(endTime);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter
    /* renamed from: a */
    public void mo113839a() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("AppLinkDetailPresenter", C32673y.m125376b(valueOf, "getEventRequest", "calendar_id", this.f79385h, "key", this.f79386i, "original_time", String.valueOf(this.f79387j)));
        mo113856d().mo118859a(this.f79385h, this.f79386i, this.f79387j, this.f79384a, mo118653u().wrapAndAddGetDataCallback(new C31361b(this, valueOf, "getEventRequest")));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/presenter/AuthorizedDetailPresenter$loadEventData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetAuthorizedEventByUniqueFieldResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.a$b */
    public static final class C31361b implements IGetDataCallback<GetAuthorizedEventByUniqueFieldResponse> {

        /* renamed from: a */
        final /* synthetic */ AuthorizedDetailPresenter f79388a;

        /* renamed from: b */
        final /* synthetic */ String f79389b;

        /* renamed from: c */
        final /* synthetic */ String f79390c;

        /* renamed from: a */
        public void onSuccess(GetAuthorizedEventByUniqueFieldResponse getAuthorizedEventByUniqueFieldResponse) {
            Intrinsics.checkParameterIsNotNull(getAuthorizedEventByUniqueFieldResponse, "response");
            Log.m165389i("AppLinkDetailPresenter", C32673y.m125373a(this.f79389b, this.f79390c, new String[0]));
            CalendarEvent a = getAuthorizedEventByUniqueFieldResponse.mo119856a();
            if (a != null) {
                if (this.f79388a.f79384a != -1) {
                    this.f79388a.f79384a = getAuthorizedEventByUniqueFieldResponse.mo119858c();
                }
                ((ICalendarDetailContact.IDetailModel) this.f79388a.mo118652t()).mo113407a(a, true);
                this.f79388a.mo113897c();
                this.f79388a.mo113857e();
                if (getAuthorizedEventByUniqueFieldResponse.mo119857b() == GetAuthorizedEventByUniqueFieldResponse.EventSource.Local) {
                    this.f79388a.mo113847a(a, true);
                }
                this.f79388a.mo113851b(a);
                return;
            }
            Log.m165383e("AppLinkDetailPresenter", C32673y.m125378d("sdk_event_is_null"));
            onError(new ErrorResult("event is null"));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("AppLinkDetailPresenter", C32673y.m125370a(this.f79389b, this.f79390c, errorResult));
            int errorCode = errorResult.getErrorCode();
            if (errorCode == 8048) {
                ICalendarDetailContact.IDetailView bVar = (ICalendarDetailContact.IDetailView) this.f79388a.mo118651s();
                String displayMsg = errorResult.getDisplayMsg();
                if (displayMsg == null) {
                    displayMsg = "";
                }
                bVar.mo113502a(displayMsg);
            } else if (errorCode != 10026) {
                ((ICalendarDetailContact.IDetailView) this.f79388a.mo118651s()).mo113514e();
            } else {
                String b = C32634ae.m125182b(R.string.Calendar_Share_EventExpired);
                Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…endar_Share_EventExpired)");
                ((ICalendarDetailContact.IDetailView) this.f79388a.mo118651s()).mo113502a(b);
            }
        }

        C31361b(AuthorizedDetailPresenter aVar, String str, String str2) {
            this.f79388a = aVar;
            this.f79389b = str;
            this.f79390c = str2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthorizedDetailPresenter(Bundle bundle, ICalendarDetailContact.IDetailView bVar, ICalendarDetailContact.IDetailModel aVar) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bundle, "initData");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        String string = bundle.getString("calendar_id", "");
        Intrinsics.checkExpressionValueIsNotNull(string, "initData.getString(Calen…Y_PARAMS_CALENDAR_ID, \"\")");
        this.f79385h = string;
        String string2 = bundle.getString("key", "");
        Intrinsics.checkExpressionValueIsNotNull(string2, "initData.getString(Calen…onfig.KEY_PARAMS_KEY, \"\")");
        this.f79386i = string2;
        this.f79387j = bundle.getLong("origin_time", 0);
        this.f79384a = bundle.getLong("calendar_event_start_time", -1);
    }
}
