package com.ss.android.socialbase.downloader.setting;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.utils.LruCache;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.setting.a */
public class C60148a {

    /* renamed from: a */
    private static final LruCache<Integer, C60148a> f150110a = new LruCache<>(8, 8);

    /* renamed from: b */
    private static final C60148a f150111b = new C60148a(null);

    /* renamed from: c */
    private static JSONObject f150112c;

    /* renamed from: d */
    private static JSONObject f150113d;

    /* renamed from: e */
    private static Boolean f150114e;

    /* renamed from: f */
    private static boolean f150115f;

    /* renamed from: g */
    private static C60148a f150116g;

    /* renamed from: h */
    private final JSONObject f150117h;

    /* renamed from: i */
    private final JSONObject f150118i;

    /* renamed from: j */
    private final Boolean f150119j;

    /* renamed from: k */
    private int f150120k;

    /* renamed from: c */
    public static C60148a m233727c() {
        return f150111b;
    }

    /* renamed from: b */
    public static JSONObject m233725b() {
        return C60046b.m233016z();
    }

    static {
        m233723a();
    }

    /* renamed from: a */
    public static void m233723a() {
        boolean z;
        JSONObject z2 = C60046b.m233016z();
        boolean z3 = false;
        if (z2.optInt("disable_task_setting", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        f150115f = z;
        f150112c = z2.optJSONObject("disabled_task_keys");
        JSONObject optJSONObject = z2.optJSONObject("bugfix");
        Boolean bool = null;
        if (optJSONObject != null && optJSONObject.has("default")) {
            if (optJSONObject.optInt("default", 0) == 1) {
                z3 = true;
            }
            bool = Boolean.valueOf(z3);
        }
        f150113d = optJSONObject;
        f150114e = bool;
    }

    /* renamed from: a */
    public static C60148a m233720a(int i) {
        return m233721a(i, (DownloadInfo) null);
    }

    /* renamed from: c */
    public String mo205476c(String str) {
        return mo205472a(str, "");
    }

    /* renamed from: e */
    public static boolean m233729e(String str) {
        JSONObject jSONObject = f150112c;
        if (jSONObject == null || jSONObject.optInt(str, 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo205473a(String str) {
        return mo205475b(str, false);
    }

    /* renamed from: b */
    public int mo205474b(String str) {
        return mo205470a(str, 0);
    }

    /* renamed from: b */
    public static void m233726b(int i) {
        C60148a aVar = f150116g;
        if (aVar != null && aVar.f150120k == i) {
            f150116g = null;
        }
        LruCache<Integer, C60148a> lruCache = f150110a;
        synchronized (lruCache) {
            lruCache.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    private static C60148a m233728c(int i) {
        DownloadInfo downloadInfo;
        if (f150115f) {
            return f150111b;
        }
        Context G = C60046b.m232945G();
        if (G == null || (downloadInfo = Downloader.getInstance(G).getDownloadInfo(i)) == null) {
            return f150111b;
        }
        return m233722a(downloadInfo);
    }

    /* renamed from: d */
    public JSONObject mo205477d(String str) {
        JSONObject jSONObject = this.f150117h;
        if (jSONObject == null || !jSONObject.has(str) || m233729e(str)) {
            return m233725b().optJSONObject(str);
        }
        return this.f150117h.optJSONObject(str);
    }

    private C60148a(JSONObject jSONObject) {
        Boolean bool;
        this.f150117h = jSONObject;
        JSONObject jSONObject2 = null;
        r0 = null;
        r0 = null;
        Boolean bool2 = null;
        if (jSONObject == null || m233729e("bugfix")) {
            bool = null;
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("bugfix");
            if (optJSONObject != null && optJSONObject.has("default") && !m233729e("default")) {
                bool2 = Boolean.valueOf(optJSONObject.optInt("default", 0) == 1);
            }
            jSONObject2 = optJSONObject;
            bool = bool2;
        }
        this.f150118i = jSONObject2;
        this.f150119j = bool;
    }

    /* renamed from: a */
    private static C60148a m233722a(DownloadInfo downloadInfo) {
        if (f150115f) {
            return f150111b;
        }
        try {
            String downloadSettingString = downloadInfo.getDownloadSettingString();
            if (!TextUtils.isEmpty(downloadSettingString)) {
                return new C60148a(new JSONObject(downloadSettingString));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return f150111b;
    }

    /* renamed from: a */
    public static void m233724a(String str, boolean z) {
        int i;
        try {
            if (f150113d == null) {
                f150113d = new JSONObject();
            }
            JSONObject jSONObject = f150113d;
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put(str, i);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private static C60148a m233721a(int i, DownloadInfo downloadInfo) {
        C60148a aVar;
        C60148a aVar2;
        C60148a aVar3 = f150116g;
        if (aVar3 != null && aVar3.f150120k == i) {
            return aVar3;
        }
        LruCache<Integer, C60148a> lruCache = f150110a;
        synchronized (lruCache) {
            aVar = (C60148a) lruCache.get(Integer.valueOf(i));
        }
        if (aVar == null) {
            if (downloadInfo == null) {
                aVar2 = m233728c(i);
            } else {
                aVar2 = m233722a(downloadInfo);
            }
            aVar = aVar2;
            synchronized (lruCache) {
                lruCache.put(Integer.valueOf(i), aVar);
            }
        }
        aVar.f150120k = i;
        f150116g = aVar;
        return aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public boolean mo205475b(String str, boolean z) {
        if (this.f150118i != null && !m233729e(str)) {
            if (!this.f150118i.has(str)) {
                Boolean bool = this.f150119j;
                if (bool != null) {
                    return bool.booleanValue();
                }
            } else if (this.f150118i.optInt(str, z) == 1) {
                return true;
            } else {
                return false;
            }
        }
        JSONObject jSONObject = f150113d;
        if (jSONObject != null) {
            if (!jSONObject.has(str)) {
                Boolean bool2 = f150114e;
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
            } else if (f150113d.optInt(str, z ? 1 : 0) == 1) {
                return true;
            } else {
                return false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public int mo205470a(String str, int i) {
        JSONObject jSONObject = this.f150117h;
        if (jSONObject == null || !jSONObject.has(str) || m233729e(str)) {
            return m233725b().optInt(str, i);
        }
        return this.f150117h.optInt(str, i);
    }

    /* renamed from: a */
    public long mo205471a(String str, long j) {
        JSONObject jSONObject = this.f150117h;
        if (jSONObject == null || !jSONObject.has(str) || m233729e(str)) {
            return m233725b().optLong(str, j);
        }
        return this.f150117h.optLong(str, j);
    }

    /* renamed from: a */
    public String mo205472a(String str, String str2) {
        JSONObject jSONObject = this.f150117h;
        if (jSONObject == null || !jSONObject.has(str) || m233729e(str)) {
            return m233725b().optString(str, str2);
        }
        return this.f150117h.optString(str, str2);
    }
}
