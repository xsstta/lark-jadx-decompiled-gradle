package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;

/* renamed from: com.bumptech.glide.request.b */
public final class C2526b implements RequestCoordinator, AbstractC2533d {

    /* renamed from: a */
    private final Object f8200a;

    /* renamed from: b */
    private final RequestCoordinator f8201b;

    /* renamed from: c */
    private volatile AbstractC2533d f8202c;

    /* renamed from: d */
    private volatile AbstractC2533d f8203d;

    /* renamed from: e */
    private RequestCoordinator.RequestState f8204e = RequestCoordinator.RequestState.CLEARED;

    /* renamed from: f */
    private RequestCoordinator.RequestState f8205f = RequestCoordinator.RequestState.CLEARED;

    /* renamed from: i */
    private boolean m10738i() {
        RequestCoordinator requestCoordinator = this.f8201b;
        if (requestCoordinator == null || requestCoordinator.mo11101b(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m10739j() {
        RequestCoordinator requestCoordinator = this.f8201b;
        if (requestCoordinator == null || requestCoordinator.mo11103d(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private boolean m10740k() {
        RequestCoordinator requestCoordinator = this.f8201b;
        if (requestCoordinator == null || requestCoordinator.mo11102c(this)) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: a */
    public void mo11194a() {
        synchronized (this.f8200a) {
            if (this.f8204e != RequestCoordinator.RequestState.RUNNING) {
                this.f8204e = RequestCoordinator.RequestState.RUNNING;
                this.f8202c.mo11194a();
            }
        }
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: b */
    public void mo11197b() {
        synchronized (this.f8200a) {
            this.f8204e = RequestCoordinator.RequestState.CLEARED;
            this.f8202c.mo11197b();
            if (this.f8205f != RequestCoordinator.RequestState.CLEARED) {
                this.f8205f = RequestCoordinator.RequestState.CLEARED;
                this.f8203d.mo11197b();
            }
        }
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: d */
    public boolean mo11199d() {
        boolean z;
        synchronized (this.f8200a) {
            if (this.f8204e != RequestCoordinator.RequestState.RUNNING) {
                if (this.f8205f != RequestCoordinator.RequestState.RUNNING) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: e */
    public boolean mo11200e() {
        boolean z;
        synchronized (this.f8200a) {
            if (this.f8204e != RequestCoordinator.RequestState.SUCCESS) {
                if (this.f8205f != RequestCoordinator.RequestState.SUCCESS) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: f */
    public boolean mo11201f() {
        boolean z;
        synchronized (this.f8200a) {
            if (this.f8204e == RequestCoordinator.RequestState.CLEARED && this.f8205f == RequestCoordinator.RequestState.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: h */
    public RequestCoordinator mo11107h() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f8200a) {
            RequestCoordinator requestCoordinator2 = this.f8201b;
            if (requestCoordinator2 != null) {
                requestCoordinator = requestCoordinator2.mo11107h();
            } else {
                requestCoordinator = this;
            }
        }
        return requestCoordinator;
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: c */
    public void mo11198c() {
        synchronized (this.f8200a) {
            if (this.f8204e == RequestCoordinator.RequestState.RUNNING) {
                this.f8204e = RequestCoordinator.RequestState.PAUSED;
                this.f8202c.mo11198c();
            }
            if (this.f8205f == RequestCoordinator.RequestState.RUNNING) {
                this.f8205f = RequestCoordinator.RequestState.PAUSED;
                this.f8203d.mo11198c();
            }
        }
    }

    @Override // com.bumptech.glide.request.AbstractC2533d, com.bumptech.glide.request.RequestCoordinator
    /* renamed from: g */
    public boolean mo11106g() {
        boolean z;
        synchronized (this.f8200a) {
            if (!this.f8202c.mo11106g()) {
                if (!this.f8203d.mo11106g()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: g */
    private boolean m10737g(AbstractC2533d dVar) {
        if (dVar.equals(this.f8202c) || (this.f8204e == RequestCoordinator.RequestState.FAILED && dVar.equals(this.f8203d))) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: c */
    public boolean mo11102c(AbstractC2533d dVar) {
        boolean z;
        synchronized (this.f8200a) {
            if (!m10740k() || !m10737g(dVar)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.AbstractC2533d
    /* renamed from: a */
    public boolean mo11196a(AbstractC2533d dVar) {
        if (!(dVar instanceof C2526b)) {
            return false;
        }
        C2526b bVar = (C2526b) dVar;
        if (!this.f8202c.mo11196a(bVar.f8202c) || !this.f8203d.mo11196a(bVar.f8203d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: b */
    public boolean mo11101b(AbstractC2533d dVar) {
        boolean z;
        synchronized (this.f8200a) {
            if (!m10738i() || !m10737g(dVar)) {
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
        synchronized (this.f8200a) {
            if (!m10739j() || !m10737g(dVar)) {
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
        synchronized (this.f8200a) {
            if (dVar.equals(this.f8202c)) {
                this.f8204e = RequestCoordinator.RequestState.SUCCESS;
            } else if (dVar.equals(this.f8203d)) {
                this.f8205f = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.f8201b;
            if (requestCoordinator != null) {
                requestCoordinator.mo11104e(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: f */
    public void mo11105f(AbstractC2533d dVar) {
        synchronized (this.f8200a) {
            if (!dVar.equals(this.f8203d)) {
                this.f8204e = RequestCoordinator.RequestState.FAILED;
                if (this.f8205f != RequestCoordinator.RequestState.RUNNING) {
                    this.f8205f = RequestCoordinator.RequestState.RUNNING;
                    this.f8203d.mo11194a();
                }
                return;
            }
            this.f8205f = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.f8201b;
            if (requestCoordinator != null) {
                requestCoordinator.mo11105f(this);
            }
        }
    }

    /* renamed from: a */
    public void mo11195a(AbstractC2533d dVar, AbstractC2533d dVar2) {
        this.f8202c = dVar;
        this.f8203d = dVar2;
    }

    public C2526b(Object obj, RequestCoordinator requestCoordinator) {
        this.f8200a = obj;
        this.f8201b = requestCoordinator;
    }
}
