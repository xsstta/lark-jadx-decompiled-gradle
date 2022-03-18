package com.bytedance.ee.larkbrand.p650e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.nativeMoudule.C13145a;
import com.bytedance.ee.larkbrand.nativeMoudule.C13149b;
import com.bytedance.ee.larkbrand.permission.p662a.C13282a;
import com.bytedance.ee.larkbrand.utils.C13351i;
import com.larksuite.suite.R;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.option.ui.C67696a;
import com.tt.option.ui.HostOptionUiDepend;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: com.bytedance.ee.larkbrand.e.w */
public class C13038w extends C67696a {
    @Override // com.tt.option.ui.C67696a, com.tt.option.ui.HostOptionUiDepend
    public void hideToast() {
        C13149b.m53755a();
    }

    @Override // com.tt.option.ui.C67696a, com.tt.option.ui.HostOptionUiDepend
    public void showUnSupportView(final Activity activity, String str, final HostOptionUiDepend.AbstractC67695g gVar, IAppContext iAppContext) {
        C13145a.m53753a(iAppContext.getCurrentActivity(), null, null, activity.getResources().getString(R.string.lark_brand_version_compatability), true, activity.getResources().getString(R.string.lark_brand_cancel), null, activity.getResources().getString(R.string.lark_brand_confirm), null, true, new AbstractC67550j.AbstractC67551a<Integer>() {
            /* class com.bytedance.ee.larkbrand.p650e.C13038w.C130391 */

            /* renamed from: a */
            public void onNativeModuleCall(Integer num) {
                if (num.intValue() == 1) {
                    LarkExtensionManager.getInstance().getExtension().mo49601a(activity);
                    gVar.mo231034a();
                    return;
                }
                gVar.mo231034a();
            }
        });
    }

    @Override // com.tt.option.ui.C67696a, com.tt.option.ui.HostOptionUiDepend
    public void showToast(Context context, String str, String str2, long j, String str3) {
        C13149b.m53758a(context, str, str2, j, str3);
    }

    @Override // com.tt.option.ui.C67696a, com.tt.option.ui.HostOptionUiDepend
    public void showActionSheet(Context context, String str, String[] strArr, AbstractC67550j.AbstractC67551a<Integer> aVar, IAppContext iAppContext) {
        LarkExtensionManager.getInstance().getExtension().mo49588a(context, str, strArr, aVar);
    }

    @Override // com.tt.option.ui.C67696a, com.tt.option.ui.HostOptionUiDepend
    public Dialog showPermissionDialog(Activity activity, int i, final String str, final AbstractC67540b bVar, IAppContext iAppContext) {
        return C13351i.m54345a(activity, activity.getString(R.string.microapp_m_require_following_permission_with_appname, new Object[]{C67432a.m262319a(iAppContext).getAppInfo().appName}), str, activity.getString(R.string.microapp_m_brand_title_permission_cancel), activity.getString(R.string.microapp_m_brand_permission_ok), new C13351i.AbstractC13357a() {
            /* class com.bytedance.ee.larkbrand.p650e.C13038w.C130413 */

            @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
            /* renamed from: a */
            public void mo49040a(View view) {
                bVar.mo87199a();
            }

            @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
            /* renamed from: b */
            public void mo49041b(View view) {
                bVar.mo87200a(str);
            }
        });
    }

    @Override // com.tt.option.ui.C67696a, com.tt.option.ui.HostOptionUiDepend
    public void showToast(Context context, ViewGroup viewGroup, String str, String str2, long j, String str3) {
        C13149b.m53756a(context, viewGroup, str, str2, j, str3);
    }

    @Override // com.tt.option.ui.C67696a, com.tt.option.ui.HostOptionUiDepend
    public Dialog showPermissionsDialog(Activity activity, Set<Integer> set, LinkedHashMap<Integer, String> linkedHashMap, final AbstractC67539a aVar, HashMap<String, String> hashMap, IAppContext iAppContext) {
        if (set == null || set.isEmpty()) {
            return null;
        }
        final Integer next = set.iterator().next();
        C66578b.C66579a a = C13282a.m54092a(next.intValue(), iAppContext);
        if (a == null) {
            return null;
        }
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        return C13351i.m54345a(activity, activity.getString(R.string.microapp_m_require_following_permission_with_appname, new Object[]{C67432a.m262319a(iAppContext).getAppInfo().appName}), a.mo232179c(), activity.getString(R.string.microapp_m_brand_title_permission_cancel), activity.getString(R.string.microapp_m_brand_permission_ok), new C13351i.AbstractC13357a() {
            /* class com.bytedance.ee.larkbrand.p650e.C13038w.C130402 */

            @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
            /* renamed from: a */
            public void mo49040a(View view) {
                linkedHashMap2.put(next, "ok");
                aVar.mo87589a(linkedHashMap2);
            }

            @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
            /* renamed from: b */
            public void mo49041b(View view) {
                linkedHashMap2.put(next, "fail");
                aVar.mo87590b(linkedHashMap2);
            }
        });
    }

    @Override // com.tt.option.ui.C67696a, com.tt.option.ui.HostOptionUiDepend
    public void showModal(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, AbstractC67550j.AbstractC67551a<Integer> aVar, Activity activity) {
        C13145a.m53753a(context, str, str2, str3, z, str4, str5, str6, str7, true, aVar);
    }
}
