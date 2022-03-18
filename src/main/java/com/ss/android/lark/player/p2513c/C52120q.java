package com.ss.android.lark.player.p2513c;

import android.content.Context;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.lark.player.entity.C52129a;
import com.ss.android.lark.player.entity.DataSource;
import com.ss.android.lark.player.p2513c.AbstractC52102a;
import com.ss.android.lark.player.p2513c.C52117p;
import com.ss.ttvideoengine.VideoEngineInfoListener;
import com.ss.ttvideoengine.VideoEngineInfos;

/* renamed from: com.ss.android.lark.player.c.q */
public class C52120q implements AbstractC52107b {

    /* renamed from: a */
    public C52117p f129320a = new C52117p(1000);

    /* renamed from: b */
    public AbstractC52109j f129321b;

    /* renamed from: c */
    public VideoEngineInfoListener f129322c;

    /* renamed from: d */
    private AbstractC52102a f129323d;

    /* renamed from: e */
    private DataSource f129324e;

    /* renamed from: f */
    private AbstractC52111l f129325f;

    /* renamed from: g */
    private AbstractC52110k f129326g;

    /* renamed from: h */
    private AbstractC52102a.AbstractC52103a f129327h;

    /* renamed from: i */
    private C52117p.AbstractC52119a f129328i = new C52117p.AbstractC52119a() {
        /* class com.ss.android.lark.player.p2513c.C52120q.C521211 */

        @Override // com.ss.android.lark.player.p2513c.C52117p.AbstractC52119a
        /* renamed from: a */
        public void mo178532a() {
            int d = C52120q.this.mo178500d();
            int e = C52120q.this.mo178501e();
            int l = C52120q.this.mo178542l();
            if (e > 0 && d >= 0) {
                Bundle a = C52129a.m202238a();
                a.putInt("int_arg1", d);
                a.putInt("int_arg2", e);
                a.putInt("int_arg3", l);
                C52120q.this.mo178535a(-99019, a);
            }
        }
    };

    /* renamed from: j */
    private AbstractC52111l f129329j = new AbstractC52111l() {
        /* class com.ss.android.lark.player.p2513c.C52120q.C521222 */

        @Override // com.ss.android.lark.player.p2513c.AbstractC52111l
        /* renamed from: a */
        public void mo140068a(int i, Bundle bundle) {
            C52120q.this.f129320a.mo178525a(i, bundle);
            C52120q.this.mo178535a(i, bundle);
        }
    };

    /* renamed from: k */
    private AbstractC52110k f129330k = new AbstractC52110k() {
        /* class com.ss.android.lark.player.p2513c.C52120q.C521233 */

        @Override // com.ss.android.lark.player.p2513c.AbstractC52110k
        /* renamed from: a */
        public void mo140067a(int i, Bundle bundle) {
            C52120q.this.f129320a.mo178529b(i, bundle);
            C52120q.this.mo178540b(i, bundle);
        }
    };

    /* renamed from: l */
    private AbstractC52109j f129331l = new AbstractC52109j() {
        /* class com.ss.android.lark.player.p2513c.C52120q.C521244 */

        @Override // com.ss.android.lark.player.p2513c.AbstractC52109j
        /* renamed from: a */
        public void mo178515a(int i, Bundle bundle) {
            if (C52120q.this.f129321b != null) {
                C52120q.this.f129321b.mo178515a(i, bundle);
            }
        }
    };

    /* renamed from: m */
    private AbstractC52102a.AbstractC52103a f129332m = new AbstractC52102a.AbstractC52103a() {
        /* class com.ss.android.lark.player.p2513c.$$Lambda$q$THIOvb0s2lEWDwhiRNpoEXLLwFw */

        @Override // com.ss.android.lark.player.p2513c.AbstractC52102a.AbstractC52103a
        public final void onVideoSizeChanged(float f, float f2) {
            C52120q.this.m202190a((C52120q) f, f2);
        }
    };

    /* renamed from: n */
    private final VideoEngineInfoListener f129333n = new VideoEngineInfoListener() {
        /* class com.ss.android.lark.player.p2513c.C52120q.C521255 */

        @Override // com.ss.ttvideoengine.VideoEngineInfoListener
        public void onVideoEngineInfos(VideoEngineInfos videoEngineInfos) {
            if (C52120q.this.f129322c != null) {
                C52120q.this.f129322c.onVideoEngineInfos(videoEngineInfos);
            }
        }
    };

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178493a(VideoEngineInfoListener videoEngineInfoListener) {
        this.f129322c = videoEngineInfoListener;
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178491a(DataSource dataSource) {
        this.f129324e = dataSource;
        m202193m();
        m202191b(dataSource);
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178495a(boolean z) {
        if (m202195o()) {
            this.f129323d.mo178495a(z);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178494a(String str) {
        if (m202195o()) {
            this.f129323d.mo178494a(str);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178492a(com.ss.ttvideoengine.DataSource dataSource) {
        if (m202195o()) {
            this.f129323d.mo178492a(dataSource);
        }
    }

    /* renamed from: o */
    private boolean m202195o() {
        if (this.f129323d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo178533a() {
        m202192d(0);
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: e */
    public int mo178501e() {
        if (m202195o()) {
            return this.f129323d.mo178501e();
        }
        return 0;
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: f */
    public void mo178502f() {
        if (m202195o()) {
            this.f129323d.mo178502f();
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: g */
    public void mo178503g() {
        if (m202195o()) {
            this.f129323d.mo178503g();
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: h */
    public void mo178504h() {
        if (m202195o()) {
            this.f129323d.mo178504h();
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: i */
    public void mo178505i() {
        if (m202195o()) {
            this.f129323d.mo178505i();
        }
        m202194n();
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: j */
    public boolean mo178506j() {
        if (m202195o()) {
            return this.f129323d.mo178506j();
        }
        return true;
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: k */
    public boolean mo178507k() {
        if (m202195o()) {
            return this.f129323d.mo178507k();
        }
        return false;
    }

    /* renamed from: l */
    public int mo178542l() {
        if (m202195o()) {
            return this.f129323d.mo178474a();
        }
        return 0;
    }

    /* renamed from: n */
    private void m202194n() {
        this.f129320a.mo178526a((C52117p.AbstractC52119a) null);
        AbstractC52102a aVar = this.f129323d;
        if (aVar != null) {
            aVar.mo178480a((AbstractC52111l) null);
            this.f129323d.mo178479a((AbstractC52110k) null);
            this.f129323d.mo178478a((AbstractC52109j) null);
            this.f129323d.mo178493a((VideoEngineInfoListener) null);
        }
    }

    /* renamed from: b */
    public int mo178539b() {
        if (m202195o()) {
            return this.f129323d.mo178481b();
        }
        return 0;
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: c */
    public boolean mo178499c() {
        if (!m202195o() || !this.f129323d.mo178499c()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: d */
    public int mo178500d() {
        if (m202195o()) {
            return this.f129323d.mo178500d();
        }
        return 0;
    }

    /* renamed from: m */
    private void m202193m() {
        this.f129320a.mo178526a(this.f129328i);
        AbstractC52102a aVar = this.f129323d;
        if (aVar != null) {
            aVar.mo178480a(this.f129329j);
            this.f129323d.mo178479a(this.f129330k);
            this.f129323d.mo178478a(this.f129331l);
            this.f129323d.mo178493a(this.f129333n);
        }
    }

    /* renamed from: a */
    public void mo178536a(AbstractC52102a.AbstractC52103a aVar) {
        this.f129327h = aVar;
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: b */
    public void mo178496b(int i) {
        m202192d(i);
    }

    /* renamed from: c */
    public void mo178541c(boolean z) {
        this.f129320a.mo178527a(z);
    }

    /* renamed from: b */
    private void m202191b(DataSource dataSource) {
        if (m202195o()) {
            this.f129323d.mo178491a(dataSource);
        }
    }

    /* renamed from: d */
    private void m202192d(int i) {
        if (m202195o()) {
            this.f129323d.mo178496b(i);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: c */
    public void mo178498c(int i) {
        if (m202195o()) {
            this.f129323d.mo178498c(i);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178488a(float f) {
        if (m202195o()) {
            this.f129323d.mo178488a(f);
        }
    }

    /* renamed from: a */
    public void mo178534a(int i) {
        DataSource dataSource = this.f129324e;
        if (dataSource != null) {
            m202191b(dataSource);
            m202192d(i);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: b */
    public void mo178497b(boolean z) {
        if (m202195o()) {
            this.f129323d.mo178497b(z);
        }
    }

    public C52120q(Context context) {
        C52114o oVar = new C52114o(context.getApplicationContext());
        this.f129323d = oVar;
        oVar.mo178477a(this.f129332m);
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178489a(Surface surface) {
        if (m202195o()) {
            this.f129323d.mo178489a(surface);
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52107b
    /* renamed from: a */
    public void mo178490a(SurfaceHolder surfaceHolder) {
        if (m202195o()) {
            this.f129323d.mo178490a(surfaceHolder);
        }
    }

    /* renamed from: a */
    public void mo178537a(AbstractC52110k kVar) {
        this.f129326g = kVar;
    }

    /* renamed from: a */
    public void mo178538a(AbstractC52111l lVar) {
        this.f129325f = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m202190a(float f, float f2) {
        AbstractC52102a.AbstractC52103a aVar = this.f129327h;
        if (aVar != null) {
            aVar.onVideoSizeChanged(f, f2);
        }
    }

    /* renamed from: b */
    public void mo178540b(int i, Bundle bundle) {
        AbstractC52110k kVar = this.f129326g;
        if (kVar != null) {
            kVar.mo140067a(i, bundle);
        }
    }

    /* renamed from: a */
    public void mo178535a(int i, Bundle bundle) {
        AbstractC52111l lVar = this.f129325f;
        if (lVar != null) {
            lVar.mo140068a(i, bundle);
        }
    }
}
