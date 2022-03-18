package com.ss.android.vc.common.p3080d;

import android.text.TextUtils;
import com.ss.android.vc.common.p3080d.p3082b.AbstractC60715a;
import com.ss.android.vc.common.p3080d.p3082b.AbstractC60716b;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.vc.common.d.j */
public abstract class AbstractRunnableC60727j extends AbstractC60715a implements AbstractC60718c, Runnable {

    /* renamed from: a */
    protected AbstractC60716b f151889a;

    /* renamed from: b */
    private String f151890b;

    /* renamed from: d */
    private String f151891d;

    /* renamed from: e */
    private boolean f151892e;

    /* renamed from: f */
    private List<AbstractC60720e> f151893f;

    /* renamed from: g */
    private AbstractC60719d f151894g;

    /* renamed from: h */
    private boolean f151895h;

    /* renamed from: i */
    private boolean f151896i;

    /* renamed from: j */
    private boolean f151897j;

    /* renamed from: k */
    private String f151898k;

    /* renamed from: b */
    public String mo208332b() {
        return this.f151890b;
    }

    /* renamed from: f */
    public boolean mo208337f() {
        return this.f151895h;
    }

    /* renamed from: g */
    public boolean mo208338g() {
        return this.f151892e;
    }

    /* renamed from: h */
    public boolean mo208339h() {
        return this.f151896i;
    }

    /* renamed from: i */
    public AbstractC60716b mo208341i() {
        return this.f151889a;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m235948p() {
        this.f151889a.mo208312j();
    }

    /* renamed from: a */
    public String mo208330a() {
        return this.f151891d;
    }

    /* renamed from: c */
    public void mo208306c() {
        C60724i.m235924a().mo208319a(new Runnable() {
            /* class com.ss.android.vc.common.p3080d.$$Lambda$j$2EaxvJohOh7JNCySq2kObwyjGw */

            public final void run() {
                AbstractRunnableC60727j.this.m235949q();
            }
        });
    }

    @Override // com.ss.android.vc.common.p3080d.p3082b.AbstractC60716b
    /* renamed from: j */
    public void mo208312j() {
        C60724i.m235924a().mo208319a(new Runnable() {
            /* class com.ss.android.vc.common.p3080d.$$Lambda$j$8pQbtiF75bGesZRrQkR7Djrg7g */

            public final void run() {
                AbstractRunnableC60727j.this.m235948p();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo208342k() {
        C60724i.m235924a().mo208319a(new Runnable() {
            /* class com.ss.android.vc.common.p3080d.$$Lambda$j$3irz54wDPXiaubPPhKep3xKPNCw */

            public final void run() {
                AbstractRunnableC60727j.this.m235947o();
            }
        });
    }

    /* renamed from: m */
    private boolean m235945m() {
        AbstractC60719d dVar;
        if (this.f151895h || this.f151896i || (dVar = this.f151894g) == null) {
            return false;
        }
        return dVar.mo208313a();
    }

    /* renamed from: d */
    public String mo208334d() {
        return this.f151891d + "#" + this.f151890b;
    }

    /* renamed from: e */
    public boolean mo208335e() {
        if (mo208339h() || mo208337f()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f151890b, this.f151891d);
    }

    /* renamed from: l */
    private void mo208307l() {
        this.f151896i = true;
        this.f151889a.mo208311a("VcSyncTask", "remove from pool");
        C60724i.m235924a().mo208325c(this);
        m235946n();
        this.f151889a.mo208311a("VcSyncTask", "sync_task_end");
        this.f151889a.mo208312j();
    }

    /* renamed from: n */
    private void m235946n() {
        this.f151889a.mo208311a("VcSyncTask", "clear");
        List<AbstractC60720e> list = this.f151893f;
        if (list != null) {
            for (AbstractC60720e eVar : list) {
                eVar.mo208315c();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m235947o() {
        if (this.f151892e || mo208335e()) {
            this.f151889a.mo208311a("VcSyncTask", "skip because task is running");
        } else if (m235945m()) {
            this.f151889a.mo208311a("VcSyncTask", "sync_task_run");
            this.f151892e = true;
            this.f151897j = true;
            run();
        } else {
            this.f151889a.mo208311a("VcSyncTask", "skip because cannot be retry");
            C60724i.m235924a().mo208323b(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m235949q() {
        if (!mo208335e()) {
            this.f151889a.mo208311a("VcSyncTask", "cancel");
            this.f151895h = true;
            this.f151892e = false;
            m235946n();
            this.f151889a.mo208311a("VcSyncTask", "sync_task_end");
            mo208312j();
            C60724i.m235924a().mo208326d(this);
        }
    }

    public String toString() {
        return "VcSyncTask{mTaskKey='" + this.f151890b + '\'' + ", mGroupName='" + this.f151891d + '\'' + ", mIsRunning=" + this.f151892e + ", mTriggers=" + this.f151893f + ", mRetryPolicy=" + this.f151894g + ", mCancelled=" + this.f151895h + ", mDone=" + this.f151896i + ", mTag='" + this.f151898k + '\'' + '}';
    }

    /* renamed from: a */
    public AbstractRunnableC60727j mo208328a(AbstractC60719d dVar) {
        this.f151894g = dVar;
        return this;
    }

    /* renamed from: a */
    public void mo208331a(AbstractC60716b bVar) {
        this.f151889a = bVar;
        bVar.mo208310a(this);
    }

    /* renamed from: b */
    public void mo208333b(boolean z) {
        C60724i.m235924a().mo208319a(new Runnable(z) {
            /* class com.ss.android.vc.common.p3080d.$$Lambda$j$OZsrrE03VDiMbdMf12cLLf4M81c */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractRunnableC60727j.this.m235943c(this.f$1);
            }
        });
    }

    public AbstractRunnableC60727j(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f151890b = str;
            return;
        }
        throw new IllegalArgumentException("Task key can't be a blank string");
    }

    /* renamed from: a */
    public AbstractRunnableC60727j mo208329a(AbstractC60720e eVar) {
        if (eVar == null) {
            return this;
        }
        if (this.f151893f == null) {
            this.f151893f = new LinkedList();
        }
        this.f151893f.add(eVar);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractRunnableC60727j jVar = (AbstractRunnableC60727j) obj;
        if (!Objects.equals(this.f151890b, jVar.f151890b) || !Objects.equals(this.f151891d, jVar.f151891d)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.common.p3080d.AbstractC60718c
    /* renamed from: a */
    public void mo208305a(boolean z) {
        AbstractC60716b bVar = this.f151889a;
        bVar.mo208311a("VcSyncTask", "net changed:" + z);
        if (this.f151897j && z) {
            this.f151889a.mo208311a("VcSyncTask", "run task beacuse of net connected");
            mo208342k();
        }
        List<AbstractC60720e> list = this.f151893f;
        if (list != null) {
            for (AbstractC60720e eVar : list) {
                eVar.mo208305a(z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m235943c(boolean z) {
        this.f151892e = false;
        if (!mo208335e()) {
            AbstractC60716b bVar = this.f151889a;
            bVar.mo208311a("VcSyncTask", "done:" + z);
            this.f151896i = z ^ true;
            if (z) {
                this.f151889a.mo208311a("VcSyncTask", "retry");
                AbstractRunnableC60727j c = C60724i.m235924a().mo208324c(mo208332b());
                if (c == null) {
                    this.f151889a.mo208311a("VcSyncTask", "start trigger self");
                    List<AbstractC60720e> list = this.f151893f;
                    if (list != null) {
                        for (AbstractC60720e eVar : list) {
                            eVar.mo208314b();
                        }
                    }
                } else if (c == this) {
                    this.f151889a.mo208311a("VcSyncTask", "start trigger self");
                    List<AbstractC60720e> list2 = this.f151893f;
                    if (list2 != null) {
                        for (AbstractC60720e eVar2 : list2) {
                            eVar2.mo208314b();
                        }
                    }
                } else {
                    this.f151889a.mo208311a("VcSyncTask", "start trigger another");
                    C60724i.m235924a().mo208323b(this);
                    c.mo208342k();
                }
            } else {
                mo208307l();
                C60724i.m235924a().mo208326d(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m235942b(String str, String str2) {
        this.f151889a.mo208311a(str, str2);
    }

    @Override // com.ss.android.vc.common.p3080d.p3082b.AbstractC60716b
    /* renamed from: a */
    public void mo208311a(String str, String str2) {
        C60724i.m235924a().mo208319a(new Runnable(str, str2) {
            /* class com.ss.android.vc.common.p3080d.$$Lambda$j$RklJt8AAK7gcgK3BnVgHRoNv1IA */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                AbstractRunnableC60727j.this.m235942b(this.f$1, this.f$2);
            }
        });
    }
}
