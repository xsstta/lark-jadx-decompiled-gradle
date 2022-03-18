package com.lynx.component.svg.parser;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.bytedance.ee.bear.attachment.filereader.FileReaderUtil;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.maps.model.CameraPosition;
import com.lynx.component.svg.parser.C26472a;
import com.lynx.component.svg.parser.PreserveAspectRatio;
import com.lynx.component.svg.parser.SVG;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.utils.C26960n;
import com.lynx.tasm.utils.ColorUtils;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.component.svg.parser.f */
public class C26482f {

    /* renamed from: a */
    private SVG f65462a;

    /* renamed from: b */
    private SVG.AbstractC26441ad f65463b;

    /* renamed from: c */
    private boolean f65464c;

    /* renamed from: d */
    private int f65465d;

    /* renamed from: b */
    private void m95959b() {
    }

    C26482f() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0032 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.lynx.component.svg.parser.SVG mo93868a(java.io.InputStream r5) throws com.lynx.component.svg.parser.SVGParseException {
        /*
            r4 = this;
            java.lang.String r0 = "Exception thrown closing input stream"
            java.lang.String r1 = "SVGParser"
            boolean r2 = r5.markSupported()
            if (r2 != 0) goto L_0x0010
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r2.<init>(r5)
            r5 = r2
        L_0x0010:
            r2 = 3
            r5.mark(r2)     // Catch:{ IOException -> 0x0032 }
            int r2 = r5.read()     // Catch:{ IOException -> 0x0032 }
            int r3 = r5.read()     // Catch:{ IOException -> 0x0032 }
            int r3 = r3 << 8
            int r2 = r2 + r3
            r5.reset()     // Catch:{ IOException -> 0x0032 }
            r3 = 35615(0x8b1f, float:4.9907E-41)
            if (r2 != r3) goto L_0x0032
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0032 }
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0032 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0032 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0032 }
            r5 = r2
        L_0x0032:
            r4.m95961b(r5)     // Catch:{ all -> 0x003f }
            com.lynx.component.svg.parser.SVG r2 = r4.f65462a     // Catch:{ all -> 0x003f }
            r5.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x003e
        L_0x003b:
            android.util.Log.e(r1, r0)
        L_0x003e:
            return r2
        L_0x003f:
            r2 = move-exception
            r5.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0047
        L_0x0044:
            android.util.Log.e(r1, r0)
        L_0x0047:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.parser.C26482f.mo93868a(java.io.InputStream):com.lynx.component.svg.parser.SVG");
    }

    /* renamed from: a */
    private void m95955a(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        if (this.f65464c) {
            this.f65465d++;
        } else if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            switch (C264831.f65466a[EnumC26486c.fromString(str2).ordinal()]) {
                case 1:
                    m95957a(attributes);
                    return;
                case 2:
                    m95962b(attributes);
                    return;
                case 3:
                    m95964c(attributes);
                    return;
                case 4:
                    m95966d(attributes);
                    return;
                case 5:
                    m95970f(attributes);
                    return;
                case 6:
                    m95972g(attributes);
                    return;
                case 7:
                    m95974h(attributes);
                    return;
                case 8:
                    m95976i(attributes);
                    return;
                case 9:
                    m95978j(attributes);
                    return;
                case 10:
                    m95980k(attributes);
                    return;
                case 11:
                    m95982l(attributes);
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    m95984m(attributes);
                    return;
                case 13:
                    m95986n(attributes);
                    return;
                case 14:
                    m95987o(attributes);
                    return;
                case 15:
                    m95992q(attributes);
                    return;
                case 16:
                    m95994r(attributes);
                    return;
                case 17:
                    m95968e(attributes);
                    return;
                case 18:
                    m95990p(attributes);
                    return;
                default:
                    this.f65464c = true;
                    this.f65465d = 1;
                    return;
            }
        }
    }

    /* renamed from: a */
    private void m95954a(String str, String str2, String str3) throws SVGParseException {
        if (this.f65464c) {
            int i = this.f65465d - 1;
            this.f65465d = i;
            if (i == 0) {
                this.f65464c = false;
            }
        } else if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i2 = C264831.f65466a[EnumC26486c.fromString(str2).ordinal()];
            if (!(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4)) {
                switch (i2) {
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        break;
                    default:
                        return;
                }
            }
            SVG.AbstractC26441ad adVar = this.f65463b;
            if (adVar != null) {
                this.f65463b = ((SVG.C26445ah) adVar).f65354p;
            } else {
                throw new SVGParseException(String.format("Unbalanced end element </%s> found", str2));
            }
        }
    }

    /* renamed from: a */
    private void m95956a(String str, Object... objArr) {
        LLog.m96423b("SVGParser", String.format(str, objArr));
    }

    /* renamed from: a */
    private void m95957a(Attributes attributes) throws SVGParseException {
        m95956a("<svg>", new Object[0]);
        SVG.C26439ab abVar = new SVG.C26439ab();
        abVar.f65353o = this.f65462a;
        abVar.f65354p = this.f65463b;
        m95937a((SVG.AbstractC26443af) abVar, attributes);
        m95960b(abVar, attributes);
        m95941a((SVG.al) abVar, attributes);
        m95935a(abVar, attributes);
        SVG.AbstractC26441ad adVar = this.f65463b;
        if (adVar == null) {
            this.f65462a.mo93820a(abVar);
        } else {
            adVar.mo93830a(abVar);
        }
        this.f65463b = abVar;
    }

    /* renamed from: a */
    private void m95942a(SVG.an anVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C264831.f65467b[EnumC26485b.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                anVar.f65364c = m95930a(trim);
            } else if (i2 == 2) {
                anVar.f65365d = m95930a(trim);
            } else if (i2 == 3) {
                anVar.f65366e = m95930a(trim);
                if (anVar.f65366e.mo93842c()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                anVar.f65367f = m95930a(trim);
                if (anVar.f65367f.mo93842c()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 == 6 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                anVar.f65363a = trim;
            }
        }
    }

    /* renamed from: a */
    private void m95948a(SVG.C26459n nVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C264831.f65467b[EnumC26485b.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                nVar.f65393b = m95930a(trim);
            } else if (i2 == 2) {
                nVar.f65394c = m95930a(trim);
            } else if (i2 == 3) {
                nVar.f65395d = m95930a(trim);
                if (nVar.f65395d.mo93842c()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                nVar.f65396e = m95930a(trim);
                if (nVar.f65396e.mo93842c()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 != 6) {
                if (i2 == 7) {
                    m95939a((SVG.aj) nVar, trim);
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                nVar.f65392a = trim;
            }
        }
    }

    /* renamed from: a */
    private void m95950a(SVG.C26464s sVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C264831.f65467b[EnumC26485b.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 8) {
                sVar.f65406a = m95963c(trim);
            } else if (i2 != 9) {
                continue;
            } else {
                sVar.f65407b = Float.valueOf(m95969f(trim));
                if (sVar.f65407b.floatValue() < BitmapDescriptorFactory.HUE_RED) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    /* renamed from: a */
    private void m95953a(SVG.C26470y yVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C264831.f65467b[EnumC26485b.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                yVar.f65421a = m95930a(trim);
            } else if (i2 == 2) {
                yVar.f65422b = m95930a(trim);
            } else if (i2 == 3) {
                yVar.f65423c = m95930a(trim);
                if (yVar.f65423c.mo93842c()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                yVar.f65424d = m95930a(trim);
                if (yVar.f65424d.mo93842c()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (i2 == 10) {
                yVar.f65425f = m95930a(trim);
                if (yVar.f65425f.mo93842c()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i2 != 11) {
                continue;
            } else {
                yVar.f65426g = m95930a(trim);
                if (yVar.f65426g.mo93842c()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    /* renamed from: a */
    private void m95943a(SVG.C26448c cVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C264831.f65467b[EnumC26485b.fromString(attributes.getLocalName(i)).ordinal()]) {
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    cVar.f65372a = m95930a(trim);
                    break;
                case 13:
                    cVar.f65373b = m95930a(trim);
                    break;
                case 14:
                    cVar.f65374c = m95930a(trim);
                    if (!cVar.f65374c.mo93842c()) {
                        break;
                    } else {
                        throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                    }
            }
        }
    }

    /* renamed from: a */
    private void m95945a(SVG.C26453h hVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C264831.f65467b[EnumC26485b.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 10:
                    hVar.f65382c = m95930a(trim);
                    if (!hVar.f65382c.mo93842c()) {
                        break;
                    } else {
                        throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                    }
                case 11:
                    hVar.f65383d = m95930a(trim);
                    if (!hVar.f65383d.mo93842c()) {
                        break;
                    } else {
                        throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                    }
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    hVar.f65380a = m95930a(trim);
                    break;
                case 13:
                    hVar.f65381b = m95930a(trim);
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m95949a(SVG.C26461p pVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (EnumC26485b.fromString(attributes.getLocalName(i))) {
                case x1:
                    pVar.f65400a = m95930a(trim);
                    break;
                case y1:
                    pVar.f65401b = m95930a(trim);
                    break;
                case x2:
                    pVar.f65402c = m95930a(trim);
                    break;
                case y2:
                    pVar.f65403d = m95930a(trim);
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m95952a(SVG.C26468w wVar, Attributes attributes, String str) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC26485b.fromString(attributes.getLocalName(i)) == EnumC26485b.points) {
                C26487d dVar = new C26487d(attributes.getValue(i));
                ArrayList<Float> arrayList = new ArrayList();
                dVar.mo93878d();
                while (!dVar.mo93877c()) {
                    float f = dVar.mo93880f();
                    if (!Float.isNaN(f)) {
                        dVar.mo93879e();
                        float f2 = dVar.mo93880f();
                        if (!Float.isNaN(f2)) {
                            dVar.mo93879e();
                            arrayList.add(Float.valueOf(f));
                            arrayList.add(Float.valueOf(f2));
                        } else {
                            throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                        }
                    } else {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                }
                wVar.f65420a = new float[arrayList.size()];
                int i2 = 0;
                for (Float f3 : arrayList) {
                    wVar.f65420a[i2] = f3.floatValue();
                    i2++;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0092, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m95946a(com.lynx.component.svg.parser.SVG.AbstractC26454i r6, org.xml.sax.Attributes r7) throws com.lynx.component.svg.parser.SVGParseException {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.parser.C26482f.m95946a(com.lynx.component.svg.parser.SVG$i, org.xml.sax.Attributes):void");
    }

    /* renamed from: a */
    private void m95938a(SVG.C26444ag agVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (EnumC26485b.fromString(attributes.getLocalName(i))) {
                case x1:
                    agVar.f65349f = m95930a(trim);
                    break;
                case y1:
                    agVar.f65350g = m95930a(trim);
                    break;
                case x2:
                    agVar.f65351h = m95930a(trim);
                    break;
                case y2:
                    agVar.f65352i = m95930a(trim);
                    break;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m95940a(com.lynx.component.svg.parser.SVG.ak r5, org.xml.sax.Attributes r6) throws com.lynx.component.svg.parser.SVGParseException {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.parser.C26482f.m95940a(com.lynx.component.svg.parser.SVG$ak, org.xml.sax.Attributes):void");
    }

    /* renamed from: a */
    private void m95944a(SVG.C26449d dVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (C264831.f65467b[EnumC26485b.fromString(attributes.getLocalName(i)).ordinal()] == 25) {
                if ("objectBoundingBox".equals(trim)) {
                    dVar.f65375a = false;
                } else if ("userSpaceOnUse".equals(trim)) {
                    dVar.f65375a = true;
                } else {
                    throw new SVGParseException("Invalid value for attribute clipPathUnits");
                }
            }
        }
    }

    /* renamed from: a */
    private void m95951a(SVG.C26467v vVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C264831.f65467b[EnumC26485b.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                vVar.f65415d = m95930a(trim);
            } else if (i2 == 2) {
                vVar.f65416e = m95930a(trim);
            } else if (i2 == 3) {
                vVar.f65417f = m95930a(trim);
                if (vVar.f65417f.mo93842c()) {
                    throw new SVGParseException("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                vVar.f65418g = m95930a(trim);
                if (vVar.f65418g.mo93842c()) {
                    throw new SVGParseException("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i2 != 6) {
                switch (i2) {
                    case 26:
                        if (!"objectBoundingBox".equals(trim)) {
                            if ("userSpaceOnUse".equals(trim)) {
                                vVar.f65412a = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            vVar.f65412a = false;
                            continue;
                        }
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                        if (!"objectBoundingBox".equals(trim)) {
                            if ("userSpaceOnUse".equals(trim)) {
                                vVar.f65413b = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            vVar.f65413b = false;
                            continue;
                        }
                    case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                        vVar.f65414c = m95967e(trim);
                        continue;
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                vVar.f65419h = trim;
            }
        }
    }

    /* renamed from: a */
    private void m95937a(SVG.AbstractC26443af afVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                afVar.f65345k = attributes.getValue(i).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    afVar.f65346l = Boolean.FALSE;
                    return;
                } else if ("preserve".equals(trim)) {
                    afVar.f65346l = Boolean.TRUE;
                    return;
                } else {
                    throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + trim);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m95936a(SVG.AbstractC26443af afVar, String str) {
        C26472a.C26473a aVar = new C26472a.C26473a(str.replaceAll("/\\*.*?\\*/", ""));
        while (!aVar.mo93877c()) {
            aVar.mo93878d();
            String a = aVar.mo93853a();
            aVar.mo93878d();
            if (!aVar.mo93873a(';')) {
                if (aVar.mo93873a(':')) {
                    aVar.mo93878d();
                    String b = aVar.mo93854b();
                    if (b != null) {
                        aVar.mo93878d();
                        if (aVar.mo93877c() || aVar.mo93873a(';')) {
                            if (afVar.f65348n == null) {
                                afVar.f65348n = new SVG.Style();
                            }
                            m95933a(afVar.f65348n, a, b);
                            aVar.mo93878d();
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m95941a(SVG.al alVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C264831.f65467b[EnumC26485b.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 7) {
                m95939a((SVG.aj) alVar, trim);
            } else if (i2 == 57) {
                alVar.f65361r = m95973h(trim);
            }
        }
    }

    /* renamed from: a */
    private void m95947a(SVG.AbstractC26458m mVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC26485b.fromString(attributes.getLocalName(i)) == EnumC26485b.transform) {
                mVar.mo93834a(m95967e(attributes.getValue(i)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.parser.f$d */
    public static class C26487d {

        /* renamed from: a */
        String f65478a;

        /* renamed from: b */
        int f65479b;

        /* renamed from: c */
        int f65480c;

        /* renamed from: d */
        private C26475c f65481d = new C26475c();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo93874a(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo93876b(int i) {
            return i == 10 || i == 13;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public String mo93886l() {
            return mo93872a(' ', false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo93877c() {
            if (this.f65479b == this.f65480c) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo93878d() {
            while (true) {
                int i = this.f65479b;
                if (i < this.f65480c && mo93874a((int) this.f65478a.charAt(i))) {
                    this.f65479b++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo93879e() {
            mo93878d();
            int i = this.f65479b;
            if (i == this.f65480c || this.f65478a.charAt(i) != ',') {
                return false;
            }
            this.f65479b++;
            mo93878d();
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public float mo93880f() {
            float a = this.f65481d.mo93855a(this.f65478a, this.f65479b, this.f65480c);
            if (!Float.isNaN(a)) {
                this.f65479b = this.f65481d.mo93856a();
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public float mo93881g() {
            mo93879e();
            float a = this.f65481d.mo93855a(this.f65478a, this.f65479b, this.f65480c);
            if (!Float.isNaN(a)) {
                this.f65479b = this.f65481d.mo93856a();
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Integer mo93882h() {
            int i = this.f65479b;
            if (i == this.f65480c) {
                return null;
            }
            String str = this.f65478a;
            this.f65479b = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public SVG.C26460o mo93883i() {
            float f = mo93880f();
            if (Float.isNaN(f)) {
                return null;
            }
            SVG.am n = mo93888n();
            if (n == null) {
                return new SVG.C26460o(f, SVG.am.px);
            }
            return new SVG.C26460o(f, n);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public int mo93885k() {
            int i = this.f65479b;
            int i2 = this.f65480c;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.f65479b = i3;
            if (i3 < i2) {
                return this.f65478a.charAt(i3);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo93889o() {
            int i = this.f65479b;
            if (i == this.f65480c) {
                return false;
            }
            char charAt = this.f65478a.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public Boolean mo93884j() {
            int i = this.f65479b;
            if (i == this.f65480c) {
                return null;
            }
            char charAt = this.f65478a.charAt(i);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            boolean z = true;
            this.f65479b++;
            if (charAt != '1') {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public String mo93887m() {
            if (mo93877c()) {
                return null;
            }
            int i = this.f65479b;
            int charAt = this.f65478a.charAt(i);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    int i2 = this.f65479b;
                } else {
                    charAt = mo93885k();
                }
            }
            int i22 = this.f65479b;
            while (mo93874a(charAt)) {
                charAt = mo93885k();
            }
            if (charAt == 40) {
                this.f65479b++;
                return this.f65478a.substring(i, i22);
            }
            this.f65479b = i;
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public SVG.am mo93888n() {
            if (mo93877c()) {
                return null;
            }
            if (this.f65478a.charAt(this.f65479b) == '%') {
                this.f65479b++;
                return SVG.am.percent;
            }
            int i = this.f65479b;
            int i2 = this.f65480c;
            if (i > i2 - 2) {
                return null;
            }
            if (i <= i2 - 3) {
                try {
                    String substring = this.f65478a.substring(i, i + 3);
                    if ("rem".equals(substring)) {
                        this.f65479b += 3;
                        return SVG.am.rem;
                    } else if ("rpx".equals(substring)) {
                        this.f65479b += 3;
                        return SVG.am.rpx;
                    }
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
            String str = this.f65478a;
            int i3 = this.f65479b;
            SVG.am valueOf = SVG.am.valueOf(str.substring(i3, i3 + 2).toLowerCase(Locale.US));
            this.f65479b += 2;
            return valueOf;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo93870a(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            mo93879e();
            return mo93880f();
        }

        C26487d(String str) {
            String trim = str.trim();
            this.f65478a = trim;
            this.f65480c = trim.length();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo93869a(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            mo93879e();
            return mo93880f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Boolean mo93871a(Object obj) {
            if (obj == null) {
                return null;
            }
            mo93879e();
            return mo93884j();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo93873a(char c) {
            boolean z;
            int i = this.f65479b;
            if (i >= this.f65480c || this.f65478a.charAt(i) != c) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f65479b++;
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo93875a(String str) {
            boolean z;
            int length = str.length();
            int i = this.f65479b;
            if (i > this.f65480c - length || !this.f65478a.substring(i, i + length).equals(str)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f65479b += length;
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo93872a(char c, boolean z) {
            if (mo93877c()) {
                return null;
            }
            char charAt = this.f65478a.charAt(this.f65479b);
            if ((!z && mo93874a((int) charAt)) || charAt == c) {
                return null;
            }
            int i = this.f65479b;
            int k = mo93885k();
            while (k != -1 && k != c && (z || !mo93874a(k))) {
                k = mo93885k();
            }
            return this.f65478a.substring(i, this.f65479b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.component.svg.parser.f$e */
    public class C26488e implements Attributes {

        /* renamed from: b */
        private XmlPullParser f65483b;

        public int getIndex(String str) {
            return -1;
        }

        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }

        public String getValue(String str, String str2) {
            return null;
        }

        public int getLength() {
            return this.f65483b.getAttributeCount();
        }

        public String getLocalName(int i) {
            return this.f65483b.getAttributeName(i);
        }

        public String getURI(int i) {
            return this.f65483b.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i) {
            return this.f65483b.getAttributeValue(i);
        }

        public String getQName(int i) {
            String attributeName = this.f65483b.getAttributeName(i);
            if (this.f65483b.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return this.f65483b.getAttributePrefix(i) + ':' + attributeName;
        }

        public C26488e(XmlPullParser xmlPullParser) {
            this.f65483b = xmlPullParser;
        }
    }

    /* renamed from: a */
    private void m95932a() {
        this.f65462a = new SVG();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.component.svg.parser.f$a */
    public static class C26484a {

        /* renamed from: a */
        private static final Map<String, PreserveAspectRatio.Alignment> f65468a;

        static {
            HashMap hashMap = new HashMap(10);
            f65468a = hashMap;
            hashMap.put("none", PreserveAspectRatio.Alignment.none);
            hashMap.put("xMinYMin", PreserveAspectRatio.Alignment.xMinYMin);
            hashMap.put("xMidYMin", PreserveAspectRatio.Alignment.xMidYMin);
            hashMap.put("xMaxYMin", PreserveAspectRatio.Alignment.xMaxYMin);
            hashMap.put("xMinYMid", PreserveAspectRatio.Alignment.xMinYMid);
            hashMap.put("xMidYMid", PreserveAspectRatio.Alignment.xMidYMid);
            hashMap.put("xMaxYMid", PreserveAspectRatio.Alignment.xMaxYMid);
            hashMap.put("xMinYMax", PreserveAspectRatio.Alignment.xMinYMax);
            hashMap.put("xMidYMax", PreserveAspectRatio.Alignment.xMidYMax);
            hashMap.put("xMaxYMax", PreserveAspectRatio.Alignment.xMaxYMax);
        }

        /* renamed from: a */
        static PreserveAspectRatio.Alignment m95997a(String str) {
            return f65468a.get(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.component.svg.parser.f$c */
    public enum EnumC26486c {
        svg,
        circle,
        clipPath,
        defs,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        use,
        UNSUPPORTED;
        

        /* renamed from: a */
        private static final Map<String, EnumC26486c> f65475a = new HashMap();

        static {
            EnumC26486c[] values = values();
            for (EnumC26486c cVar : values) {
                if (cVar != UNSUPPORTED) {
                    f65475a.put(cVar.name(), cVar);
                }
            }
        }

        public static EnumC26486c fromString(String str) {
            EnumC26486c cVar = f65475a.get(str);
            if (cVar != null) {
                return cVar;
            }
            return UNSUPPORTED;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.parser.f$1 */
    public static /* synthetic */ class C264831 {

        /* renamed from: a */
        static final /* synthetic */ int[] f65466a;

        /* JADX WARNING: Can't wrap try/catch for region: R(151:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|(3:185|186|188)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(152:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|(3:185|186|188)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(153:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|(3:185|186|188)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(154:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|(3:185|186|188)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(156:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(157:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(158:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(159:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(160:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(161:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(162:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(164:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(166:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(168:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|49|50|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(169:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|49|50|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(170:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x018c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0198 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01a4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x01b0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x01bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x01c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x01d4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x01e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x01ec */
        /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x01f8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x0204 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x0210 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x021c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x0228 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x0234 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x0240 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x024c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x0258 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x0264 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x0270 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x027c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0288 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x0294 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x02a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x02bd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x02c7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x02d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x02db */
        /* JADX WARNING: Missing exception handler attribute for start block: B:161:0x02e5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:163:0x02ef */
        /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x02f9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:167:0x0303 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:169:0x030d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:171:0x0317 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x0321 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x032b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:177:0x0335 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:179:0x033f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:181:0x0349 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:183:0x0355 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:185:0x035f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0168 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0174 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x0180 */
        static {
            /*
            // Method dump skipped, instructions count: 874
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.parser.C26482f.C264831.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.component.svg.parser.f$b */
    public enum EnumC26485b {
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;
        

        /* renamed from: a */
        private static final Map<String, EnumC26485b> f65469a = new HashMap();

        static {
            EnumC26485b[] values = values();
            for (EnumC26485b bVar : values) {
                if (bVar != UNSUPPORTED) {
                    f65469a.put(bVar.name().replace('_', '-'), bVar);
                }
            }
        }

        public static EnumC26485b fromString(String str) {
            EnumC26485b bVar = f65469a.get(str);
            if (bVar != null) {
                return bVar;
            }
            return UNSUPPORTED;
        }
    }

    /* renamed from: a */
    private static SVG.C26460o m95929a(C26487d dVar) {
        if (dVar.mo93875a("auto")) {
            return new SVG.C26460o(BitmapDescriptorFactory.HUE_RED);
        }
        return dVar.mo93883i();
    }

    /* renamed from: f */
    private static float m95969f(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return m95928a(str, 0, length);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    /* renamed from: g */
    private static Float m95971g(String str) {
        try {
            float f = m95969f(str);
            if (f < BitmapDescriptorFactory.HUE_RED) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            return Float.valueOf(f);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    /* renamed from: k */
    private static SVG.C26450e m95979k(String str) throws SVGParseException {
        try {
            return new SVG.C26450e(ColorUtils.m97896a(str));
        } catch (Exception e) {
            throw new SVGParseException(e.toString());
        }
    }

    /* renamed from: l */
    private static SVG.Style.FillRule m95981l(String str) {
        if ("nonzero".equals(str)) {
            return SVG.Style.FillRule.NonZero;
        }
        if ("evenodd".equals(str)) {
            return SVG.Style.FillRule.EvenOdd;
        }
        return null;
    }

    /* renamed from: r */
    private static SVG.Style.VectorEffect m95993r(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return SVG.Style.VectorEffect.None;
        }
        if (!str.equals("non-scaling-stroke")) {
            return null;
        }
        return SVG.Style.VectorEffect.NonScalingStroke;
    }

    /* renamed from: b */
    private void m95962b(Attributes attributes) throws SVGParseException {
        m95956a("<g>", new Object[0]);
        if (this.f65463b != null) {
            SVG.C26457l lVar = new SVG.C26457l();
            lVar.f65353o = this.f65462a;
            lVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) lVar, attributes);
            m95960b(lVar, attributes);
            m95947a((SVG.AbstractC26458m) lVar, attributes);
            this.f65463b.mo93830a(lVar);
            this.f65463b = lVar;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: c */
    private void m95964c(Attributes attributes) throws SVGParseException {
        m95956a("<defs>", new Object[0]);
        if (this.f65463b != null) {
            SVG.C26452g gVar = new SVG.C26452g();
            gVar.f65353o = this.f65462a;
            gVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) gVar, attributes);
            m95960b(gVar, attributes);
            m95947a((SVG.AbstractC26458m) gVar, attributes);
            this.f65463b.mo93830a(gVar);
            this.f65463b = gVar;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: d */
    private void m95966d(Attributes attributes) throws SVGParseException {
        m95956a("<use>", new Object[0]);
        if (this.f65463b != null) {
            SVG.an anVar = new SVG.an();
            anVar.f65353o = this.f65462a;
            anVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) anVar, attributes);
            m95960b(anVar, attributes);
            m95947a((SVG.AbstractC26458m) anVar, attributes);
            m95942a(anVar, attributes);
            this.f65463b.mo93830a(anVar);
            this.f65463b = anVar;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: e */
    private void m95968e(Attributes attributes) throws SVGParseException {
        m95956a("<image>", new Object[0]);
        if (this.f65463b != null) {
            SVG.C26459n nVar = new SVG.C26459n();
            nVar.f65353o = this.f65462a;
            nVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) nVar, attributes);
            m95960b(nVar, attributes);
            m95947a((SVG.AbstractC26458m) nVar, attributes);
            m95948a(nVar, attributes);
            this.f65463b.mo93830a(nVar);
            this.f65463b = nVar;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: f */
    private void m95970f(Attributes attributes) throws SVGParseException {
        m95956a("<path>", new Object[0]);
        if (this.f65463b != null) {
            SVG.C26464s sVar = new SVG.C26464s();
            sVar.f65353o = this.f65462a;
            sVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) sVar, attributes);
            m95960b(sVar, attributes);
            m95947a((SVG.AbstractC26458m) sVar, attributes);
            m95950a(sVar, attributes);
            this.f65463b.mo93830a(sVar);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: g */
    private void m95972g(Attributes attributes) throws SVGParseException {
        m95956a("<rect>", new Object[0]);
        if (this.f65463b != null) {
            SVG.C26470y yVar = new SVG.C26470y();
            yVar.f65353o = this.f65462a;
            yVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) yVar, attributes);
            m95960b(yVar, attributes);
            m95947a((SVG.AbstractC26458m) yVar, attributes);
            m95953a(yVar, attributes);
            this.f65463b.mo93830a(yVar);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: h */
    private void m95974h(Attributes attributes) throws SVGParseException {
        m95956a("<circle>", new Object[0]);
        if (this.f65463b != null) {
            SVG.C26448c cVar = new SVG.C26448c();
            cVar.f65353o = this.f65462a;
            cVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) cVar, attributes);
            m95960b(cVar, attributes);
            m95947a((SVG.AbstractC26458m) cVar, attributes);
            m95943a(cVar, attributes);
            this.f65463b.mo93830a(cVar);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: i */
    private void m95976i(Attributes attributes) throws SVGParseException {
        m95956a("<ellipse>", new Object[0]);
        if (this.f65463b != null) {
            SVG.C26453h hVar = new SVG.C26453h();
            hVar.f65353o = this.f65462a;
            hVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) hVar, attributes);
            m95960b(hVar, attributes);
            m95947a((SVG.AbstractC26458m) hVar, attributes);
            m95945a(hVar, attributes);
            this.f65463b.mo93830a(hVar);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: j */
    private static SVG.AbstractC26446ai m95977j(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return SVG.C26450e.f65377c;
        }
        if (str.equals("currentColor")) {
            return SVG.C26451f.m95780a();
        }
        try {
            return m95979k(str);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    /* renamed from: k */
    private void m95980k(Attributes attributes) throws SVGParseException {
        m95956a("<polyline>", new Object[0]);
        if (this.f65463b != null) {
            SVG.C26468w wVar = new SVG.C26468w();
            wVar.f65353o = this.f65462a;
            wVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) wVar, attributes);
            m95960b(wVar, attributes);
            m95947a((SVG.AbstractC26458m) wVar, attributes);
            m95952a(wVar, attributes, "polyline");
            this.f65463b.mo93830a(wVar);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: l */
    private void m95982l(Attributes attributes) throws SVGParseException {
        m95956a("<polygon>", new Object[0]);
        if (this.f65463b != null) {
            SVG.C26469x xVar = new SVG.C26469x();
            xVar.f65353o = this.f65462a;
            xVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) xVar, attributes);
            m95960b(xVar, attributes);
            m95947a((SVG.AbstractC26458m) xVar, attributes);
            m95952a(xVar, attributes, "polygon");
            this.f65463b.mo93830a(xVar);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: m */
    private static SVG.Style.LineCap m95983m(String str) {
        if ("butt".equals(str)) {
            return SVG.Style.LineCap.Butt;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineCap.Round;
        }
        if ("square".equals(str)) {
            return SVG.Style.LineCap.Square;
        }
        return null;
    }

    /* renamed from: n */
    private static SVG.Style.LineJoin m95985n(String str) {
        if ("miter".equals(str)) {
            return SVG.Style.LineJoin.Miter;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineJoin.Round;
        }
        if ("bevel".equals(str)) {
            return SVG.Style.LineJoin.Bevel;
        }
        return null;
    }

    /* renamed from: o */
    private void m95987o(Attributes attributes) throws SVGParseException {
        m95956a("<stop>", new Object[0]);
        SVG.AbstractC26441ad adVar = this.f65463b;
        if (adVar == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        } else if (adVar instanceof SVG.AbstractC26454i) {
            SVG.C26438aa aaVar = new SVG.C26438aa();
            aaVar.f65353o = this.f65462a;
            aaVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) aaVar, attributes);
            m95960b(aaVar, attributes);
            m95934a(aaVar, attributes);
            this.f65463b.mo93830a(aaVar);
            this.f65463b = aaVar;
        } else {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
    }

    /* renamed from: p */
    private void m95990p(Attributes attributes) throws SVGParseException {
        m95956a("<solidColor>", new Object[0]);
        if (this.f65463b != null) {
            SVG.C26471z zVar = new SVG.C26471z();
            zVar.f65353o = this.f65462a;
            zVar.f65354p = this.f65463b;
            m95937a(zVar, attributes);
            m95960b(zVar, attributes);
            this.f65463b.mo93830a(zVar);
            this.f65463b = zVar;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: q */
    private void m95992q(Attributes attributes) throws SVGParseException {
        m95956a("<clipPath>", new Object[0]);
        if (this.f65463b != null) {
            SVG.C26449d dVar = new SVG.C26449d();
            dVar.f65353o = this.f65462a;
            dVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) dVar, attributes);
            m95960b(dVar, attributes);
            m95947a((SVG.AbstractC26458m) dVar, attributes);
            m95944a(dVar, attributes);
            this.f65463b.mo93830a(dVar);
            this.f65463b = dVar;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: r */
    private void m95994r(Attributes attributes) throws SVGParseException {
        m95956a("<pattern>", new Object[0]);
        if (this.f65463b != null) {
            SVG.C26467v vVar = new SVG.C26467v();
            vVar.f65353o = this.f65462a;
            vVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) vVar, attributes);
            m95960b(vVar, attributes);
            m95941a((SVG.al) vVar, attributes);
            m95951a(vVar, attributes);
            this.f65463b.mo93830a(vVar);
            this.f65463b = vVar;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: b */
    static PreserveAspectRatio m95958b(String str) throws SVGParseException {
        C26487d dVar = new C26487d(str);
        dVar.mo93878d();
        String l = dVar.mo93886l();
        if ("defer".equals(l)) {
            dVar.mo93878d();
            l = dVar.mo93886l();
        }
        PreserveAspectRatio.Alignment a = C26484a.m95997a(l);
        PreserveAspectRatio.Scale scale = null;
        dVar.mo93878d();
        if (!dVar.mo93877c()) {
            String l2 = dVar.mo93886l();
            l2.hashCode();
            if (l2.equals("meet")) {
                scale = PreserveAspectRatio.Scale.meet;
            } else if (!l2.equals("slice")) {
                throw new SVGParseException("Invalid preserveAspectRatio definition: " + str);
            } else {
                scale = PreserveAspectRatio.Scale.slice;
            }
        }
        return new PreserveAspectRatio(a, scale);
    }

    /* renamed from: d */
    private Float m95965d(String str) throws SVGParseException {
        if (str.length() != 0) {
            int length = str.length();
            boolean z = true;
            if (str.charAt(str.length() - 1) == '%') {
                length--;
            } else {
                z = false;
            }
            try {
                float a = m95928a(str, 0, length);
                float f = 100.0f;
                if (z) {
                    a /= 100.0f;
                }
                if (a < BitmapDescriptorFactory.HUE_RED) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else if (a <= 100.0f) {
                    f = a;
                }
                return Float.valueOf(f);
            } catch (NumberFormatException e) {
                throw new SVGParseException("Invalid offset value in <stop>: " + str, e);
            }
        } else {
            throw new SVGParseException("Invalid offset value in <stop> (empty string)");
        }
    }

    /* renamed from: h */
    private static SVG.C26437a m95973h(String str) throws SVGParseException {
        C26487d dVar = new C26487d(str);
        dVar.mo93878d();
        float a = C26960n.m97975a(dVar.mo93886l(), BitmapDescriptorFactory.HUE_RED);
        dVar.mo93879e();
        float a2 = C26960n.m97975a(dVar.mo93886l(), BitmapDescriptorFactory.HUE_RED);
        dVar.mo93879e();
        float a3 = C26960n.m97975a(dVar.mo93886l(), BitmapDescriptorFactory.HUE_RED);
        dVar.mo93879e();
        float a4 = C26960n.m97975a(dVar.mo93886l(), BitmapDescriptorFactory.HUE_RED);
        if (Float.isNaN(a) || Float.isNaN(a2) || Float.isNaN(a3) || Float.isNaN(a4)) {
            throw new SVGParseException("Invalid viewBox definition - should have four numbers");
        } else if (a3 < BitmapDescriptorFactory.HUE_RED) {
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        } else if (a4 >= BitmapDescriptorFactory.HUE_RED) {
            return new SVG.C26437a(a, a2, a3, a4);
        } else {
            throw new SVGParseException("Invalid viewBox. height cannot be negative");
        }
    }

    /* renamed from: i */
    private static SVG.AbstractC26446ai m95975i(String str) {
        if (!str.startsWith("url(")) {
            return m95977j(str);
        }
        int indexOf = str.indexOf(")");
        SVG.AbstractC26446ai aiVar = null;
        if (indexOf == -1) {
            return new SVG.C26463r(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            aiVar = m95977j(trim2);
        }
        return new SVG.C26463r(trim, aiVar);
    }

    /* renamed from: j */
    private void m95978j(Attributes attributes) throws SVGParseException {
        m95956a("<line>", new Object[0]);
        if (this.f65463b != null) {
            SVG.C26461p pVar = new SVG.C26461p();
            pVar.f65353o = this.f65462a;
            pVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) pVar, attributes);
            m95960b(pVar, attributes);
            m95947a((SVG.AbstractC26458m) pVar, attributes);
            m95949a(pVar, attributes);
            this.f65463b.mo93830a(pVar);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: m */
    private void m95984m(Attributes attributes) throws SVGParseException {
        m95956a("<linearGradient>", new Object[0]);
        if (this.f65463b != null) {
            SVG.C26444ag agVar = new SVG.C26444ag();
            agVar.f65353o = this.f65462a;
            agVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) agVar, attributes);
            m95960b(agVar, attributes);
            m95946a((SVG.AbstractC26454i) agVar, attributes);
            m95938a(agVar, attributes);
            this.f65463b.mo93830a(agVar);
            this.f65463b = agVar;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: n */
    private void m95986n(Attributes attributes) throws SVGParseException {
        m95956a("<radialGradient>", new Object[0]);
        if (this.f65463b != null) {
            SVG.ak akVar = new SVG.ak();
            akVar.f65353o = this.f65462a;
            akVar.f65354p = this.f65463b;
            m95937a((SVG.AbstractC26443af) akVar, attributes);
            m95960b(akVar, attributes);
            m95946a((SVG.AbstractC26454i) akVar, attributes);
            m95940a(akVar, attributes);
            this.f65463b.mo93830a(akVar);
            this.f65463b = akVar;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: o */
    private static SVG.C26460o[] m95988o(String str) {
        SVG.C26460o i;
        C26487d dVar = new C26487d(str);
        dVar.mo93878d();
        if (dVar.mo93877c() || (i = dVar.mo93883i()) == null || i.mo93842c()) {
            return null;
        }
        float a = i.mo93835a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(i);
        while (!dVar.mo93877c()) {
            dVar.mo93879e();
            SVG.C26460o i2 = dVar.mo93883i();
            if (i2 == null || i2.mo93842c()) {
                return null;
            }
            arrayList.add(i2);
            a += i2.mo93835a();
        }
        if (a == BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        return (SVG.C26460o[]) arrayList.toArray(new SVG.C26460o[arrayList.size()]);
    }

    /* renamed from: p */
    private static Boolean m95989p(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1217487446:
                if (str.equals("hidden")) {
                    c = 0;
                    break;
                }
                break;
            case -907680051:
                if (str.equals("scroll")) {
                    c = 1;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c = 2;
                    break;
                }
                break;
            case 466743410:
                if (str.equals("visible")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return Boolean.FALSE;
            case 2:
            case 3:
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    /* renamed from: q */
    private static SVG.C26447b m95991q(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        C26487d dVar = new C26487d(str.substring(5));
        dVar.mo93878d();
        SVG.C26460o a = m95929a(dVar);
        dVar.mo93879e();
        SVG.C26460o a2 = m95929a(dVar);
        dVar.mo93879e();
        SVG.C26460o a3 = m95929a(dVar);
        dVar.mo93879e();
        SVG.C26460o a4 = m95929a(dVar);
        dVar.mo93878d();
        if (dVar.mo93873a(')') || dVar.mo93877c()) {
            return new SVG.C26447b(a, a2, a3, a4);
        }
        return null;
    }

    /* renamed from: s */
    private static SVG.Style.RenderQuality m95995s(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -933002398:
                if (str.equals("optimizeQuality")) {
                    c = 0;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c = 1;
                    break;
                }
                break;
            case 362741610:
                if (str.equals("optimizeSpeed")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return SVG.Style.RenderQuality.optimizeQuality;
            case 1:
                return SVG.Style.RenderQuality.auto;
            case 2:
                return SVG.Style.RenderQuality.optimizeSpeed;
            default:
                return null;
        }
    }

    /* renamed from: a */
    static SVG.C26460o m95930a(String str) throws SVGParseException {
        if (str.length() != 0) {
            int length = str.length();
            SVG.am amVar = SVG.am.px;
            char charAt = str.charAt(length - 1);
            if (charAt == '%') {
                length--;
                amVar = SVG.am.percent;
            } else {
                if (str.endsWith("rpx")) {
                    amVar = SVG.am.rpx;
                } else if (str.endsWith("rem")) {
                    amVar = SVG.am.rem;
                } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
                    length -= 2;
                    try {
                        amVar = SVG.am.valueOf(str.substring(length).toLowerCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                        throw new SVGParseException("Invalid length unit specifier: " + str);
                    }
                }
                length -= 3;
            }
            try {
                return new SVG.C26460o(m95928a(str, 0, length), amVar);
            } catch (NumberFormatException e) {
                throw new SVGParseException("Invalid length value: " + str, e);
            }
        } else {
            throw new SVGParseException("Invalid length value (empty string)");
        }
    }

    /* renamed from: b */
    private void m95961b(InputStream inputStream) throws SVGParseException {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            C26488e eVar = new C26488e(newPullParser);
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", true);
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput(inputStream, "utf-8");
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                if (eventType == 0) {
                    m95932a();
                } else if (eventType == 2) {
                    String name = newPullParser.getName();
                    if (newPullParser.getPrefix() != null) {
                        name = newPullParser.getPrefix() + ':' + name;
                    }
                    m95955a(newPullParser.getNamespace(), newPullParser.getName(), name, eVar);
                } else if (eventType == 3) {
                    String name2 = newPullParser.getName();
                    if (newPullParser.getPrefix() != null) {
                        name2 = newPullParser.getPrefix() + ':' + name2;
                    }
                    m95954a(newPullParser.getNamespace(), newPullParser.getName(), name2);
                }
            }
            m95959b();
        } catch (XmlPullParserException e) {
            throw new SVGParseException("XML parser problem", e);
        } catch (Exception e2) {
            throw new SVGParseException("unexpected error", e2);
        }
    }

    /* renamed from: c */
    protected static SVG.C26465t m95963c(String str) {
        float f;
        float f2;
        float f3;
        float f4;
        C26487d dVar = new C26487d(str);
        SVG.C26465t tVar = new SVG.C26465t();
        if (dVar.mo93877c()) {
            return tVar;
        }
        int intValue = dVar.mo93882h().intValue();
        int i = SmEvents.EVENT_NR;
        if (intValue != 77 && intValue != 109) {
            return tVar;
        }
        int i2 = intValue;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        float f6 = BitmapDescriptorFactory.HUE_RED;
        float f7 = BitmapDescriptorFactory.HUE_RED;
        float f8 = BitmapDescriptorFactory.HUE_RED;
        float f9 = BitmapDescriptorFactory.HUE_RED;
        float f10 = BitmapDescriptorFactory.HUE_RED;
        while (true) {
            dVar.mo93878d();
            int i3 = 108;
            switch (i2) {
                case 65:
                case 97:
                    float f11 = dVar.mo93880f();
                    float a = dVar.mo93869a(f11);
                    float a2 = dVar.mo93869a(a);
                    Boolean a3 = dVar.mo93871a(Float.valueOf(a2));
                    Boolean a4 = dVar.mo93871a((Object) a3);
                    float a5 = dVar.mo93870a(a4);
                    float a6 = dVar.mo93869a(a5);
                    if (!Float.isNaN(a6) && f11 >= BitmapDescriptorFactory.HUE_RED && a >= BitmapDescriptorFactory.HUE_RED) {
                        if (i2 == 97) {
                            a5 += f5;
                            a6 += f7;
                        }
                        tVar.mo93848a(f11, a, a2, a3.booleanValue(), a4.booleanValue(), a5, a6);
                        f5 = a5;
                        f6 = f5;
                        f7 = a6;
                        f8 = f7;
                        break;
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                        break;
                    }
                    break;
                case 67:
                case SmEvents.EVENT_UE /*{ENCODED_INT: 99}*/:
                    float f12 = dVar.mo93880f();
                    float a7 = dVar.mo93869a(f12);
                    float a8 = dVar.mo93869a(a7);
                    float a9 = dVar.mo93869a(a8);
                    f3 = dVar.mo93869a(a9);
                    f = dVar.mo93869a(f3);
                    if (!Float.isNaN(f)) {
                        if (i2 == 99) {
                            f3 += f5;
                            f += f7;
                            f12 += f5;
                            a7 += f7;
                            a8 += f5;
                            a9 += f7;
                        }
                        f4 = a8;
                        f2 = a9;
                        tVar.mo93847a(f12, a7, f4, f2, f3, f);
                        f6 = f4;
                        f5 = f3;
                        f8 = f2;
                        f7 = f;
                        break;
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                        return tVar;
                    }
                case 72:
                case 104:
                    float f13 = dVar.mo93880f();
                    if (!Float.isNaN(f13)) {
                        if (i2 == 104) {
                            f13 += f5;
                        }
                        f5 = f13;
                        tVar.mo93852b(f5, f7);
                        f6 = f5;
                        break;
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                        return tVar;
                    }
                case 76:
                case 108:
                    float f14 = dVar.mo93880f();
                    float a10 = dVar.mo93869a(f14);
                    if (!Float.isNaN(a10)) {
                        if (i2 == 108) {
                            f14 += f5;
                            a10 += f7;
                        }
                        f5 = f14;
                        f7 = a10;
                        tVar.mo93852b(f5, f7);
                        f6 = f5;
                        f8 = f7;
                        break;
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                        return tVar;
                    }
                case 77:
                case SmEvents.EVENT_NR /*{ENCODED_INT: 109}*/:
                    float f15 = dVar.mo93880f();
                    float a11 = dVar.mo93869a(f15);
                    if (!Float.isNaN(a11)) {
                        if (i2 == i && !tVar.mo93850a()) {
                            f15 += f5;
                            a11 += f7;
                        }
                        f5 = f15;
                        f7 = a11;
                        tVar.mo93845a(f5, f7);
                        if (i2 != i) {
                            i3 = 76;
                        }
                        f6 = f5;
                        f9 = f6;
                        f8 = f7;
                        f10 = f8;
                        i2 = i3;
                        break;
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                        return tVar;
                    }
                case 81:
                case SmEvents.EVENT_RE /*{ENCODED_INT: 113}*/:
                    f6 = dVar.mo93880f();
                    f8 = dVar.mo93869a(f6);
                    float a12 = dVar.mo93869a(f8);
                    float a13 = dVar.mo93869a(a12);
                    if (!Float.isNaN(a13)) {
                        if (i2 == 113) {
                            a12 += f5;
                            a13 += f7;
                            f6 += f5;
                            f8 += f7;
                        }
                        f5 = a12;
                        f7 = a13;
                        tVar.mo93846a(f6, f8, f5, f7);
                        break;
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                        return tVar;
                    }
                case 83:
                case 115:
                    float f16 = (f5 * 2.0f) - f6;
                    float f17 = (2.0f * f7) - f8;
                    float f18 = dVar.mo93880f();
                    float a14 = dVar.mo93869a(f18);
                    f3 = dVar.mo93869a(a14);
                    f = dVar.mo93869a(f3);
                    if (!Float.isNaN(f)) {
                        if (i2 == 115) {
                            f3 += f5;
                            f += f7;
                            f18 += f5;
                            a14 += f7;
                        }
                        f4 = f18;
                        f2 = a14;
                        tVar.mo93847a(f16, f17, f4, f2, f3, f);
                        f6 = f4;
                        f5 = f3;
                        f8 = f2;
                        f7 = f;
                        break;
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                        return tVar;
                    }
                case 84:
                case SmEvents.EVENT_RS /*{ENCODED_INT: 116}*/:
                    f6 = (f5 * 2.0f) - f6;
                    f8 = (2.0f * f7) - f8;
                    float f19 = dVar.mo93880f();
                    float a15 = dVar.mo93869a(f19);
                    if (!Float.isNaN(a15)) {
                        if (i2 == 116) {
                            f19 += f5;
                            a15 += f7;
                        }
                        f5 = f19;
                        f7 = a15;
                        tVar.mo93846a(f6, f8, f5, f7);
                        break;
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                        return tVar;
                    }
                case 86:
                case 118:
                    float f20 = dVar.mo93880f();
                    if (!Float.isNaN(f20)) {
                        if (i2 == 118) {
                            f20 += f7;
                        }
                        f7 = f20;
                        tVar.mo93852b(f5, f7);
                        f8 = f7;
                        break;
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
                        return tVar;
                    }
                case CameraPosition.TILT_90:
                case SmActions.ACTION_INIT_EXIT /*{ENCODED_INT: 122}*/:
                    tVar.mo93851b();
                    f5 = f9;
                    f6 = f5;
                    f7 = f10;
                    f8 = f7;
                    break;
                default:
                    return tVar;
            }
            dVar.mo93879e();
            if (dVar.mo93877c()) {
                return tVar;
            }
            if (dVar.mo93889o()) {
                i2 = dVar.mo93882h().intValue();
            }
            i = SmEvents.EVENT_NR;
        }
        Log.e("SVGParser", "Bad path coords for " + ((char) i2) + " path segment");
        return tVar;
    }

    /* renamed from: e */
    private Matrix m95967e(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        C26487d dVar = new C26487d(str);
        dVar.mo93878d();
        while (!dVar.mo93877c()) {
            String m = dVar.mo93887m();
            if (m != null) {
                m.hashCode();
                char c = 65535;
                switch (m.hashCode()) {
                    case -1081239615:
                        if (m.equals("matrix")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -925180581:
                        if (m.equals("rotate")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 109250890:
                        if (m.equals("scale")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 109493390:
                        if (m.equals("skewX")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 109493391:
                        if (m.equals("skewY")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1052832078:
                        if (m.equals("translate")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        dVar.mo93878d();
                        float f = dVar.mo93880f();
                        dVar.mo93879e();
                        float f2 = dVar.mo93880f();
                        dVar.mo93879e();
                        float f3 = dVar.mo93880f();
                        dVar.mo93879e();
                        float f4 = dVar.mo93880f();
                        dVar.mo93879e();
                        float f5 = dVar.mo93880f();
                        dVar.mo93879e();
                        float f6 = dVar.mo93880f();
                        dVar.mo93878d();
                        if (!Float.isNaN(f6) && dVar.mo93873a(')')) {
                            Matrix matrix2 = new Matrix();
                            matrix2.setValues(new float[]{f, f3, f5, f2, f4, f6, 0.0f, 0.0f, 1.0f});
                            matrix.preConcat(matrix2);
                            break;
                        } else {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                        break;
                    case 1:
                        dVar.mo93878d();
                        float f7 = dVar.mo93880f();
                        float g = dVar.mo93881g();
                        float g2 = dVar.mo93881g();
                        dVar.mo93878d();
                        if (Float.isNaN(f7) || !dVar.mo93873a(')')) {
                            throw new SVGParseException("Invalid transform list: " + str);
                        } else if (Float.isNaN(g)) {
                            matrix.preRotate(f7);
                            break;
                        } else if (!Float.isNaN(g2)) {
                            matrix.preRotate(f7, g, g2);
                            break;
                        } else {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                    case 2:
                        dVar.mo93878d();
                        float f8 = dVar.mo93880f();
                        float g3 = dVar.mo93881g();
                        dVar.mo93878d();
                        if (!Float.isNaN(f8) && dVar.mo93873a(')')) {
                            if (!Float.isNaN(g3)) {
                                matrix.preScale(f8, g3);
                                break;
                            } else {
                                matrix.preScale(f8, f8);
                                break;
                            }
                        } else {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                        break;
                    case 3:
                        dVar.mo93878d();
                        float f9 = dVar.mo93880f();
                        dVar.mo93878d();
                        if (!Float.isNaN(f9) && dVar.mo93873a(')')) {
                            matrix.preSkew((float) Math.tan(Math.toRadians((double) f9)), BitmapDescriptorFactory.HUE_RED);
                            break;
                        } else {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                    case 4:
                        dVar.mo93878d();
                        float f10 = dVar.mo93880f();
                        dVar.mo93878d();
                        if (!Float.isNaN(f10) && dVar.mo93873a(')')) {
                            matrix.preSkew(BitmapDescriptorFactory.HUE_RED, (float) Math.tan(Math.toRadians((double) f10)));
                            break;
                        } else {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                    case 5:
                        dVar.mo93878d();
                        float f11 = dVar.mo93880f();
                        float g4 = dVar.mo93881g();
                        dVar.mo93878d();
                        if (!Float.isNaN(f11) && dVar.mo93873a(')')) {
                            if (!Float.isNaN(g4)) {
                                matrix.preTranslate(f11, g4);
                                break;
                            } else {
                                matrix.preTranslate(f11, BitmapDescriptorFactory.HUE_RED);
                                break;
                            }
                        } else {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                        break;
                    default:
                        throw new SVGParseException("Invalid transform list fn: " + m + ")");
                }
                if (dVar.mo93877c()) {
                    return matrix;
                }
                dVar.mo93879e();
            } else {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str);
            }
        }
        return matrix;
    }

    /* renamed from: a */
    private static void m95939a(SVG.aj ajVar, String str) throws SVGParseException {
        ajVar.f65355q = m95958b(str);
    }

    /* renamed from: a */
    private static String m95931a(String str, String str2) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }

    /* renamed from: b */
    private void m95960b(SVG.AbstractC26443af afVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                if (C264831.f65467b[EnumC26485b.fromString(attributes.getLocalName(i)).ordinal()] != 29) {
                    if (afVar.f65347m == null) {
                        afVar.f65347m = new SVG.Style();
                    }
                    m95933a(afVar.f65347m, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    m95936a(afVar, trim);
                }
            }
        }
    }

    /* renamed from: a */
    private void m95934a(SVG.C26438aa aaVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (C264831.f65467b[EnumC26485b.fromString(attributes.getLocalName(i)).ordinal()] == 24) {
                aaVar.f65337a = m95965d(trim);
            }
        }
    }

    /* renamed from: a */
    private void m95935a(SVG.C26439ab abVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C264831.f65467b[EnumC26485b.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                abVar.f65338a = m95930a(trim);
            } else if (i2 == 2) {
                abVar.f65339b = m95930a(trim);
            } else if (i2 == 3) {
                abVar.f65340c = m95930a(trim);
                if (abVar.f65340c.mo93842c()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                abVar.f65341d = m95930a(trim);
                if (abVar.f65341d.mo93842c()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (i2 == 5) {
                abVar.f65342e = trim;
            }
        }
    }

    /* renamed from: a */
    private static float m95928a(String str, int i, int i2) throws SVGParseException {
        float a = new C26475c().mo93855a(str, i, i2);
        if (!Float.isNaN(a)) {
            return a;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    /* renamed from: a */
    static void m95933a(SVG.Style style, String str, String str2) {
        if (str2.length() != 0 && !str2.equals("inherit")) {
            switch (C264831.f65467b[EnumC26485b.fromString(str).ordinal()]) {
                case 30:
                    style.f65308b = m95975i(str2);
                    if (style.f65308b != null) {
                        style.f65307a |= 1;
                        return;
                    }
                    return;
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    style.f65309c = m95981l(str2);
                    if (style.f65309c != null) {
                        style.f65307a |= 2;
                        return;
                    }
                    return;
                case 32:
                    style.f65310d = m95971g(str2);
                    if (style.f65310d != null) {
                        style.f65307a |= 4;
                        return;
                    }
                    return;
                case 33:
                    style.f65311e = m95975i(str2);
                    if (style.f65311e != null) {
                        style.f65307a |= 8;
                        return;
                    }
                    return;
                case 34:
                    style.f65312f = m95971g(str2);
                    if (style.f65312f != null) {
                        style.f65307a |= 16;
                        return;
                    }
                    return;
                case 35:
                    style.f65313g = m95930a(str2);
                    style.f65307a |= 32;
                    return;
                case 36:
                    style.f65314h = m95983m(str2);
                    if (style.f65314h != null) {
                        style.f65307a |= 64;
                        return;
                    }
                    return;
                case 37:
                    style.f65315i = m95985n(str2);
                    if (style.f65315i != null) {
                        style.f65307a |= 128;
                        return;
                    }
                    return;
                case 38:
                    style.f65316j = Float.valueOf(m95969f(str2));
                    style.f65307a |= 256;
                    return;
                case 39:
                    if ("none".equals(str2)) {
                        style.f65317k = null;
                        style.f65307a |= 512;
                        return;
                    }
                    style.f65317k = m95988o(str2);
                    if (style.f65317k != null) {
                        style.f65307a |= 512;
                        return;
                    }
                    return;
                case 40:
                    style.f65318l = m95930a(str2);
                    style.f65307a |= 1024;
                    return;
                case 41:
                    style.f65319m = m95971g(str2);
                    style.f65307a |= 2048;
                    return;
                case 42:
                    try {
                        style.f65320n = m95979k(str2);
                        style.f65307a |= 4096;
                        return;
                    } catch (SVGParseException unused) {
                        return;
                    }
                case 43:
                    style.f65321o = m95989p(str2);
                    if (style.f65321o != null) {
                        style.f65307a |= 524288;
                        return;
                    }
                    return;
                case 44:
                    if (str2.indexOf(SmActions.ACTION_CALLING_EXIT) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            style.f65323q = Boolean.valueOf(!str2.equals("none"));
                            style.f65307a |= 16777216;
                            return;
                        }
                        return;
                    }
                    return;
                case 45:
                    if (str2.indexOf(SmActions.ACTION_CALLING_EXIT) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            style.f65324r = Boolean.valueOf(str2.equals("visible"));
                            style.f65307a |= 33554432;
                            return;
                        }
                        return;
                    }
                    return;
                case 46:
                    if (str2.equals("currentColor")) {
                        style.f65325s = SVG.C26451f.m95780a();
                    } else {
                        try {
                            style.f65325s = m95979k(str2);
                        } catch (SVGParseException e) {
                            Log.w("SVGParser", e.getMessage());
                            return;
                        }
                    }
                    style.f65307a |= 67108864;
                    return;
                case 47:
                    style.f65326t = m95971g(str2);
                    style.f65307a |= 134217728;
                    return;
                case 48:
                    style.f65322p = m95991q(str2);
                    if (style.f65322p != null) {
                        style.f65307a |= 1048576;
                        return;
                    }
                    return;
                case 49:
                    style.f65327u = m95931a(str2, str);
                    style.f65307a |= 268435456;
                    return;
                case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                    style.f65328v = m95981l(str2);
                    style.f65307a |= 536870912;
                    return;
                case 51:
                    if (str2.equals("currentColor")) {
                        style.f65329w = SVG.C26451f.m95780a();
                    } else {
                        try {
                            style.f65329w = m95979k(str2);
                        } catch (SVGParseException e2) {
                            Log.w("SVGParser", e2.getMessage());
                            return;
                        }
                    }
                    style.f65307a |= FileReaderUtil.f12880b;
                    return;
                case 52:
                    style.f65330x = m95971g(str2);
                    style.f65307a |= 4294967296L;
                    return;
                case 53:
                    if (str2.equals("currentColor")) {
                        style.f65331y = SVG.C26451f.m95780a();
                    } else {
                        try {
                            style.f65331y = m95979k(str2);
                        } catch (SVGParseException e3) {
                            Log.w("SVGParser", e3.getMessage());
                            return;
                        }
                    }
                    style.f65307a |= 8589934592L;
                    return;
                case 54:
                    style.f65332z = m95971g(str2);
                    style.f65307a |= 17179869184L;
                    return;
                case 55:
                    style.f65305A = m95993r(str2);
                    if (style.f65305A != null) {
                        style.f65307a |= 34359738368L;
                        return;
                    }
                    return;
                case 56:
                    style.f65306B = m95995s(str2);
                    if (style.f65306B != null) {
                        style.f65307a |= 137438953472L;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
