package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.internal.C21751j;
import java.util.ArrayList;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.ab */
public final class C21646ab extends AbstractRunnableC21652ah {

    /* renamed from: a */
    final /* synthetic */ C21690y f52623a;

    /* renamed from: b */
    private final Map<C21611a.AbstractC21622f, C21645aa> f52624b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21646ab(C21690y yVar, Map<C21611a.AbstractC21622f, C21645aa> map) {
        super(yVar, null);
        this.f52623a = yVar;
        this.f52624b = map;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC21652ah
    /* renamed from: a */
    public final void mo73336a() {
        C21751j jVar = new C21751j(this.f52623a.f52890d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C21611a.AbstractC21622f fVar : this.f52624b.keySet()) {
            if (!fVar.requiresGooglePlayServices() || (this.f52624b.get(fVar).f52622c)) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            ArrayList arrayList3 = arrayList2;
            int size = arrayList3.size();
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                i = jVar.mo73724a(this.f52623a.f52889c, (C21611a.AbstractC21622f) obj);
                if (i == 0) {
                    break;
                }
            }
        } else {
            ArrayList arrayList4 = arrayList;
            int size2 = arrayList4.size();
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                i = jVar.mo73724a(this.f52623a.f52889c, (C21611a.AbstractC21622f) obj2);
                if (i != 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.f52623a.f52887a.mo73366a(new C21647ac(this, this.f52623a, new ConnectionResult(i, null)));
            return;
        }
        if ((this.f52623a.f52899m) && this.f52623a.f52897k != null) {
            this.f52623a.f52897k.mo74971c();
        }
        for (C21611a.AbstractC21622f fVar2 : this.f52624b.keySet()) {
            C21645aa aaVar = this.f52624b.get(fVar2);
            if (!fVar2.requiresGooglePlayServices() || jVar.mo73724a(this.f52623a.f52889c, fVar2) == 0) {
                fVar2.connect(aaVar);
            } else {
                this.f52623a.f52887a.mo73366a(new C21648ad(this, this.f52623a, aaVar));
            }
        }
    }
}
