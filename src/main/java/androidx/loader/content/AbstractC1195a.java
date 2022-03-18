package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import androidx.core.util.C0847h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: androidx.loader.content.a */
public abstract class AbstractC1195a<D> extends C1198c<D> {

    /* renamed from: a */
    volatile AbstractC1195a<D>.RunnableC1196a f4332a;

    /* renamed from: b */
    volatile AbstractC1195a<D>.RunnableC1196a f4333b;

    /* renamed from: c */
    long f4334c;

    /* renamed from: d */
    long f4335d;

    /* renamed from: e */
    Handler f4336e;

    /* renamed from: f */
    private final Executor f4337f;

    /* renamed from: a */
    public void mo6096a(D d) {
    }

    /* renamed from: d */
    public abstract D mo6101d();

    /* renamed from: f */
    public void mo6103f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public D mo6102e() {
        return mo6101d();
    }

    /* renamed from: g */
    public boolean mo6104g() {
        if (this.f4333b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.loader.content.a$a */
    public final class RunnableC1196a extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* renamed from: a */
        boolean f4338a;

        /* renamed from: f */
        private final CountDownLatch f4340f = new CountDownLatch(1);

        public void run() {
            this.f4338a = false;
            AbstractC1195a.this.mo6100c();
        }

        RunnableC1196a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public D mo6079a(Void... voidArr) {
            try {
                return (D) AbstractC1195a.this.mo6102e();
            } catch (OperationCanceledException e) {
                if (mo6087c()) {
                    return null;
                }
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.loader.content.ModernAsyncTask
        /* renamed from: b */
        public void mo6084b(D d) {
            try {
                AbstractC1195a.this.mo6095a(this, d);
            } finally {
                this.f4340f.countDown();
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.loader.content.ModernAsyncTask
        /* renamed from: a */
        public void mo6081a(D d) {
            try {
                AbstractC1195a.this.mo6098b(this, d);
            } finally {
                this.f4340f.countDown();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.content.C1198c
    /* renamed from: a */
    public void mo6094a() {
        super.mo6094a();
        mo6129r();
        this.f4332a = new RunnableC1196a();
        mo6100c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.content.C1198c
    /* renamed from: b */
    public boolean mo6099b() {
        if (this.f4332a == null) {
            return false;
        }
        if (!this.f4353r) {
            this.f4356u = true;
        }
        if (this.f4333b != null) {
            if (this.f4332a.f4338a) {
                this.f4332a.f4338a = false;
                this.f4336e.removeCallbacks(this.f4332a);
            }
            this.f4332a = null;
            return false;
        } else if (this.f4332a.f4338a) {
            this.f4332a.f4338a = false;
            this.f4336e.removeCallbacks(this.f4332a);
            this.f4332a = null;
            return false;
        } else {
            boolean a = this.f4332a.mo6082a(false);
            if (a) {
                this.f4333b = this.f4332a;
                mo6103f();
            }
            this.f4332a = null;
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6100c() {
        if (this.f4333b == null && this.f4332a != null) {
            if (this.f4332a.f4338a) {
                this.f4332a.f4338a = false;
                this.f4336e.removeCallbacks(this.f4332a);
            }
            if (this.f4334c <= 0 || SystemClock.uptimeMillis() >= this.f4335d + this.f4334c) {
                this.f4332a.mo6078a(this.f4337f, null);
                return;
            }
            this.f4332a.f4338a = true;
            this.f4336e.postAtTime(this.f4332a, this.f4335d + this.f4334c);
        }
    }

    public AbstractC1195a(Context context) {
        this(context, ModernAsyncTask.f4317c);
    }

    private AbstractC1195a(Context context, Executor executor) {
        super(context);
        this.f4335d = -10000;
        this.f4337f = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6095a(AbstractC1195a<D>.RunnableC1196a aVar, D d) {
        mo6096a((Object) d);
        if (this.f4333b == aVar) {
            mo6138z();
            this.f4335d = SystemClock.uptimeMillis();
            this.f4333b = null;
            mo6123l();
            mo6100c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6098b(AbstractC1195a<D>.RunnableC1196a aVar, D d) {
        if (this.f4332a != aVar) {
            mo6095a(aVar, d);
        } else if (mo6126o()) {
            mo6096a((Object) d);
        } else {
            mo6137y();
            this.f4335d = SystemClock.uptimeMillis();
            this.f4332a = null;
            mo6112b(d);
        }
    }

    @Override // androidx.loader.content.C1198c
    /* renamed from: a */
    public void mo6097a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo6097a(str, fileDescriptor, printWriter, strArr);
        if (this.f4332a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f4332a);
            printWriter.print(" waiting=");
            printWriter.println(this.f4332a.f4338a);
        }
        if (this.f4333b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f4333b);
            printWriter.print(" waiting=");
            printWriter.println(this.f4333b.f4338a);
        }
        if (this.f4334c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0847h.m3999a(this.f4334c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0847h.m3998a(this.f4335d, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
