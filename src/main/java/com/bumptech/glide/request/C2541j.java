package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;

/* renamed from: com.bumptech.glide.request.j */
public class C2541j implements RequestCoordinator, AbstractC2533d {

    /* renamed from: a */
    private final RequestCoordinator f8252a;

    /* renamed from: b */
    private final Object f8253b;

    /* renamed from: c */
    private volatile AbstractC2533d f8254c;

    /* renamed from: d */
    private volatile AbstractC2533d f8255d;

    /* renamed from: e */
    private RequestCoordinator.RequestState f8256e = RequestCoordinator.RequestState.CLEARED;

    /* renamed from: f */
    private RequestCoordinator.RequestState f8257f = RequestCoordinator.RequestState.CLEARED;

    /* renamed from: g */
    private boolean f8258g;

    /* renamed from: i */
    private boolean m10825i() {
        RequestCoordinator requestCoordinator = this.f8252a;
        if (requestCoordinator == null || requestCoordinator.mo11101b(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m10826j() {
        RequestCoordinator requestCoordinator = this.f8252a;
        if (requestCoordinator == null || requestCoordinator.mo11103d(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private boolean m10827k() {
        RequestCoordinator requestCoordinator = this.f8252a;
        if (requestCoordinator == null || requestCoordinator.mo11102c(this)) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: b */
    public void mo11197b() {
        synchronized (this.f8253b) {
            this.f8258g = false;
            this.f8256e = RequestCoordinator.RequestState.CLEARED;
            this.f8257f = RequestCoordinator.RequestState.CLEARED;
            this.f8255d.mo11197b();
            this.f8254c.mo11197b();
        }
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: d */
    public boolean mo11199d() {
        boolean z;
        synchronized (this.f8253b) {
            if (this.f8256e == RequestCoordinator.RequestState.RUNNING) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: e */
    public boolean mo11200e() {
        boolean z;
        synchronized (this.f8253b) {
            if (this.f8256e == RequestCoordinator.RequestState.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: f */
    public boolean mo11201f() {
        boolean z;
        synchronized (this.f8253b) {
            if (this.f8256e == RequestCoordinator.RequestState.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.AbstractC2533d, com.bumptech.glide.request.RequestCoordinator
    /* renamed from: g */
    public boolean mo11106g() {
        boolean z;
        synchronized (this.f8253b) {
            if (!this.f8255d.mo11106g()) {
                if (!this.f8254c.mo11106g()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: h */
    public RequestCoordinator mo11107h() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f8253b) {
            RequestCoordinator requestCoordinator2 = this.f8252a;
            if (requestCoordinator2 != null) {
                requestCoordinator = requestCoordinator2.mo11107h();
            } else {
                requestCoordinator = this;
            }
        }
        return requestCoordinator;
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: a */
    public void mo11194a() {
        synchronized (this.f8253b) {
            this.f8258g = true;
            try {
                if (!(this.f8256e == RequestCoordinator.RequestState.SUCCESS || this.f8257f == RequestCoordinator.RequestState.RUNNING)) {
                    this.f8257f = RequestCoordinator.RequestState.RUNNING;
                    this.f8255d.mo11194a();
                }
                if (this.f8258g && this.f8256e != RequestCoordinator.RequestState.RUNNING) {
                    this.f8256e = RequestCoordinator.RequestState.RUNNING;
                    this.f8254c.mo11194a();
                }
            } finally {
                this.f8258g = false;
            }
        }
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: c */
    public void mo11198c() {
        synchronized (this.f8253b) {
            if (!this.f8257f.isComplete()) {
                this.f8257f = RequestCoordinator.RequestState.PAUSED;
                this.f8255d.mo11198c();
            }
            if (!this.f8256e.isComplete()) {
                this.f8256e = RequestCoordinator.RequestState.PAUSED;
                this.f8254c.mo11198c();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: c */
    public boolean mo11102c(AbstractC2533d dVar) {
        boolean z;
        synchronized (this.f8253b) {
            if (!m10827k() || !dVar.equals(this.f8254c) || mo11106g()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: b */
    public boolean mo11101b(AbstractC2533d dVar) {
        boolean z;
        synchronized (this.f8253b) {
            if (!m10825i() || (!dVar.equals(this.f8254c) && this.f8256e == RequestCoordinator.RequestState.SUCCESS)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: d */
    public boolean mo11103d(AbstractC2533d dVar) {
        boolean z;
        synchronized (this.f8253b) {
            if (!m10826j() || !dVar.equals(this.f8254c) || this.f8256e == RequestCoordinator.RequestState.PAUSED) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: e */
    public void mo11104e(AbstractC2533d dVar) {
        synchronized (this.f8253b) {
            if (dVar.equals(this.f8255d)) {
                this.f8257f = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.f8256e = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.f8252a;
            if (requestCoordinator != null) {
                requestCoordinator.mo11104e(this);
            }
            if (!this.f8257f.isComplete()) {
                this.f8255d.mo11197b();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: f */
    public void mo11105f(AbstractC2533d dVar) {
        synchronized (this.f8253b) {
            if (!dVar.equals(this.f8254c)) {
                this.f8257f = RequestCoordinator.RequestState.FAILED;
                return;
            }
            this.f8256e = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.f8252a;
            if (requestCoordinator != null) {
                requestCoordinator.mo11105f(this);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11196a(com.bumptech.glide.request.AbstractC2533d r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.C2541j
            r1 = 0
            if (r0 == 0) goto L_0x002e
            com.bumptech.glide.request.j r4 = (com.bumptech.glide.request.C2541j) r4
            com.bumptech.glide.request.d r0 = r3.f8254c
            if (r0 != 0) goto L_0x0010
            com.bumptech.glide.request.d r0 = r4.f8254c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            com.bumptech.glide.request.d r0 = r3.f8254c
            com.bumptech.glide.request.d r2 = r4.f8254c
            boolean r0 = r0.mo11196a(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            com.bumptech.glide.request.d r0 = r3.f8255d
            if (r0 != 0) goto L_0x0023
            com.bumptech.glide.request.d r4 = r4.f8255d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            com.bumptech.glide.request.d r0 = r3.f8255d
            com.bumptech.glide.request.d r4 = r4.f8255d
            boolean r4 = r0.mo11196a(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C2541j.mo11196a(com.bumptech.glide.request.d):boolean");
    }

    /* renamed from: a */
    public void mo11216a(AbstractC2533d dVar, AbstractC2533d dVar2) {
        this.f8254c = dVar;
        this.f8255d = dVar2;
    }

    public C2541j(Object obj, RequestCoordinator requestCoordinator) {
        this.f8253b = obj;
        this.f8252a = requestCoordinator;
    }
}
