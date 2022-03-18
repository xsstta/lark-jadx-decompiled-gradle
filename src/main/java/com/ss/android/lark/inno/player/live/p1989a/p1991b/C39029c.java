package com.ss.android.lark.inno.player.live.p1989a.p1991b;

import com.ss.android.lark.inno.player.core.AbstractC39002c;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;
import com.ss.android.lark.inno.player.live.AbstractC39067e;
import com.ss.android.lark.inno.player.live.LivePlayerStatus;
import com.ss.android.lark.inno.player.p1973a.C38942a;
import com.ss.android.lark.inno.player.p1973a.C38943b;

/* renamed from: com.ss.android.lark.inno.player.live.a.b.c */
public class C39029c extends AbstractC39002c<Object, AbstractC39016b> {
    @Override // com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: a */
    public void mo142589a() {
        this.f100188c.add(Integer.valueOf(C38942a.f100059e));
        this.f100188c.add(Integer.valueOf(C38942a.f100057c));
        this.f100188c.add(Integer.valueOf(C38942a.f100061g));
    }

    /* renamed from: a */
    private void m154035a(AbstractC39016b bVar) {
        this.f100186a = bVar;
        ((AbstractC39016b) this.f100186a).setDepend(new AbstractC39026a() {
            /* class com.ss.android.lark.inno.player.live.p1989a.p1991b.C39029c.C390301 */
        });
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: c */
    public void mo142590c(int i) {
        if (i == C38942a.f100059e) {
            ((AbstractC39016b) this.f100186a).mo142587a();
        } else if (i == C38942a.f100057c) {
            ((AbstractC39016b) this.f100186a).mo142588b();
        } else if (i == C38942a.f100061g) {
            ((AbstractC39016b) this.f100186a).mo142588b();
        }
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: d */
    public void mo142591d(int i) {
        if (i != C38943b.f100077b) {
            return;
        }
        if (((AbstractC39067e) mo142707b()).mo142889g() == LivePlayerStatus.Error) {
            ((AbstractC39016b) this.f100186a).mo142587a();
        } else {
            ((AbstractC39016b) this.f100186a).mo142588b();
        }
    }

    public C39029c(AbstractC39067e eVar, AbstractC39016b bVar) {
        super(eVar, bVar);
        m154035a(bVar);
    }
}
