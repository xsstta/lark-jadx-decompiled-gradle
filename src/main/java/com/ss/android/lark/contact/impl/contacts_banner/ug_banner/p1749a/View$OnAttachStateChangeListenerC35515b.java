package com.ss.android.lark.contact.impl.contacts_banner.ug_banner.p1749a;

import android.view.View;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.banner.export.broadcast.C29481a;
import com.ss.android.lark.contact.C35358a;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.a.b */
public class View$OnAttachStateChangeListenerC35515b implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    private View f91807a;

    /* renamed from: b */
    private Observable f91808b;

    /* renamed from: c */
    private Observer f91809c = new Observer() {
        /* class com.ss.android.lark.contact.impl.contacts_banner.ug_banner.p1749a.View$OnAttachStateChangeListenerC35515b.C355161 */

        public void update(Observable observable, Object obj) {
            if (!C35514a.m138908b()) {
                View$OnAttachStateChangeListenerC35515b.this.mo130955c();
                View$OnAttachStateChangeListenerC35515b.this.mo130954b();
                View$OnAttachStateChangeListenerC35515b.this.mo130952a();
            }
        }
    };

    /* renamed from: d */
    private void m138912d() {
        View view = this.f91807a;
        if (view != null) {
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a */
    public void mo130952a() {
        View view = this.f91807a;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: b */
    public void mo130954b() {
        Observable observable = this.f91808b;
        if (observable != null) {
            observable.deleteObserver(this.f91809c);
        }
    }

    /* renamed from: c */
    public void mo130955c() {
        UICallbackExecutor.post(new Runnable() {
            /* class com.ss.android.lark.contact.impl.contacts_banner.ug_banner.p1749a.View$OnAttachStateChangeListenerC35515b.RunnableC355172 */

            public void run() {
                C29481a.m108561a(C35358a.m138143a().mo130143a(), "ContactsUpgradetoTeam");
            }
        });
    }

    /* renamed from: e */
    private void m138913e() {
        if (this.f91808b == null) {
            this.f91808b = C35358a.m138143a().mo130156d().mo130256a();
        }
        this.f91808b.addObserver(this.f91809c);
    }

    public void onViewAttachedToWindow(View view) {
        m138913e();
    }

    public void onViewDetachedFromWindow(View view) {
        mo130954b();
    }

    /* renamed from: a */
    public void mo130953a(View view) {
        if (view != null) {
            this.f91807a = view;
            m138912d();
        }
    }
}
