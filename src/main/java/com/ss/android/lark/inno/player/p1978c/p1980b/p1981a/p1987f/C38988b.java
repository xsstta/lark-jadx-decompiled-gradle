package com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1987f;

import com.ss.android.lark.inno.player.core.AbstractC39004e;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;
import com.ss.android.lark.inno.player.p1973a.C38942a;
import com.ss.android.lark.inno.player.p1973a.C38943b;
import com.ss.android.lark.inno.player.p1978c.AbstractC38996e;

/* renamed from: com.ss.android.lark.inno.player.c.b.a.f.b */
public class C38988b extends AbstractC39004e<Object, AbstractC39016b> {
    @Override // com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: a */
    public void mo142589a() {
        this.f100188c.add(Integer.valueOf(C38942a.f100058d));
        this.f100188c.add(Integer.valueOf(C38943b.f100077b));
        this.f100188c.add(Integer.valueOf(C38943b.f100083h));
        this.f100188c.add(Integer.valueOf(C38943b.f100086k));
        this.f100188c.add(Integer.valueOf(C38943b.f100090o));
        this.f100188c.add(Integer.valueOf(C38943b.f100091p));
        this.f100188c.add(Integer.valueOf(C38943b.f100085j));
        this.f100188c.add(Integer.valueOf(C38943b.f100087l));
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: c */
    public void mo142590c(int i) {
        if (i == C38942a.f100058d) {
            ((AbstractC39016b) this.f100186a).mo142587a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo142669a(AbstractC39016b bVar) {
        this.f100186a = bVar;
        ((AbstractC39016b) this.f100186a).setDepend(new AbstractC38987a() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1987f.C38988b.C389891 */

            @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1987f.AbstractC38987a
            /* renamed from: a */
            public boolean mo142668a() {
                return ((AbstractC38996e) C38988b.this.mo142707b()).mo142694f();
            }

            @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1987f.AbstractC38987a
            /* renamed from: a */
            public void mo142667a(boolean z) {
                ((AbstractC38996e) C38988b.this.mo142707b()).mo142690a(z);
            }
        });
        ((AbstractC39016b) this.f100186a).setVisibility(8);
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: d */
    public void mo142591d(int i) {
        if (i == C38943b.f100077b) {
            ((AbstractC39016b) this.f100186a).mo142587a();
        } else if (i == C38943b.f100083h) {
            ((AbstractC39016b) this.f100186a).mo142588b();
        } else if (i == C38943b.f100086k) {
            ((AbstractC39016b) this.f100186a).mo142588b();
        } else if (i == C38943b.f100090o) {
            ((AbstractC39016b) this.f100186a).mo142588b();
        } else if (i == C38943b.f100091p) {
            ((AbstractC39016b) this.f100186a).mo142587a();
        } else if (i == C38943b.f100085j) {
            ((AbstractC39016b) this.f100186a).mo142587a();
        } else if (i == C38943b.f100087l) {
            ((AbstractC39016b) this.f100186a).mo142587a();
        }
    }

    public C38988b(AbstractC38996e eVar, AbstractC39016b bVar) {
        super(eVar, bVar);
        mo142669a(bVar);
    }
}
