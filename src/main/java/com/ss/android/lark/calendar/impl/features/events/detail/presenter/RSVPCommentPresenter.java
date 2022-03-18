package com.ss.android.lark.calendar.impl.features.events.detail.presenter;

import android.app.Activity;
import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.common.helper.LargeCalendarTransmitHelper;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfoMonitor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventUniqueField;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/RSVPCommentPresenter;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/BaseDetailPresenter;", "initData", "Landroid/os/Bundle;", "view", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;", "model", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "(Landroid/os/Bundle;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;)V", "calendarId", "", "isFirstEnter", "", "key", "originalTime", "", ShareHitPoint.f121868c, "Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailSource;", "loadEventData", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.e */
public final class RSVPCommentPresenter extends BaseDetailPresenter {

    /* renamed from: a */
    public static final Companion f79419a = new Companion(null);

    /* renamed from: b */
    private final EventDetailSource f79420b;

    /* renamed from: h */
    private final String f79421h;

    /* renamed from: i */
    private final String f79422i;

    /* renamed from: j */
    private final long f79423j;

    /* renamed from: k */
    private boolean f79424k;

    @JvmStatic
    /* renamed from: a */
    public static final void m118010a(Activity activity, Bundle bundle) {
        f79419a.mo113915a(activity, bundle);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/RSVPCommentPresenter$Companion;", "", "()V", "TAG", "", "startEventDetailActivityFromRSVPCommentBot", "", "activity", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113915a(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(bundle, "bundle");
            bundle.putInt("enterDetailSource", EventDetailSource.FROM_RSVP_COMMENT_BOT.getValue());
            bundle.putInt("calendar_event_type", CalendarEvent.Type.MEETING.getNumber());
            C30022a.f74882a.statisticsDependency().mo108187b();
            CalendarPerfoMonitor.m124405a(CalendarPerfoMonitor.EventType.PERF_CAL_DETAIL, CalendarPerfoMonitor.TrackerType.BOT);
            BaseDetailPresenter.f79314g.mo113872a(activity, bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter
    /* renamed from: a */
    public void mo113839a() {
        String str;
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c == null || !this.f79424k) {
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("RSVPCommentPresenter", C32673y.m125376b(valueOf, "getServerEventsByUniqueFieldRequest", "calendar_id", this.f79421h, "key", this.f79422i, "original_time", String.valueOf(this.f79423j)));
            mo113856d().mo118856a(new CalendarEventUniqueField(this.f79421h, this.f79422i, Long.valueOf(this.f79423j)), mo118653u().wrapAndAddGetDataCallback(new C31367b(this, valueOf, "getServerEventsByUniqueFieldRequest")));
            return;
        }
        ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113407a(c, true);
        mo113851b(c);
        mo113857e();
        this.f79424k = false;
        CalendarEventHitPoint cVar = CalendarEventHitPoint.f83362a;
        CalendarEvent c2 = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c2 == null || (str = c2.getServerId()) == null) {
            str = "";
        }
        cVar.mo118753c(str, ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113397F());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/presenter/RSVPCommentPresenter$loadEventData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "events", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.e$b */
    public static final class C31367b implements IGetDataCallback<List<? extends CalendarEvent>> {

        /* renamed from: a */
        final /* synthetic */ RSVPCommentPresenter f79425a;

        /* renamed from: b */
        final /* synthetic */ String f79426b;

        /* renamed from: c */
        final /* synthetic */ String f79427c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("RSVPCommentPresenter", C32673y.m125370a(this.f79426b, this.f79427c, errorResult));
            ((ICalendarDetailContact.IDetailView) this.f79425a.mo118651s()).mo113514e();
        }

        /* renamed from: a */
        public void onSuccess(List<? extends CalendarEvent> list) {
            Integer num;
            String str = this.f79426b;
            String str2 = this.f79427c;
            String[] strArr = new String[2];
            strArr[0] = "result = ";
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            strArr[1] = String.valueOf(num);
            Log.m165389i("RSVPCommentPresenter", C32673y.m125373a(str, str2, strArr));
            if (CollectionUtils.isEmpty(list)) {
                ((ICalendarDetailContact.IDetailView) this.f79425a.mo118651s()).mo113514e();
            } else if (list != null) {
                ((ICalendarDetailContact.IDetailModel) this.f79425a.mo118652t()).mo113407a((CalendarEvent) list.get(0), true);
                this.f79425a.mo113857e();
            }
        }

        C31367b(RSVPCommentPresenter eVar, String str, String str2) {
            this.f79425a = eVar;
            this.f79426b = str;
            this.f79427c = str2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RSVPCommentPresenter(Bundle bundle, ICalendarDetailContact.IDetailView bVar, ICalendarDetailContact.IDetailModel aVar) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bundle, "initData");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        EventDetailSource a = EventDetailSource.Companion.mo113373a(bundle.getInt("enterDetailSource", -1));
        a = a == null ? EventDetailSource.FROM_RSVP_COMMENT_BOT : a;
        this.f79420b = a;
        aVar.mo113403a(a);
        String str = "";
        String string = bundle.getString("calendar_id", str);
        Intrinsics.checkExpressionValueIsNotNull(string, "initData.getString(Calen…Y_PARAMS_CALENDAR_ID, \"\")");
        this.f79421h = string;
        String string2 = bundle.getString("key", str);
        Intrinsics.checkExpressionValueIsNotNull(string2, "initData.getString(Calen…onfig.KEY_PARAMS_KEY, \"\")");
        this.f79422i = string2;
        this.f79423j = bundle.getLong("origin_time", 0);
        aVar.mo113408a(CalendarEventAttendee.Status.forNumber(bundle.getInt("event_attendee_status")));
        String string3 = bundle.getString("rsvp_invitor_name");
        aVar.mo113412a(string3 != null ? string3 : str);
        aVar.mo113406a(LargeCalendarTransmitHelper.m116179a(bundle));
        this.f79424k = true;
    }
}
