package com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1984c;

import com.huawei.hms.adapter.internal.CommonCode;
import com.ss.android.lark.inno.player.core.AbstractC39004e;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;
import com.ss.android.lark.inno.player.layer.C39019e;
import com.ss.android.lark.inno.player.p1973a.C38943b;
import com.ss.android.lark.inno.player.p1978c.AbstractC38996e;
import com.ss.android.lark.inno.player.p1978c.p1988c.C38992a;

/* renamed from: com.ss.android.lark.inno.player.c.b.a.c.c */
public class C38966c extends AbstractC39004e<Object, AbstractC39016b> {
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
            ((AbstractC39016b) this.f100186a).mo142587a();
        }
    }

    /* renamed from: a */
    private void m153738a(AbstractC39016b bVar) {
        this.f100186a = bVar;
        ((AbstractC39016b) this.f100186a).setDepend(new AbstractC38964a() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1984c.C38966c.C389671 */

            @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1984c.AbstractC38964a
            /* renamed from: a */
            public C38992a mo142604a() {
                return ((AbstractC38996e) C38966c.this.mo142707b()).mo142699k();
            }

            @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1984c.AbstractC38964a
            /* renamed from: b */
            public void mo142606b() {
                ((AbstractC38996e) C38966c.this.mo142707b()).mo142700a(C38943b.f100087l);
            }

            @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1984c.AbstractC38964a
            /* renamed from: a */
            public void mo142605a(C38992a.C38994a aVar) {
                ((AbstractC38996e) C38966c.this.mo142707b()).mo142688a(aVar);
                ((AbstractC38996e) C38966c.this.mo142707b()).mo142701a(C38943b.f100093r, new C39019e().mo142756a(CommonCode.MapKey.HAS_RESOLUTION, aVar.f100177b).mo142755a());
            }
        });
        ((AbstractC39016b) this.f100186a).setVisibility(8);
    }

    public C38966c(AbstractC38996e eVar, AbstractC39016b bVar) {
        super(eVar, bVar);
        m153738a(bVar);
    }
}
