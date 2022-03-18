package com.ss.android.lark.todo.impl.features.detail.assignee.service;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.GetMentionChatChattersRequest;
import com.bytedance.lark.pb.im.v1.GetMentionChatChattersResponse;
import com.bytedance.lark.pb.todo.v1.GetRecommendedContentsRequest;
import com.bytedance.lark.pb.todo.v1.GetRecommendedContentsResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.todo.impl.features.detail.assignee.service.data.MentionData;
import com.ss.android.lark.todo.impl.features.detail.assignee.service.data.RecommendData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/TodoAssigneeService;", "", "()V", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.b.a */
public final class TodoAssigneeService {

    /* renamed from: a */
    public static final Companion f139598a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u001c\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/TodoAssigneeService$Companion;", "", "()V", "getTodoMentionRequest", "", "chatId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/data/MentionData;", "key", "getTodoRecommendRequest", "recommendCount", "", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/data/RecommendData;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/data/RecommendData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.b.a$a$b */
        static final class C56449b<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C56449b f139600a = new C56449b();

            C56449b() {
            }

            /* renamed from: a */
            public final RecommendData parse(byte[] bArr) {
                List<GetRecommendedContentsResponse.RecommendContent> list;
                GetRecommendedContentsResponse decode = GetRecommendedContentsResponse.ADAPTER.decode(bArr);
                Map<String, Chatter> map = null;
                if (decode != null) {
                    list = decode.recommend_contents;
                } else {
                    list = null;
                }
                if (decode != null) {
                    map = decode.chatters;
                }
                return new RecommendData(list, map);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/data/MentionData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.b.a$a$a */
        public static final class C56448a<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            final /* synthetic */ String f139599a;

            C56448a(String str) {
                this.f139599a = str;
            }

            /* renamed from: a */
            public final MentionData parse(byte[] bArr) {
                Map<String, Chatter> map;
                C14928Entity entity;
                Map<String, C14928Entity.ChatChatter> map2;
                C14928Entity.ChatChatter chatChatter;
                GetMentionChatChattersResponse decode = GetMentionChatChattersResponse.ADAPTER.decode(bArr);
                if (decode == null || (entity = decode.entity) == null || (map2 = entity.chat_chatters) == null || (chatChatter = map2.get(this.f139599a)) == null) {
                    map = null;
                } else {
                    map = chatChatter.chatters;
                }
                return new MentionData(decode.wanted_mention_ids, decode.in_chat_chatter_ids, decode.out_chat_chatter_ids, map);
            }
        }

        /* renamed from: a */
        public final void mo192213a(int i, IGetDataCallback<RecommendData> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            GetRecommendedContentsRequest.C19525a aVar = new GetRecommendedContentsRequest.C19525a();
            aVar.mo66359a(Integer.valueOf(i));
            SdkSender.asynSendRequestNonWrap(Command.GET_RECOMMENDED_CONTENTS, aVar, iGetDataCallback, C56449b.f139600a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo192214a(String str, IGetDataCallback<MentionData> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            mo192215a(str, "", iGetDataCallback);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo192215a(String str, String str2, IGetDataCallback<MentionData> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "key");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            GetMentionChatChattersRequest.C17605a aVar = new GetMentionChatChattersRequest.C17605a();
            aVar.mo61590a(str).mo61589a((Boolean) true).mo61592b(str2);
            SdkSender.asynSendRequestNonWrap(Command.GET_MENTION_CHAT_CHATTERS, aVar, iGetDataCallback, new C56448a(str));
        }
    }
}
