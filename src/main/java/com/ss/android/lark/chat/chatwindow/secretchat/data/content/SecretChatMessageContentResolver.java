package com.ss.android.lark.chat.chatwindow.secretchat.data.content;

import com.ss.android.lark.chat.chatwindow.chat.data.content.MessageContentResolver;
import com.ss.android.lark.chat.chatwindow.secretchat.data.decrypt.SecretContentResolver;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/data/content/SecretChatMessageContentResolver;", "Lcom/ss/android/lark/chat/chatwindow/chat/data/content/MessageContentResolver;", "()V", "getDocResult", "Lcom/ss/android/lark/doc/entity/DocResult;", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "getMessageRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "getMessageText", "", "getPreviewHangPoint", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "getUrlCount", "", "getUrlPreview", "Lcom/ss/android/lark/chat/entity/message/MessageUrlPreview;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.a.a */
public final class SecretChatMessageContentResolver extends MessageContentResolver {

    /* renamed from: a */
    public static final SecretChatMessageContentResolver f87377a = new SecretChatMessageContentResolver();

    private SecretChatMessageContentResolver() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.chatwindow.chat.data.content.MessageContentResolver
    /* renamed from: a */
    public String mo122520a(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        Message.Type type = message.getType();
        if (type == null || C33903b.f87378a[type.ordinal()] != 1) {
            return "";
        }
        Content b = SecretContentResolver.f87392a.mo123956a().mo123955b(message);
        if (b instanceof TextContent) {
            return ((TextContent) b).getText();
        }
        return "";
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.data.content.MessageContentResolver
    /* renamed from: b */
    public RichText mo122521b(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        Message.Type type = message.getType();
        if (type == null || C33903b.f87379b[type.ordinal()] != 1) {
            return null;
        }
        Content b = SecretContentResolver.f87392a.mo123956a().mo123955b(message);
        if (b instanceof TextContent) {
            return ((TextContent) b).getRichText();
        }
        return null;
    }
}
