package com.google.gson;

import com.google.gson.internal.C23005c;
import com.google.gson.internal.C23015d;
import com.google.gson.internal.C23021i;
import com.google.gson.internal.C23022j;
import com.google.gson.internal.p999a.C22955a;
import com.google.gson.internal.p999a.C22958b;
import com.google.gson.internal.p999a.C22960c;
import com.google.gson.internal.p999a.C22962d;
import com.google.gson.internal.p999a.C22963e;
import com.google.gson.internal.p999a.C22965f;
import com.google.gson.internal.p999a.C22967g;
import com.google.gson.internal.p999a.C22969h;
import com.google.gson.internal.p999a.C22972i;
import com.google.gson.internal.p999a.C22976j;
import com.google.gson.internal.p999a.C22978k;
import com.google.gson.internal.p999a.C22985n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Gson {
    static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    static final boolean DEFAULT_ESCAPE_HTML = true;
    static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    static final boolean DEFAULT_LENIENT = false;
    static final boolean DEFAULT_PRETTY_PRINT = false;
    static final boolean DEFAULT_SERIALIZE_NULLS = false;
    static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    private static final TypeToken<?> NULL_KEY_SURROGATE = TypeToken.get(Object.class);
    final List<TypeAdapterFactory> builderFactories;
    final List<TypeAdapterFactory> builderHierarchyFactories;
    private final ThreadLocal<Map<TypeToken<?>, FutureTypeAdapter<?>>> calls;
    final boolean complexMapKeySerialization;
    private final C23005c constructorConstructor;
    final String datePattern;
    final int dateStyle;
    final C23015d excluder;
    final List<TypeAdapterFactory> factories;
    final FieldNamingStrategy fieldNamingStrategy;
    final boolean generateNonExecutableJson;
    final boolean htmlSafe;
    final Map<Type, InstanceCreator<?>> instanceCreators;
    private final C22962d jsonAdapterFactory;
    final boolean lenient;
    final LongSerializationPolicy longSerializationPolicy;
    final boolean prettyPrinting;
    final boolean serializeNulls;
    final boolean serializeSpecialFloatingPointValues;
    final int timeStyle;
    private final Map<TypeToken<?>, TypeAdapter<?>> typeTokenCache;

    /* access modifiers changed from: package-private */
    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {
        private TypeAdapter<T> delegate;

        FutureTypeAdapter() {
        }

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
            TypeAdapter<T> typeAdapter = this.delegate;
            if (typeAdapter != null) {
                return typeAdapter.read(jsonReader);
            }
            throw new IllegalStateException();
        }

        public void setDelegate(TypeAdapter<T> typeAdapter) {
            if (this.delegate == null) {
                this.delegate = typeAdapter;
                return;
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            TypeAdapter<T> typeAdapter = this.delegate;
            if (typeAdapter != null) {
                typeAdapter.write(jsonWriter, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C23015d excluder() {
        return this.excluder;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public boolean htmlSafe() {
        return this.htmlSafe;
    }

    public boolean serializeNulls() {
        return this.serializeNulls;
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public Gson() {
        this(C23015d.f56868a, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, DEFAULT_ESCAPE_HTML, false, false, false, LongSerializationPolicy.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public String toString() {
        return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
    }

    private static TypeAdapter<AtomicLong> atomicLongAdapter(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLong>() {
            /* class com.google.gson.Gson.C229334 */

            @Override // com.google.gson.TypeAdapter
            public AtomicLong read(JsonReader jsonReader) throws IOException {
                return new AtomicLong(((Number) typeAdapter.read(jsonReader)).longValue());
            }

            public void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
                typeAdapter.write(jsonWriter, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe();
    }

    private static TypeAdapter<AtomicLongArray> atomicLongArrayAdapter(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLongArray>() {
            /* class com.google.gson.Gson.C229345 */

            @Override // com.google.gson.TypeAdapter
            public AtomicLongArray read(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) typeAdapter.read(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    typeAdapter.write(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
    }

    private TypeAdapter<Number> doubleAdapter(boolean z) {
        if (z) {
            return C22985n.f56814v;
        }
        return new TypeAdapter<Number>() {
            /* class com.google.gson.Gson.C229301 */

            /* Return type fixed from 'java.lang.Double' to match base method */
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                Gson.checkValidFloatingPoint(number.doubleValue());
                jsonWriter.value(number);
            }
        };
    }

    private TypeAdapter<Number> floatAdapter(boolean z) {
        if (z) {
            return C22985n.f56813u;
        }
        return new TypeAdapter<Number>() {
            /* class com.google.gson.Gson.C229312 */

            /* Return type fixed from 'java.lang.Float' to match base method */
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                Gson.checkValidFloatingPoint((double) number.floatValue());
                jsonWriter.value(number);
            }
        };
    }

    private static TypeAdapter<Number> longAdapter(LongSerializationPolicy longSerializationPolicy2) {
        if (longSerializationPolicy2 == LongSerializationPolicy.DEFAULT) {
            return C22985n.f56812t;
        }
        return new TypeAdapter<Number>() {
            /* class com.google.gson.Gson.C229323 */

            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Long.valueOf(jsonReader.nextLong());
                }
                jsonReader.nextNull();
                return null;
            }

            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.toString());
                }
            }
        };
    }

    public <T> TypeAdapter<T> getAdapter(Class<T> cls) {
        return getAdapter(TypeToken.get((Class) cls));
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.lenient);
        return jsonReader;
    }

    public String toJson(JsonElement jsonElement) {
        StringWriter stringWriter = new StringWriter();
        toJson(jsonElement, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public JsonElement toJsonTree(Object obj) {
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        return toJsonTree(obj, obj.getClass());
    }

    public JsonWriter newJsonWriter(Writer writer) throws IOException {
        if (this.generateNonExecutableJson) {
            writer.write(JSON_NON_EXECUTABLE_PREFIX);
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.prettyPrinting) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.serializeNulls);
        return jsonWriter;
    }

    public String toJson(Object obj) {
        if (obj == null) {
            return toJson((JsonElement) JsonNull.INSTANCE);
        }
        return toJson(obj, obj.getClass());
    }

    static void checkValidFloatingPoint(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r4v4. Raw type applied. Possible types: com.google.gson.TypeAdapter<T>, com.google.gson.TypeAdapter<?> */
    public <T> TypeAdapter<T> getAdapter(TypeToken<T> typeToken) {
        Object obj;
        Map<TypeToken<?>, TypeAdapter<?>> map = this.typeTokenCache;
        if (typeToken == null) {
            obj = NULL_KEY_SURROGATE;
        } else {
            obj = typeToken;
        }
        TypeAdapter<T> typeAdapter = (TypeAdapter<T>) map.get(obj);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map<TypeToken<?>, FutureTypeAdapter<?>> map2 = this.calls.get();
        boolean z = false;
        if (map2 == null) {
            map2 = new HashMap<>();
            this.calls.set(map2);
            z = DEFAULT_ESCAPE_HTML;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map2.get(typeToken);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map2.put(typeToken, futureTypeAdapter2);
            for (TypeAdapterFactory typeAdapterFactory : this.factories) {
                TypeAdapter typeAdapter2 = (TypeAdapter<T>) typeAdapterFactory.create(this, typeToken);
                if (typeAdapter2 != null) {
                    futureTypeAdapter2.setDelegate(typeAdapter2);
                    this.typeTokenCache.put(typeToken, typeAdapter2);
                    return typeAdapter2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + typeToken);
        } finally {
            map2.remove(typeToken);
            if (z) {
                this.calls.remove();
            }
        }
    }

    public <T> T fromJson(JsonElement jsonElement, Class<T> cls) throws JsonSyntaxException {
        return (T) C23021i.m83500a((Class) cls).cast(fromJson(jsonElement, (Type) cls));
    }

    public <T> T fromJson(JsonElement jsonElement, Type type) throws JsonSyntaxException {
        if (jsonElement == null) {
            return null;
        }
        return (T) fromJson(new C22963e(jsonElement), type);
    }

    public JsonElement toJsonTree(Object obj, Type type) {
        C22965f fVar = new C22965f();
        toJson(obj, type, fVar);
        return fVar.mo79842a();
    }

    private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
    }

    public <T> T fromJson(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        JsonReader newJsonReader = newJsonReader(reader);
        Object fromJson = fromJson(newJsonReader, cls);
        assertFullConsumption(fromJson, newJsonReader);
        return (T) C23021i.m83500a((Class) cls).cast(fromJson);
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        toJson(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) throws JsonIOException, JsonSyntaxException {
        boolean isLenient = jsonReader.isLenient();
        boolean z = DEFAULT_ESCAPE_HTML;
        jsonReader.setLenient(DEFAULT_ESCAPE_HTML);
        try {
            jsonReader.peek();
            z = false;
            T read = getAdapter(TypeToken.get(type)).read(jsonReader);
            jsonReader.setLenient(isLenient);
            return read;
        } catch (EOFException e) {
            if (z) {
                jsonReader.setLenient(isLenient);
                return null;
            }
            throw new JsonSyntaxException(e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException(e2);
        } catch (IOException e3) {
            throw new JsonSyntaxException(e3);
        } catch (AssertionError e4) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e4.getMessage(), e4);
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    public <T> TypeAdapter<T> getDelegateAdapter(TypeAdapterFactory typeAdapterFactory, TypeToken<T> typeToken) {
        if (!this.factories.contains(typeAdapterFactory)) {
            typeAdapterFactory = this.jsonAdapterFactory;
        }
        boolean z = false;
        for (TypeAdapterFactory typeAdapterFactory2 : this.factories) {
            if (z) {
                TypeAdapter<T> create = typeAdapterFactory2.create(this, typeToken);
                if (create != null) {
                    return create;
                }
            } else if (typeAdapterFactory2 == typeAdapterFactory) {
                z = DEFAULT_ESCAPE_HTML;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public void toJson(JsonElement jsonElement, JsonWriter jsonWriter) throws JsonIOException {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(DEFAULT_ESCAPE_HTML);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls2 = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            C23022j.m83505a(jsonElement, jsonWriter);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls2);
        } catch (IOException e) {
            throw new JsonIOException(e);
        } catch (AssertionError e2) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls2);
            throw th;
        }
    }

    public <T> T fromJson(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        JsonReader newJsonReader = newJsonReader(reader);
        T t = (T) fromJson(newJsonReader, type);
        assertFullConsumption(t, newJsonReader);
        return t;
    }

    public void toJson(JsonElement jsonElement, Appendable appendable) throws JsonIOException {
        try {
            toJson(jsonElement, newJsonWriter(C23022j.m83504a(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) C23021i.m83500a((Class) cls).cast(fromJson(str, (Type) cls));
    }

    public void toJson(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            toJson(obj, obj.getClass(), appendable);
        } else {
            toJson((JsonElement) JsonNull.INSTANCE, appendable);
        }
    }

    public <T> T fromJson(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) fromJson(new StringReader(str), type);
    }

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        TypeAdapter adapter = getAdapter(TypeToken.get(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(DEFAULT_ESCAPE_HTML);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls2 = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            adapter.write(jsonWriter, obj);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls2);
        } catch (IOException e) {
            throw new JsonIOException(e);
        } catch (AssertionError e2) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls2);
            throw th;
        }
    }

    public void toJson(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            toJson(obj, type, newJsonWriter(C23022j.m83504a(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    Gson(C23015d dVar, FieldNamingStrategy fieldNamingStrategy2, Map<Type, InstanceCreator<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy2, String str, int i, int i2, List<TypeAdapterFactory> list, List<TypeAdapterFactory> list2, List<TypeAdapterFactory> list3) {
        this.calls = new ThreadLocal<>();
        this.typeTokenCache = new ConcurrentHashMap();
        this.excluder = dVar;
        this.fieldNamingStrategy = fieldNamingStrategy2;
        this.instanceCreators = map;
        C23005c cVar = new C23005c(map);
        this.constructorConstructor = cVar;
        this.serializeNulls = z;
        this.complexMapKeySerialization = z2;
        this.generateNonExecutableJson = z3;
        this.htmlSafe = z4;
        this.prettyPrinting = z5;
        this.lenient = z6;
        this.serializeSpecialFloatingPointValues = z7;
        this.longSerializationPolicy = longSerializationPolicy2;
        this.datePattern = str;
        this.dateStyle = i;
        this.timeStyle = i2;
        this.builderFactories = list;
        this.builderHierarchyFactories = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C22985n.f56791Y);
        arrayList.add(C22969h.f56727a);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(C22985n.f56770D);
        arrayList.add(C22985n.f56805m);
        arrayList.add(C22985n.f56799g);
        arrayList.add(C22985n.f56801i);
        arrayList.add(C22985n.f56803k);
        TypeAdapter<Number> longAdapter = longAdapter(longSerializationPolicy2);
        arrayList.add(C22985n.m83362a(Long.TYPE, Long.class, longAdapter));
        arrayList.add(C22985n.m83362a(Double.TYPE, Double.class, doubleAdapter(z7)));
        arrayList.add(C22985n.m83362a(Float.TYPE, Float.class, floatAdapter(z7)));
        arrayList.add(C22985n.f56816x);
        arrayList.add(C22985n.f56807o);
        arrayList.add(C22985n.f56809q);
        arrayList.add(C22985n.m83361a(AtomicLong.class, atomicLongAdapter(longAdapter)));
        arrayList.add(C22985n.m83361a(AtomicLongArray.class, atomicLongArrayAdapter(longAdapter)));
        arrayList.add(C22985n.f56811s);
        arrayList.add(C22985n.f56818z);
        arrayList.add(C22985n.f56772F);
        arrayList.add(C22985n.f56774H);
        arrayList.add(C22985n.m83361a(BigDecimal.class, C22985n.f56768B));
        arrayList.add(C22985n.m83361a(BigInteger.class, C22985n.f56769C));
        arrayList.add(C22985n.f56776J);
        arrayList.add(C22985n.f56778L);
        arrayList.add(C22985n.f56782P);
        arrayList.add(C22985n.f56784R);
        arrayList.add(C22985n.f56789W);
        arrayList.add(C22985n.f56780N);
        arrayList.add(C22985n.f56796d);
        arrayList.add(C22960c.f56707a);
        arrayList.add(C22985n.f56787U);
        arrayList.add(C22978k.f56749a);
        arrayList.add(C22976j.f56747a);
        arrayList.add(C22985n.f56785S);
        arrayList.add(C22955a.f56700a);
        arrayList.add(C22985n.f56794b);
        arrayList.add(new C22958b(cVar));
        arrayList.add(new C22967g(cVar, z2));
        C22962d dVar2 = new C22962d(cVar);
        this.jsonAdapterFactory = dVar2;
        arrayList.add(dVar2);
        arrayList.add(C22985n.f56792Z);
        arrayList.add(new C22972i(cVar, fieldNamingStrategy2, dVar, dVar2));
        this.factories = Collections.unmodifiableList(arrayList);
    }
}
