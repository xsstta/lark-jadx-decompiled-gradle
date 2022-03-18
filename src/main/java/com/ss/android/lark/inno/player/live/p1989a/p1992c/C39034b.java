package com.ss.android.lark.inno.player.live.p1989a.p1992c;

import android.os.Bundle;
import com.huawei.hms.adapter.internal.CommonCode;
import com.ss.android.lark.inno.player.core.AbstractC39002c;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;
import com.ss.android.lark.inno.player.live.AbstractC39067e;
import com.ss.android.lark.inno.player.live.LivePlayerStatus;
import com.ss.android.lark.inno.player.p1973a.C38942a;
import com.ss.android.lark.inno.player.p1973a.C38943b;

/* renamed from: com.ss.android.lark.inno.player.live.a.c.b */
public class C39034b extends AbstractC39002c<Object, AbstractC39016b> {
    @Override // com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: a */
    public void mo142589a() {
        mo142708b(C38942a.f100057c);
        mo142708b(C38942a.f100060f);
        mo142708b(C38942a.f100059e);
        mo142708b(C38942a.f100061g);
        mo142708b(C38942a.f100067m);
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: c */
    public void mo142590c(int i) {
        if (C38942a.f100057c == i || C38942a.f100065k == i) {
            ((AbstractC39016b) this.f100186a).mo142587a();
        } else if (C38942a.f100061g == i || C38942a.f100060f == i || C38942a.f100059e == i) {
            ((AbstractC39016b) this.f100186a).mo142588b();
        }
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: d */
    public void mo142591d(int i) {
        if (i != C38943b.f100077b) {
            return;
        }
        if (((AbstractC39067e) mo142707b()).mo142889g() == LivePlayerStatus.Preparing) {
            ((AbstractC39016b) this.f100186a).mo142587a();
        } else {
            ((AbstractC39016b) this.f100186a).mo142588b();
        }
    }

    public C39034b(AbstractC39067e eVar, AbstractC39016b bVar) {
        super(eVar, bVar);
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: a */
    public void mo142656a(int i, Bundle bundle) {
        if (C38942a.f100067m == i) {
            bundle.getString(CommonCode.MapKey.HAS_RESOLUTION);
        }
    }
}
