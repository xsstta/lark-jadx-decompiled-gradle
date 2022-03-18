package com.ss.android.lark.widget.linked_emojicon;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.d */
public class C58507d implements Drawable.Callback {

    /* renamed from: a */
    private WeakReference<View> f144373a;

    public C58507d(View view) {
        this.f144373a = new WeakReference<>(view);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f144373a.get() != null) {
            this.f144373a.get().invalidate();
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (this.f144373a.get() != null) {
            this.f144373a.get().removeCallbacks(runnable);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (this.f144373a.get() != null) {
            this.f144373a.get().postDelayed(runnable, j);
        }
    }
}
