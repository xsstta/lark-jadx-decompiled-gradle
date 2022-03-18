package com.ss.android.lark.contact.impl.contacts_group;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.lark.contact.impl.contacts_group.C35593b;

/* access modifiers changed from: package-private */
public class ContactsMyGroupFragment$2 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ C35593b.C35595a f92042a;

    /* renamed from: b */
    final /* synthetic */ C35593b f92043b;

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.f92042a.mo131268a();
    }

    ContactsMyGroupFragment$2(C35593b bVar, C35593b.C35595a aVar) {
        this.f92043b = bVar;
        this.f92042a = aVar;
    }
}
