package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.l */
public final class C1041l extends AbstractC1142af {
    private static final C1144ai.AbstractC1146b FACTORY = new C1144ai.AbstractC1146b() {
        /* class androidx.fragment.app.C1041l.C10421 */

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            return new C1041l(true);
        }
    };
    private final HashMap<String, C1041l> mChildNonConfigs = new HashMap<>();
    private boolean mHasBeenCleared = false;
    private boolean mHasSavedSnapshot = false;
    private final HashMap<String, Fragment> mRetainedFragments = new HashMap<>();
    private final boolean mStateAutomaticallySaved;
    private final HashMap<String, ak> mViewModelStores = new HashMap<>();

    /* access modifiers changed from: package-private */
    public boolean isCleared() {
        return this.mHasBeenCleared;
    }

    /* access modifiers changed from: package-private */
    public Collection<Fragment> getRetainedFragments() {
        return this.mRetainedFragments.values();
    }

    public int hashCode() {
        return (((this.mRetainedFragments.hashCode() * 31) + this.mChildNonConfigs.hashCode()) * 31) + this.mViewModelStores.hashCode();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.mHasBeenCleared = true;
    }

    /* access modifiers changed from: package-private */
    public C1040k getSnapshot() {
        if (this.mRetainedFragments.isEmpty() && this.mChildNonConfigs.isEmpty() && this.mViewModelStores.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, C1041l> entry : this.mChildNonConfigs.entrySet()) {
            C1040k snapshot = entry.getValue().getSnapshot();
            if (snapshot != null) {
                hashMap.put(entry.getKey(), snapshot);
            }
        }
        this.mHasSavedSnapshot = true;
        if (!this.mRetainedFragments.isEmpty() || !hashMap.isEmpty() || !this.mViewModelStores.isEmpty()) {
            return new C1040k(new ArrayList(this.mRetainedFragments.values()), hashMap, new HashMap(this.mViewModelStores));
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.mRetainedFragments.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.mChildNonConfigs.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.mViewModelStores.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static C1041l getInstance(ak akVar) {
        return (C1041l) new C1144ai(akVar, FACTORY).mo6005a(C1041l.class);
    }

    /* access modifiers changed from: package-private */
    public Fragment findRetainedFragmentByWho(String str) {
        return this.mRetainedFragments.get(str);
    }

    /* access modifiers changed from: package-private */
    public boolean removeRetainedFragment(Fragment fragment) {
        if (this.mRetainedFragments.remove(fragment.mWho) != null) {
            return true;
        }
        return false;
    }

    C1041l(boolean z) {
        this.mStateAutomaticallySaved = z;
    }

    /* access modifiers changed from: package-private */
    public boolean addRetainedFragment(Fragment fragment) {
        if (this.mRetainedFragments.containsKey(fragment.mWho)) {
            return false;
        }
        this.mRetainedFragments.put(fragment.mWho, fragment);
        return true;
    }

    /* access modifiers changed from: package-private */
    public C1041l getChildNonConfig(Fragment fragment) {
        C1041l lVar = this.mChildNonConfigs.get(fragment.mWho);
        if (lVar != null) {
            return lVar;
        }
        C1041l lVar2 = new C1041l(this.mStateAutomaticallySaved);
        this.mChildNonConfigs.put(fragment.mWho, lVar2);
        return lVar2;
    }

    /* access modifiers changed from: package-private */
    public ak getViewModelStore(Fragment fragment) {
        ak akVar = this.mViewModelStores.get(fragment.mWho);
        if (akVar != null) {
            return akVar;
        }
        ak akVar2 = new ak();
        this.mViewModelStores.put(fragment.mWho, akVar2);
        return akVar2;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDestroy(Fragment fragment) {
        if (!this.mRetainedFragments.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.mStateAutomaticallySaved) {
            return this.mHasBeenCleared;
        }
        return !this.mHasSavedSnapshot;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1041l lVar = (C1041l) obj;
        if (!this.mRetainedFragments.equals(lVar.mRetainedFragments) || !this.mChildNonConfigs.equals(lVar.mChildNonConfigs) || !this.mViewModelStores.equals(lVar.mViewModelStores)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void clearNonConfigState(Fragment fragment) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C1041l lVar = this.mChildNonConfigs.get(fragment.mWho);
        if (lVar != null) {
            lVar.onCleared();
            this.mChildNonConfigs.remove(fragment.mWho);
        }
        ak akVar = this.mViewModelStores.get(fragment.mWho);
        if (akVar != null) {
            akVar.mo6010b();
            this.mViewModelStores.remove(fragment.mWho);
        }
    }

    /* access modifiers changed from: package-private */
    public void restoreFromSnapshot(C1040k kVar) {
        this.mRetainedFragments.clear();
        this.mChildNonConfigs.clear();
        this.mViewModelStores.clear();
        if (kVar != null) {
            Collection<Fragment> a = kVar.mo5577a();
            if (a != null) {
                for (Fragment fragment : a) {
                    if (fragment != null) {
                        this.mRetainedFragments.put(fragment.mWho, fragment);
                    }
                }
            }
            Map<String, C1040k> b = kVar.mo5578b();
            if (b != null) {
                for (Map.Entry<String, C1040k> entry : b.entrySet()) {
                    C1041l lVar = new C1041l(this.mStateAutomaticallySaved);
                    lVar.restoreFromSnapshot(entry.getValue());
                    this.mChildNonConfigs.put(entry.getKey(), lVar);
                }
            }
            Map<String, ak> c = kVar.mo5579c();
            if (c != null) {
                this.mViewModelStores.putAll(c);
            }
        }
        this.mHasSavedSnapshot = false;
    }
}
