package com.bytedance.ee.bear.drive.loader.download.platform.abs;

import android.text.TextUtils;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.model.C7088b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.abs.h */
public class C7046h {
    /* renamed from: a */
    private static int m28054a(int i) {
        if (i != 0) {
            return i;
        }
        C13479a.m54764b("DrivePlatform_UrlSplicer", "correctServerPreviewType() pdf 0 to 9 for download url");
        return 9;
    }

    /* renamed from: a */
    static String m28056a(C7088b bVar) {
        String str = "https://" + C6313i.f17510b + "/space/api/box/stream/sdk/download/preview/?app_id=" + bVar.mo27322a().f19101m + "&app_file_id=" + bVar.mo27322a().f18785a + "&preview_type=" + m28054a(bVar.mo27329c());
        if (!TextUtils.isEmpty(bVar.mo27322a().f19102n)) {
            str = str + "&auth_extra=" + bVar.mo27322a().f19102n;
        }
        C13479a.m54764b("DrivePlatform_UrlSplicer", "spliceV2PreviewUrl url= " + C13721c.m55650d(str));
        return str;
    }

    /* renamed from: b */
    static String m28060b(C7088b bVar) {
        String str = "https://" + C6313i.f17510b + "/space/api/box/stream/sdk/download/preview_sub/?app_id=" + bVar.mo27322a().f19101m + "&app_file_id=" + bVar.mo27322a().f18785a + "&preview_type=" + m28054a(bVar.mo27329c());
        if (!TextUtils.isEmpty(bVar.mo27322a().f19102n)) {
            str = str + "&auth_extra=" + bVar.mo27322a().f19102n;
        }
        C13479a.m54764b("DrivePlatform_UrlSplicer", "spliceV2PreviewUrl url= " + C13721c.m55650d(str));
        return str;
    }

    /* renamed from: c */
    static String m28061c(C7088b bVar) {
        String str = "https://" + C6313i.f17510b + "/space/api/box/stream/sdk/download/preview/?app_id=" + bVar.mo27322a().f19101m + "&app_file_id=" + bVar.mo27322a().f18785a + "&preview_type=" + 16;
        if (!TextUtils.isEmpty(bVar.mo27322a().f19102n)) {
            str = str + "&auth_extra=" + bVar.mo27322a().f19102n;
        }
        C13479a.m54764b("DrivePlatform_UrlSplicer", "spliceV2SourceUrl url= " + C13721c.m55650d(str));
        return str;
    }

    /* renamed from: a */
    public static String m28055a(C7086a aVar) {
        String str = "https://" + C6313i.f17510b + "/space/api/box/stream/download/preview/" + aVar.mo27322a().f18785a + "?version=" + aVar.mo27322a().f19098q + "&preview_type=" + m28054a(aVar.mo27329c());
        if (!TextUtils.isEmpty(aVar.mo27322a().mo27363f())) {
            str = str + "&extra=" + aVar.mo27322a().mo27363f();
        }
        if (!TextUtils.isEmpty(aVar.mo27322a().f19095n)) {
            str = str + "&mount_point=" + aVar.mo27322a().f19095n;
        }
        C13479a.m54764b("DrivePlatform_UrlSplicer", "spliceV1PreviewUrl notExpiredUrl = " + C13721c.m55650d(str));
        return str;
    }

    /* renamed from: b */
    static String m28059b(C7086a aVar) {
        String str = "https://" + C6313i.f17510b + "/space/api/box/stream/download/preview_sub/" + aVar.mo27322a().f18785a + "?version=" + aVar.mo27322a().f19098q + "&preview_type=" + m28054a(aVar.mo27329c());
        if (!TextUtils.isEmpty(aVar.mo27322a().mo27363f())) {
            str = str + "&extra=" + aVar.mo27322a().mo27363f();
        }
        if (!TextUtils.isEmpty(aVar.mo27322a().f19095n)) {
            str = str + "&mount_point=" + aVar.mo27322a().f19095n;
        }
        C13479a.m54764b("DrivePlatform_UrlSplicer", "spliceV1PreviewSubUrl notExpiredUrl = " + C13721c.m55650d(str));
        return str;
    }

    /* renamed from: a */
    static Map<String, String> m28058a(Map<String, String> map, C7086a aVar) {
        if (CollectionUtils.isEmpty(map) || TextUtils.isEmpty(aVar.mo27322a().mo27363f())) {
            return map;
        }
        try {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String a = m28057a(entry.getValue(), "extra", aVar.mo27322a().mo27363f());
                if (!TextUtils.isEmpty(aVar.mo27322a().f19095n)) {
                    a = m28057a(a, "mount_point", aVar.mo27322a().f19095n);
                }
                hashMap.put(entry.getKey(), a);
            }
            return hashMap;
        } catch (Exception e) {
            C13479a.m54759a("DrivePlatform_UrlSplicer", "spliceTranscodeUrls() build url error", e);
            return map;
        }
    }

    /* renamed from: a */
    private static String m28057a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        if (str.contains(ContainerUtils.FIELD_DELIMITER + str2 + ContainerUtils.KEY_VALUE_DELIMITER)) {
            return str;
        }
        if (str.contains("?")) {
            return str + ContainerUtils.FIELD_DELIMITER + str2 + ContainerUtils.KEY_VALUE_DELIMITER + str3;
        }
        return str + "?" + str2 + ContainerUtils.KEY_VALUE_DELIMITER + str3;
    }
}
