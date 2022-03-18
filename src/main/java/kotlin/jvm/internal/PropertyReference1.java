package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;

public abstract class PropertyReference1 extends PropertyReference implements KProperty1 {
    public PropertyReference1() {
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.property1(this);
    }

    @Override // kotlin.reflect.KProperty, kotlin.reflect.KProperty1
    public KProperty1.Getter getGetter() {
        return ((KProperty1) getReflected()).getGetter();
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.KProperty1
    public Object getDelegate(Object obj) {
        return ((KProperty1) getReflected()).getDelegate(obj);
    }
}
