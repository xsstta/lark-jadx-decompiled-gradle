package com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.impl;

import android.content.Context;
import android.text.Layout;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ILayoutProcessor;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ProcessParams;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.BaseTextContent;
import com.ss.android.lark.chat.entity.translate.TranslateInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/impl/MessageInfoProcessor;", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ILayoutProcessor;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "parentProcessor", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/impl/RichTextProcessor;", "(Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/impl/RichTextProcessor;)V", "process", "Landroid/text/Layout;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "params", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ProcessParams;", "context", "Landroid/content/Context;", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.a.a.b */
public final class MessageInfoProcessor implements ILayoutProcessor<AbstractC34006a> {

    /* renamed from: a */
    public static final Companion f85440a = new Companion(null);

    /* renamed from: b */
    private final RichTextProcessor f85441b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/impl/MessageInfoProcessor$Companion;", "", "()V", "LOG_TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.a.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MessageInfoProcessor(RichTextProcessor dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "parentProcessor");
        this.f85441b = dVar;
    }

    /* renamed from: a */
    public Layout mo122459a(AbstractC34006a aVar, ProcessParams dVar, Context context) {
        Content content;
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(dVar, "params");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Message message = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "data.getMessage()");
        Message.Type type = message.getType();
        if (type != Message.Type.TEXT && type != Message.Type.POST) {
            return null;
        }
        if (dVar.mo122484i()) {
            TranslateInfo translateInfo = aVar.getTranslateInfo();
            if (translateInfo != null) {
                content = translateInfo.getTranslateContent();
            } else {
                content = null;
            }
        } else {
            content = aVar.getMessage().getContent();
        }
        if (!(content instanceof BaseTextContent)) {
            return null;
        }
        RichText richText = ((BaseTextContent) content).getRichText();
        if (richText == null) {
            Intrinsics.throwNpe();
        }
        if (C59035h.m229210a(richText)) {
            Log.m165383e("RichTextProcessor", "rich-text is null , msg is:" + message);
            return null;
        }
        boolean z2 = false;
        if (!aVar.isPreMessage()) {
            Message message2 = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message2, "data.getMessage()");
            if (!message2.isSecret()) {
                z = false;
                dVar.mo122467a(z);
                dVar.mo122470b(message.isFromMe());
                List<String> readAtChatterIds = message.getReadAtChatterIds();
                Intrinsics.checkExpressionValueIsNotNull(readAtChatterIds, "message.readAtChatterIds");
                dVar.mo122466a(readAtChatterIds);
                List<String> atBotIds = message.getAtBotIds();
                Intrinsics.checkExpressionValueIsNotNull(atBotIds, "message.atBotIds");
                dVar.mo122469b(atBotIds);
                if (message.getStatus() == Message.Status.DELETED || (message.isSecret() && message.isBurned())) {
                    z2 = true;
                }
                dVar.mo122471c(z2);
                dVar.mo122473d(message.isSecret());
                dVar.mo122475e(C35247g.m137632a(content));
                return this.f85441b.mo122459a(richText, dVar, context);
            }
        }
        z = true;
        dVar.mo122467a(z);
        dVar.mo122470b(message.isFromMe());
        List<String> readAtChatterIds2 = message.getReadAtChatterIds();
        Intrinsics.checkExpressionValueIsNotNull(readAtChatterIds2, "message.readAtChatterIds");
        dVar.mo122466a(readAtChatterIds2);
        List<String> atBotIds2 = message.getAtBotIds();
        Intrinsics.checkExpressionValueIsNotNull(atBotIds2, "message.atBotIds");
        dVar.mo122469b(atBotIds2);
        z2 = true;
        dVar.mo122471c(z2);
        dVar.mo122473d(message.isSecret());
        dVar.mo122475e(C35247g.m137632a(content));
        return this.f85441b.mo122459a(richText, dVar, context);
    }
}
