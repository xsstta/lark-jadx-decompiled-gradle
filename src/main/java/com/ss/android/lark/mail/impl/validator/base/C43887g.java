package com.ss.android.lark.mail.impl.validator.base;

import java.util.Collections;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.validator.base.g */
public final class C43887g<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public T get() {
        return this.reference;
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public T orNull() {
        return this.reference;
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public Set<T> asSet() {
        return Collections.singleton(this.reference);
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public String toString() {
        return "Optional.of(" + ((Object) this.reference) + ")";
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        C43886f.m173939a(optional);
        return this;
    }

    C43887g(T t) {
        this.reference = t;
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public T or(AbstractC43895k<? extends T> kVar) {
        C43886f.m173939a(kVar);
        return this.reference;
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public T or(T t) {
        C43886f.m173940a(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public boolean equals(Object obj) {
        if (obj instanceof C43887g) {
            return this.reference.equals(((C43887g) obj).reference);
        }
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.validator.base.Optional
    public <V> Optional<V> transform(AbstractC43884d<? super T, V> dVar) {
        return new C43887g(C43886f.m173940a(dVar.mo156266a(this.reference), "the Function passed to Optional.transform() must not return null."));
    }
}
