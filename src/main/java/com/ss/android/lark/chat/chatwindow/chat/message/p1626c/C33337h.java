package com.ss.android.lark.chat.chatwindow.chat.message.p1626c;

import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1627d.C33343a;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.menu.OpenMenuDataHolder;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.c.h */
public class C33337h extends C33330b<ContentVO<?>, C33343a.C33344a> {

    /* renamed from: c */
    AbstractC34028a f85886c;

    public C33337h(AbstractC33342d dVar, AbstractC34028a aVar) {
        super(dVar);
        this.f85886c = aVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b, com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo122821a((List<C34029b>) list, (C33141d) obj);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public void mo122821a(List<C34029b> list, C33141d<AbsMessageVO<ContentVO<?>>, C33343a.C33344a> dVar) {
        this.f85886c.mo120413a(list, new OpenMenuDataHolder(((C33343a.C33344a) dVar.f85279a).f85902a, dVar.f85280b));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, C33141d<AbsMessageVO<ContentVO<?>>, C33343a.C33344a> dVar) {
        return this.f85886c.mo120415a(bVar, new OpenMenuDataHolder(((C33343a.C33344a) dVar.f85279a).f85902a, dVar.f85280b));
    }
}
