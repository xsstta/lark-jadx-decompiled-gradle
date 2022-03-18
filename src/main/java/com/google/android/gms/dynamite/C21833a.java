package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.dynamite.a */
public final class C21833a implements DynamiteModule.VersionPolicy.AbstractC21829a {
    C21833a() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.AbstractC21829a
    /* renamed from: a */
    public final int mo73909a(Context context, String str, boolean z) throws DynamiteModule.LoadingException {
        return DynamiteModule.zza(context, str, z);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.AbstractC21829a
    /* renamed from: a */
    public final int mo73908a(Context context, String str) {
        return DynamiteModule.getLocalVersion(context, str);
    }
}
