package com.bytedance.ee.bear.doc.resupdate;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.doc.resupdate.b */
public class C5451b {

    /* renamed from: a */
    String f15511a = "preload";

    /* renamed from: b */
    private String f15512b;

    /* renamed from: c */
    private String f15513c;

    /* renamed from: a */
    public boolean mo21823a(String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54775e("CheckResHelper", "checkResourceIsValid, filePath is empty");
            m22102a("file_not_exist", str);
            return false;
        }
        HashMap hashMap = new HashMap();
        if (!m22103a(new File(str), hashMap)) {
            return false;
        }
        C13479a.m54772d("CheckResHelper", "checkResourceIsValid md5 file is ready");
        return m22104a(hashMap);
    }

    /* renamed from: a */
    private boolean m22104a(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            File h = C13675f.m55536h(key);
            if (h == null || !h.exists()) {
                C13479a.m54775e("CheckResHelper", " checkFilesCompletion(): not found file on: = " + key);
                m22102a("file_not_exist", key);
                return false;
            }
            String value = entry.getValue();
            String a = C13598b.m55189a(h);
            if (!TextUtils.equals(value, a)) {
                C13479a.m54775e("CheckResHelper", " checkFilesCompletion(): invalid file name = " + h.getName() + ",right md5 = " + value + ",error md5 = " + a);
                StringBuilder sb = new StringBuilder();
                sb.append(value);
                sb.append(",");
                sb.append(a);
                m22102a("file_damage", sb.toString());
                return false;
            }
        }
        return true;
    }

    public C5451b(String str, String str2) {
        this.f15512b = str;
        this.f15513c = str2;
    }

    /* renamed from: a */
    private void m22102a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scm_version", this.f15512b);
            jSONObject.put("stage", this.f15511a);
            jSONObject.put(ShareHitPoint.f121869d, this.f15513c);
            jSONObject.put("error_type", str);
            jSONObject.put("errorMsg", str2);
        } catch (JSONException e) {
            C13479a.m54759a("CheckResHelper", "onTrackResFailReason failed", e);
        }
        ((AbstractC5470j) KoinJavaComponent.m268610a(AbstractC5470j.class)).mo21878a("dev_performance_res_fail_cause", jSONObject);
    }

    /* renamed from: b */
    private static boolean m22105b(File file, Map<String, String> map) {
        List<String> j = C13675f.m55539j(file);
        if (!(j == null || j.size() == 0)) {
            String str = file.getParent() + File.separator;
            try {
                for (String str2 : j) {
                    String[] split = str2.trim().split(" ");
                    map.put(str + split[0], split[1]);
                }
                return true;
            } catch (Exception e) {
                C13479a.m54761a("CheckResHelper", e);
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m22103a(File file, Map<String, String> map) {
        File[] listFiles = file.listFiles();
        if (listFiles == null || file.length() == 0) {
            C13479a.m54775e("CheckResHelper", "checkMd5TableFile 11 verifyMd5ByReadFileList: not found .md5,file = " + file);
            m22102a("md5_not_exist", "md5_not_exist");
            return false;
        }
        File file2 = null;
        int length = listFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            File file3 = listFiles[i];
            if (file3.getName().endsWith(".md5")) {
                file2 = file3;
                break;
            }
            i++;
        }
        if (file2 == null) {
            C13479a.m54775e("CheckResHelper", "checkMd5TableFile 22 verifyMd5ByReadFileList: not found .md5");
            m22102a("md5_not_exist", "md5_not_exist");
            return false;
        }
        String substring = file2.getName().substring(0, file2.getName().lastIndexOf(".md5"));
        boolean equals = TextUtils.equals(substring, C13598b.m55189a(file2));
        if (equals) {
            m22105b(file2, map);
        } else {
            C13479a.m54775e("CheckResHelper", "checkMd5TableFile: md5 file error: right=" + substring + ",error=" + C13598b.m55189a(file2));
            StringBuilder sb = new StringBuilder();
            sb.append(substring);
            sb.append(",");
            sb.append(C13598b.m55189a(file2));
            m22102a("md5_damage", sb.toString());
        }
        return equals;
    }
}
