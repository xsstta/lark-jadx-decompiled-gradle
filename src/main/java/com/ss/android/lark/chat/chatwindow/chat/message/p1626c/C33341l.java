package com.ss.android.lark.chat.chatwindow.chat.message.p1626c;

import android.text.TextUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.ThreadMergeForwardContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.ThreadMergeForwardMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.AbstractC33142f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33133v;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.dependency.AbstractC36502p;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.c.l */
public class C33341l extends C33330b<ThreadMergeForwardContentVO, ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder> {

    /* renamed from: c */
    private final AbstractC33133v f85898c;

    /* renamed from: d */
    private final AbstractC36502p f85899d = C29990c.m110930b().af();

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b, com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo122821a((List<C34029b>) list, (C33141d) obj);
    }

    public C33341l(AbstractC33342d dVar, AbstractC33133v vVar) {
        super(dVar);
        this.f85898c = vVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public void mo122821a(List<C34029b> list, C33141d<AbsMessageVO<ThreadMergeForwardContentVO>, ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder> dVar) {
        if (this.f85899d.mo134683a() && this.f85898c != null) {
            Value value = dVar.f85280b;
            ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder threadMergeForwardViewHolder = (ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder) dVar.f85279a;
            list.add(AbstractC33142f.CC.m128079a(!TextUtils.isEmpty(((ThreadMergeForwardContentVO) value.mo121699g()).mo121925t()), this.f85898c, threadMergeForwardViewHolder.f146209n, threadMergeForwardViewHolder, value));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, C33141d<AbsMessageVO<ThreadMergeForwardContentVO>, ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder> dVar) {
        if (bVar.f87966a == 0 || bVar.f87966a == 7 || bVar.f87966a == 9 || bVar.f87966a == 12 || bVar.f87966a == 15 || bVar.f87966a == 23 || bVar.f87966a == 25 || bVar.f87966a == 5 || bVar.f87966a == 13 || bVar.f87966a == 16 || bVar.f87966a == 14) {
            return true;
        }
        return false;
    }
}
