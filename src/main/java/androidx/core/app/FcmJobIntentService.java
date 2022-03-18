package androidx.core.app;

import androidx.core.app.JobIntentService;

public abstract class FcmJobIntentService extends JobIntentService {
    /* access modifiers changed from: package-private */
    @Override // androidx.core.app.JobIntentService
    public JobIntentService.GenericWorkItem dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException unused) {
            return null;
        }
    }
}
