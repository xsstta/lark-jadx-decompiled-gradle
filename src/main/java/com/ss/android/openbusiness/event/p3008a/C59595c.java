package com.ss.android.openbusiness.event.p3008a;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.openbusiness.OpbScene;
import com.ss.android.openbusiness.data.netdata.C59572d;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.openbusiness.event.a.c */
public class C59595c extends BaseEvent {

    /* renamed from: a */
    private CopyOnWriteArrayList<C59572d> f147911a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C59572d> f147912b;

    /* renamed from: c */
    private final boolean f147913c;

    /* renamed from: d */
    private OpbScene f147914d;

    /* renamed from: e */
    private int f147915e;

    public C59595c() {
    }

    /* renamed from: a */
    public CopyOnWriteArrayList<C59572d> mo203006a() {
        return this.f147911a;
    }

    /* renamed from: b */
    public CopyOnWriteArrayList<C59572d> mo203007b() {
        return this.f147912b;
    }

    /* renamed from: c */
    public boolean mo203008c() {
        return this.f147913c;
    }

    /* renamed from: d */
    public int mo203009d() {
        return this.f147915e;
    }

    public C59595c(OpbScene opbScene, CopyOnWriteArrayList<C59572d> copyOnWriteArrayList, CopyOnWriteArrayList<C59572d> copyOnWriteArrayList2, int i) {
        this.f147913c = true;
        this.f147911a = copyOnWriteArrayList;
        this.f147912b = copyOnWriteArrayList2;
        this.f147914d = opbScene;
        this.f147915e = i;
    }
}
