package androidx.activity;

import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    private final Runnable mFallbackOnBackPressed;
    final ArrayDeque<AbstractC0203c> mOnBackPressedCallbacks;

    public OnBackPressedDispatcher() {
        this(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0200a implements AbstractC0202b {

        /* renamed from: b */
        private final AbstractC0203c f442b;

        @Override // androidx.activity.AbstractC0202b
        /* renamed from: a */
        public void mo623a() {
            OnBackPressedDispatcher.this.mOnBackPressedCallbacks.remove(this.f442b);
            this.f442b.removeCancellable(this);
        }

        C0200a(AbstractC0203c cVar) {
            this.f442b = cVar;
        }
    }

    private class LifecycleOnBackPressedCancellable implements AbstractC0202b, AbstractC1168n {

        /* renamed from: b */
        private final Lifecycle f438b;

        /* renamed from: c */
        private final AbstractC0203c f439c;

        /* renamed from: d */
        private AbstractC0202b f440d;

        @Override // androidx.activity.AbstractC0202b
        /* renamed from: a */
        public void mo623a() {
            this.f438b.removeObserver(this);
            this.f439c.removeCancellable(this);
            AbstractC0202b bVar = this.f440d;
            if (bVar != null) {
                bVar.mo623a();
                this.f440d = null;
            }
        }

        @Override // androidx.lifecycle.AbstractC1168n
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.f440d = OnBackPressedDispatcher.this.addCancellableCallback(this.f439c);
            } else if (event == Lifecycle.Event.ON_STOP) {
                AbstractC0202b bVar = this.f440d;
                if (bVar != null) {
                    bVar.mo623a();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                mo623a();
            }
        }

        LifecycleOnBackPressedCancellable(Lifecycle lifecycle, AbstractC0203c cVar) {
            this.f438b = lifecycle;
            this.f439c = cVar;
            lifecycle.addObserver(this);
        }
    }

    public boolean hasEnabledCallbacks() {
        Iterator<AbstractC0203c> descendingIterator = this.mOnBackPressedCallbacks.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().isEnabled()) {
                return true;
            }
        }
        return false;
    }

    public void onBackPressed() {
        Iterator<AbstractC0203c> descendingIterator = this.mOnBackPressedCallbacks.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC0203c next = descendingIterator.next();
            if (next.isEnabled()) {
                next.handleOnBackPressed();
                return;
            }
        }
        Runnable runnable = this.mFallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addCallback(AbstractC0203c cVar) {
        addCancellableCallback(cVar);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.mOnBackPressedCallbacks = new ArrayDeque<>();
        this.mFallbackOnBackPressed = runnable;
    }

    /* access modifiers changed from: package-private */
    public AbstractC0202b addCancellableCallback(AbstractC0203c cVar) {
        this.mOnBackPressedCallbacks.add(cVar);
        C0200a aVar = new C0200a(cVar);
        cVar.addCancellable(aVar);
        return aVar;
    }

    public void addCallback(LifecycleOwner lifecycleOwner, AbstractC0203c cVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            cVar.addCancellable(new LifecycleOnBackPressedCancellable(lifecycle, cVar));
        }
    }
}
