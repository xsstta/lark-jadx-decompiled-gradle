package com.google.android.play.core.splitinstall;

import android.util.Log;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.v */
public final class C22724v {

    /* renamed from: a */
    private final XmlPullParser f56239a;

    /* renamed from: b */
    private final C22728z f56240b = new C22728z();

    C22724v(XmlPullParser xmlPullParser) {
        this.f56239a = xmlPullParser;
    }

    /* renamed from: a */
    private final String m82668a(String str) {
        for (int i = 0; i < this.f56239a.getAttributeCount(); i++) {
            if (this.f56239a.getAttributeName(i).equals(str)) {
                return this.f56239a.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    private final void m82669b() throws IOException, XmlPullParserException {
        int i = 1;
        while (i != 0) {
            int next = this.f56239a.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C22693aa mo79065a() {
        String a;
        while (this.f56239a.next() != 1) {
            try {
                if (this.f56239a.getEventType() == 2) {
                    if (this.f56239a.getName().equals("splits")) {
                        while (this.f56239a.next() != 3) {
                            if (this.f56239a.getEventType() == 2) {
                                if (!this.f56239a.getName().equals("module") || (a = m82668a("name")) == null) {
                                    m82669b();
                                } else {
                                    while (this.f56239a.next() != 3) {
                                        if (this.f56239a.getEventType() == 2) {
                                            if (this.f56239a.getName().equals("language")) {
                                                while (this.f56239a.next() != 3) {
                                                    if (this.f56239a.getEventType() == 2) {
                                                        if (this.f56239a.getName().equals("entry")) {
                                                            String a2 = m82668a("key");
                                                            String a3 = m82668a("split");
                                                            m82669b();
                                                            if (!(a2 == null || a3 == null)) {
                                                                this.f56240b.mo79069a(a, a2, a3);
                                                            }
                                                        } else {
                                                            m82669b();
                                                        }
                                                    }
                                                }
                                            } else {
                                                m82669b();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        m82669b();
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException e) {
                Log.e("SplitInstall", "Error while parsing splits.xml", e);
                return null;
            }
        }
        return this.f56240b.mo79068a();
    }
}
