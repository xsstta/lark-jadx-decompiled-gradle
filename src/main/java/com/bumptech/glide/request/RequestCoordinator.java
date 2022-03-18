package com.bumptech.glide.request;

public interface RequestCoordinator {
    /* renamed from: b */
    boolean mo11101b(AbstractC2533d dVar);

    /* renamed from: c */
    boolean mo11102c(AbstractC2533d dVar);

    /* renamed from: d */
    boolean mo11103d(AbstractC2533d dVar);

    /* renamed from: e */
    void mo11104e(AbstractC2533d dVar);

    /* renamed from: f */
    void mo11105f(AbstractC2533d dVar);

    /* renamed from: g */
    boolean mo11106g();

    /* renamed from: h */
    RequestCoordinator mo11107h();

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        /* access modifiers changed from: package-private */
        public boolean isComplete() {
            return this.isComplete;
        }

        private RequestState(boolean z) {
            this.isComplete = z;
        }
    }
}
