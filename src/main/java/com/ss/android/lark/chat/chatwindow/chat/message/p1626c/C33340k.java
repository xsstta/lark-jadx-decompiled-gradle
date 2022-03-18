package com.ss.android.lark.chat.chatwindow.chat.message.p1626c;

import android.text.TextUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.AbstractC32939b;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.AbstractC33142f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33113b;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33128q;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33133v;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33101ac;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.view.p1724a.C35256c;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.c.k */
public class C33340k extends C33330b<TextContentVO, AbstractC59010e> {

    /* renamed from: c */
    private final AbstractC33133v f85893c;

    /* renamed from: d */
    private final AbstractC33113b f85894d;

    /* renamed from: e */
    private final AbstractC33128q f85895e;

    /* renamed from: f */
    private final C35256c f85896f;

    /* renamed from: g */
    private final AbstractC36502p f85897g = C29990c.m110930b().af();

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b, com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo122821a((List<C34029b>) list, (C33141d) obj);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b
    /* renamed from: a */
    public void mo122821a(List<C34029b> list, C33141d<AbsMessageVO<TextContentVO>, AbstractC59010e> dVar) {
        Value value = dVar.f85280b;
        if (dVar.f85279a instanceof AbstractC32939b) {
            AbstractC32939b bVar = (AbstractC32939b) dVar.f85279a;
            list.add(AbstractC33142f.CC.m128061a(new C33101ac(this.f85878a.mo122543g()), value));
            if (((TextContentVO) value.mo121699g()).mo121905p() && this.f85896f.mo129753a(bVar) && value.mo121695c()) {
                list.add(AbstractC33142f.CC.m128060a(this.f85894d, value.mo121681a()));
            }
            if (this.f85897g.mo134683a()) {
                list.add(AbstractC33142f.CC.m128079a(!TextUtils.isEmpty(((TextContentVO) value.mo121699g()).mo121925t()), this.f85893c, dVar.f85279a.f146209n, dVar.f85279a, value));
            }
            if (C29990c.m110930b().mo134586n().mo134685a("ai.chat.message.menu.search")) {
                list.add(AbstractC33142f.CC.m128059a(dVar.f85279a.f146209n, this.f85895e, value));
            }
        }
    }

    public C33340k(AbstractC33342d dVar, AbstractC33133v vVar, AbstractC33113b bVar, AbstractC33128q qVar) {
        super(dVar);
        this.f85893c = vVar;
        this.f85894d = bVar;
        this.f85895e = qVar;
        this.f85896f = new C35256c(dVar);
    }
}
