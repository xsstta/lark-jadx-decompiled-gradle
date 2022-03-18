package com.ss.android.lark.calendar.impl.features.events.detail.presenter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.detail.utils.AuthorityUtil;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetSharedCalendarEventResponse;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0014H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/ShareDetailPresenter;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/BaseDetailPresenter;", "initData", "Landroid/os/Bundle;", "view", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;", "model", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "(Landroid/os/Bundle;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;)V", "calendarId", "", "isFirstEnter", "", "key", "mStartTime", "", "originalTime", ShareHitPoint.f121868c, "Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailSource;", "loadEventData", "", "loadSdkEventData", "eventInfo", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "updateInstanceTime", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.h */
public final class ShareDetailPresenter extends BaseDetailPresenter {

    /* renamed from: b */
    public static final String f79446b = TriplesDetailPresenter.class.getSimpleName();

    /* renamed from: h */
    public static final Companion f79447h = new Companion(null);

    /* renamed from: a */
    public boolean f79448a = true;

    /* renamed from: i */
    private final EventDetailSource f79449i;

    /* renamed from: j */
    private final String f79450j;

    /* renamed from: k */
    private final String f79451k;

    /* renamed from: l */
    private final long f79452l;

    /* renamed from: m */
    private final long f79453m;

    @JvmStatic
    /* renamed from: a */
    public static final void m118035a(Activity activity, CalendarEvent calendarEvent, String str) {
        f79447h.mo113927a(activity, calendarEvent, str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m118036a(Context context, Bundle bundle) {
        f79447h.mo113928a(context, bundle);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/ShareDetailPresenter$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "startEventDetailActivity", "", "activity", "Landroid/app/Activity;", "shareEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "messageId", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113928a(Context context, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(bundle, "bundle");
            BaseDetailPresenter.f79314g.mo113872a(context, bundle);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113927a(Activity activity, CalendarEvent calendarEvent, String str) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(calendarEvent, "shareEvent");
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            Bundle bundle = new Bundle();
            bundle.putString("key", calendarEvent.getKey());
            bundle.putString("calendar_id", calendarEvent.getCalendarId());
            bundle.putLong("origin_time", calendarEvent.getOriginalTime());
            bundle.putInt("enterDetailSource", EventDetailSource.FROM_SHARE_EVENT.getValue());
            bundle.putString("calendar_meeting_title", calendarEvent.getSummary());
            bundle.putString("message_id", str);
            bundle.putInt("calendar_event_type", CalendarEvent.Type.MEETING.getNumber());
            BaseDetailPresenter.f79314g.mo113872a(activity, bundle);
            C30022a.f74882a.statisticsDependency().mo108187b();
            BaseDetailPresenter.f79314g.mo113873a("msg_share");
        }
    }

    /* renamed from: c */
    public final void mo113897c() {
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c != null) {
            long j = this.f79453m;
            if (j != -1) {
                long endTime = j + (c.getEndTime() - c.getStartTime());
                CalendarEventInstance i = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113426i();
                if (i != null) {
                    i.setStartTime(this.f79453m);
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
        Log.m165389i(f79446b, C32673y.m125376b(valueOf, "getCalendarEventInfo", "calendar_id", this.f79450j, "key", this.f79451k, "original_time", String.valueOf(this.f79452l)));
        UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C31370b(this, valueOf, "getCalendarEventInfo"));
        AbstractC32594f d = mo113856d();
        String str = this.f79450j;
        String str2 = this.f79451k;
        long j = this.f79452l;
        String n = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113431n();
        if (n == null) {
            n = "";
        }
        d.mo118868a(str, str2, j, n, ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113432o(), wrapAndAddGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/presenter/ShareDetailPresenter$loadEventData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetSharedCalendarEventResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "eventData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.h$b */
    public static final class C31370b implements IGetDataCallback<GetSharedCalendarEventResponse> {

        /* renamed from: a */
        final /* synthetic */ ShareDetailPresenter f79454a;

        /* renamed from: b */
        final /* synthetic */ String f79455b;

        /* renamed from: c */
        final /* synthetic */ String f79456c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(ShareDetailPresenter.f79446b, C32673y.m125370a(this.f79455b, this.f79456c, errorResult));
            ((ICalendarDetailContact.IDetailView) this.f79454a.mo118651s()).mo113514e();
        }

        /* renamed from: a */
        public void onSuccess(GetSharedCalendarEventResponse lVar) {
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(lVar, "eventData");
            CalendarEvent a = lVar.mo120121a();
            if (a == null) {
                str = "event=null";
            } else {
                str = a.getKey();
            }
            Log.m165389i(ShareDetailPresenter.f79446b, C32673y.m125373a(this.f79455b, this.f79456c, "eventKey", str));
            if (a != null) {
                if (!AuthorityUtil.f79153a.mo113574a(a)) {
                    ((ICalendarDetailContact.IDetailModel) this.f79454a.mo118652t()).mo113410a(lVar.mo120122b());
                    ((ICalendarDetailContact.IDetailModel) this.f79454a.mo118652t()).mo113407a(a, true);
                    this.f79454a.mo113897c();
                    this.f79454a.mo113865m();
                    this.f79454a.mo113848a((List<String>) null);
                } else {
                    this.f79454a.mo113926d(a);
                }
                GeneralHitPoint.m124204a("card_message", "share_event", a);
                if (this.f79454a.f79448a) {
                    CalendarEventHitPoint cVar = CalendarEventHitPoint.f83362a;
                    CalendarEvent c = ((ICalendarDetailContact.IDetailModel) this.f79454a.mo118652t()).mo113417c();
                    if (c == null || (str2 = c.getServerId()) == null) {
                        str2 = "";
                    }
                    cVar.mo118753c(str2, ((ICalendarDetailContact.IDetailModel) this.f79454a.mo118652t()).mo113397F());
                    this.f79454a.f79448a = false;
                }
            }
        }

        C31370b(ShareDetailPresenter hVar, String str, String str2) {
            this.f79454a = hVar;
            this.f79455b = str;
            this.f79456c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/presenter/ShareDetailPresenter$loadSdkEventData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "sdkEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.h$c */
    public static final class C31371c implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ ShareDetailPresenter f79457a;

        /* renamed from: b */
        final /* synthetic */ String f79458b;

        /* renamed from: c */
        final /* synthetic */ String f79459c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(ShareDetailPresenter.f79446b, C32673y.m125370a(this.f79458b, this.f79459c, errorResult));
            ((ICalendarDetailContact.IDetailView) this.f79457a.mo118651s()).mo113514e();
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            Log.m165389i(ShareDetailPresenter.f79446b, C32673y.m125373a(this.f79458b, this.f79459c, new String[0]));
            if (calendarEvent != null) {
                ((ICalendarDetailContact.IDetailModel) this.f79457a.mo118652t()).mo113407a(calendarEvent, true);
                this.f79457a.mo113897c();
                this.f79457a.mo113857e();
                BaseDetailPresenter.m117871a(this.f79457a, calendarEvent, false, 2, null);
                this.f79457a.mo113851b(calendarEvent);
                return;
            }
            Log.m165383e(ShareDetailPresenter.f79446b, C32673y.m125378d("sdk_event_is_null"));
        }

        C31371c(ShareDetailPresenter hVar, String str, String str2) {
            this.f79457a = hVar;
            this.f79458b = str;
            this.f79459c = str2;
        }
    }

    /* renamed from: d */
    public final void mo113926d(CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "eventInfo");
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(f79446b, C32673y.m125376b(valueOf, "getEventRequest", "calendar_id", calendarEvent.getCalendarId(), "key", calendarEvent.getKey(), "original_time", String.valueOf(calendarEvent.getOriginalTime())));
        mo113856d().mo118878b(calendarEvent.getCalendarId(), calendarEvent.getKey(), calendarEvent.getOriginalTime(), mo118653u().wrapAndAddGetDataCallback(new C31371c(this, valueOf, "getEventRequest")));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareDetailPresenter(Bundle bundle, ICalendarDetailContact.IDetailView bVar, ICalendarDetailContact.IDetailModel aVar) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bundle, "initData");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        EventDetailSource a = EventDetailSource.Companion.mo113373a(bundle.getInt("enterDetailSource"));
        a = a == null ? EventDetailSource.FROM_SHARE_EVENT : a;
        this.f79449i = a;
        aVar.mo113403a(a);
        String string = bundle.getString("calendar_id", "");
        Intrinsics.checkExpressionValueIsNotNull(string, "initData.getString(Calen…Y_PARAMS_CALENDAR_ID, \"\")");
        this.f79450j = string;
        String string2 = bundle.getString("key", "");
        Intrinsics.checkExpressionValueIsNotNull(string2, "initData.getString(Calen…onfig.KEY_PARAMS_KEY, \"\")");
        this.f79451k = string2;
        this.f79452l = bundle.getLong("origin_time", 0);
        this.f79453m = bundle.getLong("calendar_event_start_time", -1);
        aVar.mo113416b(bundle.getString("message_id", ""));
        aVar.mo113419c(bundle.getString("key_params_share_user_token", ""));
    }
}
