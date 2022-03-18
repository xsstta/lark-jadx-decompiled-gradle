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
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.internal.a.j */
public final class C22976j extends TypeAdapter<Date> {

    /* renamed from: a */
    public static final TypeAdapterFactory f56747a = new TypeAdapterFactory() {
        /* class com.google.gson.internal.p999a.C22976j.C229771 */

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new C22976j();
            }
            return null;
        }
    };

    /* renamed from: b */
    private final DateFormat f56748b = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: a */
    public synchronized Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Date(this.f56748b.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    /* renamed from: a */
    public synchronized void write(JsonWriter jsonWriter, Date date) throws IOException {
        String str;
        if (date == null) {
            str = null;
        } else {
            str = this.f56748b.format(date);
        }
        jsonWriter.value(str);
    }
}
