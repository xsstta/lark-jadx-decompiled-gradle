package androidx.transition;

import android.os.IBinder;

/* access modifiers changed from: package-private */
public class ar implements AbstractC1527at {

    /* renamed from: a */
    private final IBinder f5375a;

    public int hashCode() {
        return this.f5375a.hashCode();
    }

    ar(IBinder iBinder) {
        this.f5375a = iBinder;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ar) || !((ar) obj).f5375a.equals(this.f5375a)) {
            return false;
        }
        return true;
    }
}
