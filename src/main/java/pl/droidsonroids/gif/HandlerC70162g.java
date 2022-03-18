package pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: pl.droidsonroids.gif.g */
public class HandlerC70162g extends Handler {

    /* renamed from: a */
    private final WeakReference<C70149c> f175280a;

    HandlerC70162g(C70149c cVar) {
        super(Looper.getMainLooper());
        this.f175280a = new WeakReference<>(cVar);
    }

    public void handleMessage(Message message) {
        C70149c cVar = this.f175280a.get();
        if (cVar != null) {
            if (message.what == -1) {
                cVar.invalidateSelf();
                return;
            }
            Iterator<AbstractC70146a> it = cVar.f175254g.iterator();
            while (it.hasNext()) {
                it.next().mo247263a(message.what);
            }
        }
    }
}
