package com.google.gson.internal.p999a;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.gson.internal.a.e */
public final class C22963e extends JsonReader {

    /* renamed from: a */
    private static final Reader f56710a = new Reader() {
        /* class com.google.gson.internal.p999a.C22963e.C229641 */

        @Override // java.io.Closeable, java.io.Reader, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    };

    /* renamed from: b */
    private static final Object f56711b = new Object();

    /* renamed from: c */
    private Object[] f56712c = new Object[32];

    /* renamed from: d */
    private int f56713d;

    /* renamed from: e */
    private String[] f56714e = new String[32];

    /* renamed from: f */
    private int[] f56715f = new int[32];

    /* renamed from: b */
    private Object m83330b() {
        return this.f56712c[this.f56713d - 1];
    }

    /* renamed from: c */
    private Object m83331c() {
        Object[] objArr = this.f56712c;
        int i = this.f56713d - 1;
        this.f56713d = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.gson.stream.JsonReader
    public void close() throws IOException {
        this.f56712c = new Object[]{f56711b};
        this.f56713d = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) {
            return false;
        }
        return true;
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: d */
    private String m83332d() {
        return " at path " + getPath();
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        m83328a(JsonToken.BEGIN_ARRAY);
        m83329a(((JsonArray) m83330b()).iterator());
        this.f56715f[this.f56713d - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        m83328a(JsonToken.BEGIN_OBJECT);
        m83329a(((JsonObject) m83330b()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        m83328a(JsonToken.END_ARRAY);
        m83331c();
        m83331c();
        int i = this.f56713d;
        if (i > 0) {
            int[] iArr = this.f56715f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        m83328a(JsonToken.END_OBJECT);
        m83331c();
        m83331c();
        int i = this.f56713d;
        if (i > 0) {
            int[] iArr = this.f56715f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        m83328a(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) m83331c()).getAsBoolean();
        int i = this.f56713d;
        if (i > 0) {
            int[] iArr = this.f56715f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        m83328a(JsonToken.NULL);
        m83331c();
        int i = this.f56713d;
        if (i > 0) {
            int[] iArr = this.f56715f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        m83328a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m83330b()).next();
        String str = (String) entry.getKey();
        this.f56714e[this.f56713d - 1] = str;
        m83329a(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f56714e[this.f56713d - 2] = "null";
        } else {
            m83331c();
            int i = this.f56713d;
            if (i > 0) {
                this.f56714e[i - 1] = "null";
            }
        }
        int i2 = this.f56713d;
        if (i2 > 0) {
            int[] iArr = this.f56715f;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f56713d) {
            Object[] objArr = this.f56712c;
            if (objArr[i] instanceof JsonArray) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f56715f[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof JsonObject) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f56714e;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            double asDouble = ((JsonPrimitive) m83330b()).getAsDouble();
            if (isLenient() || (!Double.isNaN(asDouble) && !Double.isInfinite(asDouble))) {
                m83331c();
                int i = this.f56713d;
                if (i > 0) {
                    int[] iArr = this.f56715f;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return asDouble;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + asDouble);
        }
        throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + m83332d());
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            int asInt = ((JsonPrimitive) m83330b()).getAsInt();
            m83331c();
            int i = this.f56713d;
            if (i > 0) {
                int[] iArr = this.f56715f;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return asInt;
        }
        throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + m83332d());
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            long asLong = ((JsonPrimitive) m83330b()).getAsLong();
            m83331c();
            int i = this.f56713d;
            if (i > 0) {
                int[] iArr = this.f56715f;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return asLong;
        }
        throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + peek + m83332d());
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.STRING || peek == JsonToken.NUMBER) {
            String asString = ((JsonPrimitive) m83331c()).getAsString();
            int i = this.f56713d;
            if (i > 0) {
                int[] iArr = this.f56715f;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return asString;
        }
        throw new IllegalStateException("Expected " + JsonToken.STRING + " but was " + peek + m83332d());
    }

    /* renamed from: a */
    public void mo79822a() throws IOException {
        m83328a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m83330b()).next();
        m83329a(entry.getValue());
        m83329a(new JsonPrimitive((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.f56713d == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object b = m83330b();
        if (b instanceof Iterator) {
            boolean z = this.f56712c[this.f56713d - 2] instanceof JsonObject;
            Iterator it = (Iterator) b;
            if (it.hasNext()) {
                if (z) {
                    return JsonToken.NAME;
                }
                m83329a(it.next());
                return peek();
            } else if (z) {
                return JsonToken.END_OBJECT;
            } else {
                return JsonToken.END_ARRAY;
            }
        } else if (b instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (b instanceof JsonArray) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (b instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) b;
                if (jsonPrimitive.isString()) {
                    return JsonToken.STRING;
                }
                if (jsonPrimitive.isBoolean()) {
                    return JsonToken.BOOLEAN;
                }
                if (jsonPrimitive.isNumber()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (b instanceof JsonNull) {
                return JsonToken.NULL;
            } else {
                if (b == f56711b) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public C22963e(JsonElement jsonElement) {
        super(f56710a);
        m83329a(jsonElement);
    }

    /* renamed from: a */
    private void m83328a(JsonToken jsonToken) throws IOException {
        if (peek() != jsonToken) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + m83332d());
        }
    }

    /* renamed from: a */
    private void m83329a(Object obj) {
        int i = this.f56713d;
        Object[] objArr = this.f56712c;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f56715f, 0, iArr, 0, this.f56713d);
            System.arraycopy(this.f56714e, 0, strArr, 0, this.f56713d);
            this.f56712c = objArr2;
            this.f56715f = iArr;
            this.f56714e = strArr;
        }
        Object[] objArr3 = this.f56712c;
        int i2 = this.f56713d;
        this.f56713d = i2 + 1;
        objArr3[i2] = obj;
    }
}
