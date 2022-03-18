package com.ss.android.lark.chat.chatwindow.chat.message.p1626c;

import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.c.b */
public class C33330b<M extends ContentVO<?>, VH extends AbstractC59010e> implements AbstractC34028a<C33141d<AbsMessageVO<M>, VH>> {

    /* renamed from: a */
    protected AbstractC33342d f85878a;

    /* renamed from: b */
    protected boolean f85879b;

    /* renamed from: a */
    public void mo122821a(List<C34029b> list, C33141d<AbsMessageVO<M>, VH> dVar) {
    }

    public C33330b(AbstractC33342d dVar) {
        this(dVar, false);
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo122821a((List<C34029b>) list, (C33141d) ((C33141d) obj));
    }

    public C33330b(AbstractC33342d dVar, boolean z) {
        this.f85878a = dVar;
        this.f85879b = z;
    }

    /* renamed from: a */
    public boolean mo122822a(C34029b bVar, C33141d<AbsMessageVO<M>, VH> dVar) {
        return !this.f85879b;
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo120415a(C34029b bVar, Object obj) {
        return mo122822a(bVar, (C33141d) ((C33141d) obj));
    }
}
