package com.ss.android.lark.chatwindow.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.ss.android.lark.chatwindow.view.a */
public class C35252a {

    /* renamed from: a */
    HashSet<WeakReference<Object>> f91034a = new HashSet<>();

    /* renamed from: b */
    private View f91035b;

    public C35252a(View view) {
        this.f91035b = view;
    }

    /* renamed from: b */
    private void m137645b(Object obj) {
        this.f91034a.add(new WeakReference<>(obj));
    }

    /* renamed from: a */
    public void mo129729a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f91035b.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        m137645b((Object) onGlobalLayoutListener);
    }

    /* renamed from: a */
    private void m137644a(Object obj) {
        Iterator<WeakReference<Object>> it = this.f91034a.iterator();
        while (it.hasNext()) {
            if (obj == it.next().get()) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public void mo129730b(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f91035b.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        m137644a((Object) onGlobalLayoutListener);
    }
}
