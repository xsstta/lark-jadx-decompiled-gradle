package com.google.gson.internal.p999a;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.AbstractC23019g;
import com.google.gson.internal.C22998b;
import com.google.gson.internal.C23005c;
import com.google.gson.internal.C23015d;
import com.google.gson.internal.C23021i;
import com.google.gson.internal.p1001b.AbstractC23003b;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.gson.internal.a.i */
public final class C22972i implements TypeAdapterFactory {

    /* renamed from: a */
    private final C23005c f56730a;

    /* renamed from: b */
    private final FieldNamingStrategy f56731b;

    /* renamed from: c */
    private final C23015d f56732c;

    /* renamed from: d */
    private final C22962d f56733d;

    /* renamed from: e */
    private final AbstractC23003b f56734e = AbstractC23003b.m83447a();

    /* renamed from: a */
    private List<String> m83342a(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.f56731b.translateName(field));
        }
        String value = serializedName.value();
        String[] alternate = serializedName.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* renamed from: com.google.gson.internal.a.i$a */
    public static final class C22974a<T> extends TypeAdapter<T> {

        /* renamed from: a */
        private final AbstractC23019g<T> f56742a;

        /* renamed from: b */
        private final Map<String, AbstractC22975b> f56743b;

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T a = this.f56742a.mo79953a();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    AbstractC22975b bVar = this.f56743b.get(jsonReader.nextName());
                    if (bVar != null) {
                        if (bVar.f56746j) {
                            bVar.mo79863a(jsonReader, a);
                        }
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return a;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        C22974a(AbstractC23019g<T> gVar, Map<String, AbstractC22975b> map) {
            this.f56742a = gVar;
            this.f56743b = map;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (AbstractC22975b bVar : this.f56743b.values()) {
                    if (bVar.mo79865a(t)) {
                        jsonWriter.name(bVar.f56744h);
                        bVar.mo79864a(jsonWriter, t);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: a */
    public boolean mo79862a(Field field, boolean z) {
        return m83344a(field, z, this.f56732c);
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        return new C22974a(this.f56730a.mo79951a(typeToken), m83343a(gson, (TypeToken<?>) typeToken, (Class<?>) rawType));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.a.i$b */
    public static abstract class AbstractC22975b {

        /* renamed from: h */
        final String f56744h;

        /* renamed from: i */
        final boolean f56745i;

        /* renamed from: j */
        final boolean f56746j;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo79863a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo79864a(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo79865a(Object obj) throws IOException, IllegalAccessException;

        protected AbstractC22975b(String str, boolean z, boolean z2) {
            this.f56744h = str;
            this.f56745i = z;
            this.f56746j = z2;
        }
    }

    /* renamed from: a */
    static boolean m83344a(Field field, boolean z, C23015d dVar) {
        if (dVar.mo79958a(field.getType(), z) || dVar.mo79959a(field, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private Map<String, AbstractC22975b> m83343a(Gson gson, TypeToken<?> typeToken, Class<?> cls) {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = typeToken.getType();
        TypeToken<?> typeToken2 = typeToken;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z2 = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean a = mo79862a(field, true);
                boolean a2 = mo79862a(field, z2);
                if (a || a2) {
                    this.f56734e.mo79949a(field);
                    Type a3 = C22998b.m83432a(typeToken2.getType(), cls2, field.getGenericType());
                    List<String> a4 = m83342a(field);
                    int size = a4.size();
                    AbstractC22975b bVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = a4.get(i2);
                        if (i2 != 0) {
                            z = false;
                        } else {
                            z = a;
                        }
                        AbstractC22975b bVar2 = (AbstractC22975b) linkedHashMap.put(str, m83341a(gson, field, str, TypeToken.get(a3), z, a2));
                        if (bVar == null) {
                            bVar = bVar2;
                        } else {
                            bVar = bVar;
                        }
                        i2++;
                        a = z;
                        a4 = a4;
                        size = size;
                        field = field;
                    }
                    if (bVar != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bVar.f56744h);
                    }
                }
                i++;
                z2 = false;
            }
            typeToken2 = TypeToken.get(C22998b.m83432a(typeToken2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = typeToken2.getRawType();
        }
        return linkedHashMap;
    }

    public C22972i(C23005c cVar, FieldNamingStrategy fieldNamingStrategy, C23015d dVar, C22962d dVar2) {
        this.f56730a = cVar;
        this.f56731b = fieldNamingStrategy;
        this.f56732c = dVar;
        this.f56733d = dVar2;
    }

    /* renamed from: a */
    private AbstractC22975b m83341a(final Gson gson, final Field field, String str, final TypeToken<?> typeToken, boolean z, boolean z2) {
        final TypeAdapter<?> typeAdapter;
        final boolean z3;
        final boolean a = C23021i.m83502a((Type) typeToken.getRawType());
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        if (jsonAdapter != null) {
            typeAdapter = this.f56733d.mo79821a(this.f56730a, gson, typeToken, jsonAdapter);
        } else {
            typeAdapter = null;
        }
        if (typeAdapter != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (typeAdapter == null) {
            typeAdapter = gson.getAdapter(typeToken);
        }
        return new AbstractC22975b(str, z, z2) {
            /* class com.google.gson.internal.p999a.C22972i.C229731 */

            @Override // com.google.gson.internal.p999a.C22972i.AbstractC22975b
            /* renamed from: a */
            public boolean mo79865a(Object obj) throws IOException, IllegalAccessException {
                if (this.f56745i && field.get(obj) != obj) {
                    return true;
                }
                return false;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.gson.internal.p999a.C22972i.AbstractC22975b
            /* renamed from: a */
            public void mo79863a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
                Object read = typeAdapter.read(jsonReader);
                if (read != null || !a) {
                    field.set(obj, read);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.gson.internal.p999a.C22972i.AbstractC22975b
            /* renamed from: a */
            public void mo79864a(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
                TypeAdapter typeAdapter;
                Object obj2 = field.get(obj);
                if (z3) {
                    typeAdapter = typeAdapter;
                } else {
                    typeAdapter = new C22984m(gson, typeAdapter, typeToken.getType());
                }
                typeAdapter.write(jsonWriter, obj2);
            }
        };
    }
}
