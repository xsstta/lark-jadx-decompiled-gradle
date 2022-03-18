package com.ss.android.lark.pin.impl.statistics;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.IParam;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J@\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J8\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 J0\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J.\u0010$\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J0\u0010%\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J0\u0010&\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J8\u0010'\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u0013H\u0016J8\u0010)\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u0013H\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\u0006H\u0016J\b\u0010.\u001a\u00020\u0006H\u0016J\b\u0010/\u001a\u00020\u0006H\u0016J\u000e\u00100\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 J\u0006\u00101\u001a\u00020\u0006J\b\u00102\u001a\u00020\u0006H\u0016J\b\u00103\u001a\u00020\u0006H\u0016J\u0010\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\tH\u0016J\u0006\u00106\u001a\u00020\u0006J\b\u00107\u001a\u00020\u0006H\u0016J\u000e\u00108\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 J\u0006\u00109\u001a\u00020\u0006¨\u0006:"}, d2 = {"Lcom/ss/android/lark/pin/impl/statistics/ChatPinHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "Lcom/ss/android/lark/pin/impl/statistics/IChatPinHitPoint;", "()V", "sendAllPinClick", "", "sendAllPinLeave", "timeLong", "", "sendAllPinSearch", "sendAudioPlayDrag", "sendChatPinSearch", "sendChatPinSearchClear", "sendChatPinSearchClick", "sendEvent", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "msgId", "", "msgType", "isGroupMaster", "", "isBot", "event", "param", "Lorg/json/JSONObject;", "groupId", "sendNewGuidePinMentionalEvent", "sendNewGuidePinSidebarEvent", "sendPinActionEvent", "extraParam", "Lcom/ss/android/lark/statistics/extensions/IParam;", "sendPinAddEvent", "chatId", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "sendPinAddEventImpl", "sendPinAlertEvent", "sendPinCancelAlertEvent", "sendPinCancelEvent", "pintCancelLocation", "sendPinClickEvent", "clickSubType", "pinClickLocation", "sendPinCopyEvent", "sendPinForwardClick", "sendPinForwardConfirm", "sendPinMoreClick", "sendPinMoreMenuActionEvent", "sendPinMoreMenuShowEvent", "sendPinNotificationClose", "sendPinNotificationOpen", "sendPinNotificationTimeModify", "newTime", "sendPinPageDisplayEvent", "sendPinViewInChatButtonClick", "sendUnpinConfirmViewActionEvent", "sendUnpinConfirmViewDisplayEvent", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.statistics.a */
public final class ChatPinHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final ChatPinHitPoint f128202a = new ChatPinHitPoint();

    private ChatPinHitPoint() {
    }

    /* renamed from: a */
    public void mo177400a() {
        Statistics.sendEvent("pin_more_click");
    }

    /* renamed from: b */
    public void mo177406b() {
        Statistics.sendEvent("chat_pin_search");
    }

    /* renamed from: c */
    public void mo177410c() {
        Statistics.sendEvent("chat_pin_search_click");
    }

    /* renamed from: d */
    public void mo177412d() {
        Statistics.sendEvent("chat_pin_search_clear");
    }

    /* renamed from: e */
    public void mo177413e() {
        Statistics.sendEvent("pin_copy");
    }

    /* renamed from: f */
    public void mo177414f() {
        Statistics.sendEvent("pin_forward_click");
    }

    /* renamed from: g */
    public void mo177415g() {
        Statistics.sendEvent("pin_forward_confirm");
    }

    /* renamed from: h */
    public void mo177416h() {
        Statistics.sendEvent("audio_play_drag");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.statistics.a$a */
    public static final class RunnableC51509a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f128203a;

        /* renamed from: b */
        final /* synthetic */ int f128204b;

        /* renamed from: c */
        final /* synthetic */ String f128205c;

        /* renamed from: d */
        final /* synthetic */ String f128206d;

        /* renamed from: e */
        final /* synthetic */ boolean f128207e;

        RunnableC51509a(String str, int i, String str2, String str3, boolean z) {
            this.f128203a = str;
            this.f128204b = i;
            this.f128205c = str2;
            this.f128206d = str3;
            this.f128207e = z;
        }

        public final void run() {
            ChatPinHitPoint.f128202a.mo177408b(this.f128203a, this.f128204b, this.f128205c, this.f128206d, this.f128207e);
        }
    }

    /* renamed from: i */
    public final void mo177417i() {
        JSONObject jSONObject;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null) {
            jSONObject = C54952a.m213207a(b);
        } else {
            jSONObject = null;
        }
        Statistics.sendEvent("im_chat_pin_view", jSONObject);
    }

    /* renamed from: j */
    public final void mo177418j() {
        JSONObject jSONObject;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null) {
            jSONObject = C54952a.m213207a(b);
        } else {
            jSONObject = null;
        }
        Statistics.sendEvent("im_chat_pin_more_view", jSONObject);
    }

    /* renamed from: k */
    public final void mo177419k() {
        JSONObject jSONObject;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null) {
            jSONObject = C54952a.m213207a(b);
        } else {
            jSONObject = null;
        }
        Statistics.sendEvent("im_unpin_confirm_view", jSONObject);
    }

    /* renamed from: b */
    public final void mo177407b(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_chat_pin_more_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    /* renamed from: c */
    public final void mo177411c(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_unpin_confirm_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    /* renamed from: a */
    public final void mo177401a(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_chat_pin_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
    }

    /* renamed from: b */
    public void mo177409b(String str, String str2, String str3, String str4, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "groupId");
        Intrinsics.checkParameterIsNotNull(str2, "msgType");
        Intrinsics.checkParameterIsNotNull(str3, "msgId");
        Intrinsics.checkParameterIsNotNull(str4, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        JSONObject put = new JSONObject().put("status_code", str4);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(Params.STATUS_CODE, statusCode)");
        m199827a(str, str2, str3, z, "pin_cancel_alert", put);
    }

    /* renamed from: b */
    public final void mo177408b(String str, int i, String str2, String str3, boolean z) {
        AbstractC51472a.AbstractC51474b i2;
        Chat d;
        boolean z2;
        AbstractC51472a a;
        AbstractC51472a.AbstractC51474b i3;
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "msgId");
        Intrinsics.checkParameterIsNotNull(str3, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        AbstractC51472a a2 = PinModule.f128091b.mo177253a();
        if (a2 != null && (i2 = a2.mo144035i()) != null && (d = i2.mo144082d(str)) != null) {
            Chatter chatter = null;
            if (!(d.getChatMode() == Chat.ChatMode.THREAD_V2 || d.getType() != Chat.Type.P2P || (a = PinModule.f128091b.mo177253a()) == null || (i3 = a.mo144035i()) == null)) {
                chatter = i3.mo144081c(d.getP2pChatterId());
            }
            if (chatter != null) {
                z2 = chatter.isBot();
            } else {
                z2 = false;
            }
            JSONObject put = new JSONObject().put("status_code", str3);
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(Params.STATUS_CODE, statusCode)");
            m199826a(d, str2, i, z, z2, "pin_add", put);
        }
    }

    /* renamed from: a */
    public void mo177402a(String str, int i, String str2, String str3, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "msgId");
        Intrinsics.checkParameterIsNotNull(str3, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().execute(new RunnableC51509a(str, i, str2, str3, z));
    }

    /* renamed from: a */
    public void mo177403a(String str, String str2, String str3, String str4, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "groupId");
        Intrinsics.checkParameterIsNotNull(str2, "msgType");
        Intrinsics.checkParameterIsNotNull(str3, "msgId");
        Intrinsics.checkParameterIsNotNull(str4, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        JSONObject put = new JSONObject().put("status_code", str4);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(Params.STATUS_CODE, statusCode)");
        m199827a(str, str2, str3, z, "pin_alert", put);
    }

    /* renamed from: a */
    private final void m199827a(String str, String str2, String str3, boolean z, String str4, JSONObject jSONObject) {
        Statistics.sendEvent(str4, jSONObject.put("the_groupid", str).put("the_message_type", str2).put("the_message_id", str3).put("is_groupmaster", z));
    }

    /* renamed from: a */
    public void mo177404a(String str, String str2, String str3, String str4, boolean z, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "groupId");
        Intrinsics.checkParameterIsNotNull(str2, "msgType");
        Intrinsics.checkParameterIsNotNull(str3, "msgId");
        Intrinsics.checkParameterIsNotNull(str4, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        Intrinsics.checkParameterIsNotNull(str5, "pintCancelLocation");
        JSONObject put = new JSONObject().put("status_code", str4).put("the_pin_cancel_location", str5);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(Params.…TION, pintCancelLocation)");
        m199827a(str, str2, str3, z, "pin_cancel", put);
    }

    /* renamed from: a */
    public void mo177405a(String str, String str2, String str3, boolean z, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "groupId");
        Intrinsics.checkParameterIsNotNull(str2, "msgType");
        Intrinsics.checkParameterIsNotNull(str3, "msgId");
        Intrinsics.checkParameterIsNotNull(str4, "clickSubType");
        Intrinsics.checkParameterIsNotNull(str5, "pinClickLocation");
        JSONObject put = new JSONObject().put("click_sub_type", str4).put("pin_click_location", str5);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(Params.…CATION, pinClickLocation)");
        m199827a(str, str2, str3, z, "pin_click", put);
    }

    /* renamed from: a */
    private final void m199826a(Chat chat, String str, int i, boolean z, boolean z2, String str2, JSONObject jSONObject) {
        Statistics.sendEvent(str2, jSONObject.put("chat_id", chat.getId()).put("chat_type", chat.getType()).put("message_id", str).put("message_type", i).put("is_groupmaster", z).put("is_secret_chat", chat.isSecret()).put("is_meeting_chat", chat.isMeeting()).put("is_bot_chat", z2));
    }
}
