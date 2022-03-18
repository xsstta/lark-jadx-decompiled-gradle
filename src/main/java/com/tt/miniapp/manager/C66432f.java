package com.tt.miniapp.manager;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.refer.common.meta.fetch.AbstractC67806i;
import com.tt.refer.common.pkg.PackageEntity;
import com.tt.refer.impl.business.meta.GadgetAppInfo;
import com.tt.refer.impl.business.meta.p3436a.C67946a;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.manager.f */
public class C66432f {

    /* renamed from: a */
    private final AbstractC67806i<GadgetAppInfo> f167702a;

    /* renamed from: b */
    private IAppContext f167703b;

    /* renamed from: a */
    public void mo231982a(Context context, String str, List<String> list) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            String a = m259698a();
            JSONObject jSONObject2 = new JSONObject(str);
            String optString = jSONObject2.optString(HiAnalyticsConstant.HaKey.BI_KEY_APPID);
            String optString2 = jSONObject2.optString(HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
            String optString3 = jSONObject2.optString("md5");
            JSONArray optJSONArray = jSONObject2.optJSONArray("path");
            GadgetAppInfo a2 = mo231979a(context, optString, optString, m259700a("current"));
            if (a2 == null || (a2 != null && C66375a.m259526b(optString2, a2.getAppVersion()))) {
                String str3 = null;
                if (list != null) {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).contains(optString)) {
                            str3 = list.get(i);
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    PackageEntity packageEntity = new PackageEntity();
                    packageEntity.setAppId(optString);
                    packageEntity.setIdentifier(optString);
                    packageEntity.setPackageName(optString2);
                    ArrayList arrayList = new ArrayList();
                    str2 = HiAnalyticsConstant.HaKey.BI_KEY_VERSION;
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        arrayList.add(optJSONArray.optString(i2));
                    }
                    packageEntity.setUrls(arrayList);
                    packageEntity.setMd5(optString3);
                    File a3 = m259697a(packageEntity);
                    String b = m259701b(packageEntity);
                    IOUtils.copyAssets(context, str3, a3 + "/" + b);
                    StringBuilder sb = new StringBuilder();
                    sb.append("preset pkg success,pkg name :");
                    sb.append(b);
                    AppBrandLogger.m52830i("MetaAndPkgStorageManager", sb.toString());
                } else {
                    str2 = HiAnalyticsConstant.HaKey.BI_KEY_VERSION;
                }
                jSONObject.put("encryKey", "B4huRIrpmThGgYiY").put("encryIV", "tfQ2Sw04GMEdwUy4").put("lang", a).put("from_preset", true).put("value", str);
                Storage.getStorageByName(context, m259699a(optString, m259700a("current"), "new_debug_update_app_info", "new_update_app_info_v2")).edit().putString(optString, jSONObject.toString()).putString(str2, optString2).putLong("save_time", System.currentTimeMillis()).commit();
                AppBrandLogger.m52830i("MetaAndPkgStorageManager", "preset meta success");
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("MetaAndPkgStorageManager", "saveAppMetaAndPkg exception:", e.getMessage());
        }
    }

    /* renamed from: a */
    private String m259698a() {
        Locale c = C67479c.m262467a().mo234230c();
        if (TextUtils.isEmpty(c.getCountry())) {
            return c.getLanguage().toLowerCase();
        }
        return c.getLanguage().toLowerCase() + "_" + c.getCountry().toUpperCase();
    }

    public C66432f(IAppContext iAppContext) {
        this.f167703b = iAppContext;
        this.f167702a = new C67946a(iAppContext);
    }

    /* renamed from: a */
    private boolean m259700a(String str) {
        if (TextUtils.isEmpty(str) || "current".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private String m259701b(PackageEntity packageEntity) {
        String c = m259702c(packageEntity);
        return c + ".pkg";
    }

    /* renamed from: c */
    private String m259702c(PackageEntity packageEntity) {
        String str;
        int lastIndexOf;
        String defaultDownloadUrl = packageEntity.getDefaultDownloadUrl();
        if (TextUtils.isEmpty(defaultDownloadUrl) || (lastIndexOf = defaultDownloadUrl.lastIndexOf(47)) <= 0) {
            str = "";
        } else {
            str = defaultDownloadUrl.substring(lastIndexOf + 1);
            int indexOf = str.indexOf(46);
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
        }
        if (TextUtils.isEmpty(str)) {
            return packageEntity.getPackageName();
        }
        return str;
    }

    /* renamed from: a */
    private File m259697a(PackageEntity packageEntity) {
        File g = ((AbstractC67722a) this.f167703b.findServiceByInterface(AbstractC67722a.class)).mo235095g();
        File file = new File(g, "download" + File.separator + packageEntity.getIdentifier() + File.separator + packageEntity.getPackageName() + "_" + "pkg");
        if (!file.exists()) {
            file.mkdirs();
        }
        AppBrandLogger.m52830i("MetaAndPkgStorageManager", ">>downloadDir>>>", file.getAbsolutePath());
        return file;
    }

    /* renamed from: a */
    public List<String> mo231980a(AssetManager assetManager) {
        try {
            ArrayList arrayList = new ArrayList();
            String[] list = assetManager.list("preset_gadget/preset_pkg");
            for (String str : list) {
                arrayList.add("preset_gadget/preset_pkg/" + str);
            }
            return arrayList;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public void mo231981a(final Context context) {
        Observable.create(new Action() {
            /* class com.tt.miniapp.manager.C66432f.C664331 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                AssetManager assets = context.getAssets();
                List<String> a = C66432f.this.mo231980a(assets);
                try {
                    for (String str : assets.list("preset_gadget/preset_json")) {
                        String str2 = "preset_gadget/preset_json/" + str;
                        if (str2.endsWith(".json")) {
                            String characterUtils = CharacterUtils.toString(assets.open(str2));
                            if (!TextUtils.isEmpty(characterUtils)) {
                                try {
                                    JSONArray jSONArray = new JSONArray(characterUtils);
                                    int length = jSONArray.length();
                                    for (int i = 0; i < length; i++) {
                                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                                        if (optJSONObject != null) {
                                            C66432f.this.mo231982a(context, optJSONObject.toString(), a);
                                        }
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    /* renamed from: a */
    private String m259699a(String str, boolean z, String str2, String str3) {
        if (z) {
            AppBrandLogger.m52830i("MetaAndPkgStorageManager", "getStorageFileName->preview mode and appid:" + str);
            return Storage.getStorageFilePrefix(str2 + str);
        }
        AppBrandLogger.m52830i("MetaAndPkgStorageManager", "getStorageFileName->current mode and appid:" + str);
        return Storage.getStorageFilePrefix(str3 + str);
    }

    /* renamed from: a */
    public GadgetAppInfo mo231979a(Context context, String str, String str2, boolean z) {
        String string = Storage.getStorageByName(context, m259699a(str, z, "new_debug_update_app_info", "new_update_app_info_v2")).getString(str2, "");
        if (TextUtils.isEmpty(string)) {
            AppBrandLogger.m52830i("MetaAndPkgStorageManager", "getAppMetaFromLocal->local meta is empty,try get legacy data! identify:", str2);
            UpdateAppManager.clearLegacyJsonData(context, str, z);
            return null;
        }
        try {
            GadgetAppInfo b = this.f167702a.mo50346b(this.f167702a.b_(string));
            if (b != null) {
                String a = m259698a();
                String language = b.getLanguage();
                if (!TextUtils.isEmpty(language) && !language.equals(a)) {
                    return null;
                }
            }
            return b;
        } catch (Exception e) {
            AppBrandLogger.m52829e("MetaAndPkgStorageManager", "getAppMetaFromLocal->parser exception:" + e.getMessage());
            return null;
        }
    }
}
