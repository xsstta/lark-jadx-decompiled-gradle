package com.google.firebase.datatransport;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* renamed from: com.google.firebase.datatransport.a */
final /* synthetic */ class C22779a implements ComponentFactory {

    /* renamed from: a */
    private static final C22779a f56327a = new C22779a();

    private C22779a() {
    }

    /* renamed from: a */
    public static ComponentFactory m82768a() {
        return f56327a;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer) {
        return TransportRegistrar.lambda$getComponents$0(componentContainer);
    }
}
