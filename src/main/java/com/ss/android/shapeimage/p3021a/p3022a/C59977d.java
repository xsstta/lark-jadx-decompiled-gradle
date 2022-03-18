package com.ss.android.shapeimage.p3021a.p3022a;

import com.huawei.hms.maps.model.CameraPosition;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.shapeimage.a.a.d */
public class C59977d {

    /* renamed from: a */
    final ArrayList<Float> f149518a;

    /* renamed from: b */
    private final int f149519b;

    /* renamed from: a */
    static C59977d m232765a(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 1; i2 < length; i2++) {
            if (z) {
                z = false;
            } else {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                        String substring = str.substring(i, i2);
                        if (substring.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                            if (charAt == '-') {
                                i = i2;
                                break;
                            } else {
                                i = i2 + 1;
                                z = true;
                                break;
                            }
                        } else {
                            i++;
                            continue;
                        }
                    case ')':
                    case 'A':
                    case 'C':
                    case 'H':
                    case 'L':
                    case 'M':
                    case 'Q':
                    case 'S':
                    case 'T':
                    case 'V':
                    case CameraPosition.TILT_90:
                    case 'a':
                    case SmEvents.EVENT_UE /*{ENCODED_INT: 99}*/:
                    case 'h':
                    case 'l':
                    case SmEvents.EVENT_NR /*{ENCODED_INT: 109}*/:
                    case SmEvents.EVENT_RE /*{ENCODED_INT: 113}*/:
                    case 's':
                    case SmEvents.EVENT_RS /*{ENCODED_INT: 116}*/:
                    case 'v':
                    case SmActions.ACTION_INIT_EXIT /*{ENCODED_INT: 122}*/:
                        String substring2 = str.substring(i, i2);
                        if (substring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        }
                        return new C59977d(arrayList, i2);
                }
            }
        }
        String substring3 = str.substring(i);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException unused) {
            }
            i = str.length();
        }
        return new C59977d(arrayList, i);
    }

    private C59977d(ArrayList<Float> arrayList, int i) {
        this.f149518a = arrayList;
        this.f149519b = i;
    }

    /* renamed from: a */
    static final C59977d m232766a(String str, XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return m232765a(xmlPullParser.getAttributeValue(i));
            }
        }
        return null;
    }
}
