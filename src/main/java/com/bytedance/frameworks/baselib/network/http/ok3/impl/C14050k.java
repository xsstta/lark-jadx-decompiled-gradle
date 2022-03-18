package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.C14041b;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.DnsResult;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.C14067c;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.C14073i;
import com.bytedance.frameworks.baselib.network.http.util.C14089g;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.CipherSuite;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.k */
public class C14050k {

    /* renamed from: A */
    long f36831A = 0;

    /* renamed from: B */
    Protocol f36832B = null;

    /* renamed from: C */
    boolean f36833C = false;

    /* renamed from: D */
    boolean f36834D = false;

    /* renamed from: E */
    String f36835E = "";

    /* renamed from: F */
    Socket f36836F;

    /* renamed from: G */
    Headers f36837G;

    /* renamed from: H */
    String f36838H = "";

    /* renamed from: I */
    int f36839I = 0;

    /* renamed from: J */
    List<C14053m> f36840J = new ArrayList();

    /* renamed from: K */
    EnumC14024d f36841K = EnumC14024d.IDLE;

    /* renamed from: L */
    String f36842L = "";

    /* renamed from: M */
    int f36843M = -1;

    /* renamed from: N */
    EnumC14060p f36844N = EnumC14060p.UNKNOWN;

    /* renamed from: O */
    String f36845O = "";

    /* renamed from: P */
    boolean f36846P = false;

    /* renamed from: Q */
    boolean f36847Q = false;

    /* renamed from: R */
    List<C14067c> f36848R;

    /* renamed from: S */
    int f36849S = 0;

    /* renamed from: T */
    DnsResult.Source f36850T = DnsResult.Source.UNKNOWN;

    /* renamed from: U */
    CopyOnWriteArrayList<String> f36851U = new CopyOnWriteArrayList<>();

    /* renamed from: V */
    String f36852V = "";

    /* renamed from: a */
    long f36853a = -1;

    /* renamed from: b */
    long f36854b = -1;

    /* renamed from: c */
    long f36855c = -1;

    /* renamed from: d */
    long f36856d = -1;

    /* renamed from: e */
    long f36857e = -1;

    /* renamed from: f */
    long f36858f = -1;

    /* renamed from: g */
    long f36859g = -1;

    /* renamed from: h */
    long f36860h = -1;

    /* renamed from: i */
    long f36861i = -1;

    /* renamed from: j */
    long f36862j = -1;

    /* renamed from: k */
    long f36863k = -1;

    /* renamed from: l */
    long f36864l = -1;

    /* renamed from: m */
    long f36865m = -1;

    /* renamed from: n */
    long f36866n = -1;

    /* renamed from: o */
    long f36867o = -1;

    /* renamed from: p */
    long f36868p = -1;

    /* renamed from: q */
    long f36869q = -1;

    /* renamed from: r */
    long f36870r = -1;

    /* renamed from: s */
    List<Pair<InetSocketAddress, Integer>> f36871s = new ArrayList();

    /* renamed from: t */
    Proxy.Type f36872t = Proxy.Type.DIRECT;

    /* renamed from: u */
    EnumC14023c f36873u = EnumC14023c.HANDSHAKE_UNKNOWN;

    /* renamed from: v */
    TlsVersion f36874v;

    /* renamed from: w */
    CipherSuite f36875w;

    /* renamed from: x */
    long f36876x = 0;

    /* renamed from: y */
    Headers f36877y;

    /* renamed from: z */
    int f36878z = -1;

    /* renamed from: a */
    private static long m56877a(long j, long j2) {
        if (j2 == -1 || j == -1) {
            return -1;
        }
        return j - j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.k$1 */
    public static /* synthetic */ class C140511 {

        /* renamed from: a */
        static final /* synthetic */ int[] f36879a;

        /* renamed from: b */
        static final /* synthetic */ int[] f36880b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
            // Method dump skipped, instructions count: 142
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.C14050k.C140511.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static long m56878a(String str) {
        String[] split = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
        if (split.length != 2) {
            return -1;
        }
        try {
            long parseLong = Long.parseLong(split[1]);
            if (parseLong < 0) {
                return -1;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static EnumC14022b m56879a(Protocol protocol) {
        if (protocol == null) {
            return EnumC14022b.CONNECTION_INFO_UNKNOWN;
        }
        int i = C140511.f36880b[protocol.ordinal()];
        if (i == 1) {
            return EnumC14022b.CONNECTION_INFO_HTTP1_0;
        }
        if (i == 2) {
            return EnumC14022b.CONNECTION_INFO_HTTP1_1;
        }
        if (i == 3) {
            return EnumC14022b.CONNECTION_INFO_HTTP2;
        }
        if (i == 4) {
            return EnumC14022b.CONNECTION_INFO_DEPRECATED_SPDY3;
        }
        if (i != 5) {
            return EnumC14022b.CONNECTION_INFO_UNKNOWN;
        }
        return EnumC14022b.CONNECTION_INFO_QUIC_UNKNOWN_VERSION;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private String m56880a(Context context) {
        boolean z;
        long j;
        long j2;
        boolean z2;
        String str;
        boolean z3;
        InetAddress inetAddress;
        boolean z4;
        Uri parse;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String i = C14073i.m56967a().mo51762i();
            if (!TextUtils.isEmpty(i)) {
                String[] split = i.split(",");
                JSONArray jSONArray = new JSONArray();
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2)) {
                        jSONArray.put(str2);
                    }
                }
                jSONObject2.put("hit", jSONArray);
            }
            jSONObject.put("ab_test", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("load_state", this.f36841K.ordinal());
            jSONObject3.put("method", this.f36842L);
            if (this.f36844N == EnumC14060p.IO_PENDING) {
                z = true;
            } else {
                z = false;
            }
            jSONObject3.put("is_pending", z);
            jSONObject3.put(UpdateKey.STATUS, this.f36844N);
            if (this.f36844N != EnumC14060p.SUCCESS) {
                jSONObject3.put("net_error", this.f36843M);
            }
            jSONObject3.put("origin_url", this.f36845O);
            jSONObject3.put("redirect_times", this.f36839I);
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (C14053m mVar : this.f36840J) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("code", mVar.f36881a);
                jSONObject4.put("method", mVar.f36882b);
                jSONObject4.put("url", mVar.f36883c);
                jSONObject4.put("internal", mVar.f36884d);
                jSONArray2.put(jSONObject4);
                if (mVar.f36883c != null && (parse = Uri.parse(mVar.f36883c)) != null && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getHost())) {
                    jSONArray3.put(parse.getScheme() + "://" + parse.getHost());
                }
            }
            jSONObject3.put("redirect_info", jSONArray2);
            jSONObject3.put("redirecting_list", jSONArray3);
            jSONObject3.put("dispatched", this.f36846P);
            jSONObject.put("base", jSONObject3);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("code", this.f36878z);
            jSONObject5.put("connection_info", m56879a(this.f36832B).mValue);
            Headers headers = this.f36877y;
            if (headers != null) {
                j = headers.byteCount();
            } else {
                j = 0;
            }
            jSONObject5.put("sent_bytes", this.f36876x + j);
            Headers headers2 = this.f36837G;
            if (headers2 != null) {
                j2 = headers2.byteCount();
            } else {
                j2 = 0;
            }
            jSONObject5.put("received_bytes", this.f36831A + j2);
            jSONObject5.put("cached", this.f36833C);
            jSONObject5.put("network_accessed", this.f36834D);
            if (this.f36872t != Proxy.Type.DIRECT) {
                z2 = true;
            } else {
                z2 = false;
            }
            jSONObject5.put("via_proxy", z2);
            jSONObject.put("response", jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            if (this.f36837G != null) {
                for (int i2 = 0; i2 < this.f36837G.size(); i2++) {
                    String name = this.f36837G.name(i2);
                    String value = this.f36837G.value(i2);
                    if (!TextUtils.isEmpty(name) && name.startsWith("x-tt-") && !TextUtils.isEmpty(value)) {
                        jSONObject6.put(name, value);
                    }
                }
                String str3 = this.f36837G.get("tt-idc-switch");
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject6.put("tt-idc-switch", str3);
                }
                str = this.f36837G.get("server-timing");
                if (!TextUtils.isEmpty(str)) {
                    jSONObject6.put("server-timing", str);
                }
                jSONObject.put("header", jSONObject6);
            } else {
                str = "";
            }
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("libcore", "okhttp");
            jSONObject7.put("core_ver", "tt-ok/3.10.0.2");
            jSONObject7.put("is_main_process", C14089g.m57048b(context));
            jSONObject7.put("ttnet_version", "4.0.78.3-tudp");
            jSONObject7.put("retry_attempts", -1);
            jSONObject.put("other", jSONObject7);
            JSONObject jSONObject8 = new JSONObject();
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("dns", m56877a(this.f36855c, this.f36854b));
            jSONObject9.put("tcp", m56877a(this.f36858f, this.f36856d));
            jSONObject9.put("ssl", m56877a(this.f36859g, this.f36858f));
            jSONObject9.put("send", m56877a(this.f36861i, this.f36860h) + m56877a(this.f36863k, this.f36862j));
            long a = m56877a(this.f36865m, this.f36861i);
            jSONObject9.put("ttfb", a);
            jSONObject9.put("header_recv", m56877a(this.f36865m, this.f36864l));
            jSONObject9.put("body_recv", m56877a(this.f36867o, this.f36866n));
            jSONObject9.put("dispatch", this.f36870r);
            m56881a(str, jSONObject9, a);
            jSONObject8.put("detailed_duration", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("start_time", this.f36853a);
            jSONObject10.put("duration", m56877a(this.f36868p, this.f36853a));
            jSONObject10.put("request_sent_time", this.f36860h);
            jSONObject10.put("response_recv_time", this.f36864l);
            jSONObject8.put("request", jSONObject10);
            jSONObject.put("timing", jSONObject8);
            JSONObject jSONObject11 = new JSONObject();
            Socket socket = this.f36836F;
            if (!(socket == null || (inetAddress = socket.getInetAddress()) == null)) {
                EnumC14021a aVar = EnumC14021a.ADDRESS_FAMILY_UNSPECIFIED;
                if (inetAddress instanceof Inet4Address) {
                    aVar = EnumC14021a.ADDRESS_FAMILY_IPV4;
                } else if (inetAddress instanceof Inet6Address) {
                    aVar = EnumC14021a.ADDRESS_FAMILY_IPV6;
                }
                jSONObject11.put("address_family", aVar.ordinal());
                if (this.f36856d != -1 || this.f36869q == -1) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                jSONObject11.put("socket_reused", z4);
                if (inetAddress.getHostAddress() != null) {
                    jSONObject11.put("remote", inetAddress.getHostAddress());
                }
            }
            JSONArray jSONArray4 = new JSONArray();
            for (Pair<InetSocketAddress, Integer> pair : this.f36871s) {
                JSONObject jSONObject12 = new JSONObject();
                jSONObject12.put("address", ((InetSocketAddress) pair.first).toString().substring(1));
                jSONObject12.put("result", pair.second);
                jSONArray4.put(jSONObject12);
            }
            jSONObject11.put("connection_attempts", jSONArray4);
            jSONObject.put("socket", jSONObject11);
            JSONObject jSONObject13 = new JSONObject();
            jSONObject13.put("handshake_type", this.f36873u.ordinal());
            jSONObject13.put("cipher_suite", this.f36875w);
            jSONObject13.put("ssl_version", this.f36874v);
            jSONObject.put("ssl", jSONObject13);
            JSONObject jSONObject14 = new JSONObject();
            JSONArray jSONArray5 = new JSONArray();
            if (this.f36847Q) {
                jSONObject14.put("host_replace_map", 1);
                jSONObject14.put("host_replace_map_size", this.f36849S);
            } else {
                List<C14067c> list = this.f36848R;
                if (list != null) {
                    for (C14067c cVar : list) {
                        JSONObject jSONObject15 = new JSONObject();
                        if (cVar.f36956d) {
                            jSONObject15.put("priority", cVar.f36955c);
                            jSONObject15.put(ShareHitPoint.f121869d, cVar.f36957e);
                            jSONObject15.put("action_hit", cVar.f36956d);
                            if (!TextUtils.isEmpty(cVar.f36959g)) {
                                Uri parse2 = Uri.parse(cVar.f36959g);
                                if (parse2.getHost() != null) {
                                    jSONObject15.put("replace_host", parse2.getHost());
                                }
                            } else {
                                jSONObject15.put("replace_host", "");
                            }
                            jSONObject15.put("feedback", cVar.f36958f);
                            if (cVar.f36954b > 0) {
                                jSONObject15.put("rule_id", cVar.f36954b);
                            }
                            if (!TextUtils.isEmpty(cVar.f36953a)) {
                                jSONObject15.put("service_name", cVar.f36953a);
                            }
                            jSONArray5.put(jSONObject15);
                        }
                    }
                }
                jSONObject14.put("action_info", jSONArray5);
                jSONObject14.put("empty_action", C14073i.m56967a().mo51757d());
                jSONObject14.put("host_replace_map", 0);
            }
            jSONObject14.put(ShareHitPoint.f121868c, C14073i.m56967a().mo51759f());
            jSONObject14.put("update_time", C14073i.m56967a().mo51760g());
            jSONObject14.put("epoch", C14073i.m56967a().mo51758e());
            jSONObject.put("url_dispatch", jSONObject14);
            if (!TextUtils.isEmpty(C14073i.m56967a().mo51761h())) {
                jSONObject.put("tt_tnc_etag", C14073i.m56967a().mo51761h());
            }
            JSONObject jSONObject16 = new JSONObject();
            JSONArray jSONArray6 = new JSONArray();
            Iterator<String> it = this.f36851U.iterator();
            while (it.hasNext()) {
                jSONArray6.put(it.next());
            }
            jSONObject16.put("address_list", jSONArray6);
            jSONObject16.put("httpdns_prefer", C14041b.m56829a().mo51702h());
            EnumC14062r rVar = EnumC14062r.NOT_SET;
            EnumC14061q qVar = EnumC14061q.UNKNOWN;
            switch (C140511.f36879a[this.f36850T.ordinal()]) {
                case 1:
                    rVar = EnumC14062r.SERVE_FROM_CACHE;
                    qVar = EnumC14061q.SOURCE_HTTPDNS;
                    z3 = false;
                    break;
                case 2:
                    rVar = EnumC14062r.SERVE_FROM_CACHE;
                    qVar = EnumC14061q.SOURCE_PROC;
                    z3 = false;
                    break;
                case 3:
                    rVar = EnumC14062r.SERVE_FROM_HTTP_DNS_JOB;
                    z3 = false;
                    break;
                case 4:
                    rVar = EnumC14062r.SERVE_FROM_PROC_DNS_JOB;
                    z3 = false;
                    break;
                case 5:
                    rVar = EnumC14062r.SERVE_FROM_CACHE;
                    qVar = EnumC14061q.SOURCE_HTTPDNS;
                    z3 = true;
                    break;
                case 6:
                    rVar = EnumC14062r.SERVE_FROM_HARDCODE_HOSTS;
                    z3 = false;
                    break;
                default:
                    z3 = false;
                    break;
            }
            jSONObject16.put(ShareHitPoint.f121868c, rVar.mValue);
            jSONObject16.put("cache_source", qVar.mValue);
            jSONObject16.put("from_stale_cache", z3);
            jSONObject.put("dns", jSONObject16);
            C14048i.m56873a().mo51721b(this.f36852V, this);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public void mo51722a(BaseHttpRequestInfo baseHttpRequestInfo, Context context) {
        boolean z;
        baseHttpRequestInfo.remoteIp = this.f36835E;
        baseHttpRequestInfo.dnsTime = m56877a(this.f36855c, this.f36854b);
        baseHttpRequestInfo.connectTime = m56877a(this.f36858f, this.f36856d);
        baseHttpRequestInfo.sslTime = m56877a(this.f36859g, this.f36858f);
        baseHttpRequestInfo.sendTime = m56877a(this.f36861i, this.f36860h) + m56877a(this.f36863k, this.f36862j);
        baseHttpRequestInfo.pushTime = -1;
        baseHttpRequestInfo.receiveTime = m56877a(this.f36865m, this.f36861i);
        if (this.f36856d != -1 || this.f36869q == -1) {
            z = false;
        } else {
            z = true;
        }
        baseHttpRequestInfo.isSocketReused = z;
        baseHttpRequestInfo.ttfbMs = -1;
        baseHttpRequestInfo.totalTime = m56877a(this.f36868p, this.f36853a);
        baseHttpRequestInfo.sentByteCount = this.f36876x;
        baseHttpRequestInfo.receivedByteCount = this.f36831A;
        baseHttpRequestInfo.requestLog = m56880a(context);
        baseHttpRequestInfo.retryAttempts = -1;
        Headers headers = this.f36877y;
        if (headers != null) {
            baseHttpRequestInfo.requestHeaders = headers.toString();
            baseHttpRequestInfo.sentByteCount += this.f36877y.byteCount();
        }
        Headers headers2 = this.f36837G;
        if (headers2 != null) {
            baseHttpRequestInfo.responseHeaders = headers2.toString();
            baseHttpRequestInfo.receivedByteCount += this.f36837G.byteCount();
        }
        baseHttpRequestInfo.contentType = this.f36838H;
        baseHttpRequestInfo.nativePostTaskStartTime = -1;
        baseHttpRequestInfo.nativeRequestStartTime = -1;
        baseHttpRequestInfo.nativeWaitContext = -1;
    }

    /* renamed from: a */
    private void m56881a(String str, JSONObject jSONObject, long j) throws JSONException {
        String[] split;
        HashMap hashMap = new HashMap();
        C14054n nVar = new C14054n();
        if (!TextUtils.isEmpty(str) && (split = str.split(",")) != null) {
            for (String str2 : split) {
                String[] split2 = str2.split(";");
                if (split2 != null && !TextUtils.isEmpty(split2[0]) && !TextUtils.isEmpty(split2[1])) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String trim = ((String) entry.getKey()).trim();
            String trim2 = ((String) entry.getValue()).trim();
            if (trim.equalsIgnoreCase("cdn-cache")) {
                nVar.f36885a = true;
                String[] split3 = trim2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (split3.length != 2 || !split3[1].equalsIgnoreCase("hit")) {
                    nVar.f36886b = false;
                } else {
                    nVar.f36886b = true;
                }
            } else if (trim.equalsIgnoreCase("edge")) {
                nVar.f36887c = m56878a(trim2);
            } else if (trim.equalsIgnoreCase("origin")) {
                nVar.f36888d = m56878a(trim2);
            } else if (trim.equalsIgnoreCase("inner")) {
                nVar.f36889e = m56878a(trim2);
            } else if (!TextUtils.isEmpty(trim)) {
                jSONObject.put(trim, m56878a(trim2));
            }
        }
        if (nVar.f36885a && nVar.f36886b) {
            jSONObject.put("edge", nVar.f36887c);
            jSONObject.put("cdn-cache", "hit");
            if (j != -1 && j > nVar.f36887c) {
                nVar.f36890f = j - nVar.f36887c;
            }
            jSONObject.put("rtt", nVar.f36890f);
        } else if (nVar.f36885a) {
            jSONObject.put("edge", nVar.f36887c);
            jSONObject.put("cdn-cache", "miss");
            if (nVar.f36888d > nVar.f36889e) {
                jSONObject.put("origin", nVar.f36888d - nVar.f36889e);
            } else {
                jSONObject.put("origin", -1);
            }
            jSONObject.put("inner", nVar.f36889e);
            if (j != -1 && j > nVar.f36888d + nVar.f36887c) {
                nVar.f36890f = (j - nVar.f36888d) - nVar.f36887c;
            }
            jSONObject.put("rtt", nVar.f36890f);
        } else {
            jSONObject.put("inner", nVar.f36889e);
            if (j != -1 && j > nVar.f36889e) {
                nVar.f36890f = j - nVar.f36889e;
            }
            jSONObject.put("rtt", nVar.f36890f);
        }
    }
}
