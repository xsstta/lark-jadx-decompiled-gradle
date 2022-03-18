package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.p016a.AbstractC0209a;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: androidx.activity.result.c */
public abstract class AbstractC0211c {

    /* renamed from: a */
    private Random f455a = new Random();

    /* renamed from: b */
    ArrayList<String> f456b = new ArrayList<>();

    /* renamed from: c */
    final transient Map<String, C0213a<?>> f457c = new HashMap();

    /* renamed from: d */
    final Map<String, Object> f458d = new HashMap();

    /* renamed from: e */
    final Bundle f459e = new Bundle();

    /* renamed from: f */
    private final Map<Integer, String> f460f = new HashMap();

    /* renamed from: g */
    private final Map<String, Integer> f461g = new HashMap();

    /* renamed from: h */
    private final Map<String, C0214b> f462h = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: androidx.activity.result.c$b */
    public static class C0214b {

        /* renamed from: a */
        final Lifecycle f469a;

        /* renamed from: b */
        private final ArrayList<AbstractC1168n> f470b = new ArrayList<>();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo658a() {
            Iterator<AbstractC1168n> it = this.f470b.iterator();
            while (it.hasNext()) {
                this.f469a.removeObserver(it.next());
            }
            this.f470b.clear();
        }

        C0214b(Lifecycle lifecycle) {
            this.f469a = lifecycle;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo659a(AbstractC1168n nVar) {
            this.f469a.addObserver(nVar);
            this.f470b.add(nVar);
        }
    }

    /* renamed from: a */
    private int m641a() {
        int nextInt = this.f455a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f460f.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f455a.nextInt(2147418112);
        }
    }

    /* renamed from: b */
    private int m644b(String str) {
        Integer num = this.f461g.get(str);
        if (num != null) {
            return num.intValue();
        }
        int a = m641a();
        m642a(a, str);
        return a;
    }

    /* renamed from: b */
    public final void mo657b(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (!(stringArrayList == null || integerArrayList == null)) {
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    m642a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
                this.f456b = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f455a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f459e.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
    }

    /* renamed from: a */
    public final void mo654a(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f460f.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f460f.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f456b));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f459e.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f455a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo655a(String str) {
        Integer remove;
        if (!this.f456b.contains(str) && (remove = this.f461g.remove(str)) != null) {
            this.f460f.remove(remove);
        }
        this.f457c.remove(str);
        if (this.f458d.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f458d.get(str));
            this.f458d.remove(str);
        }
        if (this.f459e.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f459e.getParcelable(str));
            this.f459e.remove(str);
        }
        C0214b bVar = this.f462h.get(str);
        if (bVar != null) {
            bVar.mo658a();
            this.f462h.remove(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.activity.result.c$a */
    public static class C0213a<O> {

        /* renamed from: a */
        final AbstractC0208a<O> f467a;

        /* renamed from: b */
        final AbstractC0209a<?, O> f468b;

        C0213a(AbstractC0208a<O> aVar, AbstractC0209a<?, O> aVar2) {
            this.f467a = aVar;
            this.f468b = aVar2;
        }
    }

    /* renamed from: a */
    private void m642a(int i, String str) {
        this.f460f.put(Integer.valueOf(i), str);
        this.f461g.put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final boolean mo656a(int i, int i2, Intent intent) {
        String str = this.f460f.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f456b.remove(str);
        m643a(str, i2, intent, this.f457c.get(str));
        return true;
    }

    /* renamed from: a */
    private <O> void m643a(String str, int i, Intent intent, C0213a<O> aVar) {
        if (aVar == null || aVar.f467a == null) {
            this.f458d.remove(str);
            this.f459e.putParcelable(str, new ActivityResult(i, intent));
            return;
        }
        aVar.f467a.mo651a(aVar.f468b.mo652a(i, intent));
    }

    /* renamed from: a */
    public final <I, O> AbstractC0210b<I> mo653a(final String str, LifecycleOwner lifecycleOwner, final AbstractC0209a<I, O> aVar, AbstractC0208a<O> aVar2) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            final int b = m644b(str);
            C0214b bVar = this.f462h.get(str);
            if (bVar == null) {
                bVar = new C0214b(lifecycle);
            }
            bVar.mo659a(new ActivityResultRegistry$1(this, str, aVar2, aVar));
            this.f462h.put(str, bVar);
            return new AbstractC0210b<I>() {
                /* class androidx.activity.result.AbstractC0211c.C02121 */
            };
        }
        throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.");
    }
}
