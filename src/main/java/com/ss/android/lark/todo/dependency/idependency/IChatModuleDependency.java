package com.ss.android.lark.todo.dependency.idependency;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0004H&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&J(\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH&J \u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH&J\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H&J8\u0010'\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00112\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011H&J \u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0004H&J(\u0010.\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u00112\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&J\u0010\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u0004H&¨\u00062"}, d2 = {"Lcom/ss/android/lark/todo/dependency/idependency/IChatModuleDependency;", "", "generateMergeForwardInfo", "Lkotlin/Pair;", "", "", "content", "Lcom/ss/android/lark/chat/entity/message/content/MergeForwardContent;", "getAllRecentReactionList", "", "getChatterById", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", BottomDialog.f17198f, "getChatterFromPb", "pbChatter", "Lcom/bytedance/lark/pb/basic/v1/Chatter;", "getLocalChatters", "", "chatterIds", "getRecentReactionList", "getWholeReactionList", "openChat", "", "context", "Landroid/content/Context;", "chatId", "position", "", "openThread", "threadId", "parseMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "entity", "Lcom/bytedance/lark/pb/basic/v1/Entity;", "messageId", "parseUrlPreviewEntityFromPb", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "urlPreviewEntity", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewEntity;", "sendShareMessage", "chat2MessageMap", "channel2Message", "startMergeMessagePage", "activity", "Landroid/app/Activity;", "sourceId", "syncGetMessageByIds", "ids", "updateReactionOrder", "reactionKey", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.dependency.a.f */
public interface IChatModuleDependency {
    /* renamed from: a */
    Chatter mo145369a(com.bytedance.lark.pb.basic.v1.Chatter chatter);

    /* renamed from: a */
    Message mo145370a(C14928Entity entity, String str);

    /* renamed from: a */
    List<String> mo145371a();

    /* renamed from: a */
    Map<String, Message> mo145372a(List<String> list);

    /* renamed from: a */
    Pair<String, CharSequence> mo145373a(MergeForwardContent mergeForwardContent);

    /* renamed from: a */
    void mo145374a(Activity activity, MergeForwardContent mergeForwardContent, String str);

    /* renamed from: a */
    void mo145375a(Context context, String str, int i);

    /* renamed from: a */
    void mo145376a(String str);

    /* renamed from: a */
    void mo145377a(String str, Map<String, String> map, Map<String, String> map2);

    /* renamed from: b */
    Chatter mo145378b(String str);

    /* renamed from: b */
    List<String> mo145379b();

    /* renamed from: b */
    Map<String, Chatter> mo145380b(List<String> list);

    /* renamed from: b */
    void mo145381b(Context context, String str, int i);
}
