package androidx.activity.result;

import androidx.activity.result.AbstractC0211c;
import androidx.activity.result.p016a.AbstractC0209a;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* access modifiers changed from: package-private */
public class ActivityResultRegistry$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ String f447a;

    /* renamed from: b */
    final /* synthetic */ AbstractC0208a f448b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0209a f449c;

    /* renamed from: d */
    final /* synthetic */ AbstractC0211c f450d;

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (Lifecycle.Event.ON_START.equals(event)) {
            this.f450d.f457c.put(this.f447a, new AbstractC0211c.C0213a<>(this.f448b, this.f449c));
            if (this.f450d.f458d.containsKey(this.f447a)) {
                Object obj = this.f450d.f458d.get(this.f447a);
                this.f450d.f458d.remove(this.f447a);
                this.f448b.mo651a(obj);
            }
            ActivityResult activityResult = (ActivityResult) this.f450d.f459e.getParcelable(this.f447a);
            if (activityResult != null) {
                this.f450d.f459e.remove(this.f447a);
                this.f448b.mo651a(this.f449c.mo652a(activityResult.mo636a(), activityResult.mo637b()));
            }
        } else if (Lifecycle.Event.ON_STOP.equals(event)) {
            this.f450d.f457c.remove(this.f447a);
        } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
            this.f450d.mo655a(this.f447a);
        }
    }

    ActivityResultRegistry$1(AbstractC0211c cVar, String str, AbstractC0208a aVar, AbstractC0209a aVar2) {
        this.f450d = cVar;
        this.f447a = str;
        this.f448b = aVar;
        this.f449c = aVar2;
    }
}
