package com.ss.android.lark.mail.impl.validator.base;

import java.util.Collections;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.validator.base.a */
public final class C43864a<T> extends Optional<T> {
    static final C43864a<Object> INSTANCE = new C43864a<>();
    private static final long serialVersionUID = 0;

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public T orNull() {
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public String toString() {
        return "Optional.absent()";
    }

    private C43864a() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    static <T> Optional<T> withType() {
        return INSTANCE;
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public Set<T> asSet() {
        return Collections.emptySet();
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        return (Optional) C43886f.m173939a(optional);
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public <V> Optional<V> transform(AbstractC43884d<? super T, V> dVar) {
        C43886f.m173939a(dVar);
        return Optional.absent();
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public T or(AbstractC43895k<? extends T> kVar) {
        return (T) C43886f.m173940a(kVar.mo156280a(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public T or(T t) {
        return (T) C43886f.m173940a(t, "use Optional.orNull() instead of Optional.or(null)");
    }
}
