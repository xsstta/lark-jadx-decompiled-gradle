package com.ss.android.lark.chat.chatwindow.chat.message.p1626c;

import com.ss.android.lark.chat.base.view.vo.message.StickerContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.StickerMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.AbstractC33142f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33129r;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.c.j */
public class C33339j extends C33330b<StickerContentVO, StickerMessageCell.StickerMessageViewHolder> {

    /* renamed from: c */
    private final AbstractC33129r f85892c;

    public C33339j(AbstractC33342d dVar, AbstractC33129r rVar) {
        super(dVar);
        this.f85892c = rVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b, com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo122821a((List<C34029b>) list, (C33141d) obj);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, C33141d<AbsMessageVO<StickerContentVO>, StickerMessageCell.StickerMessageViewHolder> dVar) {
        if (bVar.f87966a != 25) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public void mo122821a(List<C34029b> list, C33141d<AbsMessageVO<StickerContentVO>, StickerMessageCell.StickerMessageViewHolder> dVar) {
        Value value = dVar.f85280b;
        if (!((StickerContentVO) value.mo121699g()).mo121895d()) {
            list.add(AbstractC33142f.CC.m128072a(this.f85892c, value.mo121681a()));
        }
    }
}
