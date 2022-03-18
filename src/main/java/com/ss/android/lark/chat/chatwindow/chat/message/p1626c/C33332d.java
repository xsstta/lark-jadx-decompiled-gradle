package com.ss.android.lark.chat.chatwindow.chat.message.p1626c;

import com.ss.android.lark.chat.base.view.vo.message.ShareGroupChatContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.GroupMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.AbsMessageVO;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.c.d */
public class C33332d extends C33330b<ShareGroupChatContentVO, GroupMessageCell.GroupMessageViewHolder> {
    public C33332d(AbstractC33342d dVar) {
        super(dVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, C33141d<AbsMessageVO<ShareGroupChatContentVO>, GroupMessageCell.GroupMessageViewHolder> dVar) {
        if (bVar.f87966a == 11 || bVar.f87966a == 25) {
            return false;
        }
        return true;
    }
}
