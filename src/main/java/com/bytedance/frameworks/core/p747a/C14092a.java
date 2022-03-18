package com.bytedance.frameworks.core.p747a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.core.a.a */
public class C14092a {

    /* renamed from: a */
    private static AbstractC14093a f37032a;

    /* renamed from: b */
    private static boolean f37033b;

    /* renamed from: com.bytedance.frameworks.core.a.a$a */
    public interface AbstractC14093a {
        /* renamed from: c */
        boolean mo51824c();

        /* renamed from: d */
        boolean mo51825d();

        /* renamed from: e */
        boolean mo51826e();
    }

    /* renamed from: a */
    public static void m57060a(AbstractC14093a aVar) {
        f37032a = aVar;
    }

    /* renamed from: a */
    private static String m57056a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m57057a(String str, List<Pair<String, String>> list) {
        if (TextUtils.isEmpty(str) || f37032a == null || f37033b) {
            return str;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Uri parse = Uri.parse(str);
            m57059a(parse, linkedHashMap);
            LinkedList linkedList = new LinkedList();
            m57061a(linkedHashMap, linkedList, "device_id");
            m57061a(linkedHashMap, linkedList, "device_type");
            m57061a(linkedHashMap, linkedList, "device_brand");
            m57061a(linkedHashMap, linkedList, "uuid");
            m57061a(linkedHashMap, linkedList, "openudid");
            String a = m57058a((List<Pair<String, List<String>>>) linkedList, false, "UTF-8");
            if (TextUtils.isEmpty(a)) {
                return str;
            }
            byte[] bytes = a.getBytes();
            byte[] a2 = EncryptorUtil.m57089a(bytes, bytes.length);
            if (a2 == null) {
                return str;
            }
            String encodeToString = Base64.encodeToString(a2, 2);
            LinkedList linkedList2 = new LinkedList();
            if (f37032a.mo51824c()) {
                LinkedList linkedList3 = new LinkedList();
                linkedList3.add(encodeToString);
                linkedList2.add(new Pair("ss_queries", linkedList3));
            }
            if (f37032a.mo51825d() && list != null) {
                list.add(new Pair<>("X-SS-QUERIES", m57056a(encodeToString, "UTF-8")));
            }
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null) {
                        linkedList2.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                }
            }
            return m57055a(parse.getScheme(), parse.getHost(), parse.getPort(), parse.getPath(), m57058a((List<Pair<String, List<String>>>) linkedList2, true, "UTF-8"), parse.getFragment()).toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    public static void m57059a(Uri uri, Map<String, List<String>> map) throws IOException {
        if (uri == null) {
            throw new IOException("parseUrl url is null !!!");
        } else if (map != null) {
            try {
                String encodedQuery = uri.getEncodedQuery();
                if (encodedQuery != null) {
                    String[] split = encodedQuery.split(ContainerUtils.FIELD_DELIMITER);
                    for (String str : split) {
                        int indexOf = str.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                        if (indexOf >= 0) {
                            String decode = URLDecoder.decode(str.substring(0, indexOf), "UTF-8");
                            List<String> list = map.get(decode);
                            if (list == null) {
                                list = new LinkedList<>();
                            }
                            list.add(URLDecoder.decode(str.substring(indexOf + 1), "UTF-8"));
                            map.put(decode, list);
                        } else {
                            String decode2 = URLDecoder.decode(str, "UTF-8");
                            List<String> list2 = map.get(decode2);
                            if (list2 == null) {
                                list2 = new LinkedList<>();
                            }
                            list2.add("");
                            map.put(decode2, list2);
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                throw new IOException("parseUrl url is null !!!");
            }
        }
    }

    /* renamed from: a */
    private static boolean m57061a(Map<String, List<String>> map, List<Pair<String, List<String>>> list, String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str) || list == null || !map.containsKey(str)) {
            return false;
        }
        list.add(new Pair<>(str, map.get(str)));
        if (f37032a.mo51826e()) {
            return true;
        }
        map.remove(str);
        return true;
    }

    /* renamed from: a */
    private static String m57058a(List<Pair<String, List<String>>> list, boolean z, String str) {
        StringBuilder sb = new StringBuilder();
        for (Pair<String, List<String>> pair : list) {
            String str2 = (String) pair.first;
            if (z) {
                str2 = m57056a((String) pair.first, str);
            }
            List<String> list2 = (List) pair.second;
            if (list2 != null && list2.size() > 0) {
                for (String str3 : list2) {
                    if (z) {
                        if (str3 != null) {
                            str3 = m57056a(str3, str);
                        } else {
                            str3 = "";
                        }
                    }
                    if (sb.length() > 0) {
                        sb.append(ContainerUtils.FIELD_DELIMITER);
                    }
                    sb.append(str2);
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(str3);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static Uri m57055a(String str, String str2, int i, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append("://");
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(':');
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append('/');
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return Uri.parse(sb.toString());
    }
}
