package com.ss.android.lark.chat.chatwindow.chat.message.p1626c;

import android.text.TextUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.AudioMessageNewCell;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.AbstractC33142f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33120i;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33124m;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33133v;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.dependency.AbstractC36502p;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.c.a */
public class C33329a extends C33330b<AudioContentVO, AudioMessageNewCell.AudioMessageViewHolder> {

    /* renamed from: c */
    private final AbstractC36502p f85875c = C29990c.m110930b().af();

    /* renamed from: d */
    private final AbstractC33120i f85876d;

    /* renamed from: e */
    private final AbstractC33133v f85877e;

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b, com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo122821a((List<C34029b>) list, (C33141d) obj);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, C33141d<AbsMessageVO<AudioContentVO>, AudioMessageNewCell.AudioMessageViewHolder> dVar) {
        if (bVar.f87966a != 25) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public void mo122821a(List<C34029b> list, C33141d<AbsMessageVO<AudioContentVO>, AudioMessageNewCell.AudioMessageViewHolder> dVar) {
        AbstractC33120i iVar = this.f85876d;
        if (iVar != null) {
            list.add(AbstractC33142f.CC.m128068a((AbstractC33124m) iVar, dVar.f85280b.mo121681a()));
        }
        if (this.f85875c.mo134684b() && !this.f85878a.mo122546j()) {
            Value value = dVar.f85280b;
            AudioContentVO bVar = (AudioContentVO) value.mo121699g();
            list.add(AbstractC33142f.CC.m128075a(this.f85876d, value, !C35247g.m137629a(bVar), bVar.mo121813h()));
            boolean z = !TextUtils.isEmpty(bVar.mo121925t());
            if (C29990c.m110930b().mo134586n().mo134685a("translate.asr-message.android") && C35247g.m137629a(bVar)) {
                list.add(AbstractC33142f.CC.m128079a(z, this.f85877e, ((AudioMessageNewCell.AudioMessageViewHolder) dVar.f85279a).f146209n, dVar.f85279a, value));
            }
        }
    }

    public C33329a(AbstractC33342d dVar, AbstractC33120i iVar, AbstractC33133v vVar) {
        super(dVar);
        this.f85876d = iVar;
        this.f85877e = vVar;
    }
}
