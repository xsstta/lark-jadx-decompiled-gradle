package com.google.firebase.components;

/* renamed from: com.google.firebase.components.b */
final /* synthetic */ class C22758b implements ComponentFactory {

    /* renamed from: a */
    private final Object f56291a;

    private C22758b(Object obj) {
        this.f56291a = obj;
    }

    /* renamed from: a */
    public static ComponentFactory m82725a(Object obj) {
        return new C22758b(obj);
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer) {
        return Component.lambda$of$0(this.f56291a, componentContainer);
    }
}
