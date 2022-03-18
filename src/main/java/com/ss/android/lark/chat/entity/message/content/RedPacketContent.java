package com.ss.android.lark.chat.entity.message.content;

import com.alibaba.fastjson.annotation.JSONType;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.framework.utils.C26325y;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002&'B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/RedPacketContent;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "Ljava/io/Serializable;", "()V", "cover", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "getCover", "()Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "setCover", "(Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;)V", "isClicked", "", "()Z", "setClicked", "(Z)V", "isExpired", "setExpired", "isGrabbed", "setGrabbed", "isGrabbedFinish", "setGrabbedFinish", "redPacketId", "", "getRedPacketId", "()Ljava/lang/String;", "setRedPacketId", "(Ljava/lang/String;)V", "subject", "getSubject", "setSubject", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/content/RedPacketContent$Type;", "getType", "()Lcom/ss/android/lark/chat/entity/message/content/RedPacketContent$Type;", "setType", "(Lcom/ss/android/lark/chat/entity/message/content/RedPacketContent$Type;)V", "isContentSame", "diffable", "Companion", "Type", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
@JSONType(typeName = "RedPacketContent")
public final class RedPacketContent extends Content implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = -6431995976536648010L;
    private RedPacketCover cover;
    private boolean isClicked;
    private boolean isExpired;
    private boolean isGrabbed;
    private boolean isGrabbedFinish;
    private String redPacketId;
    private String subject;
    private Type type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/RedPacketContent$Type;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "P2P", "GROUP_FIX", "GROUP_RANDOM", "COMMERCIAL", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Type {
        UNKNOWN(0),
        P2P(1),
        GROUP_FIX(2),
        GROUP_RANDOM(3),
        COMMERCIAL(4);
        
        public static final Companion Companion = new Companion(null);
        private final int number;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/RedPacketContent$Type$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/entity/message/content/RedPacketContent$Type;", "value", "", "valueOf", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Type valueOf(int i) {
                return forNumber(i);
            }

            public final Type forNumber(int i) {
                if (i == 1) {
                    return Type.P2P;
                }
                if (i == 2) {
                    return Type.GROUP_FIX;
                }
                if (i == 3) {
                    return Type.GROUP_RANDOM;
                }
                if (i != 4) {
                    return Type.UNKNOWN;
                }
                return Type.COMMERCIAL;
            }
        }

        public final int getNumber() {
            return this.number;
        }

        private Type(int i) {
            this.number = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/RedPacketContent$Companion;", "", "()V", "serialVersionUID", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.message.content.RedPacketContent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final RedPacketCover getCover() {
        return this.cover;
    }

    public final String getRedPacketId() {
        return this.redPacketId;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final Type getType() {
        return this.type;
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public final boolean isGrabbed() {
        return this.isGrabbed;
    }

    public final boolean isGrabbedFinish() {
        return this.isGrabbedFinish;
    }

    public final void setClicked(boolean z) {
        this.isClicked = z;
    }

    public final void setCover(RedPacketCover redPacketCover) {
        this.cover = redPacketCover;
    }

    public final void setExpired(boolean z) {
        this.isExpired = z;
    }

    public final void setGrabbed(boolean z) {
        this.isGrabbed = z;
    }

    public final void setGrabbedFinish(boolean z) {
        this.isGrabbedFinish = z;
    }

    public final void setRedPacketId(String str) {
        this.redPacketId = str;
    }

    public final void setSubject(String str) {
        this.subject = str;
    }

    public final void setType(Type type2) {
        this.type = type2;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content
    public boolean isContentSame(Content content) {
        if (content == null || !(content instanceof RedPacketContent)) {
            return false;
        }
        if (this == content) {
            return true;
        }
        RedPacketContent redPacketContent = (RedPacketContent) content;
        if (this.isClicked == redPacketContent.isClicked && this.isGrabbed == redPacketContent.isGrabbed && this.isGrabbedFinish == redPacketContent.isGrabbedFinish && this.isExpired == redPacketContent.isExpired && C26325y.m95335a(this.redPacketId, redPacketContent.redPacketId)) {
            return !C26325y.m95335a(this.subject, redPacketContent.subject);
        }
        return false;
    }
}
