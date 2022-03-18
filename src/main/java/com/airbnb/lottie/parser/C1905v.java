package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.v */
public class C1905v {

    /* renamed from: a */
    private static final JsonReader.C1891a f6544a = JsonReader.C1891a.m8474a("nm", "mm", "hd");

    /* renamed from: a */
    static MergePaths m8531a(JsonReader jsonReader) throws IOException {
        String str = null;
        MergePaths.MergePathsMode mergePathsMode = null;
        boolean z = false;
        while (jsonReader.mo9328e()) {
            int a = jsonReader.mo9321a(f6544a);
            if (a == 0) {
                str = jsonReader.mo9332i();
            } else if (a == 1) {
                mergePathsMode = MergePaths.MergePathsMode.forId(jsonReader.mo9335l());
            } else if (a != 2) {
                jsonReader.mo9331h();
                jsonReader.mo9336m();
            } else {
                z = jsonReader.mo9333j();
            }
        }
        return new MergePaths(str, mergePathsMode, z);
    }
}
