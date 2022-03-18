package com.ss.android.openbusiness.event.p3008a;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.openbusiness.data.netdata.C59572d;

/* renamed from: com.ss.android.openbusiness.event.a.a */
public class C59593a extends BaseEvent {

    /* renamed from: a */
    private boolean f147907a;

    /* renamed from: b */
    private C59572d f147908b;

    /* renamed from: c */
    private int f147909c;

    /* renamed from: a */
    public boolean mo203003a() {
        return this.f147907a;
    }

    /* renamed from: b */
    public C59572d mo203004b() {
        return this.f147908b;
    }

    /* renamed from: c */
    public int mo203005c() {
        return this.f147909c;
    }

    public C59593a(boolean z, C59572d dVar, int i) {
        this.f147907a = z;
        this.f147908b = dVar;
        this.f147909c = i;
    }
}
