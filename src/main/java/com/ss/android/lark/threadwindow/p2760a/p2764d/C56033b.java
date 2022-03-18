package com.ss.android.lark.threadwindow.p2760a.p2764d;

import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;

/* renamed from: com.ss.android.lark.threadwindow.a.d.b */
public class C56033b extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

    /* renamed from: a */
    private MessageInfo f138550a;

    public C56033b(MessageInfo messageInfo) {
        this.f138550a = messageInfo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC34006a mo122917a(AbstractC34006a aVar) {
        MessageInfo messageInfo = this.f138550a;
        if (messageInfo != null) {
            aVar.setMessage(messageInfo.getMessage());
            aVar.setReactionInfoList(this.f138550a.getReactionInfoList());
            aVar.setPin(this.f138550a.getPin());
            aVar.setTranslateInfo(this.f138550a.getTranslateInfo());
            aVar.setNeedToAutoTranslate(this.f138550a.isNeedToAutoTranslate());
            aVar.setIsTranslating(this.f138550a.isTranslating());
        }
        return aVar;
    }
}
