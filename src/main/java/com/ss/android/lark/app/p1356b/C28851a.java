package com.ss.android.lark.app.p1356b;

import com.bytedance.apm.trace.p155a.C3069b;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.biz.core.api.AbstractC29561h;
import com.ss.android.lark.biz.core.api.AbstractC29585t;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.widget.recyclerview.C58994g;

/* renamed from: com.ss.android.lark.app.b.a */
public class C28851a {

    /* renamed from: a */
    public Boolean f72467a;

    /* renamed from: b */
    public C3069b f72468b;

    /* renamed from: c */
    public C3069b f72469c;

    /* renamed from: d */
    public boolean f72470d = true;

    /* renamed from: e */
    public boolean f72471e;

    /* renamed from: f */
    ICoreApi f72472f = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* renamed from: g */
    private Boolean f72473g;

    /* renamed from: h */
    private final Runnable f72474h = new Runnable() {
        /* class com.ss.android.lark.app.p1356b.C28851a.RunnableC288521 */

        public void run() {
            if (C28851a.this.f72468b != null) {
                C28851a.this.f72468b.mo12926b();
            }
        }
    };

    /* renamed from: i */
    private final C58994g.AbstractC58995a f72475i = new C58994g.AbstractC58995a() {
        /* class com.ss.android.lark.app.p1356b.C28851a.C288532 */

        @Override // com.ss.android.lark.widget.recyclerview.C58994g.AbstractC58995a
        /* renamed from: b */
        public void mo102522b() {
            if (C28851a.this.f72467a.booleanValue() && C28851a.this.f72469c != null) {
                C28851a.this.f72469c.mo12926b();
                C28851a.this.f72469c = null;
            }
        }

        @Override // com.ss.android.lark.widget.recyclerview.C58994g.AbstractC58995a
        /* renamed from: a */
        public void mo102521a() {
            if (C28851a.this.f72467a.booleanValue() && !C28851a.this.f72471e) {
                C28851a.this.f72469c = new C3069b("main_start_1_min_scroll");
                C28851a.this.f72469c.mo12923a();
            }
        }
    };

    /* renamed from: j */
    private final AbstractC29561h f72476j = new AbstractC29561h() {
        /* class com.ss.android.lark.app.p1356b.C28851a.C288543 */

        @Override // com.ss.android.lark.biz.core.api.AbstractC29561h
        /* renamed from: a */
        public void mo102523a(Class cls) {
            C28851a aVar = C28851a.this;
            aVar.mo102516a(aVar.f72470d);
            C28851a.this.f72470d = false;
        }
    };

    /* renamed from: k */
    private final AbstractC29585t f72477k = new AbstractC29585t() {
        /* class com.ss.android.lark.app.p1356b.C28851a.C288554 */

        @Override // com.ss.android.lark.biz.core.api.AbstractC29585t
        /* renamed from: a */
        public void mo102524a(Class cls) {
            C28851a.this.mo102519d();
        }
    };

    /* renamed from: c */
    public void mo102518c() {
        UICallbackExecutor.executeDelayed(new Runnable() {
            /* class com.ss.android.lark.app.p1356b.C28851a.RunnableC288565 */

            public void run() {
                C28851a.this.f72471e = true;
            }
        }, 60000);
    }

    /* renamed from: b */
    public void mo102517b() {
        this.f72472f.removeBackToFrontEventListener(this.f72476j);
        this.f72472f.removeFrontToBackEventListener(this.f72477k);
        C58994g.m228970b(this.f72475i);
    }

    /* renamed from: d */
    public void mo102519d() {
        if (this.f72473g.booleanValue()) {
            C3069b bVar = this.f72468b;
            if (bVar != null) {
                bVar.mo12926b();
                this.f72468b = null;
            }
            UICallbackExecutor.removeCallbacks(this.f72474h);
        }
    }

    /* renamed from: a */
    public void mo102515a() {
        this.f72473g = Boolean.valueOf(C37239a.m146648b().mo136952a("lark.android.full.fps", false));
        this.f72467a = Boolean.valueOf(C37239a.m146648b().mo136952a("lark.android.minute.scroll.fps", false));
        this.f72472f.addBackToFrontEventListener(this.f72476j);
        this.f72472f.addFrontToBackEventListener(this.f72477k);
        C58994g.m228968a(this.f72475i);
    }

    /* renamed from: a */
    public void mo102516a(boolean z) {
        String str;
        if (this.f72473g.booleanValue()) {
            if (z) {
                str = "main_start_1_min";
            } else if (this.f72468b == null) {
                str = "main_front_1_min";
            } else {
                return;
            }
            C3069b bVar = new C3069b(str);
            this.f72468b = bVar;
            bVar.mo12923a();
            UICallbackExecutor.executeDelayed(this.f72474h, 60000);
        }
    }
}
