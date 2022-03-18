package com.tt.miniapp.video.p3340c;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: com.tt.miniapp.video.c.d */
public class C67092d {
    /* renamed from: b */
    private static String m261546b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "1");
        hashMap.put("user", "toutiao");
        hashMap.put("video", str);
        hashMap.put("vtype", "mp4");
        String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
        hashMap.put("ts", valueOf);
        TreeSet<String> treeSet = new TreeSet(hashMap.keySet());
        StringBuilder sb = new StringBuilder();
        for (String str2 : treeSet) {
            sb.append(str2);
            sb.append((String) hashMap.get(str2));
        }
        sb.append("17601e2231500d8c3389dd5d6afd08de");
        String md5Hex = CharacterUtils.md5Hex(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("toutiao");
        arrayList.add(valueOf);
        arrayList.add(md5Hex);
        arrayList.add("mp4");
        arrayList.add(str);
        sb.delete(0, sb.length());
        sb.append(C67089a.f169143a);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append("/");
        }
        return sb.substring(0, sb.length() - 1);
    }

    /* renamed from: a */
    private static String m261545a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", "ff03bba36a");
        hashMap.put("video", str);
        hashMap.put("vtype", "mp4");
        hashMap.put("ts", String.valueOf(System.currentTimeMillis() / 1000));
        TreeSet<String> treeSet = new TreeSet(hashMap.keySet());
        StringBuilder sb = new StringBuilder();
        for (String str2 : treeSet) {
            sb.append(str2);
            sb.append((String) hashMap.get(str2));
        }
        sb.append("944fdf087f83a1f6b7aad88ec2793bbc");
        hashMap.put("sign", CharacterUtils.md5Hex(sb.toString()));
        Set<Map.Entry> entrySet = hashMap.entrySet();
        sb.delete(0, sb.length());
        sb.append("http://api.letvcloud.com/getplayurl.php");
        sb.append("?");
        for (Map.Entry entry : entrySet) {
            sb.append((String) entry.getKey());
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append((String) entry.getValue());
            sb.append(ContainerUtils.FIELD_DELIMITER);
        }
        return sb.substring(0, sb.length() - 1);
    }

    /* renamed from: a */
    public static String m261544a(int i, String str, long j, String str2, int i2, long j2, Map<String, String> map) {
        if (i == 0) {
            String b = m261546b(str);
            if (TextUtils.isEmpty(b)) {
                return b;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append("?");
            if (i2 > 0) {
                sb.append("play_type");
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(String.valueOf(i2));
            }
            if (j > 0) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append("item_id");
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(String.valueOf(j));
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append("category");
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(str2);
            }
            if (j2 > 0) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append("ad_id");
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(String.valueOf(j2));
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    try {
                        sb.append(String.format("&%s=%s", entry.getKey(), URLEncoder.encode(entry.getValue(), "UTF-8")));
                    } catch (UnsupportedEncodingException e) {
                        AppBrandLogger.stacktrace(6, "VideoUrlDepend", e.getStackTrace());
                    }
                }
            }
            try {
                sb.append(String.format("&device_type=%s", URLEncoder.encode(Build.MODEL, "UTF-8")));
            } catch (UnsupportedEncodingException e2) {
                AppBrandLogger.stacktrace(6, "VideoUrlDepend", e2.getStackTrace());
            }
            return sb.toString();
        } else if (i != 1) {
            return "";
        } else {
            return m261545a(str);
        }
    }
}
