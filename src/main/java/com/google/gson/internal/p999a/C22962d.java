package com.google.gson.internal.p999a;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.C23005c;
import com.google.gson.reflect.TypeToken;

/* renamed from: com.google.gson.internal.a.d */
public final class C22962d implements TypeAdapterFactory {

    /* renamed from: a */
    private final C23005c f56709a;

    public C22962d(C23005c cVar) {
        this.f56709a = cVar;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return (TypeAdapter<T>) mo79821a(this.f56709a, gson, typeToken, jsonAdapter);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public TypeAdapter<?> mo79821a(C23005c cVar, Gson gson, TypeToken<?> typeToken, JsonAdapter jsonAdapter) {
        TypeAdapter<?> typeAdapter;
        JsonSerializer jsonSerializer;
        Object a = cVar.mo79951a(TypeToken.get((Class) jsonAdapter.value())).mo79953a();
        if (a instanceof TypeAdapter) {
            typeAdapter = (TypeAdapter) a;
        } else if (a instanceof TypeAdapterFactory) {
            typeAdapter = ((TypeAdapterFactory) a).create(gson, typeToken);
        } else {
            boolean z = a instanceof JsonSerializer;
            if (z || (a instanceof JsonDeserializer)) {
                JsonDeserializer jsonDeserializer = null;
                if (z) {
                    jsonSerializer = (JsonSerializer) a;
                } else {
                    jsonSerializer = null;
                }
                if (a instanceof JsonDeserializer) {
                    jsonDeserializer = (JsonDeserializer) a;
                }
                typeAdapter = new C22980l<>(jsonSerializer, jsonDeserializer, gson, typeToken, null);
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        if (typeAdapter == null || !jsonAdapter.nullSafe()) {
            return typeAdapter;
        }
        return typeAdapter.nullSafe();
    }
}
