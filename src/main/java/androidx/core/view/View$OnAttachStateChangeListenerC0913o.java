package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* renamed from: androidx.core.view.o */
public final class View$OnAttachStateChangeListenerC0913o implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final View f3465a;

    /* renamed from: b */
    private ViewTreeObserver f3466b;

    /* renamed from: c */
    private final Runnable f3467c;

    public boolean onPreDraw() {
        mo4712a();
        this.f3467c.run();
        return true;
    }

    /* renamed from: a */
    public void mo4712a() {
        if (this.f3466b.isAlive()) {
            this.f3466b.removeOnPreDrawListener(this);
        } else {
            this.f3465a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3465a.removeOnAttachStateChangeListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        mo4712a();
    }

    public void onViewAttachedToWindow(View view) {
        this.f3466b = view.getViewTreeObserver();
    }

    private View$OnAttachStateChangeListenerC0913o(View view, Runnable runnable) {
        this.f3465a = view;
        this.f3466b = view.getViewTreeObserver();
        this.f3467c = runnable;
    }

    /* renamed from: a */
    public static View$OnAttachStateChangeListenerC0913o m4399a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        View$OnAttachStateChangeListenerC0913o oVar = new View$OnAttachStateChangeListenerC0913o(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(oVar);
        view.addOnAttachStateChangeListener(oVar);
        return oVar;
    }
}
