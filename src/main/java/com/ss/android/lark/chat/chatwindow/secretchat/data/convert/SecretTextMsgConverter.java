package com.ss.android.lark.chat.chatwindow.secretchat.data.convert;

import android.text.SpannableStringBuilder;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.chatwindow.secretchat.data.decrypt.SecretContentResolver;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.vo.IMsgVOConverter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.richtext.C59035h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/data/convert/SecretTextMsgConverter;", "Lcom/ss/android/lark/chat/vo/IMsgVOConverter;", "Lcom/ss/android/lark/chat/base/view/vo/message/TextContentVO;", "()V", "convert", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "getReplyDisplayText", "", "supportType", "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.b.b */
public final class SecretTextMsgConverter implements IMsgVOConverter<TextContentVO> {

    /* renamed from: a */
    public static final Companion f87391a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/data/convert/SecretTextMsgConverter$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: a */
    public Message.Type mo122452a() {
        return Message.Type.TEXT;
    }

    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: c */
    public CharSequence mo122454c(AbstractC34006a aVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        Message message = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        Content b = SecretContentResolver.f87392a.mo123956a().mo123955b(message);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (b != null && !(b instanceof TextContent)) {
            return spannableStringBuilder;
        }
        if (b != null) {
            str = C59035h.m229213d(((TextContent) b).getRichText());
        }
        spannableStringBuilder.append(str);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public TextContentVO mo122453b(AbstractC34006a aVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        Message message = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        Content b = SecretContentResolver.f87392a.mo123956a().mo123955b(message);
        if (!(b instanceof TextContent)) {
            StringBuilder sb = new StringBuilder();
            sb.append("convert fail messageContent null : ");
            if (b == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            Log.m165383e("SecretTextMsgConverter", sb.toString());
            return null;
        }
        TextContentVO mVar = new TextContentVO((TextContent) b);
        List<String> readAtChatterIds = message.getReadAtChatterIds();
        Intrinsics.checkExpressionValueIsNotNull(readAtChatterIds, "message.readAtChatterIds");
        mVar.mo121782b(readAtChatterIds);
        Message message2 = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
        List<String> atBotIds = message2.getAtBotIds();
        Intrinsics.checkExpressionValueIsNotNull(atBotIds, "messageInfo.getMessage().atBotIds");
        mVar.mo121778a(atBotIds);
        return mVar;
    }
}
