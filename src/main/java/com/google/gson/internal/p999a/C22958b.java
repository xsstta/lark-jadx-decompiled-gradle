package com.google.gson.internal.p999a;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.AbstractC23019g;
import com.google.gson.internal.C22998b;
import com.google.gson.internal.C23005c;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: com.google.gson.internal.a.b */
public final class C22958b implements TypeAdapterFactory {

    /* renamed from: a */
    private final C23005c f56704a;

    public C22958b(C23005c cVar) {
        this.f56704a = cVar;
    }

    /* renamed from: com.google.gson.internal.a.b$a */
    private static final class C22959a<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a */
        private final TypeAdapter<E> f56705a;

        /* renamed from: b */
        private final AbstractC23019g<? extends Collection<E>> f56706b;

        /* renamed from: a */
        public Collection<E> read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collection = (Collection) this.f56706b.mo79953a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collection.add(this.f56705a.read(jsonReader));
            }
            jsonReader.endArray();
            return collection;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (E e : collection) {
                this.f56705a.write(jsonWriter, e);
            }
            jsonWriter.endArray();
        }

        public C22959a(Gson gson, Type type, TypeAdapter<E> typeAdapter, AbstractC23019g<? extends Collection<E>> gVar) {
            this.f56705a = new C22984m(gson, typeAdapter, type);
            this.f56706b = gVar;
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type a = C22998b.m83430a(type, (Class<?>) rawType);
        return new C22959a(gson, a, gson.getAdapter(TypeToken.get(a)), this.f56704a.mo79951a(typeToken));
    }
}
