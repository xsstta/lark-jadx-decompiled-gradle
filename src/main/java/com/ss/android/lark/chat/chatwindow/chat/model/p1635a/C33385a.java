package com.ss.android.lark.chat.chatwindow.chat.model.p1635a;

import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.a.a */
public class C33385a extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

    /* renamed from: a */
    private AudioContent.AudioState f86005a;

    public C33385a(AudioContent.AudioState audioState) {
        this.f86005a = audioState;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC34006a mo122917a(AbstractC34006a aVar) {
        Message message = aVar.getMessage();
        if (!(message.getType() != Message.Type.AUDIO || message.getContent() == null || this.f86005a == null)) {
            ((AudioContent) message.getContent()).setFileState(this.f86005a);
        }
        return aVar;
    }
}
