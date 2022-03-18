package com.bytedance.ee.larkbrand.p650e;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.menu.C13133a;
import com.bytedance.ee.larkbrand.menu.C13136c;
import com.bytedance.ee.larkbrand.menu.C13138d;
import com.bytedance.ee.larkbrand.menu.LarkFeedBackMenuItemV2;
import com.bytedance.ee.larkbrand.utils.DebugHelper;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.settings.v2.handler.C66780j;
import com.tt.miniapp.titlemenu.item.C66957o;
import com.tt.miniapp.titlemenu.item.IMenuItem;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.option.p3390k.AbstractC67648c;
import com.tt.option.p3390k.C67646a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.e.n */
public class C13016n extends C67646a {
    @Override // com.tt.option.p3390k.C67646a, com.tt.option.p3390k.AbstractC67647b
    public List<AbstractC67648c> createTitleMenuItems(final IAppContext iAppContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC67648c() {
            /* class com.bytedance.ee.larkbrand.p650e.C13016n.C130171 */

            @Override // com.tt.option.p3390k.AbstractC67648c
            /* renamed from: a */
            public String mo48982a() {
                return "share";
            }
        });
        return arrayList;
    }

    /* renamed from: a */
    private void m53494a(List<IMenuItem> list, IAppContext iAppContext) {
        if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.gadget.hide.menus.by.meta", false)) {
            AppBrandLogger.m52830i("LarkOptionMenuDependImpl", "removeTargetMenu is disabled by FG");
            return;
        }
        AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
        if (appInfo != null && !TextUtils.isEmpty(appInfo.encryptextra)) {
            try {
                JSONObject optJSONObject = new JSONObject(appInfo.encryptextra).optJSONObject("disabled_menus");
                if (optJSONObject == null) {
                    AppBrandLogger.m52830i("LarkOptionMenuDependImpl", "no disabled menus");
                    return;
                }
                JSONArray optJSONArray = optJSONObject.optJSONArray("android");
                if (optJSONArray != null) {
                    if (optJSONArray.length() > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            arrayList.add(optJSONArray.optString(i));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        if (!(list == null || list.isEmpty())) {
                            for (int i2 = 0; i2 < list.size(); i2++) {
                                IMenuItem iMenuItem = list.get(i2);
                                if (iMenuItem != null) {
                                    if (arrayList.contains(iMenuItem.mo49183a())) {
                                        arrayList2.add(iMenuItem);
                                    }
                                }
                            }
                            list.removeAll(arrayList2);
                            return;
                        }
                        return;
                    }
                }
                AppBrandLogger.m52830i("LarkOptionMenuDependImpl", "no disabled menus array");
            } catch (JSONException e) {
                AppBrandLogger.m52829e("LarkOptionMenuDependImpl", "json exception", e);
            }
        }
    }

    @Override // com.tt.option.p3390k.C67646a, com.tt.option.p3390k.AbstractC67647b
    public List<IMenuItem> replacesMenuItems(List<IMenuItem> list, IAppContext iAppContext) {
        Activity currentActivity = iAppContext.getCurrentActivity();
        if (currentActivity == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        if (DebugHelper.m54232a(AppbrandContext.getInst().getApplicationContext())) {
            arrayList.add(new C13136c(currentActivity, iAppContext));
        }
        if (list != null) {
            boolean featureGating = LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.gadget.multi_task.open");
            for (IMenuItem iMenuItem : list) {
                if ("share".equals(iMenuItem.mo49183a())) {
                    if (!"tt06bd70009997ab3e".equals(C67432a.m262319a(iAppContext).getAppInfo().appId) && LarkExtensionManager.getInstance().getExtension().mo49614i()) {
                        arrayList.add(iMenuItem);
                    }
                } else if ("multitask".equals(iMenuItem.mo49183a()) && featureGating) {
                    arrayList.add(iMenuItem);
                    iMenuItem.mo232938a(LarkExtensionManager.getInstance().getExtension().mo49599e("ecosystem_gadget_mutitask_badge"));
                } else if ("workplace".equals(iMenuItem.mo49183a())) {
                    arrayList.add(iMenuItem);
                }
            }
        }
        if (AppbrandApplicationImpl.getInst(iAppContext).getAppInfo().isLocalTest()) {
            arrayList.add(new C66957o(currentActivity, iAppContext));
        }
        m53493a(arrayList, currentActivity, iAppContext);
        if (list != null) {
            for (IMenuItem iMenuItem2 : list) {
                if ("about".endsWith(iMenuItem2.mo49183a())) {
                    arrayList.add(iMenuItem2);
                } else if ("refresh".endsWith(iMenuItem2.mo49183a()) && !C25529d.m91166g(iAppContext)) {
                    arrayList.add(iMenuItem2);
                } else if ("back_home".endsWith(iMenuItem2.mo49183a())) {
                    arrayList.add(iMenuItem2);
                }
            }
        }
        m53494a(arrayList, iAppContext);
        return arrayList;
    }

    /* renamed from: a */
    private void m53493a(List<IMenuItem> list, Activity activity, IAppContext iAppContext) {
        AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
        if (appInfo != null && !TextUtils.isEmpty(appInfo.encryptextra)) {
            try {
                AppBrandLogger.m52830i("LarkOptionMenuDependImpl", "appinfo extra:" + appInfo.encryptextra);
                JSONObject jSONObject = new JSONObject(appInfo.encryptextra);
                String optString = jSONObject.optString("botid");
                if (!TextUtils.isEmpty(optString)) {
                    list.add(new C13133a(activity, optString, iAppContext));
                }
                boolean optBoolean = jSONObject.optBoolean("feedback");
                boolean featureGating = LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.feedback.show", false);
                boolean a = C66780j.m260633a().mo232687a(appInfo.appId);
                boolean d = C66780j.m260633a().mo232690d();
                AppBrandLogger.m52830i("LarkOptionMenuDependImpl", "showFeedBack:" + optBoolean + "   feedbackFgV2：" + featureGating + "   appIsInWhiteList:" + a + "   isOpenToAll:" + d);
                if (optBoolean) {
                    if (!featureGating || (!a && !d)) {
                        list.add(new C13138d(activity, iAppContext));
                        return;
                    }
                    AppBrandLogger.m52830i("LarkOptionMenuDependImpl", "isOpenToAll:" + d);
                    list.add(new LarkFeedBackMenuItemV2(activity, iAppContext, C66780j.m260633a().mo232689c()));
                } else if (!featureGating) {
                } else {
                    if (a || d) {
                        list.add(new LarkFeedBackMenuItemV2(activity, iAppContext, C66780j.m260633a().mo232689c()));
                    }
                }
            } catch (JSONException e) {
                AppBrandLogger.m52829e("LarkOptionMenuDependImpl", "json exception", e);
            }
        }
    }
}
