package com.google.gson.internal.p999a;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C22954a;
import com.google.gson.internal.C23022j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

/* renamed from: com.google.gson.internal.a.l */
public final class C22980l<T> extends TypeAdapter<T> {

    /* renamed from: a */
    final Gson f56751a;

    /* renamed from: b */
    private final JsonSerializer<T> f56752b;

    /* renamed from: c */
    private final JsonDeserializer<T> f56753c;

    /* renamed from: d */
    private final TypeToken<T> f56754d;

    /* renamed from: e */
    private final TypeAdapterFactory f56755e;

    /* renamed from: f */
    private final C22980l<T>.C22982a f56756f = new C22982a();

    /* renamed from: g */
    private TypeAdapter<T> f56757g;

    /* renamed from: a */
    private TypeAdapter<T> m83356a() {
        TypeAdapter<T> typeAdapter = this.f56757g;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> delegateAdapter = this.f56751a.getDelegateAdapter(this.f56755e, this.f56754d);
        this.f56757g = delegateAdapter;
        return delegateAdapter;
    }

    /* renamed from: com.google.gson.internal.a.l$a */
    private final class C22982a implements JsonDeserializationContext, JsonSerializationContext {
        private C22982a() {
        }

        @Override // com.google.gson.JsonSerializationContext
        public JsonElement serialize(Object obj) {
            return C22980l.this.f56751a.toJsonTree(obj);
        }

        @Override // com.google.gson.JsonDeserializationContext
        public <R> R deserialize(JsonElement jsonElement, Type type) throws JsonParseException {
            return (R) C22980l.this.f56751a.fromJson(jsonElement, type);
        }

        @Override // com.google.gson.JsonSerializationContext
        public JsonElement serialize(Object obj, Type type) {
            return C22980l.this.f56751a.toJsonTree(obj, type);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) throws IOException {
        if (this.f56753c == null) {
            return m83356a().read(jsonReader);
        }
        JsonElement a = C23022j.m83503a(jsonReader);
        if (a.isJsonNull()) {
            return null;
        }
        return this.f56753c.deserialize(a, this.f56754d.getType(), this.f56756f);
    }

    /* renamed from: a */
    public static TypeAdapterFactory m83358a(Class<?> cls, Object obj) {
        return new C22983b(obj, null, false, cls);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.gson.internal.a.l$b */
    public static final class C22983b implements TypeAdapterFactory {

        /* renamed from: a */
        private final TypeToken<?> f56759a;

        /* renamed from: b */
        private final boolean f56760b;

        /* renamed from: c */
        private final Class<?> f56761c;

        /* renamed from: d */
        private final JsonSerializer<?> f56762d;

        /* renamed from: e */
        private final JsonDeserializer<?> f56763e;

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            boolean z;
            TypeToken<?> typeToken2 = this.f56759a;
            if (typeToken2 == null) {
                z = this.f56761c.isAssignableFrom(typeToken.getRawType());
            } else if (typeToken2.equals(typeToken) || (this.f56760b && this.f56759a.getType() == typeToken.getRawType())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new C22980l(this.f56762d, this.f56763e, gson, typeToken, this);
            }
            return null;
        }

        C22983b(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
            JsonSerializer<?> jsonSerializer;
            boolean z2;
            JsonDeserializer<?> jsonDeserializer = null;
            if (obj instanceof JsonSerializer) {
                jsonSerializer = (JsonSerializer) obj;
            } else {
                jsonSerializer = null;
            }
            this.f56762d = jsonSerializer;
            jsonDeserializer = obj instanceof JsonDeserializer ? (JsonDeserializer) obj : jsonDeserializer;
            this.f56763e = jsonDeserializer;
            if (jsonSerializer == null && jsonDeserializer == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            C22954a.m83317a(z2);
            this.f56759a = typeToken;
            this.f56760b = z;
            this.f56761c = cls;
        }
    }

    /* renamed from: a */
    public static TypeAdapterFactory m83357a(TypeToken<?> typeToken, Object obj) {
        boolean z;
        if (typeToken.getType() == typeToken.getRawType()) {
            z = true;
        } else {
            z = false;
        }
        return new C22983b(obj, typeToken, z, null);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        JsonSerializer<T> jsonSerializer = this.f56752b;
        if (jsonSerializer == null) {
            m83356a().write(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            C23022j.m83505a(jsonSerializer.serialize(t, this.f56754d.getType(), this.f56756f), jsonWriter);
        }
    }

    public C22980l(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory) {
        this.f56752b = jsonSerializer;
        this.f56753c = jsonDeserializer;
        this.f56751a = gson;
        this.f56754d = typeToken;
        this.f56755e = typeAdapterFactory;
    }
}
