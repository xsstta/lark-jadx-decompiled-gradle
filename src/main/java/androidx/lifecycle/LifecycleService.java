package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LifecycleService extends Service implements LifecycleOwner {

    /* renamed from: a */
    private final C1136ad f4187a = new C1136ad(this);

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.f4187a.mo5996e();
    }

    public void onCreate() {
        this.f4187a.mo5992a();
        super.onCreate();
    }

    public void onDestroy() {
        this.f4187a.mo5995d();
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        this.f4187a.mo5993b();
        return null;
    }

    public void onStart(Intent intent, int i) {
        this.f4187a.mo5994c();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
