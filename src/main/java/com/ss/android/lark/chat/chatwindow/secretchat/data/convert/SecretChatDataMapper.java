package com.ss.android.lark.chat.chatwindow.secretchat.data.convert;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.AudioMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.FileMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.ImageMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.SystemMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.UnKnownMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ITextLayoutPreCalculateLifeCycle;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33221c;
import com.ss.android.lark.chat.chatwindow.chat.message.p1627d.C33345b;
import com.ss.android.lark.chat.core.model.AbstractC33959e;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chat.vo.IMsgVOConverter;
import com.ss.android.lark.dependency.AbstractC36458af;
import com.ss.android.lark.dependency.AbstractC36474h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 <2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0001<B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\"\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003030\u00032\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0005H\u0002J\"\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003030\u00032\u0006\u00104\u001a\u00020\u00022\u0006\u00106\u001a\u000207H\u0016J2\u00108\u001a\u0002092\u001c\u0010:\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u00170\u00152\n\u0010;\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0002R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u00170\u0015X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b \u0010!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b'\u0010\u000e\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b,\u0010\u000e\u001a\u0004\b*\u0010+R\u001b\u0010-\u001a\u00020.8BX\u0002¢\u0006\f\n\u0004\b1\u0010\u000e\u001a\u0004\b/\u00100¨\u0006="}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/data/convert/SecretChatDataMapper;", "Lcom/ss/android/lark/chat/core/model/IDataMapper;", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "isSelfMessageRTLDisplay", "", "preLayoutCalculator", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ITextLayoutPreCalculateLifeCycle;", "(ZLcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ITextLayoutPreCalculateLifeCycle;)V", "audioConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/AudioMsgConverter;", "getAudioConverter", "()Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/AudioMsgConverter;", "audioConverter$delegate", "Lkotlin/Lazy;", "chatterConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/ChatterConverter;", "getChatterConverter", "()Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/ChatterConverter;", "chatterConverter$delegate", "converterMap", "", "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "", "Lcom/ss/android/lark/chat/vo/IMsgVOConverter;", "fileConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/FileMsgConverter;", "getFileConverter", "()Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/FileMsgConverter;", "fileConverter$delegate", "imageConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/ImageMsgConverter;", "getImageConverter", "()Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/ImageMsgConverter;", "imageConverter$delegate", "systemConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/SystemMsgConverter;", "getSystemConverter", "()Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/SystemMsgConverter;", "systemConverter$delegate", "textConverter", "Lcom/ss/android/lark/chat/chatwindow/secretchat/data/convert/SecretTextMsgConverter;", "getTextConverter", "()Lcom/ss/android/lark/chat/chatwindow/secretchat/data/convert/SecretTextMsgConverter;", "textConverter$delegate", "unKnownMsgConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/UnKnownMsgConverter;", "getUnKnownMsgConverter", "()Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/UnKnownMsgConverter;", "unKnownMsgConverter$delegate", "from", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "messageInfo", "convertParent", "index", "", "putMsgConverter", "", "map", "msgVOConverter2", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.b.a */
public final class SecretChatDataMapper implements AbstractC33959e<MessageInfo, ChatMessageVO<?>> {

    /* renamed from: a */
    public static final Companion f87380a = new Companion(null);

    /* renamed from: b */
    private final Lazy f87381b = LazyKt.lazy(C33905c.INSTANCE);

    /* renamed from: c */
    private final Lazy f87382c = LazyKt.lazy(C33909g.INSTANCE);

    /* renamed from: d */
    private final Lazy f87383d = LazyKt.lazy(C33907e.INSTANCE);

    /* renamed from: e */
    private final Lazy f87384e = LazyKt.lazy(C33906d.INSTANCE);

    /* renamed from: f */
    private final Lazy f87385f = LazyKt.lazy(C33904b.INSTANCE);

    /* renamed from: g */
    private final Lazy f87386g = LazyKt.lazy(C33908f.INSTANCE);

    /* renamed from: h */
    private final Lazy f87387h = LazyKt.lazy(C33910h.INSTANCE);

    /* renamed from: i */
    private final Map<Message.Type, List<IMsgVOConverter<?>>> f87388i = new HashMap();

    /* renamed from: j */
    private final boolean f87389j;

    /* renamed from: k */
    private final ITextLayoutPreCalculateLifeCycle f87390k;

    /* renamed from: a */
    private final C33221c m131225a() {
        return (C33221c) this.f87381b.getValue();
    }

    /* renamed from: b */
    private final SecretTextMsgConverter m131228b() {
        return (SecretTextMsgConverter) this.f87382c.getValue();
    }

    /* renamed from: c */
    private final ImageMsgConverter m131229c() {
        return (ImageMsgConverter) this.f87383d.getValue();
    }

    /* renamed from: d */
    private final FileMsgConverter m131230d() {
        return (FileMsgConverter) this.f87384e.getValue();
    }

    /* renamed from: e */
    private final AudioMsgConverter m131231e() {
        return (AudioMsgConverter) this.f87385f.getValue();
    }

    /* renamed from: f */
    private final SystemMsgConverter m131232f() {
        return (SystemMsgConverter) this.f87386g.getValue();
    }

    /* renamed from: g */
    private final UnKnownMsgConverter m131233g() {
        return (UnKnownMsgConverter) this.f87387h.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/data/convert/SecretChatDataMapper$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/AudioMsgConverter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.b.a$b */
    static final class C33904b extends Lambda implements Function0<AudioMsgConverter> {
        public static final C33904b INSTANCE = new C33904b();

        C33904b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AudioMsgConverter invoke() {
            return new AudioMsgConverter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/ChatterConverter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.b.a$c */
    static final class C33905c extends Lambda implements Function0<C33221c> {
        public static final C33905c INSTANCE = new C33905c();

        C33905c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C33221c invoke() {
            return new C33221c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/FileMsgConverter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.b.a$d */
    static final class C33906d extends Lambda implements Function0<FileMsgConverter> {
        public static final C33906d INSTANCE = new C33906d();

        C33906d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final FileMsgConverter invoke() {
            return new FileMsgConverter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/ImageMsgConverter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.b.a$e */
    static final class C33907e extends Lambda implements Function0<ImageMsgConverter> {
        public static final C33907e INSTANCE = new C33907e();

        C33907e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageMsgConverter invoke() {
            return new ImageMsgConverter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/SystemMsgConverter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.b.a$f */
    static final class C33908f extends Lambda implements Function0<SystemMsgConverter> {
        public static final C33908f INSTANCE = new C33908f();

        C33908f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SystemMsgConverter invoke() {
            return new SystemMsgConverter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/chatwindow/secretchat/data/convert/SecretTextMsgConverter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.b.a$g */
    static final class C33909g extends Lambda implements Function0<SecretTextMsgConverter> {
        public static final C33909g INSTANCE = new C33909g();

        C33909g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SecretTextMsgConverter invoke() {
            return new SecretTextMsgConverter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/UnKnownMsgConverter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.b.a$h */
    static final class C33910h extends Lambda implements Function0<UnKnownMsgConverter> {
        public static final C33910h INSTANCE = new C33910h();

        C33910h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UnKnownMsgConverter invoke() {
            return new UnKnownMsgConverter();
        }
    }

    /* renamed from: a */
    private final void m131227a(Map<Message.Type, List<IMsgVOConverter<?>>> map, IMsgVOConverter<?> dVar) {
        ArrayList arrayList = map.get(dVar.mo122452a());
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(dVar.mo122452a(), arrayList);
        }
        arrayList.add(dVar);
    }

    /* renamed from: a */
    public ChatMessageVO<ContentVO<?>> mo122490a(MessageInfo messageInfo, int i) {
        Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
        return m131226a(messageInfo, true);
    }

    public SecretChatDataMapper(boolean z, ITextLayoutPreCalculateLifeCycle cVar) {
        this.f87389j = z;
        this.f87390k = cVar;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36458af F = b.mo134507F();
        Intrinsics.checkExpressionValueIsNotNull(F, "ChatModuleInstanceHolder…pendency().openDependency");
        List<IOpenMessageCellFactory> b2 = F.mo134429b();
        if (!CollectionUtils.isEmpty(b2)) {
            for (IOpenMessageCellFactory dVar : b2) {
                if (dVar == null) {
                    Intrinsics.throwNpe();
                }
                m131227a(this.f87388i, new C33345b(dVar.mo120405b()));
            }
        }
        m131227a(this.f87388i, m131228b());
        m131227a(this.f87388i, m131229c());
        m131227a(this.f87388i, m131230d());
        m131227a(this.f87388i, m131231e());
        m131227a(this.f87388i, m131232f());
    }

    /* renamed from: a */
    private final ChatMessageVO<ContentVO<?>> m131226a(MessageInfo messageInfo, boolean z) {
        boolean z2;
        C33973b bVar;
        ITextLayoutPreCalculateLifeCycle cVar;
        String avatarKey;
        List<IMsgVOConverter<?>> list;
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        Message.Type type = message.getType();
        ChatChatter messageSender = messageInfo.getMessageSender();
        if (type == Message.Type.SYSTEM) {
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<SystemContent>()");
            ChatChatter fromChatter = ((SystemContent) content).getFromChatter();
            if (fromChatter != null) {
                messageSender = fromChatter;
            }
        }
        ChatChatter recallUser = messageInfo.getRecallUser();
        C33973b bVar2 = null;
        ContentVO aVar = null;
        String str = "";
        String str2 = str;
        if (message.getContent() != null && (list = this.f87388i.get(type)) != null) {
            Iterator<IMsgVOConverter<?>> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                IMsgVOConverter<?> next = it.next();
                MessageInfo messageInfo2 = messageInfo;
                ContentVO b = next.mo122453b(messageInfo2);
                if (b != null) {
                    str2 = next.mo122454c(messageInfo2);
                    aVar = b;
                    break;
                }
                aVar = b;
            }
        }
        if (aVar == null) {
            MessageInfo messageInfo3 = messageInfo;
            str2 = m131233g().mo122454c(messageInfo3);
            aVar = m131233g().mo122453b(messageInfo3);
        }
        ChatMessageVO<ContentVO<?>> cVar2 = null;
        boolean z3 = false;
        if (z && messageInfo.getParentMessageInfo() != null) {
            MessageInfo parentMessageInfo = messageInfo.getParentMessageInfo();
            Intrinsics.checkExpressionValueIsNotNull(parentMessageInfo, "messageInfo.parentMessageInfo");
            cVar2 = m131226a(parentMessageInfo, false);
        }
        if (!this.f87389j || !message.isFromMe()) {
            z2 = false;
        } else {
            z2 = true;
        }
        ChatMessageVO.Builder aVar2 = new ChatMessageVO.Builder();
        String id = message.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "message.id");
        String str3 = message.getcId();
        Intrinsics.checkExpressionValueIsNotNull(str3, "message.getcId()");
        Message.Type type2 = message.getType();
        Intrinsics.checkExpressionValueIsNotNull(type2, "message.type");
        String chatId = message.getChatId();
        Intrinsics.checkExpressionValueIsNotNull(chatId, "message.chatId");
        String fromId = message.getFromId();
        Intrinsics.checkExpressionValueIsNotNull(fromId, "message.fromId");
        ChatMessageVO.Builder aVar3 = (ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) aVar2.mo124162h(id)).mo124164i(str3)).mo124147a(type2)).mo124166j(chatId)).mo124168k(fromId);
        if (!(messageSender == null || (avatarKey = messageSender.getAvatarKey()) == null)) {
            str = avatarKey;
        }
        C33973b a = m131225a().mo122491a(messageSender);
        Intrinsics.checkExpressionValueIsNotNull(a, "chatterConverter.convert(messageSender)");
        SendStatus sendStatus = message.getSendStatus();
        Intrinsics.checkExpressionValueIsNotNull(sendStatus, "message.sendStatus");
        String rootId = message.getRootId();
        Intrinsics.checkExpressionValueIsNotNull(rootId, "message.rootId");
        ChatMessageVO.Builder a2 = ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) aVar3.mo124173m(str)).mo124145a(a)).mo124150a(aVar)).mo124288a(str2).mo124286a(cVar2).mo124179s(message.isFromMe())).mo124302e(message.isReEditable()).mo124181t(message.isRemoved())).mo124183u(message.isVisible())).mo124160g(message.getReplyCount())).mo124151b(message.getCreateTime())).mo124155e(message.getPosition())).mo124158f(message.getBadgeCount())).mo124185v(message.isBadged())).mo124146a(message.getStatus())).mo124149a(sendStatus)).mo124156e(messageInfo.getReactionInfoList())).mo124148a(messageInfo.getPin())).mo124289a(rootId);
        String parentId = message.getParentId();
        Intrinsics.checkExpressionValueIsNotNull(parentId, "message.parentId");
        ChatMessageVO.Builder a3 = a2.mo124294b(parentId).mo124290a(message.isDing()).mo124295b(message.isEphemeral()).mo124299c(!TextUtils.isEmpty(message.getParentSourceId())).mo124287a(messageInfo.getDingStatus()).mo124300d(message.getMeReadType()).mo124292b(message.getReadCount()).mo124296c(message.getUnReadCount()).mo124301d(message.isBurned()).mo124284a(message.getBurnLife()).mo124285a(message.getBurnTime());
        if (messageInfo.getOriginalSender() != null) {
            bVar = m131225a().mo122491a(messageInfo.getOriginalSender());
        } else {
            bVar = null;
        }
        ChatMessageVO.Builder f = a3.mo124297c(bVar).mo124298c(message.getOriginalSenderId()).mo124303f(message.isForwardFromFriend());
        if (recallUser != null) {
            bVar2 = m131225a().mo122491a(recallUser);
        }
        ChatMessageVO.Builder b2 = f.mo124293b(bVar2);
        if (message.getRecallerIdentity() == Message.RecallerIdentity.GROUP_ADMIN) {
            z3 = true;
        }
        ChatMessageVO<ContentVO<?>> a4 = b2.mo124304g(z3).mo124305h(z2).mo124291a();
        a4.mo124274d(messageInfo.isForceUpdate());
        if (a4.mo121710r() == Message.Type.TEXT && (cVar = this.f87390k) != null) {
            cVar.mo122455a(a4);
        }
        return a4;
    }
}
