package com.ss.android.lark.threadmergeforward;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Thread;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.C33958d;
import com.ss.android.lark.chat.core.model.ObservableMappedArrayList;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterInfo;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.utils.C34332b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.threadmergeforward.C55954a;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0002JKB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00122\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120 H\u0002J\b\u0010!\u001a\u00020\u001dH\u0016J\n\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010#\u001a\u00020\u0004H\u0016J \u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00042\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J&\u0010-\u001a\u00020\u001d2\b\u0010.\u001a\u0004\u0018\u00010/2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0012010'H\u0002J\b\u00102\u001a\u00020\u0016H\u0016J\n\u00103\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u00104\u001a\u00020\u0004H\u0016J\u0010\u00105\u001a\u0002062\u0006\u0010.\u001a\u00020/H\u0002J\u001c\u00107\u001a\u00020\u001d2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0012010'H\u0016J4\u00108\u001a\b\u0012\u0004\u0012\u00020:092\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020<\u0018\u0001092\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020*\u0018\u00010 H\u0002J\u0018\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u0004H\u0016J(\u0010A\u001a\u00020\u001d2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u000e\u00100\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010'H\u0016J,\u0010C\u001a\u00020\u001d2\u000e\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E090'H\u0016J\u000e\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u000eJ\u0018\u0010H\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0012H\u0002J\u001c\u0010H\u001a\u00020\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120 H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006L"}, d2 = {"Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/threadmergeforward/IThreadMergeForwardContract$IModel;", "originMergeForwardId", "", "mMergeForwardMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "(Ljava/lang/String;Lcom/ss/android/lark/chat/entity/message/Message;)V", "mBackgroundExecutor", "Lcom/ss/android/lark/chat/core/model/HandlerExecutor;", "mChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "mChatId", "mDelegate", "Lcom/ss/android/lark/threadmergeforward/IThreadMergeForwardContract$IModel$Delegate;", "mErrorMsg", "mMessageList", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "mObservableList", "Lcom/ss/android/lark/chat/core/model/ObservableMappedArrayList;", "mReplyCount", "", "mThread", "Lcom/bytedance/lark/pb/basic/v1/Thread;", "mThreadId", "getOriginMergeForwardId", "()Ljava/lang/String;", "completeRootAndParentMessageInfo", "", "messageInfo", "messageInfoMap", "", "destroy", "getChat", "getChatOwnerId", "getChatchatters", "chatId", "dataCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/dto/chat/ChatChatterResponse;", "getChatterFromChatterInfo", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatterInfo", "Lcom/ss/android/lark/chat/entity/chatter/ChatterInfo;", "getMessageListFromMergeContent", "content", "Lcom/ss/android/lark/chat/entity/message/content/MergeForwardContent;", "callback", "Lcom/ss/android/lark/chat/core/model/ObservableList;", "getReplyCount", "getThread", "getThreadId", "initData", "", "loadData", "parseReactionInfoList", "", "Lcom/ss/android/lark/chat/entity/reaction/ReactionInfo;", "reactionList", "Lcom/ss/android/lark/chat/entity/reaction/Reaction;", "chatterMap", "prepareAudioData", "audioKey", "messageId", "putMultiMessageInSaveBox", "selectedMessageIds", "saveMessages", "fids", "Lcom/ss/android/lark/chat/entity/favorite/FavoriteMessageInfo;", "setModelDelegate", "delegate", "updateItem", "newMessageInfo", "Companion", "MessageKey", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threadmergeforward.f */
public final class ThreadMergeForwardModel extends BaseModel implements C55954a.AbstractC55955a {

    /* renamed from: d */
    public static final Companion f138289d = new Companion(null);

    /* renamed from: a */
    public ObservableMappedArrayList<String, MessageInfo> f138290a;

    /* renamed from: b */
    public C55954a.AbstractC55955a.AbstractC55956a f138291b;

    /* renamed from: c */
    public final Message f138292c;

    /* renamed from: e */
    private List<MessageInfo> f138293e = new ArrayList();

    /* renamed from: f */
    private final C33958d f138294f;

    /* renamed from: g */
    private int f138295g;

    /* renamed from: h */
    private Chat f138296h;

    /* renamed from: i */
    private String f138297i;

    /* renamed from: j */
    private String f138298j;

    /* renamed from: k */
    private Thread f138299k;

    /* renamed from: l */
    private String f138300l;

    /* renamed from: m */
    private final String f138301m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardModel$Companion;", "", "()V", "LOG_TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55955a
    /* renamed from: a */
    public Chat mo190722a() {
        return this.f138296h;
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55955a
    /* renamed from: b */
    public String mo190727b() {
        return this.f138298j;
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55955a
    /* renamed from: c */
    public Thread mo190729c() {
        return this.f138299k;
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55955a
    /* renamed from: e */
    public int mo190731e() {
        return this.f138295g;
    }

    /* renamed from: a */
    public final boolean mo190750a(MergeForwardContent mergeForwardContent) {
        if (!mergeForwardContent.isFromPrivateTopic()) {
            this.f138300l = "not from privateTopic";
            return false;
        } else if (mergeForwardContent.getOriginChat() == null) {
            this.f138300l = "originChat is null";
            return false;
        } else {
            Chat originChat = mergeForwardContent.getOriginChat();
            if (originChat != null) {
                this.f138296h = originChat;
                String id = originChat.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
                this.f138297i = id;
                if (mergeForwardContent.getThread() == null) {
                    this.f138300l = "thread is null";
                    return false;
                }
                Thread thread = mergeForwardContent.getThread();
                if (thread != null) {
                    String str = thread.id;
                    Intrinsics.checkExpressionValueIsNotNull(str, "thread.id");
                    this.f138298j = str;
                    this.f138299k = thread;
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55955a
    /* renamed from: a */
    public void mo190726a(List<String> list, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (list != null && list.size() > 0) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134522U().mo134620a(list, this.f138301m, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55955a
    /* renamed from: a */
    public void mo190725a(String str, String str2) {
        MessageInfo itemByKey;
        Intrinsics.checkParameterIsNotNull(str, "audioKey");
        Intrinsics.checkParameterIsNotNull(str2, "messageId");
        ObservableMappedArrayList<String, MessageInfo> observableMappedArrayList = this.f138290a;
        if (observableMappedArrayList != null && (itemByKey = observableMappedArrayList.getItemByKey(str2)) != null) {
            if ((itemByKey != null ? itemByKey.getMessage() : null) != null) {
                C34332b.m133110a(itemByKey.getMessage(), false, (IGetDataCallback<String>) new C55964d(this, itemByKey, str2));
            }
        }
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55955a
    /* renamed from: d */
    public String mo190730d() {
        String ownerId;
        Chat chat = this.f138296h;
        if (chat == null || (ownerId = chat.getOwnerId()) == null) {
            return "";
        }
        return ownerId;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f138294f.mo124077c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.f$c */
    static final class RunnableC55963c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardModel f138302a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f138303b;

        RunnableC55963c(ThreadMergeForwardModel fVar, IGetDataCallback iGetDataCallback) {
            this.f138302a = fVar;
            this.f138303b = iGetDataCallback;
        }

        public final void run() {
            ThreadMergeForwardModel fVar = this.f138302a;
            Content content = fVar.f138292c.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "mMergeForwardMessage.getContent()");
            if (fVar.mo190750a((MergeForwardContent) content)) {
                C55954a.AbstractC55955a.AbstractC55956a aVar = this.f138302a.f138291b;
                if (aVar != null) {
                    aVar.mo190732a();
                }
                ThreadMergeForwardModel fVar2 = this.f138302a;
                fVar2.mo190747a((MergeForwardContent) fVar2.f138292c.getContent(), this.f138303b);
                return;
            }
            this.f138303b.onError(new ErrorResult("initData error"));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.f$e */
    public static final class RunnableC55965e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardModel f138307a;

        /* renamed from: b */
        final /* synthetic */ Map f138308b;

        RunnableC55965e(ThreadMergeForwardModel fVar, Map map) {
            this.f138307a = fVar;
            this.f138308b = map;
        }

        public final void run() {
            ObservableMappedArrayList<String, MessageInfo> observableMappedArrayList = this.f138307a.f138290a;
            if (observableMappedArrayList != null) {
                observableMappedArrayList.beginUpdate();
                for (Map.Entry entry : this.f138308b.entrySet()) {
                    MessageInfo messageInfo = (MessageInfo) entry.getValue();
                    int itemPosByKey = observableMappedArrayList.getItemPosByKey((String) entry.getKey());
                    if (itemPosByKey != -1) {
                        observableMappedArrayList.set(itemPosByKey, messageInfo);
                    }
                }
                observableMappedArrayList.finishUpdate();
            }
        }
    }

    /* renamed from: a */
    public final void mo190748a(C55954a.AbstractC55955a.AbstractC55956a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f138291b = aVar;
    }

    /* renamed from: a */
    private final void m217485a(Map<String, ? extends MessageInfo> map) {
        this.f138294f.execute(new RunnableC55965e(this, map));
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardModel$MessageKey;", "Lcom/ss/android/lark/chat/core/model/ObservableMappedArrayList$ItemKey;", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "()V", "getKey", "item", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.f$b */
    public static final class MessageKey implements ObservableMappedArrayList.AbstractC33947b<String, MessageInfo> {
        /* renamed from: a */
        public String mo124044a(MessageInfo messageInfo) {
            Intrinsics.checkParameterIsNotNull(messageInfo, "item");
            Message message = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "item.getMessage()");
            String id = message.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "item.getMessage().id");
            return id;
        }
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55955a
    /* renamed from: a */
    public void mo190723a(IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C57865c.m224576a(new RunnableC55963c(this, iGetDataCallback));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardModel$prepareAudioData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "path", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.f$d */
    public static final class C55964d implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardModel f138304a;

        /* renamed from: b */
        final /* synthetic */ MessageInfo f138305b;

        /* renamed from: c */
        final /* synthetic */ String f138306c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, "path");
            Content content = this.f138305b.getMessage().getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "messageInfo.getMessage().getContent()");
            AudioContent audioContent = (AudioContent) content;
            if (TextUtils.isEmpty(str)) {
                audioContent.setFileState(AudioContent.AudioState.DOWNLOAD);
            } else {
                audioContent.setProgress(100);
                audioContent.setFileState(AudioContent.AudioState.DONE);
                audioContent.setLocalFilePath(str);
                C34332b.m133114b(audioContent);
            }
            this.f138304a.mo190749a(this.f138306c, this.f138305b);
        }

        C55964d(ThreadMergeForwardModel fVar, MessageInfo messageInfo, String str) {
            this.f138304a = fVar;
            this.f138305b = messageInfo;
            this.f138306c = str;
        }
    }

    /* renamed from: a */
    private final Chatter m217482a(ChatterInfo chatterInfo) {
        Chatter chatter = new Chatter();
        chatter.setId(chatterInfo.getId());
        chatter.setName(chatterInfo.getName());
        chatter.setType(chatterInfo.getType());
        chatter.setAvatarKey(chatterInfo.getAvatarKey());
        chatter.setAnonymous(chatterInfo.isAnonymous());
        chatter.setProfileEnable(true);
        return chatter;
    }

    public ThreadMergeForwardModel(String str, Message message) {
        Intrinsics.checkParameterIsNotNull(str, "originMergeForwardId");
        Intrinsics.checkParameterIsNotNull(message, "mMergeForwardMessage");
        this.f138301m = str;
        this.f138292c = message;
        C33958d a = C33958d.m131429a("lk-merge-forward");
        Intrinsics.checkExpressionValueIsNotNull(a, "HandlerExecutor.create(\"lk-merge-forward\")");
        this.f138294f = a;
        this.f138297i = "";
        this.f138298j = "";
        this.f138300l = "";
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55955a
    /* renamed from: b */
    public void mo190728b(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134522U().mo134621a(list, this.f138297i, this.f138301m, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    /* renamed from: a */
    private final List<ReactionInfo> m217483a(List<? extends Reaction> list, Map<String, ? extends Chatter> map) {
        Chatter chatter;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (T t : list) {
                List<String> chatterIds = t.getChatterIds();
                HashMap hashMap = new HashMap();
                Intrinsics.checkExpressionValueIsNotNull(chatterIds, "chatterIds");
                for (T t2 : chatterIds) {
                    if (map != null) {
                        chatter = (Chatter) map.get(t2);
                    } else {
                        chatter = null;
                    }
                    if (chatter != null) {
                        Intrinsics.checkExpressionValueIsNotNull(t2, "id");
                        hashMap.put(t2, new ChatChatter(chatter));
                    }
                }
                arrayList.add(new ReactionInfo(t, hashMap));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final void m217484a(MessageInfo messageInfo, Map<String, ? extends MessageInfo> map) {
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        String parentId = message.getParentId();
        if (!TextUtils.isEmpty(parentId) && map.containsKey(parentId)) {
            messageInfo.setParentMessageInfo((MessageInfo) map.get(parentId));
        }
        String rootId = message.getRootId();
        if (!TextUtils.isEmpty(rootId) && map.containsKey(rootId)) {
            messageInfo.setRootMessageInfo((MessageInfo) map.get(rootId));
        }
    }

    /* renamed from: a */
    public final void mo190747a(MergeForwardContent mergeForwardContent, IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback) {
        ChatterInfo chatterInfo;
        if (mergeForwardContent == null) {
            Log.m165383e("ThreadMergeForwardModel", "content is null");
            return;
        }
        List<Message> messages = mergeForwardContent.getMessages();
        Map<String, ChatterInfo> chatters = mergeForwardContent.getChatters();
        Map<String, Chatter> reactionChatterMap = mergeForwardContent.getReactionChatterMap();
        Map<String, List<Reaction>> reactionMap = mergeForwardContent.getReactionMap();
        if (CollectionUtils.isEmpty(messages) || CollectionUtils.isEmpty(chatters)) {
            iGetDataCallback.onError(new ErrorResult("Message or chatterInfo is empty"));
            return;
        }
        HashMap hashMap = new HashMap();
        if (messages != null) {
            for (T t : messages) {
                Chatter chatter = reactionChatterMap.get(t.getFromId());
                if (chatter == null) {
                    if (chatters != null) {
                        chatterInfo = chatters.get(t.getFromId());
                    } else {
                        chatterInfo = null;
                    }
                    if (chatterInfo != null) {
                        chatter = m217482a(chatterInfo);
                    }
                }
                if (chatter != null) {
                    MessageInfo messageInfo = new MessageInfo(t, new ChatChatter(chatter));
                    messageInfo.setReactionInfoList(m217483a(reactionMap.get(t.getId()), reactionChatterMap));
                    this.f138293e.add(messageInfo);
                    HashMap hashMap2 = hashMap;
                    String id = t.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id, "message.id");
                    hashMap2.put(id, messageInfo);
                    m217484a(messageInfo, hashMap2);
                } else {
                    Log.m165383e("ThreadMergeForwardModel", "Failed to find chatterInfo, message id is:" + t.getId());
                }
            }
        }
        if (!this.f138293e.isEmpty()) {
            int i = 0;
            Message message = this.f138293e.get(0).getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            String id2 = message.getId();
            Intrinsics.checkExpressionValueIsNotNull(id2, "messageInfo.getMessage().id");
            this.f138298j = id2;
            this.f138295g = this.f138293e.size() - 1;
            for (T t2 : this.f138293e) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                T t3 = t2;
                Message message2 = t3.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
                message2.setThreadId(this.f138298j);
                Message message3 = t3.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message3, "messageInfo.getMessage()");
                message3.setThreadPosition(i - 1);
                if (i != 0) {
                    Message message4 = t3.getMessage();
                    Intrinsics.checkExpressionValueIsNotNull(message4, "messageInfo.getMessage()");
                    message4.setRootId(this.f138298j);
                }
                i = i2;
            }
        }
        ObservableMappedArrayList<String, MessageInfo> observableMappedArrayList = new ObservableMappedArrayList<>(new MessageKey(), true, true);
        this.f138290a = observableMappedArrayList;
        if (observableMappedArrayList != null) {
            observableMappedArrayList.addAll(this.f138293e);
        }
        iGetDataCallback.onSuccess(this.f138290a);
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55955a
    /* renamed from: a */
    public void mo190724a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        C32821b.m126120a().mo121020a(str, (String) null, true, (IGetDataCallback<ChatChatterResponse>) getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback), 0);
    }

    /* renamed from: a */
    public final void mo190749a(String str, MessageInfo messageInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, messageInfo);
        m217485a(hashMap);
    }
}
