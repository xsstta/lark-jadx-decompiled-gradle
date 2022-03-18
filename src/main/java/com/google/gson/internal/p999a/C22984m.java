package com.google.gson.internal.p999a;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.p999a.C22972i;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.gson.internal.a.m */
final class C22984m<T> extends TypeAdapter<T> {

    /* renamed from: a */
    private final Gson f56764a;

    /* renamed from: b */
    private final TypeAdapter<T> f56765b;

    /* renamed from: c */
    private final Type f56766c;

    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) throws IOException {
        return this.f56765b.read(jsonReader);
    }

    /* renamed from: a */
    private Type m83359a(Type type, Object obj) {
        if (obj == null) {
            return type;
        }
        if (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) {
            return obj.getClass();
        }
        return type;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        TypeAdapter<T> typeAdapter = this.f56765b;
        Type a = m83359a(this.f56766c, t);
        if (a != this.f56766c) {
            typeAdapter = this.f56764a.getAdapter(TypeToken.get(a));
            if (typeAdapter instanceof C22972i.C22974a) {
                TypeAdapter<T> typeAdapter2 = this.f56765b;
                if (!(typeAdapter2 instanceof C22972i.C22974a)) {
                    typeAdapter = typeAdapter2;
                }
            }
        }
        typeAdapter.write(jsonWriter, t);
    }

    C22984m(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f56764a = gson;
        this.f56765b = typeAdapter;
        this.f56766c = type;
    }
}
