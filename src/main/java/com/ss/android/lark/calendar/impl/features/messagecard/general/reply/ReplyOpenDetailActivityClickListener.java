package com.ss.android.lark.calendar.impl.features.messagecard.general.reply;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.C30810k;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.common.helper.LargeCalendarTransmitHelper;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.CalendarCardContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.RSVPCommentCardInfo;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardHelper;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventUniqueField;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J,\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/general/reply/ReplyOpenDetailActivityClickListener;", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "content", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarCardContent;", "cardInfo", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/RSVPCommentCardInfo;", "(Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarCardContent;Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/RSVPCommentCardInfo;)V", "getCardInfo", "()Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/RSVPCommentCardInfo;", "setCardInfo", "(Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/RSVPCommentCardInfo;)V", "getContent", "()Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarCardContent;", "setContent", "(Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarCardContent;)V", "doClick", "", "view", "Landroid/view/View;", "getOpenDetailCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "startEventDetailActivityFromRSVPBot", "activity", "Landroid/app/Activity;", "event", "invitorName", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.b.c */
public final class ReplyOpenDetailActivityClickListener extends AbstractView$OnClickListenerC32626b {

    /* renamed from: a */
    private CalendarCardContent f82352a;

    /* renamed from: b */
    private RSVPCommentCardInfo f82353b;

    /* renamed from: a */
    public final CalendarCardContent mo117748a() {
        return this.f82352a;
    }

    /* renamed from: b */
    public final RSVPCommentCardInfo mo117750b() {
        return this.f82353b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/general/reply/ReplyOpenDetailActivityClickListener$getOpenDetailCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "events", "showErrorDialog", "showEventRemovedDialog", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.b.c$a */
    public static final class C32203a implements IGetDataCallback<List<? extends CalendarEvent>> {

        /* renamed from: a */
        final /* synthetic */ ReplyOpenDetailActivityClickListener f82354a;

        /* renamed from: b */
        final /* synthetic */ View f82355b;

        /* renamed from: a */
        private final void m122753a() {
            Context context = this.f82355b.getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null && UIUtils.isActivityRunning(activity)) {
                new RequestLoadingDialog(activity).mo112589a(false, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, true);
            }
        }

        /* renamed from: b */
        private final void m122754b() {
            Context context = this.f82355b.getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null && UIUtils.isActivityRunning(activity)) {
                RequestLoadingDialog requestLoadingDialog = new RequestLoadingDialog(activity);
                requestLoadingDialog.mo112592c(R.string.Calendar_Transfer_eventNoLongerExist);
                requestLoadingDialog.show();
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            m122754b();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/general/reply/ReplyOpenDetailActivityClickListener$getOpenDetailCallback$1$onSuccess$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "inviterName", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.b.c$a$a */
        public static final class C32204a implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ C32203a f82356a;

            /* renamed from: b */
            final /* synthetic */ CalendarEvent f82357b;

            /* renamed from: a */
            public void onSuccess(String str) {
                Object obj;
                String str2;
                Long l;
                Map<String, Object> b = ChatParamUtils.m133148b();
                Activity activity = null;
                if (b != null) {
                    obj = b.get("chat_id");
                } else {
                    obj = null;
                }
                String str3 = (String) obj;
                CalendarEvent calendarEvent = this.f82357b;
                if (calendarEvent != null) {
                    str2 = calendarEvent.getServerId();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                CalendarEvent calendarEvent2 = this.f82357b;
                if (calendarEvent2 != null) {
                    l = Long.valueOf(calendarEvent2.getStartTime());
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l.longValue());
                if (str3 == null) {
                    str3 = "";
                }
                CalendarEventHitPoint.m124342a(str2, valueOf, str3, "check_more_detail");
                ReplyOpenDetailActivityClickListener cVar = this.f82356a.f82354a;
                Context context = this.f82356a.f82355b.getContext();
                if (context instanceof Activity) {
                    activity = context;
                }
                cVar.mo117749a(activity, this.f82356a.f82354a.mo117748a(), this.f82357b, str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Object obj;
                String str;
                Long l;
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Map<String, Object> b = ChatParamUtils.m133148b();
                Activity activity = null;
                if (b != null) {
                    obj = b.get("chat_id");
                } else {
                    obj = null;
                }
                String str2 = (String) obj;
                CalendarEvent calendarEvent = this.f82357b;
                if (calendarEvent != null) {
                    str = calendarEvent.getServerId();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                CalendarEvent calendarEvent2 = this.f82357b;
                if (calendarEvent2 != null) {
                    l = Long.valueOf(calendarEvent2.getStartTime());
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l.longValue());
                if (str2 == null) {
                    str2 = "";
                }
                CalendarEventHitPoint.m124342a(str, valueOf, str2, "check_more_detail");
                ReplyOpenDetailActivityClickListener cVar = this.f82356a.f82354a;
                Context context = this.f82356a.f82355b.getContext();
                if (context instanceof Activity) {
                    activity = context;
                }
                cVar.mo117749a(activity, this.f82356a.f82354a.mo117748a(), this.f82357b, "");
            }

            C32204a(C32203a aVar, CalendarEvent calendarEvent) {
                this.f82356a = aVar;
                this.f82357b = calendarEvent;
            }
        }

        /* renamed from: a */
        public void onSuccess(List<? extends CalendarEvent> list) {
            boolean z;
            Log.m165389i("CalendarGeneraMessageCellBinder", C32673y.m125369a("GeneralBotCard"));
            List<? extends CalendarEvent> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                onError(new ErrorResult("events Empty Err"));
                return;
            }
            CalendarEvent calendarEvent = (CalendarEvent) list.get(0);
            if (calendarEvent.getSelfAttendeeStatus() == CalendarEventAttendee.Status.REMOVED) {
                m122753a();
            } else {
                ReplyEventCardBinder.f82345a.mo117744a(this.f82354a.mo117750b(), new UIGetDataCallback(new C32204a(this, calendarEvent)));
            }
        }

        C32203a(ReplyOpenDetailActivityClickListener cVar, View view) {
            this.f82354a = cVar;
            this.f82355b = view;
        }
    }

    /* renamed from: b */
    private final IGetDataCallback<List<CalendarEvent>> m122748b(View view) {
        return new C32203a(this, view);
    }

    @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
    /* renamed from: a */
    public void mo108751a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        C30810k a = C30810k.m114955a();
        Intrinsics.checkExpressionValueIsNotNull(a, "LoginInfoManager.getInstance()");
        String c = a.mo111644c();
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("CalendarGeneraMessageCellBinder", C32673y.m125376b(valueOf, "getServerEventsByUniqueFieldRequest", "login_calendar_id", c, "event_key", this.f82352a.getKey(), "original_time", String.valueOf(this.f82352a.getOriginalTime()) + ""));
        IGetDataCallback<List<CalendarEvent>> b = m122748b(view);
        CalendarCardHelper.f82294a.mo117526b().mo118856a(new CalendarEventUniqueField(c, this.f82352a.getKey(), Long.valueOf(this.f82352a.getOriginalTime())), new UIGetDataCallback(b));
    }

    public ReplyOpenDetailActivityClickListener(CalendarCardContent calendarCardContent, RSVPCommentCardInfo rSVPCommentCardInfo) {
        Intrinsics.checkParameterIsNotNull(calendarCardContent, "content");
        this.f82352a = calendarCardContent;
        this.f82353b = rSVPCommentCardInfo;
    }

    /* renamed from: a */
    public final void mo117749a(Activity activity, CalendarCardContent calendarCardContent, CalendarEvent calendarEvent, String str) {
        CalendarEventAttendee.Status status;
        Intrinsics.checkParameterIsNotNull(calendarCardContent, "content");
        if (activity != null) {
            Bundle bundle = new Bundle();
            bundle.putString("key", calendarCardContent.getKey());
            C30810k a = C30810k.m114955a();
            Intrinsics.checkExpressionValueIsNotNull(a, "LoginInfoManager.getInstance()");
            bundle.putString("calendar_id", a.mo111644c());
            bundle.putLong("origin_time", calendarCardContent.getOriginalTime());
            if (calendarCardContent.getSelfAttendeeStatus() == null) {
                status = CalendarEventAttendee.Status.TENTATIVE;
            } else {
                status = calendarCardContent.getSelfAttendeeStatus();
                Intrinsics.checkExpressionValueIsNotNull(status, "content.selfAttendeeStatus");
            }
            bundle.putInt("event_attendee_status", status.getNumber());
            bundle.putString("rsvp_invitor_name", str);
            LargeCalendarTransmitHelper.m116182a(bundle, calendarEvent);
            C31238b.m116880c(activity, bundle);
        }
    }
}
