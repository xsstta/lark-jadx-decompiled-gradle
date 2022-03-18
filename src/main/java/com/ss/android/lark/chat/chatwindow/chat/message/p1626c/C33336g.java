package com.ss.android.lark.chat.chatwindow.chat.message.p1626c;

import android.text.TextUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.MergeForwardContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.MergeForwardMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.AbstractC33142f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33133v;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.dependency.AbstractC36502p;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.c.g */
public class C33336g extends C33330b<MergeForwardContentVO, MergeForwardMessageCell.MergeForwardMessageViewHolder> {

    /* renamed from: c */
    private final AbstractC33133v f85884c;

    /* renamed from: d */
    private final AbstractC36502p f85885d = C29990c.m110930b().af();

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b, com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo122821a((List<C34029b>) list, (C33141d) obj);
    }

    public C33336g(AbstractC33342d dVar, AbstractC33133v vVar) {
        super(dVar);
        this.f85884c = vVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public void mo122821a(List<C34029b> list, C33141d<AbsMessageVO<MergeForwardContentVO>, MergeForwardMessageCell.MergeForwardMessageViewHolder> dVar) {
        if (this.f85885d.mo134683a()) {
            Value value = dVar.f85280b;
            MergeForwardMessageCell.MergeForwardMessageViewHolder mergeForwardMessageViewHolder = (MergeForwardMessageCell.MergeForwardMessageViewHolder) dVar.f85279a;
            list.add(AbstractC33142f.CC.m128079a(!TextUtils.isEmpty(((MergeForwardContentVO) value.mo121699g()).mo121925t()), this.f85884c, mergeForwardMessageViewHolder.f146209n, mergeForwardMessageViewHolder, value));
        }
    }
}
