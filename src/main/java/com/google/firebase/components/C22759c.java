package com.google.firebase.components;

/* renamed from: com.google.firebase.components.c */
final /* synthetic */ class C22759c implements ComponentFactory {

    /* renamed from: a */
    private final Object f56292a;

    private C22759c(Object obj) {
        this.f56292a = obj;
    }

    /* renamed from: a */
    public static ComponentFactory m82726a(Object obj) {
        return new C22759c(obj);
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer) {
        return Component.lambda$of$1(this.f56292a, componentContainer);
    }
}
