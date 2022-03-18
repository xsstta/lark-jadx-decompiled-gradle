package com.ss.android.lark.chatwindow.view.sidemenu;

import java.util.ArrayList;

/* renamed from: com.ss.android.lark.chatwindow.view.sidemenu.a */
public class C35299a<T> {

    /* renamed from: a */
    private ArrayList<T> f91202a = new ArrayList<>();

    /* renamed from: b */
    private ArrayList<T> f91203b;

    /* renamed from: c */
    private final C35300a<T> f91204c = new C35300a<>();

    /* renamed from: d */
    private boolean f91205d;

    /* renamed from: com.ss.android.lark.chatwindow.view.sidemenu.a$a */
    public static class C35300a<T> {

        /* renamed from: a */
        public ArrayList<T> f91206a;

        /* renamed from: b */
        public int f91207b;

        /* renamed from: a */
        public int mo129889a() {
            return this.f91207b;
        }

        /* renamed from: a */
        public T mo129890a(int i) {
            return this.f91206a.get(i);
        }
    }

    /* renamed from: c */
    private ArrayList<T> m137830c() {
        if (!this.f91205d) {
            return this.f91202a;
        }
        if (this.f91203b == null) {
            this.f91203b = new ArrayList<>(this.f91202a);
        }
        return this.f91203b;
    }

    /* renamed from: a */
    public C35300a<T> mo129885a() {
        if (!this.f91205d) {
            this.f91205d = true;
            this.f91203b = null;
            this.f91204c.f91206a = this.f91202a;
            this.f91204c.f91207b = this.f91202a.size();
            return this.f91204c;
        }
        throw new IllegalStateException("Iteration already started");
    }

    /* renamed from: b */
    public void mo129887b() {
        if (this.f91205d) {
            this.f91205d = false;
            ArrayList<T> arrayList = this.f91203b;
            if (arrayList != null) {
                this.f91202a = arrayList;
                this.f91204c.f91206a.clear();
                this.f91204c.f91207b = 0;
            }
            this.f91203b = null;
            return;
        }
        throw new IllegalStateException("Iteration not started");
    }

    /* renamed from: a */
    public void mo129886a(T t) {
        m137830c().add(t);
    }

    /* renamed from: b */
    public boolean mo129888b(T t) {
        return m137830c().remove(t);
    }
}
