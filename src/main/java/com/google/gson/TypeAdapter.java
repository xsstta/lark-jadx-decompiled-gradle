package com.google.gson;

import com.google.gson.internal.p999a.C22963e;
import com.google.gson.internal.p999a.C22965f;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class TypeAdapter<T> {
    public abstract T read(JsonReader jsonReader) throws IOException;

    public abstract void write(JsonWriter jsonWriter, T t) throws IOException;

    public final TypeAdapter<T> nullSafe() {
        return new TypeAdapter<T>() {
            /* class com.google.gson.TypeAdapter.C229371 */

            @Override // com.google.gson.TypeAdapter
            public T read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return (T) TypeAdapter.this.read(jsonReader);
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, T t) throws IOException {
                if (t == null) {
                    jsonWriter.nullValue();
                } else {
                    TypeAdapter.this.write(jsonWriter, t);
                }
            }
        };
    }

    public final T fromJson(Reader reader) throws IOException {
        return read(new JsonReader(reader));
    }

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final T fromJsonTree(JsonElement jsonElement) {
        try {
            return read(new C22963e(jsonElement));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final JsonElement toJsonTree(T t) {
        try {
            C22965f fVar = new C22965f();
            write(fVar, t);
            return fVar.mo79842a();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final void toJson(Writer writer, T t) throws IOException {
        write(new JsonWriter(writer), t);
    }
}
