package com.google.android.datatransport.cct.p970a;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: com.google.android.datatransport.cct.a.r */
public abstract class AbstractC21382r {
    /* renamed from: a */
    public abstract long mo72578a();

    /* renamed from: a */
    public static AbstractC21382r m77402a(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new C21368h(Long.parseLong(jsonReader.nextString()));
                } else {
                    C21368h hVar = new C21368h(jsonReader.nextLong());
                    jsonReader.close();
                    return hVar;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }
}
