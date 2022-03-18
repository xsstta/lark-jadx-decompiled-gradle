package com.bytedance.ee.bear.notification.view;

import com.bytedance.ee.log.C13479a;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.io.IOException;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.bytedance.ee.bear.notification.view.a */
public class C10363a {
    /* renamed from: a */
    public static C10364a m43080a(String str) {
        Matcher matcher = Pattern.compile("<a[^<>]*>[^<>]*</a>").matcher(str);
        C10364a aVar = new C10364a(str, "", -1, -1);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String substring = str.substring(start, end);
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                newPullParser.setInput(new StringReader(substring));
                String str2 = "";
                String str3 = str2;
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                    String name = newPullParser.getName();
                    if (eventType != 2) {
                        if (eventType == 4) {
                            C13479a.m54772d("ALinkParser", "pullParser: parse text");
                            str2 = newPullParser.getText();
                        }
                    } else if (AbstractC60044a.f149675a.equals(name)) {
                        C13479a.m54772d("ALinkParser", "pullParser: parse start tag");
                        str3 = newPullParser.getAttributeValue(null, "href");
                    }
                }
                aVar.f27888a = str.substring(0, start) + str2 + str.substring(end);
                aVar.f27889b = str3;
                aVar.f27890c = start;
                aVar.f27891d = start + str2.length();
            } catch (IOException | XmlPullParserException e) {
                C13479a.m54759a("ALinkParser", "error when parse xml", e);
            }
        }
        return aVar;
    }

    /* renamed from: com.bytedance.ee.bear.notification.view.a$a */
    public static class C10364a {

        /* renamed from: a */
        public String f27888a;

        /* renamed from: b */
        public String f27889b;

        /* renamed from: c */
        public int f27890c;

        /* renamed from: d */
        public int f27891d;

        public C10364a(String str, String str2, int i, int i2) {
            this.f27888a = str;
            this.f27889b = str2;
            this.f27890c = i;
            this.f27891d = i2;
        }
    }
}
