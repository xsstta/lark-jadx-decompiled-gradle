package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.p011a.p012a.p013a.C0179a;
import androidx.p011a.p012a.p014b.C0186b;
import java.util.Iterator;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: c */
    static final Object f4189c = new Object();

    /* renamed from: a */
    private C0186b<AbstractC1178x<? super T>, LiveData<T>.AbstractC1122b> f4190a;

    /* renamed from: b */
    final Object f4191b;

    /* renamed from: d */
    int f4192d;

    /* renamed from: e */
    volatile Object f4193e;

    /* renamed from: f */
    private boolean f4194f;

    /* renamed from: g */
    private volatile Object f4195g;

    /* renamed from: h */
    private int f4196h;

    /* renamed from: i */
    private boolean f4197i;

    /* renamed from: j */
    private boolean f4198j;

    /* renamed from: k */
    private final Runnable f4199k;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5920a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo5931d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo5930c() {
        return this.f4196h;
    }

    /* renamed from: e */
    public boolean mo5932e() {
        if (this.f4192d > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public class LifecycleBoundObserver extends LiveData<T>.AbstractC1122b implements AbstractC1168n {

        /* renamed from: a */
        final LifecycleOwner f4201a;

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.AbstractC1122b
        /* renamed from: b */
        public void mo5936b() {
            this.f4201a.getLifecycle().removeObserver(this);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.AbstractC1122b
        /* renamed from: a */
        public boolean mo5934a() {
            return this.f4201a.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.AbstractC1122b
        /* renamed from: a */
        public boolean mo5935a(LifecycleOwner lifecycleOwner) {
            if (this.f4201a == lifecycleOwner) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.AbstractC1168n
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State currentState = this.f4201a.getLifecycle().getCurrentState();
            if (currentState == Lifecycle.State.DESTROYED) {
                LiveData.this.mo5928b((AbstractC1178x) this.f4204c);
                return;
            }
            Lifecycle.State state = null;
            while (state != currentState) {
                mo5937a(mo5934a());
                state = currentState;
                currentState = this.f4201a.getLifecycle().getCurrentState();
            }
        }

        LifecycleBoundObserver(LifecycleOwner lifecycleOwner, AbstractC1178x<? super T> xVar) {
            super(xVar);
            this.f4201a = lifecycleOwner;
        }
    }

    /* renamed from: b */
    public T mo5927b() {
        T t = (T) this.f4195g;
        if (t != f4189c) {
            return t;
        }
        return null;
    }

    public LiveData() {
        this.f4191b = new Object();
        this.f4190a = new C0186b<>();
        this.f4192d = 0;
        Object obj = f4189c;
        this.f4193e = obj;
        this.f4199k = new Runnable() {
            /* class androidx.lifecycle.LiveData.RunnableC11201 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.lifecycle.LiveData */
            /* JADX WARN: Multi-variable type inference failed */
            public void run() {
                Object obj;
                synchronized (LiveData.this.f4191b) {
                    obj = LiveData.this.f4193e;
                    LiveData.this.f4193e = LiveData.f4189c;
                }
                LiveData.this.mo5929b(obj);
            }
        };
        this.f4195g = obj;
        this.f4196h = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.lifecycle.LiveData$b */
    public abstract class AbstractC1122b {

        /* renamed from: c */
        final AbstractC1178x<? super T> f4204c;

        /* renamed from: d */
        boolean f4205d;

        /* renamed from: e */
        int f4206e = -1;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo5934a();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5935a(LifecycleOwner lifecycleOwner) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5936b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5937a(boolean z) {
            int i;
            if (z != this.f4205d) {
                this.f4205d = z;
                LiveData liveData = LiveData.this;
                if (z) {
                    i = 1;
                } else {
                    i = -1;
                }
                liveData.mo5921a(i);
                if (this.f4205d) {
                    LiveData.this.mo5924a((LiveData<T>.AbstractC1122b) this);
                }
            }
        }

        AbstractC1122b(AbstractC1178x<? super T> xVar) {
            this.f4204c = xVar;
        }
    }

    /* renamed from: a */
    public void mo5926a(T t) {
        boolean z;
        synchronized (this.f4191b) {
            if (this.f4193e == f4189c) {
                z = true;
            } else {
                z = false;
            }
            this.f4193e = t;
        }
        if (z) {
            C0179a.m584a().mo549b(this.f4199k);
        }
    }

    /* renamed from: b */
    public void mo5928b(AbstractC1178x<? super T> xVar) {
        m5285a("removeObserver");
        LiveData<T>.AbstractC1122b b = this.f4190a.mo557b(xVar);
        if (b != null) {
            b.mo5936b();
            b.mo5937a(false);
        }
    }

    /* renamed from: a */
    static void m5285a(String str) {
        if (!C0179a.m584a().mo550c()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: b */
    private void m5286b(LiveData<T>.AbstractC1122b bVar) {
        if (bVar.f4205d) {
            if (!bVar.mo5934a()) {
                bVar.mo5937a(false);
                return;
            }
            int i = bVar.f4206e;
            int i2 = this.f4196h;
            if (i < i2) {
                bVar.f4206e = i2;
                bVar.f4204c.onChanged((Object) this.f4195g);
            }
        }
    }

    public LiveData(T t) {
        this.f4191b = new Object();
        this.f4190a = new C0186b<>();
        this.f4192d = 0;
        this.f4193e = f4189c;
        this.f4199k = new Runnable() {
            /* class androidx.lifecycle.LiveData.RunnableC11201 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.lifecycle.LiveData */
            /* JADX WARN: Multi-variable type inference failed */
            public void run() {
                Object obj;
                synchronized (LiveData.this.f4191b) {
                    obj = LiveData.this.f4193e;
                    LiveData.this.f4193e = LiveData.f4189c;
                }
                LiveData.this.mo5929b(obj);
            }
        };
        this.f4195g = t;
        this.f4196h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5921a(int i) {
        boolean z;
        boolean z2;
        int i2 = this.f4192d;
        this.f4192d = i + i2;
        if (!this.f4194f) {
            this.f4194f = true;
            while (true) {
                try {
                    int i3 = this.f4192d;
                    if (i2 != i3) {
                        if (i2 != 0 || i3 <= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (i2 <= 0 || i3 != 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z) {
                            mo5920a();
                        } else if (z2) {
                            mo5931d();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.f4194f = false;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo5929b(T t) {
        m5285a("setValue");
        this.f4196h++;
        this.f4195g = t;
        mo5924a((LiveData<T>.AbstractC1122b) null);
    }

    /* renamed from: a */
    public void mo5922a(LifecycleOwner lifecycleOwner) {
        m5285a("removeObservers");
        Iterator<Map.Entry<AbstractC1178x<? super T>, LiveData<T>.AbstractC1122b>> it = this.f4190a.iterator();
        while (it.hasNext()) {
            Map.Entry<AbstractC1178x<? super T>, LiveData<T>.AbstractC1122b> next = it.next();
            if (next.getValue().mo5935a(lifecycleOwner)) {
                mo5928b((AbstractC1178x) next.getKey());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5924a(LiveData<T>.AbstractC1122b bVar) {
        if (this.f4197i) {
            this.f4198j = true;
            return;
        }
        this.f4197i = true;
        do {
            this.f4198j = false;
            if (bVar == null) {
                C0186b<K, V>.C0190d c = this.f4190a.mo563c();
                while (c.hasNext()) {
                    m5286b((LiveData<T>.AbstractC1122b) ((AbstractC1122b) ((Map.Entry) c.next()).getValue()));
                    if (this.f4198j) {
                        break;
                    }
                }
            } else {
                m5286b(bVar);
                bVar = null;
            }
        } while (this.f4198j);
        this.f4197i = false;
    }

    /* renamed from: a */
    public void mo5925a(AbstractC1178x<? super T> xVar) {
        m5285a("observeForever");
        C1121a aVar = new C1121a(xVar);
        LiveData<T>.AbstractC1122b a = this.f4190a.mo556a(xVar, aVar);
        if (a instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (a == null) {
            aVar.mo5937a(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.lifecycle.LiveData$a */
    public class C1121a extends LiveData<T>.AbstractC1122b {
        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.AbstractC1122b
        /* renamed from: a */
        public boolean mo5934a() {
            return true;
        }

        C1121a(AbstractC1178x<? super T> xVar) {
            super(xVar);
        }
    }

    /* renamed from: a */
    public void mo5923a(LifecycleOwner lifecycleOwner, AbstractC1178x<? super T> xVar) {
        m5285a("observe");
        if (lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, xVar);
            LiveData<T>.AbstractC1122b a = this.f4190a.mo556a(xVar, lifecycleBoundObserver);
            if (a != null && !a.mo5935a(lifecycleOwner)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (a == null) {
                lifecycleOwner.getLifecycle().addObserver(lifecycleBoundObserver);
            }
        }
    }
}
