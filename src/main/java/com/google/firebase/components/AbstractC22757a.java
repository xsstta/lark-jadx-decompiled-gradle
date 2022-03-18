package com.google.firebase.components;

import com.google.firebase.p995a.AbstractC22752a;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.a */
public abstract class AbstractC22757a implements ComponentContainer {
    AbstractC22757a() {
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(Class<T> cls) {
        AbstractC22752a<T> provider = getProvider(cls);
        if (provider == null) {
            return null;
        }
        return provider.mo79125a();
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Set<T> setOf(Class<T> cls) {
        return setOfProvider(cls).mo79125a();
    }
}
