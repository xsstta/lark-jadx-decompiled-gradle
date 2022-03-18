package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.model.content.C1838c;
import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.parser.l */
public class C1889l implements aj<C1838c> {

    /* renamed from: a */
    private int f6504a;

    public C1889l(int i) {
        this.f6504a = i;
    }

    /* renamed from: a */
    private void m8451a(C1838c cVar, List<Float> list) {
        int i = this.f6504a * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) list.get(i).floatValue();
                } else {
                    dArr2[i2] = (double) list.get(i).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < cVar.mo9202c(); i3++) {
                int i4 = cVar.mo9201b()[i3];
                cVar.mo9201b()[i3] = Color.argb(m8450a((double) cVar.mo9200a()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    /* renamed from: a */
    public C1838c mo9315b(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo9329f() == JsonReader.Token.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.mo9323a();
        }
        while (jsonReader.mo9328e()) {
            arrayList.add(Float.valueOf((float) jsonReader.mo9334k()));
        }
        if (z) {
            jsonReader.mo9325b();
        }
        if (this.f6504a == -1) {
            this.f6504a = arrayList.size() / 4;
        }
        int i = this.f6504a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f6504a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        C1838c cVar = new C1838c(fArr, iArr);
        m8451a(cVar, arrayList);
        return cVar;
    }

    /* renamed from: a */
    private int m8450a(double d, double[] dArr, double[] dArr2) {
        double d2;
        int i = 1;
        while (true) {
            if (i >= dArr.length) {
                d2 = dArr2[dArr2.length - 1];
                break;
            }
            int i2 = i - 1;
            double d3 = dArr[i2];
            double d4 = dArr[i];
            if (dArr[i] >= d) {
                d2 = C1790g.m7999a(dArr2[i2], dArr2[i], (d - d3) / (d4 - d3));
                break;
            }
            i++;
        }
        return (int) (d2 * 255.0d);
    }
}
