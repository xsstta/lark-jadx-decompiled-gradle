package com.bytedance.ttnet.http;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.AbstractC13986c;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.frameworks.baselib.network.http.parser.StreamParser;
import com.bytedance.frameworks.baselib.network.http.util.C14091i;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.http.b */
public class C20773b {
    /* renamed from: a */
    public static String m75677a(final String str, Map<String, String> map, Map<String, List<String>> map2, C20772a aVar) throws Throwable {
        Throwable th;
        String str2;
        Map<String, List<String>> headerFields;
        HttpURLConnection httpURLConnection = null;
        if (StringUtils.isEmpty(str) || aVar == null || !NetworkUtils.isNetworkAvailable(TTNetInit.getTTNetDepend().mo69984a())) {
            return null;
        }
        try {
            if (aVar.f50902g) {
                String addCommonParams = NetworkParams.addCommonParams(str, true);
                if (!TextUtils.isEmpty(addCommonParams)) {
                    if (addCommonParams.equals(str)) {
                        StringBuilder sb = new StringBuilder(addCommonParams);
                        if (addCommonParams.indexOf(63) < 0) {
                            sb.append("?");
                        } else {
                            sb.append(ContainerUtils.FIELD_DELIMITER);
                        }
                        sb.append("aid=");
                        sb.append(TTNetInit.getTTNetDepend().mo69999j());
                        sb.append("&device_platform=");
                        sb.append("android");
                        if (TTNetInit.getCronetProvider() != null) {
                            sb.append("&version_code=");
                            sb.append(TTNetInit.getCronetProvider().getVersionCode());
                            sb.append("&channel=");
                            sb.append(TTNetInit.getCronetProvider().getChannel());
                            sb.append("device_id");
                            sb.append(TTNetInit.getCronetProvider().getDeviceId());
                        }
                        str = sb.toString();
                    } else {
                        str = addCommonParams;
                    }
                }
            }
            final HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setRequestMethod("GET");
                httpURLConnection2.setConnectTimeout(NetworkParams.getConnectTimeout());
                httpURLConnection2.setReadTimeout(NetworkParams.getIoTimeout());
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                if (aVar.f50901f) {
                    str2 = " HttpsURLConnection";
                } else {
                    str2 = " HttpURLConnection";
                }
                httpURLConnection2.setRequestProperty("User-Agent", "ttnet" + str2);
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                int responseCode = httpURLConnection2.getResponseCode();
                aVar.f50896a = responseCode;
                if (!(map2 == null || httpURLConnection2.getHeaderFields() == null || (headerFields = httpURLConnection2.getHeaderFields()) == null)) {
                    for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                        String key = entry2.getKey();
                        if (!TextUtils.isEmpty(key)) {
                            map2.put(key.toLowerCase(), entry2.getValue());
                        }
                    }
                }
                if (!aVar.f50901f) {
                    aVar.f50900e = httpURLConnection2.getHeaderField("X-SS-SIGN");
                }
                aVar.f50903h = httpURLConnection2.getHeaderField("x-ss-etag");
                aVar.f50904i = httpURLConnection2.getHeaderField("x-tt-tnc-abtest");
                if (responseCode == 200) {
                    InputStream inputStream = httpURLConnection2.getInputStream();
                    boolean equals = "gzip".equals(httpURLConnection2.getHeaderField("Content-Encoding"));
                    String headerField = httpURLConnection2.getHeaderField("Content-Type");
                    boolean testIsSSBinary = StreamParser.testIsSSBinary(headerField);
                    Pair<String, String> parseContentType = RetrofitUtils.parseContentType(headerField);
                    String str3 = (parseContentType == null || parseContentType.second == null || !Charset.isSupported((String) parseContentType.second)) ? null : (String) parseContentType.second;
                    if (str3 == null) {
                        str3 = "UTF-8";
                    }
                    int[] iArr = {0};
                    byte[] response2buf = StreamParser.response2buf(equals, httpURLConnection2.getHeaderFields(), -1, inputStream, iArr, new AbstractC13986c() {
                        /* class com.bytedance.ttnet.http.C20773b.C207741 */

                        @Override // com.bytedance.frameworks.baselib.network.http.AbstractC13986c
                        /* renamed from: b */
                        public void mo51424b() {
                            try {
                                HttpURLConnection httpURLConnection = httpURLConnection2;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                            } catch (Throwable unused) {
                            }
                        }

                        @Override // com.bytedance.frameworks.baselib.network.http.AbstractC13986c
                        /* renamed from: a */
                        public URI mo51423a() {
                            try {
                                return C14091i.m57053a(str);
                            } catch (RuntimeException unused) {
                                return null;
                            }
                        }
                    });
                    if (response2buf != null && iArr[0] > 0) {
                        if (iArr[0] <= response2buf.length) {
                            if (testIsSSBinary) {
                                StreamParser.decodeSSBinary(response2buf, iArr[0]);
                            }
                            String str4 = new String(response2buf, 0, iArr[0], str3);
                            if (httpURLConnection2 != null) {
                                try {
                                    httpURLConnection2.disconnect();
                                } catch (Exception unused) {
                                }
                            }
                            return str4;
                        }
                    }
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused2) {
                        }
                    }
                    return null;
                }
                throw new IOException("err status = " + responseCode);
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                try {
                    th.printStackTrace();
                    throw th;
                } catch (Throwable th3) {
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            th.printStackTrace();
            throw th;
        }
    }
}
