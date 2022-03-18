package com.bytedance.ee.larkbrand.p650e;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.permission.AbstractC13298i;
import com.bytedance.ee.larkbrand.permission.C13297h;
import com.bytedance.ee.larkbrand.permission.p662a.C13282a;
import com.bytedance.ee.larkbrand.utils.C13351i;
import com.bytedance.ee.larkbrand.utils.C13376t;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.suite.R;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.permission.PermissionSettingActivity;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.util.C67590h;
import com.tt.option.p3394o.C67661a;
import com.tt.option.p3394o.C67663c;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.e.s */
public class C13024s extends C67661a {
    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public List<C66578b.C66579a> getUserDefinableHostPermissionList(IAppContext iAppContext) {
        return C13282a.m54093a(iAppContext);
    }

    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public void syncPermissionToService(final IAppContext iAppContext) {
        Observable.create(new Action() {
            /* class com.bytedance.ee.larkbrand.p650e.C13024s.C130272 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                try {
                    C13297h.m54140a(iAppContext, "", (AbstractC13298i) null);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("LarkOptionPermissionDependImpl", "sync permission fail," + e.getMessage());
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public C67663c getPermissionCustomDialogMsgEntity(IAppContext iAppContext) {
        return new C67663c.C67665a().mo234926a(C67590h.m263073a((int) R.string.LittleApp_UserInfoPermission_PermissionDesc)).mo234928b(C67590h.m263073a((int) R.string.lark_brand_permission_msg_location)).mo234929c(C67590h.m263073a((int) R.string.lark_brand_permission_msg_record)).mo234930d(C67590h.m263073a((int) R.string.lark_brand_permission_msg_camera)).mo234932f(C67590h.m263073a((int) R.string.lark_brand_permission_msg_address)).mo234931e(C67590h.m263073a((int) R.string.lark_brand_permission_msg_write_photos_album)).mo234933g(C67590h.m263073a((int) R.string.LittleApp_GadgetAndriod_PermissionMsg_Clipboard)).mo234934h(C67590h.m263073a((int) R.string.OpenPlatform_AppCenter_BadgeTtl)).mo234935i(C67590h.m263073a((int) R.string.LittleApp_StepsApi_ScopeNameSubTtl)).mo234927a(iAppContext);
    }

    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public void getLocalScope(JSONObject jSONObject, IAppContext iAppContext) throws JSONException {
        C13282a.m54095a(jSONObject, iAppContext);
    }

    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public C66578b.C66579a permissionTypeToPermission(int i, IAppContext iAppContext) {
        return C13282a.m54092a(i, iAppContext);
    }

    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public void setPermissionTime(int i, IAppContext iAppContext) {
        ((AbstractC67734b) iAppContext.findServiceByInterface(AbstractC67734b.class)).mo50187a(i, System.currentTimeMillis());
    }

    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public boolean shouldFilterPermission(int i, IAppContext iAppContext) {
        AbstractC67733a aVar = (AbstractC67733a) iAppContext.findServiceByInterface(AbstractC67733a.class);
        if (i == 20) {
            return aVar.mo50184b(i);
        }
        return aVar.mo50179a(i, false);
    }

    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public void syncPermissionToService(final IAppContext iAppContext, final String str) {
        Observable.create(new Action() {
            /* class com.bytedance.ee.larkbrand.p650e.C13024s.C130283 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                try {
                    C13297h.m54140a(iAppContext, str, (AbstractC13298i) null);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("LarkOptionPermissionDependImpl", "sync permission fail," + e.getMessage());
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public C66578b.C66579a scopeToBrandPermission(String str, IAppContext iAppContext) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1025075588:
                if (str.equals("scope.clipboard")) {
                    c = 0;
                    break;
                }
                break;
            case -653473286:
                if (str.equals("scope.userLocation")) {
                    c = 1;
                    break;
                }
                break;
            case 330013499:
                if (str.equals("scope.runData")) {
                    c = 2;
                    break;
                }
                break;
            case 411225387:
                if (str.equals("scope.record")) {
                    c = 3;
                    break;
                }
                break;
            case 583039347:
                if (str.equals("scope.userInfo")) {
                    c = 4;
                    break;
                }
                break;
            case 986629481:
                if (str.equals("scope.writePhotosAlbum")) {
                    c = 5;
                    break;
                }
                break;
            case 1990324316:
                if (str.equals("scope.appBadge")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C66578b.C66579a.m260125j(iAppContext);
            case 1:
                return C66578b.C66579a.m260113b(iAppContext);
            case 2:
                if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.setting.scope_run_data")) {
                    return C66578b.C66579a.m260116c(iAppContext);
                }
                break;
            case 3:
                return C66578b.C66579a.m260118d(iAppContext);
            case 4:
                return C66578b.C66579a.m260109a(iAppContext);
            case 5:
                return C13282a.C13283a.f35180a;
            case 6:
                if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("gadget.open_app.badge")) {
                    return C66578b.C66579a.m260126k(iAppContext);
                }
                break;
        }
        return null;
    }

    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public void metaExtraNotify(final String str, final String str2, final IAppContext iAppContext) {
        Observable.create(new Action() {
            /* class com.bytedance.ee.larkbrand.p650e.C13024s.C130316 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C13376t.m54404a(str, str2, iAppContext);
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public void onDeniedWhenHasRequested(final Activity activity, final String str, final IAppContext iAppContext) {
        final String str2 = C67432a.m262319a(iAppContext).getAppInfo().appName;
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.bytedance.ee.larkbrand.p650e.C13024s.RunnableC130251 */

            public void run() {
                String str;
                if (!TextUtils.isEmpty(str2)) {
                    str = activity.getString(R.string.lark_brand_permission_request_title, new Object[]{str2});
                } else {
                    str = activity.getString(R.string.LittleApp_GadgetAndriod_AllowAppPrmssn);
                }
                Activity activity = activity;
                C13351i.m54345a(activity, str, str, activity.getString(R.string.microapp_m_permission_cancel), activity.getString(R.string.microapp_m_permission_go_to_settings), new C13351i.AbstractC13357a() {
                    /* class com.bytedance.ee.larkbrand.p650e.C13024s.RunnableC130251.C130261 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
                    /* renamed from: b */
                    public void mo49041b(View view) {
                    }

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
                    /* renamed from: a */
                    public void mo49040a(View view) {
                        AbstractC12888c i = C25529d.m91168i(iAppContext);
                        if (i != null) {
                            i.startActivityForResult(PermissionSettingActivity.m260080a(activity, iAppContext), 5);
                        } else {
                            activity.startActivityForResult(PermissionSettingActivity.m260080a(activity, iAppContext), 5);
                        }
                    }
                });
            }
        });
    }

    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public void syncAuth(final String str, final IAppContext iAppContext, final AbstractC13298i iVar) {
        Observable.create(new Action() {
            /* class com.bytedance.ee.larkbrand.p650e.C13024s.C130305 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C13297h.m54141a(str, iAppContext, iVar);
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public void handleCustomizePermissionResult(JSONObject jSONObject, int i, boolean z) throws JSONException {
        if (i == 12) {
            jSONObject.put("scope.userLocation", z);
        } else if (i == 13) {
            jSONObject.put("scope.record", z);
        } else if (i != 16) {
            switch (i) {
                case 19:
                    jSONObject.put("scope.clipboard", z);
                    return;
                case 20:
                    jSONObject.put("scope.appBadge", z);
                    return;
                case 21:
                    jSONObject.put("scope.runData", z);
                    return;
                default:
                    return;
            }
        } else {
            jSONObject.put("scope.writePhotosAlbum", z);
        }
    }

    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public Set<C66578b.C66579a> filterNeedRequestPermission(String str, Set<C66578b.C66579a> set, IAppContext iAppContext) {
        if (TextUtils.equals(str, "chooseImage") || TextUtils.equals(str, "chooseVideo")) {
            return null;
        }
        if (TextUtils.equals(str, "authorize") && !LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.scope.add_user_info") && set != null) {
            set.remove(C66578b.C66579a.m260109a(iAppContext));
        }
        if ((TextUtils.equals(str, "saveImageToPhotosAlbum") || TextUtils.equals(str, "saveVideoToPhotosAlbum")) && set != null) {
            set.remove(C66578b.C66579a.m260121f(iAppContext));
            set.add(C13282a.C13283a.f35180a);
        }
        return set;
    }

    @Override // com.tt.option.p3394o.C67661a, com.tt.option.p3394o.AbstractC67662b
    public void syncPermissionToService(final IAppContext iAppContext, final String str, final AbstractC13298i iVar) {
        Observable.create(new Action() {
            /* class com.bytedance.ee.larkbrand.p650e.C13024s.C130294 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                try {
                    C13297h.m54140a(iAppContext, str, iVar);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("LarkOptionPermissionDependImpl", "sync permission fail," + e.getMessage());
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }
}
