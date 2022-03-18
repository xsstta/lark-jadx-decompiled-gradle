package com.ss.android.vcxp.p3184a;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.vcxp.a.a */
public class C63786a extends TypeAdapter<ByteString> {

    /* renamed from: a */
    public static final C63786a f160969a = new C63786a();

    private C63786a() {
    }

    /* renamed from: a */
    public ByteString read(JsonReader jsonReader) throws IOException {
        return ByteString.decodeBase64(jsonReader.nextString());
    }

    /* renamed from: a */
    public void write(JsonWriter jsonWriter, ByteString byteString) throws IOException {
        jsonWriter.jsonValue("\"" + byteString.base64() + "\"");
    }
}
