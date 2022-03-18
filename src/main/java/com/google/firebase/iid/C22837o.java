package com.google.firebase.iid;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.iid.FirebaseInstanceId;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.o */
public final /* synthetic */ class C22837o implements EventHandler {

    /* renamed from: a */
    private final FirebaseInstanceId.C22798a f56461a;

    C22837o(FirebaseInstanceId.C22798a aVar) {
        this.f56461a = aVar;
    }

    @Override // com.google.firebase.events.EventHandler
    public final void handle(Event event) {
        this.f56461a.mo79266a(event);
    }
}
