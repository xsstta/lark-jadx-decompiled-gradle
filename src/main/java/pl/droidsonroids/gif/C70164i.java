package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: pl.droidsonroids.gif.i */
public class C70164i implements Drawable.Callback {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C70165a> f175282a;

    /* renamed from: b */
    private final boolean f175283b;

    public C70164i() {
        this(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pl.droidsonroids.gif.i$a */
    public static final class C70165a extends WeakReference<Drawable.Callback> {
        public int hashCode() {
            Drawable.Callback callback = (Drawable.Callback) get();
            if (callback != null) {
                return callback.hashCode();
            }
            return 0;
        }

        C70165a(Drawable.Callback callback) {
            super(callback);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && get() == ((C70165a) obj).get()) {
                return true;
            }
            return false;
        }
    }

    public C70164i(boolean z) {
        this.f175282a = new CopyOnWriteArrayList<>();
        this.f175283b = z;
    }

    /* renamed from: a */
    public void mo247313a(Drawable.Callback callback) {
        for (int i = 0; i < this.f175282a.size(); i++) {
            C70165a aVar = this.f175282a.get(i);
            if (((Drawable.Callback) aVar.get()) == null) {
                this.f175282a.remove(aVar);
            }
        }
        this.f175282a.addIfAbsent(new C70165a(callback));
    }

    public void invalidateDrawable(Drawable drawable) {
        for (int i = 0; i < this.f175282a.size(); i++) {
            C70165a aVar = this.f175282a.get(i);
            Drawable.Callback callback = (Drawable.Callback) aVar.get();
            if (callback == null) {
                this.f175282a.remove(aVar);
            } else if (!this.f175283b || !(callback instanceof View)) {
                callback.invalidateDrawable(drawable);
            } else {
                ((View) callback).invalidate();
            }
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        for (int i = 0; i < this.f175282a.size(); i++) {
            C70165a aVar = this.f175282a.get(i);
            Drawable.Callback callback = (Drawable.Callback) aVar.get();
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            } else {
                this.f175282a.remove(aVar);
            }
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        for (int i = 0; i < this.f175282a.size(); i++) {
            C70165a aVar = this.f175282a.get(i);
            Drawable.Callback callback = (Drawable.Callback) aVar.get();
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            } else {
                this.f175282a.remove(aVar);
            }
        }
    }
}
