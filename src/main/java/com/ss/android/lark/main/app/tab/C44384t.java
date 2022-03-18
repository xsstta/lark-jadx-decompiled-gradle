package com.ss.android.lark.main.app.tab;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.maincore.dto.TabInfo;
import com.ss.android.lark.widget.tab.MainTabItemView;
import com.ss.android.lark.widget.tab.NavigationTabItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.ss.android.lark.main.app.tab.t */
public class C44384t {
    /* renamed from: a */
    private static List<EditorTabInfo> m176130a(List<AbstractC44552i> list, List<TabAppInfo> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (TabAppInfo tabAppInfo : list2) {
            AbstractC44552i a = m176126a(list, tabAppInfo.getKey());
            if (a != null) {
                View j = a.mo31319j();
                if (j instanceof NavigationTabItemView) {
                    NavigationTabItemView navigationTabItemView = (NavigationTabItemView) j;
                    String textContent = navigationTabItemView.getTextContent();
                    Drawable defaultDrawable = navigationTabItemView.getDefaultDrawable();
                    View c = a.mo31312c();
                    arrayList.add(new EditorTabInfo(tabAppInfo.getKey(), textContent, defaultDrawable, tabAppInfo.isUnmovable(), tabAppInfo.isPrimaryOnly(), c instanceof MainTabItemView ? ((MainTabItemView) c).mo201241g() : true, new Function1(j) {
                        /* class com.ss.android.lark.main.app.tab.$$Lambda$t$YcZiY6rEcjqYb_rRRgdZTwcSTL0 */
                        public final /* synthetic */ View f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C44384t.m176121a(AbstractC44552i.this, this.f$1, (String) obj);
                        }
                    }));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m176128a(TabInfo tabInfo) {
        return JSONObject.toJSONString(tabInfo);
    }

    /* renamed from: b */
    public static EditorTabInfoList m176131b(List<AbstractC44552i> list) {
        TabInfo b = C44373s.m176069a().mo157637b();
        return new EditorTabInfoList(m176130a(list, b.getMainApps()), m176130a(list, b.getNavApps()));
    }

    /* renamed from: b */
    private static String m176132b(String str) {
        if ("APP_TYPE_NATIVE".equals(str)) {
            return "native";
        }
        if ("APP_TYPE_WEB".equals(str)) {
            return "webapp";
        }
        if ("APP_TYPE_MINI".equals(str)) {
            return "gadget";
        }
        return str;
    }

    /* renamed from: a */
    public static TabInfo m176124a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new TabInfo();
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("tabs");
            if (optJSONObject != null) {
                jSONObject = optJSONObject;
            }
            if (jSONObject.has("app_info")) {
                return m176125a(jSONObject);
            }
            TabInfo tabInfo = new TabInfo();
            JSONArray optJSONArray = jSONObject.optJSONArray("mainNavigation");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    TabAppInfo a = m176122a(optJSONArray.optJSONObject(i), false);
                    if (a != null) {
                        tabInfo.addMainTab(a);
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("shortcutNavigation");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    TabAppInfo a2 = m176122a(optJSONArray2.optJSONObject(i2), false);
                    if (a2 != null) {
                        tabInfo.addNavTab(a2);
                    }
                }
            }
            return tabInfo;
        } catch (JSONException e) {
            Log.m165384e("MainModule_TabParser", "parseToTabInfo failed cause of illegal json config", e);
            return new TabInfo();
        }
    }

    /* renamed from: a */
    public static TabInfo m176123a(EditorTabInfoList cVar) {
        TabInfo tabInfo = new TabInfo();
        TabInfo b = C44373s.m176069a().mo157637b();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(b.getMainApps());
        arrayList.addAll(b.getNavApps());
        for (EditorTabInfo bVar : cVar.mo157560a()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TabAppInfo tabAppInfo = (TabAppInfo) it.next();
                if (bVar.mo157553a().equals(tabAppInfo.getKey())) {
                    tabInfo.addMainTab(tabAppInfo);
                    break;
                }
            }
        }
        arrayList.removeAll(tabInfo.getMainApps());
        for (EditorTabInfo bVar2 : cVar.mo157561b()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TabAppInfo tabAppInfo2 = (TabAppInfo) it2.next();
                if (bVar2.mo157553a().equals(tabAppInfo2.getKey())) {
                    tabInfo.addNavTab(tabAppInfo2);
                    break;
                }
            }
        }
        return tabInfo;
    }

    /* renamed from: a */
    private static TabInfo m176125a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return new TabInfo();
        }
        TabInfo tabInfo = new TabInfo();
        int optInt = jSONObject.optInt("primary_count", 1);
        if (optInt > 5) {
            optInt = 5;
        }
        tabInfo.setPrimaryCount(optInt);
        JSONArray optJSONArray = jSONObject.optJSONArray("app_info");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                TabAppInfo a = m176122a(optJSONArray.optJSONObject(i), true);
                if (a != null) {
                    if (i < optInt) {
                        tabInfo.addMainTab(a);
                    } else {
                        tabInfo.addNavTab(a);
                    }
                }
            }
        }
        return tabInfo;
    }

    /* renamed from: a */
    public static String m176127a(TabAppInfo tabAppInfo) {
        if (tabAppInfo == null) {
            return "";
        }
        return tabAppInfo.getKey() + "-" + tabAppInfo.getAppType();
    }

    /* renamed from: a */
    public static String m176129a(List<TabAppInfo> list) {
        if (list == null || list.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (TabAppInfo tabAppInfo : list) {
            sb.append(m176127a(tabAppInfo));
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    private static AbstractC44552i m176126a(List<AbstractC44552i> list, String str) {
        for (AbstractC44552i iVar : list) {
            if (iVar != null && TextUtils.equals(iVar.mo31311b(), str)) {
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static TabAppInfo m176122a(org.json.JSONObject jSONObject, boolean z) {
        if (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("key"))) {
            Log.m165397w("MainModule_TabParser", "failed to app info  cause of empty key");
            return null;
        }
        TabAppInfo tabAppInfo = new TabAppInfo(jSONObject.optString("key"));
        tabAppInfo.setAppType(m176132b(jSONObject.optString("appType", "")));
        if (z) {
            tabAppInfo.setId(jSONObject.optString("id", ""));
        } else {
            tabAppInfo.setId(jSONObject.optString("ID", ""));
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("logo");
        if (optJSONObject != null) {
            TabAppInfo.Logo logo = new TabAppInfo.Logo();
            logo.setSecretaryBgColor(optJSONObject.optString("secretary_bgcolor", ""));
            if (z) {
                logo.setSecretaryDefault(optJSONObject.optString("shortcut_default", ""));
            } else {
                logo.setSecretaryDefault(optJSONObject.optString("secretary_default", ""));
            }
            logo.setPrimaryDefault(optJSONObject.optString("primary_default", ""));
            logo.setPrimarySelected(optJSONObject.optString("primary_selected", ""));
            logo.setPrimaryColorPng(optJSONObject.optString("primary_color_png", ""));
            tabAppInfo.setLogo(logo);
        } else {
            Log.m165397w("MainModule_TabParser", "failed to parse logo cause of null");
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("name");
        if (optJSONObject2 != null) {
            TabAppInfo.Name name = new TabAppInfo.Name();
            name.setCn(optJSONObject2.optString("zh_CN", ""));
            name.setJp(optJSONObject2.optString("ja_JP", ""));
            name.setUs(optJSONObject2.optString("en_US", ""));
            if (TextUtils.isEmpty(name.getCn())) {
                name.setCn(optJSONObject2.optString("zh_cn", ""));
            }
            if (TextUtils.isEmpty(name.getJp())) {
                name.setJp(optJSONObject2.optString("ja_jp", ""));
            }
            if (TextUtils.isEmpty(name.getUs())) {
                name.setUs(optJSONObject2.optString("en_us", ""));
            }
            tabAppInfo.setName(name);
        } else {
            Log.m165397w("MainModule_TabParser", "failed to parse name cause of null");
        }
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("extra");
        if (optJSONObject3 != null) {
            TabAppInfo.Extra extra = new TabAppInfo.Extra();
            extra.setAppID(optJSONObject3.optString("app_id", ""));
            extra.setUrl(optJSONObject3.optString("mobile_url", ""));
            tabAppInfo.setExtra(extra);
        }
        if (z) {
            tabAppInfo.setPrimaryOnly(jSONObject.optBoolean("primary_only", false));
        } else {
            tabAppInfo.setPrimaryOnly(jSONObject.optBoolean("primaryOnly", false));
        }
        tabAppInfo.setUnmovable(jSONObject.optBoolean("unmovable", false));
        return tabAppInfo;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Drawable m176121a(AbstractC44552i iVar, View view, String str) {
        View c = iVar.mo31312c();
        if (c instanceof MainTabItemView) {
            return ((MainTabItemView) c).getDrawableDefault();
        }
        return view.getContext().getDrawable(R.drawable.ic_notify);
    }
}
