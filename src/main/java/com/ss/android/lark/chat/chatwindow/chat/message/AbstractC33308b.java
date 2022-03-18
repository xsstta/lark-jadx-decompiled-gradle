package com.ss.android.lark.chat.chatwindow.chat.message;

import android.text.TextUtils;
import com.ss.android.lark.chat.api.service.track.C32911g;
import com.ss.android.lark.chat.api.service.track.sample.MsgSampleIssueTracker;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.view.C35259b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.b */
public abstract class AbstractC33308b<M extends AbsMessageVO, VH extends C59008d> extends AbstractView$OnClickListenerC59005c<M, VH> implements AbstractC34028a<C33141d<M, VH>> {

    /* renamed from: a */
    protected AbstractC33342d f85792a;

    /* renamed from: b */
    protected AbstractC34028a f85793b;

    /* renamed from: a */
    public void mo122781a(AbstractC34028a aVar) {
        this.f85793b = aVar;
    }

    public AbstractC33308b(AbstractC33342d dVar) {
        this.f85792a = dVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c
    /* renamed from: a */
    public void mo122700a(VH vh) {
        super.mo122700a((C59008d) vh);
    }

    /* renamed from: a */
    public void mo122783a(List<C34029b> list, C33141d<M, VH> dVar) {
        if (this.f85793b != null) {
            AbstractC59004b<Value, ? extends AbstractC59010e> f = mo200139f();
            C59008d dVar2 = (C59008d) dVar.f85279a;
            int indexOfValue = dVar2.f146207m.indexOfValue(f);
            if (indexOfValue >= 0) {
                this.f85793b.mo120413a(list, new C33141d(dVar2.f146206l.get(dVar2.f146207m.keyAt(indexOfValue)), dVar.f85280b));
            }
        }
    }

    /* renamed from: b */
    public void mo122649a(VH vh, M m) {
        super.mo122649a((C59008d) vh, (Object) m);
        C35259b.m137683a(((C59008d) vh).f146209n, m, vh.mo200148l());
        String h = this.f85792a.mo122544h();
        if (!this.f85792a.mo122549m() && !m.ai() && m.mo121695c() && !TextUtils.isEmpty(h)) {
            C32911g.m126697d(h).mo121416a(m.mo121681a());
        }
        if (!TextUtils.isEmpty(h) && !m.ai()) {
            MsgSampleIssueTracker.m126721b(h).mo121416a(m.mo121681a());
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, Object obj) {
        mo122783a((List<C34029b>) list, (C33141d) ((C33141d) obj));
    }

    /* renamed from: a */
    public boolean mo122784a(C34029b bVar, C33141d<M, VH> dVar) {
        if (this.f85793b == null) {
            return true;
        }
        AbstractC59004b<Value, ? extends AbstractC59010e> f = mo200139f();
        C59008d dVar2 = (C59008d) dVar.f85279a;
        return this.f85793b.mo120415a(bVar, new C33141d(dVar2.f146206l.get(dVar2.f146207m.keyAt(dVar2.f146207m.indexOfValue(f))), dVar.f85280b));
    }

    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo120415a(C34029b bVar, Object obj) {
        return mo122784a(bVar, (C33141d) ((C33141d) obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo122755b(VH vh, M m) {
        return super.mo122755b((AbstractC59010e) vh, (Object) m);
    }
}
