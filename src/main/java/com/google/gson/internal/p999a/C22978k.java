package com.google.gson.internal.p999a;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.internal.a.k */
public final class C22978k extends TypeAdapter<Time> {

    /* renamed from: a */
    public static final TypeAdapterFactory f56749a = new TypeAdapterFactory() {
        /* class com.google.gson.internal.p999a.C22978k.C229791 */

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new C22978k();
            }
            return null;
        }
    };

    /* renamed from: b */
    private final DateFormat f56750b = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: a */
    public synchronized Time read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Time(this.f56750b.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    /* renamed from: a */
    public synchronized void write(JsonWriter jsonWriter, Time time) throws IOException {
        String str;
        if (time == null) {
            str = null;
        } else {
            str = this.f56750b.format(time);
        }
        jsonWriter.value(str);
    }
}
