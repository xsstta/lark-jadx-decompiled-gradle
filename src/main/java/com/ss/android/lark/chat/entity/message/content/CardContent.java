package com.ss.android.lark.chat.entity.message.content;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONType;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.site.ActivityC23764o;
import com.ss.android.lark.chat.entity.message.CardAction;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0004:;<=B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u00108\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010\u0001H\u0016R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006>"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/CardContent;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "()V", "actions", "", "", "Lcom/ss/android/lark/chat/entity/message/CardAction;", "getActions", "()Ljava/util/Map;", "setActions", "(Ljava/util/Map;)V", "cardHeader", "Lcom/ss/android/lark/chat/entity/message/content/CardContent$CardHeader;", "getCardHeader", "()Lcom/ss/android/lark/chat/entity/message/content/CardContent$CardHeader;", "setCardHeader", "(Lcom/ss/android/lark/chat/entity/message/content/CardContent$CardHeader;)V", "cardVersion", "", "getCardVersion", "()I", "setCardVersion", "(I)V", "digest", "getDigest", "()Ljava/lang/String;", "enableForward", "", "getEnableForward", "()Z", "setEnableForward", "(Z)V", "extraInfo", "Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraInfo;", "getExtraInfo", "()Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraInfo;", "setExtraInfo", "(Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraInfo;)V", "extraType", "Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraType;", "getExtraType", "()Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraType;", "setExtraType", "(Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraType;)V", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "getRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "setRichText", "(Lcom/ss/android/lark/widget/richtext/RichText;)V", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/content/CardContent$Type;", "getType", "()Lcom/ss/android/lark/chat/entity/message/content/CardContent$Type;", "setType", "(Lcom/ss/android/lark/chat/entity/message/content/CardContent$Type;)V", "isItemSame", "diffable", "CardHeader", "ExtraInfo", "ExtraType", "Type", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
@JSONType(typeName = "CardContent")
public final class CardContent extends Content {
    private Map<String, ? extends CardAction> actions;
    private CardHeader cardHeader;
    private int cardVersion;
    private boolean enableForward;
    private ExtraInfo extraInfo;
    private ExtraType extraType;
    private RichText richText;
    private Type type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraType;", "", "value", "", "(Ljava/lang/String;II)V", "<set-?>", "number", "getNumber", "()I", "setNumber$im_chat_chat_export_release", "(I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "SENDER_CANNOT_CLICK", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ExtraType {
        UNKNOWN(0),
        SENDER_CANNOT_CLICK(1);
        
        public static final Companion Companion = new Companion(null);
        private int number;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraType;", "value", "", "valueOf", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.message.content.CardContent$ExtraType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ExtraType mo125436a(int i) {
                if (i != 1) {
                    return ExtraType.UNKNOWN;
                }
                return ExtraType.SENDER_CANNOT_CLICK;
            }
        }

        public final int getNumber() {
            return this.number;
        }

        public final void setNumber$im_chat_chat_export_release(int i) {
            this.number = i;
        }

        private ExtraType(int i) {
            this.number = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/CardContent$Type;", "", "value", "", "(Ljava/lang/String;II)V", "<set-?>", "number", "getNumber", "()I", "setNumber$im_chat_chat_export_release", "(I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "VOTE", "TEXT", "VCHAT", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Type {
        UNKNOWN(-1),
        VOTE(1),
        TEXT(2),
        VCHAT(3);
        
        public static final Companion Companion = new Companion(null);
        private int number;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/CardContent$Type$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/entity/message/content/CardContent$Type;", "value", "", "valueOf", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.message.content.CardContent$Type$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Type mo125439a(int i) {
                if (i == 1) {
                    return Type.VOTE;
                }
                if (i == 2) {
                    return Type.TEXT;
                }
                if (i != 3) {
                    return Type.UNKNOWN;
                }
                return Type.VCHAT;
            }
        }

        public final int getNumber() {
            return this.number;
        }

        public final void setNumber$im_chat_chat_export_release(int i) {
            this.number = i;
        }

        private Type(int i) {
            this.number = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/CardContent$CardHeader;", "Ljava/io/Serializable;", "()V", "style", "", "", "getStyle", "()Ljava/util/Map;", "setStyle", "(Ljava/util/Map;)V", "theme", "getTheme", "()Ljava/lang/String;", "setTheme", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "equals", "", ActivityC23764o.f58839a, "", "hashCode", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class CardHeader implements Serializable {
        private Map<String, String> style;
        private String theme;
        private String title;

        public final Map<String, String> getStyle() {
            return this.style;
        }

        public final String getTheme() {
            return this.theme;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int i;
            int i2;
            String str = this.title;
            int i3 = 0;
            if (str != null) {
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            Map<String, String> map = this.style;
            if (map == null || map == null) {
                i2 = 0;
            } else {
                i2 = map.hashCode();
            }
            int i5 = (i4 + i2) * 31;
            String str2 = this.theme;
            if (!(str2 == null || str2 == null)) {
                i3 = str2.hashCode();
            }
            return i5 + i3;
        }

        public final void setStyle(Map<String, String> map) {
            this.style = map;
        }

        public final void setTheme(String str) {
            this.theme = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || (!Intrinsics.areEqual(getClass(), obj.getClass()))) {
                return false;
            }
            CardHeader cardHeader = (CardHeader) obj;
            if (!(!Intrinsics.areEqual(this.title, cardHeader.title)) && !Intrinsics.areEqual(this.style, cardHeader.style)) {
                return !Intrinsics.areEqual(this.theme, cardHeader.theme);
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraInfo;", "Ljava/io/Serializable;", "()V", "analyticsData", "", "getAnalyticsData", "()Ljava/lang/String;", "setAnalyticsData", "(Ljava/lang/String;)V", "isGadgetPreload", "", "()Z", "setGadgetPreload", "(Z)V", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ExtraInfo implements Serializable {
        private String analyticsData;
        private boolean isGadgetPreload;

        public final String getAnalyticsData() {
            return this.analyticsData;
        }

        public final boolean isGadgetPreload() {
            return this.isGadgetPreload;
        }

        public final void setAnalyticsData(String str) {
            this.analyticsData = str;
        }

        public final void setGadgetPreload(boolean z) {
            this.isGadgetPreload = z;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends com.ss.android.lark.chat.entity.message.CardAction>, java.util.Map<java.lang.String, com.ss.android.lark.chat.entity.message.CardAction> */
    public final Map<String, CardAction> getActions() {
        return this.actions;
    }

    public final CardHeader getCardHeader() {
        return this.cardHeader;
    }

    public final int getCardVersion() {
        return this.cardVersion;
    }

    public final boolean getEnableForward() {
        return this.enableForward;
    }

    public final ExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public final ExtraType getExtraType() {
        return this.extraType;
    }

    public final RichText getRichText() {
        return this.richText;
    }

    public final Type getType() {
        return this.type;
    }

    public final String getDigest() {
        String str;
        CardHeader cardHeader2 = this.cardHeader;
        if (cardHeader2 != null) {
            if (cardHeader2 != null) {
                str = cardHeader2.getTitle();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                CardHeader cardHeader3 = this.cardHeader;
                if (cardHeader3 != null) {
                    return cardHeader3.getTitle();
                }
                return null;
            }
        }
        return C59035h.m229212c(this.richText);
    }

    public final void setActions(Map<String, ? extends CardAction> map) {
        this.actions = map;
    }

    public final void setCardHeader(CardHeader cardHeader2) {
        this.cardHeader = cardHeader2;
    }

    public final void setCardVersion(int i) {
        this.cardVersion = i;
    }

    public final void setEnableForward(boolean z) {
        this.enableForward = z;
    }

    public final void setExtraInfo(ExtraInfo extraInfo2) {
        this.extraInfo = extraInfo2;
    }

    public final void setExtraType(ExtraType extraType2) {
        this.extraType = extraType2;
    }

    public final void setRichText(RichText richText2) {
        this.richText = richText2;
    }

    public final void setType(Type type2) {
        this.type = type2;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content
    public boolean isItemSame(Content content) {
        if (!(content instanceof CardContent)) {
            return false;
        }
        if (this == content) {
            return true;
        }
        CardContent cardContent = (CardContent) content;
        if (this.type == cardContent.type && this.cardVersion == cardContent.cardVersion && !(!Intrinsics.areEqual(this.cardHeader, cardContent.cardHeader))) {
            return Intrinsics.areEqual(this.richText, cardContent.richText);
        }
        return false;
    }
}
