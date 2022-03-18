package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

public class FunctionReference extends CallableReference implements FunctionBase, KFunction {
    private final int arity;

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.function(this);
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    public KFunction getReflected() {
        return (KFunction) super.getReflected();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable, kotlin.reflect.KFunction
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public int hashCode() {
        int i;
        if (getOwner() == null) {
            i = 0;
        } else {
            i = getOwner().hashCode() * 31;
        }
        return ((i + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        KCallable compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public FunctionReference(int i) {
        this.arity = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            if (getOwner() != null ? getOwner().equals(functionReference.getOwner()) : functionReference.getOwner() == null) {
                if (!getName().equals(functionReference.getName()) || !getSignature().equals(functionReference.getSignature()) || !Intrinsics.areEqual(getBoundReceiver(), functionReference.getBoundReceiver())) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (obj instanceof KFunction) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public FunctionReference(int i, Object obj) {
        super(obj);
        this.arity = i;
    }
}
