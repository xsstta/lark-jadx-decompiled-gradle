package com.bytedance.ee.bear.document.offline;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.document.bridgestatus.BridgeReadyModel;
import com.bytedance.ee.bear.document.offline.base.OfflineResultModel;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.bytedance.ee.bear.document.offline.a */
public class C5890a {

    /* renamed from: a */
    private static Map<String, Set<String>> f16482a = new HashMap();

    /* renamed from: b */
    private static Map<String, JSONObject> f16483b = new HashMap();

    /* renamed from: c */
    private static String f16484c;

    /* renamed from: d */
    private static int f16485d = C8275a.f22369b.mo32555b();

    /* renamed from: e */
    private static String f16486e = C8275a.f22369b.mo32553a();

    /* renamed from: f */
    private static String f16487f = C8275a.f22369b.mo32553a();

    /* renamed from: a */
    public static String m23693a() {
        return f16486e;
    }

    /* renamed from: b */
    public static String m23707b() {
        return f16484c;
    }

    /* renamed from: c */
    public static int m23710c() {
        return f16485d;
    }

    /* renamed from: d */
    public static String m23712d() {
        return f16487f;
    }

    /* renamed from: a */
    public static void m23705a(String str, AbstractC7947h hVar) {
        C13479a.m54772d("OfflineUtils", "onJsSuccessCallback()...");
        m23697a(new OfflineResultModel(true, "", str), hVar);
    }

    /* renamed from: a */
    public static void m23706a(String str, String str2, AbstractC7947h hVar) {
        C13479a.m54772d("OfflineUtils", "onJsFailCallback()... errorMsg = " + str);
        m23697a(new OfflineResultModel(false, str, str2), hVar);
    }

    /* renamed from: a */
    public static void m23704a(String str, JSONObject jSONObject) {
        f16483b.put(str, jSONObject);
    }

    /* renamed from: e */
    public static void m23715e() {
        f16483b.clear();
    }

    /* renamed from: a */
    public static void m23695a(int i) {
        f16487f = C8275a.m34050a(i);
    }

    /* renamed from: d */
    public static Set<String> m23713d(String str) {
        return f16482a.get(str);
    }

    /* renamed from: e */
    public static JSONObject m23714e(String str) {
        return f16483b.get(str);
    }

    /* renamed from: a */
    public static void m23698a(BearUrl bearUrl) {
        if (bearUrl == null || TextUtils.isEmpty(bearUrl.f17446a)) {
            f16485d = C8275a.f22369b.mo32555b();
            f16486e = C8275a.f22369b.mo32553a();
            f16484c = null;
            f16487f = C8275a.f22369b.mo32553a();
            return;
        }
        f16485d = C8275a.m34051b(bearUrl.f17446a);
        f16486e = bearUrl.f17446a;
        m23703a(bearUrl.f17447b);
    }

    /* renamed from: b */
    public static org.json.JSONObject m23708b(String str) {
        try {
            return new org.json.JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).optJSONObject("collab_client_vars").optJSONObject("resources");
        } catch (Exception e) {
            C13479a.m54758a("OfflineUtils", "getResourcesByClientVar()... e = " + e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m23694a(InputStream inputStream) {
        Throwable th;
        BufferedReader bufferedReader;
        IOException e;
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader2 = null;
        if (inputStream != null) {
            try {
                if (inputStream.available() > 0) {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            stringBuffer.append(readLine + System.getProperty("line.separator"));
                        } catch (IOException e2) {
                            e = e2;
                            try {
                                C13479a.m54761a("OfflineUtils", e);
                                m23701a((Closeable) inputStream);
                                m23701a(bufferedReader);
                                return stringBuffer.toString();
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader;
                                m23701a((Closeable) inputStream);
                                m23701a(bufferedReader2);
                                throw th;
                            }
                        }
                    }
                    m23701a((Closeable) inputStream);
                    m23701a(bufferedReader);
                    return stringBuffer.toString();
                }
            } catch (IOException e3) {
                bufferedReader = null;
                e = e3;
                C13479a.m54761a("OfflineUtils", e);
                m23701a((Closeable) inputStream);
                m23701a(bufferedReader);
                return stringBuffer.toString();
            } catch (Throwable th3) {
                th = th3;
                m23701a((Closeable) inputStream);
                m23701a(bufferedReader2);
                throw th;
            }
        }
        C13479a.m54758a("OfflineUtils", "convertString()... steam is invalid");
        String stringBuffer2 = stringBuffer.toString();
        m23701a((Closeable) inputStream);
        m23701a((Closeable) null);
        return stringBuffer2;
    }

    /* renamed from: b */
    public static boolean m23709b(BearUrl bearUrl) {
        if (bearUrl == null || ((!TextUtils.equals(bearUrl.f17446a, C8275a.f22371d.mo32553a()) && !TextUtils.equals(bearUrl.f17446a, C8275a.f22378k.mo32553a())) || (!TextUtils.equals("tab_create", bearUrl.f17453h) && !TextUtils.equals("lark_create", bearUrl.f17453h) && !TextUtils.equals("web_create", bearUrl.f17453h)))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m23711c(String str) {
        String path = Uri.parse(str).getPath();
        if (path != null) {
            if (path.endsWith(".css")) {
                return "text/css";
            }
            if (path.endsWith(".js")) {
                return "application/x-javascript";
            }
            if (path.endsWith(".jpg") || path.endsWith(".gif") || path.endsWith(".png") || path.endsWith(".jpeg") || path.endsWith(".webp") || path.endsWith(".bmp")) {
                return "image/*";
            }
        }
        return "text/html";
    }

    /* renamed from: a */
    public static void m23696a(BridgeReadyModel bridgeReadyModel) {
        if (bridgeReadyModel.getData() != null) {
            try {
                JSONArray optJSONArray = new org.json.JSONObject(bridgeReadyModel.getData()).optJSONArray("prefetchKeys");
                HashSet hashSet = new HashSet();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    if (optJSONArray.getString(i) != null) {
                        hashSet.add(optJSONArray.getString(i));
                    }
                }
                if (hashSet.size() > 0) {
                    f16482a.put(bridgeReadyModel.getType(), hashSet);
                }
            } catch (JSONException e) {
                C13479a.m54761a("OfflineUtils", e);
            }
        }
    }

    /* renamed from: a */
    public static void m23701a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                C13479a.m54761a("OfflineUtils", e);
            }
        }
    }

    /* renamed from: a */
    public static void m23703a(String str) {
        f16484c = str;
    }

    /* renamed from: a */
    public static void m23697a(OfflineResultModel offlineResultModel, AbstractC7947h hVar) {
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48481e()).mo238001b(new Consumer(offlineResultModel) {
            /* class com.bytedance.ee.bear.document.offline.$$Lambda$a$HRYPbA7e17x3yI1g_z7Jiv4Yfyg */
            public final /* synthetic */ OfflineResultModel f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5890a.m23699a(AbstractC7947h.this, this.f$1, (String) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.document.offline.$$Lambda$a$w2ceLutohMsmzyWLTSruGmSao */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5890a.m23700a(AbstractC7947h.this, (Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23700a(AbstractC7947h hVar, Throwable th) throws Exception {
        C13479a.m54759a("OfflineUtils", "onJsCallback fail", th);
        hVar.mo17190a(new OfflineResultModel(true, "", "").toString());
    }

    /* renamed from: a */
    public static void m23702a(InputStream inputStream, File file) throws IOException {
        byte[] bArr = new byte[1024];
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                fileOutputStream.write(bArr, 0, read);
                fileOutputStream.flush();
            } else {
                fileOutputStream.close();
                inputStream.close();
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23699a(AbstractC7947h hVar, OfflineResultModel offlineResultModel, String str) throws Exception {
        hVar.mo17190a(offlineResultModel.toString());
    }
}
