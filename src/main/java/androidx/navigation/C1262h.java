package androidx.navigation;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.ak;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* access modifiers changed from: package-private */
/* renamed from: androidx.navigation.h */
public class C1262h extends AbstractC1142af {
    private static final C1144ai.AbstractC1146b FACTORY = new C1144ai.AbstractC1146b() {
        /* class androidx.navigation.C1262h.C12631 */

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            return new C1262h();
        }
    };
    private final HashMap<UUID, ak> mViewModelStores = new HashMap<>();

    C1262h() {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        for (ak akVar : this.mViewModelStores.values()) {
            akVar.mo6010b();
        }
        this.mViewModelStores.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.mViewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static C1262h getInstance(ak akVar) {
        return (C1262h) new C1144ai(akVar, FACTORY).mo6005a(C1262h.class);
    }

    /* access modifiers changed from: package-private */
    public void clear(UUID uuid) {
        ak remove = this.mViewModelStores.remove(uuid);
        if (remove != null) {
            remove.mo6010b();
        }
    }

    /* access modifiers changed from: package-private */
    public ak getViewModelStore(UUID uuid) {
        ak akVar = this.mViewModelStores.get(uuid);
        if (akVar != null) {
            return akVar;
        }
        ak akVar2 = new ak();
        this.mViewModelStores.put(uuid, akVar2);
        return akVar2;
    }
}
