package com.ss.android.vc.common.p3080d.p3081a;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.vc.common.p3080d.AbstractRunnableC60727j;
import com.ss.android.vc.common.p3080d.C60714b;
import com.ss.android.vc.common.p3080d.C60723h;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizTask;

/* renamed from: com.ss.android.vc.common.d.a.a */
public class C60712a<R> extends AbstractRunnableC60727j {

    /* renamed from: b */
    public AbstractC63598b f151866b;

    /* renamed from: d */
    private VcBizTask<R> f151867d;

    /* renamed from: e */
    private boolean f151868e;

    /* renamed from: l */
    public C60712a<R> mo208307l() {
        this.f151868e = true;
        return this;
    }

    @Override // com.ss.android.vc.common.p3080d.AbstractRunnableC60727j
    /* renamed from: c */
    public void mo208306c() {
        super.mo208306c();
        this.f151867d.mo219888a();
    }

    public void run() {
        this.f151867d.mo219891a(this.f151868e, new AbstractC63598b<R>() {
            /* class com.ss.android.vc.common.p3080d.p3081a.C60712a.C607131 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(R r) {
                if (C60712a.this.f151866b != null) {
                    C60712a.this.f151866b.onSuccess(r);
                }
                C60712a.this.mo208333b(false);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                if (C60712a.this.f151866b != null) {
                    C60712a.this.f151866b.onError(eVar);
                }
                if (eVar.f160599b.getErrorCode() / HwBuildEx.VersionCodes.CUR_DEVELOPMENT == 22) {
                    C60712a.this.mo208333b(false);
                } else {
                    C60712a.this.mo208333b(true);
                }
            }
        });
    }

    public C60712a(String str, int i, VcBizTask<R> vcBizTask, AbstractC63598b bVar) {
        super(str);
        this.f151867d = vcBizTask;
        this.f151866b = bVar;
        mo208328a(new C60723h(i));
        mo208329a(new C60714b(this, new long[]{2, 4, 8, 16, 32, 60}));
    }
}
