package com.google.gson;

import com.google.gson.internal.C23017e;
import com.google.gson.internal.C23020h;
import com.google.gson.internal.p999a.p1000a.C22957a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final class DefaultDateTypeAdapter extends TypeAdapter<Date> {
    private static final String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final List<DateFormat> dateFormats;
    private final Class<? extends Date> dateType;

    public String toString() {
        DateFormat dateFormat = this.dateFormats.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    DefaultDateTypeAdapter(Class<? extends Date> cls) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = verifyDateType(cls);
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C23017e.m83491b()) {
            arrayList.add(C23020h.m83496a(2, 2));
        }
    }

    private Date deserializeToDate(String str) {
        synchronized (this.dateFormats) {
            for (DateFormat dateFormat : this.dateFormats) {
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
    }

    @Override // com.google.gson.TypeAdapter
    public Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Date deserializeToDate = deserializeToDate(jsonReader.nextString());
        Class<? extends Date> cls = this.dateType;
        if (cls == Date.class) {
            return deserializeToDate;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(deserializeToDate.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(deserializeToDate.getTime());
        }
        throw new AssertionError();
    }

    private static Class<? extends Date> verifyDateType(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    public DefaultDateTypeAdapter(int i, int i2) {
        this(Date.class, i, i2);
    }

    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.dateFormats) {
            jsonWriter.value(this.dateFormats.get(0).format(date));
        }
    }

    DefaultDateTypeAdapter(Class<? extends Date> cls, int i) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = verifyDateType(cls);
        arrayList.add(DateFormat.getDateInstance(i, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateInstance(i));
        }
        if (C23017e.m83491b()) {
            arrayList.add(C23020h.m83495a(i));
        }
    }

    DefaultDateTypeAdapter(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = verifyDateType(cls);
        arrayList.add(new SimpleDateFormat(str, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    public DefaultDateTypeAdapter(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = verifyDateType(cls);
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C23017e.m83491b()) {
            arrayList.add(C23020h.m83496a(i, i2));
        }
    }
}
