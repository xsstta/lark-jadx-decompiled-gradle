package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.c */
public abstract class AbstractC0203c {
    private CopyOnWriteArrayList<AbstractC0202b> mCancellables = new CopyOnWriteArrayList<>();
    private boolean mEnabled;

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.mEnabled;
    }

    public final void remove() {
        Iterator<AbstractC0202b> it = this.mCancellables.iterator();
        while (it.hasNext()) {
            it.next().mo623a();
        }
    }

    public final void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    /* access modifiers changed from: package-private */
    public void addCancellable(AbstractC0202b bVar) {
        this.mCancellables.add(bVar);
    }

    /* access modifiers changed from: package-private */
    public void removeCancellable(AbstractC0202b bVar) {
        this.mCancellables.remove(bVar);
    }

    public AbstractC0203c(boolean z) {
        this.mEnabled = z;
    }
}
