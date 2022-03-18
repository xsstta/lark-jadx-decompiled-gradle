package com.ss.android.lark.inno.player.live.p1989a.p1993d;

import com.ss.android.lark.inno.player.core.AbstractC39002c;
import com.ss.android.lark.inno.player.live.AbstractC39067e;
import com.ss.android.lark.inno.player.live.p1997b.C39064b;
import com.ss.android.lark.inno.player.p1973a.C38943b;

/* renamed from: com.ss.android.lark.inno.player.live.a.d.c */
public class C39039c extends AbstractC39002c<Object, View$OnClickListenerC39038b> {
    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: c */
    public void mo142590c(int i) {
    }

    @Override // com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: a */
    public void mo142589a() {
        this.f100188c.add(Integer.valueOf(C38943b.f100086k));
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: d */
    public void mo142591d(int i) {
        if (i == C38943b.f100086k) {
            ((View$OnClickListenerC39038b) this.f100186a).mo142587a();
        }
    }

    /* renamed from: a */
    public void mo142794a(C39064b bVar) {
        ((View$OnClickListenerC39038b) this.f100186a).mo142791a(bVar.mo142858a());
        ((View$OnClickListenerC39038b) this.f100186a).setSelectedResolution(bVar.mo142860b());
    }

    /* renamed from: a */
    private void m154062a(View$OnClickListenerC39038b bVar) {
        this.f100186a = bVar;
        ((View$OnClickListenerC39038b) this.f100186a).setDepend(new AbstractC39037a() {
            /* class com.ss.android.lark.inno.player.live.p1989a.p1993d.C39039c.C390401 */

            @Override // com.ss.android.lark.inno.player.live.p1989a.p1993d.AbstractC39037a
            /* renamed from: a */
            public C39064b mo142789a() {
                return ((AbstractC39067e) C39039c.this.mo142707b()).mo142890h();
            }

            @Override // com.ss.android.lark.inno.player.live.p1989a.p1993d.AbstractC39037a
            /* renamed from: a */
            public void mo142790a(int i) {
                ((AbstractC39067e) C39039c.this.mo142707b()).c_(i);
            }
        });
        ((View$OnClickListenerC39038b) this.f100186a).setVisibility(8);
        C39064b h = ((AbstractC39067e) mo142707b()).mo142890h();
        if (h != null) {
            mo142794a(h);
        }
    }

    public C39039c(AbstractC39067e eVar, View$OnClickListenerC39038b bVar) {
        super(eVar, bVar);
        m154062a(bVar);
    }
}
