package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;

public abstract class CallableReference implements Serializable, KCallable {
    public static final Object NO_RECEIVER = C69114a.INSTANCE;
    protected final Object receiver;
    private transient KCallable reflected;

    /* access modifiers changed from: protected */
    public abstract KCallable computeReflected();

    /* renamed from: kotlin.jvm.internal.CallableReference$a */
    private static class C69114a implements Serializable {
        public static final C69114a INSTANCE = new C69114a();

        private C69114a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return INSTANCE;
        }
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    @Override // kotlin.reflect.KCallable
    public String getName() {
        throw new AbstractMethodError();
    }

    public KDeclarationContainer getOwner() {
        throw new AbstractMethodError();
    }

    public String getSignature() {
        throw new AbstractMethodError();
    }

    public KCallable compute() {
        KCallable kCallable = this.reflected;
        if (kCallable != null) {
            return kCallable;
        }
        KCallable computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // kotlin.reflect.KCallable
    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public KCallable getReflected() {
        KCallable compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.reflect.KCallable
    public KType getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // kotlin.reflect.KCallable
    public List<KTypeParameter> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.KCallable
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected CallableReference(Object obj) {
        this.receiver = obj;
    }

    @Override // kotlin.reflect.KCallable
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.KCallable
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }
}
