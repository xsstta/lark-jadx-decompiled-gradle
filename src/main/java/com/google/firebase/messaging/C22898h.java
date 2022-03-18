package com.google.firebase.messaging;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* renamed from: com.google.firebase.messaging.h */
final /* synthetic */ class C22898h implements ComponentFactory {

    /* renamed from: a */
    static final ComponentFactory f56605a = new C22898h();

    private C22898h() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return FirebaseMessagingRegistrar.lambda$getComponents$0$FirebaseMessagingRegistrar(componentContainer);
    }
}
