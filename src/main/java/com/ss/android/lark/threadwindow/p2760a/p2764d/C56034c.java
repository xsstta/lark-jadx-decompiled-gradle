package com.ss.android.lark.threadwindow.p2760a.p2764d;

import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chatbase.AbstractC34417b;

/* renamed from: com.ss.android.lark.threadwindow.a.d.c */
public class C56034c extends AbstractC34417b.AbstractC34424f<AbstractC34006a> {

    /* renamed from: a */
    private final Message f138551a;

    public C56034c(Message message) {
        this.f138551a = message;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34424f
    /* renamed from: a */
    public AbstractC34006a mo122923a(AbstractC34006a aVar) {
        aVar.setMessage(this.f138551a);
        return aVar;
    }
}
