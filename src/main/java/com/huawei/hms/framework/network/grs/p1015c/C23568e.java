package com.huawei.hms.framework.network.grs.p1015c;

import android.text.TextUtils;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.Logger;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.huawei.hms.framework.network.grs.c.e */
public class C23568e {

    /* renamed from: a */
    private static final String f58097a = "e";

    /* renamed from: b */
    private Map<String, List<String>> f58098b;

    /* renamed from: c */
    private byte[] f58099c;

    /* renamed from: d */
    private int f58100d = 0;

    /* renamed from: e */
    private long f58101e;

    /* renamed from: f */
    private long f58102f;

    /* renamed from: g */
    private long f58103g;

    /* renamed from: h */
    private String f58104h;

    /* renamed from: i */
    private int f58105i = 2;

    /* renamed from: j */
    private int f58106j = ConnectionResult.RESOLUTION_REQUIRED;

    /* renamed from: k */
    private String f58107k = "";

    /* renamed from: l */
    private String f58108l = "";

    /* renamed from: m */
    private String f58109m = "";

    /* renamed from: n */
    private long f58110n = 0;

    /* renamed from: o */
    private Exception f58111o;

    /* renamed from: p */
    private String f58112p;

    /* renamed from: q */
    private int f58113q;

    public C23568e(int i, Map<String, List<String>> map, byte[] bArr, long j) {
        this.f58100d = i;
        this.f58098b = map;
        this.f58099c = ByteBuffer.wrap(bArr).array();
        this.f58101e = j;
        m85489q();
    }

    public C23568e(Exception exc, long j) {
        this.f58111o = exc;
        this.f58101e = j;
    }

    /* renamed from: a */
    private void m85477a(Map<String, String> map) {
        long j;
        NumberFormatException e;
        if (map == null || map.size() <= 0) {
            Logger.m85375w(f58097a, "getExpireTime {headers == null} or {headers.size() <= 0}");
            return;
        }
        if (map.containsKey("Cache-Control")) {
            String str = map.get("Cache-Control");
            if (!TextUtils.isEmpty(str) && str.contains("max-age=")) {
                try {
                    j = Long.parseLong(str.substring(str.indexOf("max-age=") + 8));
                    try {
                        Logger.m85374v(f58097a, "Cache-Control value{%s}", Long.valueOf(j));
                    } catch (NumberFormatException e2) {
                        e = e2;
                        Logger.m85376w(f58097a, "getExpireTime addHeadersToResult NumberFormatException", e);
                        j = 86400;
                        long j2 = j * 1000;
                        Logger.m85374v(f58097a, "convert expireTime{%s}", Long.valueOf(j2));
                        m85479b(String.valueOf(j2 + System.currentTimeMillis()));
                    }
                } catch (NumberFormatException e3) {
                    e = e3;
                    j = 0;
                    Logger.m85376w(f58097a, "getExpireTime addHeadersToResult NumberFormatException", e);
                    j = 86400;
                    long j22 = j * 1000;
                    Logger.m85374v(f58097a, "convert expireTime{%s}", Long.valueOf(j22));
                    m85479b(String.valueOf(j22 + System.currentTimeMillis()));
                }
                if (j <= 0 || j > 2592000) {
                    j = 86400;
                }
                long j222 = j * 1000;
                Logger.m85374v(f58097a, "convert expireTime{%s}", Long.valueOf(j222));
                m85479b(String.valueOf(j222 + System.currentTimeMillis()));
            }
        } else if (map.containsKey("Expires")) {
            String str2 = map.get("Expires");
            Logger.m85374v(f58097a, "expires is{%s}", str2);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
            String str3 = null;
            if (map.containsKey("Date")) {
                str3 = map.get("Date");
            }
            try {
                j = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
            } catch (ParseException e4) {
                Logger.m85376w(f58097a, "getExpireTime ParseException.", e4);
            }
            j = 86400;
            long j2222 = j * 1000;
            Logger.m85374v(f58097a, "convert expireTime{%s}", Long.valueOf(j2222));
            m85479b(String.valueOf(j2222 + System.currentTimeMillis()));
        } else {
            Logger.m85371i(f58097a, "response headers neither contains Cache-Control nor Expires.");
        }
        j = 0;
        j = 86400;
        long j22222 = j * 1000;
        Logger.m85374v(f58097a, "convert expireTime{%s}", Long.valueOf(j22222));
        m85479b(String.valueOf(j22222 + System.currentTimeMillis()));
    }

    /* renamed from: b */
    private void m85478b(int i) {
        this.f58106j = i;
    }

    /* renamed from: b */
    private void m85479b(String str) {
        this.f58109m = str;
    }

    /* renamed from: b */
    private void m85480b(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            Logger.m85375w(f58097a, "getExpireTime {headers == null} or {headers.size() <= 0}");
            return;
        }
        long j = 0;
        if (map.containsKey("Retry-After")) {
            String str = map.get("Retry-After");
            if (!TextUtils.isEmpty(str)) {
                try {
                    j = Long.parseLong(str);
                } catch (NumberFormatException e) {
                    Logger.m85376w(f58097a, "getRetryAfter addHeadersToResult NumberFormatException", e);
                }
            }
        }
        long j2 = j * 1000;
        Logger.m85374v(f58097a, "convert retry-afterTime{%s}", Long.valueOf(j2));
        m85482c(j2);
    }

    /* renamed from: c */
    private void m85481c(int i) {
        this.f58105i = i;
    }

    /* renamed from: c */
    private void m85482c(long j) {
        this.f58110n = j;
    }

    /* renamed from: c */
    private void m85483c(String str) {
        this.f58107k = str;
    }

    /* renamed from: d */
    private void m85484d(String str) {
        this.f58108l = str;
    }

    /* renamed from: e */
    private void m85485e(String str) {
        this.f58104h = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m85486n() {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.p1015c.C23568e.m85486n():void");
    }

    /* renamed from: o */
    private void m85487o() {
        if (mo82909m() || mo82908l()) {
            Map<String, String> p = m85488p();
            try {
                if (mo82909m()) {
                    m85477a(p);
                }
                if (mo82908l()) {
                    m85480b(p);
                }
            } catch (JSONException e) {
                Logger.m85376w(f58097a, "parseHeader catch JSONException", e);
            }
        }
    }

    /* renamed from: p */
    private Map<String, String> m85488p() {
        HashMap hashMap = new HashMap(16);
        Map<String, List<String>> map = this.f58098b;
        if (map == null || map.size() <= 0) {
            Logger.m85373v(f58097a, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
            return hashMap;
        }
        for (Map.Entry<String, List<String>> entry : this.f58098b.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().get(0));
        }
        return hashMap;
    }

    /* renamed from: q */
    private void m85489q() {
        m85487o();
        m85486n();
    }

    /* renamed from: a */
    public String mo82893a() {
        return this.f58109m;
    }

    /* renamed from: a */
    public void mo82894a(int i) {
        this.f58113q = i;
    }

    /* renamed from: a */
    public void mo82895a(long j) {
        this.f58103g = j;
    }

    /* renamed from: a */
    public void mo82896a(String str) {
        this.f58112p = str;
    }

    /* renamed from: b */
    public int mo82897b() {
        return this.f58100d;
    }

    /* renamed from: b */
    public void mo82898b(long j) {
        this.f58102f = j;
    }

    /* renamed from: c */
    public int mo82899c() {
        return this.f58106j;
    }

    /* renamed from: d */
    public Exception mo82900d() {
        return this.f58111o;
    }

    /* renamed from: e */
    public int mo82901e() {
        return this.f58105i;
    }

    /* renamed from: f */
    public long mo82902f() {
        return this.f58103g;
    }

    /* renamed from: g */
    public long mo82903g() {
        return this.f58102f;
    }

    /* renamed from: h */
    public long mo82904h() {
        return this.f58101e;
    }

    /* renamed from: i */
    public String mo82905i() {
        return this.f58104h;
    }

    /* renamed from: j */
    public long mo82906j() {
        return this.f58110n;
    }

    /* renamed from: k */
    public String mo82907k() {
        return this.f58112p;
    }

    /* renamed from: l */
    public boolean mo82908l() {
        return this.f58100d == 503;
    }

    /* renamed from: m */
    public boolean mo82909m() {
        return this.f58100d == 200;
    }
}
