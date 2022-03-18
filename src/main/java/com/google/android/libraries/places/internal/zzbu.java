package com.google.android.libraries.places.internal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public final class zzbu implements zzal {
    private final Gson zza = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    @Override // com.google.android.libraries.places.internal.zzal
    public final <T> T zza(String str, Class<T> cls) throws zzao {
        try {
            return (T) this.zza.fromJson(str, (Class) cls);
        } catch (JsonSyntaxException unused) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 55);
            sb.append("Could not convert JSON string to ");
            sb.append(name);
            sb.append(" due to syntax errors.");
            throw new zzao(sb.toString());
        }
    }
}
