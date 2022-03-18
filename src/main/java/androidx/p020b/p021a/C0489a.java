package androidx.p020b.p021a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pools;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: androidx.b.a.a */
public final class C0489a {

    /* renamed from: a */
    LayoutInflater f1785a;

    /* renamed from: b */
    Handler f1786b;

    /* renamed from: c */
    C0493c f1787c;

    /* renamed from: d */
    private Handler.Callback f1788d = new Handler.Callback() {
        /* class androidx.p020b.p021a.C0489a.C04901 */

        public boolean handleMessage(Message message) {
            C0492b bVar = (C0492b) message.obj;
            if (bVar.f1794d == null) {
                bVar.f1794d = C0489a.this.f1785a.inflate(bVar.f1793c, bVar.f1792b, false);
            }
            bVar.f1795e.mo2793a(bVar.f1794d, bVar.f1793c, bVar.f1792b);
            C0489a.this.f1787c.mo2788a(bVar);
            return true;
        }
    };

    /* renamed from: androidx.b.a.a$d */
    public interface AbstractC0494d {
        /* renamed from: a */
        void mo2793a(View view, int i, ViewGroup viewGroup);
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.b.a.a$b */
    public static class C0492b {

        /* renamed from: a */
        C0489a f1791a;

        /* renamed from: b */
        ViewGroup f1792b;

        /* renamed from: c */
        int f1793c;

        /* renamed from: d */
        View f1794d;

        /* renamed from: e */
        AbstractC0494d f1795e;

        C0492b() {
        }
    }

    /* renamed from: androidx.b.a.a$c */
    private static class C0493c extends Thread {

        /* renamed from: a */
        private static final C0493c f1796a;

        /* renamed from: b */
        private ArrayBlockingQueue<C0492b> f1797b = new ArrayBlockingQueue<>(10);

        /* renamed from: c */
        private Pools.SynchronizedPool<C0492b> f1798c = new Pools.SynchronizedPool<>(10);

        /* renamed from: a */
        public static C0493c m2178a() {
            return f1796a;
        }

        public void run() {
            while (true) {
                mo2789b();
            }
        }

        static {
            C0493c cVar = new C0493c();
            f1796a = cVar;
            cVar.start();
        }

        /* renamed from: c */
        public C0492b mo2791c() {
            C0492b acquire = this.f1798c.acquire();
            if (acquire == null) {
                return new C0492b();
            }
            return acquire;
        }

        private C0493c() {
        }

        /* renamed from: b */
        public void mo2789b() {
            try {
                C0492b take = this.f1797b.take();
                try {
                    take.f1794d = take.f1791a.f1785a.inflate(take.f1793c, take.f1792b, false);
                } catch (RuntimeException e) {
                    Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e);
                }
                Message.obtain(take.f1791a.f1786b, 0, take).sendToTarget();
            } catch (InterruptedException e2) {
                Log.w("AsyncLayoutInflater", e2);
            }
        }

        /* renamed from: b */
        public void mo2790b(C0492b bVar) {
            try {
                this.f1797b.put(bVar);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        /* renamed from: a */
        public void mo2788a(C0492b bVar) {
            bVar.f1795e = null;
            bVar.f1791a = null;
            bVar.f1792b = null;
            bVar.f1793c = 0;
            bVar.f1794d = null;
            this.f1798c.release(bVar);
        }
    }

    /* renamed from: androidx.b.a.a$a */
    private static class C0491a extends LayoutInflater {

        /* renamed from: a */
        private static final String[] f1790a = {"android.widget.", "android.webkit.", "android.app."};

        C0491a(Context context) {
            super(context);
        }

        public LayoutInflater cloneInContext(Context context) {
            return new C0491a(context);
        }

        /* access modifiers changed from: protected */
        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            for (String str2 : f1790a) {
                try {
                    View createView = createView(str, str2, attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    public C0489a(Context context) {
        this.f1785a = new C0491a(context);
        this.f1786b = new Handler(this.f1788d);
        this.f1787c = C0493c.m2178a();
    }

    /* renamed from: a */
    public void mo2784a(int i, ViewGroup viewGroup, AbstractC0494d dVar) {
        Objects.requireNonNull(dVar, "callback argument may not be null!");
        C0492b c = this.f1787c.mo2791c();
        c.f1791a = this;
        c.f1793c = i;
        c.f1792b = viewGroup;
        c.f1795e = dVar;
        this.f1787c.mo2790b(c);
    }
}
