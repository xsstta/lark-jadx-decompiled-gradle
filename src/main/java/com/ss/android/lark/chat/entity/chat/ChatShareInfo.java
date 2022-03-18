package com.ss.android.lark.chat.entity.chat;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\b^_`abcdeB\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010T\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010U\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jª\u0001\u0010V\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010WJ\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\\HÖ\u0001J\t\u0010]\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\"\"\u0004\bD\u0010$R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006f"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo;", "", "id", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareType;", UpdateKey.STATUS, "Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareStatus;", "shareTargetType", "Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareTargetType;", "shareChatId", "token", "createTime", "", "expireTime", "shareChatterExtra", "Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareChatterExtra;", "qrCodeExtra", "Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$QrCodeExtra;", "targetDocExtra", "Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetDocExtra;", "targetChatExtra", "Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetChatExtra;", "targetChatterExtra", "Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetChatterExtra;", "(Ljava/lang/String;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareType;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareStatus;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareTargetType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareChatterExtra;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$QrCodeExtra;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetDocExtra;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetChatExtra;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetChatterExtra;)V", "getCreateTime", "()Ljava/lang/Long;", "setCreateTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getExpireTime", "setExpireTime", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getQrCodeExtra", "()Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$QrCodeExtra;", "setQrCodeExtra", "(Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$QrCodeExtra;)V", "getShareChatId", "setShareChatId", "getShareChatterExtra", "()Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareChatterExtra;", "setShareChatterExtra", "(Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareChatterExtra;)V", "getShareTargetType", "()Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareTargetType;", "setShareTargetType", "(Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareTargetType;)V", "getStatus", "()Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareStatus;", "setStatus", "(Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareStatus;)V", "getTargetChatExtra", "()Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetChatExtra;", "setTargetChatExtra", "(Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetChatExtra;)V", "getTargetChatterExtra", "()Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetChatterExtra;", "setTargetChatterExtra", "(Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetChatterExtra;)V", "getTargetDocExtra", "()Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetDocExtra;", "setTargetDocExtra", "(Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetDocExtra;)V", "getToken", "setToken", "getType", "()Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareType;", "setType", "(Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareType;)V", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareType;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareStatus;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareTargetType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareChatterExtra;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$QrCodeExtra;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetDocExtra;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetChatExtra;Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetChatterExtra;)Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo;", "equals", "", "other", "hashCode", "", "toString", "QrCodeExtra", "ShareChatterExtra", "ShareStatus", "ShareTargetType", "ShareType", "TargetChatExtra", "TargetChatterExtra", "TargetDocExtra", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatShareInfo {

    /* renamed from: a */
    private String f87744a;

    /* renamed from: b */
    private ShareType f87745b;

    /* renamed from: c */
    private ShareStatus f87746c;

    /* renamed from: d */
    private ShareTargetType f87747d;

    /* renamed from: e */
    private String f87748e;

    /* renamed from: f */
    private String f87749f;

    /* renamed from: g */
    private Long f87750g;

    /* renamed from: h */
    private Long f87751h;

    /* renamed from: i */
    private ShareChatterExtra f87752i;

    /* renamed from: j */
    private QrCodeExtra f87753j;

    /* renamed from: k */
    private TargetDocExtra f87754k;

    /* renamed from: l */
    private TargetChatExtra f87755l;

    /* renamed from: m */
    private TargetChatterExtra f87756m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareStatus;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN_STATE", "ACTIVE", "EXPIRED", "DEACTIVATED", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ShareStatus {
        UNKNOWN_STATE(0),
        ACTIVE(1),
        EXPIRED(2),
        DEACTIVATED(3);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareStatus$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareStatus;", "value", "", "valueOf", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.chat.ChatShareInfo$ShareStatus$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ShareStatus mo124657a(int i) {
                return mo124658b(i);
            }

            /* renamed from: b */
            public final ShareStatus mo124658b(int i) {
                if (i == 1) {
                    return ShareStatus.ACTIVE;
                }
                if (i == 2) {
                    return ShareStatus.EXPIRED;
                }
                if (i != 3) {
                    return ShareStatus.UNKNOWN_STATE;
                }
                return ShareStatus.DEACTIVATED;
            }
        }

        public final int getValue() {
            return this.value;
        }

        private ShareStatus(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareTargetType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN_TARGET_TYPE", "TARGET_CHAT", "TARGET_CHATTER", "TARGET_QRCODE", "TARGET_DOC", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ShareTargetType {
        UNKNOWN_TARGET_TYPE(0),
        TARGET_CHAT(1),
        TARGET_CHATTER(2),
        TARGET_QRCODE(3),
        TARGET_DOC(4);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareTargetType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareTargetType;", "value", "", "valueOf", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.chat.ChatShareInfo$ShareTargetType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ShareTargetType mo124660a(int i) {
                if (i == 1) {
                    return ShareTargetType.TARGET_CHAT;
                }
                if (i == 2) {
                    return ShareTargetType.TARGET_CHATTER;
                }
                if (i == 3) {
                    return ShareTargetType.TARGET_QRCODE;
                }
                if (i != 4) {
                    return ShareTargetType.UNKNOWN_TARGET_TYPE;
                }
                return ShareTargetType.TARGET_DOC;
            }
        }

        public final int getValue() {
            return this.value;
        }

        private ShareTargetType(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN_TYPE", "CARD_MESSAGE", "QRCODE", "CARD_DOC", "LINK", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ShareType {
        UNKNOWN_TYPE(0),
        CARD_MESSAGE(1),
        QRCODE(2),
        CARD_DOC(3),
        LINK(4);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareType;", "value", "", "valueOf", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.chat.ChatShareInfo$ShareType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ShareType mo124662a(int i) {
                if (i == 1) {
                    return ShareType.CARD_MESSAGE;
                }
                if (i == 2) {
                    return ShareType.QRCODE;
                }
                if (i == 3) {
                    return ShareType.CARD_DOC;
                }
                if (i != 4) {
                    return ShareType.UNKNOWN_TYPE;
                }
                return ShareType.LINK;
            }
        }

        public final int getValue() {
            return this.value;
        }

        private ShareType(int i) {
            this.value = i;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatShareInfo)) {
            return false;
        }
        ChatShareInfo chatShareInfo = (ChatShareInfo) obj;
        return Intrinsics.areEqual(this.f87744a, chatShareInfo.f87744a) && Intrinsics.areEqual(this.f87745b, chatShareInfo.f87745b) && Intrinsics.areEqual(this.f87746c, chatShareInfo.f87746c) && Intrinsics.areEqual(this.f87747d, chatShareInfo.f87747d) && Intrinsics.areEqual(this.f87748e, chatShareInfo.f87748e) && Intrinsics.areEqual(this.f87749f, chatShareInfo.f87749f) && Intrinsics.areEqual(this.f87750g, chatShareInfo.f87750g) && Intrinsics.areEqual(this.f87751h, chatShareInfo.f87751h) && Intrinsics.areEqual(this.f87752i, chatShareInfo.f87752i) && Intrinsics.areEqual(this.f87753j, chatShareInfo.f87753j) && Intrinsics.areEqual(this.f87754k, chatShareInfo.f87754k) && Intrinsics.areEqual(this.f87755l, chatShareInfo.f87755l) && Intrinsics.areEqual(this.f87756m, chatShareInfo.f87756m);
    }

    public int hashCode() {
        String str = this.f87744a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ShareType shareType = this.f87745b;
        int hashCode2 = (hashCode + (shareType != null ? shareType.hashCode() : 0)) * 31;
        ShareStatus shareStatus = this.f87746c;
        int hashCode3 = (hashCode2 + (shareStatus != null ? shareStatus.hashCode() : 0)) * 31;
        ShareTargetType shareTargetType = this.f87747d;
        int hashCode4 = (hashCode3 + (shareTargetType != null ? shareTargetType.hashCode() : 0)) * 31;
        String str2 = this.f87748e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f87749f;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Long l = this.f87750g;
        int hashCode7 = (hashCode6 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.f87751h;
        int hashCode8 = (hashCode7 + (l2 != null ? l2.hashCode() : 0)) * 31;
        ShareChatterExtra bVar = this.f87752i;
        int hashCode9 = (hashCode8 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        QrCodeExtra aVar = this.f87753j;
        int hashCode10 = (hashCode9 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        TargetDocExtra eVar = this.f87754k;
        int hashCode11 = (hashCode10 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        TargetChatExtra cVar = this.f87755l;
        int hashCode12 = (hashCode11 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        TargetChatterExtra dVar = this.f87756m;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode12 + i;
    }

    public String toString() {
        return "ChatShareInfo(id=" + this.f87744a + ", type=" + this.f87745b + ", status=" + this.f87746c + ", shareTargetType=" + this.f87747d + ", shareChatId=" + this.f87748e + ", token=" + this.f87749f + ", createTime=" + this.f87750g + ", expireTime=" + this.f87751h + ", shareChatterExtra=" + this.f87752i + ", qrCodeExtra=" + this.f87753j + ", targetDocExtra=" + this.f87754k + ", targetChatExtra=" + this.f87755l + ", targetChatterExtra=" + this.f87756m + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$ShareChatterExtra;", "", "shareChatterId", "", "name", "avatarKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "(Ljava/lang/String;)V", "getName", "setName", "getShareChatterId", "setShareChatterId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chat.ChatShareInfo$b */
    public static final class ShareChatterExtra {

        /* renamed from: a */
        private String f87758a;

        /* renamed from: b */
        private String f87759b;

        /* renamed from: c */
        private String f87760c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShareChatterExtra)) {
                return false;
            }
            ShareChatterExtra bVar = (ShareChatterExtra) obj;
            return Intrinsics.areEqual(this.f87758a, bVar.f87758a) && Intrinsics.areEqual(this.f87759b, bVar.f87759b) && Intrinsics.areEqual(this.f87760c, bVar.f87760c);
        }

        public int hashCode() {
            String str = this.f87758a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f87759b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f87760c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "ShareChatterExtra(shareChatterId=" + this.f87758a + ", name=" + this.f87759b + ", avatarKey=" + this.f87760c + ")";
        }

        /* renamed from: a */
        public final String mo124666a() {
            return this.f87758a;
        }

        /* renamed from: b */
        public final String mo124667b() {
            return this.f87759b;
        }

        /* renamed from: c */
        public final String mo124668c() {
            return this.f87760c;
        }

        public ShareChatterExtra(String str, String str2, String str3) {
            this.f87758a = str;
            this.f87759b = str2;
            this.f87760c = str3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetChatExtra;", "", "chatId", "", "chatName", "(Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getChatName", "setChatName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chat.ChatShareInfo$c */
    public static final class TargetChatExtra {

        /* renamed from: a */
        private String f87761a;

        /* renamed from: b */
        private String f87762b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TargetChatExtra)) {
                return false;
            }
            TargetChatExtra cVar = (TargetChatExtra) obj;
            return Intrinsics.areEqual(this.f87761a, cVar.f87761a) && Intrinsics.areEqual(this.f87762b, cVar.f87762b);
        }

        public int hashCode() {
            String str = this.f87761a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f87762b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "TargetChatExtra(chatId=" + this.f87761a + ", chatName=" + this.f87762b + ")";
        }

        /* renamed from: a */
        public final String mo124672a() {
            return this.f87761a;
        }

        /* renamed from: b */
        public final String mo124673b() {
            return this.f87762b;
        }

        public TargetChatExtra(String str, String str2) {
            this.f87761a = str;
            this.f87762b = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetChatterExtra;", "", BottomDialog.f17198f, "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getChatterId", "()Ljava/lang/String;", "setChatterId", "(Ljava/lang/String;)V", "getName", "setName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chat.ChatShareInfo$d */
    public static final class TargetChatterExtra {

        /* renamed from: a */
        private String f87763a;

        /* renamed from: b */
        private String f87764b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TargetChatterExtra)) {
                return false;
            }
            TargetChatterExtra dVar = (TargetChatterExtra) obj;
            return Intrinsics.areEqual(this.f87763a, dVar.f87763a) && Intrinsics.areEqual(this.f87764b, dVar.f87764b);
        }

        public int hashCode() {
            String str = this.f87763a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f87764b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "TargetChatterExtra(chatterId=" + this.f87763a + ", name=" + this.f87764b + ")";
        }

        /* renamed from: a */
        public final String mo124677a() {
            return this.f87763a;
        }

        /* renamed from: b */
        public final String mo124678b() {
            return this.f87764b;
        }

        public TargetChatterExtra(String str, String str2) {
            this.f87763a = str;
            this.f87764b = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J7\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$TargetDocExtra;", "", "docUrl", "", "docName", "docType", "Lcom/ss/android/lark/doc/entity/DocType;", "unauthorized", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/doc/entity/DocType;Z)V", "getDocName", "()Ljava/lang/String;", "setDocName", "(Ljava/lang/String;)V", "getDocType", "()Lcom/ss/android/lark/doc/entity/DocType;", "setDocType", "(Lcom/ss/android/lark/doc/entity/DocType;)V", "getDocUrl", "setDocUrl", "getUnauthorized", "()Z", "setUnauthorized", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chat.ChatShareInfo$e */
    public static final class TargetDocExtra {

        /* renamed from: a */
        private String f87765a;

        /* renamed from: b */
        private String f87766b;

        /* renamed from: c */
        private DocType f87767c;

        /* renamed from: d */
        private boolean f87768d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TargetDocExtra)) {
                return false;
            }
            TargetDocExtra eVar = (TargetDocExtra) obj;
            return Intrinsics.areEqual(this.f87765a, eVar.f87765a) && Intrinsics.areEqual(this.f87766b, eVar.f87766b) && Intrinsics.areEqual(this.f87767c, eVar.f87767c) && this.f87768d == eVar.f87768d;
        }

        public int hashCode() {
            String str = this.f87765a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f87766b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            DocType docType = this.f87767c;
            if (docType != null) {
                i = docType.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f87768d;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public String toString() {
            return "TargetDocExtra(docUrl=" + this.f87765a + ", docName=" + this.f87766b + ", docType=" + this.f87767c + ", unauthorized=" + this.f87768d + ")";
        }

        /* renamed from: a */
        public final String mo124682a() {
            return this.f87765a;
        }

        /* renamed from: b */
        public final String mo124683b() {
            return this.f87766b;
        }

        /* renamed from: c */
        public final DocType mo124684c() {
            return this.f87767c;
        }

        /* renamed from: d */
        public final boolean mo124685d() {
            return this.f87768d;
        }

        public TargetDocExtra(String str, String str2, DocType docType, boolean z) {
            this.f87765a = str;
            this.f87766b = str2;
            this.f87767c = docType;
            this.f87768d = z;
        }
    }

    /* renamed from: a */
    public final String mo124641a() {
        return this.f87744a;
    }

    /* renamed from: b */
    public final ShareType mo124643b() {
        return this.f87745b;
    }

    /* renamed from: c */
    public final ShareStatus mo124644c() {
        return this.f87746c;
    }

    /* renamed from: d */
    public final ShareTargetType mo124645d() {
        return this.f87747d;
    }

    /* renamed from: e */
    public final String mo124646e() {
        return this.f87749f;
    }

    /* renamed from: f */
    public final Long mo124648f() {
        return this.f87750g;
    }

    /* renamed from: g */
    public final Long mo124649g() {
        return this.f87751h;
    }

    /* renamed from: h */
    public final ShareChatterExtra mo124650h() {
        return this.f87752i;
    }

    /* renamed from: i */
    public final TargetDocExtra mo124652i() {
        return this.f87754k;
    }

    /* renamed from: j */
    public final TargetChatExtra mo124653j() {
        return this.f87755l;
    }

    /* renamed from: k */
    public final TargetChatterExtra mo124654k() {
        return this.f87756m;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo$QrCodeExtra;", "", "sharedUrl", "", "(Ljava/lang/String;)V", "getSharedUrl", "()Ljava/lang/String;", "setSharedUrl", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chat.ChatShareInfo$a */
    public static final class QrCodeExtra {

        /* renamed from: a */
        private String f87757a;

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof QrCodeExtra) && Intrinsics.areEqual(this.f87757a, ((QrCodeExtra) obj).f87757a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.f87757a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "QrCodeExtra(sharedUrl=" + this.f87757a + ")";
        }

        public QrCodeExtra(String str) {
            this.f87757a = str;
        }
    }

    /* renamed from: a */
    public final void mo124642a(ShareStatus shareStatus) {
        this.f87746c = shareStatus;
    }

    public ChatShareInfo(String str, ShareType shareType, ShareStatus shareStatus, ShareTargetType shareTargetType, String str2, String str3, Long l, Long l2, ShareChatterExtra bVar, QrCodeExtra aVar, TargetDocExtra eVar, TargetChatExtra cVar, TargetChatterExtra dVar) {
        this.f87744a = str;
        this.f87745b = shareType;
        this.f87746c = shareStatus;
        this.f87747d = shareTargetType;
        this.f87748e = str2;
        this.f87749f = str3;
        this.f87750g = l;
        this.f87751h = l2;
        this.f87752i = bVar;
        this.f87753j = aVar;
        this.f87754k = eVar;
        this.f87755l = cVar;
        this.f87756m = dVar;
    }
}
