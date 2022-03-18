package com.ss.android.lark.applink;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.applink.p1366a.C29181a;
import com.ss.android.lark.applink.p1366a.C29185b;
import com.ss.android.lark.applink.utils.C29196a;
import com.ss.android.lark.applink.utils.C29197b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.sdk.SdkSender;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.applink.c */
public class C29187c implements AbstractC29180a {

    /* renamed from: c */
    private static long f73044c = 500;

    /* renamed from: d */
    private static volatile C29187c f73045d;

    /* renamed from: a */
    private String f73046a = "^[A-Za-z0-9]+$";

    /* renamed from: b */
    private String f73047b;

    /* renamed from: e */
    private Map<String, AbstractC29186b> f73048e = new HashMap();

    /* renamed from: f */
    private AppLink f73049f;

    /* renamed from: g */
    private AbstractC29180a f73050g;

    /* renamed from: h */
    private String f73051h;

    /* renamed from: a */
    private boolean m107305a(int i) {
        return i == 1;
    }

    /* renamed from: a */
    public void mo103465a(Context context, AbstractC29180a aVar) {
        this.f73050g = aVar;
        this.f73051h = m107301a(context);
    }

    /* renamed from: a */
    public boolean mo103470a(Uri uri) {
        String scheme = uri.getScheme();
        if (!C29196a.m107349a(scheme)) {
            mo103453b("AppLinkInstance", "not app-link schema:" + scheme);
            return false;
        }
        String host = uri.getHost();
        if (host == null) {
            mo103453b("AppLinkInstance", "link host is null");
            return false;
        }
        List<String> a = AppLinkSetting.m107338a();
        if (a == null || a.isEmpty()) {
            mo103455d("AppLinkInstance", "setting host list is null");
            if (!host.startsWith("applink.")) {
                return false;
            }
        } else if (!a.contains(host)) {
            mo103453b("AppLinkInstance", "not app-link host:" + host);
            return false;
        }
        if (!C29193e.m107342a(uri)) {
            return true;
        }
        mo103453b("AppLinkInstance", "not app-link for support");
        return false;
    }

    /* renamed from: a */
    public synchronized boolean mo103469a(Context context, String str, int i) {
        C29192a a;
        a = m107298a(context, str, i, true);
        m107304a(a.f73065a, str, i, a.f73066b);
        return a.f73065a;
    }

    /* renamed from: a */
    public synchronized boolean mo103468a(Context context, Uri uri) {
        if (uri == null) {
            m107304a(false, (String) null, 1, (String) null);
            return false;
        }
        return m107299a(context, uri.toString(), 1, true, true).f73065a;
    }

    /* renamed from: a */
    public synchronized void mo103466a(Map<String, AbstractC29186b> map) {
        this.f73048e = map;
        for (Map.Entry<String, AbstractC29186b> entry : map.entrySet()) {
            if (m107306a(entry.getKey(), entry.getValue())) {
                break;
            }
        }
    }

    @Override // com.ss.android.lark.applink.AbstractC29180a
    /* renamed from: a */
    public void mo103450a(String str, JSONObject jSONObject) {
        AbstractC29180a aVar = this.f73050g;
        if (aVar != null) {
            aVar.mo103450a(str, jSONObject);
        }
    }

    @Override // com.ss.android.lark.applink.AbstractC29180a
    /* renamed from: a */
    public void mo103451a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        AbstractC29180a aVar = this.f73050g;
        if (aVar != null) {
            aVar.mo103451a(str, jSONObject, jSONObject2, jSONObject3);
        }
    }

    @Override // com.ss.android.lark.applink.AbstractC29180a
    /* renamed from: a */
    public void mo103449a(String str, String str2) {
        AbstractC29180a aVar = this.f73050g;
        if (aVar != null) {
            aVar.mo103449a(str, str2);
        }
    }

    @Override // com.ss.android.lark.applink.AbstractC29180a
    /* renamed from: a */
    public void mo103447a(Context context, String str) {
        AbstractC29180a aVar = this.f73050g;
        if (aVar != null) {
            aVar.mo103447a(context, str);
        }
    }

    @Override // com.ss.android.lark.applink.AbstractC29180a
    /* renamed from: a */
    public boolean mo103452a(String str) {
        AbstractC29180a aVar = this.f73050g;
        if (aVar != null) {
            return aVar.mo103452a(str);
        }
        return false;
    }

    @Override // com.ss.android.lark.applink.AbstractC29180a
    /* renamed from: a */
    public void mo103448a(Context context, String str, AppLink appLink) {
        AbstractC29180a aVar = this.f73050g;
        if (aVar != null) {
            aVar.mo103448a(context, str, appLink);
        }
    }

    /* renamed from: a */
    public void mo103467a(boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", z ? "1" : "0");
            jSONObject.put("applink_short_to_long", str);
        } catch (Exception unused) {
        }
        mo103450a("applink_short_to_long", jSONObject);
    }

    private C29187c() {
    }

    /* renamed from: b */
    public static Map<String, Boolean> m107308b() {
        return C29196a.m107348a();
    }

    /* renamed from: a */
    public static C29187c m107300a() {
        if (f73045d == null) {
            synchronized (C29187c.class) {
                if (f73045d == null) {
                    f73045d = new C29187c();
                }
            }
        }
        return f73045d;
    }

    /* renamed from: a */
    public void mo103463a(long j) {
        f73044c = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.applink.c$a */
    public static final class C29192a {

        /* renamed from: a */
        public boolean f73065a;

        /* renamed from: b */
        public String f73066b;

        private C29192a(boolean z) {
            this.f73065a = z;
        }

        private C29192a(boolean z, String str) {
            this.f73065a = z;
            this.f73066b = str;
        }
    }

    /* renamed from: b */
    private String m107307b(int i) {
        return AppLinkSource.f73032a[i];
    }

    /* renamed from: a */
    private String m107301a(Context context) {
        String str;
        Exception e;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str != null) {
                try {
                    if (str.length() <= 0) {
                        return "";
                    }
                    return str;
                } catch (Exception e2) {
                    e = e2;
                    mo103455d("AppLinkInstance", e.toString());
                    return str;
                }
            }
            return "";
        } catch (Exception e3) {
            e = e3;
            str = "";
            mo103455d("AppLinkInstance", e.toString());
            return str;
        }
    }

    /* renamed from: b */
    public void mo103473b(String str) {
        mo103449a("AppLinkInstance", "host = " + str);
        this.f73047b = str;
    }

    /* renamed from: c */
    public synchronized boolean mo103478c(Uri uri) {
        if (uri == null) {
            return true;
        }
        AbstractC29186b bVar = this.f73048e.get(uri.getPath());
        AppLink appLink = new AppLink(uri.toString(), 1);
        if (bVar == null) {
            return true;
        }
        return bVar.mo103461a(appLink);
    }

    /* renamed from: b */
    public boolean mo103476b(Uri uri) {
        AbstractC29186b bVar;
        if (uri == null || (bVar = this.f73048e.get(uri.getPath())) == null) {
            return false;
        }
        return bVar.mo103482a();
    }

    @Override // com.ss.android.lark.applink.AbstractC29180a
    /* renamed from: c */
    public void mo103454c(String str, String str2) {
        AbstractC29180a aVar = this.f73050g;
        if (aVar != null) {
            aVar.mo103454c(str, str2);
        }
    }

    @Override // com.ss.android.lark.applink.AbstractC29180a
    /* renamed from: d */
    public void mo103455d(String str, String str2) {
        AbstractC29180a aVar = this.f73050g;
        if (aVar != null) {
            aVar.mo103455d(str, str2);
        }
    }

    /* renamed from: a */
    private String m107302a(String str, int i) {
        String str2;
        if (!TextUtils.isEmpty(this.f73047b)) {
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("https");
            builder.authority(this.f73047b);
            builder.path("/open-apis/applink/longlink/v1/get");
            builder.appendQueryParameter("shortLink", str);
            builder.appendQueryParameter("businessTag", "shortApplink");
            str2 = builder.toString();
        } else {
            str2 = "";
        }
        mo103449a("AppLinkInstance", "constructUrl = " + str2);
        return str2;
    }

    @Override // com.ss.android.lark.applink.AbstractC29180a
    /* renamed from: b */
    public void mo103453b(String str, String str2) {
        AbstractC29180a aVar = this.f73050g;
        if (aVar != null) {
            aVar.mo103453b(str, str2);
        }
    }

    /* renamed from: b */
    public synchronized boolean mo103474b(Context context, Uri uri) {
        if (uri == null) {
            m107304a(false, (String) null, 1, (String) null);
            return false;
        }
        C29192a a = m107298a(context, uri.toString(), 1, true);
        m107304a(a.f73065a, uri.toString(), 1, a.f73066b);
        return a.f73065a;
    }

    /* renamed from: b */
    public boolean mo103475b(Context context, String str) {
        boolean z = false;
        if (mo103452a("lark.applink.shortlink") && !TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (mo103470a(parse)) {
                try {
                    String path = parse.getPath();
                    if (path.length() > 1) {
                        String replaceFirst = path.replaceFirst("/", "");
                        if (replaceFirst.endsWith("/")) {
                            replaceFirst = replaceFirst.substring(0, replaceFirst.length() - 1);
                        }
                        z = Pattern.matches(this.f73046a, replaceFirst);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    mo103454c("AppLinkInstance", "shortLink error " + e);
                }
            }
        }
        mo103454c("AppLinkInstance", "isShortLink = " + z);
        return z;
    }

    /* renamed from: a */
    private synchronized boolean m107306a(String str, AbstractC29186b bVar) {
        AppLink appLink = this.f73049f;
        if (appLink == null || !TextUtils.equals(str, appLink.mo103437c())) {
            return false;
        }
        bVar.mo103483c(null, this.f73049f);
        this.f73049f = null;
        return true;
    }

    /* renamed from: b */
    public synchronized void mo103471b(Context context, String str, int i) {
        if (mo103475b(context, str)) {
            m107309d(context, str, i);
        } else {
            mo103477c(context, str, i);
        }
    }

    /* renamed from: b */
    public void mo103472b(Context context, String str, AppLink appLink) {
        AbstractC29186b bVar = this.f73048e.get(str);
        if (bVar == null) {
            mo103455d("AppLinkInstance", "handler is null");
        } else {
            bVar.mo103483c(context, appLink);
        }
    }

    /* renamed from: c */
    public synchronized void mo103477c(Context context, String str, int i) {
        if (m107298a(context, str, i, false).f73065a) {
            String path = Uri.parse(str).getPath();
            AbstractC29186b bVar = this.f73048e.get(path);
            AppLink appLink = new AppLink(str, i);
            if (bVar != null) {
                if (!bVar.mo103462b(context, appLink) || C29197b.m107351a(context)) {
                    bVar.mo103483c(context, appLink);
                } else {
                    this.f73050g.mo103448a(context, path, appLink);
                }
            }
        }
    }

    /* renamed from: d */
    private void m107309d(final Context context, final String str, final int i) {
        final SendHttpRequest.C15253a a = new SendHttpRequest.C15253a().mo55528a(m107302a(str, i)).mo55526a(SendHttpRequest.Method.GET);
        mo103449a("AppLinkInstance", "begin request");
        final long currentTimeMillis = System.currentTimeMillis();
        Observable.create(new ObservableOnSubscribe<String>() {
            /* class com.ss.android.lark.applink.C29187c.C291903 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<String> observableEmitter) throws Exception {
                SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.SEND_HTTP, a, new SdkSender.IParser<String>() {
                    /* class com.ss.android.lark.applink.C29187c.C291903.C291911 */

                    /* renamed from: a */
                    public String parse(byte[] bArr) throws IOException {
                        SendHttpResponse decode = SendHttpResponse.ADAPTER.decode(bArr);
                        String str = decode.json_body;
                        C29187c cVar = C29187c.this;
                        cVar.mo103449a("AppLinkInstance", "body = " + str);
                        return decode.json_body;
                    }
                });
                if (syncSendMayError.f131573b != null) {
                    observableEmitter.onError(syncSendMayError.f131573b);
                } else {
                    observableEmitter.onNext(syncSendMayError.f131572a);
                }
                observableEmitter.onComplete();
            }
        }).timeout(f73044c, TimeUnit.MILLISECONDS).subscribeOn(C68279a.m265023b()).subscribe(new Consumer<String>() {
            /* class com.ss.android.lark.applink.C29187c.C291881 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                C29187c cVar = C29187c.this;
                cVar.mo103449a("AppLinkInstance", "onSuccess = " + str);
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int optInt = jSONObject.optInt("code", -1);
                        if (optInt != 0) {
                            C29181a.m107290a(C29185b.f73038c).mo103459a(str, System.currentTimeMillis() - currentTimeMillis, i).setErrorCode(String.valueOf(optInt)).setErrorMessage("run in exception case ").flush();
                            C29187c cVar2 = C29187c.this;
                            cVar2.mo103454c("AppLinkInstance", "run in exception case " + optInt);
                            C29187c.this.mo103477c(context, str, i);
                        } else {
                            String optString = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).optString("link", "");
                            if (!TextUtils.isEmpty(optString)) {
                                C29187c.this.mo103477c(context, optString, i);
                            }
                        }
                        C29187c.this.mo103467a(true, str);
                    } catch (Exception unused) {
                    }
                } else {
                    C29181a.m107290a(C29185b.f73038c).mo103459a(str, System.currentTimeMillis() - currentTimeMillis, i).setErrorMessage("response is empty").flush();
                    C29187c.this.mo103477c(context, str, i);
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.applink.C29187c.C291892 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C29187c cVar = C29187c.this;
                cVar.mo103454c("AppLinkInstance", "onError = " + th);
                if (th.getCause() instanceof TimeoutException) {
                    C29181a.m107290a(C29185b.f73037b).mo103459a(str, System.currentTimeMillis() - currentTimeMillis, i).setError(th).flush();
                    C29187c.this.mo103467a(false, str);
                } else {
                    C29181a.m107290a(C29185b.f73038c).mo103459a(str, System.currentTimeMillis() - currentTimeMillis, i).setError(th).flush();
                }
                C29187c.this.mo103477c(context, str, i);
            }
        });
    }

    /* renamed from: a */
    private JSONObject m107303a(String str, int i, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        JSONObject jSONObject = new JSONObject();
        String b = m107307b(i);
        String str7 = null;
        if (str != null) {
            Uri parse = Uri.parse(str);
            str7 = parse.getScheme();
            str6 = parse.getHost();
            str5 = parse.getPath();
            str4 = parse.getQueryParameter("appId");
            str3 = parse.getQueryParameter("op_tracking");
        } else {
            str3 = null;
            str6 = null;
            str5 = null;
            str4 = null;
        }
        try {
            jSONObject.put("scheme", str7);
            jSONObject.put("host", str6);
            jSONObject.put("path", str5);
            jSONObject.put("from", b);
            jSONObject.put(ShareHitPoint.f121869d, str2);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("appId", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("op_tracking", str3);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public synchronized void mo103464a(Context context, Uri uri, boolean z) {
        if (uri == null) {
            C29181a.m107290a(C29185b.f73036a).flush();
        } else if (mo103475b(context, uri.toString())) {
            m107309d(context, uri.toString(), 1);
            mo103454c("AppLinkInstance", "openExternal is shortLink");
        } else if (m107298a(context, uri.toString(), 1, false).f73065a) {
            mo103471b(context, uri.toString(), 1);
        }
    }

    /* renamed from: a */
    private synchronized C29192a m107298a(Context context, String str, int i, boolean z) {
        return m107299a(context, str, i, z, false);
    }

    /* renamed from: a */
    private void m107304a(boolean z, String str, int i, String str2) {
        if (str == null || !mo103470a(Uri.parse(str))) {
            return;
        }
        if (!z || str2 != null) {
            mo103450a("applink_invalid_click", m107303a(str, i, str2));
        } else {
            mo103450a("applink_click", m107303a(str, i, str2));
        }
    }

    /* renamed from: a */
    private synchronized C29192a m107299a(Context context, String str, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (str == null) {
            return new C29192a(false);
        }
        Uri parse = Uri.parse(str);
        if (!mo103470a(parse)) {
            return new C29192a(false);
        }
        boolean a = C29193e.m107343a(parse, this.f73051h);
        String queryParameter = parse.getQueryParameter("op_tracking");
        if (a) {
            String path = parse.getPath();
            if (!C29195g.m107347a(this, str, path)) {
                mo103453b("AppLinkInstance", "check path error:" + str);
                if (z2) {
                    return new C29192a(false);
                } else if (!z) {
                    C29181a.m107290a(C29185b.f73040e).mo103458a(str, i, false, queryParameter).flush();
                    C29193e.m107340a(context, parse, this.f73051h);
                    return new C29192a(false);
                } else if (C29193e.m107341a()) {
                    return new C29192a(true, "noInWhiteList");
                } else {
                    return new C29192a(false);
                }
            } else {
                AbstractC29186b bVar = this.f73048e.get(path);
                AppLink appLink = new AppLink(str, i);
                if (bVar != null) {
                    boolean d = bVar.mo103484d(context, appLink);
                    if (!d) {
                        if (z2) {
                            return new C29192a(false);
                        }
                        C29181a.m107290a(C29185b.f73041f).mo103457a(str, i, z).flush();
                    } else if (z2) {
                        if (!bVar.mo103460a(context, appLink)) {
                            z3 = true;
                        }
                        return new C29192a(z3);
                    }
                    mo103453b("AppLinkInstance", "canOpen result:" + d);
                    return new C29192a(d);
                } else if (m107305a(i)) {
                    if (z2) {
                        return new C29192a(false);
                    }
                    this.f73049f = appLink;
                    appLink.mo103438d();
                    return new C29192a(false);
                } else if (!z) {
                    C29193e.m107340a(context, parse, this.f73051h);
                    C29181a.m107290a(C29185b.f73042g).mo103458a(str, i, false, queryParameter).flush();
                    return new C29192a(false);
                } else if (C29193e.m107341a()) {
                    return new C29192a(true, "noHandler");
                } else {
                    return new C29192a(false);
                }
            }
        } else if (z2) {
            return new C29192a(false);
        } else if (!z) {
            C29193e.m107340a(context, parse, this.f73051h);
            C29181a.m107290a(C29185b.f73039d).mo103458a(str, i, false, queryParameter).addCategoryValue("version_name", this.f73051h).flush();
            return new C29192a(false);
        } else if (C29193e.m107341a()) {
            return new C29192a(true, "versionUnavailable");
        } else {
            return new C29192a(false);
        }
    }
}
