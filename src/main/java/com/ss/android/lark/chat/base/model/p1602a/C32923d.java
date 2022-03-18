package com.ss.android.lark.chat.base.model.p1602a;

import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33386b;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.base.model.a.d */
public class C32923d implements AbstractC32919a {

    /* renamed from: a */
    private final AbstractC34417b.AbstractC34421c<String> f84611a;

    /* renamed from: b */
    private final AbstractC34432b.AbstractC34434b<AbstractC34006a> f84612b;

    /* renamed from: a */
    public List<AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> mo121562a() {
        return C33386b.m129358a(this.f84611a, this.f84612b);
    }

    public C32923d(AbstractC34417b.AbstractC34421c<String> cVar, AbstractC34432b.AbstractC34434b<AbstractC34006a> bVar) {
        this.f84611a = cVar;
        this.f84612b = bVar;
    }
}
