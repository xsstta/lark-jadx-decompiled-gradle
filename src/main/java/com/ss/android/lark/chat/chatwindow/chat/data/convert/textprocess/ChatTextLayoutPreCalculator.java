package com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess;

import android.content.Context;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.BaseTextContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0014\u0010\u0011\u001a\u00020\u00102\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ChatTextLayoutPreCalculator;", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ITextLayoutPreCalculateLifeCycle;", "context", "Landroid/content/Context;", "anonymousId", "", "isSuperGroup", "", "(Landroid/content/Context;Ljava/lang/String;Z)V", "contextRef", "Ljava/lang/ref/WeakReference;", "enable", "getEnable", "()Z", "setEnable", "(Z)V", "", "onLoadFromDataStore", "content", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "onSaveToDataStore", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "useLightTextView", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.a.a */
public final class ChatTextLayoutPreCalculator implements ITextLayoutPreCalculateLifeCycle {

    /* renamed from: a */
    private final WeakReference<Context> f85436a;

    /* renamed from: b */
    private boolean f85437b;

    /* renamed from: c */
    private final String f85438c;

    /* renamed from: d */
    private final boolean f85439d;

    @Override // com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ITextLayoutPreCalculateLifeCycle
    /* renamed from: a */
    public void mo122455a(ChatMessageVO<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "content");
    }

    /* renamed from: a */
    private final boolean m128336a() {
        return !DesktopUtil.m144301a(UIHelper.getContext());
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ITextLayoutPreCalculateLifeCycle
    /* renamed from: a */
    public void mo122457a(boolean z) {
        this.f85437b = z;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ITextLayoutPreCalculateLifeCycle
    /* renamed from: a */
    public void mo122456a(AbstractC34006a aVar) {
        Context context;
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        if (m128336a() && this.f85437b && (context = this.f85436a.get()) != null) {
            Message message = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            if (message.getType() != Message.Type.TEXT) {
                Message message2 = aVar.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
                if (message2.getType() != Message.Type.POST) {
                    return;
                }
            }
            Content content = aVar.getMessage().getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "messageInfo.getMessage()…ent<BaseTextContent<*>>()");
            ProcessParams h = TextLayoutProcessor.m128387a().mo122464a(this.f85438c).mo122481h(this.f85439d);
            Intrinsics.checkExpressionValueIsNotNull(context, "this");
            ((BaseTextContent) content).setContentLayout(TextLayoutProcessor.m128385a(aVar, h, context));
            if (aVar.getTranslateInfo() != null) {
                ((BaseTextContent) aVar.getTranslateInfo().getTranslateContent()).setContentLayout(TextLayoutProcessor.m128385a(aVar, TextLayoutProcessor.m128387a().mo122464a(this.f85438c).mo122483i(true).mo122481h(this.f85439d), context));
            }
        }
    }

    public ChatTextLayoutPreCalculator(Context context, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "anonymousId");
        this.f85438c = str;
        this.f85439d = z;
        this.f85436a = new WeakReference<>(context);
    }
}
