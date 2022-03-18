package com.ss.android.lark.chat.chatwindow.chat.data.reply;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.chat.service.impl.C34218i;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dto.draft.Draft;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0016J\u001e\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J \u0010\"\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0016J\u001e\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u001e\u0010$\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J \u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/ReplyService;", "Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/IReplyService;", "currentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "creator", "Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/IReplyMsgDigestCreator;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/IReplyMsgDigestCreator;)V", "getCreator", "()Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/IReplyMsgDigestCreator;", "getCurrentChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "isEnableRichTextInput", "", "()Z", "isEnableRichTextInput$delegate", "Lkotlin/Lazy;", "mDraftService", "Lcom/ss/android/lark/chat/service/impl/DraftService;", "getMDraftService", "()Lcom/ss/android/lark/chat/service/impl/DraftService;", "mDraftService$delegate", "mMessageService", "Lcom/ss/android/lark/chat/service/IInnerMessageService;", "getMMessageService", "()Lcom/ss/android/lark/chat/service/IInnerMessageService;", "mMessageService$delegate", "getReEditReplyInfo", "", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chatwindow/model/data/ReplyInfo;", "getReEditReplyInfoImpl", "getReplyInfo", "getReplyInfoImpl", "getReplyInfoImplV2", "getReplyInfoV2", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.b.e */
public final class ReplyService implements IReplyService {

    /* renamed from: a */
    private final Lazy f85505a = LazyKt.lazy(C33230e.INSTANCE);

    /* renamed from: b */
    private final Lazy f85506b = LazyKt.lazy(C33231f.INSTANCE);

    /* renamed from: c */
    private final Lazy f85507c = LazyKt.lazy(C33229d.INSTANCE);

    /* renamed from: d */
    private final Chat f85508d;

    /* renamed from: e */
    private final IReplyMsgDigestCreator f85509e;

    /* renamed from: a */
    private final C34218i m128465a() {
        return (C34218i) this.f85505a.getValue();
    }

    /* renamed from: b */
    private final IInnerMessageService m128466b() {
        return (IInnerMessageService) this.f85506b.getValue();
    }

    /* renamed from: c */
    private final boolean m128467c() {
        return ((Boolean) this.f85507c.getValue()).booleanValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/service/impl/DraftService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.b.e$e */
    static final class C33230e extends Lambda implements Function0<C34218i> {
        public static final C33230e INSTANCE = new C33230e();

        C33230e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C34218i invoke() {
            return C34218i.m132791a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/service/IInnerMessageService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.b.e$f */
    static final class C33231f extends Lambda implements Function0<IInnerMessageService> {
        public static final C33231f INSTANCE = new C33231f();

        C33231f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final IInnerMessageService invoke() {
            return C32848e.m126401b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.b.e$a */
    static final class RunnableC33226a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReplyService f85510a;

        /* renamed from: b */
        final /* synthetic */ MessageInfo f85511b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f85512c;

        RunnableC33226a(ReplyService eVar, MessageInfo messageInfo, IGetDataCallback iGetDataCallback) {
            this.f85510a = eVar;
            this.f85511b = messageInfo;
            this.f85512c = iGetDataCallback;
        }

        public final void run() {
            this.f85510a.mo122515f(this.f85511b, this.f85512c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.b.e$b */
    static final class RunnableC33227b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReplyService f85513a;

        /* renamed from: b */
        final /* synthetic */ MessageInfo f85514b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f85515c;

        RunnableC33227b(ReplyService eVar, MessageInfo messageInfo, IGetDataCallback iGetDataCallback) {
            this.f85513a = eVar;
            this.f85514b = messageInfo;
            this.f85515c = iGetDataCallback;
        }

        public final void run() {
            this.f85513a.mo122513d(this.f85514b, this.f85515c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.b.e$c */
    static final class RunnableC33228c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReplyService f85516a;

        /* renamed from: b */
        final /* synthetic */ MessageInfo f85517b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f85518c;

        RunnableC33228c(ReplyService eVar, MessageInfo messageInfo, IGetDataCallback iGetDataCallback) {
            this.f85516a = eVar;
            this.f85517b = messageInfo;
            this.f85518c = iGetDataCallback;
        }

        public final void run() {
            this.f85516a.mo122514e(this.f85517b, this.f85518c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.b.e$d */
    static final class C33229d extends Lambda implements Function0<Boolean> {
        public static final C33229d INSTANCE = new C33229d();

        C33229d() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            return b.mo134586n().mo134685a("messenger.message_inputbox_redesign");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.data.reply.IReplyService
    /* renamed from: a */
    public void mo122510a(MessageInfo messageInfo, IGetDataCallback<C35221d> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
        if (iGetDataCallback != null) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getFixedThreadPool().execute(new RunnableC33227b(this, messageInfo, iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.data.reply.IReplyService
    /* renamed from: b */
    public void mo122511b(MessageInfo messageInfo, IGetDataCallback<C35221d> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
        if (iGetDataCallback != null) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getFixedThreadPool().submit(new RunnableC33228c(this, messageInfo, iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.data.reply.IReplyService
    /* renamed from: c */
    public void mo122512c(MessageInfo messageInfo, IGetDataCallback<C35221d> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
        if (iGetDataCallback != null) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(new RunnableC33226a(this, messageInfo, iGetDataCallback));
        }
    }

    public ReplyService(Chat chat, IReplyMsgDigestCreator cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "creator");
        this.f85508d = chat;
        this.f85509e = cVar;
    }

    /* renamed from: d */
    public final void mo122513d(MessageInfo messageInfo, IGetDataCallback<C35221d> iGetDataCallback) {
        String str;
        boolean z;
        RichText richText;
        Chat.Type type;
        C35221d dVar = new C35221d();
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        ChatChatter messageSender = messageInfo.getMessageSender();
        dVar.f90970b = message.getId();
        if (!TextUtils.isEmpty(message.getRootId())) {
            str = message.getRootId();
        } else {
            str = message.getId();
        }
        if (messageSender != null) {
            boolean z2 = true;
            CharSequence a = this.f85509e.mo122508a(messageSender, messageInfo, true);
            dVar.f90971c = a;
            if (!TextUtils.isEmpty(a)) {
                dVar.f90969a = str;
                ChatChatter messageSender2 = messageInfo.getMessageSender();
                String a2 = C34340h.m133174a(messageSender2, ChatterNameDisplayRule.ALIAS_NICKNAME_NAME);
                if (messageSender2 == null) {
                    Intrinsics.throwNpe();
                }
                String id = messageSender2.getId();
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                if (!Intrinsics.areEqual(id, b.mo134515N().mo134394a())) {
                    dVar.f90972d = a2;
                    z = false;
                } else {
                    z = true;
                }
                Draft a3 = m128465a().mo126552a(message.getId());
                String str2 = "";
                if (a3 == null) {
                    a3 = new Draft();
                    a3.title = str2;
                    if (!z) {
                        Chat chat = this.f85508d;
                        if (chat != null) {
                            type = chat.getType();
                        } else {
                            type = null;
                        }
                        if (type != Chat.Type.P2P) {
                            a3.contentRichText = C59029c.m229161b(C57814c.m224350b(messageSender2.getId(), a2) + " ");
                            z2 = false;
                        }
                    }
                    a3.contentRichText = C59029c.m229155a();
                    z2 = false;
                }
                dVar.f90975g = a3.contentRichText;
                dVar.f90974f = z2;
                Draft b2 = m128465a().mo126556b(message.getId());
                if (b2 != null) {
                    str2 = b2.title;
                }
                dVar.f90977i = str2;
                if (b2 == null) {
                    richText = C59029c.m229155a();
                } else {
                    richText = b2.postRichText;
                }
                dVar.f90976h = richText;
                iGetDataCallback.onSuccess(dVar);
                return;
            }
        }
        iGetDataCallback.onError(new ErrorResult("reply info is error!"));
    }

    /* renamed from: f */
    public final void mo122515f(MessageInfo messageInfo, IGetDataCallback<C35221d> iGetDataCallback) {
        C35221d dVar = new C35221d();
        dVar.f90974f = true;
        MessageInfo parentMessageInfo = messageInfo.getParentMessageInfo();
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        String parentId = message.getParentId();
        if (parentMessageInfo == null && (parentMessageInfo = m128466b().mo121106b(parentId)) == null) {
            iGetDataCallback.onError(new ErrorResult("messageinfo has no root message"));
            return;
        }
        Draft a = m128465a().mo126552a(parentId);
        Draft b = m128465a().mo126556b(parentId);
        dVar.f90969a = message.getRootId();
        dVar.f90970b = parentId;
        ChatChatter messageSender = parentMessageInfo.getMessageSender();
        dVar.f90971c = this.f85509e.mo122508a(messageSender, parentMessageInfo, true ^ m128467c());
        dVar.f90972d = C34340h.m133174a(messageSender, ChatterNameDisplayRule.NICKNAME_ALIAS_NAME);
        Message message2 = parentMessageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message2, "parentMessageInfo.getMessage()");
        dVar.f90973e = message2.getPosition();
        if (a != null) {
            dVar.f90975g = a.contentRichText;
        }
        if (b != null) {
            dVar.f90976h = b.postRichText;
        }
        if (message.getType() == Message.Type.TEXT) {
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<TextContent>()");
            dVar.f90975g = C34438a.m133568a(dVar.f90975g, ((TextContent) content).getRichText());
        } else if (message.getType() == Message.Type.POST) {
            Content content2 = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content2, "message.getContent<PostContent>()");
            dVar.f90976h = C34438a.m133568a(dVar.f90976h, ((PostContent) content2).getRichText());
        } else {
            Log.m165383e("ChatWindowLog", "cannot re-edit message type: " + message.getType());
        }
        if (TextUtils.isEmpty(dVar.f90971c) || (dVar.f90975g == null && dVar.f90976h == null && dVar.f90977i == null)) {
            iGetDataCallback.onError(new ErrorResult("can not get reply info"));
        } else {
            iGetDataCallback.onSuccess(dVar);
        }
    }

    /* renamed from: e */
    public final void mo122514e(MessageInfo messageInfo, IGetDataCallback<C35221d> iGetDataCallback) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        RichText richText;
        Chat.Type type;
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        C35221d dVar = new C35221d();
        ChatChatter messageSender = messageInfo.getMessageSender();
        dVar.f90970b = message.getId();
        if (messageSender == null) {
            iGetDataCallback.onError(new ErrorResult("reply info is error!"));
            return;
        }
        boolean z3 = false;
        CharSequence a = this.f85509e.mo122508a(messageSender, messageInfo, false);
        if (a == null || a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iGetDataCallback.onError(new ErrorResult("reply info is error!"));
            return;
        }
        String rootId = message.getRootId();
        if (rootId == null || rootId.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            str = message.getRootId();
        } else {
            str = message.getId();
        }
        dVar.f90969a = str;
        dVar.f90971c = a;
        String id = messageSender.getId();
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36450aa N = b.mo134515N();
        Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
        boolean areEqual = Intrinsics.areEqual(id, N.mo134394a());
        RichText richText2 = null;
        RichText richText3 = null;
        if (!areEqual) {
            Chat chat = this.f85508d;
            if (chat != null) {
                type = chat.getType();
            } else {
                type = null;
            }
            if (type == Chat.Type.GROUP) {
                String a2 = C34340h.m133174a(messageSender, ChatterNameDisplayRule.ALIAS_NICKNAME_NAME);
                richText3 = C59029c.m229161b(C57814c.m224350b(messageSender.getId(), a2) + " ");
            }
        }
        String a3 = C34340h.m133174a(messageSender, ChatterNameDisplayRule.ALIAS_NICKNAME_NAME);
        String id2 = messageSender.getId();
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36450aa N2 = b2.mo134515N();
        Intrinsics.checkExpressionValueIsNotNull(N2, "ChatModuleInstanceHolder…endency().loginDependency");
        if (!Intrinsics.areEqual(id2, N2.mo134394a())) {
            dVar.f90972d = a3;
        }
        Draft b3 = m128465a().mo126556b(message.getId());
        if (b3 != null) {
            z3 = true;
        }
        if (b3 != null) {
            str2 = b3.title;
        } else {
            str2 = null;
        }
        dVar.f90977i = str2;
        if (b3 != null) {
            richText = b3.postRichText;
        } else {
            richText = null;
        }
        if (C59035h.m229210a(richText)) {
            richText2 = richText3;
        } else if (b3 != null) {
            richText2 = b3.postRichText;
        }
        dVar.f90976h = richText2;
        dVar.f90974f = z3;
        iGetDataCallback.onSuccess(dVar);
    }
}
