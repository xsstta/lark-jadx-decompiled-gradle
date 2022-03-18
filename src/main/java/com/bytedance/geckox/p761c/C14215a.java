package com.bytedance.geckox.p761c;

import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: com.bytedance.geckox.c.a */
public class C14215a extends TypeAdapter<Boolean> {

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.geckox.c.a$1 */
    public static /* synthetic */ class C142161 {

        /* renamed from: a */
        static final /* synthetic */ int[] f37392a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.geckox.p761c.C14215a.C142161.f37392a = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.geckox.p761c.C14215a.C142161.f37392a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.geckox.p761c.C14215a.C142161.f37392a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.p761c.C14215a.C142161.<clinit>():void");
        }
    }

    /* renamed from: a */
    public Boolean read(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        int i = C142161.f37392a[peek.ordinal()];
        boolean z = true;
        if (i == 1) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i == 2) {
            jsonReader.nextNull();
            return null;
        } else if (i == 3) {
            if (jsonReader.nextInt() == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else {
            throw new JsonParseException("Expected BOOLEAN or NUMBER but was " + peek);
        }
    }

    /* renamed from: a */
    public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
        if (bool == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(bool.booleanValue());
        }
    }
}
