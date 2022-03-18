package com.ss.android.lark.calendar.impl.features.messagecard.general.transfer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.CalendarCardContent;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardHelper;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J+\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0002\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/general/transfer/GeneralOpenDetailActivityClickListener;", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "content", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarCardContent;", "(Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarCardContent;)V", "getContent", "()Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarCardContent;", "setContent", "asyncGetCalendarEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "calendarId", "", "key", "originalTime", "", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkEventInfo", "", "v", "Landroid/view/View;", "doClick", "showEventRemoveDialog", "activity", "Landroid/app/Activity;", "startEventDetailActivity", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.c.a */
public final class GeneralOpenDetailActivityClickListener extends AbstractView$OnClickListenerC32626b {

    /* renamed from: a */
    public static final Companion f82358a = new Companion(null);

    /* renamed from: b */
    private CalendarCardContent f82359b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/general/transfer/GeneralOpenDetailActivityClickListener$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final CalendarCardContent mo117753a() {
        return this.f82359b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0002¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/general/transfer/GeneralOpenDetailActivityClickListener$checkEventInfo$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "event", "showErrorDialog", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.c.a$c */
    public static final class C32206c implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ GeneralOpenDetailActivityClickListener f82363a;

        /* renamed from: b */
        final /* synthetic */ CalendarCardContent f82364b;

        /* renamed from: c */
        final /* synthetic */ View f82365c;

        /* renamed from: a */
        private final void m122764a() {
            Context context = this.f82365c.getContext();
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
            m122764a();
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
            if (!Intrinsics.areEqual(calendarEvent.getCalendarId(), this.f82364b.getCalendarId())) {
                m122764a();
                return;
            }
            Log.m165389i("OpenDetailActivityClickListener", C32673y.m125369a("GeneralBotCard"));
            GeneralOpenDetailActivityClickListener aVar = this.f82363a;
            Context context = this.f82365c.getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            aVar.mo117756a((Activity) context, this.f82364b);
        }

        C32206c(GeneralOpenDetailActivityClickListener aVar, CalendarCardContent calendarCardContent, View view) {
            this.f82363a = aVar;
            this.f82364b = calendarCardContent;
            this.f82365c = view;
        }
    }

    public GeneralOpenDetailActivityClickListener(CalendarCardContent calendarCardContent) {
        Intrinsics.checkParameterIsNotNull(calendarCardContent, "content");
        this.f82359b = calendarCardContent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/general/transfer/GeneralOpenDetailActivityClickListener$asyncGetCalendarEvent$2$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.c.a$b */
    public static final class C32205b implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ String f82360a;

        /* renamed from: b */
        final /* synthetic */ String f82361b;

        /* renamed from: c */
        final /* synthetic */ Continuation f82362c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("OpenDetailActivityClickListener", C32673y.m125370a(this.f82360a, this.f82361b, errorResult));
            Continuation cVar = this.f82362c;
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(null));
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            String str;
            if (calendarEvent == null) {
                str = "null";
            } else {
                str = calendarEvent.getKey();
            }
            Log.m165389i("OpenDetailActivityClickListener", C32673y.m125373a(this.f82360a, this.f82361b, "key", str));
            Continuation cVar = this.f82362c;
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(calendarEvent));
        }

        C32205b(String str, String str2, Continuation cVar) {
            this.f82360a = str;
            this.f82361b = str2;
            this.f82362c = cVar;
        }
    }

    /* renamed from: a */
    public final void mo117755a(Activity activity) {
        if (activity != null && UIUtils.isActivityRunning(activity)) {
            new RequestLoadingDialog(activity).mo112589a(false, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.messagecard.general.transfer.GeneralOpenDetailActivityClickListener$doClick$1", mo239173f = "GeneralOpenDetailActivityClickListener.kt", mo239174i = {0}, mo239175l = {45}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.c.a$d */
    static final class C32207d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $apiName;
        final /* synthetic */ String $contextId;
        final /* synthetic */ View $v;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ GeneralOpenDetailActivityClickListener this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32207d(GeneralOpenDetailActivityClickListener aVar, String str, String str2, View view, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
            this.$contextId = str;
            this.$apiName = str2;
            this.$v = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C32207d dVar = new C32207d(this.this$0, this.$contextId, this.$apiName, this.$v, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C32207d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Object obj2;
            String str2;
            String str3;
            Object a = C69086a.m265828a();
            int i = this.label;
            String str4 = "";
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                GeneralOpenDetailActivityClickListener aVar = this.this$0;
                String calendarId = aVar.mo117753a().getCalendarId();
                if (calendarId != null) {
                    str2 = calendarId;
                } else {
                    str2 = str4;
                }
                String key = this.this$0.mo117753a().getKey();
                if (key != null) {
                    str3 = key;
                } else {
                    str3 = str4;
                }
                long originalTime = this.this$0.mo117753a().getOriginalTime();
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo117754a(str2, str3, originalTime, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CalendarEvent calendarEvent = (CalendarEvent) obj;
            if (calendarEvent == null) {
                str = "null";
            } else {
                str = calendarEvent.getKey();
            }
            Log.m165389i("OpenDetailActivityClickListener", C32673y.m125373a(this.$contextId, this.$apiName, "key", str));
            if (calendarEvent == null) {
                GeneralOpenDetailActivityClickListener aVar2 = this.this$0;
                aVar2.mo117757a(this.$v, aVar2.mo117753a());
            } else {
                Activity activity = null;
                if (calendarEvent.getSelfAttendeeStatus() == CalendarEventAttendee.Status.REMOVED) {
                    GeneralOpenDetailActivityClickListener aVar3 = this.this$0;
                    Context context = this.$v.getContext();
                    if (context instanceof Activity) {
                        activity = context;
                    }
                    aVar3.mo117755a(activity);
                } else {
                    Log.m165389i("OpenDetailActivityClickListener", C32673y.m125369a("GeneralBotCard"));
                    Map<String, Object> b = ChatParamUtils.m133148b();
                    if (b != null) {
                        obj2 = b.get("chat_id");
                    } else {
                        obj2 = null;
                    }
                    String str5 = (String) obj2;
                    String serverId = calendarEvent.getServerId();
                    if (serverId == null) {
                        serverId = str4;
                    }
                    String valueOf = String.valueOf(C69089a.m265840a(calendarEvent.getStartTime()).longValue());
                    if (str5 != null) {
                        str4 = str5;
                    }
                    CalendarEventHitPoint.m124342a(serverId, valueOf, str4, "check_more_detail");
                    GeneralOpenDetailActivityClickListener aVar4 = this.this$0;
                    Context context2 = this.$v.getContext();
                    if (context2 instanceof Activity) {
                        activity = context2;
                    }
                    aVar4.mo117756a(activity, this.this$0.mo117753a());
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
    /* renamed from: a */
    public void mo108751a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        String l = Long.toString(new Date().getTime());
        Log.m165389i("OpenDetailActivityClickListener", C32673y.m125376b(l, "syncGetEvent", "calendar_id", this.f82359b.getCalendarId(), "event_key", this.f82359b.getKey(), "original_time", String.valueOf(this.f82359b.getOriginalTime()) + ""));
        Job unused = C69553g.m266944a(C69364ai.m266265a(Dispatchers.m266324b()), null, null, new C32207d(this, l, "syncGetEvent", view, null), 3, null);
    }

    /* renamed from: a */
    public final void mo117756a(Activity activity, CalendarCardContent calendarCardContent) {
        Intrinsics.checkParameterIsNotNull(calendarCardContent, "content");
        if (activity != null) {
            Bundle bundle = new Bundle();
            bundle.putString("key", calendarCardContent.getKey());
            bundle.putString("calendar_id", calendarCardContent.getCalendarId());
            bundle.putLong("origin_time", calendarCardContent.getOriginalTime());
            bundle.putString("calendar_meeting_title", calendarCardContent.getSummary());
            C31238b.m116878b(activity, bundle);
        }
    }

    /* renamed from: a */
    public final void mo117757a(View view, CalendarCardContent calendarCardContent) {
        C32533b.m124620a().mo118882c(calendarCardContent.getCalendarId(), calendarCardContent.getKey(), calendarCardContent.getOriginalTime(), new CallbackManager().wrapAndAddGetDataCallback(new C32206c(this, calendarCardContent, view)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo117754a(String str, String str2, long j, Continuation<? super CalendarEvent> cVar) {
        SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("OpenDetailActivityClickListener", C32673y.m125376b(valueOf, "syncGetEvent", "calendar_id", str, "event_key", str2, "original_time", String.valueOf(j) + ""));
        CalendarCardHelper.f82294a.mo117526b().mo118878b(str, str2, j, new C32205b(valueOf, "syncGetEvent", gVar));
        Object a = gVar.mo239163a();
        if (a == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return a;
    }
}
