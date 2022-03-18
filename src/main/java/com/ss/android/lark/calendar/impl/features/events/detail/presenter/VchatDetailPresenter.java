package com.ss.android.lark.calendar.impl.features.events.detail.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.calendar.impl.features.calendarview.C30810k;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailActivity;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.detail.utils.AuthorityUtil;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoStartEndTime;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeetingEventInfo;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0014J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/VchatDetailPresenter;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/BaseDetailPresenter;", "initData", "Landroid/os/Bundle;", "view", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;", "model", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "(Landroid/os/Bundle;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;)V", "calendarId", "", "isFirstEnter", "", "startEndTime", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoStartEndTime;", "vchatId", "vchatStartTime", "", "loadEventData", "", "key", "originalTime", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.k */
public final class VchatDetailPresenter extends BaseDetailPresenter {

    /* renamed from: h */
    public static final Companion f79475h = new Companion(null);

    /* renamed from: a */
    public DoStartEndTime f79476a;

    /* renamed from: b */
    public boolean f79477b = true;

    /* renamed from: i */
    private final String f79478i;

    /* renamed from: j */
    private final String f79479j;

    /* renamed from: k */
    private final long f79480k;

    @JvmStatic
    /* renamed from: a */
    public static final void m118060a(Context context, String str, long j) {
        f79475h.mo113939a(context, str, j);
    }

    @JvmStatic
    /* renamed from: b */
    public static final Intent m118061b(Context context, String str, long j) {
        return f79475h.mo113940b(context, str, j);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/VchatDetailPresenter$Companion;", "", "()V", "KEY_VCHAT_ID", "", "KEY_VCHAT_START_TIME", "TAG", "getVchatEventDetailIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "vchatId", "vchatStartTimeStamp", "", "startEventDetailActivityFromVchat", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.k$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113939a(Context context, String str, long j) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "vchatId");
            Bundle bundle = new Bundle();
            bundle.putString("key_vchat_id", str);
            bundle.putLong("key_vchat_start_time", j);
            bundle.putInt("enterDetailSource", EventDetailSource.FROM_VCHAT_CARD.getValue());
            BaseDetailPresenter.f79314g.mo113872a(context, bundle);
            BaseDetailPresenter.f79314g.mo113873a("msg_vchat");
        }

        @JvmStatic
        /* renamed from: b */
        public final Intent mo113940b(Context context, String str, long j) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "vchatId");
            Bundle bundle = new Bundle();
            bundle.putString("key_vchat_id", str);
            bundle.putLong("key_vchat_start_time", j);
            bundle.putInt("enterDetailSource", EventDetailSource.FROM_VCHAT_NOTIFICATION.getValue());
            AppreciableHitPoint.f83321a.mo118695k();
            AbstractC30023a a = C30022a.f74882a.appRouter().mo108210a(EventDetailActivity.class);
            BaseDetailPresenter.f79314g.mo113873a("msg_vchat");
            Intent a2 = a.mo108151a(bundle).mo108150a(context);
            Intrinsics.checkExpressionValueIsNotNull(a2, "routerBuilder.param(bundle).intent(context)");
            return a2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter
    /* renamed from: a */
    public void mo113839a() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("TriplesDetailPresenter", C32673y.m125376b(valueOf, "sendOnCalOpenEventDetail", "calendar_id", this.f79478i, "id", this.f79479j, "time", String.valueOf(this.f79480k)));
        UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C31375b(this, valueOf, "sendOnCalOpenEventDetail"));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        String str = this.f79479j;
        long j = this.f79480k;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
        aVar.mo118933a(str, j, wrapAndAddGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/presenter/VchatDetailPresenter$loadEventData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeetingEventInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "doVideoMeetingEventInfo", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.k$b */
    public static final class C31375b implements IGetDataCallback<DoVideoMeetingEventInfo> {

        /* renamed from: a */
        final /* synthetic */ VchatDetailPresenter f79481a;

        /* renamed from: b */
        final /* synthetic */ String f79482b;

        /* renamed from: c */
        final /* synthetic */ String f79483c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TriplesDetailPresenter", C32673y.m125370a(this.f79482b, this.f79483c, errorResult));
            ((ICalendarDetailContact.IDetailView) this.f79481a.mo118651s()).mo113514e();
        }

        /* renamed from: a */
        public void onSuccess(DoVideoMeetingEventInfo gVar) {
            String serverId;
            String str;
            String str2;
            long j;
            Long b;
            Long a;
            String str3 = "";
            if (gVar != null) {
                Log.m165389i("TriplesDetailPresenter", C32673y.m125373a(this.f79482b, this.f79483c, new String[0]));
                this.f79481a.f79476a = gVar.mo120088b();
                ((ICalendarDetailContact.IDetailModel) this.f79481a.mo118652t()).mo113407a(gVar.mo120087a(), true);
                DoStartEndTime fVar = this.f79481a.f79476a;
                if (!(fVar == null || (a = fVar.mo120085a()) == null)) {
                    long longValue = a.longValue();
                    CalendarEventInstance i = ((ICalendarDetailContact.IDetailModel) this.f79481a.mo118652t()).mo113426i();
                    if (i != null) {
                        i.setStartTime(longValue);
                    }
                }
                DoStartEndTime fVar2 = this.f79481a.f79476a;
                if (!(fVar2 == null || (b = fVar2.mo120086b()) == null)) {
                    long longValue2 = b.longValue();
                    CalendarEventInstance i2 = ((ICalendarDetailContact.IDetailModel) this.f79481a.mo118652t()).mo113426i();
                    if (i2 != null) {
                        i2.setEndTime(longValue2);
                    }
                }
                if (!AuthorityUtil.f79153a.mo113574a(((ICalendarDetailContact.IDetailModel) this.f79481a.mo118652t()).mo113417c())) {
                    this.f79481a.mo113865m();
                    this.f79481a.mo113848a((List<String>) null);
                } else {
                    VchatDetailPresenter kVar = this.f79481a;
                    CalendarEvent c = ((ICalendarDetailContact.IDetailModel) kVar.mo118652t()).mo113417c();
                    if (c == null || (str = c.getCalendarId()) == null) {
                        str = str3;
                    }
                    CalendarEvent c2 = ((ICalendarDetailContact.IDetailModel) this.f79481a.mo118652t()).mo113417c();
                    if (c2 == null || (str2 = c2.getKey()) == null) {
                        str2 = str3;
                    }
                    CalendarEvent c3 = ((ICalendarDetailContact.IDetailModel) this.f79481a.mo118652t()).mo113417c();
                    if (c3 != null) {
                        j = c3.getOriginalTime();
                    } else {
                        j = 0;
                    }
                    kVar.mo113938a(str, str2, j);
                }
            } else {
                ((ICalendarDetailContact.IDetailView) this.f79481a.mo118651s()).mo113514e();
                Log.m165383e("TriplesDetailPresenter", C32673y.m125371a(this.f79482b, this.f79483c, "eventNull!"));
            }
            GeneralHitPoint.m124204a("card_message", "video_meeting", ((ICalendarDetailContact.IDetailModel) this.f79481a.mo118652t()).mo113417c());
            if (this.f79481a.f79477b) {
                CalendarEventHitPoint cVar = CalendarEventHitPoint.f83362a;
                CalendarEvent c4 = ((ICalendarDetailContact.IDetailModel) this.f79481a.mo118652t()).mo113417c();
                if (!(c4 == null || (serverId = c4.getServerId()) == null)) {
                    str3 = serverId;
                }
                cVar.mo118753c(str3, ((ICalendarDetailContact.IDetailModel) this.f79481a.mo118652t()).mo113397F());
                this.f79481a.f79477b = false;
            }
        }

        C31375b(VchatDetailPresenter kVar, String str, String str2) {
            this.f79481a = kVar;
            this.f79482b = str;
            this.f79483c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/presenter/VchatDetailPresenter$loadEventData$callback$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "sdkEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.k$c */
    public static final class C31376c implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ VchatDetailPresenter f79484a;

        /* renamed from: b */
        final /* synthetic */ String f79485b;

        /* renamed from: c */
        final /* synthetic */ String f79486c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TriplesDetailPresenter", C32673y.m125370a(this.f79485b, this.f79486c, errorResult));
            ((ICalendarDetailContact.IDetailView) this.f79484a.mo118651s()).mo113514e();
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            Log.m165389i("TriplesDetailPresenter", C32673y.m125373a(this.f79485b, this.f79486c, new String[0]));
            if (calendarEvent != null) {
                ((ICalendarDetailContact.IDetailModel) this.f79484a.mo118652t()).mo113407a(calendarEvent, true);
                this.f79484a.mo113857e();
                BaseDetailPresenter.m117871a(this.f79484a, calendarEvent, false, 2, null);
                this.f79484a.mo113851b(calendarEvent);
                return;
            }
            Log.m165383e("TriplesDetailPresenter", C32673y.m125378d("sdk_event_is_null"));
        }

        C31376c(VchatDetailPresenter kVar, String str, String str2) {
            this.f79484a = kVar;
            this.f79485b = str;
            this.f79486c = str2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VchatDetailPresenter(Bundle bundle, ICalendarDetailContact.IDetailView bVar, ICalendarDetailContact.IDetailModel aVar) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bundle, "initData");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        EventDetailSource a = EventDetailSource.Companion.mo113373a(bundle.getInt("enterDetailSource"));
        aVar.mo113403a(a == null ? EventDetailSource.FROM_VCHAT_CARD : a);
        C30810k a2 = C30810k.m114955a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "LoginInfoManager.getInstance()");
        String c = a2.mo111644c();
        Intrinsics.checkExpressionValueIsNotNull(c, "LoginInfoManager.getInstance().loginCalendarId");
        this.f79478i = c;
        String string = bundle.getString("key_vchat_id", "");
        Intrinsics.checkExpressionValueIsNotNull(string, "initData.getString(KEY_VCHAT_ID, \"\")");
        this.f79479j = string;
        this.f79480k = bundle.getLong("key_vchat_start_time", 0);
    }

    /* renamed from: a */
    public final void mo113938a(String str, String str2, long j) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("TriplesDetailPresenter", C32673y.m125376b(valueOf, "getEventRequest", "calendar_id", str, "key", str2, "original_time", String.valueOf(j)));
        mo113856d().mo118878b(str, str2, j, mo118653u().wrapAndAddGetDataCallback(new C31376c(this, valueOf, "getEventRequest")));
    }
}
