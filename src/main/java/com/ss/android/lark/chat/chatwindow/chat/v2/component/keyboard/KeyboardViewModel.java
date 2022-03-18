package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard;

import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardComponentDependency;
import com.ss.android.lark.chat.chatwindow.chat.data.reply.BaseReplyMsgDigestCreator;
import com.ss.android.lark.chat.chatwindow.chat.data.reply.ChatReplyDigestCreator;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender;
import com.ss.android.lark.chat.chatwindow.secretchat.data.reply.SecretChatReplyDigestCreator;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.chat.service.impl.C34218i;
import com.ss.android.lark.chatbase.p1688b.p1689a.C34431a;
import com.ss.android.lark.chatwindow.view.NutFileInfo;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.dto.draft.Draft;
import com.ss.android.lark.keyboard.utils.KBRichTextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001RB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\rH\u0002J\b\u0010\"\u001a\u00020 H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010'\u001a\u00020\u001eH\u0014J\u0006\u0010(\u001a\u00020\u001eJ\u000e\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+J\u0016\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020/J@\u00100\u001a\u00020\u001e2\b\u00101\u001a\u0004\u0018\u00010%2\b\u00102\u001a\u0004\u0018\u00010%2\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u00010%2\b\u00106\u001a\u0004\u0018\u0001042\u0006\u00107\u001a\u00020\rJ\u0010\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020:H\u0016J\u0016\u00108\u001a\u00020\u001e2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<H\u0016J.\u0010>\u001a\u00020\u001e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020%0<2\u0006\u0010@\u001a\u00020\r2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0016J&\u0010C\u001a\u00020\u001e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020D0<2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0016J\u0016\u0010E\u001a\u00020\u001e2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020G0<H\u0016J0\u0010H\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020%2\u0006\u0010K\u001a\u0002042\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0016J \u0010L\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020N2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0016J \u0010O\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%2\u0006\u0010K\u001a\u000204H\u0016J\u000e\u0010P\u001a\u00020\u001e2\u0006\u0010Q\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00060\u00060\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u00140\u0014X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u00160\u0016X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006S"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/IKeyboardViewModel;", "currentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "dependency", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;)V", "getCurrentChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "setCurrentChat", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "isDestroyed", "", "mDependencyRefs", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "mDraftExecutor", "Ljava/util/concurrent/ExecutorService;", "mDraftService", "Lcom/ss/android/lark/chat/service/impl/DraftService;", "mMessageService", "Lcom/ss/android/lark/chat/service/IInnerMessageService;", "mReplyDigestCreator", "Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/BaseReplyMsgDigestCreator;", "getMReplyDigestCreator", "()Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/BaseReplyMsgDigestCreator;", "mReplyDigestCreator$delegate", "Lkotlin/Lazy;", "clearTextDraftIfNeed", "", "getChatDraft", "Lcom/ss/android/lark/chatbase/model/data/ComposeDrafts;", "needShowLastDraft", "getDraftInChat", "getLastDraft", "lastDraftId", "", "getOrCreateExecutor", "onCleared", "onDestroy", "removeCurrentChatDraft", "draftType", "", "resetChatDraft", "resetOnStart", "callback", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardViewModel$IResetDraftCallback;", "saveAllDraft", "parentId", "chatId", "textRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "postTitle", "postRichText", "saveDraftOnStop", "sendFileMsg", "uri", "Landroid/net/Uri;", "files", "", "Ljava/io/File;", "sendImageMsg", "photos", "keepOrigin", "rootMsgId", "parentMsgId", "sendMediaMsg", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "sendNutFileMsg", "nutFileInfos", "Lcom/ss/android/lark/chatwindow/view/NutFileInfo;", "sendPostMsg", "title", "content", "richText", "sendStickerMsg", "stickerFileInfo", "Lcom/ss/android/lark/dependency/IStickerDependency$StickerFileInfo;", "sendTextMsg", "updateChat", "chat", "IResetDraftCallback", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.c */
public final class KeyboardViewModel extends AbstractC1142af implements IKeyboardViewModel {
    private Chat currentChat;
    private boolean isDestroyed;
    private final WeakReference<KeyboardComponentDependency> mDependencyRefs;
    private ExecutorService mDraftExecutor;
    public final C34218i mDraftService = C34218i.m132791a();
    private final IInnerMessageService mMessageService = C32848e.m126401b();
    private final Lazy mReplyDigestCreator$delegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardViewModel$IResetDraftCallback;", "", "onFetchDraftSuccess", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chatbase/model/data/ComposeDrafts;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.c$a */
    public interface IResetDraftCallback {
        /* renamed from: a */
        void mo122006a(C34431a aVar);
    }

    private final BaseReplyMsgDigestCreator getMReplyDigestCreator() {
        return (BaseReplyMsgDigestCreator) this.mReplyDigestCreator$delegate.getValue();
    }

    public final Chat getCurrentChat() {
        return this.currentChat;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        onDestroy();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.c$c */
    public static final class RunnableC33546c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ KeyboardViewModel f86431a;

        /* renamed from: b */
        final /* synthetic */ String f86432b;

        /* renamed from: c */
        final /* synthetic */ int f86433c;

        RunnableC33546c(KeyboardViewModel cVar, String str, int i) {
            this.f86431a = cVar;
            this.f86432b = str;
            this.f86433c = i;
        }

        public final void run() {
            this.f86431a.mDraftService.mo126553a(this.f86432b, this.f86433c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/BaseReplyMsgDigestCreator;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.c$b */
    static final class C33545b extends Lambda implements Function0<BaseReplyMsgDigestCreator> {
        final /* synthetic */ KeyboardViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33545b(KeyboardViewModel cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BaseReplyMsgDigestCreator invoke() {
            BaseReplyMsgDigestCreator aVar;
            if (this.this$0.getCurrentChat().isSecret()) {
                aVar = new SecretChatReplyDigestCreator();
            } else {
                aVar = new ChatReplyDigestCreator();
            }
            return aVar;
        }
    }

    public final void onDestroy() {
        ExecutorService executorService = this.mDraftExecutor;
        if (this.isDestroyed) {
            return;
        }
        if (executorService == null || !executorService.isShutdown()) {
            if (executorService != null) {
                executorService.shutdown();
            }
            this.isDestroyed = true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.c$d */
    public static final class RunnableC33547d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ KeyboardViewModel f86434a;

        /* renamed from: b */
        final /* synthetic */ boolean f86435b;

        /* renamed from: c */
        final /* synthetic */ IResetDraftCallback f86436c;

        RunnableC33547d(KeyboardViewModel cVar, boolean z, IResetDraftCallback aVar) {
            this.f86434a = cVar;
            this.f86435b = z;
            this.f86436c = aVar;
        }

        public final void run() {
            Log.m165379d("ChatWindowLog", "Executing reset draft on Thread: " + Thread.currentThread());
            final C34431a chatDraft = this.f86434a.getChatDraft(this.f86435b);
            UICallbackExecutor.execute(new Runnable(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardViewModel.RunnableC33547d.RunnableC335481 */

                /* renamed from: a */
                final /* synthetic */ RunnableC33547d f86437a;

                {
                    this.f86437a = r1;
                }

                public final void run() {
                    this.f86437a.f86436c.mo122006a(chatDraft);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.c$e */
    public static final class RunnableC33549e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ KeyboardViewModel f86439a;

        /* renamed from: b */
        final /* synthetic */ String f86440b;

        /* renamed from: c */
        final /* synthetic */ String f86441c;

        /* renamed from: d */
        final /* synthetic */ RichText f86442d;

        /* renamed from: e */
        final /* synthetic */ String f86443e;

        /* renamed from: f */
        final /* synthetic */ RichText f86444f;

        /* renamed from: g */
        final /* synthetic */ boolean f86445g;

        RunnableC33549e(KeyboardViewModel cVar, String str, String str2, RichText richText, String str3, RichText richText2, boolean z) {
            this.f86439a = cVar;
            this.f86440b = str;
            this.f86441c = str2;
            this.f86442d = richText;
            this.f86443e = str3;
            this.f86444f = richText2;
            this.f86445g = z;
        }

        public final void run() {
            Log.m165379d("ChatWindowLog", "Executing save draft on Thread: " + Thread.currentThread());
            this.f86439a.mDraftService.mo126555a(this.f86440b, this.f86441c, this.f86439a.getCurrentChat(), this.f86442d, this.f86443e, this.f86444f, this.f86445g);
        }
    }

    private final ExecutorService getOrCreateExecutor() {
        ExecutorService executorService = this.mDraftExecutor;
        if (executorService == null || executorService.isShutdown()) {
            executorService = Executors.newSingleThreadExecutor();
        }
        this.mDraftExecutor = executorService;
        if (executorService != null) {
            return executorService;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void clearTextDraftIfNeed() {
        boolean z;
        Chat chat = this.currentChat;
        String lastDraftId = chat.getLastDraftId();
        String textDraftId = chat.getTextDraftId();
        if (textDraftId == null || textDraftId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            removeCurrentChatDraft(0);
            if (Intrinsics.areEqual(lastDraftId, chat.getTextDraftId())) {
                this.mDraftService.mo126554a(chat.getId(), "");
            }
        }
    }

    private final C34431a getDraftInChat() {
        RichText richText;
        String str;
        RichText richText2;
        ArrayList arrayList = new ArrayList();
        String textDraftId = this.currentChat.getTextDraftId();
        String postDraftId = this.currentChat.getPostDraftId();
        if (!TextUtils.isEmpty(textDraftId)) {
            arrayList.add(textDraftId);
        }
        if (!TextUtils.isEmpty(postDraftId)) {
            arrayList.add(postDraftId);
        }
        Map<String, Draft> a = this.mDraftService.mo126768a(arrayList);
        Intrinsics.checkExpressionValueIsNotNull(a, "mDraftService.getDraftByIds(draftIds)");
        Draft draft = a.get(textDraftId);
        RichText a2 = C59029c.m229155a();
        if (draft == null) {
            richText = a2;
        } else {
            richText = draft.contentRichText;
        }
        Draft draft2 = a.get(postDraftId);
        if (draft2 == null) {
            str = "";
        } else {
            str = draft2.title;
        }
        if (draft2 == null) {
            richText2 = a2;
        } else {
            richText2 = draft2.postRichText;
        }
        if (this.currentChat.isAllowPost()) {
            return new C34431a(richText, str, richText2);
        }
        return new C34431a(a2, "", a2);
    }

    public final void setCurrentChat(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "<set-?>");
        this.currentChat = chat;
    }

    public final void updateChat(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        this.currentChat = chat;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel
    public void sendFileMsg(Uri uri) {
        IMessageSender c;
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        KeyboardComponentDependency fVar = this.mDependencyRefs.get();
        if (fVar != null && (c = fVar.mo122093c()) != null) {
            c.mo123006a(uri);
        }
    }

    public void sendNutFileMsg(List<? extends NutFileInfo> list) {
        IMessageSender c;
        Intrinsics.checkParameterIsNotNull(list, "nutFileInfos");
        KeyboardComponentDependency fVar = this.mDependencyRefs.get();
        if (fVar != null && (c = fVar.mo122093c()) != null) {
            c.mo123016b(list);
        }
    }

    public final C34431a getChatDraft(boolean z) {
        String lastDraftId = this.currentChat.getLastDraftId();
        if (!z || TextUtils.isEmpty(lastDraftId)) {
            return getDraftInChat();
        }
        Intrinsics.checkExpressionValueIsNotNull(lastDraftId, "lastDraftId");
        C34431a lastDraft = getLastDraft(lastDraftId);
        if (lastDraft != null) {
            return lastDraft;
        }
        return getDraftInChat();
    }

    public final void removeCurrentChatDraft(int i) {
        String id = this.currentChat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "currentChat.getId()");
        Log.m165389i("ChatWindowLog", "removeCurrentChatDraft: chat id is : " + id);
        getOrCreateExecutor().execute(new RunnableC33546c(this, id, i));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel
    public void sendFileMsg(List<? extends File> list) {
        IMessageSender c;
        Intrinsics.checkParameterIsNotNull(list, "files");
        KeyboardComponentDependency fVar = this.mDependencyRefs.get();
        if (fVar != null && (c = fVar.mo122093c()) != null) {
            c.mo123013a(list);
        }
    }

    private final C34431a getLastDraft(String str) {
        MessageInfo messageInfo;
        Draft c = this.mDraftService.mo126557c(str);
        if (c != null && !TextUtils.isEmpty(c.messageId)) {
            String str2 = c.messageId;
            if (c.message == null || c.sender == null) {
                Log.m165383e("ChatWindowLog", "get lastDraft，message or chatter is null, lastDraftId:" + str + ", message:" + c.message + ", chatter:" + c.sender);
                IInnerMessageService iInnerMessageService = this.mMessageService;
                Intrinsics.checkExpressionValueIsNotNull(str2, "messageId");
                Map<String, MessageInfo> d = iInnerMessageService.mo121110d(CollectionsKt.listOf(str2));
                if (d != null && d.containsKey(str2)) {
                    messageInfo = d.get(str2);
                }
            } else {
                messageInfo = new MessageInfo(c.message, c.sender);
            }
            BaseReplyMsgDigestCreator mReplyDigestCreator = getMReplyDigestCreator();
            if (messageInfo == null) {
                Intrinsics.throwNpe();
            }
            CharSequence a = mReplyDigestCreator.mo122508a(messageInfo.getMessageSender(), messageInfo, true);
            C34431a aVar = new C34431a(c.contentRichText, c.title, c.postRichText);
            aVar.f88906d = str2;
            aVar.f88908f = a;
            Message message = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            String rootId = message.getRootId();
            if (!TextUtils.isEmpty(rootId)) {
                str2 = rootId;
            }
            aVar.f88907e = str2;
            return aVar;
        }
        return null;
    }

    public final void resetChatDraft(boolean z, IResetDraftCallback aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        getOrCreateExecutor().execute(new RunnableC33547d(this, z, aVar));
    }

    public KeyboardViewModel(Chat chat, KeyboardComponentDependency fVar) {
        Intrinsics.checkParameterIsNotNull(chat, "currentChat");
        Intrinsics.checkParameterIsNotNull(fVar, "dependency");
        this.currentChat = chat;
        this.mDependencyRefs = new WeakReference<>(fVar);
        this.mDraftExecutor = Executors.newSingleThreadExecutor();
        this.mReplyDigestCreator$delegate = LazyKt.lazy(new C33545b(this));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel
    public void sendMediaMsg(List<? extends Photo> list, String str, String str2) {
        IMessageSender c;
        Intrinsics.checkParameterIsNotNull(list, "photos");
        Intrinsics.checkParameterIsNotNull(str, "rootMsgId");
        Intrinsics.checkParameterIsNotNull(str2, "parentMsgId");
        KeyboardComponentDependency fVar = this.mDependencyRefs.get();
        if (fVar != null && (c = fVar.mo122093c()) != null) {
            c.mo123014a(list, str, str2);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel
    public void sendStickerMsg(IStickerDependency.StickerFileInfo stickerFileInfo, String str, String str2) {
        IMessageSender c;
        Intrinsics.checkParameterIsNotNull(stickerFileInfo, "stickerFileInfo");
        Intrinsics.checkParameterIsNotNull(str, "rootMsgId");
        Intrinsics.checkParameterIsNotNull(str2, "parentMsgId");
        KeyboardComponentDependency fVar = this.mDependencyRefs.get();
        if (fVar != null && (c = fVar.mo122093c()) != null) {
            c.mo123010a(stickerFileInfo, str, str2);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel
    public void sendTextMsg(String str, String str2, RichText richText) {
        IMessageSender c;
        Intrinsics.checkParameterIsNotNull(str, "rootMsgId");
        Intrinsics.checkParameterIsNotNull(str2, "parentMsgId");
        Intrinsics.checkParameterIsNotNull(richText, "richText");
        KeyboardComponentDependency fVar = this.mDependencyRefs.get();
        if (fVar != null && (c = fVar.mo122093c()) != null) {
            c.mo123011a(str, str2, richText);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel
    public void sendImageMsg(List<String> list, boolean z, String str, String str2) {
        IMessageSender c;
        Intrinsics.checkParameterIsNotNull(list, "photos");
        Intrinsics.checkParameterIsNotNull(str, "rootMsgId");
        Intrinsics.checkParameterIsNotNull(str2, "parentMsgId");
        KeyboardComponentDependency fVar = this.mDependencyRefs.get();
        if (fVar != null && (c = fVar.mo122093c()) != null) {
            c.mo123015a(list, z, str, str2);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel
    public void sendPostMsg(String str, String str2, RichText richText, String str3, String str4) {
        IMessageSender c;
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "content");
        Intrinsics.checkParameterIsNotNull(richText, "richText");
        Intrinsics.checkParameterIsNotNull(str3, "rootMsgId");
        Intrinsics.checkParameterIsNotNull(str4, "parentMsgId");
        if (KBRichTextUtils.m160783a(richText, str)) {
            sendTextMsg(str3, str4, richText);
            return;
        }
        KeyboardComponentDependency fVar = this.mDependencyRefs.get();
        if (fVar != null && (c = fVar.mo122093c()) != null) {
            c.mo123012a(str, str2, richText, str3, str4);
        }
    }

    public final void saveAllDraft(String str, String str2, RichText richText, String str3, RichText richText2, boolean z) {
        String str4;
        StringBuilder sb = new StringBuilder();
        sb.append("saveAllDraft: parentId = [");
        sb.append(str);
        sb.append("], getChatId = [");
        sb.append(str2);
        sb.append("], messageText = [");
        if (richText == null) {
            str4 = "";
        } else {
            str4 = richText.getInnerText();
        }
        sb.append(str4);
        sb.append("], postTitle = [");
        sb.append(str3);
        sb.append("], postContent = [");
        sb.append(richText2);
        sb.append("]");
        Log.m165379d("ChatWindowLog", sb.toString());
        getOrCreateExecutor().execute(new RunnableC33549e(this, str, str2, richText, str3, richText2, z));
    }
}
