package com.larksuite.framework.http.request;

import android.text.TextUtils;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

public class HttpHeaders implements Serializable {
    public static final TimeZone GMT_TIME_ZONE = TimeZone.getTimeZone("GMT");
    private static String acceptLanguage = null;
    private static final long serialVersionUID = 8458647755751403873L;
    private static String userAgent;
    public LinkedHashMap<String, String> headersMap;

    public static String getCacheControl(String str, String str2) {
        if (str != null) {
            return str;
        }
        if (str2 != null) {
            return str2;
        }
        return null;
    }

    public HttpHeaders() {
        init();
    }

    private void init() {
        this.headersMap = new LinkedHashMap<>();
    }

    public void clear() {
        this.headersMap.clear();
    }

    public Set<String> getNames() {
        return this.headersMap.keySet();
    }

    public static String getUserAgent() {
        if (TextUtils.isEmpty(userAgent)) {
            userAgent = "Mozilla/5.0 (Linux; U; Android 5.0.2; zh-cn; Redmi Note 3 Build/LRX22G) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Mobile Safari/537.36";
        }
        return userAgent;
    }

    public boolean isEmpty() {
        LinkedHashMap<String, String> linkedHashMap = this.headersMap;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "HttpHeaders{headersMap=" + this.headersMap + '}';
    }

    public static String getAcceptLanguage() {
        if (!TextUtils.isEmpty(acceptLanguage)) {
            return acceptLanguage;
        }
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
            sb.append(',');
            sb.append(language);
            sb.append(";q=0.8");
        }
        String sb2 = sb.toString();
        acceptLanguage = sb2;
        return sb2;
    }

    public final String toJSONString() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.headersMap.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static void setAcceptLanguage(String str) {
        acceptLanguage = str;
    }

    public static void setUserAgent(String str) {
        userAgent = str;
    }

    public static long getDate(String str) {
        try {
            return parseGMTToMillis(str);
        } catch (ParseException unused) {
            return 0;
        }
    }

    public static long getExpiration(String str) {
        try {
            return parseGMTToMillis(str);
        } catch (ParseException unused) {
            return -1;
        }
    }

    public static long getLastModified(String str) {
        try {
            return parseGMTToMillis(str);
        } catch (ParseException unused) {
            return 0;
        }
    }

    public static String getDate(long j) {
        return formatMillisToGMT(j);
    }

    public String get(String str) {
        return this.headersMap.get(str);
    }

    public String remove(String str) {
        return this.headersMap.remove(str);
    }

    public static String formatMillisToGMT(long j) {
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM y HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(GMT_TIME_ZONE);
        return simpleDateFormat.format(date);
    }

    public static long parseGMTToMillis(String str) throws ParseException {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM y HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(GMT_TIME_ZONE);
        return simpleDateFormat.parse(str).getTime();
    }

    public void put(HttpHeaders httpHeaders) {
        LinkedHashMap<String, String> linkedHashMap;
        if (httpHeaders != null && (linkedHashMap = httpHeaders.headersMap) != null && !linkedHashMap.isEmpty()) {
            this.headersMap.putAll(httpHeaders.headersMap);
        }
    }

    public HttpHeaders(String str, String str2) {
        init();
        put(str, str2);
    }

    public void put(String str, String str2) {
        if (str != null && str2 != null) {
            this.headersMap.put(str, str2);
        }
    }
}
