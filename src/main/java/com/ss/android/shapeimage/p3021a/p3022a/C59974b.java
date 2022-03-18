package com.ss.android.shapeimage.p3021a.p3022a;

import com.ss.android.lark.log.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.shapeimage.a.a.b */
public class C59974b {

    /* renamed from: b */
    private static final String f149510b = C59982i.f149529a;

    /* renamed from: a */
    final HashMap<String, String> f149511a = new HashMap<>();

    /* renamed from: c */
    private final Stack<C59975a> f149512c = new Stack<>();

    /* renamed from: d */
    private final XmlPullParser f149513d;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo204232b() {
        String name = this.f149513d.getName();
        String a = C59978e.m232769a("id", this.f149513d);
        if (a != null) {
            this.f149512c.push(new C59975a(a));
        }
        if (this.f149512c.size() > 0) {
            C59975a lastElement = this.f149512c.lastElement();
            lastElement.f149515b++;
            m232760a(lastElement.f149516c, name, this.f149513d);
        }
    }

    /* renamed from: a */
    public void mo204231a() throws XmlPullParserException, IOException {
        int eventType = this.f149513d.getEventType();
        do {
            if (!(eventType == 0 || eventType == 1)) {
                if (eventType == 2) {
                    mo204232b();
                } else if (eventType == 3) {
                    mo204233c();
                }
            }
            eventType = this.f149513d.next();
        } while (eventType != 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo204233c() {
        String name = this.f149513d.getName();
        if (this.f149512c.size() > 0) {
            C59975a lastElement = this.f149512c.lastElement();
            lastElement.f149516c.append("</");
            lastElement.f149516c.append(name);
            lastElement.f149516c.append(">");
            lastElement.f149515b--;
            if (lastElement.f149515b == 0) {
                String sb = lastElement.f149516c.toString();
                this.f149511a.put(lastElement.f149514a, sb);
                this.f149512c.pop();
                if (this.f149512c.size() > 0) {
                    this.f149512c.lastElement().f149516c.append(sb);
                }
                Log.m165397w(f149510b, sb);
            }
        }
    }

    C59974b(XmlPullParser xmlPullParser) {
        this.f149513d = xmlPullParser;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.shapeimage.a.a.b$a */
    public class C59975a {

        /* renamed from: a */
        final String f149514a;

        /* renamed from: b */
        int f149515b;

        /* renamed from: c */
        final StringBuilder f149516c = new StringBuilder();

        public C59975a(String str) {
            this.f149514a = str;
        }
    }

    /* renamed from: a */
    private void m232760a(StringBuilder sb, String str, XmlPullParser xmlPullParser) {
        sb.append("<");
        sb.append(str);
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            sb.append(" ");
            sb.append(xmlPullParser.getAttributeName(i));
            sb.append("='");
            sb.append(C59978e.m232768a(xmlPullParser.getAttributeValue(i)));
            sb.append("'");
        }
        sb.append(">");
    }
}
