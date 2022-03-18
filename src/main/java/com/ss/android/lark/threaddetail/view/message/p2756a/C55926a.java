package com.ss.android.lark.threaddetail.view.message.p2756a;

import android.view.View;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55881f;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n;
import com.ss.android.lark.threadwindow.view.message.AudioMessageViewHolder;
import java.util.List;

/* renamed from: com.ss.android.lark.threaddetail.view.message.a.a */
public class C55926a implements AbstractC34028a<C33141d<ChatMessageVO<AudioContentVO>, AudioMessageViewHolder>> {

    /* renamed from: a */
    private final AbstractC33342d f138211a;

    /* renamed from: b */
    private final AbstractC55893n f138212b;

    /* renamed from: c */
    private final AbstractC55890m f138213c;

    /* renamed from: d */
    private final AbstractC36502p f138214d = C29990c.m110930b().af();

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, java.lang.Object] */
    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, C33141d<ChatMessageVO<AudioContentVO>, AudioMessageViewHolder> dVar) {
        mo190673a((List<C34029b>) list, dVar);
    }

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, C33141d<ChatMessageVO<AudioContentVO>, AudioMessageViewHolder> dVar) {
        if (bVar.f87966a != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo190673a(List<C34029b> list, C33141d<ChatMessageVO<AudioContentVO>, AudioMessageViewHolder> dVar) {
        if (this.f138214d.mo134684b() && !this.f138211a.mo122546j()) {
            final Value value = dVar.f85280b;
            final AudioContentVO bVar = (AudioContentVO) value.mo121699g();
            list.add(AbstractC55870a.CC.m217016a(this.f138213c, value, new AbstractC55890m.AbstractC55891a() {
                /* class com.ss.android.lark.threaddetail.view.message.p2756a.C55926a.C559271 */

                @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55881f.AbstractC55882a
                /* renamed from: c */
                public /* synthetic */ View mo121962c() {
                    return AbstractC55881f.AbstractC55882a.CC.$default$c(this);
                }

                /* renamed from: b */
                public AbstractC55890m.C55892b mo121960a() {
                    AbstractC55890m.C55892b bVar = new AbstractC55890m.C55892b();
                    bVar.f138067b = !C35247g.m137629a(bVar);
                    bVar.f138066a = value.mo121681a();
                    return bVar;
                }
            }));
            if (C29990c.m110930b().mo134586n().mo134685a("translate.asr-message.android") && C35247g.m137629a(bVar)) {
                list.add(AbstractC55870a.CC.m217017a(this.f138212b, ((AudioMessageViewHolder) dVar.f85279a).f146209n, bVar, value.mo121681a()));
            }
        }
    }

    public C55926a(AbstractC33342d dVar, AbstractC55893n nVar, AbstractC55890m mVar) {
        this.f138211a = dVar;
        this.f138212b = nVar;
        this.f138213c = mVar;
    }
}
