package com.google.firebase.components;

/* renamed from: com.google.firebase.components.d */
final /* synthetic */ class C22760d implements ComponentFactory {

    /* renamed from: a */
    private final Object f56293a;

    private C22760d(Object obj) {
        this.f56293a = obj;
    }

    /* renamed from: a */
    public static ComponentFactory m82727a(Object obj) {
        return new C22760d(obj);
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer) {
        return Component.lambda$intoSet$2(this.f56293a, componentContainer);
    }
}
