package com.ss.android.lark.tab.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.AddChatTabRequest;
import com.bytedance.lark.pb.im.v1.AddChatTabResponse;
import com.bytedance.lark.pb.im.v1.ChatTab;
import com.bytedance.lark.pb.im.v1.DeleteChatTabRequest;
import com.bytedance.lark.pb.im.v1.DeleteChatTabResponse;
import com.bytedance.lark.pb.im.v1.GetChatTabsRequest;
import com.bytedance.lark.pb.im.v1.GetChatTabsResponse;
import com.bytedance.lark.pb.im.v1.SyncStrategy;
import com.bytedance.lark.pb.im.v1.UpdateChatTabOrdersRequest;
import com.bytedance.lark.pb.im.v1.UpdateChatTabOrdersResponse;
import com.bytedance.lark.pb.im.v1.UpdateChatTabRequest;
import com.bytedance.lark.pb.im.v1.UpdateChatTabResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.tab.service.IChatTabService;
import com.ss.android.lark.tab.service.entity.ChatTab;
import com.ss.android.lark.tab.service.entity.ChatTabsListResult;
import com.ss.android.lark.tab.service.entity.ModelParserChatTab;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J&\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J&\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J:\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J,\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/tab/service/ChatTabService;", "Lcom/ss/android/lark/tab/service/IChatTabService;", "()V", "addChatTab", "", "chatId", "", "name", ShareHitPoint.f121869d, "Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;", "payload", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "deleteChatTab", "tabId", "", "getChatTabs", "syncStrategy", "Lcom/ss/android/lark/tab/service/IChatTabService$SyncStrategy;", "updateChatTab", "deleteTabIds", "", "currentTabIds", "updateChatTabOrders", "reOrderIds", "Companion", "SingletonHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.service.b */
public final class ChatTabService implements IChatTabService {

    /* renamed from: a */
    public static final Companion f136426a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/tab/service/ChatTabService$Companion;", "", "()V", "TAG", "", "getInstance", "Lcom/ss/android/lark/tab/service/ChatTabService;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.b$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final ChatTabService mo188394a() {
            return SingletonHolder.f136427a.mo188395a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/tab/service/ChatTabService$SingletonHolder;", "", "()V", "instance", "Lcom/ss/android/lark/tab/service/ChatTabService;", "getInstance", "()Lcom/ss/android/lark/tab/service/ChatTabService;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.b$b */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f136427a = new SingletonHolder();

        /* renamed from: b */
        private static final ChatTabService f136428b = new ChatTabService();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final ChatTabService mo188395a() {
            return f136428b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.b$c */
    static final class C55287c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ String f136429a;

        C55287c(String str) {
            this.f136429a = str;
        }

        /* renamed from: a */
        public final ChatTabsListResult parse(byte[] bArr) {
            AddChatTabResponse decode = AddChatTabResponse.ADAPTER.decode(bArr);
            Long l = decode.chat_id;
            Intrinsics.checkExpressionValueIsNotNull(l, "response.chat_id");
            long longValue = l.longValue();
            String str = this.f136429a;
            List<ChatTab> list = decode.tabs;
            Intrinsics.checkExpressionValueIsNotNull(list, "response.tabs");
            List<com.ss.android.lark.tab.service.entity.ChatTab> a = ModelParserChatTab.m214410a(str, list);
            Long l2 = decode.version;
            Intrinsics.checkExpressionValueIsNotNull(l2, "response.version");
            return new ChatTabsListResult(longValue, a, l2.longValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.b$d */
    static final class C55288d<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ String f136430a;

        C55288d(String str) {
            this.f136430a = str;
        }

        /* renamed from: a */
        public final ChatTabsListResult parse(byte[] bArr) {
            DeleteChatTabResponse decode = DeleteChatTabResponse.ADAPTER.decode(bArr);
            Long l = decode.chat_id;
            Intrinsics.checkExpressionValueIsNotNull(l, "response.chat_id");
            long longValue = l.longValue();
            String str = this.f136430a;
            List<ChatTab> list = decode.tabs;
            Intrinsics.checkExpressionValueIsNotNull(list, "response.tabs");
            List<com.ss.android.lark.tab.service.entity.ChatTab> a = ModelParserChatTab.m214410a(str, list);
            Long l2 = decode.version;
            Intrinsics.checkExpressionValueIsNotNull(l2, "response.version");
            return new ChatTabsListResult(longValue, a, l2.longValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.b$e */
    static final class C55289e<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ String f136431a;

        C55289e(String str) {
            this.f136431a = str;
        }

        /* renamed from: a */
        public final ChatTabsListResult parse(byte[] bArr) {
            GetChatTabsResponse decode = GetChatTabsResponse.ADAPTER.decode(bArr);
            long parseLong = Long.parseLong(this.f136431a);
            String str = this.f136431a;
            List<ChatTab> list = decode.tabs;
            Intrinsics.checkExpressionValueIsNotNull(list, "response.tabs");
            List<com.ss.android.lark.tab.service.entity.ChatTab> a = ModelParserChatTab.m214410a(str, list);
            Long l = decode.version;
            Intrinsics.checkExpressionValueIsNotNull(l, "response.version");
            return new ChatTabsListResult(parseLong, a, l.longValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.b$f */
    static final class C55290f<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ String f136432a;

        C55290f(String str) {
            this.f136432a = str;
        }

        /* renamed from: a */
        public final ChatTabsListResult parse(byte[] bArr) {
            UpdateChatTabResponse decode = UpdateChatTabResponse.ADAPTER.decode(bArr);
            Long l = decode.chat_id;
            Intrinsics.checkExpressionValueIsNotNull(l, "response.chat_id");
            long longValue = l.longValue();
            String str = this.f136432a;
            List<ChatTab> list = decode.tabs;
            Intrinsics.checkExpressionValueIsNotNull(list, "response.tabs");
            List<com.ss.android.lark.tab.service.entity.ChatTab> a = ModelParserChatTab.m214410a(str, list);
            Long l2 = decode.version;
            Intrinsics.checkExpressionValueIsNotNull(l2, "response.version");
            return new ChatTabsListResult(longValue, a, l2.longValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.b$g */
    static final class C55291g<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        final /* synthetic */ String f136433a;

        C55291g(String str) {
            this.f136433a = str;
        }

        /* renamed from: a */
        public final ChatTabsListResult parse(byte[] bArr) {
            UpdateChatTabOrdersResponse decode = UpdateChatTabOrdersResponse.ADAPTER.decode(bArr);
            Long l = decode.chat_id;
            Intrinsics.checkExpressionValueIsNotNull(l, "response.chat_id");
            long longValue = l.longValue();
            String str = this.f136433a;
            List<ChatTab> list = decode.tabs;
            Intrinsics.checkExpressionValueIsNotNull(list, "response.tabs");
            List<com.ss.android.lark.tab.service.entity.ChatTab> a = ModelParserChatTab.m214410a(str, list);
            Long l2 = decode.version;
            Intrinsics.checkExpressionValueIsNotNull(l2, "response.version");
            return new ChatTabsListResult(longValue, a, l2.longValue());
        }
    }

    @Override // com.ss.android.lark.tab.service.IChatTabService
    /* renamed from: a */
    public void mo188371a(String str, long j, IGetDataCallback<ChatTabsListResult> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        try {
            SdkSender.asynSendRequestNonWrap(Command.DELETE_CHAT_TAB, new DeleteChatTabRequest.C17398a().mo61061a(Long.valueOf(Long.parseLong(str))).mo61063b(Long.valueOf(j)), iGetDataCallback, new C55288d(str));
        } catch (NumberFormatException e) {
            C53241h.m205894a("ChatTabService", "delete chat tab failed " + e.getMessage());
        }
    }

    @Override // com.ss.android.lark.tab.service.IChatTabService
    /* renamed from: a */
    public void mo188372a(String str, IChatTabService.SyncStrategy syncStrategy, IGetDataCallback<ChatTabsListResult> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(syncStrategy, "syncStrategy");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        try {
            SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_TABS, new GetChatTabsRequest.C17550a().mo61448a(Long.valueOf(Long.parseLong(str))).mo61447a(SyncStrategy.fromValue(syncStrategy.getValue())), iGetDataCallback, new C55289e(str));
        } catch (NumberFormatException e) {
            C53241h.m205894a("ChatTabService", "get chat tabs failed " + e.getMessage());
        }
    }

    @Override // com.ss.android.lark.tab.service.IChatTabService
    /* renamed from: a */
    public void mo188374a(String str, List<Long> list, IGetDataCallback<ChatTabsListResult> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(list, "reOrderIds");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        try {
            SdkSender.asynSendRequestNonWrap(Command.UPDATE_CHAT_TAB_ORDERS, new UpdateChatTabOrdersRequest.C18141a().mo62932a(Long.valueOf(Long.parseLong(str))).mo62933a(list), iGetDataCallback, new C55291g(str));
        } catch (NumberFormatException e) {
            C53241h.m205894a("ChatTabService", "update chat tab order failed " + e.getMessage());
        }
    }

    @Override // com.ss.android.lark.tab.service.IChatTabService
    /* renamed from: a */
    public void mo188375a(String str, List<Long> list, List<Long> list2, IGetDataCallback<ChatTabsListResult> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(list, "deleteTabIds");
        Intrinsics.checkParameterIsNotNull(list2, "currentTabIds");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        try {
            SdkSender.asynSendRequestNonWrap(Command.UPDATE_CHAT_TAB, new UpdateChatTabRequest.C18145a().mo62942a(Long.valueOf(Long.parseLong(str))).mo62943a(list).mo62945b(list2), iGetDataCallback, new C55290f(str));
        } catch (NumberFormatException e) {
            C53241h.m205894a("ChatTabService", "update chat tab failed " + e.getMessage());
        }
    }

    @Override // com.ss.android.lark.tab.service.IChatTabService
    /* renamed from: a */
    public void mo188373a(String str, String str2, ChatTab.ChatTabType chatTabType, String str3, IGetDataCallback<ChatTabsListResult> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(chatTabType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        try {
            AddChatTabRequest.C17286a a = new AddChatTabRequest.C17286a().mo60743a(Long.valueOf(Long.parseLong(str))).mo60744a(str2).mo60742a(ChatTab.Type.fromValue(chatTabType.getValue()));
            if (str3 != null) {
                a.mo60746b(str3);
            }
            SdkSender.asynSendRequestNonWrap(Command.ADD_CHAT_TAB, a, iGetDataCallback, new C55287c(str));
        } catch (NumberFormatException e) {
            C53241h.m205894a("ChatTabService", "add chat tab failed " + e.getMessage());
        }
    }
}
