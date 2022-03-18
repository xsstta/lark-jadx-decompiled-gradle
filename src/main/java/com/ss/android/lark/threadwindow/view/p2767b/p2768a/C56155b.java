package com.ss.android.lark.threadwindow.view.p2767b.p2768a;

import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;

/* renamed from: com.ss.android.lark.threadwindow.view.b.a.b */
public class C56155b implements AbstractC32928b<ThreadMessageVO<?>> {

    /* renamed from: a */
    AbstractC34028a<C33141d> f138892a;

    /* renamed from: b */
    C33141d f138893b;

    public C56155b(AbstractC34028a<C33141d> aVar, C33141d dVar) {
        this.f138892a = aVar;
        this.f138893b = dVar;
    }

    /* renamed from: a */
    public boolean accept(C34029b bVar, ThreadMessageVO<?> threadMessageVO) {
        return this.f138892a.mo120415a(bVar, this.f138893b);
    }
}
