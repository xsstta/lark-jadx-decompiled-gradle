package com.ss.android.lark.browser.impl.translate.jsb;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.impl.translate.AbstractC29952b;
import com.ss.android.lark.browser.impl.translate.C29945a;
import com.ss.android.lark.browser.impl.translate.jsb.C29954a;
import com.ss.android.lark.log.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.browser.impl.translate.jsb.a */
public class C29954a {

    /* renamed from: a */
    public static String f74737a;

    /* renamed from: b */
    public static String f74738b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.impl.translate.jsb.a$a */
    public static class C29956a implements IBrowserModuleDependency.AbstractC29886d.AbstractC29887a {

        /* renamed from: a */
        private List<String> f74740a;

        private C29956a() {
            this.f74740a = new ArrayList<String>() {
                /* class com.ss.android.lark.browser.impl.translate.jsb.C29954a.C29956a.C299571 */

                {
                    add("web-translate");
                }
            };
        }

        @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29886d.AbstractC29887a
        /* renamed from: a */
        public void mo107671a() {
            C29638a.m109622a().getGeckoDependency().mo107669a("c082f89962a36b39dadaf5b7b0c1c293", this.f74740a);
        }

        /* renamed from: b */
        public void mo107888b() {
            if (C29945a.m110725a().mo107846b()) {
                C29638a.m109622a().getGeckoDependency().mo107670a("c082f89962a36b39dadaf5b7b0c1c293", this.f74740a, this);
            }
        }

        /* renamed from: c */
        public static String m110774c() {
            String a = C29638a.m109622a().getGeckoDependency().mo107668a("c082f89962a36b39dadaf5b7b0c1c293", "web-translate");
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            return C29959c.m110781a(a + File.separator + "build.js");
        }
    }

    /* renamed from: a */
    public static void m110771a() {
        new C29956a().mo107888b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.impl.translate.jsb.a$b */
    public static class C29958b {

        /* renamed from: a */
        private Context f74741a;

        /* renamed from: a */
        public String mo107889a() {
            if (!TextUtils.isEmpty(C29954a.f74738b)) {
                return C29954a.f74738b;
            }
            String a = C29959c.m110779a(this.f74741a, "web_translate/web_translate_event_jsb.js");
            C29954a.f74738b = a;
            return a;
        }

        /* renamed from: b */
        public String mo107890b() {
            if (!TextUtils.isEmpty(C29954a.f74737a)) {
                return C29954a.f74737a;
            }
            String c = C29956a.m110774c();
            if (TextUtils.isEmpty(c)) {
                Log.m165389i("TranslateJSPlugin", "load from asset");
                c = C29959c.m110779a(this.f74741a, "web_translate/web_translate_plugin.js");
            }
            C29954a.f74737a = c;
            return c;
        }

        public C29958b(Context context) {
            this.f74741a = context;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.impl.translate.jsb.a$d */
    public static class C29960d implements AbstractC29952b {

        /* renamed from: a */
        private WeakReference<AbstractC29952b> f74742a;

        @Override // com.ss.android.lark.browser.impl.translate.AbstractC29952b
        /* renamed from: a */
        public /* synthetic */ void mo107580a(String str, String str2) {
            AbstractC29952b.CC.$default$a(this, str, str2);
        }

        @Override // com.ss.android.lark.browser.impl.translate.AbstractC29952b
        /* renamed from: a */
        public String mo107578a() {
            if (this.f74742a.get() != null) {
                return this.f74742a.get().mo107578a();
            }
            return null;
        }

        @Override // com.ss.android.lark.browser.impl.translate.AbstractC29952b
        /* renamed from: b */
        public Context mo107581b() {
            if (this.f74742a.get() != null) {
                return this.f74742a.get().mo107581b();
            }
            return null;
        }

        public C29960d(AbstractC29952b bVar) {
            this.f74742a = new WeakReference<>(bVar);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m110782b(String str) {
            if (this.f74742a.get() != null) {
                this.f74742a.get().mo107579a(str);
            }
        }

        @Override // com.ss.android.lark.browser.impl.translate.AbstractC29952b
        /* renamed from: a */
        public void mo107579a(String str) {
            if (this.f74742a.get() != null) {
                UICallbackExecutor.post(new Runnable(str) {
                    /* class com.ss.android.lark.browser.impl.translate.jsb.$$Lambda$a$d$2jVyAa5WNJdRYUVrCAG3FszWZE */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C29954a.C29960d.this.m110782b(this.f$1);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.impl.translate.jsb.a$c */
    public static class C29959c {
        /* renamed from: a */
        private static String m110780a(InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= -1) {
                    return byteArrayOutputStream.toString();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[SYNTHETIC, Splitter:B:19:0x0037] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x003f A[SYNTHETIC, Splitter:B:26:0x003f] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String m110781a(java.lang.String r5) {
            /*
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0019, all -> 0x0017 }
                r0.<init>(r5)     // Catch:{ Exception -> 0x0019, all -> 0x0017 }
                java.lang.String r5 = m110780a(r0)     // Catch:{ Exception -> 0x0015 }
                r0.close()     // Catch:{ Exception -> 0x0014 }
            L_0x0014:
                return r5
            L_0x0015:
                r5 = move-exception
                goto L_0x001b
            L_0x0017:
                r5 = move-exception
                goto L_0x003d
            L_0x0019:
                r5 = move-exception
                r0 = r1
            L_0x001b:
                java.lang.String r2 = "TranslateJSPlugin"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
                r3.<init>()     // Catch:{ all -> 0x003b }
                java.lang.String r4 = "errMsg="
                r3.append(r4)     // Catch:{ all -> 0x003b }
                java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x003b }
                r3.append(r5)     // Catch:{ all -> 0x003b }
                java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x003b }
                com.ss.android.lark.log.Log.m165383e(r2, r5)     // Catch:{ all -> 0x003b }
                if (r0 == 0) goto L_0x003a
                r0.close()     // Catch:{ Exception -> 0x003a }
            L_0x003a:
                return r1
            L_0x003b:
                r5 = move-exception
                r1 = r0
            L_0x003d:
                if (r1 == 0) goto L_0x0042
                r1.close()     // Catch:{ Exception -> 0x0042 }
            L_0x0042:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.browser.impl.translate.jsb.C29954a.C29959c.m110781a(java.lang.String):java.lang.String");
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0035 A[SYNTHETIC, Splitter:B:18:0x0035] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x003d A[SYNTHETIC, Splitter:B:25:0x003d] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String m110779a(android.content.Context r4, java.lang.String r5) {
            /*
                r0 = 0
                android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
                java.io.InputStream r4 = r4.open(r5)     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
                java.lang.String r5 = m110780a(r4)     // Catch:{ Exception -> 0x0013 }
                if (r4 == 0) goto L_0x0012
                r4.close()     // Catch:{ Exception -> 0x0012 }
            L_0x0012:
                return r5
            L_0x0013:
                r5 = move-exception
                goto L_0x0019
            L_0x0015:
                r5 = move-exception
                goto L_0x003b
            L_0x0017:
                r5 = move-exception
                r4 = r0
            L_0x0019:
                java.lang.String r1 = "TranslateJSPlugin"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
                r2.<init>()     // Catch:{ all -> 0x0039 }
                java.lang.String r3 = "errMsg="
                r2.append(r3)     // Catch:{ all -> 0x0039 }
                java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0039 }
                r2.append(r5)     // Catch:{ all -> 0x0039 }
                java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0039 }
                com.ss.android.lark.log.Log.m165383e(r1, r5)     // Catch:{ all -> 0x0039 }
                if (r4 == 0) goto L_0x0038
                r4.close()     // Catch:{ Exception -> 0x0038 }
            L_0x0038:
                return r0
            L_0x0039:
                r5 = move-exception
                r0 = r4
            L_0x003b:
                if (r0 == 0) goto L_0x0040
                r0.close()     // Catch:{ Exception -> 0x0040 }
            L_0x0040:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.browser.impl.translate.jsb.C29954a.C29959c.m110779a(android.content.Context, java.lang.String):java.lang.String");
        }
    }

    /* renamed from: a */
    public static void m110772a(AbstractC29952b bVar) {
        final C29960d dVar = new C29960d(bVar);
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.browser.impl.translate.jsb.C29954a.RunnableC299551 */

            public void run() {
                C29954a.m110773b(dVar);
            }
        });
    }

    /* renamed from: b */
    public static boolean m110773b(AbstractC29952b bVar) {
        C29958b bVar2 = new C29958b(bVar.mo107581b());
        String a = bVar2.mo107889a();
        if (TextUtils.isEmpty(a)) {
            Log.m165383e("TranslateJSPlugin", "load event jsb code error, str is null");
            return false;
        }
        bVar.mo107579a("javascript:" + a);
        String b = bVar2.mo107890b();
        if (TextUtils.isEmpty(b)) {
            Log.m165383e("TranslateJSPlugin", "load plugin code error, str is null");
            return false;
        }
        bVar.mo107579a("javascript:" + b);
        Log.m165389i("TranslateJSPlugin", "load plugin code finished");
        return true;
    }

    /* renamed from: a */
    public static String m110770a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("func", str);
            jSONObject.put("param", new JSONObject(str2));
        } catch (JSONException e) {
            Log.m165382e(e.getMessage());
        }
        return String.format("javascript:LKWebTranslateJSB._dispatchEventFromNative(%s)", jSONObject.toString());
    }
}
