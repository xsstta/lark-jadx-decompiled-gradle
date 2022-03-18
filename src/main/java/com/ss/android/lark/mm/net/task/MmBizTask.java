package com.ss.android.lark.mm.net.task;

import android.os.SystemClock;
import com.ss.android.lark.mm.net.AbstractRunnableC47072d;
import com.ss.android.lark.mm.net.C47056a;
import com.ss.android.lark.mm.net.C47066b;
import com.ss.android.lark.mm.net.MmHttpResponse;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.net.task.MmBizTask;
import com.ss.android.lark.mm.p2288b.C45855f;

public class MmBizTask<T> {

    /* renamed from: a */
    public volatile boolean f118487a;

    /* renamed from: b */
    public volatile boolean f118488b = true;

    /* renamed from: c */
    public volatile TaskStatus f118489c = TaskStatus.NONE;

    /* renamed from: d */
    public AbstractC47070c f118490d;

    /* renamed from: e */
    public C47066b.C47067a f118491e;

    public enum TaskStatus {
        NONE,
        STARTED,
        ERROR,
        SUC,
        CANCEL
    }

    /* renamed from: a */
    public void mo165339a() {
        this.f118487a = true;
        this.f118490d = null;
        this.f118489c = TaskStatus.CANCEL;
    }

    /* renamed from: a */
    public MmBizTask mo165337a(AbstractC47070c<T> cVar) {
        mo165342b(cVar, false);
        return this;
    }

    /* renamed from: b */
    public MmBizTask mo165341b(AbstractC47070c<T> cVar) {
        mo165342b(cVar, true);
        return this;
    }

    public MmBizTask(C47066b.C47067a aVar) {
        this.f118491e = aVar;
    }

    /* renamed from: c */
    public MmBizTask<T> mo165343c(final AbstractC47070c<T> cVar) {
        C47066b.C47067a aVar = this.f118491e;
        if (aVar != null) {
            MmBizTaskCache.m186360a().mo165344a(aVar.mo165301a(), new AbstractC47070c<T>() {
                /* class com.ss.android.lark.mm.net.task.MmBizTask.C470741 */

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161289a(T t) {
                    C45855f.m181664c("MmBizTask@", "[startForDetailCache] onSuccess ");
                    cVar.mo161289a((Object) t);
                }

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                    C45855f.m181664c("MmBizTask@", "[startForDetailCache] onError: " + aVar);
                    MmBizTask.this.mo165342b(cVar, false);
                }
            });
            this.f118489c = TaskStatus.STARTED;
            return this;
        }
        throw new IllegalArgumentException("MmBizTask start mBuilder null");
    }

    /* renamed from: a */
    public MmBizTask mo165338a(AbstractC47070c<T> cVar, boolean z) {
        this.f118488b = z;
        mo165337a(cVar);
        return this;
    }

    /* renamed from: b */
    public MmBizTask<T> mo165342b(AbstractC47070c<T> cVar, final boolean z) {
        C47066b.C47067a aVar = this.f118491e;
        if (aVar != null) {
            this.f118490d = cVar;
            final C47066b a = aVar.mo165301a();
            C47056a.m186230a(this.f118491e.mo165301a(), new AbstractC47070c<T>(cVar) {
                /* class com.ss.android.lark.mm.net.task.MmBizTask.C470752 */

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                    C45855f.m181663b("MmBizTask@", "onError " + aVar + " cancel " + MmBizTask.this.f118487a + " " + MmBizTask.this.f118491e);
                    new AbstractRunnableC47072d(aVar, z, a) {
                        /* class com.ss.android.lark.mm.net.task.$$Lambda$MmBizTask$2$01x_O3QTz66y66s5QvZAfm8VSk */
                        public final /* synthetic */ C47068a f$1;
                        public final /* synthetic */ boolean f$2;
                        public final /* synthetic */ C47066b f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        @Override // com.ss.android.lark.mm.net.AbstractRunnableC47072d
                        /* renamed from: a */
                        public /* synthetic */ void mo165318a(boolean z) {
                            AbstractRunnableC47072d.CC.$default$a(this, z);
                        }

                        public final void run() {
                            MmBizTask.C470752.this.m186356a((MmBizTask.C470752) this.f$1, (C47068a) this.f$2, (boolean) this.f$3);
                        }
                    }.mo165318a(MmBizTask.this.f118488b);
                }

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161289a(T t) {
                    C45855f.m181663b("MmBizTask@", "onSuccess cancel " + MmBizTask.this.f118487a + " " + MmBizTask.this.f118491e);
                    new AbstractRunnableC47072d(t, z, a) {
                        /* class com.ss.android.lark.mm.net.task.$$Lambda$MmBizTask$2$d6azTv1Sv3Cd7iFfAB3GrzynK8 */
                        public final /* synthetic */ Object f$1;
                        public final /* synthetic */ boolean f$2;
                        public final /* synthetic */ C47066b f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        @Override // com.ss.android.lark.mm.net.AbstractRunnableC47072d
                        /* renamed from: a */
                        public /* synthetic */ void mo165318a(boolean z) {
                            AbstractRunnableC47072d.CC.$default$a(this, z);
                        }

                        public final void run() {
                            MmBizTask.C470752.this.m186357a((MmBizTask.C470752) this.f$1, (Object) this.f$2, (boolean) this.f$3);
                        }
                    }.mo165318a(MmBizTask.this.f118488b);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m186356a(C47068a aVar, boolean z, C47066b bVar) {
                    if (!MmBizTask.this.f118487a) {
                        MmBizTask.this.f118489c = TaskStatus.ERROR;
                        if (MmBizTask.this.f118490d != null) {
                            MmBizTask.this.f118490d.mo161288a(aVar);
                            MmBizTask.this.f118490d = null;
                        }
                        if (z) {
                            MmBizTask.this.mo165340a(bVar, null, aVar);
                        }
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m186357a(Object obj, boolean z, C47066b bVar) {
                    if (!MmBizTask.this.f118487a) {
                        MmBizTask.this.f118489c = TaskStatus.SUC;
                        if (MmBizTask.this.f118490d != null) {
                            MmBizTask.this.f118490d.mo161289a(obj);
                            MmBizTask.this.f118490d = null;
                        }
                        if (z) {
                            MmBizTask.this.mo165340a(bVar, obj, null);
                        }
                    }
                }
            }, a.f118457h);
            this.f118489c = TaskStatus.STARTED;
            return this;
        }
        throw new IllegalArgumentException("MmBizTask start mBuilder null");
    }

    /* renamed from: a */
    public void mo165340a(C47066b bVar, T t, C47068a aVar) {
        MmBizTaskCache.m186360a().mo165345a(bVar, new MmHttpResponse<>(t, aVar, SystemClock.elapsedRealtime()));
    }
}
