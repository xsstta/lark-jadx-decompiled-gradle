package com.ss.android.lark.chat.vo;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.Pin;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001EB\u0005¢\u0006\u0002\u0010\u0004J\b\u00108\u001a\u00020\u0006H&J\n\u00109\u001a\u0004\u0018\u00010\u0012H&J\n\u0010:\u001a\u0004\u0018\u00010\u000eH&J\b\u0010;\u001a\u00020\u0018H\u0016J\b\u0010<\u001a\u00020\u0006H\u0016J\u0014\u0010=\u001a\u00020\u00182\f\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000J\u0014\u0010?\u001a\u00020\u00182\f\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000J\u0006\u0010@\u001a\u00020\u0018J\b\u0010A\u001a\u00020\u0018H&J\b\u0010B\u001a\u00020\u0018H&J\u0010\u0010C\u001a\u00020\u00182\u0006\u0010D\u001a\u00020\nH&R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0012\u0010\u001b\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0012\u0010\u001c\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0018\u0010(\u001a\u00020\u0006X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\b\"\u0004\b*\u0010+R\u0012\u0010,\u001a\u00020-X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0012\u00100\u001a\u000201X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0012\u00104\u001a\u000205X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006F"}, d2 = {"Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "T", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "()V", "badgeCount", "", "getBadgeCount", "()I", "createTime", "", "getCreateTime", "()J", "fromAvatarKey", "", "getFromAvatarKey", "()Ljava/lang/String;", "fromChatter", "Lcom/ss/android/lark/chat/vo/ChatChatterVO;", "getFromChatter", "()Lcom/ss/android/lark/chat/vo/ChatChatterVO;", "fromName", "getFromName", "isBadged", "", "()Z", "isDeleted", "isRecalledByAdmin", "isVisible", "pin", "Lcom/ss/android/lark/chat/entity/message/Pin;", "getPin", "()Lcom/ss/android/lark/chat/entity/message/Pin;", "position", "getPosition", "reactionInfoList", "", "Lcom/ss/android/lark/chat/entity/reaction/ReactionInfo;", "getReactionInfoList", "()Ljava/util/List;", "replyCount", "getReplyCount", "setReplyCount", "(I)V", "sendStatus", "Lcom/ss/android/lark/chat/entity/message/SendStatus;", "getSendStatus", "()Lcom/ss/android/lark/chat/entity/message/SendStatus;", UpdateKey.STATUS, "Lcom/ss/android/lark/chat/entity/message/Message$Status;", "getStatus", "()Lcom/ss/android/lark/chat/entity/message/Message$Status;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "getType", "()Lcom/ss/android/lark/chat/entity/message/Message$Type;", "getReadState", "getRecallChatterVO", "getRootId", "hasReaction", "hashCode", "isContentSame", "diffable", "isItemSame", "isPreMessage", "isReEditable", "isSecret", "needBurned", "ntpTime", "Builder", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.e.a */
public abstract class AbsMessageVO<T extends ContentVO<?>> implements OpenMessageVO<T> {
    /* renamed from: A */
    public abstract Message.Status mo121655A();

    /* renamed from: B */
    public abstract SendStatus mo121656B();

    /* renamed from: C */
    public abstract C33973b mo121657C();

    /* renamed from: D */
    public abstract List<ReactionInfo> mo121658D();

    /* renamed from: E */
    public abstract Pin mo121659E();

    /* renamed from: F */
    public abstract boolean mo121660F();

    /* renamed from: a */
    public abstract boolean mo121683a(long j);

    /* renamed from: h */
    public abstract String mo121700h();

    /* renamed from: j */
    public abstract int mo121702j();

    /* renamed from: k */
    public abstract boolean mo121703k();

    /* renamed from: l */
    public abstract C33973b mo121704l();

    /* renamed from: n */
    public abstract boolean mo121706n();

    /* renamed from: r */
    public abstract Message.Type mo121710r();

    /* renamed from: t */
    public abstract String mo121712t();

    /* renamed from: u */
    public abstract boolean mo121713u();

    /* renamed from: v */
    public abstract boolean mo121714v();

    /* renamed from: w */
    public abstract int mo121715w();

    /* renamed from: x */
    public abstract long mo121716x();

    /* renamed from: y */
    public abstract int mo121717y();

    /* renamed from: z */
    public abstract int mo121718z();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000*\f\b\u0001\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\u0010\b\u0002\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0004*\u001c\b\u0003\u0010\u0005 \u0001*\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\u00002\u00020\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00028\u00032\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010eJ\r\u0010f\u001a\u00028\u0002H&¢\u0006\u0002\u0010gJ\u0013\u0010\u000e\u001a\u00028\u00032\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010hJ\u0013\u0010\u0014\u001a\u00028\u00032\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0002\u0010hJ\u0013\u0010\u0017\u001a\u00028\u00032\u0006\u0010\u0017\u001a\u00028\u0001¢\u0006\u0002\u0010iJ\u0013\u0010\u001d\u001a\u00028\u00032\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010jJ\u0013\u0010#\u001a\u00028\u00032\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0002\u0010hJ\u0013\u0010&\u001a\u00028\u00032\u0006\u0010&\u001a\u00020'¢\u0006\u0002\u0010kJ\u0013\u0010,\u001a\u00028\u00032\u0006\u0010,\u001a\u00020\u000f¢\u0006\u0002\u0010hJ\u0013\u0010/\u001a\u00028\u00032\u0006\u0010/\u001a\u00020\u000f¢\u0006\u0002\u0010hJ\u0013\u00102\u001a\u00028\u00032\u0006\u00102\u001a\u00020\u000f¢\u0006\u0002\u0010hJ\u0013\u00105\u001a\u00028\u00032\u0006\u00105\u001a\u000206¢\u0006\u0002\u0010lJ\u0013\u0010:\u001a\u00028\u00032\u0006\u0010:\u001a\u000206¢\u0006\u0002\u0010lJ\u0013\u0010<\u001a\u00028\u00032\u0006\u0010<\u001a\u000206¢\u0006\u0002\u0010lJ\u0013\u0010>\u001a\u00028\u00032\u0006\u0010>\u001a\u000206¢\u0006\u0002\u0010lJ\u0015\u0010@\u001a\u00028\u00032\b\u0010@\u001a\u0004\u0018\u00010A¢\u0006\u0002\u0010mJ\u0013\u0010F\u001a\u00028\u00032\u0006\u0010F\u001a\u00020\t¢\u0006\u0002\u0010eJ\u001b\u0010I\u001a\u00028\u00032\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J¢\u0006\u0002\u0010nJ\u0013\u0010P\u001a\u00028\u00032\u0006\u0010P\u001a\u00020\t¢\u0006\u0002\u0010eJ\u0013\u0010S\u001a\u00028\u00032\u0006\u0010S\u001a\u00020T¢\u0006\u0002\u0010oJ\u0015\u0010Y\u001a\u00028\u00032\b\u0010Y\u001a\u0004\u0018\u00010Z¢\u0006\u0002\u0010pJ\u0013\u0010_\u001a\u00028\u00032\u0006\u0010_\u001a\u00020`¢\u0006\u0002\u0010qR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001e\u0010\u0017\u001a\u0004\u0018\u00018\u0001X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010\u0013R\u001a\u0010/\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0011\"\u0004\b1\u0010\u0013R\u001c\u00102\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0011\"\u0004\b4\u0010\u0013R\u001a\u00105\u001a\u000206X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u000206X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00107\"\u0004\b;\u00109R\u001a\u0010<\u001a\u000206X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00107\"\u0004\b=\u00109R\u001a\u0010>\u001a\u000206X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00107\"\u0004\b?\u00109R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u000b\"\u0004\bH\u0010\rR\"\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010JX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u000b\"\u0004\bR\u0010\rR\u001a\u0010S\u001a\u00020TX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010Y\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001c\u0010_\u001a\u0004\u0018\u00010`X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d¨\u0006r"}, d2 = {"Lcom/ss/android/lark/chat/vo/AbsMessageVO$Builder;", "C", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "T", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "B", "", "()V", "badgeCount", "", "getBadgeCount", "()I", "setBadgeCount", "(I)V", "cId", "", "getCId", "()Ljava/lang/String;", "setCId", "(Ljava/lang/String;)V", "chatId", "getChatId", "setChatId", "contentVO", "getContentVO", "()Lcom/ss/android/lark/chat/export/vo/ContentVO;", "setContentVO", "(Lcom/ss/android/lark/chat/export/vo/ContentVO;)V", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "createTime", "", "getCreateTime", "()J", "setCreateTime", "(J)V", "fromAvatarKey", "getFromAvatarKey", "setFromAvatarKey", "fromChatter", "Lcom/ss/android/lark/chat/vo/ChatChatterVO;", "getFromChatter", "()Lcom/ss/android/lark/chat/vo/ChatChatterVO;", "setFromChatter", "(Lcom/ss/android/lark/chat/vo/ChatChatterVO;)V", "fromId", "getFromId", "setFromId", "fromName", "getFromName", "setFromName", "id", "getId", "setId", "isBadged", "", "()Z", "setBadged", "(Z)V", "isDeleted", "setDeleted", "isFromMe", "setFromMe", "isVisible", "setVisible", "pin", "Lcom/ss/android/lark/chat/entity/message/Pin;", "getPin", "()Lcom/ss/android/lark/chat/entity/message/Pin;", "setPin", "(Lcom/ss/android/lark/chat/entity/message/Pin;)V", "position", "getPosition", "setPosition", "reactionInfoList", "", "Lcom/ss/android/lark/chat/entity/reaction/ReactionInfo;", "getReactionInfoList", "()Ljava/util/List;", "setReactionInfoList", "(Ljava/util/List;)V", "replyCount", "getReplyCount", "setReplyCount", "sendStatus", "Lcom/ss/android/lark/chat/entity/message/SendStatus;", "getSendStatus", "()Lcom/ss/android/lark/chat/entity/message/SendStatus;", "setSendStatus", "(Lcom/ss/android/lark/chat/entity/message/SendStatus;)V", UpdateKey.STATUS, "Lcom/ss/android/lark/chat/entity/message/Message$Status;", "getStatus", "()Lcom/ss/android/lark/chat/entity/message/Message$Status;", "setStatus", "(Lcom/ss/android/lark/chat/entity/message/Message$Status;)V", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "getType", "()Lcom/ss/android/lark/chat/entity/message/Message$Type;", "setType", "(Lcom/ss/android/lark/chat/entity/message/Message$Type;)V", "(I)Lcom/ss/android/lark/chat/vo/AbsMessageVO$Builder;", "build", "()Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "(Ljava/lang/String;)Lcom/ss/android/lark/chat/vo/AbsMessageVO$Builder;", "(Lcom/ss/android/lark/chat/export/vo/ContentVO;)Lcom/ss/android/lark/chat/vo/AbsMessageVO$Builder;", "(J)Lcom/ss/android/lark/chat/vo/AbsMessageVO$Builder;", "(Lcom/ss/android/lark/chat/vo/ChatChatterVO;)Lcom/ss/android/lark/chat/vo/AbsMessageVO$Builder;", "(Z)Lcom/ss/android/lark/chat/vo/AbsMessageVO$Builder;", "(Lcom/ss/android/lark/chat/entity/message/Pin;)Lcom/ss/android/lark/chat/vo/AbsMessageVO$Builder;", "(Ljava/util/List;)Lcom/ss/android/lark/chat/vo/AbsMessageVO$Builder;", "(Lcom/ss/android/lark/chat/entity/message/SendStatus;)Lcom/ss/android/lark/chat/vo/AbsMessageVO$Builder;", "(Lcom/ss/android/lark/chat/entity/message/Message$Status;)Lcom/ss/android/lark/chat/vo/AbsMessageVO$Builder;", "(Lcom/ss/android/lark/chat/entity/message/Message$Type;)Lcom/ss/android/lark/chat/vo/AbsMessageVO$Builder;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.e.a$a */
    public static abstract class Builder<C extends ContentVO<?>, T extends AbsMessageVO<C>, B extends Builder<C, ? extends T, ? extends B>> {

        /* renamed from: a */
        private String f87594a;

        /* renamed from: b */
        private String f87595b;

        /* renamed from: c */
        private Message.Type f87596c;

        /* renamed from: d */
        private String f87597d;

        /* renamed from: e */
        private String f87598e;

        /* renamed from: f */
        private String f87599f = "";

        /* renamed from: g */
        private String f87600g = "";

        /* renamed from: h */
        private boolean f87601h;

        /* renamed from: i */
        private boolean f87602i;

        /* renamed from: j */
        private boolean f87603j;

        /* renamed from: k */
        private int f87604k;

        /* renamed from: l */
        private long f87605l;

        /* renamed from: m */
        private int f87606m;

        /* renamed from: n */
        private int f87607n;

        /* renamed from: o */
        private boolean f87608o;

        /* renamed from: p */
        private Message.Status f87609p = Message.Status.NORMAL;

        /* renamed from: q */
        private SendStatus f87610q = SendStatus.SUCCESS;

        /* renamed from: r */
        private C33973b f87611r;

        /* renamed from: s */
        private List<? extends ReactionInfo> f87612s;

        /* renamed from: t */
        private C f87613t;

        /* renamed from: u */
        private Pin f87614u;

        /* renamed from: b */
        public final String mo124152b() {
            return this.f87594a;
        }

        /* renamed from: c */
        public final String mo124153c() {
            return this.f87595b;
        }

        /* renamed from: d */
        public final Message.Type mo124154d() {
            return this.f87596c;
        }

        /* renamed from: e */
        public final String mo124157e() {
            return this.f87597d;
        }

        /* renamed from: f */
        public final String mo124159f() {
            return this.f87598e;
        }

        /* renamed from: g */
        public final String mo124161g() {
            return this.f87599f;
        }

        /* renamed from: h */
        public final String mo124163h() {
            return this.f87600g;
        }

        /* renamed from: i */
        public final boolean mo124165i() {
            return this.f87601h;
        }

        /* renamed from: j */
        public final boolean mo124167j() {
            return this.f87602i;
        }

        /* renamed from: k */
        public final boolean mo124169k() {
            return this.f87603j;
        }

        /* renamed from: l */
        public final int mo124170l() {
            return this.f87604k;
        }

        /* renamed from: m */
        public final long mo124172m() {
            return this.f87605l;
        }

        /* renamed from: n */
        public final int mo124174n() {
            return this.f87606m;
        }

        /* renamed from: o */
        public final int mo124175o() {
            return this.f87607n;
        }

        /* renamed from: p */
        public final boolean mo124176p() {
            return this.f87608o;
        }

        /* renamed from: q */
        public final Message.Status mo124177q() {
            return this.f87609p;
        }

        /* renamed from: r */
        public final SendStatus mo124178r() {
            return this.f87610q;
        }

        /* renamed from: s */
        public final C33973b mo124180s() {
            return this.f87611r;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.chat.entity.reaction.ReactionInfo>, java.util.List<com.ss.android.lark.chat.entity.reaction.ReactionInfo> */
        /* renamed from: t */
        public final List<ReactionInfo> mo124182t() {
            return this.f87612s;
        }

        /* renamed from: u */
        public final C mo124184u() {
            return this.f87613t;
        }

        /* renamed from: v */
        public final Pin mo124186v() {
            return this.f87614u;
        }

        /* renamed from: a */
        public final B mo124146a(Message.Status status) {
            Builder<C, T, B> aVar = this;
            aVar.f87609p = status;
            return aVar;
        }

        /* renamed from: b */
        public final B mo124151b(long j) {
            Builder<C, T, B> aVar = this;
            aVar.f87605l = j;
            return aVar;
        }

        /* renamed from: e */
        public final B mo124155e(int i) {
            Builder<C, T, B> aVar = this;
            aVar.f87606m = i;
            return aVar;
        }

        /* renamed from: f */
        public final B mo124158f(int i) {
            Builder<C, T, B> aVar = this;
            aVar.f87607n = i;
            return aVar;
        }

        /* renamed from: g */
        public final B mo124160g(int i) {
            Builder<C, T, B> aVar = this;
            aVar.f87604k = i;
            return aVar;
        }

        /* renamed from: s */
        public final B mo124179s(boolean z) {
            Builder<C, T, B> aVar = this;
            aVar.f87601h = z;
            return aVar;
        }

        /* renamed from: t */
        public final B mo124181t(boolean z) {
            Builder<C, T, B> aVar = this;
            aVar.f87602i = z;
            return aVar;
        }

        /* renamed from: u */
        public final B mo124183u(boolean z) {
            Builder<C, T, B> aVar = this;
            aVar.f87603j = z;
            return aVar;
        }

        /* renamed from: v */
        public final B mo124185v(boolean z) {
            Builder<C, T, B> aVar = this;
            aVar.f87608o = z;
            return aVar;
        }

        /* renamed from: a */
        public final B mo124145a(C33973b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "fromChatter");
            Builder<C, T, B> aVar = this;
            aVar.f87611r = bVar;
            return aVar;
        }

        /* renamed from: e */
        public final B mo124156e(List<? extends ReactionInfo> list) {
            Builder<C, T, B> aVar = this;
            aVar.f87612s = list;
            return aVar;
        }

        /* renamed from: h */
        public final B mo124162h(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Builder<C, T, B> aVar = this;
            aVar.f87594a = str;
            return aVar;
        }

        /* renamed from: i */
        public final B mo124164i(String str) {
            Intrinsics.checkParameterIsNotNull(str, "cId");
            Builder<C, T, B> aVar = this;
            aVar.f87595b = str;
            return aVar;
        }

        /* renamed from: j */
        public final B mo124166j(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Builder<C, T, B> aVar = this;
            aVar.f87597d = str;
            return aVar;
        }

        /* renamed from: k */
        public final B mo124168k(String str) {
            Intrinsics.checkParameterIsNotNull(str, "fromId");
            Builder<C, T, B> aVar = this;
            aVar.f87598e = str;
            return aVar;
        }

        /* renamed from: l */
        public final B mo124171l(String str) {
            Intrinsics.checkParameterIsNotNull(str, "fromName");
            Builder<C, T, B> aVar = this;
            aVar.f87599f = str;
            return aVar;
        }

        /* renamed from: m */
        public final B mo124173m(String str) {
            Intrinsics.checkParameterIsNotNull(str, "fromAvatarKey");
            Builder<C, T, B> aVar = this;
            aVar.f87600g = str;
            return aVar;
        }

        /* renamed from: a */
        public final B mo124147a(Message.Type type) {
            Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
            Builder<C, T, B> aVar = this;
            aVar.f87596c = type;
            return aVar;
        }

        /* renamed from: a */
        public final B mo124148a(Pin pin) {
            Builder<C, T, B> aVar = this;
            aVar.f87614u = pin;
            return aVar;
        }

        /* renamed from: a */
        public final B mo124149a(SendStatus sendStatus) {
            Intrinsics.checkParameterIsNotNull(sendStatus, "sendStatus");
            Builder<C, T, B> aVar = this;
            aVar.f87610q = sendStatus;
            return aVar;
        }

        /* renamed from: a */
        public final B mo124150a(C c) {
            Intrinsics.checkParameterIsNotNull(c, "contentVO");
            Builder<C, T, B> aVar = this;
            aVar.f87613t = c;
            return aVar;
        }
    }

    public final boolean ai() {
        return Intrinsics.areEqual(mo121681a(), mo121696d());
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    public boolean ah() {
        if (CollectionUtils.isEmpty(mo121658D())) {
            return false;
        }
        List<ReactionInfo> D = mo121658D();
        if (D == null) {
            Intrinsics.throwNpe();
        }
        for (ReactionInfo reactionInfo : D) {
            Reaction reaction = reactionInfo.getReaction();
            Intrinsics.checkExpressionValueIsNotNull(reaction, "reactionInfo.reaction");
            if (reaction.getCount() > 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num;
        Integer num2;
        String a = mo121681a();
        Integer num3 = null;
        if (a != null) {
            num = Integer.valueOf(a.hashCode());
        } else {
            num = null;
        }
        int intValue = num.intValue() * 31;
        String b = mo121692b();
        if (b != null) {
            num2 = Integer.valueOf(b.hashCode());
        } else {
            num2 = null;
        }
        int intValue2 = (intValue + num2.intValue()) * 31;
        String d = mo121696d();
        if (d != null) {
            num3 = Integer.valueOf(d.hashCode());
        }
        return intValue2 + num3.intValue();
    }

    /* renamed from: a */
    public final boolean mo124140a(AbsMessageVO<?> aVar) {
        if (aVar == null || (!Intrinsics.areEqual(this, aVar) && !Intrinsics.areEqual(mo121696d(), aVar.mo121696d()))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo124143b(AbsMessageVO<?> aVar) {
        Boolean bool;
        if (aVar == null || !mo124140a(aVar) || mo121710r() != aVar.mo121710r() || !C26247a.m94983b(mo121657C(), aVar.mo121657C()) || !C26247a.m94981a(mo121712t(), aVar.mo121712t()) || mo121698f() != aVar.mo121698f() || mo121713u() != aVar.mo121713u() || mo121714v() != aVar.mo121714v() || mo121715w() != aVar.mo121715w() || mo121655A() != aVar.mo121655A() || mo121656B() != aVar.mo121656B() || !C26247a.m94983b(mo121659E(), aVar.mo121659E()) || !C26247a.m94982a((List) mo121658D(), (List) aVar.mo121658D())) {
            return false;
        }
        T g = mo121699g();
        if (g != null) {
            bool = Boolean.valueOf(g.mo121780a(aVar.mo121699g()));
        } else {
            bool = null;
        }
        if (bool.booleanValue()) {
            return true;
        }
        return false;
    }
}
