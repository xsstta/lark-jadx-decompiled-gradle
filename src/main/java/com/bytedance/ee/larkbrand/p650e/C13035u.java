package com.bytedance.ee.larkbrand.p650e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.WebViewActivity;
import com.bytedance.ee.larkbrand.abtest.C12956a;
import com.bytedance.ee.larkbrand.abtest.experiment.C12965h;
import com.bytedance.ee.larkbrand.abtest.experiment.C12967j;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.C13345g;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandConstant;
import com.tt.option.p3396q.C67669a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.e.u */
public class C13035u extends C67669a {
    @Override // com.tt.option.p3396q.C67669a, com.tt.option.p3396q.AbstractC67670b
    public boolean interceptOpenWebUrl(Context context, String str) {
        if (!LarkExtensionManager.getInstance().getExtension().mo49612g(str)) {
            return false;
        }
        LarkExtensionManager.getInstance().getExtension().mo49611a(context, str);
        return true;
    }

    @Override // com.tt.option.p3396q.C67669a, com.tt.option.p3396q.AbstractC67670b
    public boolean startMiniAppService(final Context context, final Intent intent) {
        try {
            Observable.create(new Action() {
                /* class com.bytedance.ee.larkbrand.p650e.C13035u.C130361 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    try {
                        JSONObject a = C12956a.m53359a().mo48857a("code_cache");
                        JSONObject jSONObject = new JSONObject();
                        if (a != null) {
                            jSONObject.put("code_cache", a);
                        }
                        intent.putExtra("ab_experiment", jSONObject.toString());
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("LarkOptionRouteDepend", e);
                    }
                    intent.putExtra("extra_ab_preload_result", C12965h.m53381a());
                    intent.putExtra("extra_ab_v8port_result", C12965h.m53382b());
                    context.startService(intent);
                }
            }).schudleOn(Schedulers.longIO()).subscribeSimple();
            return true;
        } catch (Exception e) {
            AppBrandLogger.m52829e("LarkOptionRouteDepend", e);
            return false;
        }
    }

    @Override // com.tt.option.p3396q.C67669a, com.tt.option.p3396q.AbstractC67670b
    public boolean startMiniAppActivity(Context context, Intent intent) {
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            if (!C13345g.m54337a(context, intent)) {
                JSONObject a = C12956a.m53359a().mo48857a("code_cache");
                JSONObject jSONObject = new JSONObject();
                if (a != null) {
                    jSONObject.put("code_cache", a);
                }
                intent.putExtra("ab_experiment", jSONObject.toString());
                intent.putExtra("extra_ab_preload_result", C12965h.m53381a());
                intent.putExtra("extra_ab_v8port_result", C12965h.m53382b());
                intent.putExtra("extra_ab_snapshot_result", C12967j.m53390c());
                context.startActivity(intent);
            }
            return true;
        } catch (Exception e) {
            AppBrandLogger.m52829e("LarkOptionRouteDepend", e);
            return false;
        }
    }

    @Override // com.tt.option.p3396q.C67669a, com.tt.option.p3396q.AbstractC67670b
    public boolean openWebBrowser(Context context, String str, boolean z) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            Intent createChooser = Intent.createChooser(intent, context.getString(R.string.microapp_m_start_web_browser_tip));
            if (!(context instanceof Activity)) {
                createChooser.addFlags(268435456);
            }
            context.startActivity(createChooser);
            return true;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "LarkOptionRouteDepend", e.getStackTrace());
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    @Override // com.tt.option.p3396q.C67669a, com.tt.option.p3396q.AbstractC67670b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean openSchema(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.larkbrand.p650e.C13035u.openSchema(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    @Override // com.tt.option.p3396q.C67669a, com.tt.option.p3396q.AbstractC67670b
    public void jumpToWebView(Context context, String str, String str2, boolean z) {
        if (!AppbrandConstant.C65701b.m257612c().mo230142g().equals(str)) {
            context.startActivity(WebViewActivity.m53305a(context, str, str2, z));
        }
    }

    @Override // com.tt.option.p3396q.C67669a, com.tt.option.p3396q.AbstractC67670b
    public void overridePendingTransition(Activity activity, int i, int i2, int i3) {
        if (i3 == 1) {
            String stringExtra = activity.getIntent().getStringExtra("microapp_url");
            if (!TextUtils.isEmpty(stringExtra)) {
                Uri parse = Uri.parse(stringExtra);
                int a = C13047a.C13050c.m53535a(parse.getQueryParameter("animIn"));
                int a2 = C13047a.C13050c.m53535a(parse.getQueryParameter("animOut"));
                if (a != -1) {
                    i = a;
                }
                if (a2 != -1) {
                    i2 = a2;
                }
                activity.overridePendingTransition(i, i2);
                return;
            }
            return;
        }
        super.overridePendingTransition(activity, i, i2, i3);
    }

    @Override // com.tt.option.p3396q.C67669a, com.tt.option.p3396q.AbstractC67670b
    public void preHandleIntent(Context context, Intent intent, int i, int i2, String str) {
        LarkExtensionManager.getInstance().getExtension().preHandleIntent(context, intent, i, i2, str);
    }
}
