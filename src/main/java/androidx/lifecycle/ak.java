package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ak {

    /* renamed from: a */
    private final HashMap<String, AbstractC1142af> f4265a = new HashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Set<String> mo6008a() {
        return new HashSet(this.f4265a.keySet());
    }

    /* renamed from: b */
    public final void mo6010b() {
        for (AbstractC1142af afVar : this.f4265a.values()) {
            afVar.clear();
        }
        this.f4265a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC1142af mo6007a(String str) {
        return this.f4265a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo6009a(String str, AbstractC1142af afVar) {
        AbstractC1142af put = this.f4265a.put(str, afVar);
        if (put != null) {
            put.onCleared();
        }
    }
}
