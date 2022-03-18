package com.ss.android.lark.calendar.impl.features.messagecard.share.listener;

import android.app.Activity;
import android.view.View;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalShareEventContent;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardHelper;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32633ad;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J \u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/share/listener/JoinActionClickListener;", "Landroid/view/View$OnClickListener;", "activity", "Landroid/app/Activity;", "calendarContent", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalShareEventContent;", "messageId", "", "(Landroid/app/Activity;Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalShareEventContent;Ljava/lang/String;)V", "getActivity", "()Landroid/app/Activity;", "dialog", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "getMessageId", "()Ljava/lang/String;", "setMessageId", "(Ljava/lang/String;)V", "checkShowLoadingDialog", "", "getUICallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "onClick", "view", "Landroid/view/View;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.share.listener.a */
public final class JoinActionClickListener implements View.OnClickListener {

    /* renamed from: b */
    public static final Companion f82385b = new Companion(null);

    /* renamed from: a */
    public RequestLoadingDialog f82386a;

    /* renamed from: c */
    private final Activity f82387c;

    /* renamed from: d */
    private CalendarInternalShareEventContent f82388d;

    /* renamed from: e */
    private String f82389e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/share/listener/JoinActionClickListener$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.share.listener.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Activity mo117760a() {
        return this.f82387c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002¨\u0006\r"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/share/listener/JoinActionClickListener$getUICallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "event", "showErrDialog", "errCode", "", "showSuccessDialog", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.share.listener.a$b */
    public static final class C32211b implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ JoinActionClickListener f82390a;

        /* renamed from: b */
        final /* synthetic */ String f82391b;

        /* renamed from: c */
        final /* synthetic */ String f82392c;

        /* renamed from: a */
        private final void m122791a() {
            RequestLoadingDialog requestLoadingDialog = this.f82390a.f82386a;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112593d(C32633ad.m125176a(2));
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("JoinActionClickListener", C32673y.m125370a(this.f82391b, this.f82392c, errorResult));
            m122792a(errorResult.getErrorCode());
        }

        /* renamed from: a */
        private final void m122792a(int i) {
            if (i == 8041) {
                RequestLoadingDialog requestLoadingDialog = this.f82390a.f82386a;
                if (requestLoadingDialog != null) {
                    requestLoadingDialog.dismiss();
                }
                CalendarCardHelper.m122670a(this.f82390a.mo117760a());
                return;
            }
            RequestLoadingDialog requestLoadingDialog2 = this.f82390a.f82386a;
            if (requestLoadingDialog2 != null) {
                requestLoadingDialog2.mo112592c(C32633ad.m125177a(2, i));
            }
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            String str;
            if (calendarEvent == null) {
                str = "event = null";
            } else {
                str = calendarEvent.getKey();
            }
            Log.m165389i("JoinActionClickListener", C32673y.m125373a(this.f82391b, this.f82392c, "key", str));
            if (calendarEvent == null) {
                m122792a(0);
                return;
            }
            m122791a();
            CalendarHitPoint.m124138h();
        }

        C32211b(JoinActionClickListener aVar, String str, String str2) {
            this.f82390a = aVar;
            this.f82391b = str;
            this.f82392c = str2;
        }
    }

    /* renamed from: a */
    private final void m122789a(Activity activity) {
        if (this.f82386a == null) {
            this.f82386a = new RequestLoadingDialog(activity);
        }
        RequestLoadingDialog requestLoadingDialog = this.f82386a;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.mo112585a(R.string.Calendar_Share_Joining);
        }
    }

    public void onClick(View view) {
        String str;
        Object obj;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Log.m165389i("JoinActionClickListener", C32673y.m125369a("shareJoin"));
        CalendarEvent calendarEvent = this.f82388d.getCalendarEvent();
        if (calendarEvent != null) {
            m122789a(this.f82387c);
            String valueOf = String.valueOf(new Date().getTime());
            String[] strArr = new String[8];
            strArr[0] = "key";
            strArr[1] = calendarEvent.getKey();
            strArr[2] = "calendar_id";
            strArr[3] = calendarEvent.getCalendarId();
            strArr[4] = "original_time";
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(calendarEvent.getOriginalTime()));
            String str2 = "";
            sb.append(str2);
            strArr[5] = sb.toString();
            strArr[6] = "message_id";
            String str3 = this.f82389e;
            if (str3 == null) {
                str3 = str2;
            }
            strArr[7] = str3;
            Log.m165389i("JoinActionClickListener", C32673y.m125376b(valueOf, "joinCalendarEvent", strArr));
            GeneralHitPoint.m124197a("card_message", calendarEvent, this.f82389e);
            C32533b b = CalendarCardHelper.f82294a.mo117526b();
            String calendarId = calendarEvent.getCalendarId();
            String key = calendarEvent.getKey();
            long originalTime = calendarEvent.getOriginalTime();
            String str4 = this.f82389e;
            if (str4 != null) {
                str = str4;
            } else {
                str = str2;
            }
            b.mo118865a(calendarId, key, originalTime, str, m122788a(valueOf, "joinCalendarEvent"));
            Map<String, Object> b2 = ChatParamUtils.m133148b();
            if (b2 != null) {
                obj = b2.get("chat_id");
            } else {
                obj = null;
            }
            String str5 = (String) obj;
            String serverId = calendarEvent.getServerId();
            if (serverId == null) {
                serverId = str2;
            }
            String valueOf2 = String.valueOf(calendarEvent.getStartTime());
            if (str5 != null) {
                str2 = str5;
            }
            CalendarEventHitPoint.m124342a(serverId, valueOf2, str2, "join_event");
        }
    }

    /* renamed from: a */
    private final IGetDataCallback<CalendarEvent> m122788a(String str, String str2) {
        return new UIGetDataCallback(new C32211b(this, str, str2));
    }

    public JoinActionClickListener(Activity activity, CalendarInternalShareEventContent calendarInternalShareEventContent, String str) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(calendarInternalShareEventContent, "calendarContent");
        this.f82387c = activity;
        this.f82388d = calendarInternalShareEventContent;
        this.f82389e = str;
    }
}
