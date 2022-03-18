package androidx.activity.contextaware;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: androidx.activity.contextaware.a */
public final class C0204a {

    /* renamed from: a */
    private final Set<AbstractC0205b> f443a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f444b;

    /* renamed from: b */
    public void mo633b() {
        this.f444b = null;
    }

    /* renamed from: a */
    public Context mo630a() {
        return this.f444b;
    }

    /* renamed from: b */
    public void mo634b(AbstractC0205b bVar) {
        this.f443a.remove(bVar);
    }

    /* renamed from: a */
    public void mo632a(AbstractC0205b bVar) {
        if (this.f444b != null) {
            bVar.mo635a(this.f444b);
        }
        this.f443a.add(bVar);
    }

    /* renamed from: a */
    public void mo631a(Context context) {
        this.f444b = context;
        for (AbstractC0205b bVar : this.f443a) {
            bVar.mo635a(context);
        }
    }
}
