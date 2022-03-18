package com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.impl;

import android.content.Context;
import android.text.Layout;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ILayoutProcessor;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ProcessParams;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/impl/MessageVOProcessor;", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ILayoutProcessor;", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "parentProcessor", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/impl/RichTextProcessor;", "(Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/impl/RichTextProcessor;)V", "process", "Landroid/text/Layout;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "params", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ProcessParams;", "context", "Landroid/content/Context;", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.a.a.c */
public final class MessageVOProcessor implements ILayoutProcessor<AbsMessageVO<?>> {

    /* renamed from: a */
    public static final Companion f85442a = new Companion(null);

    /* renamed from: b */
    private final RichTextProcessor f85443b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/impl/MessageVOProcessor$Companion;", "", "()V", "LOG_TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.a.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MessageVOProcessor(RichTextProcessor dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "parentProcessor");
        this.f85443b = dVar;
    }

    /* renamed from: a */
    public Layout mo122459a(AbsMessageVO<?> aVar, ProcessParams dVar, Context context) {
        TranslatableContentVO oVar;
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(dVar, "params");
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!(aVar.mo121699g() instanceof BaseTextContentVO)) {
            return null;
        }
        if (dVar.mo122484i()) {
            oVar = ((BaseTextContentVO) aVar.mo121699g()).mo121930y();
        } else {
            oVar = (TranslatableContentVO) aVar.mo121699g();
        }
        if (!(oVar instanceof BaseTextContentVO)) {
            return null;
        }
        BaseTextContentVO baseTextContentVO = (BaseTextContentVO) oVar;
        RichText a = baseTextContentVO.mo121772a();
        if (a == null) {
            Intrinsics.throwNpe();
        }
        if (C59035h.m229210a(baseTextContentVO.mo121772a())) {
            Log.m165383e("TextContentProcessor", "Parsing Layout， richText is null, id:" + aVar.mo121681a());
            return null;
        }
        dVar.mo122466a(baseTextContentVO.mo121785d());
        dVar.mo122469b(baseTextContentVO.mo121784c());
        boolean z2 = false;
        if (aVar.ai() || aVar.mo121706n()) {
            z = true;
        } else {
            z = false;
        }
        dVar.mo122467a(z);
        dVar.mo122470b(aVar.mo121695c());
        if (aVar.mo121655A() == Message.Status.DELETED) {
            z2 = true;
        }
        dVar.mo122471c(z2);
        dVar.mo122473d(aVar.mo121706n());
        dVar.mo122475e(C35247g.m137635b((ContentVO) oVar));
        return this.f85443b.mo122459a(a, dVar, context);
    }
}
