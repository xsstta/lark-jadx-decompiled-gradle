package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1614a;

import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.ChatMessageVO;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.a.e */
public class C33094e implements AbstractC32928b<ChatMessageVO<?>> {

    /* renamed from: a */
    AbstractC34028a<C33141d> f85237a;

    /* renamed from: b */
    C33141d f85238b;

    public C33094e(AbstractC34028a<C33141d> aVar, C33141d dVar) {
        this.f85237a = aVar;
        this.f85238b = dVar;
    }

    /* renamed from: a */
    public boolean accept(C34029b bVar, ChatMessageVO<?> cVar) {
        return this.f85237a.mo120415a(bVar, this.f85238b);
    }
}
