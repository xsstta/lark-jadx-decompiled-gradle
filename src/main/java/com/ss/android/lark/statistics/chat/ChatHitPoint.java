package com.ss.android.lark.statistics.chat;

import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.vesdk.C64034n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.chat.a */
public final class ChatHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f135648a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0011J\u0006\u0010\u0018\u001a\u00020\u0011J&\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014J\u0016\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010)\u001a\u00020'2\u0006\u0010!\u001a\u00020\"H\u0002J\u0017\u0010*\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020\u0011J\u000e\u0010.\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%J\"\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u00142\b\u00101\u001a\u0004\u0018\u00010\u00042\b\u00102\u001a\u0004\u0018\u00010\u0004J\u0006\u00103\u001a\u00020\u0011J\u0006\u00104\u001a\u00020\u0011J\u0006\u00105\u001a\u00020\u0011J\u0016\u00106\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u00107\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u00108\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0004J\u000e\u00109\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0004J\u0018\u0010:\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u0004H\u0007J\u0014\u0010=\u001a\u00020\u00112\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040?J\u001e\u0010@\u001a\u00020\u00112\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u001bJ\u000e\u0010E\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u0004J\u0006\u0010G\u001a\u00020\u0011J\u0016\u0010H\u001a\u00020\u00112\u0006\u0010I\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0004J\u001e\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\u00142\u0006\u0010M\u001a\u00020\u00142\u0006\u0010N\u001a\u00020BJ\u000e\u0010O\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u0004J<\u0010P\u001a\u00020\u00112\b\u0010Q\u001a\u0004\u0018\u00010\u00042\b\u0010R\u001a\u0004\u0018\u00010\u00042\u0006\u0010S\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\"J\u0016\u0010U\u001a\u00020\u00112\u0006\u0010V\u001a\u00020W2\u0006\u0010!\u001a\u00020\"J\u000e\u0010X\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0004J\u0006\u0010Y\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatHitPoint$Companion;", "", "()V", "CHAT_ID", "", "CHAT_TYPE", "CID", "IS_BOT_CHAT", "IS_MEETING_CHAT", "IS_SECRET_CHAT", "LOG_TAG", "MESSAGE_ID", "MESSAGE_TYPE", "STICKER_ID", "STICKER_SET_ID", "USER_UNIQUE_ID", "activatedChatThreadPage", "", ShareHitPoint.f121868c, "isSecret", "", "chatExit", "saveProgress", "chatGroupApplicationBannerClick", "chatGroupApplicationBannerCloseClick", "clickAtTip", "newMessageCount", "", "isUpwardDirection", "isAtAll", "clickBackToBottomTip", "clickNewMessageTips", "enterChatSettingEvent", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatType", "params", "Lcom/ss/android/lark/statistics/chat/ChatTypeStateKeeper$EnterChatParams;", "getContactIMBlockParam", "Lorg/json/JSONObject;", "userId", "getDefaultExtra", "sendAtSomeBody", "atCount", "(Ljava/lang/Integer;)V", "sendChatConfigView", "sendChatView", "sendChatViewFromNotification", "isFromNotification", "chatId", "messageId", "sendClickContactBlockFromBanner", "sendClickContactBlockFromBannerConfirmed", "sendClickEduInviteBanner", "sendClickTitleBar", "sendClickViewInChatEvent", "sendContactIMBlock", "sendContactIMUnblock", "sendEnterChatSettingNewEvent", "sendFaceSelect", "faceTag", "sendFavouriteAdd", "messageIds", "", "sendGetChatMessageTimeCostEvent", "wholeTimeCost", "", "sdkTimeCost", "scene", "sendIMContactBannerAdd", ShareHitPoint.f121869d, "sendMessageThreadForward", "sendMissChatterEvent", "tag", "info", "sendNextPageLoadingEvent", "showLoading", "onLaunch", "timeCost", "sendShowBanner", "sendStickerByCollect", "stickerSetId", "stickerId", "userUniqueId", "cid", "sendStickerByStickerSet", "stickerFileInfo", "Lcom/ss/android/lark/dependency/IStickerDependency$StickerFileInfo;", "sendTODOCreate", "showBotUnavailable", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.chat.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo187353a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121868c);
            Statistics.sendEvent("click_titlebar", new JSONObject().put("chat_id", str).put(ShareHitPoint.f121868c, str2));
        }

        /* renamed from: a */
        public final void mo187359a(boolean z, boolean z2, long j) {
            Statistics.sendEvent("lark_android_next_page_loading", new JSONObject().put("show_loading", z ? 1 : 0).put("on_launch", z2 ? 1 : 0).put("time_cost", j));
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo187352a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "faceTag");
            if (!TextUtils.isEmpty(str)) {
                String substring = str.substring(1, str.length() - 1);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (!TextUtils.isEmpty(substring)) {
                    Statistics.sendEvent("face_select", new JSONObject().put("face_tag", substring).put("chat_type", ChatTypeStateKeeper.f135671f.mo187405a()));
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: com.ss.android.lark.chat.entity.chat.Chat */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void mo187354a(String str, String str2, String str3, String str4, String str5, Chat chat) {
            Intrinsics.checkParameterIsNotNull(str3, "userUniqueId");
            Intrinsics.checkParameterIsNotNull(str4, "cid");
            Intrinsics.checkParameterIsNotNull(str5, "chatId");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = chat;
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getFixedThreadPool().execute(new RunnableC54943b(objectRef, str5, str, str2, str3, str4));
        }

        /* renamed from: a */
        public final void mo187356a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "messageIds");
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(new RunnableC54941a(list));
        }

        /* renamed from: a */
        public final void mo187351a(ChatTypeStateKeeper.EnterChatParams bVar) {
            String str;
            Intrinsics.checkParameterIsNotNull(bVar, "params");
            String str2 = "true";
            JSONObject put = new JSONObject().put("chat_id", bVar.mo187416a()).put("from", !TextUtils.isEmpty(bVar.mo187426k()) ? bVar.mo187426k() : "others").put("notice_setting", bVar.mo187417b() ? "notice" : "mute").put("unread_start", bVar.mo187422g() ? "first" : "last").put("chat_type", ChatHitPoint.f135648a.m213069b(bVar)).put("thread_id", bVar.mo187427l()).put("is_secret_chat", bVar.mo187424i() ? str2 : "false");
            if (bVar.mo187421f()) {
                str = str2;
            } else {
                str = "false";
            }
            JSONObject put2 = put.put("is_bot_chat", str);
            if (!bVar.mo187418c()) {
                str2 = "false";
            }
            Statistics.sendEvent("chat_view", put2.put("is_meeting_chat", str2));
        }

        /* renamed from: a */
        public final void mo187358a(boolean z, String str, String str2) {
            if (z) {
                Statistics.sendEvent("push_chat_click", new JSONObject().put("chat_type", ChatTypeStateKeeper.f135671f.mo187405a()).put("chat_id", str).put("message_id", str2));
            }
        }

        /* renamed from: a */
        public final void mo187357a(boolean z) {
            Statistics.sendEvent("chat_exit", new JSONObject().put("save_progress", !z ? C64034n.f161683a : "y"));
        }

        /* renamed from: a */
        public final void mo187355a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            Statistics.sendEvent("thread_detail_page_activated_inchat", new JSONObject().put(ShareHitPoint.f121868c, str).put("chat_mode", z ? "secret" : "classic"));
        }

        /* renamed from: b */
        public final void mo187360b() {
            Statistics.sendEvent("group_application_click");
        }

        /* renamed from: c */
        public final void mo187363c() {
            Statistics.sendEvent("group_application_close");
        }

        /* renamed from: d */
        public final void mo187365d() {
            Statistics.sendEvent("app_states_unavailable_show");
        }

        /* renamed from: e */
        public final void mo187367e() {
            Statistics.sendEvent("IM_contacts_banner_block");
        }

        /* renamed from: f */
        public final void mo187369f() {
            Statistics.sendEvent("im_chat_home_school_group_remind_click");
        }

        /* renamed from: g */
        public final void mo187370g() {
            Statistics.sendEvent("IM_contacts_banner_block_confirm");
        }

        /* renamed from: h */
        public final void mo187371h() {
            Statistics.sendEvent("im_message_thread_forward");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.chat.a$a$a */
        static final class RunnableC54941a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ List f135649a;

            RunnableC54941a(List list) {
                this.f135649a = list;
            }

            public final void run() {
                C32848e.m126401b().mo121102a(this.f135649a, new IGetDataCallback<List<? extends Message>>() {
                    /* class com.ss.android.lark.statistics.chat.ChatHitPoint.Companion.RunnableC54941a.C549421 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    }

                    /* renamed from: a */
                    public void onSuccess(List<? extends Message> list) {
                        Message message;
                        Chat.Type type;
                        Boolean bool;
                        String str;
                        String str2;
                        if (!CollectionUtils.isEmpty(list) && list != null && (message = (Message) list.get(0)) != null) {
                            Chat e = C32821b.m126120a().mo121056e(message.getChatId());
                            Boolean bool2 = null;
                            ChatChatter chatChatter = null;
                            if (e != null) {
                                type = e.getType();
                            } else {
                                type = null;
                            }
                            if (type == Chat.Type.P2P) {
                                C32835d c = C32835d.m126323c();
                                if (e != null) {
                                    str = e.getId();
                                } else {
                                    str = null;
                                }
                                if (e != null) {
                                    str2 = e.getP2pChatterId();
                                } else {
                                    str2 = null;
                                }
                                chatChatter = c.m126324c(str, str2);
                            }
                            AbstractC36474h b = C29990c.m110930b();
                            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                            AbstractC36450aa N = b.mo134515N();
                            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
                            String a = N.mo134394a();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("user_unique_id", a);
                            jSONObject.put("message_id", message.getId());
                            jSONObject.put("chat_id", message.getChatId());
                            jSONObject.put("message_type", message.getType());
                            jSONObject.put("is_secret_chat", message.isSecret());
                            if (chatChatter != null) {
                                bool = Boolean.valueOf(chatChatter.isBot());
                            } else {
                                bool = null;
                            }
                            jSONObject.put("is_bot_chat", bool);
                            if (e != null) {
                                bool2 = Boolean.valueOf(e.isMeeting());
                            }
                            jSONObject.put("is_meeting_chat", bool2);
                            Statistics.sendEvent("favourite_add", jSONObject);
                        }
                    }
                });
            }
        }

        /* renamed from: a */
        public final void mo187345a() {
            Statistics.sendEvent("chat_config_view", new JSONObject().put("chat_type", ChatTypeStateKeeper.f135671f.mo187405a()));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.chat.a$a$b */
        static final class RunnableC54943b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Ref.ObjectRef f135650a;

            /* renamed from: b */
            final /* synthetic */ String f135651b;

            /* renamed from: c */
            final /* synthetic */ String f135652c;

            /* renamed from: d */
            final /* synthetic */ String f135653d;

            /* renamed from: e */
            final /* synthetic */ String f135654e;

            /* renamed from: f */
            final /* synthetic */ String f135655f;

            RunnableC54943b(Ref.ObjectRef objectRef, String str, String str2, String str3, String str4, String str5) {
                this.f135650a = objectRef;
                this.f135651b = str;
                this.f135652c = str2;
                this.f135653d = str3;
                this.f135654e = str4;
                this.f135655f = str5;
            }

            public final void run() {
                Chat.Type type;
                Boolean bool;
                Chat.Type type2;
                String str;
                String str2;
                Boolean bool2 = null;
                ChatChatter chatChatter = null;
                if (this.f135650a.element != null) {
                    T t = this.f135650a.element;
                    if (t != null) {
                        type2 = t.getType();
                    } else {
                        type2 = null;
                    }
                    if (type2 == Chat.Type.P2P) {
                        C32835d c = C32835d.m126323c();
                        T t2 = this.f135650a.element;
                        if (t2 != null) {
                            str = t2.getId();
                        } else {
                            str = null;
                        }
                        T t3 = this.f135650a.element;
                        if (t3 != null) {
                            str2 = t3.getP2pChatterId();
                        } else {
                            str2 = null;
                        }
                        chatChatter = c.m126324c(str, str2);
                    }
                } else {
                    this.f135650a.element = (T) C32821b.m126120a().mo121056e(this.f135651b);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("stickerpack_id", this.f135652c);
                jSONObject.put("sticker_id", this.f135653d);
                jSONObject.put("user_unique_id", this.f135654e);
                jSONObject.put("cid", this.f135655f);
                jSONObject.put("chat_id", this.f135651b);
                T t4 = this.f135650a.element;
                if (t4 != null) {
                    type = t4.getType();
                } else {
                    type = null;
                }
                jSONObject.put("chat_type", type);
                if (chatChatter != null) {
                    bool = Boolean.valueOf(chatChatter.isBot());
                } else {
                    bool = null;
                }
                jSONObject.put("is_bot_chat", bool);
                T t5 = this.f135650a.element;
                if (t5 != null) {
                    bool2 = Boolean.valueOf(t5.isMeeting());
                }
                jSONObject.put("is_meeting_chat", bool2);
                Statistics.sendEvent("sticker_sent", jSONObject);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.chat.a$a$c */
        static final class RunnableC54944c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Chat f135656a;

            /* renamed from: b */
            final /* synthetic */ IStickerDependency.StickerFileInfo f135657b;

            RunnableC54944c(Chat chat, IStickerDependency.StickerFileInfo stickerFileInfo) {
                this.f135656a = chat;
                this.f135657b = stickerFileInfo;
            }

            public final void run() {
                ChatChatter chatChatter;
                boolean z;
                if (this.f135656a.getType() == Chat.Type.P2P) {
                    chatChatter = C32835d.m126323c().m126324c(this.f135656a.getId(), this.f135656a.getP2pChatterId());
                } else {
                    chatChatter = null;
                }
                try {
                    JSONObject put = new JSONObject().put("stickerpack_id", this.f135657b.stickerSetId).put("sticker_id", this.f135657b.stickerId).put("chat_id", this.f135656a.getId()).put("is_secret_chat", this.f135656a.isSecret());
                    if (chatChatter != null) {
                        z = chatChatter.isBot();
                    } else {
                        z = false;
                    }
                    JSONObject put2 = put.put("is_bot_chat", z).put("is_meeting_chat", this.f135656a.isMeeting());
                    Chat.Type type = this.f135656a.getType();
                    Intrinsics.checkExpressionValueIsNotNull(type, "chat.type");
                    Statistics.sendEvent("stickerpack_send", put2.put("chat_type", type.getNumber()));
                } catch (Exception e) {
                    Log.m165383e("ChatWindowLog", e.getMessage());
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final void mo187361b(String str) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            Statistics.sendEvent("IM_contacts_banner_add", new JSONObject().put(ShareHitPoint.f121869d, str));
        }

        /* renamed from: d */
        public final void mo187366d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Statistics.sendEvent("contact_unblock", m213072c(str, "im_unblock"));
        }

        /* renamed from: e */
        public final void mo187368e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            Statistics.sendEvent("todo_create", new JSONObject().put(ShareHitPoint.f121868c, "message_add").put("message_id", str));
        }

        /* renamed from: b */
        private final int m213069b(ChatTypeStateKeeper.EnterChatParams bVar) {
            if (bVar.mo187419d()) {
                if (bVar.mo187420e()) {
                    return Chat.Type.TOPIC_GROUP.getNumber();
                }
                return Chat.Type.THREAD_DETAIL.getNumber();
            } else if (bVar.mo187420e()) {
                return Chat.Type.GROUP.getNumber();
            } else {
                return Chat.Type.P2P.getNumber();
            }
        }

        /* renamed from: a */
        public final void mo187346a(int i) {
            Statistics.sendEvent("message_dialog_back_to_bottom_click", new JSONObject().put("unread_total", i).put("chat_mode", "classic"));
        }

        /* renamed from: c */
        public final void mo187364c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Statistics.sendEvent("contact_block", m213072c(str, "im_block"));
        }

        /* renamed from: b */
        private final JSONObject m213070b(Chat chat) {
            String str;
            String str2;
            JSONObject jSONObject = new JSONObject();
            if (C34339g.m133167a(chat)) {
                str = "admin";
            } else {
                str = "member";
            }
            jSONObject.put("member_type", str);
            if (chat.isPublic()) {
                str2 = "public";
            } else {
                str2 = "private";
            }
            jSONObject.put("chat_mode", str2);
            jSONObject.put("chat_id", chat.getId());
            jSONObject.put("chat_type", mo187344a(chat));
            jSONObject.put("external", chat.isCrossTenant() ? 1 : 0);
            return jSONObject;
        }

        /* renamed from: a */
        public final String mo187344a(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            if (chat.isSecret()) {
                return "secret";
            }
            if (chat.isOnCall()) {
                return "on_call";
            }
            if (chat.isMeeting()) {
                return "meeting";
            }
            if (chat.is_department()) {
                return "department";
            }
            if (chat.isEdu()) {
                return "school_parent";
            }
            if (chat.isCustomerService()) {
                return "customer_service";
            }
            if (chat.isThread()) {
                return "circle";
            }
            if (chat.isP2PChat()) {
                return "p2p";
            }
            if (chat.isTenant()) {
                return "all_staff";
            }
            if (chat.getChatMode() != Chat.ChatMode.DEFAULT || chat.isSecret()) {
                return "unknown type";
            }
            return "classic";
        }

        /* renamed from: c */
        private final JSONObject m213072c(String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121868c, str2);
            jSONObject.put("to_user_id", C57859q.m224565a(str));
            return jSONObject;
        }

        /* renamed from: b */
        private final void m213071b(Chat chat, String str) {
            String str2;
            if (TextUtils.equals(str, "title")) {
                str2 = "chat_title";
            } else {
                str2 = "chat_more_mobile";
            }
            Statistics.sendEvent("im_chat_setting_page_view", m213070b(chat).put(ShareHitPoint.f121868c, str2));
        }

        /* renamed from: a */
        public final void mo187347a(int i, boolean z) {
            String str;
            JSONObject put = new JSONObject().put("unread_total", i).put("chat_mode", "classic");
            if (z) {
                str = "up";
            } else {
                str = "down";
            }
            Statistics.sendEvent("new_message_toast_click", put.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, str));
        }

        /* renamed from: b */
        public final void mo187362b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(str2, "info");
            Statistics.sendEvent("message_parse_entity_miss_chatter", new JSONObject().put("tag", str).put("info", str2));
        }

        /* renamed from: a */
        public final void mo187349a(Chat chat, String str) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            if (TextUtils.equals(str, "config_sidebar")) {
                Statistics.sendEvent("chat_config_sidebar", new JSONObject().put("chat_id", chat.getId()));
                return;
            }
            Companion aVar = this;
            String id = chat.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
            aVar.mo187353a(id, str);
            aVar.m213071b(chat, str);
        }

        /* renamed from: a */
        public final void mo187350a(IStickerDependency.StickerFileInfo stickerFileInfo, Chat chat) {
            Intrinsics.checkParameterIsNotNull(stickerFileInfo, "stickerFileInfo");
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            if (stickerFileInfo.stickerSetId != null) {
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getFixedThreadPool().execute(new RunnableC54944c(chat, stickerFileInfo));
            }
        }

        /* renamed from: a */
        public final void mo187348a(int i, boolean z, boolean z2, boolean z3) {
            String str;
            String str2;
            String str3;
            JSONObject put = new JSONObject().put("unread_total", i);
            if (z3) {
                str = "secret";
            } else {
                str = "classic";
            }
            JSONObject put2 = put.put("chat_mode", str);
            if (z) {
                str2 = "up";
            } else {
                str2 = "down";
            }
            JSONObject put3 = put2.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, str2);
            if (z2) {
                str3 = "all";
            } else {
                str3 = "user";
            }
            Statistics.sendEvent("new_message_mention_click", put3.put(ShareHitPoint.f121869d, str3));
        }
    }
}
