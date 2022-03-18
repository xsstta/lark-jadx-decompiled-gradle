package com.google.gson.internal.p999a;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.AbstractC23018f;
import com.google.gson.internal.AbstractC23019g;
import com.google.gson.internal.C22998b;
import com.google.gson.internal.C23005c;
import com.google.gson.internal.C23022j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.gson.internal.a.g */
public final class C22967g implements TypeAdapterFactory {

    /* renamed from: a */
    final boolean f56721a;

    /* renamed from: b */
    private final C23005c f56722b;

    /* renamed from: com.google.gson.internal.a.g$a */
    private final class C22968a<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: b */
        private final TypeAdapter<K> f56724b;

        /* renamed from: c */
        private final TypeAdapter<V> f56725c;

        /* renamed from: d */
        private final AbstractC23019g<? extends Map<K, V>> f56726d;

        /* renamed from: a */
        private String m83338a(JsonElement jsonElement) {
            if (jsonElement.isJsonPrimitive()) {
                JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                if (asJsonPrimitive.isNumber()) {
                    return String.valueOf(asJsonPrimitive.getAsNumber());
                }
                if (asJsonPrimitive.isBoolean()) {
                    return Boolean.toString(asJsonPrimitive.getAsBoolean());
                }
                if (asJsonPrimitive.isString()) {
                    return asJsonPrimitive.getAsString();
                }
                throw new AssertionError();
            } else if (jsonElement.isJsonNull()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public Map<K, V> read(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> map = (Map) this.f56726d.mo79953a();
            if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K read = this.f56724b.read(jsonReader);
                    if (map.put(read, this.f56725c.read(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + ((Object) read));
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    AbstractC23018f.INSTANCE.promoteNameToValue(jsonReader);
                    K read2 = this.f56724b.read(jsonReader);
                    if (map.put(read2, this.f56725c.read(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + ((Object) read2));
                    }
                }
                jsonReader.endObject();
            }
            return map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: com.google.gson.TypeAdapter<V> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: com.google.gson.TypeAdapter<V> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            boolean z;
            if (map == null) {
                jsonWriter.nullValue();
            } else if (!C22967g.this.f56721a) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.f56725c.write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z2 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    JsonElement jsonTree = this.f56724b.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    if (jsonTree.isJsonArray() || jsonTree.isJsonObject()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 |= z;
                }
                if (z2) {
                    jsonWriter.beginArray();
                    int size = arrayList.size();
                    while (i < size) {
                        jsonWriter.beginArray();
                        C23022j.m83505a((JsonElement) arrayList.get(i), jsonWriter);
                        this.f56725c.write(jsonWriter, arrayList2.get(i));
                        jsonWriter.endArray();
                        i++;
                    }
                    jsonWriter.endArray();
                    return;
                }
                jsonWriter.beginObject();
                int size2 = arrayList.size();
                while (i < size2) {
                    jsonWriter.name(m83338a((JsonElement) arrayList.get(i)));
                    this.f56725c.write(jsonWriter, arrayList2.get(i));
                    i++;
                }
                jsonWriter.endObject();
            }
        }

        public C22968a(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, AbstractC23019g<? extends Map<K, V>> gVar) {
            this.f56724b = new C22984m(gson, typeAdapter, type);
            this.f56725c = new C22984m(gson, typeAdapter2, type2);
            this.f56726d = gVar;
        }
    }

    public C22967g(C23005c cVar, boolean z) {
        this.f56722b = cVar;
        this.f56721a = z;
    }

    /* renamed from: a */
    private TypeAdapter<?> m83337a(Gson gson, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return C22985n.f56798f;
        }
        return gson.getAdapter(TypeToken.get(type));
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        Type[] b = C22998b.m83439b(type, C22998b.m83442e(type));
        return new C22968a(gson, b[0], m83337a(gson, b[0]), b[1], gson.getAdapter(TypeToken.get(b[1])), this.f56722b.mo79951a(typeToken));
    }
}
