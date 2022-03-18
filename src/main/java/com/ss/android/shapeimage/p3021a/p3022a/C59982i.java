package com.ss.android.shapeimage.p3021a.p3022a;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.statistics.p3180a.C63690d;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import org.p3506b.p3507a.C69999a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.ss.android.shapeimage.a.a.i */
public class C59982i {

    /* renamed from: a */
    static final String f149529a = "i";

    /* renamed from: b */
    private static final Matrix f149530b = new Matrix();

    /* renamed from: c */
    private HashMap<String, String> f149531c = new HashMap<>();

    /* renamed from: d */
    private final XmlPullParser f149532d;

    /* renamed from: e */
    private final RectF f149533e = new RectF();

    /* renamed from: f */
    private float f149534f = 72.0f;

    /* renamed from: g */
    private boolean f149535g = false;

    /* renamed from: h */
    private int f149536h = 0;

    /* renamed from: i */
    private boolean f149537i = false;

    /* renamed from: j */
    private final Deque<Path> f149538j = new LinkedList();

    /* renamed from: k */
    private final Deque<Matrix> f149539k = new LinkedList();

    /* renamed from: l */
    private float f149540l;

    /* renamed from: m */
    private float f149541m;

    /* renamed from: n */
    private Path f149542n;

    /* renamed from: o */
    private C59980g f149543o = null;

    /* renamed from: d */
    private Matrix m232788d() {
        return this.f149539k.pop();
    }

    /* renamed from: e */
    private void m232789e() {
        Path path = new Path();
        this.f149542n = path;
        this.f149538j.add(path);
    }

    /* renamed from: f */
    private Path m232790f() {
        Path pop = this.f149538j.pop();
        this.f149542n = this.f149538j.peek();
        return pop;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo204247c() {
        String name = this.f149532d.getName();
        if (this.f149537i) {
            if (name.equals("defs")) {
                this.f149537i = false;
            }
        } else if (name.equals("svg")) {
            Path f = m232790f();
            f.transform(m232788d());
            this.f149543o = new C59980g(f, this.f149540l, this.f149541m);
        } else if (name.equals("g")) {
            if (this.f149535g) {
                int i = this.f149536h - 1;
                this.f149536h = i;
                if (i == 0) {
                    this.f149535g = false;
                }
            }
            Path f2 = m232790f();
            f2.transform(m232788d());
            this.f149542n.addPath(f2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo204244a() throws XmlPullParserException, IOException {
        int eventType = this.f149532d.getEventType();
        do {
            if (eventType == 2) {
                mo204246b();
            } else if (eventType == 3) {
                mo204247c();
            }
            eventType = this.f149532d.next();
        } while (eventType != 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo204246b() {
        String str;
        String name = this.f149532d.getName();
        if (!this.f149537i) {
            if (name.equals("svg")) {
                this.f149540l = (float) Math.round(mo204243a("width", this.f149532d, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED)).floatValue());
                this.f149541m = (float) Math.round(mo204243a("height", this.f149532d, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED)).floatValue());
                C59977d a = C59977d.m232766a("viewBox", this.f149532d);
                m232789e();
                Matrix matrix = f149530b;
                if (!(a == null || a.f149518a == null || a.f149518a.size() != 4)) {
                    float f = this.f149540l;
                    if (f < 0.1f || this.f149541m < -0.1f) {
                        this.f149540l = a.f149518a.get(2).floatValue() - a.f149518a.get(0).floatValue();
                        this.f149540l = a.f149518a.get(3).floatValue() - a.f149518a.get(3).floatValue();
                    } else {
                        matrix.setScale(f / (a.f149518a.get(2).floatValue() - a.f149518a.get(0).floatValue()), this.f149541m / (a.f149518a.get(3).floatValue() - a.f149518a.get(1).floatValue()));
                    }
                }
                m232785a(matrix);
            } else if (name.equals("defs")) {
                this.f149537i = true;
            } else if (name.equals("use")) {
                String a2 = C59978e.m232769a("xlink:href", this.f149532d);
                String a3 = C59978e.m232769a("transform", this.f149532d);
                String a4 = C59978e.m232769a("x", this.f149532d);
                String a5 = C59978e.m232769a("y", this.f149532d);
                StringBuilder sb = new StringBuilder();
                sb.append("<g");
                sb.append(" xmlns='http://www.w3.org/2000/svg' ");
                sb.append(" xmlns:xlink='http://www.w3.org/1999/xlink' ");
                sb.append(" xmlns:sodipodi='http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd' ");
                sb.append(" xmlns:inkscape='http://www.inkscape.org/namespaces/inkscape' version='1.1'");
                if (!(a3 == null && a4 == null && a5 == null)) {
                    sb.append(" transform='");
                    if (a3 != null) {
                        sb.append(C59978e.m232768a(a3));
                    }
                    if (!(a4 == null && a5 == null)) {
                        sb.append("translate(");
                        String str2 = "0";
                        if (a4 != null) {
                            str = C59978e.m232768a(a4);
                        } else {
                            str = str2;
                        }
                        sb.append(str);
                        sb.append(",");
                        if (a5 != null) {
                            str2 = C59978e.m232768a(a5);
                        }
                        sb.append(str2);
                        sb.append(")");
                    }
                    sb.append("'");
                }
                for (int i = 0; i < this.f149532d.getAttributeCount(); i++) {
                    String attributeName = this.f149532d.getAttributeName(i);
                    if (!"x".equals(attributeName) && !"y".equals(attributeName) && !"width".equals(attributeName) && !"height".equals(attributeName) && !"xlink:href".equals(attributeName) && !"transform".equals(attributeName)) {
                        sb.append(" ");
                        sb.append(attributeName);
                        sb.append("='");
                        sb.append(C59978e.m232768a(this.f149532d.getAttributeValue(i)));
                        sb.append("'");
                    }
                }
                sb.append(">");
                sb.append(this.f149531c.get(a2.substring(1)));
                sb.append("</g>");
            } else if (name.equals("g")) {
                if (this.f149535g) {
                    this.f149536h++;
                }
                if ("none".equals(C59978e.m232769a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, this.f149532d)) && !this.f149535g) {
                    this.f149535g = true;
                    this.f149536h = 1;
                }
                m232786a(this.f149532d);
                m232789e();
            } else if (!this.f149535g && name.equals("rect")) {
                Float a6 = mo204243a("x", this.f149532d, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
                Float a7 = mo204243a("y", this.f149532d, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
                Float a8 = mo204242a("width", this.f149532d);
                Float a9 = mo204242a("height", this.f149532d);
                Float a10 = mo204243a("rx", this.f149532d, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
                Float a11 = mo204243a("ry", this.f149532d, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
                Path path = new Path();
                if (a10.floatValue() > BitmapDescriptorFactory.HUE_RED || a11.floatValue() > BitmapDescriptorFactory.HUE_RED) {
                    this.f149533e.set(a6.floatValue(), a7.floatValue(), a6.floatValue() + a8.floatValue(), a7.floatValue() + a9.floatValue());
                    path.addRoundRect(this.f149533e, a10.floatValue(), a11.floatValue(), Path.Direction.CW);
                } else {
                    path.addRect(a6.floatValue(), a7.floatValue(), a6.floatValue() + a8.floatValue(), a7.floatValue() + a9.floatValue(), Path.Direction.CW);
                }
                m232786a(this.f149532d);
                path.transform(m232788d());
                this.f149542n.addPath(path);
            } else if (!this.f149535g && name.equals("line")) {
                Float a12 = mo204242a("x1", this.f149532d);
                Float a13 = mo204242a("x2", this.f149532d);
                Float a14 = mo204242a("y1", this.f149532d);
                Float a15 = mo204242a("y2", this.f149532d);
                Path path2 = new Path();
                path2.moveTo(a12.floatValue(), a14.floatValue());
                path2.lineTo(a13.floatValue(), a15.floatValue());
                m232786a(this.f149532d);
                path2.transform(m232788d());
                this.f149542n.addPath(path2);
            } else if (!this.f149535g && name.equals("circle")) {
                Float a16 = mo204242a("cx", this.f149532d);
                Float a17 = mo204242a("cy", this.f149532d);
                Float a18 = mo204242a("r", this.f149532d);
                if (!(a16 == null || a17 == null || a18 == null)) {
                    Path path3 = new Path();
                    path3.addCircle(a16.floatValue(), a17.floatValue(), a18.floatValue(), Path.Direction.CW);
                    m232786a(this.f149532d);
                    path3.transform(m232788d());
                    this.f149542n.addPath(path3);
                }
            } else if (!this.f149535g && name.equals("ellipse")) {
                Float a19 = mo204242a("cx", this.f149532d);
                Float a20 = mo204242a("cy", this.f149532d);
                Float a21 = mo204242a("rx", this.f149532d);
                Float a22 = mo204242a("ry", this.f149532d);
                if (!(a19 == null || a20 == null || a21 == null || a22 == null)) {
                    this.f149533e.set(a19.floatValue() - a21.floatValue(), a20.floatValue() - a22.floatValue(), a19.floatValue() + a21.floatValue(), a20.floatValue() + a22.floatValue());
                    Path path4 = new Path();
                    path4.addOval(this.f149533e, Path.Direction.CW);
                    m232786a(this.f149532d);
                    path4.transform(m232788d());
                    this.f149542n.addPath(path4);
                }
            } else if (!this.f149535g && (name.equals("polygon") || name.equals("polyline"))) {
                C59977d a23 = C59977d.m232766a("points", this.f149532d);
                if (a23 != null) {
                    Path path5 = new Path();
                    ArrayList<Float> arrayList = a23.f149518a;
                    if (arrayList.size() > 1) {
                        path5.moveTo(arrayList.get(0).floatValue(), arrayList.get(1).floatValue());
                        for (int i2 = 2; i2 < arrayList.size(); i2 += 2) {
                            path5.lineTo(arrayList.get(i2).floatValue(), arrayList.get(i2 + 1).floatValue());
                        }
                        if (name.equals("polygon")) {
                            path5.close();
                        }
                        m232786a(this.f149532d);
                        path5.transform(m232788d());
                        this.f149542n.addPath(path5);
                    }
                }
            } else if (!this.f149535g && name.equals("path")) {
                Path a24 = C59981h.m232781a(C59978e.m232769a(C63690d.f160779a, this.f149532d));
                m232786a(this.f149532d);
                a24.transform(m232788d());
                this.f149542n.addPath(a24);
            } else if ((this.f149535g || !name.equals("metadata")) && !this.f149535g) {
                Log.m165379d(f149529a, String.format("Unrecognized tag: %s (%s)", name, m232787b(this.f149532d)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo204245a(float f) {
        this.f149534f = f;
    }

    /* renamed from: a */
    public static C59980g m232783a(InputStream inputStream) {
        return m232784a(inputStream, true, 72.0f);
    }

    /* renamed from: a */
    private void m232785a(Matrix matrix) {
        if (matrix == null) {
            matrix = f149530b;
        }
        this.f149539k.push(matrix);
    }

    /* renamed from: a */
    private void m232786a(XmlPullParser xmlPullParser) {
        Matrix matrix;
        String a = C59978e.m232769a("transform", xmlPullParser);
        if (a == null) {
            matrix = f149530b;
        } else {
            matrix = C59983j.m232797a(a);
        }
        this.f149539k.push(matrix);
    }

    private C59982i(XmlPullParser xmlPullParser) {
        this.f149532d = xmlPullParser;
    }

    /* renamed from: b */
    private String m232787b(XmlPullParser xmlPullParser) {
        String str = "";
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            str = str + " " + xmlPullParser.getAttributeName(i) + "='" + xmlPullParser.getAttributeValue(i) + "'";
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Float mo204242a(String str, XmlPullParser xmlPullParser) {
        return mo204243a(str, xmlPullParser, (Float) null);
    }

    /* renamed from: a */
    private static C59980g m232784a(InputStream inputStream, boolean z, float f) {
        try {
            C69999a aVar = new C69999a();
            C59982i iVar = new C59982i(aVar);
            iVar.mo204245a(f);
            if (z) {
                aVar.setInput(new InputStreamReader(inputStream));
                iVar.mo204244a();
            } else {
                C59973a aVar2 = new C59973a(inputStream);
                C69999a aVar3 = new C69999a();
                aVar3.setInput(new InputStreamReader(aVar2.mo204230a()));
                C59974b bVar = new C59974b(aVar3);
                bVar.mo204231a();
                iVar.f149531c = bVar.f149511a;
                aVar.setInput(new InputStreamReader(aVar2.mo204230a()));
                iVar.mo204244a();
            }
            return iVar.f149543o;
        } catch (Exception e) {
            String str = f149529a;
            Log.m165397w(str, "Parse error: " + e);
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Float mo204243a(String str, XmlPullParser xmlPullParser, Float f) {
        Float a = C59978e.m232767a(str, xmlPullParser, this.f149534f, this.f149540l, this.f149541m);
        return a == null ? f : a;
    }
}
