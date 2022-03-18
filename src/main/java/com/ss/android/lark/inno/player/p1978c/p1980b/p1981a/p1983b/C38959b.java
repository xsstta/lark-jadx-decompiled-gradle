package com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1983b;

import android.os.Bundle;
import com.huawei.hms.adapter.internal.CommonCode;
import com.ss.android.lark.inno.player.core.AbstractC39004e;
import com.ss.android.lark.inno.player.p1973a.C38942a;
import com.ss.android.lark.inno.player.p1973a.C38943b;
import com.ss.android.lark.inno.player.p1978c.AbstractC38996e;
import com.ss.android.lark.mm.p2288b.C45855f;

/* renamed from: com.ss.android.lark.inno.player.c.b.a.b.b */
public class C38959b extends AbstractC39004e<Object, C38961c> {
    @Override // com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: a */
    public void mo142589a() {
        this.f100188c.add(Integer.valueOf(C38943b.f100092q));
        this.f100188c.add(Integer.valueOf(C38943b.f100093r));
        this.f100188c.add(Integer.valueOf(C38942a.f100063i));
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: c */
    public void mo142590c(int i) {
        if (i == C38942a.f100063i) {
            ((C38961c) this.f100186a).mo142587a();
        }
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: d */
    public void mo142591d(int i) {
        if (i == C38943b.f100092q) {
            ((C38961c) this.f100186a).mo142587a();
        }
    }

    /* renamed from: a */
    private void m153708a(C38961c cVar) {
        this.f100186a = cVar;
        ((C38961c) this.f100186a).setDepend(new AbstractC38958a() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1983b.C38959b.C389601 */

            @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1983b.AbstractC38958a
            /* renamed from: a */
            public int mo142594a() {
                return ((AbstractC38996e) C38959b.this.mo142707b()).mo142699k().f100175b;
            }

            @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1983b.AbstractC38958a
            /* renamed from: a */
            public void mo142595a(int i) {
                C45855f.m181663b("LiveVideoPlayTipLayer", "start time:" + System.currentTimeMillis());
                ((AbstractC38996e) C38959b.this.mo142707b()).mo142688a(((AbstractC38996e) C38959b.this.mo142707b()).mo142699k().mo142683b(i));
                C45855f.m181663b("LiveVideoPlayTipLayer", "end time" + System.currentTimeMillis());
            }
        });
        ((C38961c) this.f100186a).setVisibility(8);
    }

    public C38959b(AbstractC38996e eVar, C38961c cVar) {
        super(eVar, cVar);
        m153708a(cVar);
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: b */
    public void mo142596b(int i, Bundle bundle) {
        if (i == C38943b.f100093r && bundle != null && bundle.containsKey(CommonCode.MapKey.HAS_RESOLUTION)) {
            ((C38961c) this.f100186a).mo142597a(bundle.getInt(CommonCode.MapKey.HAS_RESOLUTION));
        }
    }
}
