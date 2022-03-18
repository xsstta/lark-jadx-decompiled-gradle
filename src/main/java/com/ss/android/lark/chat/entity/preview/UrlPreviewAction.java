package com.ss.android.lark.chat.entity.preview;

import com.bytedance.lark.pb.basic.v1.CardActionPacket;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001&BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0010J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\b\u0010\"\u001a\u00020\nH\u0016J\u0012\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010%\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u0000H\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016¨\u0006'"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/UrlPreviewAction;", "Ljava/io/Serializable;", "Lcom/larksuite/framework/utils/diff/Diffable;", "url", "", "method", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewAction$Method;", "parameters", "Lcom/ss/android/lark/chat/entity/preview/Parameters;", "command", "", "cardActionPacket", "Lcom/bytedance/lark/pb/basic/v1/CardActionPacket;", "openUrl", "Lcom/ss/android/lark/chat/entity/preview/Url;", "fallbackActionId", "(Ljava/lang/String;Lcom/ss/android/lark/chat/entity/preview/UrlPreviewAction$Method;Lcom/ss/android/lark/chat/entity/preview/Parameters;ILcom/bytedance/lark/pb/basic/v1/CardActionPacket;Lcom/ss/android/lark/chat/entity/preview/Url;Ljava/lang/String;)V", "getCardActionPacket", "()Lcom/bytedance/lark/pb/basic/v1/CardActionPacket;", "getCommand", "()I", "getFallbackActionId", "()Ljava/lang/String;", "getMethod", "()Lcom/ss/android/lark/chat/entity/preview/UrlPreviewAction$Method;", "getOpenUrl", "()Lcom/ss/android/lark/chat/entity/preview/Url;", "getParameters", "()Lcom/ss/android/lark/chat/entity/preview/Parameters;", "getUrl", "equals", "", "other", "", "hashCode", "isContentSame", "diffable", "isItemSame", "Method", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UrlPreviewAction implements AbstractC26248b<UrlPreviewAction>, Serializable {
    private final CardActionPacket cardActionPacket;
    private final int command;
    private final String fallbackActionId;
    private final Method method;
    private final Url openUrl;
    private final Parameters parameters;
    private final String url;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/UrlPreviewAction$Method;", "", "Ljava/io/Serializable;", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "UNKNOWN_METHOD", "GET", "POST", "LARK_COMMAND", "OPEN_URL", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Method implements Serializable {
        UNKNOWN_METHOD(0),
        GET(1),
        POST(2),
        LARK_COMMAND(3),
        OPEN_URL(4);
        
        public static final Companion Companion = new Companion(null);
        private int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/UrlPreviewAction$Method$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewAction$Method;", "value", "", "valueOf", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.preview.UrlPreviewAction$Method$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Method mo125828a(int i) {
                return m131884b(i);
            }

            /* renamed from: b */
            private final Method m131884b(int i) {
                if (i == 0) {
                    return Method.UNKNOWN_METHOD;
                }
                if (i == 1) {
                    return Method.GET;
                }
                if (i == 2) {
                    return Method.POST;
                }
                if (i == 3) {
                    return Method.LARK_COMMAND;
                }
                if (i != 4) {
                    return Method.UNKNOWN_METHOD;
                }
                return Method.OPEN_URL;
            }
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        private Method(int i) {
            this.value = i;
        }
    }

    public final CardActionPacket getCardActionPacket() {
        return this.cardActionPacket;
    }

    public final int getCommand() {
        return this.command;
    }

    public final String getFallbackActionId() {
        return this.fallbackActionId;
    }

    public final Method getMethod() {
        return this.method;
    }

    public final Url getOpenUrl() {
        return this.openUrl;
    }

    public final Parameters getParameters() {
        return this.parameters;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = ((this.url.hashCode() * 31) + this.method.hashCode()) * 31;
        Parameters parameters2 = this.parameters;
        int i4 = 0;
        if (parameters2 != null) {
            i = parameters2.hashCode();
        } else {
            i = 0;
        }
        int i5 = (((hashCode + i) * 31) + this.command) * 31;
        CardActionPacket cardActionPacket2 = this.cardActionPacket;
        if (cardActionPacket2 != null) {
            i2 = cardActionPacket2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        Url url2 = this.openUrl;
        if (url2 != null) {
            i3 = url2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str = this.fallbackActionId;
        if (str != null) {
            i4 = str.hashCode();
        }
        return i7 + i4;
    }

    public boolean isContentSame(UrlPreviewAction urlPreviewAction) {
        if (equals(urlPreviewAction)) {
            return true;
        }
        return false;
    }

    public boolean isItemSame(UrlPreviewAction urlPreviewAction) {
        String str;
        String str2 = this.url;
        if (urlPreviewAction != null) {
            str = urlPreviewAction.url;
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str2, str)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlPreviewAction)) {
            return false;
        }
        UrlPreviewAction urlPreviewAction = (UrlPreviewAction) obj;
        if (!(!Intrinsics.areEqual(this.url, urlPreviewAction.url)) && this.method == urlPreviewAction.method && !(!Intrinsics.areEqual(this.parameters, urlPreviewAction.parameters)) && this.command == urlPreviewAction.command && !(!Intrinsics.areEqual(this.cardActionPacket, urlPreviewAction.cardActionPacket)) && !(!Intrinsics.areEqual(this.openUrl, urlPreviewAction.openUrl)) && !(!Intrinsics.areEqual(this.fallbackActionId, urlPreviewAction.fallbackActionId))) {
            return true;
        }
        return false;
    }

    public UrlPreviewAction(String str, Method method2, Parameters parameters2, int i, CardActionPacket cardActionPacket2, Url url2, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(method2, "method");
        this.url = str;
        this.method = method2;
        this.parameters = parameters2;
        this.command = i;
        this.cardActionPacket = cardActionPacket2;
        this.openUrl = url2;
        this.fallbackActionId = str2;
    }
}
