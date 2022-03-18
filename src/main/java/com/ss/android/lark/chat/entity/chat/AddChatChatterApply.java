package com.ss.android.lark.chat.entity.chat;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0002*+B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J?\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\n\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply;", "", "reason", "", UpdateKey.STATUS, "Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Status;", "way", "Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Ways;", "inviter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "invitee", "(Ljava/lang/String;Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Status;Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Ways;Lcom/ss/android/lark/chat/entity/chatter/Chatter;Lcom/ss/android/lark/chat/entity/chatter/Chatter;)V", "getInvitee", "()Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "setInvitee", "(Lcom/ss/android/lark/chat/entity/chatter/Chatter;)V", "getInviter", "setInviter", "getReason", "()Ljava/lang/String;", "setReason", "(Ljava/lang/String;)V", "getStatus", "()Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Status;", "setStatus", "(Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Status;)V", "getWay", "()Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Ways;", "setWay", "(Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Ways;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "Ways", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddChatChatterApply {

    /* renamed from: a */
    private String f87720a;

    /* renamed from: b */
    private Status f87721b;

    /* renamed from: c */
    private Ways f87722c;

    /* renamed from: d */
    private Chatter f87723d;

    /* renamed from: e */
    private Chatter f87724e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Status;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN_STATUS", "APPROVED", "REFUSED", "PROCESSING", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Status {
        UNKNOWN_STATUS(0),
        APPROVED(1),
        REFUSED(2),
        PROCESSING(3);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Status$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Status;", "value", "", "valueOf", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.chat.AddChatChatterApply$Status$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Status mo124351a(int i) {
                return mo124352b(i);
            }

            /* renamed from: b */
            public final Status mo124352b(int i) {
                if (i == 0) {
                    return Status.UNKNOWN_STATUS;
                }
                if (i == 1) {
                    return Status.APPROVED;
                }
                if (i == 2) {
                    return Status.REFUSED;
                }
                if (i != 3) {
                    return Status.UNKNOWN_STATUS;
                }
                return Status.PROCESSING;
            }
        }

        public final int getValue() {
            return this.value;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Ways;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN_WAY", "VIA_SHARE", "VIA_INVITATION", "VIA_QR_CODE", "VIA_SEARCH", "VIA_DEPARTMENT_STRUCTURE", "VIA_LINK", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Ways {
        UNKNOWN_WAY(0),
        VIA_SHARE(1),
        VIA_INVITATION(2),
        VIA_QR_CODE(3),
        VIA_SEARCH(4),
        VIA_DEPARTMENT_STRUCTURE(5),
        VIA_LINK(6);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Ways$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply$Ways;", "value", "", "valueOf", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.chat.AddChatChatterApply$Ways$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Ways mo124354a(int i) {
                return mo124355b(i);
            }

            /* renamed from: b */
            public final Ways mo124355b(int i) {
                switch (i) {
                    case 0:
                        return Ways.UNKNOWN_WAY;
                    case 1:
                        return Ways.VIA_SHARE;
                    case 2:
                        return Ways.VIA_INVITATION;
                    case 3:
                        return Ways.VIA_QR_CODE;
                    case 4:
                        return Ways.VIA_SEARCH;
                    case 5:
                        return Ways.VIA_DEPARTMENT_STRUCTURE;
                    case 6:
                        return Ways.VIA_LINK;
                    default:
                        return Ways.UNKNOWN_WAY;
                }
            }
        }

        public final int getValue() {
            return this.value;
        }

        private Ways(int i) {
            this.value = i;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddChatChatterApply)) {
            return false;
        }
        AddChatChatterApply addChatChatterApply = (AddChatChatterApply) obj;
        return Intrinsics.areEqual(this.f87720a, addChatChatterApply.f87720a) && Intrinsics.areEqual(this.f87721b, addChatChatterApply.f87721b) && Intrinsics.areEqual(this.f87722c, addChatChatterApply.f87722c) && Intrinsics.areEqual(this.f87723d, addChatChatterApply.f87723d) && Intrinsics.areEqual(this.f87724e, addChatChatterApply.f87724e);
    }

    public int hashCode() {
        String str = this.f87720a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Status status = this.f87721b;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 31;
        Ways ways = this.f87722c;
        int hashCode3 = (hashCode2 + (ways != null ? ways.hashCode() : 0)) * 31;
        Chatter chatter = this.f87723d;
        int hashCode4 = (hashCode3 + (chatter != null ? chatter.hashCode() : 0)) * 31;
        Chatter chatter2 = this.f87724e;
        if (chatter2 != null) {
            i = chatter2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "AddChatChatterApply(reason=" + this.f87720a + ", status=" + this.f87721b + ", way=" + this.f87722c + ", inviter=" + this.f87723d + ", invitee=" + this.f87724e + ")";
    }

    /* renamed from: a */
    public final String mo124342a() {
        return this.f87720a;
    }

    /* renamed from: b */
    public final Status mo124343b() {
        return this.f87721b;
    }

    /* renamed from: c */
    public final Ways mo124344c() {
        return this.f87722c;
    }

    /* renamed from: d */
    public final Chatter mo124345d() {
        return this.f87723d;
    }

    /* renamed from: e */
    public final Chatter mo124346e() {
        return this.f87724e;
    }

    public AddChatChatterApply(String str, Status status, Ways ways, Chatter chatter, Chatter chatter2) {
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(ways, "way");
        Intrinsics.checkParameterIsNotNull(chatter2, "invitee");
        this.f87720a = str;
        this.f87721b = status;
        this.f87722c = ways;
        this.f87723d = chatter;
        this.f87724e = chatter2;
    }
}
