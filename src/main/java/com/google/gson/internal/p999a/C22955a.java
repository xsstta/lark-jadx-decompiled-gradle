package com.google.gson.internal.p999a;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C22998b;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: com.google.gson.internal.a.a */
public final class C22955a<E> extends TypeAdapter<Object> {

    /* renamed from: a */
    public static final TypeAdapterFactory f56700a = new TypeAdapterFactory() {
        /* class com.google.gson.internal.p999a.C22955a.C229561 */

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g = C22998b.m83444g(type);
            return new C22955a(gson, gson.getAdapter(TypeToken.get(g)), C22998b.m83442e(g));
        }
    };

    /* renamed from: b */
    private final Class<E> f56701b;

    /* renamed from: c */
    private final TypeAdapter<E> f56702c;

    @Override // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f56702c.read(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f56701b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.gson.TypeAdapter<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f56702c.write(jsonWriter, Array.get(obj, i));
        }
        jsonWriter.endArray();
    }

    public C22955a(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f56702c = new C22984m(gson, typeAdapter, cls);
        this.f56701b = cls;
    }
}
