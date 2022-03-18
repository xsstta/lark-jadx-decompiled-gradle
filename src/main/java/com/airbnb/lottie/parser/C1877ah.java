package com.airbnb.lottie.parser;

import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.p073a.C1819a;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1822d;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.site.ActivityC23764o;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.ss.android.vesdk.C64034n;
import java.io.IOException;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.ah */
public class C1877ah {

    /* renamed from: a */
    private static JsonReader.C1891a f6488a = JsonReader.C1891a.m8474a("nm", C60375c.f150914a, "w", ActivityC23764o.f58839a, "lc", "lj", "ml", "hd", C63690d.f160779a);

    /* renamed from: b */
    private static final JsonReader.C1891a f6489b = JsonReader.C1891a.m8474a(C64034n.f161683a, "v");

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    static ShapeStroke m8417a(JsonReader jsonReader, C1792d dVar) throws IOException {
        char c;
        ArrayList arrayList = new ArrayList();
        String str = null;
        C1820b bVar = null;
        C1819a aVar = null;
        C1822d dVar2 = null;
        C1820b bVar2 = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        float f = BitmapDescriptorFactory.HUE_RED;
        boolean z = false;
        while (jsonReader.mo9328e()) {
            switch (jsonReader.mo9321a(f6488a)) {
                case 0:
                    str = jsonReader.mo9332i();
                    break;
                case 1:
                    aVar = C1881d.m8439g(jsonReader, dVar);
                    break;
                case 2:
                    bVar2 = C1881d.m8429a(jsonReader, dVar);
                    break;
                case 3:
                    dVar2 = C1881d.m8434b(jsonReader, dVar);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.mo9335l() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.mo9335l() - 1];
                    break;
                case 6:
                    f = (float) jsonReader.mo9334k();
                    break;
                case 7:
                    z = jsonReader.mo9333j();
                    break;
                case 8:
                    jsonReader.mo9323a();
                    while (jsonReader.mo9328e()) {
                        jsonReader.mo9326c();
                        String str2 = null;
                        C1820b bVar3 = null;
                        while (jsonReader.mo9328e()) {
                            int a = jsonReader.mo9321a(f6489b);
                            if (a == 0) {
                                str2 = jsonReader.mo9332i();
                            } else if (a != 1) {
                                jsonReader.mo9331h();
                                jsonReader.mo9336m();
                            } else {
                                bVar3 = C1881d.m8429a(jsonReader, dVar);
                            }
                        }
                        jsonReader.mo9327d();
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals(C63690d.f160779a)) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case SmEvents.EVENT_NT /*{ENCODED_INT: 111}*/:
                                if (str2.equals(ActivityC23764o.f58839a)) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                dVar.mo9055a(true);
                                arrayList.add(bVar3);
                                break;
                            case 2:
                                bVar = bVar3;
                                break;
                        }
                    }
                    jsonReader.mo9325b();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    jsonReader.mo9336m();
                    break;
            }
        }
        return new ShapeStroke(str, bVar, arrayList, aVar, dVar2, bVar2, lineCapType, lineJoinType, f, z);
    }
}
