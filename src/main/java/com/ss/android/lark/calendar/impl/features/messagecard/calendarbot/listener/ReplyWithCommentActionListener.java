package com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.ReplyMessageDialog;
import com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.helper.CalendarBotMessageHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardHelper;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventUniqueField;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OptimisticReplyCalendarEventInvitationResponse;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30045g;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001e\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0$H\u0002J*\u0010%\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010&\u0018\u00010$2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0002J\"\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010+\u0018\u00010$2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0002J\u0018\u0010,\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0002J\b\u0010.\u001a\u00020\u001eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006/"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/calendarbot/listener/ReplyWithCommentActionListener;", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "activity", "Landroid/app/Activity;", "mViewHolder", "Lcom/ss/android/lark/calendar/impl/features/messagecard/calendarbot/listener/CalendarViewHolder;", "mCalendarContent", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalContent;", "messageId", "", "(Landroid/app/Activity;Lcom/ss/android/lark/calendar/impl/features/messagecard/calendarbot/listener/CalendarViewHolder;Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalContent;Ljava/lang/String;)V", "getActivity", "()Landroid/app/Activity;", "getMCalendarContent", "()Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalContent;", "setMCalendarContent", "(Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalContent;)V", "mReplyDialog", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog;", "mReplyStatus", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "getMViewHolder", "()Lcom/ss/android/lark/calendar/impl/features/messagecard/calendarbot/listener/CalendarViewHolder;", "setMViewHolder", "(Lcom/ss/android/lark/calendar/impl/features/messagecard/calendarbot/listener/CalendarViewHolder;)V", "getMessageId", "()Ljava/lang/String;", "setMessageId", "(Ljava/lang/String;)V", "doClick", "", "view", "Landroid/view/View;", "getInviterName", "inviterUserId", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getInviterUICallBack", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "getOptimisticUICallback", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/OptimisticReplyCalendarEventInvitationResponse;", "showReplyDialog", "inviterUserName", "triggerReloadEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener.b */
public final class ReplyWithCommentActionListener extends AbstractView$OnClickListenerC32626b {

    /* renamed from: a */
    public ReplyMessageDialog f82316a;

    /* renamed from: b */
    public CalendarEventAttendee.Status f82317b;

    /* renamed from: c */
    private final Activity f82318c;

    /* renamed from: d */
    private CalendarViewHolder f82319d;

    /* renamed from: e */
    private CalendarInternalContent f82320e;

    /* renamed from: f */
    private String f82321f;

    /* renamed from: b */
    public final CalendarViewHolder mo117534b() {
        return this.f82319d;
    }

    /* renamed from: c */
    public final CalendarInternalContent mo117536c() {
        return this.f82320e;
    }

    /* renamed from: d */
    public final String mo117537d() {
        return this.f82321f;
    }

    /* renamed from: a */
    public final void mo117532a() {
        EventBus.getDefault().trigger(new C32493l());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/calendarbot/listener/ReplyWithCommentActionListener$showReplyDialog$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog$ReplyMessageListener;", "onClickEnableSendBt", "", Comment.f24093e, "", "inviterId", "statue", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener.b$e */
    public static final class C32196e implements ReplyMessageDialog.ReplyMessageListener {

        /* renamed from: a */
        final /* synthetic */ ReplyWithCommentActionListener f82335a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32196e(ReplyWithCommentActionListener bVar) {
            this.f82335a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.ReplyMessageDialog.ReplyMessageListener
        /* renamed from: a */
        public void mo114119a(String str, String str2, RSVPStatus rSVPStatus) {
            Object obj;
            Intrinsics.checkParameterIsNotNull(str, Comment.f24093e);
            Intrinsics.checkParameterIsNotNull(str2, "inviterId");
            Intrinsics.checkParameterIsNotNull(rSVPStatus, "statue");
            String valueOf = String.valueOf(new Date().getTime());
            String eventServiceId = this.f82335a.mo117536c().getEventServiceId();
            Map<String, Object> b = ChatParamUtils.m133148b();
            if (b != null) {
                obj = b.get("chat_id");
            } else {
                obj = null;
            }
            String str3 = (String) obj;
            String valueOf2 = String.valueOf(this.f82335a.mo117536c().getStartTime());
            if (str3 == null) {
                str3 = "";
            }
            CalendarEventHitPoint.m124342a(eventServiceId, valueOf2, str3, "reply");
            AppreciableHitPoint.f83321a.mo118697m();
            Log.m165389i("CalendarMessageCellBinder", C32673y.m125376b(valueOf, "replyCalendarEventInvitation", "calendar_id", this.f82335a.mo117536c().getCalendarId(), "key", this.f82335a.mo117536c().getEventKey(), "original_time", String.valueOf(this.f82335a.mo117536c().getOriginalTime()) + "", "reply_status", rSVPStatus.toString() + ""));
            this.f82335a.f82317b = CalendarBotMessageHelper.f82307a.mo117529a(rSVPStatus);
            CalendarCardHelper.f82294a.mo117526b().mo118863a(this.f82335a.mo117536c().getCalendarId(), this.f82335a.mo117536c().getEventKey(), this.f82335a.mo117536c().getOriginalTime(), this.f82335a.f82317b, this.f82335a.mo117537d(), str, str2, this.f82335a.mo117531a(valueOf, "replyCalendarEventInvitation"));
            GeneralHitPoint.m124270r("card_message");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/calendarbot/listener/ReplyWithCommentActionListener$getInviterUICallBack$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "events", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener.b$c */
    public static final class C32193c implements IGetDataCallback<List<? extends CalendarEvent>> {

        /* renamed from: a */
        final /* synthetic */ ReplyWithCommentActionListener f82327a;

        /* renamed from: b */
        final /* synthetic */ String f82328b;

        /* renamed from: c */
        final /* synthetic */ String f82329c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/calendarbot/listener/ReplyWithCommentActionListener$getInviterUICallBack$1$onSuccess$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "inviterUserName", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener.b$c$a */
        public static final class C32194a implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ C32193c f82330a;

            /* renamed from: b */
            final /* synthetic */ String f82331b;

            /* renamed from: a */
            public void onSuccess(String str) {
                Intrinsics.checkParameterIsNotNull(str, "inviterUserName");
                ReplyWithCommentActionListener bVar = this.f82330a.f82327a;
                String str2 = this.f82331b;
                Intrinsics.checkExpressionValueIsNotNull(str2, "inviterUserId");
                bVar.mo117535b(str2, str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ReplyWithCommentActionListener bVar = this.f82330a.f82327a;
                String str = this.f82331b;
                Intrinsics.checkExpressionValueIsNotNull(str, "inviterUserId");
                bVar.mo117535b(str, "");
            }

            C32194a(C32193c cVar, String str) {
                this.f82330a = cVar;
                this.f82331b = str;
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            TextView textView = this.f82327a.mo117534b().mEventSummary;
            Intrinsics.checkExpressionValueIsNotNull(textView, "mViewHolder.mEventSummary");
            LKUIToast.show(textView.getContext(), C32634ae.m125182b(R.string.Calendar_Detail_NoNetwork));
            Log.m165383e("CalendarMessageCellBinder", C32673y.m125370a(this.f82328b, this.f82329c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(List<? extends CalendarEvent> list) {
            String str;
            Intrinsics.checkParameterIsNotNull(list, "events");
            List<? extends CalendarEvent> list2 = list;
            if (CollectionUtils.isEmpty(list2)) {
                str = "null";
            } else {
                str = String.valueOf(list.size()) + "";
            }
            Log.m165389i("CalendarMessageCellBinder", C32673y.m125373a(this.f82328b, this.f82329c, "calendar_events_size", str));
            if (!CollectionUtils.isEmpty(list2)) {
                CalendarEvent calendarEvent = (CalendarEvent) list.get(0);
                if (calendarEvent == null) {
                    Intrinsics.throwNpe();
                }
                String userInviteOperatorId = calendarEvent.getUserInviteOperatorId();
                if (TextUtils.isEmpty(userInviteOperatorId)) {
                    onError(new ErrorResult("err"));
                    return;
                }
                ReplyWithCommentActionListener bVar = this.f82327a;
                Intrinsics.checkExpressionValueIsNotNull(userInviteOperatorId, "inviterUserId");
                bVar.mo117533a(userInviteOperatorId, new UIGetDataCallback(new C32194a(this, userInviteOperatorId)));
            }
        }

        C32193c(ReplyWithCommentActionListener bVar, String str, String str2) {
            this.f82327a = bVar;
            this.f82328b = str;
            this.f82329c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/calendarbot/listener/ReplyWithCommentActionListener$doClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "inviterUserName", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener.b$a */
    public static final class C32191a implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ ReplyWithCommentActionListener f82322a;

        /* renamed from: b */
        final /* synthetic */ String f82323b;

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, "inviterUserName");
            ReplyWithCommentActionListener bVar = this.f82322a;
            String str2 = this.f82323b;
            Intrinsics.checkExpressionValueIsNotNull(str2, "inviterUserId");
            bVar.mo117535b(str2, str);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ReplyWithCommentActionListener bVar = this.f82322a;
            String str = this.f82323b;
            Intrinsics.checkExpressionValueIsNotNull(str, "inviterUserId");
            bVar.mo117535b(str, "");
        }

        C32191a(ReplyWithCommentActionListener bVar, String str) {
            this.f82322a = bVar;
            this.f82323b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/calendarbot/listener/ReplyWithCommentActionListener$getInviterName$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IChatterData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chatterData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener.b$b */
    public static final class C32192b implements IGetDataCallback<AbstractC30026d> {

        /* renamed from: a */
        final /* synthetic */ String f82324a;

        /* renamed from: b */
        final /* synthetic */ String f82325b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f82326c;

        /* renamed from: a */
        public void onSuccess(AbstractC30026d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "chatterData");
            Log.m165389i("CalendarMessageCellBinder", C32673y.m125373a(this.f82324a, this.f82325b, new String[0]));
            this.f82326c.onSuccess(dVar.getLocalizedName());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("CalendarMessageCellBinder", C32673y.m125370a(this.f82324a, this.f82325b, errorResult));
            this.f82326c.onError(errorResult);
        }

        C32192b(String str, String str2, IGetDataCallback iGetDataCallback) {
            this.f82324a = str;
            this.f82325b = str2;
            this.f82326c = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/calendarbot/listener/ReplyWithCommentActionListener$getOptimisticUICallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/OptimisticReplyCalendarEventInvitationResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener.b$d */
    public static final class C32195d implements IGetDataCallback<OptimisticReplyCalendarEventInvitationResponse> {

        /* renamed from: a */
        final /* synthetic */ ReplyWithCommentActionListener f82332a;

        /* renamed from: b */
        final /* synthetic */ String f82333b;

        /* renamed from: c */
        final /* synthetic */ String f82334c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            String str;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("CalendarMessageCellBinder", C32673y.m125370a(this.f82333b, this.f82334c, errorResult));
            AppreciableHitPoint.f83321a.mo118678a(errorResult);
            if (this.f82332a.f82316a != null) {
                ReplyMessageDialog fVar = this.f82332a.f82316a;
                if (fVar == null) {
                    Intrinsics.throwNpe();
                }
                if (fVar.mo114233e()) {
                    int errorCode = errorResult.getErrorCode();
                    if (errorCode == 8016) {
                        str = C32634ae.m125182b(R.string.Calendar_Detail_ReplyRSVPResigned);
                        Intrinsics.checkExpressionValueIsNotNull(str, "ResUtil.getString(string…Detail_ReplyRSVPResigned)");
                    } else if (errorCode != 8031) {
                        str = errorResult.getDisplayMsg(C32634ae.m125182b(R.string.Calendar_Share_RestrictionTitle));
                        Intrinsics.checkExpressionValueIsNotNull(str, "err.getDisplayMsg(ResUti…_Share_RestrictionTitle))");
                    } else {
                        str = C32634ae.m125182b(R.string.Calendar_Detail_ReplyRSVPNotFriend);
                        Intrinsics.checkExpressionValueIsNotNull(str, "ResUtil.getString(string…etail_ReplyRSVPNotFriend)");
                    }
                    ReplyMessageDialog fVar2 = this.f82332a.f82316a;
                    if (fVar2 == null) {
                        Intrinsics.throwNpe();
                    }
                    fVar2.mo114231c(str);
                }
            }
        }

        /* renamed from: a */
        public void onSuccess(OptimisticReplyCalendarEventInvitationResponse sVar) {
            ReplyMessageDialog fVar;
            Log.m165389i("CalendarMessageCellBinder", C32673y.m125373a(this.f82333b, this.f82334c, new String[0]));
            if (sVar == null) {
                onError(new ErrorResult("err"));
                AppreciableHitPoint.f83321a.mo118678a(null);
                return;
            }
            CalendarEventAttendee.Status status = this.f82332a.f82317b;
            if (status != null) {
                this.f82332a.mo117534b().mReplyContainer.mo117764a(status);
            }
            this.f82332a.mo117532a();
            if (this.f82332a.f82316a != null && (fVar = this.f82332a.f82316a) != null && fVar.mo114233e()) {
                ReplyMessageDialog fVar2 = this.f82332a.f82316a;
                if (fVar2 != null) {
                    fVar2.mo114235g();
                }
                AppreciableHitPoint.f83321a.mo118698n();
                if (!TextUtils.isEmpty(sVar.mo120209b())) {
                    AbstractC30045g chatModuleDependency = C30022a.f74882a.chatModuleDependency();
                    TextView textView = this.f82332a.mo117534b().mEventSummary;
                    Intrinsics.checkExpressionValueIsNotNull(textView, "mViewHolder.mEventSummary");
                    chatModuleDependency.mo108222a(textView.getContext(), sVar.mo120209b());
                    return;
                }
                ReplyMessageDialog fVar3 = this.f82332a.f82316a;
                if (fVar3 != null) {
                    fVar3.dismiss();
                }
            }
        }

        C32195d(ReplyWithCommentActionListener bVar, String str, String str2) {
            this.f82332a = bVar;
            this.f82333b = str;
            this.f82334c = str2;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
    /* renamed from: a */
    public void mo108751a(View view) {
        String userInviteOperatorId = this.f82320e.getUserInviteOperatorId();
        if (TextUtils.isEmpty(userInviteOperatorId)) {
            CalendarCardHelper.f82294a.mo117526b().mo118856a(new CalendarEventUniqueField(this.f82320e.getCalendarId(), this.f82320e.getEventKey(), Long.valueOf(this.f82320e.getOriginalTime())), m122717c(String.valueOf(new Date().getTime()), "getServerEventsByUniqueFieldRequest"));
            return;
        }
        Intrinsics.checkExpressionValueIsNotNull(userInviteOperatorId, "inviterUserId");
        mo117533a(userInviteOperatorId, new UIGetDataCallback(new C32191a(this, userInviteOperatorId)));
    }

    /* renamed from: c */
    private final IGetDataCallback<List<CalendarEvent>> m122717c(String str, String str2) {
        return new UIGetDataCallback(new C32193c(this, str, str2));
    }

    /* renamed from: a */
    public final IGetDataCallback<OptimisticReplyCalendarEventInvitationResponse> mo117531a(String str, String str2) {
        return new UIGetDataCallback(new C32195d(this, str, str2));
    }

    /* renamed from: a */
    public final void mo117533a(String str, IGetDataCallback<String> iGetDataCallback) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("CalendarMessageCellBinder", C32673y.m125376b(valueOf, "getChatterById", "inviterUserId: ", str));
        C30022a.f74882a.chatModuleDependency().mo108225a(str, new C32192b(valueOf, "getChatterById", iGetDataCallback));
    }

    /* renamed from: b */
    public final void mo117535b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            TextView textView = this.f82319d.mEventSummary;
            Intrinsics.checkExpressionValueIsNotNull(textView, "mViewHolder.mEventSummary");
            LKUIToast.show(textView.getContext(), C32634ae.m125182b(R.string.Calendar_Detail_NoNetwork));
            return;
        }
        if (this.f82316a == null) {
            this.f82316a = new ReplyMessageDialog(this.f82318c, R.style.ReplyMessageDialog);
        }
        ReplyMessageDialog fVar = this.f82316a;
        if (fVar != null) {
            fVar.mo114228b();
        }
        ReplyMessageDialog fVar2 = this.f82316a;
        if (fVar2 != null) {
            fVar2.mo114224a(CalendarBotMessageHelper.f82307a.mo117528a(this.f82319d.mReplyContainer.getCurReplyStatus()));
        }
        ReplyMessageDialog fVar3 = this.f82316a;
        if (fVar3 != null) {
            fVar3.mo114229b(str2);
        }
        ReplyMessageDialog fVar4 = this.f82316a;
        if (fVar4 != null) {
            fVar4.mo114227a(str);
        }
        ReplyMessageDialog fVar5 = this.f82316a;
        if (fVar5 != null) {
            fVar5.mo114225a(new C32196e(this));
        }
        ReplyMessageDialog fVar6 = this.f82316a;
        if (fVar6 != null) {
            fVar6.show();
        }
    }

    public ReplyWithCommentActionListener(Activity activity, CalendarViewHolder calendarViewHolder, CalendarInternalContent calendarInternalContent, String str) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(calendarViewHolder, "mViewHolder");
        Intrinsics.checkParameterIsNotNull(calendarInternalContent, "mCalendarContent");
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        this.f82318c = activity;
        this.f82319d = calendarViewHolder;
        this.f82320e = calendarInternalContent;
        this.f82321f = str;
    }
}
