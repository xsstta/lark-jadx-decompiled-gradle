package com.ss.android.lark.larkconfig.larksetting.handler.customnav;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.customnav.a */
public class C41176a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.customnav.a$a */
    public static class C41178a {

        /* renamed from: a */
        public static C41176a f104961a = new C41176a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo148476a() {
        return "sp_nav_config";
    }

    private C41176a() {
    }

    /* renamed from: b */
    public static C41176a m163374b() {
        return C41178a.f104961a;
    }

    /* renamed from: c */
    public Boolean mo148480c() {
        return Boolean.valueOf(UserSP.getInstance().getBoolean("nav_config_mode", false));
    }

    /* renamed from: a */
    public void mo148479a(boolean z) {
        UserSP.getInstance().putBoolean("nav_config_mode", z);
    }

    /* renamed from: a */
    private String m163373a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("primary_count", 1);
        JSONArray optJSONArray = jSONObject.optJSONArray("app_info");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Tab [ ");
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i).optJSONObject("name");
            if (optJSONObject != null) {
                sb.append(optJSONObject.optString("en_us"));
            } else {
                sb.append("null");
            }
            if (i == optInt - 1) {
                sb.append(" | ");
            } else if (i < optJSONArray.length() - 1) {
                sb.append(", ");
            }
        }
        sb.append(" ], primary count : ");
        sb.append(optInt);
        return sb.toString();
    }

    /* renamed from: a */
    private String m163372a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("app_info")) {
                return m163373a(jSONObject);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("main[");
            JSONArray optJSONArray = jSONObject.optJSONArray("mainNavigation");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i).optJSONObject("name");
                    if (optJSONObject != null) {
                        sb.append(optJSONObject.optString("en_us"));
                    } else {
                        sb.append("null");
                    }
                    if (i < optJSONArray.length() - 1) {
                        sb.append(", ");
                    }
                }
            }
            sb.append("], nav[");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("shortcutNavigation");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2).optJSONObject("name");
                    if (optJSONObject2 != null) {
                        sb.append(optJSONObject2.optString("en_us"));
                    } else {
                        sb.append("null");
                    }
                    if (i2 < optJSONArray2.length() - 1) {
                        sb.append(", ");
                    }
                }
            }
            sb.append("]");
            return sb.toString();
        } catch (Exception e) {
            Log.m165398w("CustomNavSettingHandler", "getDebugMsg", e);
            return null;
        }
    }

    /* renamed from: a */
    public String mo148477a(NavDataSource navDataSource) {
        Log.m165389i("CustomNavSettingHandler", "getNavTabs source " + navDataSource.name() + " " + UserSP.getInstance());
        UserSP instance = UserSP.getInstance();
        return instance.getString(mo148476a() + navDataSource.getSuffix(), "");
    }

    /* renamed from: a */
    public void mo148478a(String str, NavDataSource navDataSource) {
        Log.m165389i("CustomNavSettingHandler", "putNavConfigs " + m163372a(str) + " source " + navDataSource.name() + " " + UserSP.getInstance());
        UserSP instance = UserSP.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append(mo148476a());
        sb.append(navDataSource.getSuffix());
        instance.putString(sb.toString(), str);
    }
}
