package com.google.gson.internal.p999a;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.gson.internal.a.f */
public final class C22965f extends JsonWriter {

    /* renamed from: a */
    private static final Writer f56716a = new Writer() {
        /* class com.google.gson.internal.p999a.C22965f.C229661 */

        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };

    /* renamed from: b */
    private static final JsonPrimitive f56717b = new JsonPrimitive("closed");

    /* renamed from: c */
    private final List<JsonElement> f56718c = new ArrayList();

    /* renamed from: d */
    private String f56719d;

    /* renamed from: e */
    private JsonElement f56720e = JsonNull.INSTANCE;

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
        m83334a(JsonNull.INSTANCE);
        return this;
    }

    /* renamed from: b */
    private JsonElement m83335b() {
        List<JsonElement> list = this.f56718c;
        return list.get(list.size() - 1);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
        JsonArray jsonArray = new JsonArray();
        m83334a(jsonArray);
        this.f56718c.add(jsonArray);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        JsonObject jsonObject = new JsonObject();
        m83334a(jsonObject);
        this.f56718c.add(jsonObject);
        return this;
    }

    public C22965f() {
        super(f56716a);
    }

    @Override // java.io.Closeable, com.google.gson.stream.JsonWriter, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f56718c.isEmpty()) {
            this.f56718c.add(f56717b);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
        if (this.f56718c.isEmpty() || this.f56719d != null) {
            throw new IllegalStateException();
        } else if (m83335b() instanceof JsonArray) {
            List<JsonElement> list = this.f56718c;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        if (this.f56718c.isEmpty() || this.f56719d != null) {
            throw new IllegalStateException();
        } else if (m83335b() instanceof JsonObject) {
            List<JsonElement> list = this.f56718c;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public JsonElement mo79842a() {
        if (this.f56718c.isEmpty()) {
            return this.f56720e;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f56718c);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j) throws IOException {
        m83334a(new JsonPrimitive((Number) Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        m83334a(new JsonPrimitive(bool));
        return this;
    }

    /* renamed from: a */
    private void m83334a(JsonElement jsonElement) {
        if (this.f56719d != null) {
            if (!jsonElement.isJsonNull() || getSerializeNulls()) {
                ((JsonObject) m83335b()).add(this.f56719d, jsonElement);
            }
            this.f56719d = null;
        } else if (this.f56718c.isEmpty()) {
            this.f56720e = jsonElement;
        } else {
            JsonElement b = m83335b();
            if (b instanceof JsonArray) {
                ((JsonArray) b).add(jsonElement);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) throws IOException {
        if (this.f56718c.isEmpty() || this.f56719d != null) {
            throw new IllegalStateException();
        } else if (m83335b() instanceof JsonObject) {
            this.f56719d = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d) throws IOException {
        if (isLenient() || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m83334a(new JsonPrimitive((Number) Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m83334a(new JsonPrimitive(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        m83334a(new JsonPrimitive(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z) throws IOException {
        m83334a(new JsonPrimitive(Boolean.valueOf(z)));
        return this;
    }
}
