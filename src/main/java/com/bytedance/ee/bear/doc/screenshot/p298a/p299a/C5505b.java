package com.bytedance.ee.bear.doc.screenshot.p298a.p299a;

import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.doc.screenshot.p298a.C5501a;
import com.bytedance.ee.bear.doc.screenshot.p298a.C5509c;
import com.bytedance.ee.bear.screenshot.C10779a;

/* renamed from: com.bytedance.ee.bear.doc.screenshot.a.a.b */
public class C5505b {

    /* renamed from: a */
    private boolean f15662a;

    /* renamed from: b */
    private C5501a f15663b;

    /* renamed from: c */
    private C5509c f15664c;

    /* renamed from: a */
    public void mo21998a() {
        if (this.f15662a) {
            this.f15664c.mo22010a();
        } else {
            this.f15663b.mo21983a();
        }
    }

    /* renamed from: b */
    public void mo21999b() {
        if (this.f15662a) {
            this.f15664c.mo22014b();
        } else {
            this.f15663b.mo21986b();
        }
    }

    /* renamed from: com.bytedance.ee.bear.doc.screenshot.a.a.b$a */
    public static class C5506a {

        /* renamed from: a */
        private Context f15665a;

        /* renamed from: b */
        private WebView f15666b;

        /* renamed from: c */
        private String f15667c;

        /* renamed from: d */
        private AbstractC5504a f15668d;

        /* renamed from: e */
        private C1177w<Boolean> f15669e;

        /* renamed from: f */
        private int f15670f;

        /* renamed from: g */
        private int f15671g;

        /* renamed from: h */
        private int f15672h;

        /* renamed from: i */
        private boolean f15673i;

        /* renamed from: a */
        public C5505b mo22006a() {
            C5509c cVar;
            C5501a aVar = null;
            if (this.f15673i) {
                cVar = new C5509c(this.f15666b, this.f15667c, this.f15668d, this.f15670f, this.f15671g, this.f15672h, this.f15669e);
            } else {
                aVar = new C5501a.C5503a(this.f15665a).mo21991a(this.f15666b).mo21990a(this.f15670f).mo21996b(this.f15671g).mo21997c(this.f15672h).mo21994a(C10779a.m44660a(this.f15665a).getAbsolutePath()).mo21992a(this.f15669e).mo21993a(this.f15668d).mo21995a();
                cVar = null;
            }
            return new C5505b(this.f15673i, aVar, cVar);
        }

        /* renamed from: a */
        public C5506a mo22000a(int i) {
            this.f15670f = i;
            return this;
        }

        /* renamed from: b */
        public C5506a mo22007b(int i) {
            this.f15671g = i;
            return this;
        }

        /* renamed from: c */
        public C5506a mo22008c(int i) {
            this.f15672h = i;
            return this;
        }

        public C5506a(Context context) {
            this.f15665a = context;
        }

        /* renamed from: a */
        public C5506a mo22001a(WebView webView) {
            this.f15666b = webView;
            return this;
        }

        /* renamed from: a */
        public C5506a mo22002a(C1177w<Boolean> wVar) {
            this.f15669e = wVar;
            return this;
        }

        /* renamed from: a */
        public C5506a mo22003a(AbstractC5504a aVar) {
            this.f15668d = aVar;
            return this;
        }

        /* renamed from: a */
        public C5506a mo22004a(String str) {
            this.f15667c = str;
            return this;
        }

        /* renamed from: a */
        public C5506a mo22005a(boolean z) {
            this.f15673i = z;
            return this;
        }
    }

    C5505b(boolean z, C5501a aVar, C5509c cVar) {
        this.f15662a = z;
        this.f15663b = aVar;
        this.f15664c = cVar;
    }
}
