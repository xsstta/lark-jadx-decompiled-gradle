package com.ss.android.lark.threaddetail.view.message.p2756a;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.StickerContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.StickerMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55877b;
import java.util.List;

/* renamed from: com.ss.android.lark.threaddetail.view.message.a.f */
public class C55932f implements AbstractC34028a<C33141d<AbsMessageVO<StickerContentVO>, StickerMessageCell.StickerMessageViewHolder>> {

    /* renamed from: a */
    private final AbstractC33342d f138227a;

    /* renamed from: b */
    private final AbstractC55877b f138228b;

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, C33141d<AbsMessageVO<StickerContentVO>, StickerMessageCell.StickerMessageViewHolder> dVar) {
        return true;
    }

    public C55932f(AbstractC33342d dVar, AbstractC55877b bVar) {
        this.f138227a = dVar;
        this.f138228b = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, java.lang.Object] */
    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, C33141d<AbsMessageVO<StickerContentVO>, StickerMessageCell.StickerMessageViewHolder> dVar) {
        mo190680a((List<C34029b>) list, dVar);
    }

    /* renamed from: a */
    public void mo190680a(List<C34029b> list, C33141d<AbsMessageVO<StickerContentVO>, StickerMessageCell.StickerMessageViewHolder> dVar) {
        Value value = dVar.f85280b;
        if (C29990c.m110930b().mo134502A().mo134374a(((StickerContentVO) value.mo121699g()).mo121891a()) == null) {
            list.add(AbstractC55870a.CC.m217006a(this.f138228b, value));
        }
    }
}
