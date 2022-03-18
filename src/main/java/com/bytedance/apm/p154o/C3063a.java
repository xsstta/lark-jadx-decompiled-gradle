package com.bytedance.apm.p154o;

import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException;
import com.bytedance.ttnet.http.HttpRequestInfo;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ttnet.org.chromium.net.impl.NetworkExceptionImpl;
import com.ttnet.org.chromium.net.impl.QuicExceptionImpl;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.o.a */
public final class C3063a {

    /* renamed from: a */
    private static Map<String, Map<String, Integer>> f9847a = new HashMap();

    /* renamed from: a */
    private static void m12796a() {
        if (f9847a.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put(" Bad Request", 101);
            hashMap.put(" Connection timed out", 102);
            hashMap.put(" Forbidden", 103);
            hashMap.put(" Gateway Time-out", 104);
            hashMap.put(" Internal Server Error", Integer.valueOf((int) LocationRequest.PRIORITY_NO_POWER));
            hashMap.put(" Not Found", 106);
            hashMap.put(" Request Time-out", Integer.valueOf((int) ActivityIdentificationData.WALKING));
            hashMap.put(" Request-URI Too Large", 108);
            f9847a.put(HttpResponseException.class.getSimpleName(), hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ERR_ABORTED", 301);
            hashMap2.put("ERR_ADDRESS_UNREACHABLE", 302);
            hashMap2.put("ERR_CERT_AUTHORITY_INVALID", 303);
            hashMap2.put("ERR_CERT_COMMON_NAME_INVALID", 304);
            hashMap2.put("ERR_CERT_DATE_INVALID", 305);
            hashMap2.put("ERR_CONNECTION_ABORTED", 306);
            hashMap2.put("ERR_CONNECTION_CLOSED", 307);
            hashMap2.put("ERR_CONNECTION_REFUSED", 308);
            hashMap2.put("ERR_CONNECTION_RESET", 309);
            hashMap2.put("ERR_CONNECTION_TIMED_OUT", 310);
            hashMap2.put("ERR_EMPTY_RESPONSE", 311);
            hashMap2.put("ERR_HTTP2_PING_FAILED", 312);
            hashMap2.put("ERR_INCOMPLETE_CHUNKED_ENCODING", 313);
            hashMap2.put("ERR_INTERNET_DISCONNECTED", 314);
            hashMap2.put("ERR_NAME_NOT_RESOLVED", 315);
            hashMap2.put("ERR_NETWORK_ACCESS_DENIED", 316);
            hashMap2.put("ERR_PROXY_CONNECTION_FAILED", 317);
            hashMap2.put("ERR_SOCKET_NOT_CONNECTED", 318);
            hashMap2.put("ERR_SSL_BAD_RECORD_MAC_ALERT", 319);
            hashMap2.put("ERR_SSL_PROTOCOL_ERROR", 320);
            hashMap2.put("ERR_TIMED_OUT", 321);
            hashMap2.put("ERR_TTNET_APP_TIMED_OUT", 322);
            hashMap2.put("ERR_TTNET_APP_UPLOAD_EXCEPTION", 323);
            hashMap2.put("ERR_TUNNEL_CONNECTION_FAILED", 324);
            f9847a.put(NetworkExceptionImpl.class.getSimpleName(), hashMap2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("ERR_NETWORK_CHANGED", 401);
            f9847a.put(QuicExceptionImpl.class.getSimpleName(), hashMap3);
            HashMap hashMap4 = new HashMap();
            hashMap4.put(" Unexpected end of ZLIB input stream", 501);
            f9847a.put(EOFException.class.getSimpleName(), hashMap4);
            HashMap hashMap5 = new HashMap();
            hashMap5.put(" unexpected end of stream on Connection", 601);
            hashMap5.put(" Unexpected request usage", 602);
            f9847a.put(IOException.class.getSimpleName(), hashMap5);
            HashMap hashMap6 = new HashMap();
            hashMap6.put("Cronet internal request fail", 701);
            f9847a.put(Exception.class.getSimpleName(), hashMap6);
            HashMap hashMap7 = new HashMap();
            hashMap7.put(" Content received is less than Content-Length", 801);
            hashMap7.put(" expected bytes but received", 802);
            hashMap7.put(" unexpected end of stream", 803);
            f9847a.put(ProtocolException.class.getSimpleName(), hashMap7);
            HashMap hashMap8 = new HashMap();
            hashMap8.put(" Connection closed by peer", 901);
            hashMap8.put(" Read error", 902);
            hashMap8.put(" SSL handshake aborted", 903);
            f9847a.put(SSLException.class.getSimpleName(), hashMap8);
            HashMap hashMap9 = new HashMap();
            hashMap9.put(" Connection closed by peer", Integer.valueOf((int) CommonCode.StatusCode.API_CLIENT_EXPIRED));
            hashMap9.put(" Handshake failed", 1002);
            hashMap9.put(" SSL handshake aborted", 1003);
            f9847a.put(SSLHandshakeException.class.getSimpleName(), hashMap9);
            HashMap hashMap10 = new HashMap();
            hashMap10.put(" Hostname not verified", 1101);
            f9847a.put(SSLPeerUnverifiedException.class.getSimpleName(), hashMap10);
            HashMap hashMap11 = new HashMap();
            hashMap11.put(" Read error", 1201);
            f9847a.put(SSLProtocolException.class.getSimpleName(), hashMap11);
        }
    }

    /* renamed from: a */
    public static int m12795a(Throwable th) {
        int i = -1;
        if (th == null) {
            return -1;
        }
        m12796a();
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return -1;
        }
        int indexOf = message.indexOf(44);
        if (indexOf > 0) {
            message = message.substring(0, indexOf);
        }
        Map<String, Integer> map = f9847a.get(th.getClass().getSimpleName());
        if (map != null && !map.isEmpty()) {
            Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                if (message.contains(next.getKey())) {
                    Integer value = next.getValue();
                    if (value != null) {
                        i = value.intValue();
                    }
                }
            }
        }
        if (i >= 0) {
            return i;
        }
        if (th instanceof HttpResponseException) {
            return 199;
        }
        if (th instanceof EOFException) {
            return 599;
        }
        if (th instanceof IOException) {
            return 699;
        }
        return i;
    }

    /* renamed from: a */
    public static void m12798a(HttpRequestInfo httpRequestInfo, JSONObject jSONObject) {
        m12799b(httpRequestInfo, jSONObject);
    }

    /* renamed from: b */
    private static void m12799b(HttpRequestInfo httpRequestInfo, JSONObject jSONObject) {
        if (jSONObject != null && httpRequestInfo != null) {
            try {
                jSONObject.put("requestHeader", httpRequestInfo.requestHeaders);
                jSONObject.put("responseHeader", httpRequestInfo.responseHeaders);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m12797a(HttpRequestInfo httpRequestInfo, Throwable th, JSONObject jSONObject) {
        if (!(jSONObject == null || th == null)) {
            try {
                jSONObject.put("substatus", m12795a(th));
            } catch (Throwable unused) {
            }
        }
        m12799b(httpRequestInfo, jSONObject);
    }
}
