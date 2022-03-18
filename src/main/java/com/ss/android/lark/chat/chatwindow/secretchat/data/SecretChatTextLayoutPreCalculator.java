package com.ss.android.lark.chat.chatwindow.secretchat.data;

import android.content.Context;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ITextLayoutPreCalculateLifeCycle;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ProcessParams;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.TextLayoutProcessor;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/data/SecretChatTextLayoutPreCalculator;", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ITextLayoutPreCalculateLifeCycle;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "contextRef", "Ljava/lang/ref/WeakReference;", "enable", "", "getEnable", "()Z", "setEnable", "(Z)V", "", "onLoadFromDataStore", "chatMessageVO", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "onSaveToDataStore", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.a.a */
public final class SecretChatTextLayoutPreCalculator implements ITextLayoutPreCalculateLifeCycle {

    /* renamed from: a */
    private final WeakReference<Context> f87374a;

    /* renamed from: b */
    private boolean f87375b;

    /* renamed from: c */
    private final Context f87376c;

    @Override // com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ITextLayoutPreCalculateLifeCycle
    /* renamed from: a */
    public void mo122456a(AbstractC34006a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ITextLayoutPreCalculateLifeCycle
    /* renamed from: a */
    public void mo122457a(boolean z) {
        this.f87375b = z;
    }

    public SecretChatTextLayoutPreCalculator(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f87376c = context;
        this.f87374a = new WeakReference<>(context);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ITextLayoutPreCalculateLifeCycle
    /* renamed from: a */
    public void mo122455a(ChatMessageVO<?> cVar) {
        Context context;
        Intrinsics.checkParameterIsNotNull(cVar, "chatMessageVO");
        if (this.f87375b && (context = this.f87374a.get()) != null) {
            ContentVO g = cVar.mo121699g();
            if (g instanceof TextContentVO) {
                ProcessParams a = TextLayoutProcessor.m128387a();
                Intrinsics.checkExpressionValueIsNotNull(context, "this");
                ((TextContentVO) g).mo121775a(TextLayoutProcessor.m128384a(cVar, a, context));
            }
        }
    }
}
