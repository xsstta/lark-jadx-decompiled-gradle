package com.ss.android.lark.todo.impl.features.chatlist.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.todo.v1.ChatTodoInfo;
import com.bytedance.lark.pb.todo.v1.GetChatCompletedTodosRequest;
import com.bytedance.lark.pb.todo.v1.GetChatCompletedTodosResponse;
import com.bytedance.lark.pb.todo.v1.GetChatTodosRequest;
import com.bytedance.lark.pb.todo.v1.GetChatTodosResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.pb.todo.GetChatTodoStatusRequest;
import com.ss.android.lark.pb.todo.GetChatTodoStatusResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.todo.impl.features.chatlist.service.item.CompleteChatTodosData;
import com.ss.android.lark.todo.impl.features.chatlist.service.item.UnCompleteChatTodosData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ&\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000f0\nJ\u001e\u0010\u0010\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/chatlist/service/TodoChatListService;", "", "()V", "PAGE_COUNT", "", "getChatTodoStatus", "", "chatId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getCompleteChatTodoRequest", "lastOffset", "", "Lcom/ss/android/lark/todo/impl/features/chatlist/service/item/CompleteChatTodosData;", "getUnCompleteChatTodoRequest", "Lcom/ss/android/lark/todo/impl/features/chatlist/service/item/UnCompleteChatTodosData;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.chatlist.c.a */
public final class TodoChatListService {

    /* renamed from: a */
    public static final TodoChatListService f139313a = new TodoChatListService();

    private TodoChatListService() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.c.a$a */
    public static final class C56282a<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C56282a f139314a = new C56282a();

        C56282a() {
        }

        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Object parse(byte[] bArr) {
            return Boolean.valueOf(mo191829a(bArr));
        }

        /* renamed from: a */
        public final boolean mo191829a(byte[] bArr) {
            Boolean bool;
            GetChatTodoStatusResponse decode = GetChatTodoStatusResponse.ADAPTER.decode(bArr);
            if (decode == null || (bool = decode.mred_dot) == null) {
                return false;
            }
            return bool.booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/chatlist/service/item/CompleteChatTodosData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.c.a$b */
    static final class C56283b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C56283b f139315a = new C56283b();

        C56283b() {
        }

        /* renamed from: a */
        public final CompleteChatTodosData parse(byte[] bArr) {
            List<ChatTodoInfo> list;
            Long l;
            GetChatCompletedTodosResponse decode = GetChatCompletedTodosResponse.ADAPTER.decode(bArr);
            Boolean bool = null;
            if (decode != null) {
                list = decode.todos;
            } else {
                list = null;
            }
            if (decode != null) {
                l = decode.last_offset;
            } else {
                l = null;
            }
            if (decode != null) {
                bool = decode.has_more;
            }
            return new CompleteChatTodosData(list, l, bool);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/chatlist/service/item/UnCompleteChatTodosData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.c.a$c */
    static final class C56284c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C56284c f139316a = new C56284c();

        C56284c() {
        }

        /* renamed from: a */
        public final UnCompleteChatTodosData parse(byte[] bArr) {
            List<ChatTodoInfo> list;
            GetChatTodosResponse decode = GetChatTodosResponse.ADAPTER.decode(bArr);
            List<ChatTodoInfo> list2 = null;
            if (decode != null) {
                list = decode.assign_to_me_todos;
            } else {
                list = null;
            }
            if (decode != null) {
                list2 = decode.assign_to_other_todos;
            }
            return new UnCompleteChatTodosData(list, list2);
        }
    }

    /* renamed from: b */
    public final void mo191828b(String str, IGetDataCallback<UnCompleteChatTodosData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (str != null) {
            GetChatTodosRequest.C19513a aVar = new GetChatTodosRequest.C19513a();
            aVar.mo66328a(str);
            SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_TODOS, aVar, iGetDataCallback, C56284c.f139316a);
        }
    }

    /* renamed from: a */
    public final void mo191827a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (str == null) {
            iGetDataCallback.onSuccess(false);
            Unit unit = Unit.INSTANCE;
        }
        GetChatTodoStatusRequest.C50070a aVar = new GetChatTodoStatusRequest.C50070a();
        aVar.mo173948a(str);
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.GET_CHAT_TODO_STATUS, aVar, iGetDataCallback, C56282a.f139314a);
    }

    /* renamed from: a */
    public final void mo191826a(String str, long j, IGetDataCallback<CompleteChatTodosData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (str != null) {
            GetChatCompletedTodosRequest.C19509a aVar = new GetChatCompletedTodosRequest.C19509a();
            aVar.mo66319a(str).mo66317a((Integer) 20).mo66318a(Long.valueOf(j));
            SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_COMPLETED_TODOS, aVar, iGetDataCallback, C56283b.f139315a);
        }
    }
}
