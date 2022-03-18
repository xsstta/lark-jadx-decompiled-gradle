package com.ss.android.vc.meeting.p3102a;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ss.android.vc.dto.BaseSearchInfo;
import com.ss.android.vcxp.p3184a.C63787b;
import java.io.IOException;

/* renamed from: com.ss.android.vc.meeting.a.a */
public class C61208a extends TypeAdapter<BaseSearchInfo> {

    /* renamed from: a */
    public static final C61208a f153282a = new C61208a();

    private C61208a() {
    }

    /* renamed from: a */
    public BaseSearchInfo read(JsonReader jsonReader) throws IOException {
        try {
            return (BaseSearchInfo) C63787b.m250459b(jsonReader.nextString(), BaseSearchInfo.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void write(JsonWriter jsonWriter, BaseSearchInfo baseSearchInfo) throws IOException {
        jsonWriter.jsonValue("\"" + C63787b.m250460b(baseSearchInfo).replace("\"", "\\\"") + "\"");
    }
}
