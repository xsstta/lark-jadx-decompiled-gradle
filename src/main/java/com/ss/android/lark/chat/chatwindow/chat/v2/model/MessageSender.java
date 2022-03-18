package com.ss.android.lark.chat.chatwindow.chat.v2.model;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.LarkUriUtil;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.C29601ad;
import com.ss.android.lark.biz.im.api.C29613e;
import com.ss.android.lark.biz.im.api.C29631w;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.p1409b.C29609a;
import com.ss.android.lark.chat.api.service.p1600b.C32832c;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.base.model.C32915a;
import com.ss.android.lark.chat.chatwindow.chat.model.C33410f;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33394c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.chat.entity.message.p1669a.C34007a;
import com.ss.android.lark.chat.entity.message.p1669a.C34009b;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.service.AbstractC34295j;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.chat.service.impl.AbstractC34231l;
import com.ss.android.lark.chat.service.impl.MediaMessageMonitor;
import com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback;
import com.ss.android.lark.chat.service.p1678a.p1679a.C34118b;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.chatwindow.view.NutFileInfo;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57788ai;
import com.ss.android.lark.utils.C57887w;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 G2\u00020\u0001:\u0006FGHIJKB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J0\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0002J\u0016\u0010\"\u001a\u00020\u00182\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0(H\u0016J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0002J.\u0010*\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0(2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001cH\u0016J\u0016\u00100\u001a\u00020\u00182\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001802H\u0016J&\u00103\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u0002040(2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001cH\u0016J\u0016\u00105\u001a\u00020\u00182\f\u00106\u001a\b\u0012\u0004\u0012\u0002070(H\u0016J0\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020<2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001cH\u0016J \u0010=\u001a\u00020\u00182\u0006\u0010>\u001a\u00020?2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001cH\u0016J \u0010@\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020<H\u0016J*\u0010A\u001a\u0004\u0018\u00010\u001a2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u000e\u0010B\u001a\u00020\u00182\u0006\u0010C\u001a\u00020\tJ\u0010\u0010D\u001a\u00020\u00182\b\u0010E\u001a\u0004\u0018\u00010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006L"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$IMessageSendListener;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$IMessageSendListener;)V", "getListener", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$IMessageSendListener;", "setListener", "mCurrentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getMCurrentChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "setMCurrentChat", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "mMessageService", "Lcom/ss/android/lark/chat/service/IInnerMessageService;", "kotlin.jvm.PlatformType", "mP2pChatChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "getMP2pChatChatter", "()Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "setMP2pChatChatter", "(Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;)V", "sendAudioMsg", "", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "fileName", "", "cid", "duration", "", "sendAudioTextMsg", "text", "sendFileMsg", "uri", "Landroid/net/Uri;", "file", "Ljava/io/File;", "files", "", "sendFileMsgByUri", "sendImageMsg", "photos", "keepOrigin", "", "rootMsgId", "parentMsgId", "sendLogMsg", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "sendMediaMsg", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "sendNutFileMsg", "nutFileInfos", "Lcom/ss/android/lark/chatwindow/view/NutFileInfo;", "sendPostMsg", "title", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "sendStickerMsg", "stickerFileInfo", "Lcom/ss/android/lark/dependency/IStickerDependency$StickerFileInfo;", "sendTextMsg", "startAudioRecord", "updateChat", "chat", "updateP2pChatter", "chatChatter", "AuditedMessageSendCallback", "Companion", "IMessageSendListener", "MediaSendCallback", "MessageSendCallback", "StickerMessageSendCallback", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b */
public final class MessageSender implements IMessageSender {

    /* renamed from: a */
    public static final Companion f86148a = new Companion(null);

    /* renamed from: b */
    private final IInnerMessageService f86149b = C32848e.m126401b();

    /* renamed from: c */
    private Chat f86150c;

    /* renamed from: d */
    private ChatChatter f86151d;

    /* renamed from: e */
    private IMessageSendListener f86152e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J$\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$IMessageSendListener;", "", "onAuditedFailed", "", "msg", "", "onMsgUpdate", "key", "Lcom/ss/android/lark/chatbase/BasePageStore$ItemTwoKey;", "updater", "Lcom/ss/android/lark/chatbase/model/PageStore$IItemPatch;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "onPendingSendMsg", "onSendMsgFailed", "preMsg", "Lcom/ss/android/lark/chat/entity/message/Message;", "onSendMsgSuccess", "messageId", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b$c */
    public interface IMessageSendListener {
        /* renamed from: a */
        void mo123028a();

        /* renamed from: a */
        void mo123029a(Message message);

        /* renamed from: a */
        void mo123030a(Message message, String str);

        /* renamed from: a */
        void mo123031a(AbstractC34417b.AbstractC34421c<String> cVar, AbstractC34432b.AbstractC34434b<AbstractC34006a> bVar);

        /* renamed from: a */
        void mo123032a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$Companion;", "", "()V", "FILE_UPLOAD_AUTHORIZATED_DENY_CODE", "", "FILE_UPLOAD_FILE_DESCRIPTOR", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$MessageSendCallback;", "Lcom/ss/android/lark/chat/service/impl/MonitorMessageSendCallback;", "ref", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender;)V", "wr", "Ljava/lang/ref/WeakReference;", "getWr", "()Ljava/lang/ref/WeakReference;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "preMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "onSuccess", "response", "Lcom/ss/android/lark/chat/service/dto/message/PreMessageSendSuccessResponse;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b$e */
    public static class MessageSendCallback extends MonitorMessageSendCallback {

        /* renamed from: a */
        private final WeakReference<MessageSender> f86153a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final WeakReference<MessageSender> mo123033a() {
            return this.f86153a;
        }

        public MessageSendCallback(MessageSender bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "ref");
            this.f86153a = new WeakReference<>(bVar);
            mo126648a(bVar.mo123022a());
            mo126649a(bVar.mo123026b());
        }

        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
        /* renamed from: a */
        public void mo121288a(C34118b bVar) {
            MessageSender bVar2;
            IMessageSendListener c;
            super.mo121288a(bVar);
            if (bVar != null && (bVar2 = this.f86153a.get()) != null && (c = bVar2.mo123027c()) != null) {
                Message message = bVar.f88300a;
                Intrinsics.checkExpressionValueIsNotNull(message, "it.preMessage");
                String str = bVar.f88301b;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.messageId");
                c.mo123030a(message, str);
            }
        }

        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
        /* renamed from: a */
        public void mo121287a(ErrorResult errorResult, Message message) {
            MessageSender bVar;
            IMessageSendListener c;
            super.mo121287a(errorResult, message);
            if (message != null && (bVar = this.f86153a.get()) != null && (c = bVar.mo123027c()) != null) {
                c.mo123029a(message);
            }
        }
    }

    /* renamed from: a */
    public final Chat mo123022a() {
        return this.f86150c;
    }

    /* renamed from: b */
    public final ChatChatter mo123026b() {
        return this.f86151d;
    }

    /* renamed from: c */
    public final IMessageSendListener mo123027c() {
        return this.f86152e;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender
    /* renamed from: a */
    public void mo123011a(String str, String str2, RichText richText) {
        Intrinsics.checkParameterIsNotNull(str, "rootMsgId");
        Intrinsics.checkParameterIsNotNull(str2, "parentMsgId");
        Intrinsics.checkParameterIsNotNull(richText, "richText");
        Chat chat = this.f86150c;
        if (chat != null) {
            this.f86152e.mo123028a();
            this.f86149b.mo121267b(((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo125332j(chat.getId())).mo125328c(chat.getLastMessagePosition())).mo106709g(UUID.randomUUID().toString())).mo125330h(str)).mo125331i(str2)).mo106659a(richText).mo106660a(), new MessageSendCallback(this));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender
    /* renamed from: a */
    public void mo123012a(String str, String str2, RichText richText, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "content");
        Intrinsics.checkParameterIsNotNull(richText, "richText");
        Intrinsics.checkParameterIsNotNull(str3, "rootMsgId");
        Intrinsics.checkParameterIsNotNull(str4, "parentMsgId");
        Chat chat = this.f86150c;
        if (chat != null) {
            this.f86152e.mo123028a();
            this.f86149b.mo121267b(((C29609a.C29610a) ((C29609a.C29610a) ((C29609a.C29610a) ((C29609a.C29610a) ((C29609a.C29610a) C29609a.m109497a().mo125332j(chat.getId())).mo125328c(chat.getLastMessagePosition())).mo106709g(UUID.randomUUID().toString())).mo106693a(false).mo125330h(str3)).mo125331i(str4)).mo106692a(str).mo106691a(richText).mo106694a(), new MessageSendCallback(this));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender
    /* renamed from: a */
    public void mo123015a(List<String> list, boolean z, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(list, "photos");
        Intrinsics.checkParameterIsNotNull(str, "rootMsgId");
        Intrinsics.checkParameterIsNotNull(str2, "parentMsgId");
        Chat chat = this.f86150c;
        if (chat != null) {
            this.f86152e.mo123028a();
            C32915a.m126762a(chat.getId(), list).mo121547a(z).mo121541a(chat.getLastMessagePosition()).mo121551b(str2).mo121546a(str).mo121545a(new AuditedMessageSendCallback(this)).mo121553c(chat.isSecret()).mo121544a(new C33433i(this, list, z, str2, str)).mo121548a();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender
    /* renamed from: a */
    public void mo123014a(List<? extends Photo> list, String str, String str2) {
        Chat chat;
        Intrinsics.checkParameterIsNotNull(list, "photos");
        Intrinsics.checkParameterIsNotNull(str, "rootMsgId");
        Intrinsics.checkParameterIsNotNull(str2, "parentMsgId");
        if (CollectionUtils.isEmpty(list) || (chat = this.f86150c) == null) {
            return;
        }
        if (chat.isSecret()) {
            ArrayList arrayList = new ArrayList();
            for (Photo photo : list) {
                arrayList.add(new File(photo.getPath()));
            }
            mo123013a(arrayList);
            return;
        }
        this.f86152e.mo123028a();
        MediaSendCallback dVar = new MediaSendCallback(this);
        dVar.mo126558a(Message.Type.MEDIA);
        Photo photo2 = (Photo) list.get(0);
        C29631w a = ((C29631w.C29633a) ((C29631w.C29633a) ((C29631w.C29633a) ((C29631w.C29633a) ((C29631w.C29633a) C29631w.m109564a().mo125332j(chat.getId())).mo125330h(str)).mo125331i(str2)).mo125328c(chat.getLastMessagePosition())).mo106767a(new File(photo2.getPath())).mo106768a(photo2.getMimeType()).mo106766a(photo2.getSize()).mo106770b(photo2.getDuration()).mo125334l(dVar.mo126560b())).mo106771b(photo2.getCompressPath()).mo106769a();
        String compressPath = photo2.getCompressPath();
        Intrinsics.checkExpressionValueIsNotNull(compressPath, "photo.compressPath");
        MediaMessageMonitor.m132845a(compressPath);
        this.f86149b.mo121267b(a, dVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender
    /* renamed from: a */
    public void mo123013a(List<? extends File> list) {
        Intrinsics.checkParameterIsNotNull(list, "files");
        if (!CollectionUtils.isEmpty(list)) {
            this.f86152e.mo123028a();
            for (File file : list) {
                mo123025a(file);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b$j */
    static final class C33434j<T> implements C57865c.AbstractC57873d<File> {

        /* renamed from: a */
        public static final C33434j f86172a = new C33434j();

        C33434j() {
        }

        /* renamed from: a */
        public final File produce() {
            String str;
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36474h.C36492r D = b.mo134505D();
            String str2 = null;
            if (D != null) {
                str2 = D.f94027a;
            }
            Chatter a = C32835d.m126323c().mo121186a();
            if (a != null) {
                str = C32832c.m126312a().mo121121a(a, ChatterNameDisplayRule.NAME);
                Intrinsics.checkExpressionValueIsNotNull(str, "chatterNameService.getDi…tterNameDisplayRule.NAME)");
            } else {
                str = "";
            }
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            Context a2 = b2.mo134528a();
            AbstractC36474h b3 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b3.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            String a3 = N.mo134394a();
            AbstractC36474h b4 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b4, "ChatModuleInstanceHolder.getDependency()");
            return C57887w.m224666a(a2, str2, a3, b4.mo134578f(), str, C29990c.m110930b().mo134576d());
        }
    }

    /* renamed from: a */
    public final void mo123023a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        this.f86150c = chat;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$AuditedMessageSendCallback;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$MessageSendCallback;", "ref", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender;)V", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "preMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b$a */
    public static class AuditedMessageSendCallback extends MessageSendCallback {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AuditedMessageSendCallback(MessageSender bVar) {
            super(bVar);
            Intrinsics.checkParameterIsNotNull(bVar, "ref");
        }

        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f, com.ss.android.lark.chat.chatwindow.chat.v2.model.MessageSender.MessageSendCallback
        /* renamed from: a */
        public void mo121287a(ErrorResult errorResult, Message message) {
            String displayMsg;
            MessageSender bVar;
            IMessageSendListener c;
            super.mo121287a(errorResult, message);
            if (errorResult != null && errorResult.getErrorCode() == 321000 && (displayMsg = errorResult.getDisplayMsg()) != null && (bVar = mo123033a().get()) != null && (c = bVar.mo123027c()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(displayMsg, "it");
                c.mo123032a(displayMsg);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$MediaSendCallback;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$AuditedMessageSendCallback;", "Lcom/ss/android/lark/chat/service/ISendMessageBegin;", "Lcom/ss/android/lark/chat/service/impl/IMediaCompressProgress;", "ref", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender;)V", "onBeginSendMessage", "", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "onUpdateMediaCompressProgress", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b$d */
    public static final class MediaSendCallback extends AuditedMessageSendCallback implements AbstractC34231l, AbstractC34295j {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaSendCallback(MessageSender bVar) {
            super(bVar);
            Intrinsics.checkParameterIsNotNull(bVar, "ref");
        }

        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34295j
        /* renamed from: a */
        public void mo121315a(Message message) {
            MessageSender bVar;
            IMessageSendListener c;
            super.mo121315a(message);
            if (message != null && (bVar = mo123033a().get()) != null && (c = bVar.mo123027c()) != null) {
                c.mo123031a(new C33410f(message), new C33394c(message));
            }
        }

        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.impl.AbstractC34231l
        /* renamed from: b */
        public void mo121318b(Message message) {
            MessageSender bVar;
            IMessageSendListener c;
            super.mo121318b(message);
            if (message != null && (bVar = mo123033a().get()) != null && (c = bVar.mo123027c()) != null) {
                c.mo123031a(new C33410f(message), new C33394c(message));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/io/File;", "onExceedLimitSizeOrReadFail", "com/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$sendImageMsg$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b$i */
    static final class C33433i implements C32915a.AbstractC32918a {

        /* renamed from: a */
        final /* synthetic */ MessageSender f86167a;

        /* renamed from: b */
        final /* synthetic */ List f86168b;

        /* renamed from: c */
        final /* synthetic */ boolean f86169c;

        /* renamed from: d */
        final /* synthetic */ String f86170d;

        /* renamed from: e */
        final /* synthetic */ String f86171e;

        C33433i(MessageSender bVar, List list, boolean z, String str, String str2) {
            this.f86167a = bVar;
            this.f86168b = list;
            this.f86169c = z;
            this.f86170d = str;
            this.f86171e = str2;
        }

        @Override // com.ss.android.lark.chat.base.model.C32915a.AbstractC32918a
        public final void onExceedLimitSizeOrReadFail(File file) {
            Intrinsics.checkParameterIsNotNull(file, "it");
            this.f86167a.mo123025a(file);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender
    /* renamed from: a */
    public void mo123006a(Uri uri) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        this.f86152e.mo123028a();
        m129551b(uri);
    }

    public MessageSender(IMessageSendListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f86152e = cVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender
    /* renamed from: a */
    public void mo123007a(IGetDataCallback<Unit> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f86152e.mo123028a();
        C57865c.m224574a(C33434j.f86172a, new C33435k(this, iGetDataCallback));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$sendAudioMsg$1$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$MessageSendCallback;", "onPreSend", "", "preMessageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b$g */
    public static final class C33431g extends MessageSendCallback {

        /* renamed from: a */
        final /* synthetic */ MessageSender f86156a;

        /* renamed from: b */
        final /* synthetic */ Message f86157b;

        /* renamed from: c */
        final /* synthetic */ String f86158c;

        /* renamed from: d */
        final /* synthetic */ int f86159d;

        /* renamed from: e */
        final /* synthetic */ String f86160e;

        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
        /* renamed from: a */
        public void mo123034a(MessageInfo messageInfo) {
            Intrinsics.checkParameterIsNotNull(messageInfo, "preMessageInfo");
            super.mo123034a(messageInfo);
            Message message = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "preMessageInfo.getMessage()");
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "preMessage.getContent<AudioContent>()");
            AudioContent audioContent = (AudioContent) content;
            audioContent.setDuration(this.f86159d);
            audioContent.setLocalFilePath(this.f86160e);
            audioContent.setRecognizeFinished(true);
            audioContent.setNeedHideText(true);
            audioContent.setFileState(AudioContent.AudioState.DOWNLOAD);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33431g(MessageSender bVar, MessageSender bVar2, Message message, String str, int i, String str2) {
            super(bVar);
            this.f86156a = bVar2;
            this.f86157b = message;
            this.f86158c = str;
            this.f86159d = i;
            this.f86160e = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$sendAudioTextMsg$1$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$MessageSendCallback;", "onPreSend", "", "preMessageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b$h */
    public static final class C33432h extends MessageSendCallback {

        /* renamed from: a */
        final /* synthetic */ MessageSender f86161a;

        /* renamed from: b */
        final /* synthetic */ Message f86162b;

        /* renamed from: c */
        final /* synthetic */ String f86163c;

        /* renamed from: d */
        final /* synthetic */ int f86164d;

        /* renamed from: e */
        final /* synthetic */ String f86165e;

        /* renamed from: f */
        final /* synthetic */ String f86166f;

        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f
        /* renamed from: a */
        public void mo123034a(MessageInfo messageInfo) {
            Intrinsics.checkParameterIsNotNull(messageInfo, "preMessageInfo");
            super.mo123034a(messageInfo);
            Message message = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "preMessageInfo.getMessage()");
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "preMessage.getContent<AudioContent>()");
            AudioContent audioContent = (AudioContent) content;
            audioContent.setDuration(this.f86164d);
            audioContent.setLocalFilePath(this.f86165e);
            audioContent.setAudioWithText(true);
            audioContent.setNeedHideText(false);
            audioContent.setRecognizedText(this.f86166f);
            audioContent.setFileState(AudioContent.AudioState.DOWNLOAD);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33432h(MessageSender bVar, MessageSender bVar2, Message message, String str, int i, String str2, String str3) {
            super(bVar);
            this.f86161a = bVar2;
            this.f86162b = message;
            this.f86163c = str;
            this.f86164d = i;
            this.f86165e = str2;
            this.f86166f = str3;
        }
    }

    /* renamed from: a */
    public final void mo123024a(ChatChatter chatChatter) {
        this.f86151d = chatChatter;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$StickerMessageSendCallback;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender$MessageSendCallback;", "ref", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender;", "stickerFileInfo", "Lcom/ss/android/lark/dependency/IStickerDependency$StickerFileInfo;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender;Lcom/ss/android/lark/dependency/IStickerDependency$StickerFileInfo;)V", "getRef", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/MessageSender;", "getStickerFileInfo", "()Lcom/ss/android/lark/dependency/IStickerDependency$StickerFileInfo;", "onSuccess", "", "response", "Lcom/ss/android/lark/chat/service/dto/message/PreMessageSendSuccessResponse;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b$f */
    public static class StickerMessageSendCallback extends MessageSendCallback {

        /* renamed from: a */
        private final MessageSender f86154a;

        /* renamed from: b */
        private final IStickerDependency.StickerFileInfo f86155b;

        @Override // com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback, com.ss.android.lark.chat.service.AbstractC34125f, com.ss.android.lark.chat.chatwindow.chat.v2.model.MessageSender.MessageSendCallback
        /* renamed from: a */
        public void mo121288a(C34118b bVar) {
            super.mo121288a(bVar);
            if (bVar != null) {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36450aa N = b.mo134515N();
                Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
                String a = N.mo134394a();
                Message message = bVar.f88300a;
                Intrinsics.checkExpressionValueIsNotNull(message, "response.preMessage");
                ChatHitPoint.Companion aVar = ChatHitPoint.f135648a;
                String str = this.f86155b.stickerSetId;
                String str2 = this.f86155b.stickerId;
                Intrinsics.checkExpressionValueIsNotNull(a, "userUniqueId");
                String str3 = message.getcId();
                Intrinsics.checkExpressionValueIsNotNull(str3, "preMessage.getcId()");
                String chatId = message.getChatId();
                Intrinsics.checkExpressionValueIsNotNull(chatId, "preMessage.chatId");
                aVar.mo187354a(str, str2, a, str3, chatId, this.f86154a.mo123022a());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StickerMessageSendCallback(MessageSender bVar, IStickerDependency.StickerFileInfo stickerFileInfo) {
            super(bVar);
            Intrinsics.checkParameterIsNotNull(bVar, "ref");
            Intrinsics.checkParameterIsNotNull(stickerFileInfo, "stickerFileInfo");
            this.f86154a = bVar;
            this.f86155b = stickerFileInfo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "zipFile", "Ljava/io/File;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b$k */
    static final class C33435k<T> implements C57865c.AbstractC57871b<File> {

        /* renamed from: a */
        final /* synthetic */ MessageSender f86173a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f86174b;

        C33435k(MessageSender bVar, IGetDataCallback iGetDataCallback) {
            this.f86173a = bVar;
            this.f86174b = iGetDataCallback;
        }

        /* renamed from: a */
        public final void consume(File file) {
            Chat a;
            this.f86174b.onSuccess(null);
            if (file != null && file.exists() && (a = this.f86173a.mo123022a()) != null) {
                C32848e.m126401b().mo121267b(((C29613e.C29615a) ((C29613e.C29615a) C29613e.m109504a().mo125332j(a.getId())).mo125328c(a.getLastMessagePosition() + 1)).mo106702a(file.getPath()).mo106704b(file.getName()).mo106699a(C26311p.m95281c(file)).mo106706d(C26311p.m95279b(file)).mo106701a(FileState.UPLOADING).mo106703a(), new MessageSendCallback(this.f86173a));
            }
        }
    }

    /* renamed from: b */
    private final void m129551b(Uri uri) {
        Application application;
        if (!C57744a.m224104a().getBoolean("android_file_upload_file_descriptor_config", true)) {
            mo123025a(new File(C57788ai.m224257a(LarkContext.getApplication(), uri)));
            return;
        }
        Chat chat = this.f86150c;
        if (chat != null && (application = LarkContext.getApplication()) != null) {
            Application application2 = application;
            String f = LarkUriUtil.m95310f(application2, uri);
            Pair<String, Long> e = LarkUriUtil.m95308e(application2, uri);
            if (e != null) {
                this.f86149b.mo121267b(((C29613e.C29615a) ((C29613e.C29615a) C29613e.m109504a().mo125332j(chat.getId())).mo125328c(chat.getLastMessagePosition() + 1)).mo106709g(UUID.randomUUID().toString()).mo106704b(e.component1()).mo106701a(FileState.UPLOADING).mo106699a(e.component2().longValue()).mo106706d(f).mo106700a(uri).mo106703a(), new AuditedMessageSendCallback(this));
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender
    /* renamed from: b */
    public void mo123016b(List<? extends NutFileInfo> list) {
        Chat chat;
        Intrinsics.checkParameterIsNotNull(list, "nutFileInfos");
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36474h.C36492r D = b.mo134505D();
        if (!(CollectionUtils.isEmpty(list) || D == null || (chat = this.f86150c) == null)) {
            this.f86152e.mo123028a();
            for (NutFileInfo nutFileInfo : list) {
                C32848e.m126401b().mo121267b(((C29613e.C29615a) ((C29613e.C29615a) C29613e.m109504a().mo125332j(chat.getId())).mo125328c(chat.getLastMessagePosition())).mo106705c(nutFileInfo.getPath()).mo106698a(2).mo106701a(FileState.DOWNLOAD).mo106704b(nutFileInfo.getName()).mo106699a(nutFileInfo.getSizeBytes()).mo106706d(C26311p.m95283c(nutFileInfo.getName())).mo106707e(D.f94027a).mo106703a(), new MessageSendCallback(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo123025a(File file) {
        Chat chat = this.f86150c;
        if (chat != null) {
            this.f86149b.mo121267b(((C29613e.C29615a) ((C29613e.C29615a) C29613e.m109504a().mo125332j(chat.getId())).mo125328c(chat.getLastMessagePosition() + 1)).mo106709g(UUID.randomUUID().toString()).mo106704b(file.getName()).mo106702a(file.getPath()).mo106701a(FileState.UPLOADING).mo106699a(C26311p.m95281c(file)).mo106706d(C26311p.m95279b(file)).mo106703a(), new AuditedMessageSendCallback(this));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender
    /* renamed from: a */
    public void mo123010a(IStickerDependency.StickerFileInfo stickerFileInfo, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(stickerFileInfo, "stickerFileInfo");
        Intrinsics.checkParameterIsNotNull(str, "rootMsgId");
        Intrinsics.checkParameterIsNotNull(str2, "parentMsgId");
        Chat chat = this.f86150c;
        if (chat != null) {
            this.f86152e.mo123028a();
            this.f86149b.mo121267b(((C34009b.C34010a) ((C34009b.C34010a) ((C34009b.C34010a) ((C34009b.C34010a) C34009b.m131850a().mo125332j(chat.getId())).mo125328c(chat.getLastMessagePosition())).mo125330h(str)).mo125331i(str2)).mo125324a(stickerFileInfo).mo125325a(), new StickerMessageSendCallback(this, stickerFileInfo));
            ChatHitPoint.f135648a.mo187350a(stickerFileInfo, chat);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender
    /* renamed from: a */
    public Message mo123005a(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "rootMsgId");
        Intrinsics.checkParameterIsNotNull(str2, "parentMsgId");
        Intrinsics.checkParameterIsNotNull(str3, "fileName");
        Intrinsics.checkParameterIsNotNull(str4, "cid");
        if (this.f86150c == null) {
            return null;
        }
        this.f86152e.mo123028a();
        C34007a.C34008a a = C34007a.m131841a();
        Chat chat = this.f86150c;
        if (chat == null) {
            Intrinsics.throwNpe();
        }
        C34007a.C34008a aVar = (C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) a.mo125332j(chat.getId())).mo125330h(str)).mo125331i(str2);
        Chat chat2 = this.f86150c;
        if (chat2 == null) {
            Intrinsics.throwNpe();
        }
        C34007a a2 = ((C34007a.C34008a) ((C34007a.C34008a) aVar.mo125328c(chat2.getLastMessagePosition() + 1)).mo106709g(str4)).mo125319a(str3).mo125318a(AudioContent.AudioState.RECORDING).mo125320a();
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36450aa N = b.mo134515N();
        Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
        return a2.mo106656a(str4, N.mo134394a());
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender
    /* renamed from: a */
    public void mo123008a(Message message, String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        Chat chat = this.f86150c;
        if (chat != null) {
            this.f86152e.mo123028a();
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<AudioContent>()");
            AudioContent audioContent = (AudioContent) content;
            this.f86149b.mo121267b(((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) C34007a.m131841a().mo125332j(chat.getId())).mo125330h(message.getRootId())).mo125331i(message.getParentId())).mo125328c(chat.getLastMessagePosition() + 1)).mo106709g(str2)).mo125318a(AudioContent.AudioState.DOWNLOAD).mo125317a(i).mo125319a(str).mo125321b(audioContent.getUploadId()).mo125322c(audioContent.getAudioToken()).mo125320a(), new C33431g(this, this, message, str2, i, str));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender
    /* renamed from: a */
    public void mo123009a(Message message, String str, String str2, String str3, int i) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(str, "text");
        Intrinsics.checkParameterIsNotNull(str2, "fileName");
        Intrinsics.checkParameterIsNotNull(str3, "cid");
        Chat chat = this.f86150c;
        if (chat != null) {
            this.f86152e.mo123028a();
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<AudioContent>()");
            AudioContent audioContent = (AudioContent) content;
            this.f86149b.mo121267b(((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) ((C34007a.C34008a) C34007a.m131841a().mo125332j(chat.getId())).mo125330h(message.getRootId())).mo125331i(message.getParentId())).mo125328c(chat.getLastMessagePosition() + 1)).mo106709g(str3)).mo125318a(AudioContent.AudioState.DOWNLOAD).mo125317a(i).mo125319a(str2).mo125323d(str).mo125321b(audioContent.getUploadId()).mo125322c(audioContent.getAudioToken()).mo125320a(), new C33432h(this, this, message, str3, i, str2, str));
        }
    }
}
