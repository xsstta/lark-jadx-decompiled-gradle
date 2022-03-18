package com.google.android.libraries.places.internal;

import com.android.volley.C1936j;
import com.android.volley.toolbox.C1971m;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class zzab extends C1971m {
    private final /* synthetic */ Map zza;

    @Override // com.android.volley.Request
    public final Map<String, String> getHeaders() {
        return this.zza;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzab(zzx zzx, int i, String str, JSONObject jSONObject, C1936j.AbstractC1938b bVar, C1936j.AbstractC1937a aVar, Map map) {
        super(0, str, null, bVar, aVar);
        this.zza = map;
    }
}
