package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.Navigator;

@Navigator.Name("navigation")
/* renamed from: androidx.navigation.l */
public class C1271l extends Navigator<C1269k> {

    /* renamed from: a */
    private final C1293s f4570a;

    @Override // androidx.navigation.Navigator
    /* renamed from: c */
    public boolean mo6266c() {
        return true;
    }

    /* renamed from: a */
    public C1269k mo6267d() {
        return new C1269k(this);
    }

    public C1271l(C1293s sVar) {
        this.f4570a = sVar;
    }

    /* renamed from: a */
    public NavDestination mo6264a(C1269k kVar, Bundle bundle, C1275p pVar, Navigator.AbstractC1241a aVar) {
        int a = kVar.mo6368a();
        if (a != 0) {
            NavDestination a2 = kVar.mo6369a(a, false);
            if (a2 != null) {
                return this.f4570a.mo6457a(a2.mo6256j()).mo6264a(a2, a2.mo6241a(bundle), pVar, aVar);
            }
            String b = kVar.mo6371b();
            throw new IllegalArgumentException("navigation destination " + b + " is not a direct child of this NavGraph");
        }
        throw new IllegalStateException("no start destination defined via app:startDestination for " + kVar.mo6255i());
    }
}
