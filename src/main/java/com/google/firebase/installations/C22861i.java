package com.google.firebase.installations;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* renamed from: com.google.firebase.installations.i */
final /* synthetic */ class C22861i implements ComponentFactory {

    /* renamed from: a */
    private static final C22861i f56511a = new C22861i();

    private C22861i() {
    }

    /* renamed from: a */
    public static ComponentFactory m83005a() {
        return f56511a;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
    }
}
