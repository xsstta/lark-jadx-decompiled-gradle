package com.bytedance.ee.lark.infra.network.ref.p636b;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.network.ref.entity.AbstractC12877d;
import com.bytedance.ee.lark.infra.network.ref.entity.C12875b;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.entity.C12880g;
import com.bytedance.ee.lark.infra.network.ref.entity.C12883i;
import com.bytedance.ee.lark.infra.network.ref.entity.ECOTaskState;
import com.bytedance.ee.lark.infra.network.ref.p635a.AbstractC12860j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.b.f */
public class C12870f {

    /* renamed from: a */
    private C12880g f34353a;

    /* renamed from: b */
    private List<C12872h> f34354b = new ArrayList();

    /* renamed from: c */
    private AbstractC12877d f34355c;

    /* renamed from: d */
    private AtomicReference<ECOTaskState> f34356d = new AtomicReference<>(ECOTaskState.TASK_INIT);

    /* renamed from: e */
    private C12878e f34357e;

    /* renamed from: f */
    private AbstractC12860j f34358f;

    /* renamed from: g */
    private String f34359g;

    /* renamed from: a */
    public String mo48516a() {
        return this.f34359g;
    }

    /* renamed from: c */
    public List<C12872h> mo48519c() {
        return this.f34354b;
    }

    /* renamed from: d */
    public C12880g mo48520d() {
        return this.f34353a;
    }

    /* renamed from: e */
    public C12878e mo48521e() {
        return this.f34357e;
    }

    /* renamed from: f */
    public AbstractC12877d mo48522f() {
        return this.f34355c;
    }

    /* renamed from: g */
    public C12883i mo48523g() throws Exception {
        return this.f34358f.mo48486a();
    }

    /* renamed from: b */
    public ECOTaskState mo48518b() {
        return this.f34356d.get();
    }

    /* renamed from: h */
    private String m53105h() {
        String requestId = this.f34357e.mo48553b().getRequestId();
        if (!TextUtils.isEmpty(requestId)) {
            return requestId;
        }
        return C12875b.m53136a();
    }

    /* renamed from: a */
    public void mo48517a(ECOTaskState eCOTaskState) {
        this.f34356d.set(eCOTaskState);
    }

    public C12870f(C12878e eVar, AbstractC12877d dVar, AbstractC12860j jVar, C12880g gVar, List<C12872h> list) {
        this.f34357e = eVar;
        this.f34355c = dVar;
        this.f34358f = jVar;
        this.f34353a = gVar;
        if (list != null) {
            this.f34354b = list;
        }
        this.f34359g = m53105h();
    }
}
