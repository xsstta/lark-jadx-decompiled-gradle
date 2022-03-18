package com.bytedance.ee.bear.document.offline.remoteres;

import android.net.Uri;
import android.os.SystemClock;
import android.webkit.WebResourceResponse;
import com.alibaba.fastjson.JSONReader;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.document.offline.p318e.C5919a;
import com.bytedance.ee.bear.document.offline.p318e.C5929f;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.document.offline.remoteres.a */
public class C5981a {

    /* renamed from: a */
    private NetService f16760a;

    /* renamed from: b */
    private AbstractC5233x f16761b;

    /* renamed from: c */
    private RemoteResourceConfig f16762c;

    /* renamed from: d */
    private C5929f f16763d;

    /* renamed from: a */
    private RemoteResourceConfig m24198a(C5929f fVar) {
        File file = new File(fVar.mo23915a(), "remote_resources.json");
        if (!file.exists() || !file.isFile()) {
            C13479a.m54758a("RemoteResourceLoader", "getRemoteResConfig, remote config file not exist");
        } else {
            try {
                return (RemoteResourceConfig) new JSONReader(new FileReader(file)).readObject(RemoteResourceConfig.class);
            } catch (Exception e) {
                C13479a.m54759a("RemoteResourceLoader", "getRemoteResConfig fail", e);
            }
        }
        return RemoteResourceConfig.defaultResConfig();
    }

    /* renamed from: a */
    public boolean mo24201a(String str) {
        Uri parse = Uri.parse(str);
        RemoteResourceConfig remoteResourceConfig = this.f16762c;
        if (remoteResourceConfig == null || !remoteResourceConfig.getFileNameSet().contains(parse.getLastPathSegment())) {
            return false;
        }
        C13479a.m54764b("RemoteResourceLoader", "shouldInterceptRequest, load remote resource: " + parse);
        return true;
    }

    /* renamed from: b */
    public WebResourceResponse mo24202b(String str) {
        Request build = new Request.Builder().url(str).build();
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        Response a = this.f16760a.mo20120a(build);
        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
        if (a == null) {
            return null;
        }
        String path = Uri.parse(str).getPath();
        boolean isSuccessful = a.isSuccessful();
        C13479a.m54764b("RemoteResourceLoader", "loadRemoterResource, isSuccess: " + isSuccessful);
        m24199a(path, isSuccessful, currentThreadTimeMillis2 - currentThreadTimeMillis, this.f16763d.mo23916b());
        if (!isSuccessful || a.body() == null) {
            return null;
        }
        try {
            InputStream byteStream = a.body().byteStream();
            File file = new File(this.f16763d.mo23915a().getParent(), path);
            C13479a.m54772d("RemoteResourceLoader", "loadRemoteResource, cache file: " + file);
            C5890a.m23702a(byteStream, file);
            return new WebResourceResponse(C5890a.m23711c(str), C5919a.f16571a, new FileInputStream(file));
        } catch (Exception e) {
            C13479a.m54759a("RemoteResourceLoader", "loadRemoteResource error", e);
            return null;
        }
    }

    public C5981a(NetService netService, AbstractC5233x xVar, C5929f fVar) {
        this.f16760a = netService;
        this.f16761b = xVar;
        RemoteResourceConfig a = m24198a(fVar);
        this.f16762c = a;
        this.f16763d = fVar;
        a.generateFileNameSet();
    }

    /* renamed from: a */
    private void m24199a(String str, boolean z, long j, String str2) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("path", str);
            if (z) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            jSONObject.put("isSuccess", str3);
            jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, j);
            jSONObject.put("pkg_version", str2);
        } catch (JSONException e) {
            C13479a.m54759a("RemoteResourceLoader", "reportLoadRemoteResource fail", e);
        }
        C13479a.m54772d("RemoteResourceLoader", "report, params = " + jSONObject);
        this.f16761b.mo21080a("load_fe_remote_resource", jSONObject);
    }
}
