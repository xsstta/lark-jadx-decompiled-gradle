package com.ss.android.lark.chat.chatwindow.chat;

import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.h */
public class C33240h {

    /* renamed from: a */
    private WeakReference<AbstractC33243b> f85545a;

    /* renamed from: b */
    private boolean f85546b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.h$a */
    public static final class C33242a {

        /* renamed from: a */
        public static final C33240h f85547a = new C33240h();
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.h$b */
    public interface AbstractC33243b {
        void hideSelection();
    }

    private C33240h() {
    }

    /* renamed from: a */
    public static C33240h m128531a() {
        return C33242a.f85547a;
    }

    /* renamed from: c */
    public boolean mo122576c() {
        return this.f85546b;
    }

    /* renamed from: b */
    public synchronized void mo122575b() {
        WeakReference<AbstractC33243b> weakReference = this.f85545a;
        if (weakReference != null) {
            AbstractC33243b bVar = weakReference.get();
            if (bVar != null) {
                bVar.hideSelection();
                this.f85545a = null;
            }
        }
    }

    /* renamed from: a */
    public void mo122574a(boolean z) {
        this.f85546b = z;
    }

    /* renamed from: a */
    public synchronized void mo122573a(AbstractC33243b bVar) {
        mo122575b();
        this.f85545a = new WeakReference<>(bVar);
    }
}
