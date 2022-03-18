package com.bytedance.ee.bear.drive.preload;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13602d;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p702e.C13657b;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.TTVideoEngine;
import java.io.File;

/* renamed from: com.bytedance.ee.bear.drive.preload.c */
public class C7115c {

    /* renamed from: a */
    private Context f19174a = C13615c.f35773a;

    public C7115c() {
        C7121h.m28528a();
    }

    /* renamed from: a */
    public static String m28487a(String str) {
        if (TextUtils.isEmpty(C13602d.m55222a(str))) {
            return null;
        }
        return C13602d.m55222a(str);
    }

    /* renamed from: c */
    private static String m28489c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a = m28487a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return a.concat(".json");
    }

    /* renamed from: b */
    private File m28488b(String str) {
        File f = C6880a.m27109f(this.f19174a);
        if (!f.exists()) {
            f.mkdirs();
        }
        String c = m28489c(str);
        if (!TextUtils.isEmpty(c)) {
            return new File(f, c);
        }
        return null;
    }

    /* renamed from: a */
    public VideoCacheInfo mo27842a(File file) {
        if (file == null || !file.exists()) {
            C13479a.m54758a("VideoCacheInfoManager", "getVideoCacheInfo PreviewUrlResult is null");
            return null;
        }
        byte[] e = C13675f.m55530e(file);
        if (e == null) {
            C13479a.m54758a("VideoCacheInfoManager", "getVideoCacheInfo resultBytes is null");
            return null;
        }
        DriveCacheInfo driveCacheInfo = (DriveCacheInfo) JSON.parseObject(e, DriveCacheInfo.class, new Feature[0]);
        if (driveCacheInfo == null) {
            C13479a.m54758a("VideoCacheInfoManager", "getVideoCacheInfo parse result is null");
            return null;
        }
        DataLoaderHelper.DataLoaderCacheInfo cacheInfo = TTVideoEngine.getCacheInfo(m28490d(driveCacheInfo.getObjToken(), driveCacheInfo.getDataVersion()));
        if (cacheInfo != null) {
            return new VideoCacheInfo(cacheInfo, driveCacheInfo);
        }
        C13479a.m54772d("VideoCacheInfoManager", "getVideoCacheInfo no cacheInfo");
        return null;
    }

    /* renamed from: d */
    public static String m28490d(String str, String str2) {
        if (TextUtils.isEmpty(C13602d.m55222a(str))) {
            return null;
        }
        return C13602d.m55222a(str).concat("_").concat(str2);
    }

    /* renamed from: a */
    public void mo27843a(C7086a aVar, String str) {
        if (!C13657b.m55422a(aVar.mo27336e()) || !TextUtils.isEmpty(aVar.mo27340g())) {
            File b = m28488b(str);
            if (b == null) {
                C13479a.m54764b("VideoCacheInfoManager", "driveCacheInfoFile is null");
            } else if (C13675f.m55507a(JSON.toJSONString(new DriveCacheInfo(aVar)).getBytes(), b)) {
                C13479a.m54764b("VideoCacheInfoManager", "result info byteToFile success");
            }
        }
    }

    /* renamed from: b */
    public C7086a mo27845b(String str, String str2) {
        VideoCacheInfo c = mo27846c(str, str2);
        if (c == null || !c.isCacheValid()) {
            return null;
        }
        C13479a.m54764b("VideoCacheInfoManager", "video file info hit cache");
        C7086a fileModel = c.getFileModel();
        fileModel.mo27328b(true);
        fileModel.mo27335d(true);
        fileModel.mo27338e(true);
        return fileModel;
    }

    /* renamed from: c */
    public VideoCacheInfo mo27846c(String str, String str2) {
        File b = m28488b(str);
        if (b == null || !b.exists()) {
            C13479a.m54758a("VideoCacheInfoManager", "getVideoCacheInfo PreviewUrlResult is null");
            return null;
        }
        byte[] e = C13675f.m55530e(b);
        if (e == null) {
            C13479a.m54758a("VideoCacheInfoManager", "getVideoCacheInfo resultBytes is null");
            return null;
        }
        DriveCacheInfo driveCacheInfo = (DriveCacheInfo) JSON.parseObject(e, DriveCacheInfo.class, new Feature[0]);
        if (driveCacheInfo == null) {
            C13479a.m54758a("VideoCacheInfoManager", "getVideoCacheInfo parse result is null");
            return null;
        } else if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, driveCacheInfo.getDataVersion())) {
            DataLoaderHelper.DataLoaderCacheInfo cacheInfo = TTVideoEngine.getCacheInfo(m28490d(str, driveCacheInfo.getDataVersion()));
            if (cacheInfo != null) {
                return new VideoCacheInfo(cacheInfo, driveCacheInfo);
            }
            C13479a.m54772d("VideoCacheInfoManager", "getVideoCacheInfo no cacheInfo");
            return null;
        } else {
            C13479a.m54758a("VideoCacheInfoManager", "getVideoCacheInfo dataVersion changed");
            return null;
        }
    }

    /* renamed from: a */
    public void mo27844a(String str, String str2) {
        TTVideoEngine.removeCacheFile(m28490d(str, str2));
        File f = C6880a.m27109f(this.f19174a);
        String c = m28489c(str);
        if (!TextUtils.isEmpty(c)) {
            File file = new File(f, c);
            if (file.exists() && file.delete()) {
                C13479a.m54758a("VideoCacheInfoManager", "delete cache file success");
                return;
            }
            return;
        }
        C13479a.m54758a("VideoCacheInfoManager", "delete cache fileName is null");
    }
}
