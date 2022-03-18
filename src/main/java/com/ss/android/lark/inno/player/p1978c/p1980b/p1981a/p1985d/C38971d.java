package com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1985d;

import com.ss.android.lark.inno.player.core.AbstractC39004e;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;
import com.ss.android.lark.inno.player.p1973a.C38943b;
import com.ss.android.lark.inno.player.p1978c.AbstractC38996e;

/* renamed from: com.ss.android.lark.inno.player.c.b.a.d.d */
public class C38971d extends AbstractC39004e<Object, AbstractC39016b> {
    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: c */
    public void mo142590c(int i) {
    }

    @Override // com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: a */
    public void mo142589a() {
        this.f100188c.add(Integer.valueOf(C38943b.f100083h));
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: d */
    public void mo142591d(int i) {
        if (i == C38943b.f100083h) {
            ((AbstractC39016b) this.f100186a).mo142587a();
        }
    }

    /* renamed from: a */
    private void m153755a(AbstractC39016b bVar) {
        this.f100186a = bVar;
        ((AbstractC39016b) this.f100186a).setDepend(new AbstractC38968a() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1985d.C38971d.C389721 */

            @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1985d.AbstractC38968a
            /* renamed from: a */
            public float mo142609a() {
                return ((AbstractC38996e) C38971d.this.mo142707b()).mo142695g();
            }

            @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1985d.AbstractC38968a
            /* renamed from: b */
            public void mo142611b() {
                ((AbstractC38996e) C38971d.this.mo142707b()).mo142700a(C38943b.f100085j);
            }

            @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1985d.AbstractC38968a
            /* renamed from: a */
            public void mo142610a(float f) {
                ((AbstractC38996e) C38971d.this.mo142707b()).mo142687a(f);
            }
        });
        ((AbstractC39016b) this.f100186a).setVisibility(8);
    }

    public C38971d(AbstractC38996e eVar, AbstractC39016b bVar) {
        super(eVar, bVar);
        m153755a(bVar);
    }
}
