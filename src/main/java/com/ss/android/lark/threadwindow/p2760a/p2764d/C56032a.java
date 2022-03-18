package com.ss.android.lark.threadwindow.p2760a.p2764d;

import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chatbase.AbstractC34417b;

/* renamed from: com.ss.android.lark.threadwindow.a.d.a */
public class C56032a extends AbstractC34417b.AbstractC34424f<AbstractC34006a> {

    /* renamed from: a */
    private final boolean f138549a;

    public C56032a(boolean z) {
        this.f138549a = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34424f
    /* renamed from: a */
    public AbstractC34006a mo122923a(AbstractC34006a aVar) {
        aVar.setFollow(this.f138549a);
        return aVar;
    }
}
