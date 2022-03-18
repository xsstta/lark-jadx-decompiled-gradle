package com.ss.android.lark.chat.topnoticemessage.message;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.im.v1.ChatTopNotice;
import com.bytedance.lark.pb.im.v1.ChatTopNoticeContent;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.C29407b;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.AbstractC32810b;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.topnoticemessage.message.TopNoticeMsgType;
import com.ss.android.lark.chat.topnoticemessage.message.entity.AnnouncementTopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.message.entity.GeneralTopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.message.entity.ImageTopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.message.entity.StickerTopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.p1685c.C34320a;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J4\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u001e\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/message/TopNoticeMessage;", "", "()V", "NONE", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "getNONE", "()Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "chatterParser", "Lcom/ss/android/lark/chat/api/IChatterParser;", "kotlin.jvm.PlatformType", "getChatterParser", "()Lcom/ss/android/lark/chat/api/IChatterParser;", "chatterParser$delegate", "Lkotlin/Lazy;", "messageParser", "Lcom/ss/android/lark/chat/api/IMessageParser;", "getMessageParser", "()Lcom/ss/android/lark/chat/api/IMessageParser;", "messageParser$delegate", "createAnnouncement", "chatId", "", "notice", "Lcom/bytedance/lark/pb/im/v1/ChatTopNotice;", "createMessage", "createTopNoticeMessageByType", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/topnoticemessage/message/TopNoticeMsgType;", "digest", "", "noticeVersion", "", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "handleTopNoticeInfo", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.message.a */
public final class TopNoticeMessage {

    /* renamed from: a */
    public static final TopNoticeMessage f88632a = new TopNoticeMessage();

    /* renamed from: b */
    private static final ITopNoticeMessage<Object> f88633b = new C34324a();

    /* renamed from: c */
    private static final Lazy f88634c = LazyKt.lazy(C34325b.INSTANCE);

    /* renamed from: d */
    private static final Lazy f88635d = LazyKt.lazy(C34326c.INSTANCE);

    /* renamed from: b */
    private final IChatterParser m133071b() {
        return (IChatterParser) f88634c.getValue();
    }

    /* renamed from: c */
    private final AbstractC32810b m133073c() {
        return (AbstractC32810b) f88635d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/ss/android/lark/chat/topnoticemessage/message/TopNoticeMessage$NONE$1", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "()Ljava/lang/Object;", "digest", "", "getDigest", "()Ljava/lang/String;", "fromChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getFromChatter", "()Lcom/ss/android/lark/chat/entity/chatter/Chatter;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/topnoticemessage/message/TopNoticeMsgType;", "getType", "()Lcom/ss/android/lark/chat/topnoticemessage/message/TopNoticeMsgType;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "getVersion", "()I", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.message.a$a */
    public static final class C34324a implements ITopNoticeMessage<Object> {

        /* renamed from: a */
        private final Chatter f88636a = new Chatter();

        /* renamed from: b */
        private final TopNoticeMsgType f88637b = TopNoticeMsgType.Text;

        /* renamed from: c */
        private final String f88638c = "";

        /* renamed from: d */
        private final int f88639d = -1;

        /* renamed from: e */
        private final Object f88640e = Unit.INSTANCE;

        @Override // com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage
        /* renamed from: a */
        public Chatter mo126895a() {
            return this.f88636a;
        }

        @Override // com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage
        /* renamed from: b */
        public TopNoticeMsgType mo126896b() {
            return this.f88637b;
        }

        /* renamed from: c */
        public String mo126898d() {
            return this.f88638c;
        }

        @Override // com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage
        /* renamed from: e */
        public int mo126899e() {
            return this.f88639d;
        }

        @Override // com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage
        /* renamed from: f */
        public Object mo126900f() {
            return this.f88640e;
        }

        C34324a() {
        }
    }

    private TopNoticeMessage() {
    }

    /* renamed from: a */
    public final ITopNoticeMessage<Object> mo126894a() {
        return f88633b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/api/IChatterParser;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.message.a$b */
    static final class C34325b extends Lambda implements Function0<IChatterParser> {
        public static final C34325b INSTANCE = new C34325b();

        C34325b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final IChatterParser invoke() {
            C29407b a = C29990c.m110929a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder.getChatModule()");
            return a.mo104177A();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/api/IMessageParser;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.message.a$c */
    static final class C34326c extends Lambda implements Function0<AbstractC32810b> {
        public static final C34326c INSTANCE = new C34326c();

        C34326c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC32810b invoke() {
            C29407b a = C29990c.m110929a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder.getChatModule()");
            return a.mo104178B();
        }
    }

    /* renamed from: a */
    private final ITopNoticeMessage<?> m133068a(ChatTopNotice chatTopNotice) {
        C14928Entity entity;
        Long l;
        C14928Entity entity2;
        if (chatTopNotice.content != null) {
            ChatTopNoticeContent chatTopNoticeContent = chatTopNotice.content;
            Long l2 = null;
            if (chatTopNoticeContent != null) {
                entity = chatTopNoticeContent.entity;
            } else {
                entity = null;
            }
            if (entity != null) {
                ChatTopNoticeContent chatTopNoticeContent2 = chatTopNotice.content;
                if (chatTopNoticeContent2 != null) {
                    l = chatTopNoticeContent2.message_id;
                } else {
                    l = null;
                }
                if (C34320a.m133055a(l)) {
                    Chatter chatter = m133071b().getChatter(chatTopNotice.operator);
                    AbstractC32810b c = m133073c();
                    ChatTopNoticeContent chatTopNoticeContent3 = chatTopNotice.content;
                    if (chatTopNoticeContent3 != null) {
                        entity2 = chatTopNoticeContent3.entity;
                    } else {
                        entity2 = null;
                    }
                    ChatTopNoticeContent chatTopNoticeContent4 = chatTopNotice.content;
                    if (chatTopNoticeContent4 != null) {
                        l2 = chatTopNoticeContent4.message_id;
                    }
                    Message a = c.mo120945a(entity2, String.valueOf(l2));
                    TopNoticeMsgType.Companion aVar = TopNoticeMsgType.Companion;
                    Intrinsics.checkExpressionValueIsNotNull(a, "message");
                    TopNoticeMsgType a2 = aVar.mo126893a(a);
                    Intrinsics.checkExpressionValueIsNotNull(chatter, "chatter");
                    CharSequence a3 = C34320a.m133053a(a);
                    Integer num = chatTopNotice.notice_version;
                    Intrinsics.checkExpressionValueIsNotNull(num, "notice.notice_version");
                    return m133069a(chatter, a2, a3, num.intValue(), a);
                }
            }
        }
        return f88633b;
    }

    @JvmStatic
    /* renamed from: a */
    public static final ITopNoticeMessage<?> m133070a(String str, ChatTopNotice chatTopNotice) {
        ChatTopNoticeContent.ContentType contentType;
        ChatTopNoticeContent chatTopNoticeContent;
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        if (chatTopNotice == null || (chatTopNoticeContent = chatTopNotice.content) == null) {
            contentType = null;
        } else {
            contentType = chatTopNoticeContent.type;
        }
        if (contentType != null) {
            int i = C34327b.f88653a[contentType.ordinal()];
            if (i == 1) {
                return f88632a.m133068a(chatTopNotice);
            }
            if (i == 2) {
                return f88632a.m133072b(str, chatTopNotice);
            }
        }
        return f88633b;
    }

    /* renamed from: b */
    private final ITopNoticeMessage<?> m133072b(String str, ChatTopNotice chatTopNotice) {
        Chat.Announcement announcement;
        ChatTopNoticeContent chatTopNoticeContent = chatTopNotice.content;
        if (chatTopNoticeContent == null || (announcement = chatTopNoticeContent.announcement) == null) {
            return f88633b;
        }
        Intrinsics.checkExpressionValueIsNotNull(announcement, "notice.content?.announcement ?: return NONE");
        Chatter chatter = m133071b().getChatter(chatTopNotice.operator);
        Intrinsics.checkExpressionValueIsNotNull(chatter, "chatterParser.getChatter(notice.operator)");
        TopNoticeMsgType topNoticeMsgType = TopNoticeMsgType.Announcement;
        CharSequence a = C34320a.m133052a(announcement);
        Integer num = chatTopNotice.notice_version;
        Intrinsics.checkExpressionValueIsNotNull(num, "notice.notice_version");
        return new AnnouncementTopNoticeMessage(chatter, topNoticeMsgType, a, num.intValue(), C34320a.m133054a(announcement, str));
    }

    /* renamed from: a */
    private final ITopNoticeMessage<?> m133069a(Chatter chatter, TopNoticeMsgType topNoticeMsgType, CharSequence charSequence, int i, Message message) {
        int i2 = C34327b.f88654b[topNoticeMsgType.ordinal()];
        if (i2 == 1) {
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<ImageContent>()");
            Image b = C34336c.m133132b(((ImageContent) content).getImageSet());
            Intrinsics.checkExpressionValueIsNotNull(b, "image");
            return new ImageTopNoticeMessage(chatter, topNoticeMsgType, charSequence, i, message, b);
        } else if (i2 == 2) {
            Content content2 = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content2, "message.getContent<MediaContent>()");
            Image b2 = C34336c.m133132b(((MediaContent) content2).getImageSet());
            Intrinsics.checkExpressionValueIsNotNull(b2, "image");
            return new ImageTopNoticeMessage(chatter, topNoticeMsgType, charSequence, i, message, b2);
        } else if (i2 != 3) {
            return new GeneralTopNoticeMessage(chatter, topNoticeMsgType, charSequence, i, message);
        } else {
            return new StickerTopNoticeMessage(chatter, topNoticeMsgType, charSequence, i, message, ((StickerContent) message.getContent()).getKey());
        }
    }
}
