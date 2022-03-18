package com.ss.android.lark.chat.chatwindow.chat.message.p1626c;

import com.ss.android.lark.chat.base.view.vo.message.FileContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.FileMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.AbsMessageVO;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.c.c */
public class C33331c extends C33330b<FileContentVO, FileMessageCell.FileMessageViewHolder> {
    public C33331c(AbstractC33342d dVar) {
        super(dVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, C33141d<AbsMessageVO<FileContentVO>, FileMessageCell.FileMessageViewHolder> dVar) {
        FileContentVO dVar2 = (FileContentVO) dVar.f85280b.mo121699g();
        if (bVar.f87966a == 9 || bVar.f87966a == 11) {
            return !dVar2.mo121830g();
        }
        if (bVar.f87966a != 23) {
            return !dVar2.mo121832i();
        }
        return true;
    }
}
