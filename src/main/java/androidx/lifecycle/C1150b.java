package androidx.lifecycle;

import android.app.Application;

/* renamed from: androidx.lifecycle.b */
public class C1150b extends AbstractC1142af {
    private Application mApplication;

    public <T extends Application> T getApplication() {
        return (T) this.mApplication;
    }

    public C1150b(Application application) {
        this.mApplication = application;
    }
}
