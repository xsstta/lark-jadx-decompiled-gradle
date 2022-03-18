package com.ss.android.lark.inno.player.live.p1989a.p1990a;

import com.ss.android.lark.inno.network.model.C38938a;
import com.ss.android.lark.inno.player.core.AbstractC39002c;
import com.ss.android.lark.inno.player.live.AbstractC39067e;
import com.ss.android.lark.inno.player.live.p1997b.C39064b;
import com.ss.android.lark.inno.player.p1973a.C38943b;

/* renamed from: com.ss.android.lark.inno.player.live.a.a.c */
public class C39024c extends AbstractC39002c<Object, View$OnClickListenerC39023b> {
    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: c */
    public void mo142590c(int i) {
    }

    @Override // com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: a */
    public void mo142589a() {
        mo142708b(C38943b.f100089n);
        mo142708b(C38943b.f100088m);
    }

    /* renamed from: e */
    private void m154027e() {
        C39064b h = ((AbstractC39067e) mo142707b()).mo142890h();
        if (h != null) {
            ((View$OnClickListenerC39023b) this.f100186a).mo142785a(h.mo142861c());
            ((View$OnClickListenerC39023b) this.f100186a).setSelectedChannel(h.mo142862d());
        }
    }

    /* renamed from: a */
    private void m154026a(View$OnClickListenerC39023b bVar) {
        this.f100186a = bVar;
        ((View$OnClickListenerC39023b) this.f100186a).setDepend(new AbstractC39022a() {
            /* class com.ss.android.lark.inno.player.live.p1989a.p1990a.C39024c.C390251 */

            @Override // com.ss.android.lark.inno.player.live.p1989a.p1990a.AbstractC39022a
            /* renamed from: a */
            public void mo142784a(C38938a aVar) {
                ((AbstractC39067e) C39024c.this.mo142707b()).mo142881a(aVar);
            }
        });
        ((View$OnClickListenerC39023b) this.f100186a).setVisibility(8);
        m154027e();
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: d */
    public void mo142591d(int i) {
        if (i == C38943b.f100089n) {
            m154027e();
        } else if (i == C38943b.f100088m) {
            ((View$OnClickListenerC39023b) this.f100186a).setVisibility(0);
        }
    }

    public C39024c(AbstractC39067e eVar, View$OnClickListenerC39023b bVar) {
        super(eVar, bVar);
        m154026a(bVar);
    }
}
