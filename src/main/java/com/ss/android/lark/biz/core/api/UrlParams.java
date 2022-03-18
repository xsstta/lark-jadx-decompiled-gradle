package com.ss.android.lark.biz.core.api;

import android.os.Bundle;
import com.larksuite.component.webview.container.dto.C25830a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public class UrlParams {

    /* renamed from: a */
    public final String f73891a;

    /* renamed from: b */
    public final String f73892b;

    /* renamed from: c */
    public final boolean f73893c;

    /* renamed from: d */
    public final boolean f73894d;

    /* renamed from: e */
    public final boolean f73895e;

    /* renamed from: f */
    public final boolean f73896f;

    /* renamed from: g */
    public final Source f73897g;

    /* renamed from: h */
    public final int[] f73898h;

    /* renamed from: i */
    public final int f73899i;

    /* renamed from: j */
    public final Bundle f73900j;

    /* renamed from: k */
    public final String f73901k;

    /* renamed from: l */
    public final String f73902l;

    /* renamed from: m */
    public final boolean f73903m;

    /* renamed from: n */
    public final boolean f73904n;

    /* renamed from: o */
    public final boolean f73905o;

    /* renamed from: p */
    public final boolean f73906p;

    /* renamed from: q */
    public final String f73907q;

    /* renamed from: r */
    public final Map<String, String> f73908r;

    /* renamed from: s */
    public final Map<String, String> f73909s;

    /* renamed from: t */
    public final String f73910t;

    /* renamed from: u */
    public final String f73911u;

    /* renamed from: v */
    public final int f73912v;

    /* renamed from: w */
    public int f73913w;

    /* renamed from: x */
    public C25830a f73914x;

    public @interface DomainTargetType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LKPLaunchType {
    }

    public enum Source {
        UNKNOWN(0),
        APP(1),
        SPLASH(2),
        THIRD(3),
        MULTI_TASK(4),
        APP_P2P_CHAT(5),
        APP_GROUP_CHAT(6),
        APP_THREAD_TOPIC(7),
        APP_CARD_SINGLE(8),
        APP_CARD_GROUP(9),
        APP_CARD_LINK_SINGLE(10),
        APP_CARD_LINK_GROUP(11),
        APP_CARD_FOOTER_LINK(12),
        DOC(13),
        QR(14),
        SCAN_PARSE(15),
        SCAN_CAMERA(16);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static Source getSource(int i) {
            Source[] values = values();
            for (Source source : values) {
                if (source.getValue() == i) {
                    return source;
                }
            }
            return UNKNOWN;
        }

        private Source(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public static C29536a m108857a() {
        return new C29536a();
    }

    /* renamed from: com.ss.android.lark.biz.core.api.UrlParams$a */
    public static final class C29536a {

        /* renamed from: a */
        public String f73915a;

        /* renamed from: b */
        public String f73916b;

        /* renamed from: c */
        public boolean f73917c;

        /* renamed from: d */
        public boolean f73918d;

        /* renamed from: e */
        public boolean f73919e;

        /* renamed from: f */
        public Source f73920f;

        /* renamed from: g */
        public int[] f73921g;

        /* renamed from: h */
        public String f73922h;

        /* renamed from: i */
        public String f73923i;

        /* renamed from: j */
        public boolean f73924j;

        /* renamed from: k */
        public boolean f73925k;

        /* renamed from: l */
        public boolean f73926l;

        /* renamed from: m */
        public String f73927m;

        /* renamed from: n */
        public Map<String, String> f73928n;

        /* renamed from: o */
        public Map<String, String> f73929o;

        /* renamed from: p */
        public String f73930p;

        /* renamed from: q */
        public boolean f73931q;

        /* renamed from: r */
        public String f73932r;

        /* renamed from: s */
        public int f73933s;

        /* renamed from: t */
        public Bundle f73934t;

        /* renamed from: u */
        public int f73935u;

        /* renamed from: v */
        public boolean f73936v;

        /* renamed from: w */
        public int f73937w;

        /* renamed from: x */
        public C25830a f73938x;

        private C29536a() {
            this.f73917c = true;
            this.f73918d = true;
            this.f73919e = true;
            this.f73925k = true;
            this.f73926l = true;
            this.f73933s = -1;
            this.f73935u = -1;
            this.f73937w = 1;
        }

        /* renamed from: a */
        public UrlParams mo105523a() {
            return new UrlParams(this);
        }

        /* renamed from: a */
        public C29536a mo105515a(int i) {
            this.f73937w = i;
            return this;
        }

        /* renamed from: b */
        public C29536a mo105524b(int i) {
            this.f73933s = i;
            return this;
        }

        /* renamed from: c */
        public C29536a mo105528c(int i) {
            this.f73935u = i;
            return this;
        }

        /* renamed from: d */
        public C29536a mo105531d(String str) {
            this.f73927m = str;
            return this;
        }

        /* renamed from: e */
        public C29536a mo105533e(String str) {
            this.f73922h = str;
            return this;
        }

        /* renamed from: f */
        public C29536a mo105535f(String str) {
            this.f73932r = str;
            return this;
        }

        /* renamed from: g */
        public C29536a mo105537g(String str) {
            this.f73916b = str;
            return this;
        }

        /* renamed from: h */
        public C29536a mo105539h(boolean z) {
            this.f73919e = z;
            return this;
        }

        /* renamed from: a */
        public C29536a mo105516a(Bundle bundle) {
            this.f73934t = bundle;
            return this;
        }

        /* renamed from: b */
        public C29536a mo105525b(String str) {
            this.f73923i = str;
            return this;
        }

        /* renamed from: c */
        public C29536a mo105529c(String str) {
            this.f73930p = str;
            return this;
        }

        /* renamed from: d */
        public C29536a mo105532d(boolean z) {
            this.f73926l = z;
            return this;
        }

        /* renamed from: e */
        public C29536a mo105534e(boolean z) {
            this.f73925k = z;
            return this;
        }

        /* renamed from: f */
        public C29536a mo105536f(boolean z) {
            this.f73917c = z;
            return this;
        }

        /* renamed from: g */
        public C29536a mo105538g(boolean z) {
            this.f73918d = z;
            return this;
        }

        /* renamed from: a */
        public C29536a mo105517a(C25830a aVar) {
            this.f73938x = aVar;
            return this;
        }

        /* renamed from: b */
        public C29536a mo105526b(Map<String, String> map) {
            this.f73928n = map;
            return this;
        }

        /* renamed from: c */
        public C29536a mo105530c(boolean z) {
            this.f73924j = z;
            return this;
        }

        /* renamed from: a */
        public C29536a mo105518a(Source source) {
            this.f73920f = source;
            return this;
        }

        /* renamed from: b */
        public C29536a mo105527b(boolean z) {
            this.f73936v = z;
            return this;
        }

        /* renamed from: a */
        public C29536a mo105519a(String str) {
            this.f73915a = str;
            return this;
        }

        /* renamed from: a */
        public C29536a mo105520a(Map<String, String> map) {
            this.f73929o = map;
            return this;
        }

        /* renamed from: a */
        public C29536a mo105521a(boolean z) {
            this.f73931q = z;
            return this;
        }

        /* renamed from: a */
        public C29536a mo105522a(int[] iArr) {
            this.f73921g = iArr;
            return this;
        }
    }

    private UrlParams(C29536a aVar) {
        this.f73907q = aVar.f73927m;
        this.f73891a = aVar.f73915a;
        this.f73892b = aVar.f73916b;
        this.f73909s = aVar.f73929o;
        this.f73893c = aVar.f73917c;
        this.f73908r = aVar.f73928n;
        this.f73913w = aVar.f73937w;
        this.f73897g = aVar.f73920f;
        this.f73898h = aVar.f73921g;
        this.f73899i = aVar.f73933s;
        this.f73900j = aVar.f73934t;
        this.f73901k = aVar.f73922h;
        this.f73903m = aVar.f73926l;
        this.f73904n = aVar.f73925k;
        this.f73902l = aVar.f73923i;
        this.f73910t = aVar.f73930p;
        this.f73896f = aVar.f73931q;
        this.f73911u = aVar.f73932r;
        this.f73894d = aVar.f73918d;
        this.f73895e = aVar.f73919e;
        this.f73906p = aVar.f73924j;
        this.f73914x = aVar.f73938x;
        this.f73912v = aVar.f73935u;
        this.f73905o = aVar.f73936v;
    }
}
