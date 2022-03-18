package com.ss.android.lark.platform.p2484e;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.common.utility.NetworkClient;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.http.p1187b.C25992c;
import com.larksuite.framework.utils.C26320t;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.bytedcert.config.AbstractC28343c;
import com.ss.android.bytedcert.config.INetWork;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.platform.network.C51857a;
import com.ss.android.lark.platform.network.C51864e;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.ttve.monitor.C60217b;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.C69694c;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.e.a */
public class C51798a {

    /* renamed from: a */
    private static volatile C51800a f128741a;

    /* renamed from: com.ss.android.lark.platform.e.a$a */
    public static class C51800a {
        private C51800a() {
        }

        /* renamed from: a */
        public void mo177926a() {
            BytedCertManager.getInstance().setCertMonitorConfig(new AbstractC28343c() {
                /* class com.ss.android.lark.platform.p2484e.C51798a.C51800a.C518011 */

                @Override // com.ss.android.bytedcert.config.AbstractC28343c
                /* renamed from: a */
                public int mo100948a() {
                    return C29410a.m108287a().mo104277a();
                }

                @Override // com.ss.android.bytedcert.config.AbstractC28343c
                /* renamed from: b */
                public String mo100950b() {
                    return C36083a.m141486a().getPassportDependency().mo133090i();
                }

                @Override // com.ss.android.bytedcert.config.AbstractC28343c
                /* renamed from: a */
                public void mo100949a(String str, JSONObject jSONObject) {
                    C60217b.m234045a(str, jSONObject, "behavior");
                }
            });
            BytedCertManager.getInstance().setNetWork(new INetWork() {
                /* class com.ss.android.lark.platform.p2484e.C51798a.C51800a.C518022 */

                /* renamed from: b */
                private AbstractC25990b f128744b = C51864e.m201147a();

                /* renamed from: c */
                private C51857a f128745c = new C51857a(LarkContext.getApplication(), this.f128744b);

                @Override // com.ss.android.bytedcert.config.INetWork
                public int checkResponseException(Throwable th) {
                    return 0;
                }

                @Override // com.ss.android.bytedcert.config.INetWork
                public int getExceptionStatusCode(Throwable th) {
                    return 0;
                }

                /* renamed from: a */
                private NetworkClient.ReqContext m200822a() {
                    NetworkClient.ReqContext reqContext = new NetworkClient.ReqContext();
                    reqContext.addCommonParams = true;
                    return reqContext;
                }

                /* renamed from: a */
                private List<Pair<String, String>> m200823a(Map<String, String> map) {
                    ArrayList arrayList = new ArrayList();
                    if (!CollectionUtils.isEmpty(map)) {
                        for (String str : map.keySet()) {
                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(map.get(str))) {
                                arrayList.add(new Pair(str, map.get(str)));
                            }
                        }
                    }
                    return arrayList;
                }

                @Override // com.ss.android.bytedcert.config.INetWork
                public String executePostFile(String str, Map<String, String> map, Map<String, Pair<String, byte[]>> map2) throws Exception {
                    MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
                    if (!CollectionUtils.isEmpty(map2)) {
                        for (String str2 : map2.keySet()) {
                            Pair<String, byte[]> pair = map2.get(str2);
                            if (!(pair == null || pair.second == null)) {
                                type.addFormDataPart(str2, (String) pair.first, FormBody.create(MediaType.parse("application/octet-stream"), (byte[]) pair.second));
                            }
                        }
                    }
                    String a = C51798a.m200810a(C51800a.this.mo177923a(C51800a.this.mo177928c(str), "device_id", C36083a.m141486a().getPassportDependency().mo133090i()), map);
                    if (!(this.f128744b instanceof C25992c)) {
                        return null;
                    }
                    MultipartBody build = type.build();
                    Request.Builder builder = new Request.Builder();
                    String a2 = C51800a.this.mo177924a(build);
                    if (!TextUtils.isEmpty(a2)) {
                        String a3 = C51800a.this.mo177922a(a);
                        String a4 = C26320t.m95319a(Base64.decode(Base64.encodeToString(a2.getBytes(), 0), 0));
                        String a5 = C36083a.m141486a().getPassportDependency().mo133053a(a3, a4);
                        builder.addHeader("X-SS-STUB", a4);
                        builder.addHeader("X-Sec-Captcha-Token", a5);
                    }
                    Response execute = ((C25992c) this.f128744b).mo92424b().newCall(builder.url(a).post(build).build()).execute();
                    if (execute == null) {
                        return null;
                    }
                    String string = execute.body().string();
                    C53241h.m205898b("ByteCertSdkProvider", "executePostFile -> " + a + " -> " + string);
                    return string;
                }

                @Override // com.ss.android.bytedcert.config.INetWork
                public String executeGet(String str, Map<String, String> map, Map<String, String> map2, Map<String, Object> map3) throws Exception {
                    String a = C51798a.m200810a(C51800a.this.mo177928c(str), map2);
                    String str2 = this.f128745c.get(a, map, m200822a());
                    C53241h.m205898b("ByteCertSdkProvider", "executeGet -> " + a + " -> " + str2);
                    return str2;
                }

                @Override // com.ss.android.bytedcert.config.INetWork
                public String executePost(String str, Map<String, String> map, String str2, Map<String, Object> map2) throws Exception {
                    byte[] bArr;
                    String c = C51800a.this.mo177928c(str);
                    Map<String, String> a = C51800a.this.mo177925a(c, map, str2);
                    C51857a aVar = this.f128745c;
                    if (str2 == null) {
                        bArr = null;
                    } else {
                        bArr = str2.getBytes();
                    }
                    String post = aVar.post(c, bArr, a, m200822a());
                    C53241h.m205898b("ByteCertSdkProvider", "executePost -> " + c + " -> " + post);
                    return post;
                }

                @Override // com.ss.android.bytedcert.config.INetWork
                public String executePost(String str, Map<String, String> map, Map<String, String> map2, Map<String, Object> map3) throws Exception {
                    String c = C51800a.this.mo177928c(str);
                    String post = this.f128745c.post(c, m200823a(map2), C51800a.this.mo177925a(c, map, ""), m200822a());
                    C53241h.m205898b("ByteCertSdkProvider", "executePostNoBody -> " + c + " -> " + post);
                    return post;
                }
            });
        }

        /* renamed from: a */
        public String mo177922a(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            Uri parse = Uri.parse(str);
            return str.substring((parse.getScheme() + "://" + parse.getHost()).length());
        }

        /* renamed from: a */
        public String mo177924a(RequestBody requestBody) {
            if (requestBody == null) {
                return "";
            }
            try {
                Charset forName = Charset.forName("UTF-8");
                C69694c cVar = new C69694c();
                requestBody.writeTo(cVar);
                MediaType contentType = requestBody.contentType();
                if (contentType != null) {
                    forName = contentType.charset(forName);
                }
                return cVar.readString(forName);
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }

        /* renamed from: b */
        public String mo177927b(String str) {
            if (str == null || str.equals("")) {
                C53241h.m205898b("ByteCertSdkProvider", "toURLEncoded error:" + str);
                return "";
            }
            try {
                return URLEncoder.encode(new String(str.getBytes(), "UTF-8"), "UTF-8");
            } catch (Exception unused) {
                C53241h.m205898b("ByteCertSdkProvider", "toURLEncoded error:" + str);
                return "";
            }
        }

        /* renamed from: c */
        public String mo177928c(String str) {
            String str2;
            String substring = AppLogProxy.addNetCommonParams(LarkContext.getApplication(), str, true).substring(str.length());
            while (true) {
                if (!substring.startsWith("/")) {
                    str2 = ContainerUtils.FIELD_DELIMITER;
                    if (!substring.startsWith(str2)) {
                        try {
                            break;
                        } catch (Exception unused) {
                            C53241h.m205894a("ByteCertSdkProvider", "init error");
                        }
                    }
                }
                substring = substring.substring(1);
            }
            PackageInfo packageInfo = LarkContext.getApplication().getPackageManager().getPackageInfo(LarkContext.getApplication().getPackageName(), 0);
            substring = substring + "&lark_version=" + packageInfo.versionName;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (!str.contains("?")) {
                str2 = "?";
            }
            sb.append(str2);
            sb.append(substring);
            return m200811d(sb.toString());
        }

        /* renamed from: d */
        private String m200811d(String str) {
            Uri parse = Uri.parse(str);
            StringBuilder sb = new StringBuilder(parse.getScheme());
            sb.append("://");
            sb.append(parse.getHost());
            sb.append(parse.getPath());
            sb.append("?");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            Pattern compile = Pattern.compile("[一-龥]");
            if (queryParameterNames != null) {
                boolean z = true;
                for (String str2 : queryParameterNames) {
                    if (!"aid".equals(str2) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(parse.getQueryParameter(str2))) {
                        String queryParameter = parse.getQueryParameter(str2);
                        if (compile.matcher(queryParameter).find()) {
                            queryParameter = mo177927b(queryParameter);
                        }
                        if (z) {
                            sb.append(str2);
                            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb.append(queryParameter);
                            z = false;
                        } else {
                            sb.append(ContainerUtils.FIELD_DELIMITER);
                            sb.append(str2);
                            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb.append(queryParameter);
                        }
                    }
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public String mo177923a(String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
                int indexOf = str.indexOf(str2 + ContainerUtils.KEY_VALUE_DELIMITER);
                while (indexOf != -1) {
                    if (indexOf > 0) {
                        int i = indexOf - 1;
                        if (str.charAt(i) == '?' || str.charAt(i) == '&') {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str.substring(0, indexOf));
                            sb.append(str2 + ContainerUtils.KEY_VALUE_DELIMITER);
                            sb.append(str3);
                            int indexOf2 = str.indexOf(ContainerUtils.FIELD_DELIMITER, indexOf);
                            if (indexOf2 != -1) {
                                sb.append(str.substring(indexOf2));
                            }
                            str = sb.toString();
                            indexOf = -1;
                        }
                    }
                    indexOf = str.indexOf(str2 + ContainerUtils.KEY_VALUE_DELIMITER, indexOf + 1);
                }
            }
            return str;
        }

        /* renamed from: a */
        public Map<String, String> mo177925a(String str, Map<String, String> map, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return map;
            }
            String a = mo177922a(str);
            String a2 = C26320t.m95319a(Base64.decode(Base64.encodeToString(str2.getBytes(), 0), 0));
            String a3 = C36083a.m141486a().getPassportDependency().mo133053a(a, a2);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("X-SS-STUB", a2);
            map.put("X-Sec-Captcha-Token", a3);
            return map;
        }
    }

    /* renamed from: a */
    public static C51800a m200809a() {
        if (f128741a == null) {
            synchronized (C51798a.class) {
                if (f128741a == null) {
                    f128741a = new C51800a();
                }
            }
        }
        return f128741a;
    }

    /* renamed from: a */
    public static String m200810a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || map == null || map.size() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        } else {
            sb.append(ContainerUtils.FIELD_DELIMITER);
        }
        boolean z = true;
        for (String str2 : map.keySet()) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(map.get(str2))) {
                if (z) {
                    z = false;
                } else {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                }
                sb.append(str2);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }
}
