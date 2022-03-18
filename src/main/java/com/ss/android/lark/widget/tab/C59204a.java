package com.ss.android.lark.widget.tab;

import android.content.Context;
import android.view.View;

/* renamed from: com.ss.android.lark.widget.tab.a */
public class C59204a<T extends View, D> {

    /* renamed from: a */
    private int f147015a;

    /* renamed from: b */
    private AbstractC59205a f147016b;

    /* renamed from: c */
    private boolean f147017c = true;

    /* renamed from: d */
    protected Context f147018d;

    /* renamed from: e */
    protected T f147019e;

    /* renamed from: com.ss.android.lark.widget.tab.a$a */
    interface AbstractC59205a {
        /* renamed from: a */
        void mo201280a(boolean z, int i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31305a(Context context) {
    }

    /* renamed from: b */
    public T mo201282b() {
        return this.f147019e;
    }

    /* renamed from: c */
    public void mo201284c() {
        AbstractC59205a aVar = this.f147016b;
        if (aVar != null) {
            aVar.mo201280a(this.f147017c, 0);
        }
        this.f147015a = 0;
        mo201282b().setVisibility(8);
    }

    public C59204a(Context context) {
        this.f147018d = context;
        mo31305a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo201281a(AbstractC59205a aVar) {
        this.f147016b = aVar;
        if (aVar != null) {
            aVar.mo201280a(this.f147017c, this.f147015a);
        }
    }

    /* renamed from: b */
    public void mo201283b(boolean z) {
        this.f147017c = z;
        AbstractC59205a aVar = this.f147016b;
        if (aVar != null) {
            aVar.mo201280a(z, this.f147015a);
        }
    }

    /* renamed from: a */
    public void mo31307a(D d) {
        AbstractC59205a aVar = this.f147016b;
        if (aVar != null && (d instanceof Integer)) {
            aVar.mo201280a(this.f147017c, d.intValue());
        }
        if (d instanceof Integer) {
            this.f147015a = d.intValue();
        }
    }
}
