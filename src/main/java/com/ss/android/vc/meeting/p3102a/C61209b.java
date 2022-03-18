package com.ss.android.vc.meeting.p3102a;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.vcxp.p3184a.C63787b;
import java.io.IOException;

/* renamed from: com.ss.android.vc.meeting.a.b */
public class C61209b extends TypeAdapter<RichTextElement.RichTextProperty> {

    /* renamed from: a */
    public static final C61209b f153283a = new C61209b();

    private C61209b() {
    }

    /* renamed from: a */
    public RichTextElement.RichTextProperty read(JsonReader jsonReader) throws IOException {
        try {
            return (RichTextElement.RichTextProperty) C63787b.m250459b(jsonReader.nextString(), RichTextElement.TextProperty.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void write(JsonWriter jsonWriter, RichTextElement.RichTextProperty richTextProperty) throws IOException {
        jsonWriter.jsonValue("\"" + C63787b.m250460b(richTextProperty).replace("\"", "\\\"") + "\"");
    }
}
