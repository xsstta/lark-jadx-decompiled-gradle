package com.ss.android.appcenter.business.tab.fragmentv3.p1283a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.a.b */
public class C28031b {

    /* renamed from: b */
    public static final String f70138b = null;

    /* renamed from: a */
    Map<String, AbstractC28032a> f70139a;

    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.a.b$d */
    class C28035d extends AbstractC28032a {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28031b.AbstractC28032a
        /* renamed from: a */
        public void mo99874a() {
            mo99875a("showTitle", true);
            mo99875a("showSearch", true);
            mo99875a("showAppDirectory", true);
            mo99875a("showSetting", true);
        }

        C28035d() {
            super();
        }
    }

    public C28031b() {
        HashMap hashMap = new HashMap();
        this.f70139a = hashMap;
        hashMap.put("FeedSwiper", new C28034c());
        this.f70139a.put("FeedList", new C28033b());
        this.f70139a.put("Header", new C28035d());
    }

    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.a.b$b */
    class C28033b extends AbstractC28032a {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28031b.AbstractC28032a
        /* renamed from: a */
        public void mo99874a() {
            mo99875a("height", -2);
            mo99875a("width", -1);
            mo99875a("isTitleInside", false);
            mo99875a("showHeader", true);
            mo99875a("showBackground", true);
            mo99875a("imageHeight", 80);
            mo99875a("backgroundRadius", 6);
            mo99875a("imageRadius", 6);
            mo99875a("marginLeft", 8);
            mo99875a("marginTop", 12);
            mo99875a("marginRight", 8);
            mo99875a("marginBottom", 12);
        }

        C28033b() {
            super();
        }
    }

    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.a.b$c */
    class C28034c extends AbstractC28032a {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28031b.AbstractC28032a
        /* renamed from: a */
        public void mo99874a() {
            mo99875a("height", -2);
            mo99875a("width", -1);
            mo99875a("showHeader", true);
            mo99875a("interval", 5000);
            mo99875a("showBackground", true);
            mo99875a("imageHeight", 166);
            mo99875a("feedTitleFontSize", 16);
            mo99875a("backgroundRadius", 12);
            mo99875a("imageRadius", 12);
        }

        C28034c() {
            super();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.a.b$a */
    public abstract class AbstractC28032a {

        /* renamed from: a */
        Map<String, Object> f70140a = new HashMap();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo99874a();

        /* renamed from: a */
        public Object mo99873a(String str) {
            return this.f70140a.get(str);
        }

        public AbstractC28032a() {
            mo99874a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo99875a(String str, Object obj) {
            this.f70140a.put(str, obj);
        }
    }

    /* renamed from: a */
    public String mo99869a(String str, String str2) {
        if (!this.f70139a.containsKey(str)) {
            return f70138b;
        }
        Object a = this.f70139a.get(str).mo99873a(str2);
        if (a == null || !(a instanceof String)) {
            return f70138b;
        }
        return (String) a;
    }

    /* renamed from: b */
    public int mo99870b(String str, String str2) {
        Object a;
        if (this.f70139a.containsKey(str) && (a = this.f70139a.get(str).mo99873a(str2)) != null && (a instanceof Integer)) {
            return ((Integer) a).intValue();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo99871c(String str, String str2) {
        Object a;
        if (this.f70139a.containsKey(str) && (a = this.f70139a.get(str).mo99873a(str2)) != null && (a instanceof Integer)) {
            return ((Integer) a).intValue();
        }
        return -2;
    }

    /* renamed from: d */
    public boolean mo99872d(String str, String str2) {
        Object a;
        if (this.f70139a.containsKey(str) && (a = this.f70139a.get(str).mo99873a(str2)) != null && (a instanceof Boolean)) {
            return ((Boolean) a).booleanValue();
        }
        return false;
    }
}
