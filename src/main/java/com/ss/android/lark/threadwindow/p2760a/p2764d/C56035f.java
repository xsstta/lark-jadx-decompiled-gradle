package com.ss.android.lark.threadwindow.p2760a.p2764d;

import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;

/* renamed from: com.ss.android.lark.threadwindow.a.d.f */
public class C56035f extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

    /* renamed from: a */
    private SendStatus f138555a;

    public C56035f(SendStatus sendStatus) {
        this.f138555a = sendStatus;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC34006a mo122917a(AbstractC34006a aVar) {
        aVar.getMessage().setSendStatus(this.f138555a);
        return aVar;
    }
}
