package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.h */
public class C1885h implements aj<DocumentData> {

    /* renamed from: a */
    public static final C1885h f6498a = new C1885h();

    /* renamed from: b */
    private static final JsonReader.C1891a f6499b = JsonReader.C1891a.m8474a("t", C13998f.f36682a, "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C1885h() {
    }

    /* renamed from: a */
    public DocumentData mo9315b(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.mo9326c();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        int i = 0;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        int i2 = 0;
        int i3 = 0;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        boolean z = true;
        while (jsonReader.mo9328e()) {
            switch (jsonReader.mo9321a(f6499b)) {
                case 0:
                    str = jsonReader.mo9332i();
                    break;
                case 1:
                    str2 = jsonReader.mo9332i();
                    break;
                case 2:
                    f2 = (float) jsonReader.mo9334k();
                    break;
                case 3:
                    int l = jsonReader.mo9335l();
                    if (l <= DocumentData.Justification.CENTER.ordinal() && l >= 0) {
                        justification2 = DocumentData.Justification.values()[l];
                        break;
                    } else {
                        justification2 = DocumentData.Justification.CENTER;
                        break;
                    }
                case 4:
                    i = jsonReader.mo9335l();
                    break;
                case 5:
                    f3 = (float) jsonReader.mo9334k();
                    break;
                case 6:
                    f4 = (float) jsonReader.mo9334k();
                    break;
                case 7:
                    i2 = C1898p.m8507a(jsonReader);
                    break;
                case 8:
                    i3 = C1898p.m8507a(jsonReader);
                    break;
                case 9:
                    f5 = (float) jsonReader.mo9334k();
                    break;
                case 10:
                    z = jsonReader.mo9333j();
                    break;
                default:
                    jsonReader.mo9331h();
                    jsonReader.mo9336m();
                    break;
            }
        }
        jsonReader.mo9327d();
        return new DocumentData(str, str2, f2, justification2, i, f3, f4, i2, i3, f5, z);
    }
}
