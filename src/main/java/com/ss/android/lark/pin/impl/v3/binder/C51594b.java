package com.ss.android.lark.pin.impl.v3.binder;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.p1665e.AbstractC33988a;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.utils.C57851l;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.b */
public class C51594b implements AbstractC33988a<PinInfo> {

    /* renamed from: a */
    private PinInfo f128412a;

    /* renamed from: b */
    private final Context f128413b;

    /* renamed from: c */
    private final C51502e.AbstractC51506c f128414c;

    @Override // com.ss.android.lark.chat.entity.p1665e.AbstractC33988a
    /* renamed from: h */
    public boolean mo124928h() {
        return false;
    }

    /* renamed from: j */
    public PinInfo mo124918a() {
        return this.f128412a;
    }

    @Override // com.ss.android.lark.chat.entity.p1665e.AbstractC33988a
    /* renamed from: b */
    public boolean mo124922b() {
        return this.f128412a.mo177391b();
    }

    @Override // com.ss.android.lark.chat.entity.p1665e.AbstractC33988a
    /* renamed from: c */
    public Message mo124923c() {
        return this.f128412a.mo177396g();
    }

    @Override // com.ss.android.lark.chat.entity.p1665e.AbstractC33988a
    /* renamed from: d */
    public String mo124924d() {
        return this.f128412a.mo177398i();
    }

    @Override // com.ss.android.lark.chat.entity.p1665e.AbstractC33988a
    /* renamed from: f */
    public String mo124926f() {
        return this.f128412a.mo177393d();
    }

    @Override // com.ss.android.lark.chat.entity.p1665e.AbstractC33988a
    /* renamed from: g */
    public String mo124927g() {
        return this.f128412a.mo177392c();
    }

    @Override // com.ss.android.lark.chat.entity.p1665e.AbstractC33988a
    /* renamed from: i */
    public String mo124929i() {
        return this.f128412a.mo177394e();
    }

    @Override // com.ss.android.lark.chat.entity.p1665e.AbstractC33988a
    /* renamed from: e */
    public String mo124925e() {
        AbstractC51472a b = PinModule.m199585b();
        return C57851l.m224543a(this.f128413b, this.f128412a.mo177397h().getTimeStamp(), PinModule.m199585b().mo144023a(), b.mo144030d());
    }

    /* renamed from: a */
    public void mo124921a(PinInfo bVar) {
        this.f128412a = bVar;
    }

    public C51594b(Context context, C51502e.AbstractC51506c cVar) {
        this.f128413b = context;
        this.f128414c = cVar;
    }

    /* renamed from: a */
    public void mo124919a(int i, PinInfo bVar) {
        C51502e.AbstractC51506c cVar = this.f128414c;
        if (cVar != null) {
            switch (i) {
                case 65297:
                    cVar.mo177364a(bVar);
                    return;
                case 65298:
                    cVar.mo177366b(bVar);
                    return;
                case 65299:
                    cVar.mo177369c(bVar);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public void mo124920a(View view, PinInfo bVar) {
        C51502e.AbstractC51506c cVar = this.f128414c;
        if (cVar != null) {
            cVar.mo177368c(view, bVar);
        }
    }
}
