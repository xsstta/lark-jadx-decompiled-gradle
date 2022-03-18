package com.google.gson.internal.p999a;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C23017e;
import com.google.gson.internal.C23020h;
import com.google.gson.internal.p999a.p1000a.C22957a;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.gson.internal.a.c */
public final class C22960c extends TypeAdapter<Date> {

    /* renamed from: a */
    public static final TypeAdapterFactory f56707a = new TypeAdapterFactory() {
        /* class com.google.gson.internal.p999a.C22960c.C229611 */

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new C22960c();
            }
            return null;
        }
    };

    /* renamed from: b */
    private final List<DateFormat> f56708b;

    public C22960c() {
        ArrayList arrayList = new ArrayList();
        this.f56708b = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C23017e.m83491b()) {
            arrayList.add(C23020h.m83496a(2, 2));
        }
    }

    /* renamed from: a */
    public Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return m83324a(jsonReader.nextString());
        }
        jsonReader.nextNull();
        return null;
    }

    /* renamed from: a */
    private synchronized Date m83324a(String str) {
        for (DateFormat dateFormat : this.f56708b) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C22957a.m83320a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new JsonSyntaxException(str, e);
        }
    }

    /* renamed from: a */
    public synchronized void write(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.f56708b.get(0).format(date));
        }
    }
}
