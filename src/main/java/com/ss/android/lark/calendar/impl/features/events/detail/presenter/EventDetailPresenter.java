package com.ss.android.lark.calendar.impl.features.events.detail.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailActivity;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/EventDetailPresenter;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/BaseDetailPresenter;", "initData", "Landroid/os/Bundle;", "view", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;", "model", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "(Landroid/os/Bundle;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;)V", "calendarId", "", "eventInstance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "isFirstEnter", "", "key", "originalTime", "", ShareHitPoint.f121868c, "Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailSource;", "hitPoint", "", "loadEventData", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.c */
public final class EventDetailPresenter extends BaseDetailPresenter {

    /* renamed from: a */
    public static final Companion f79403a = new Companion(null);

    /* renamed from: b */
    private final EventDetailSource f79404b;

    /* renamed from: h */
    private final String f79405h;

    /* renamed from: i */
    private final String f79406i;

    /* renamed from: j */
    private final long f79407j;

    /* renamed from: k */
    private final CalendarEventInstance f79408k;

    /* renamed from: l */
    private boolean f79409l = true;

    @JvmStatic
    /* renamed from: a */
    public static final void m117986a(Activity activity, EventChipViewData eventChipViewData) {
        f79403a.mo113906a(activity, eventChipViewData);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m117987a(Activity activity, CalendarEventInstance calendarEventInstance) {
        f79403a.mo113907a(activity, calendarEventInstance);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m117988a(Context context, EventChipViewData eventChipViewData, boolean z) {
        f79403a.mo113908a(context, eventChipViewData, z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0003J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0003J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J \u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/EventDetailPresenter$Companion;", "", "()V", "TAG", "", "getActivityOptions", "Landroid/app/ActivityOptions;", "isOpenNearbyClick", "", "activity", "Landroid/app/Activity;", "getDetailActivityBundle", "Landroid/os/Bundle;", "chipViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "getEventDetailIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "startEventDetailActivity", "", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "startEventDetailActivityFromListView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Bundle mo113905a(EventChipViewData eventChipViewData) {
            long originalTime = eventChipViewData.getOriginalTime();
            String key = eventChipViewData.getKey();
            String calendarId = eventChipViewData.getCalendarId();
            Bundle bundle = new Bundle();
            bundle.putString("key", key);
            bundle.putString("calendar_id", calendarId);
            bundle.putLong("origin_time", originalTime);
            bundle.putInt("enterDetailSource", EventDetailSource.FROM_CALENDAR_VIEW.getValue());
            bundle.putSerializable("calendarInstance", eventChipViewData.getCalendarEventInstance());
            bundle.putString("calendar_meeting_title", eventChipViewData.getEventDetailTitle());
            CalendarEventInstance calendarEventInstance = eventChipViewData.getCalendarEventInstance();
            Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance, "chipViewData.calendarEventInstance");
            CalendarEvent.Type eventType = calendarEventInstance.getEventType();
            Intrinsics.checkExpressionValueIsNotNull(eventType, "chipViewData.calendarEventInstance.eventType");
            bundle.putInt("calendar_event_type", eventType.getNumber());
            return bundle;
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113906a(Activity activity, EventChipViewData eventChipViewData) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(eventChipViewData, "chipViewData");
            activity.startActivity(mo113904a((Context) activity, eventChipViewData));
            BaseDetailPresenter.f79314g.mo113873a("instance");
        }

        @JvmStatic
        /* renamed from: a */
        public final Intent mo113904a(Context context, EventChipViewData eventChipViewData) {
            Bundle a = mo113905a(eventChipViewData);
            AppreciableHitPoint.f83321a.mo118695k();
            C30022a.f74882a.statisticsDependency().mo108187b();
            AbstractC30023a a2 = C30022a.f74882a.appRouter().mo108210a(EventDetailActivity.class);
            Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarDependencyHolder…tailActivity::class.java)");
            Intent a3 = a2.mo108151a(a).mo108150a(context);
            Intrinsics.checkExpressionValueIsNotNull(a3, "routerBuilder.param(bundle).intent(context)");
            return a3;
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113907a(Activity activity, CalendarEventInstance calendarEventInstance) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(calendarEventInstance, "instance");
            long originalTime = calendarEventInstance.getOriginalTime();
            String key = calendarEventInstance.getKey();
            String calendarId = calendarEventInstance.getCalendarId();
            Bundle bundle = new Bundle();
            bundle.putString("key", key);
            bundle.putString("calendar_id", calendarId);
            bundle.putLong("origin_time", originalTime);
            bundle.putInt("enterDetailSource", EventDetailSource.FROM_MEETING_CHAT_CARD.getValue());
            bundle.putSerializable("calendarInstance", calendarEventInstance);
            bundle.putString("calendar_meeting_title", calendarEventInstance.getSummary());
            bundle.putInt("calendar_event_type", CalendarEvent.Type.DEFAULT_TYPE.getNumber());
            BaseDetailPresenter.f79314g.mo113872a(activity, bundle);
            BaseDetailPresenter.f79314g.mo113873a("side_bar");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113908a(Context context, EventChipViewData eventChipViewData, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(eventChipViewData, "chipViewData");
            Bundle a = mo113905a(eventChipViewData);
            C30022a.f74882a.statisticsDependency().mo108187b();
            BaseDetailPresenter.f79314g.mo113872a(context, a);
            BaseDetailPresenter.f79314g.mo113873a("instance");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter
    /* renamed from: a */
    public void mo113839a() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("EventDetailPresenter", C32673y.m125376b(valueOf, "getEventRequest", "calendar_id", this.f79405h, "key", this.f79406i, "original_time", String.valueOf(this.f79407j)));
        mo113856d().mo118878b(this.f79405h, this.f79406i, this.f79407j, mo118653u().wrapAndAddGetDataCallback(new C31366b(this, valueOf, "getEventRequest")));
    }

    /* renamed from: c */
    public final void mo113897c() {
        String str;
        if (this.f79409l) {
            CalendarEventHitPoint cVar = CalendarEventHitPoint.f83362a;
            CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
            if (c == null || (str = c.getServerId()) == null) {
                str = "";
            }
            cVar.mo118753c(str, ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113397F());
            this.f79409l = false;
        }
        if (this.f79404b == EventDetailSource.FROM_MEETING_CHAT_CARD) {
            GeneralHitPoint.m124204a("chat_side_bar", "no_value", ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c());
        } else {
            GeneralHitPoint.m124204a("instance_block", "no_value", ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/presenter/EventDetailPresenter$loadEventData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "sdkEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.c$b */
    public static final class C31366b implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ EventDetailPresenter f79410a;

        /* renamed from: b */
        final /* synthetic */ String f79411b;

        /* renamed from: c */
        final /* synthetic */ String f79412c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EventDetailPresenter", C32673y.m125370a(this.f79411b, this.f79412c, errorResult));
            ((ICalendarDetailContact.IDetailView) this.f79410a.mo118651s()).mo113514e();
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            Log.m165389i("EventDetailPresenter", C32673y.m125373a(this.f79411b, this.f79412c, new String[0]));
            if (calendarEvent != null) {
                ((ICalendarDetailContact.IDetailModel) this.f79410a.mo118652t()).mo113406a(calendarEvent);
                this.f79410a.mo113857e();
                BaseDetailPresenter.m117871a(this.f79410a, calendarEvent, false, 2, null);
                this.f79410a.mo113851b(calendarEvent);
                this.f79410a.mo113897c();
                return;
            }
            Log.m165389i("EventDetailPresenter", C32673y.m125378d("sdk_event_is_null"));
        }

        C31366b(EventDetailPresenter cVar, String str, String str2) {
            this.f79410a = cVar;
            this.f79411b = str;
            this.f79412c = str2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventDetailPresenter(Bundle bundle, ICalendarDetailContact.IDetailView bVar, ICalendarDetailContact.IDetailModel aVar) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bundle, "initData");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        EventDetailSource a = EventDetailSource.Companion.mo113373a(bundle.getInt("enterDetailSource"));
        a = a == null ? EventDetailSource.FROM_CALENDAR_VIEW : a;
        this.f79404b = a;
        aVar.mo113403a(a);
        Serializable serializable = bundle.getSerializable("calendarInstance");
        CalendarEventInstance calendarEventInstance = (CalendarEventInstance) (!(serializable instanceof CalendarEventInstance) ? null : serializable);
        this.f79408k = calendarEventInstance;
        if (calendarEventInstance != null) {
            aVar.mo113409a(calendarEventInstance);
        }
        String string = bundle.getString("calendar_id", "");
        Intrinsics.checkExpressionValueIsNotNull(string, "initData.getString(Calen…Y_PARAMS_CALENDAR_ID, \"\")");
        this.f79405h = string;
        String string2 = bundle.getString("key", "");
        Intrinsics.checkExpressionValueIsNotNull(string2, "initData.getString(Calen…onfig.KEY_PARAMS_KEY, \"\")");
        this.f79406i = string2;
        this.f79407j = bundle.getLong("origin_time", 0);
    }
}
