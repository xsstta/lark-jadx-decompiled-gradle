package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.b */
final class C21834b implements DynamiteModule.VersionPolicy {
    C21834b() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.C21830b zza(Context context, String str, DynamiteModule.VersionPolicy.AbstractC21829a aVar) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.C21830b bVar = new DynamiteModule.VersionPolicy.C21830b();
        bVar.f53248b = aVar.mo73909a(context, str, true);
        if (bVar.f53248b != 0) {
            bVar.f53249c = 1;
        } else {
            bVar.f53247a = aVar.mo73908a(context, str);
            if (bVar.f53247a != 0) {
                bVar.f53249c = -1;
            }
        }
        return bVar;
    }
}
