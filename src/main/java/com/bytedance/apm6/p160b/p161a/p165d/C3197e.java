package com.bytedance.apm6.p160b.p161a.p165d;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p160b.p161a.AbstractC3210g;
import com.bytedance.apm6.p160b.p161a.C3159a;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.p187i.p189b.AbstractC3335a;
import com.bytedance.apm6.p187i.p190c.C3337a;
import com.bytedance.apm6.util.C3354d;
import com.bytedance.apm6.util.C3355e;
import com.bytedance.apm6.util.C3356f;
import com.bytedance.apm6.util.C3361k;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.services.apm.api.AbstractC20699d;
import com.bytedance.services.apm.api.C20697b;
import com.google.firebase.messaging.Constants;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.b.a.d.e */
public class C3197e {

    /* renamed from: f */
    private static HashMap<AbstractC3198f, C3197e> f10239f = new HashMap<>();

    /* renamed from: a */
    private String f10240a;

    /* renamed from: b */
    private volatile boolean f10241b;

    /* renamed from: c */
    private int f10242c;

    /* renamed from: d */
    private String f10243d;

    /* renamed from: e */
    private Boolean f10244e;

    /* renamed from: g */
    private List<String> f10245g;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo13273a(byte[] bArr) {
        boolean z;
        boolean z2;
        int i;
        if (bArr == null || bArr.length == 0) {
            return true;
        }
        try {
            String a = m13361a();
            C3337a a2 = m13360a(a, bArr);
            if (C3318a.m13915u()) {
                C3350b.m13932a(C3159a.f10110a, "sendLog createRequest: origin Bytes=" + bArr.length + " compressed Bytes=" + a2.f10631c.length + " url=" + a2.f10629a + " headers=" + a2.f10630b + " body:" + new JSONObject(new String(bArr)).toString());
            }
            C20697b a3 = C3318a.m13818a(a2.f10629a, a2.f10630b, a2.f10631c);
            if (C3318a.m13915u()) {
                String str = C3159a.f10110a;
                StringBuilder sb = new StringBuilder();
                sb.append("http result:");
                if (a3 == null) {
                    i = -1;
                } else {
                    i = a3.mo69900a() + " header:" + a3.mo69902c();
                }
                sb.append(i);
                C3350b.m13932a(str, sb.toString());
            }
            this.f10240a = null;
            this.f10243d = null;
            if (a3 != null) {
                if (a3.mo69900a() > 0) {
                    this.f10241b = false;
                    if (500 > a3.mo69900a() || a3.mo69900a() > 600) {
                        JSONObject a4 = m13364a(a3);
                        if (a4 != null) {
                            if (a3.mo69900a() == 200) {
                                String optString = a4.optString("message");
                                String optString2 = a4.optString("redirect");
                                long optLong = a4.optLong("delay");
                                if ("success".equals(optString)) {
                                    C3190c.m13326a().mo13258d();
                                    this.f10243d = a;
                                    this.f10244e = false;
                                    z2 = false;
                                    z = true;
                                } else {
                                    this.f10244e = true;
                                    z2 = "drop data".equals(optString);
                                    if (C3318a.m13915u()) {
                                        C3350b.m13932a(C3159a.f10110a, "responseMessage:" + optString);
                                    }
                                    z = false;
                                }
                                this.f10240a = optString2;
                                if (optLong > 0) {
                                    C3190c.m13326a().mo13251a(optLong);
                                }
                                if (z2) {
                                    C3190c.m13326a().mo13260f();
                                    if (a3.mo69902c() != null) {
                                        C3187b.m13320a().mo13247a(a3.mo69902c().get("x-tt-logid"));
                                    }
                                    C3187b.m13320a().mo13245a(System.currentTimeMillis());
                                } else {
                                    C3190c.m13326a().mo13261g();
                                }
                                return z;
                            }
                        }
                        this.f10244e = true;
                        return false;
                    }
                    Boolean bool = this.f10244e;
                    if (bool != null && bool.booleanValue()) {
                        C3190c.m13326a().mo13254b();
                    }
                    this.f10244e = true;
                    return false;
                }
            }
            this.f10241b = true;
            Boolean bool2 = this.f10244e;
            if (bool2 != null && bool2.booleanValue()) {
                C3190c.m13326a().mo13256c();
            }
            this.f10244e = true;
            return false;
        } catch (Throwable th) {
            C3350b.m13935b(C3159a.f10110a, "sendLog failed.", th);
            return false;
        }
    }

    /* renamed from: a */
    private String m13361a() {
        List<String> list = this.f10245g;
        if (!TextUtils.isEmpty(this.f10240a)) {
            if (list != null && list.size() > 0) {
                try {
                    URL url = new URL(list.get(0));
                    return "https://" + this.f10240a + url.getPath();
                } catch (Throwable unused) {
                }
            }
            return null;
        } else if (!TextUtils.isEmpty(this.f10243d)) {
            return this.f10243d;
        } else {
            if (this.f10241b) {
                this.f10242c++;
            }
            int size = list.size();
            int i = this.f10242c;
            if (size > i && i >= 0) {
                return list.get(i);
            }
            this.f10242c = 0;
            return list.get(0);
        }
    }

    private C3197e(AbstractC3198f fVar) {
        this.f10245g = fVar.mo13276b();
    }

    /* renamed from: c */
    private byte[] m13367c(byte[] bArr) {
        AbstractC20699d dVar = (AbstractC20699d) C3336c.m13901a(AbstractC20699d.class);
        if (dVar != null) {
            return dVar.mo12470a(bArr);
        }
        return null;
    }

    /* renamed from: a */
    public static C3197e m13359a(AbstractC3198f fVar) {
        if (f10239f.containsKey(fVar)) {
            return f10239f.get(fVar);
        }
        f10239f.put(fVar, new C3197e(fVar));
        return f10239f.get(fVar);
    }

    /* renamed from: b */
    private byte[] m13366b(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                C3354d.m13949a(gZIPOutputStream);
                return byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                C3354d.m13949a(gZIPOutputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream2 = gZIPOutputStream;
                C3354d.m13949a(gZIPOutputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            gZIPOutputStream = null;
            C3354d.m13949a(gZIPOutputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C3354d.m13949a(gZIPOutputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    private JSONObject m13364a(C20697b bVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject(new String(bVar.mo69901b()));
            Map<String, String> c = bVar.mo69902c();
            if (c == null || c.isEmpty()) {
                str = null;
            } else {
                str = c.get("ran");
            }
            boolean z = true;
            try {
                String optString = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (!optString.isEmpty()) {
                    if (!TextUtils.isEmpty(str)) {
                        String a = m13363a(optString.getBytes(), str);
                        jSONObject = new JSONObject(a);
                        z = true ^ TextUtils.isEmpty(a);
                    } else {
                        jSONObject = new JSONObject(new String(optString.getBytes()));
                    }
                }
                m13365a(jSONObject);
                if (z) {
                    return jSONObject;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                return jSONObject2;
            } catch (Throwable unused) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("message", "success");
                return jSONObject3;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private void m13365a(JSONObject jSONObject) {
        AbstractC3210g gVar;
        if (!C3355e.m13956a(jSONObject)) {
            JSONObject optJSONObject = jSONObject.optJSONObject("configs");
            if (!C3355e.m13956a(optJSONObject) && (gVar = (AbstractC3210g) C3336c.m13901a(AbstractC3210g.class)) != null) {
                gVar.mo13090a(optJSONObject);
            }
        }
    }

    /* renamed from: a */
    private String m13362a(String str, List<Pair<String, String>> list) {
        AbstractC3335a aVar = (AbstractC3335a) C3336c.m13901a(AbstractC3335a.class);
        if (aVar != null) {
            return aVar.mo13089a(str, list);
        }
        return null;
    }

    /* renamed from: a */
    private C3337a m13360a(String str, byte[] bArr) {
        byte[] bArr2;
        String str2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap(C3318a.m13842t());
        hashMap.put("Accept-Encoding", "gzip");
        if (bArr.length > 128) {
            bArr2 = m13366b(bArr);
            if (bArr2 != null) {
                hashMap.put("Content-Encoding", "gzip");
            }
        } else {
            bArr2 = null;
        }
        if (bArr2 == null) {
            bArr2 = bArr;
        }
        hashMap.put("Content-Type", "application/json; charset=utf-8");
        if (C3190c.m13326a().mo13266l()) {
            bArr2 = m13367c(bArr2);
            if (bArr2 != null) {
                hashMap2.put("tt_data", AbstractC60044a.f149675a);
                str2 = C3361k.m13995a(str, hashMap2);
                hashMap.put("Content-Type", "application/octet-stream;tt-data=a");
                if (C3318a.m13915u()) {
                    String str3 = C3159a.f10110a;
                    C3350b.m13932a(str3, "before encrypt url:" + str2);
                }
                LinkedList linkedList = new LinkedList();
                String a = m13362a(str2, linkedList);
                if (!TextUtils.isEmpty(a)) {
                    str2 = a;
                }
                if (C3318a.m13915u()) {
                    String str4 = C3159a.f10110a;
                    C3350b.m13932a(str4, "after encrypt url:" + str2);
                }
                hashMap.putAll(C3356f.m13966b(linkedList));
            } else {
                str2 = C3361k.m13995a(str, hashMap2);
            }
        } else {
            str2 = C3361k.m13995a(str, hashMap2);
        }
        hashMap.put("Version-Code", "1");
        if (bArr2 != null) {
            bArr = bArr2;
        }
        return new C3337a(str2, hashMap, bArr);
    }

    /* renamed from: a */
    private String m13363a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
            instance.init(2, secretKeySpec);
            String str2 = new String(instance.doFinal(Base64.decode(bArr, 0)));
            int indexOf = str2.indexOf("$");
            if (indexOf != -1) {
                return str2.substring(0, indexOf);
            }
            return str2;
        } catch (Throwable th) {
            if (C3318a.m13915u()) {
                C3350b.m13935b(C3159a.f10110a, "decodeData", th);
            }
            return "";
        }
    }
}
