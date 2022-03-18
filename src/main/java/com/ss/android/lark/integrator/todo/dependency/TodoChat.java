package com.ss.android.lark.integrator.todo.dependency;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.ss.android.lark.biz.im.api.C29601ad;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.biz.im.api.p1408a.C29597a;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.widget.richtext.C59029c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010\u0014\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J \u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001e\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J \u0010+\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J8\u0010,\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00152\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0015H\u0016J \u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u0002012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\bH\u0016J(\u00103\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\u00152\f\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016J\u0010\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoChat;", "Lcom/ss/android/lark/todo/dependency/idependency/IChatModuleDependency;", "()V", "imApi", "Lcom/ss/android/lark/biz/im/api/IIMApi;", "kotlin.jvm.PlatformType", "generateMergeForwardInfo", "Lkotlin/Pair;", "", "", "content", "Lcom/ss/android/lark/chat/entity/message/content/MergeForwardContent;", "getAllRecentReactionList", "", "getChatterById", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", BottomDialog.f17198f, "getChatterFromPb", "pbChatter", "Lcom/bytedance/lark/pb/basic/v1/Chatter;", "getLocalChatters", "", "chatterIds", "getRecentReactionList", "getWholeReactionList", "openChat", "", "context", "Landroid/content/Context;", "chatId", "position", "", "openThread", "threadId", "parseMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "entity", "Lcom/bytedance/lark/pb/basic/v1/Entity;", "messageId", "parseUrlPreviewEntityFromPb", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "urlPreviewEntity", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewEntity;", "sendMessage", "sendShareMessage", "chat2MessageMap", "channel2Message", "startMergeMessagePage", "activity", "Landroid/app/Activity;", "sourceId", "syncGetMessageByIds", "ids", "updateReactionOrder", "reactionKey", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.f */
public final class TodoChat implements IChatModuleDependency {

    /* renamed from: a */
    private final IIMApi f101796a = ((IIMApi) ApiUtils.getApi(IIMApi.class));

    @Override // com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency
    /* renamed from: b */
    public List<String> mo145379b() {
        IIMApi iIMApi = this.f101796a;
        Intrinsics.checkExpressionValueIsNotNull(iIMApi, "imApi");
        List<String> wholeReactionList = iIMApi.getWholeReactionList();
        if (wholeReactionList != null) {
            return wholeReactionList;
        }
        return CollectionsKt.emptyList();
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public List<String> mo145371a() {
        IIMApi iIMApi = this.f101796a;
        Intrinsics.checkExpressionValueIsNotNull(iIMApi, "imApi");
        List<String> recentReactionList = iIMApi.getRecentReactionList();
        if (recentReactionList != null) {
            return recentReactionList;
        }
        return CollectionsKt.emptyList();
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public Map<String, Message> mo145372a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "ids");
        return this.f101796a.syncGetMessageByIds(list);
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency
    /* renamed from: b */
    public Chatter mo145378b(String str) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        return this.f101796a.getChatterById(str);
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public Chatter mo145369a(com.bytedance.lark.pb.basic.v1.Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(chatter, "pbChatter");
        IIMApi iIMApi = this.f101796a;
        Intrinsics.checkExpressionValueIsNotNull(iIMApi, "imApi");
        return iIMApi.getChatterParser().getChatter(chatter);
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency
    /* renamed from: b */
    public Map<String, Chatter> mo145380b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "chatterIds");
        return this.f101796a.getLocalChatters(list);
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public Pair<String, CharSequence> mo145373a(MergeForwardContent mergeForwardContent) {
        Intrinsics.checkParameterIsNotNull(mergeForwardContent, "content");
        C29597a generateMergeForwardInfo = this.f101796a.generateMergeForwardInfo(mergeForwardContent);
        Intrinsics.checkExpressionValueIsNotNull(generateMergeForwardInfo, "imApi.generateMergeForwa…nfo(\n            content)");
        return new Pair<>(generateMergeForwardInfo.f74159a, generateMergeForwardInfo.f74160b);
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public void mo145376a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        this.f101796a.updateReactionOrder(str);
        this.f101796a.putReactionPassThrough(str, null);
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public Message mo145370a(C14928Entity entity, String str) {
        return this.f101796a.getMessage(entity, str);
    }

    /* renamed from: a */
    private final void m158728a(String str, String str2, String str3) {
        int chatLastPosition = this.f101796a.getChatLastPosition(str);
        this.f101796a.getLocalChat(str);
        this.f101796a.sendMessage(((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo125332j(str)).mo125328c(chatLastPosition)).mo125331i(str2)).mo125330h(str2)).mo125333k(str2)).mo106659a(C59029c.m229161b(str3)).mo106660a());
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency
    /* renamed from: b */
    public void mo145381b(Context context, String str, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "threadId");
        this.f101796a.openThread(context, new C29604ae.C29606a().mo106670b(str).mo106662a(i).mo106668a());
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public void mo145374a(Activity activity, MergeForwardContent mergeForwardContent, String str) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(mergeForwardContent, "content");
        Intrinsics.checkParameterIsNotNull(str, "sourceId");
        this.f101796a.openMergeForward(activity, mergeForwardContent, null, 3, -1, "");
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public void mo145375a(Context context, String str, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f101796a.openChat(context, ChatBundle.m109259a().mo105927a(str).mo105920a(i).mo105929a());
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency
    /* renamed from: a */
    public void mo145377a(String str, Map<String, String> map, Map<String, String> map2) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        Intrinsics.checkParameterIsNotNull(map, "chat2MessageMap");
        Intrinsics.checkParameterIsNotNull(map2, "channel2Message");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            m158728a(entry.getKey(), entry.getValue(), str);
        }
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            m158728a(entry2.getKey(), entry2.getValue(), str);
        }
    }
}
